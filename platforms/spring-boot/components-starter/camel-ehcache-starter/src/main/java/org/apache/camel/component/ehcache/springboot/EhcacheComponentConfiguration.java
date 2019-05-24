/*
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
package org.apache.camel.component.ehcache.springboot;

import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.ehcache.CacheManager;
import org.ehcache.config.CacheConfiguration;
import org.ehcache.config.Configuration;
import org.ehcache.event.EventFiring;
import org.ehcache.event.EventOrdering;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The ehcache component enables you to perform caching operations using Ehcache
 * as cache implementation.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ehcache")
public class EhcacheComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ehcache component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the global component configuration
     */
    private EhcacheConfigurationNestedConfiguration configuration;
    /**
     * The cache manager. The option is a org.ehcache.CacheManager type.
     */
    private String cacheManager;
    /**
     * The cache manager configuration. The option is a
     * org.ehcache.config.Configuration type.
     */
    private String cacheManagerConfiguration;
    /**
     * The default cache configuration to be used to create caches. The option
     * is a org.ehcache.config.CacheConfiguration<?,?> type.
     */
    private String cacheConfiguration;
    /**
     * A map of caches configurations to be used to create caches. The option is
     * a
     * java.util.Map<java.lang.String,org.ehcache.config.CacheConfiguration<?,?>> type.
     */
    private String cachesConfigurations;
    /**
     * URI pointing to the Ehcache XML configuration file's location
     */
    private String cacheConfigurationUri;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public EhcacheConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            EhcacheConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getCacheManager() {
        return cacheManager;
    }

    public void setCacheManager(String cacheManager) {
        this.cacheManager = cacheManager;
    }

    public String getCacheManagerConfiguration() {
        return cacheManagerConfiguration;
    }

    public void setCacheManagerConfiguration(String cacheManagerConfiguration) {
        this.cacheManagerConfiguration = cacheManagerConfiguration;
    }

    public String getCacheConfiguration() {
        return cacheConfiguration;
    }

    public void setCacheConfiguration(String cacheConfiguration) {
        this.cacheConfiguration = cacheConfiguration;
    }

    public String getCachesConfigurations() {
        return cachesConfigurations;
    }

    public void setCachesConfigurations(String cachesConfigurations) {
        this.cachesConfigurations = cachesConfigurations;
    }

    public String getCacheConfigurationUri() {
        return cacheConfigurationUri;
    }

    public void setCacheConfigurationUri(String cacheConfigurationUri) {
        this.cacheConfigurationUri = cacheConfigurationUri;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class EhcacheConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.ehcache.EhcacheConfiguration.class;
        /**
         * URI pointing to the Ehcache XML configuration file's location
         */
        private String configurationUri;
        /**
         * URI pointing to the Ehcache XML configuration file's location
         */
        @Deprecated
        private String configUri;
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         */
        private Boolean createCacheIfNotExist = true;
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         */
        private String action;
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         */
        private Object key;
        /**
         * The cache manager
         */
        private CacheManager cacheManager;
        /**
         * The cache manager configuration
         */
        private Configuration cacheManagerConfiguration;
        /**
         * Set the delivery mode (ordered, unordered)
         */
        private EventOrdering eventOrdering = EventOrdering.ORDERED;
        /**
         * Set the delivery mode (synchronous, asynchronous)
         */
        private EventFiring eventFiring = EventFiring.ASYNCHRONOUS;
        /**
         * Set the type of events to listen for
         */
        private Set eventTypes;
        /**
         * The default cache configuration to be used to create caches.
         */
        private CacheConfiguration configuration;
        /**
         * A map of cache configuration to be used to create caches.
         */
        private Map configurations;
        /**
         * The cache key type, default "java.lang.Object"
         */
        private Class keyType = java.lang.Object.class;
        /**
         * The cache value type, default "java.lang.Object"
         */
        private Class valueType = java.lang.Object.class;

        public String getConfigurationUri() {
            return configurationUri;
        }

        public void setConfigurationUri(String configurationUri) {
            this.configurationUri = configurationUri;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getConfigUri() {
            return configUri;
        }

        @Deprecated
        public void setConfigUri(String configUri) {
            this.configUri = configUri;
        }

        public Boolean getCreateCacheIfNotExist() {
            return createCacheIfNotExist;
        }

        public void setCreateCacheIfNotExist(Boolean createCacheIfNotExist) {
            this.createCacheIfNotExist = createCacheIfNotExist;
        }

        public String getAction() {
            return action;
        }

        public void setAction(String action) {
            this.action = action;
        }

        public Object getKey() {
            return key;
        }

        public void setKey(Object key) {
            this.key = key;
        }

        public CacheManager getCacheManager() {
            return cacheManager;
        }

        public void setCacheManager(CacheManager cacheManager) {
            this.cacheManager = cacheManager;
        }

        public Configuration getCacheManagerConfiguration() {
            return cacheManagerConfiguration;
        }

        public void setCacheManagerConfiguration(
                Configuration cacheManagerConfiguration) {
            this.cacheManagerConfiguration = cacheManagerConfiguration;
        }

        public EventOrdering getEventOrdering() {
            return eventOrdering;
        }

        public void setEventOrdering(EventOrdering eventOrdering) {
            this.eventOrdering = eventOrdering;
        }

        public EventFiring getEventFiring() {
            return eventFiring;
        }

        public void setEventFiring(EventFiring eventFiring) {
            this.eventFiring = eventFiring;
        }

        public Set getEventTypes() {
            return eventTypes;
        }

        public void setEventTypes(Set eventTypes) {
            this.eventTypes = eventTypes;
        }

        public CacheConfiguration getConfiguration() {
            return configuration;
        }

        public void setConfiguration(CacheConfiguration configuration) {
            this.configuration = configuration;
        }

        public Map getConfigurations() {
            return configurations;
        }

        public void setConfigurations(Map configurations) {
            this.configurations = configurations;
        }

        public Class getKeyType() {
            return keyType;
        }

        public void setKeyType(Class keyType) {
            this.keyType = keyType;
        }

        public Class getValueType() {
            return valueType;
        }

        public void setValueType(Class valueType) {
            this.valueType = valueType;
        }
    }
}