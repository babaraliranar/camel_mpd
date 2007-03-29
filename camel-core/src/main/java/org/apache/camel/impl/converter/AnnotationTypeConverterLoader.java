/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.impl.converter;

import org.apache.camel.Converter;
import org.apache.camel.impl.CachingInjector;
import org.apache.camel.util.ResolverUtil;
import org.apache.camel.util.ObjectHelper;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import static java.lang.reflect.Modifier.*;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * A class which will auto-discover converter objects and methods to pre-load
 * the registry of converters on startup
 *
 * @version $Revision$
 */
public class AnnotationTypeConverterLoader implements TypeConverterLoader {
    public static final String META_INF_SERVICES = "META-INF/services/org/apache/camel/TypeConverter";
    private static final transient Log log = LogFactory.getLog(AnnotationTypeConverterLoader.class);
    private ResolverUtil resolver = new ResolverUtil();
    private Set<Class> visitedClasses = new HashSet<Class>();

    public void load(TypeConverterRegistry registry) throws Exception {
        String[] packageNames = findPackageNames();
        resolver.findAnnotated(Converter.class, packageNames);
        Set<Class> classes = resolver.getClasses();
        for (Class type : classes) {
            if (log.isDebugEnabled()) {
                log.debug("Loading converter class: " + ObjectHelper.name(type));
            }
            loadConverterMethods(registry, type);
        }
    }

    /**
     * Finds the names of the packages to search for on the classpath looking for text files on the classpath
     * at the  @{link #META_INF_SERVICES} location
     *
     * @return a collection of packages to search for
     * @throws IOException
     */
    protected String[] findPackageNames() throws IOException {
        Set<String> packages = new HashSet<String>();
        findPackages(packages, Thread.currentThread().getContextClassLoader());
        findPackages(packages, getClass().getClassLoader());
        return packages.toArray(new String[packages.size()]);
    }

    protected void findPackages(Set<String> packages, ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources(META_INF_SERVICES);
        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            if (url != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                try {
                    while (true) {
                        String line = reader.readLine();
                        if (line == null) {
                            break;
                        }
                        tokenize(packages, line);
                    }
                }
                finally {
                    try {
                        reader.close();
                    }
                    catch (IOException e) {
                        log.warn("Caught exception closing stream: " + e, e);
                    }
                }
            }
        }
    }

    /**
     * Tokenizes the line from the META-IN/services file using commas and ignoring whitespace between packages
     */
    protected void tokenize(Set<String> packages, String line) {
        StringTokenizer iter = new StringTokenizer(line, ",");
        while (iter.hasMoreTokens()) {
            String name = iter.nextToken().trim();
            if (name.length() > 0) {
                packages.add(name);
            }
        }
    }

    /**
     * Loads all of the converter methods for the given type
     */
    protected void loadConverterMethods(TypeConverterRegistry registry, Class type) {
        if (visitedClasses.contains(type)) {
            return;
        }
        visitedClasses.add(type);
        Method[] methods = type.getDeclaredMethods();
        CachingInjector injector = null;

        for (Method method : methods) {
            Converter annotation = method.getAnnotation(Converter.class);
            if (annotation != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes == null || parameterTypes.length != 1) {
                    log.warn("Ignoring bad converter on type: " + type.getName()
                            + " method: " + method + " as a converter method should have one parameter");
                }
                else {
                    int modifiers = method.getModifiers();
                    if (isAbstract(modifiers) || !isPublic(modifiers)) {
                        log.warn("Ignoring bad converter on type: " + type.getName()
                                + " method: " + method + " as a converter method is not a public and concrete method");
                    }
                    else {
                        Class toType = method.getReturnType();
                        if (toType.equals(Void.class)) {
                            log.warn("Ignoring bad converter on type: " + type.getName()
                                    + " method: " + method + " as a converter method returns a void method");
                        }
                        else {
                            Class fromType = parameterTypes[0];
                            if (isStatic(modifiers)) {
                                registry.addTypeConverter(toType, fromType, new StaticMethodTypeConverter(method));
                            }
                            else {
                                if (injector == null) {
                                    injector = new CachingInjector(registry, type);
                                }
                                registry.addTypeConverter(toType, fromType, new InstanceMethodTypeConverter(injector, method));
                            }
                        }
                    }
                }
            }
        }
        Class superclass = type.getSuperclass();
        if (superclass != null && !superclass.equals(Object.class)) {
            loadConverterMethods(registry, superclass);
        }
    }
}
