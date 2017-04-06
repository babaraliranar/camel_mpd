/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.catalog.maven;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import groovy.grape.Grape;
import groovy.lang.GroovyClassLoader;
import org.apache.camel.catalog.VersionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A {@link VersionManager} that can load the resources using Maven to download needed artifacts from
 * a local or remote Maven repository.
 * <p/>
 * This implementation uses Groovy Grape to download the Maven JARs.
 */
public class MavenVersionManager implements VersionManager {

    private static final Logger LOG = LoggerFactory.getLogger(MavenVersionManager.class);

    private final ClassLoader classLoader = new GroovyClassLoader();
    private String version;
    private String runtimeProviderVersion;
    private String cacheDirectory;

    /**
     * Configures the directory for the download cache.
     * <p/>
     * The default folder is <tt>USER_HOME/.groovy/grape</tt>
     *
     * @param directory the directory.
     */
    public void setCacheDirectory(String directory) {
        this.cacheDirectory = directory;
    }

    /**
     * To add a 3rd party Maven repository.
     *
     * @param name the repository name
     * @param url  the repository url
     */
    public void addMavenRepository(String name, String url) {
        Map<String, Object> repo = new HashMap<>();
        repo.put("name", name);
        repo.put("root", url);
        Grape.addResolver(repo);
    }

    @Override
    public String getLoadedVersion() {
        return version;
    }

    @Override
    public boolean loadVersion(String version) {
        try {
            if (cacheDirectory != null) {
                System.setProperty("grape.root", cacheDirectory);
            }

            Grape.setEnableAutoDownload(true);

            Map<String, Object> param = new HashMap<>();
            param.put("classLoader", classLoader);
            param.put("group", "org.apache.camel");
            param.put("module", "camel-catalog");
            param.put("version", version);

            Grape.grab(param);

            this.version = version;
            return true;
        } catch (Exception e) {
            LOG.warn("Cannot load version " + version + " due " + e.getMessage());
            return false;
        }
    }

    @Override
    public String getRuntimeProviderLoadedVersion() {
        return runtimeProviderVersion;
    }

    @Override
    public boolean loadRuntimeProviderVersion(String groupId, String artifactId, String version) {
        try {
            Grape.setEnableAutoDownload(true);

            Map<String, Object> param = new HashMap<>();
            param.put("classLoader", classLoader);
            param.put("group", groupId);
            param.put("module", artifactId);
            param.put("version", version);

            Grape.grab(param);

            this.runtimeProviderVersion = version;
            return true;
        } catch (Exception e) {
            LOG.warn("Cannot load runtime provider version " + version + " due " + e.getMessage());
            return false;
        }
    }

    @Override
    public InputStream getResourceAsStream(String name) {
        InputStream is = null;

        if (runtimeProviderVersion != null) {
            is = doGetResourceAsStream(name, runtimeProviderVersion);
        }
        if (is == null && version != null) {
            is = doGetResourceAsStream(name, version);
        }

        return is;
    }

    private InputStream doGetResourceAsStream(String name, String version) {
        if (version == null) {
            return null;
        }

        try {
            URL found = null;
            Enumeration<URL> urls = classLoader.getResources(name);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                if (url.getPath().contains(version)) {
                    found = url;
                    break;
                }
            }
            if (found != null) {
                return found.openStream();
            }
        } catch (IOException e) {
            // ignore
            LOG.warn("Cannot open resource " + name + " and version " + version + " due " + e.getMessage());
        }

        return null;
    }
}
