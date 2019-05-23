/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.support;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.camel.CamelContext;
import org.apache.camel.TypeConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.camel.support.IntrospectionSupport.findSetterMethods;
import static org.apache.camel.support.IntrospectionSupport.getOrElseProperty;

/**
 * A convenient support class for binding String valued properties to an instance which
 * uses a set of conventions:
 * <ul>
 *     <li>nested - Properties can be nested using the dot syntax (OGNL), eg foo.bar=123</li>
 *     <li>reference by id - Values can refer to other beans in the registry by prefixing with # syntax, eg #myBean</li>
 * </ul>
 * This implementations reuses parts of {@link IntrospectionSupport}.
 */
public final class PropertyBindingSupport {

    // TODO: Add support for auto binding to singleton instance by type from registry (boolean on|off)
    // TODO: builder pattern with naming prefix: withXXX

    private static final Pattern SECRETS = Pattern.compile(".*(passphrase|password|secretKey).*", Pattern.CASE_INSENSITIVE);
    private static final Logger LOG = LoggerFactory.getLogger(PropertyBindingSupport.class);

    private PropertyBindingSupport() {
    }

    public static boolean bindProperties(CamelContext camelContext, Object target, Map<String, Object> properties) throws Exception {
        boolean answer = true;
        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            answer &= bindProperty(camelContext, target, entry.getKey(), entry.getValue());
        }
        return answer;
    }

    public static boolean bindProperty(CamelContext camelContext, Object target, String name, Object value) throws Exception {
        return setProperty(camelContext, camelContext.getTypeConverter(), target, name, value, null, true, true);
    }

    /**
     * This method supports two modes to set a property:
     *
     * 1. Setting a property that has already been resolved, this is the case when {@code context} and {@code refName} are
     * NULL and {@code value} is non-NULL.
     *
     * 2. Setting a property that has not yet been resolved, the property will be resolved based on the suitable methods
     * found matching the property name on the {@code target} bean. For this mode to be triggered the parameters
     * {@code context} and {@code refName} must NOT be NULL, and {@code value} MUST be NULL.
     */
    private static boolean setProperty(CamelContext context, TypeConverter typeConverter, Object target, String name, Object value, String refName,
                                      boolean allowBuilderPattern, boolean allowNestedProperties) throws Exception {
        Class<?> clazz = target.getClass();
        Collection<Method> setters;

        // if name has dot then we need to OGNL walk it
        if (allowNestedProperties && name.indexOf('.') > 0) {
            String[] parts = name.split("\\.");
            Object newTarget = target;
            Class<?> newClass = clazz;
            // we should only iterate until until 2nd last so we use -1 in the for loop
            for (int i = 0; i < parts.length - 1; i++) {
                String part = parts[i];
                Object prop = getOrElseProperty(newTarget, part, null);
                if (prop == null) {
                    // okay is there a setter so we can create a new instance and set it automatic
                    Set<Method> newSetters = findSetterMethods(newClass, part, true);
                    if (newSetters.size() == 1) {
                        Method method = newSetters.iterator().next();
                        Class<?> parameterType = method.getParameterTypes()[0];
                        if (parameterType != null && org.apache.camel.util.ObjectHelper.hasDefaultPublicNoArgConstructor(parameterType)) {
                            Object instance = context.getInjector().newInstance(parameterType);
                            if (instance != null) {
                                org.apache.camel.support.ObjectHelper.invokeMethod(method, newTarget, instance);
                                newTarget = instance;
                                newClass = newTarget.getClass();
                            }
                        }
                    }
                } else {
                    newTarget = prop;
                    newClass = newTarget.getClass();
                }
            }
            // okay we found a nested property, then lets change to use that
            target = newTarget;
            clazz = newTarget.getClass();
            name = parts[parts.length - 1];
            if (value instanceof String) {
                if (EndpointHelper.isReferenceParameter(value.toString())) {
                    // okay its a reference so swap to lookup this
                    refName = value.toString();
                    value = null;
                }
            }
        }

        // TODO: At this point we can likely just call IntrospectionSupport directly
        return IntrospectionSupport.setProperty(context, context.getTypeConverter(), target, name, value, refName, true);
    }

}
