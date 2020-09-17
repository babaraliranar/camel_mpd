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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.caffeine.cache.CaffeineCacheComponent;

/**
 * Perform caching operations using Caffeine Cache.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface CaffeineCacheComponentBuilderFactory {

    /**
     * Caffeine Cache (camel-caffeine)
     * Perform caching operations using Caffeine Cache.
     * 
     * Category: cache,datagrid,clustering
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-caffeine
     */
    static CaffeineCacheComponentBuilder caffeineCache() {
        return new CaffeineCacheComponentBuilderImpl();
    }

    /**
     * Builder for the Caffeine Cache component.
     */
    interface CaffeineCacheComponentBuilder
            extends
                ComponentBuilder<CaffeineCacheComponent> {
        /**
         * To configure the default cache action. If an action is set in the
         * message header, then the operation from the header takes precedence.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default CaffeineCacheComponentBuilder action(java.lang.String action) {
            doSetProperty("action", action);
            return this;
        }
        /**
         * To configure a CacheLoader in case of a LoadCache use.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.CacheLoader</code> type.
         * 
         * Group: producer
         */
        default CaffeineCacheComponentBuilder cacheLoader(
                com.github.benmanes.caffeine.cache.CacheLoader cacheLoader) {
            doSetProperty("cacheLoader", cacheLoader);
            return this;
        }
        /**
         * Configure if a cache need to be created if it does exist or can't be
         * pre-configured.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default CaffeineCacheComponentBuilder createCacheIfNotExist(
                boolean createCacheIfNotExist) {
            doSetProperty("createCacheIfNotExist", createCacheIfNotExist);
            return this;
        }
        /**
         * Set the eviction Type for this cache.
         * 
         * The option is a:
         * <code>org.apache.camel.component.caffeine.EvictionType</code> type.
         * 
         * Default: size-based
         * Group: producer
         */
        default CaffeineCacheComponentBuilder evictionType(
                org.apache.camel.component.caffeine.EvictionType evictionType) {
            doSetProperty("evictionType", evictionType);
            return this;
        }
        /**
         * Set the expire After Access Time in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineCacheComponentBuilder expireAfterAccessTime(
                int expireAfterAccessTime) {
            doSetProperty("expireAfterAccessTime", expireAfterAccessTime);
            return this;
        }
        /**
         * Set the expire After Access Write in case of time based Eviction (in
         * seconds).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 300
         * Group: producer
         */
        default CaffeineCacheComponentBuilder expireAfterWriteTime(
                int expireAfterWriteTime) {
            doSetProperty("expireAfterWriteTime", expireAfterWriteTime);
            return this;
        }
        /**
         * Set the initial Capacity for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineCacheComponentBuilder initialCapacity(
                int initialCapacity) {
            doSetProperty("initialCapacity", initialCapacity);
            return this;
        }
        /**
         * To configure the default action key. If a key is set in the message
         * header, then the key from the header takes precedence.
         * 
         * The option is a: <code>java.lang.Object</code> type.
         * 
         * Group: producer
         */
        default CaffeineCacheComponentBuilder key(java.lang.Object key) {
            doSetProperty("key", key);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineCacheComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set the maximum size for the cache.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10000
         * Group: producer
         */
        default CaffeineCacheComponentBuilder maximumSize(int maximumSize) {
            doSetProperty("maximumSize", maximumSize);
            return this;
        }
        /**
         * Set a specific removal Listener for the cache.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.RemovalListener</code> type.
         * 
         * Group: producer
         */
        default CaffeineCacheComponentBuilder removalListener(
                com.github.benmanes.caffeine.cache.RemovalListener removalListener) {
            doSetProperty("removalListener", removalListener);
            return this;
        }
        /**
         * Set a specific Stats Counter for the cache stats.
         * 
         * The option is a:
         * <code>com.github.benmanes.caffeine.cache.stats.StatsCounter</code>
         * type.
         * 
         * Group: producer
         */
        default CaffeineCacheComponentBuilder statsCounter(
                com.github.benmanes.caffeine.cache.stats.StatsCounter statsCounter) {
            doSetProperty("statsCounter", statsCounter);
            return this;
        }
        /**
         * To enable stats on the cache.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default CaffeineCacheComponentBuilder statsEnabled(boolean statsEnabled) {
            doSetProperty("statsEnabled", statsEnabled);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        @Deprecated
        default CaffeineCacheComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets the global component configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.caffeine.CaffeineConfiguration</code> type.
         * 
         * Group: advanced
         */
        default CaffeineCacheComponentBuilder configuration(
                org.apache.camel.component.caffeine.CaffeineConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * The cache key type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default CaffeineCacheComponentBuilder keyType(java.lang.String keyType) {
            doSetProperty("keyType", keyType);
            return this;
        }
        /**
         * The cache value type, default java.lang.Object.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default CaffeineCacheComponentBuilder valueType(
                java.lang.String valueType) {
            doSetProperty("valueType", valueType);
            return this;
        }
    }

    class CaffeineCacheComponentBuilderImpl
            extends
                AbstractComponentBuilder<CaffeineCacheComponent>
            implements
                CaffeineCacheComponentBuilder {
        @Override
        protected CaffeineCacheComponent buildConcreteComponent() {
            return new CaffeineCacheComponent();
        }
        private org.apache.camel.component.caffeine.CaffeineConfiguration getOrCreateConfiguration(
                org.apache.camel.component.caffeine.cache.CaffeineCacheComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.caffeine.CaffeineConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "action": getOrCreateConfiguration((CaffeineCacheComponent) component).setAction((java.lang.String) value); return true;
            case "cacheLoader": getOrCreateConfiguration((CaffeineCacheComponent) component).setCacheLoader((com.github.benmanes.caffeine.cache.CacheLoader) value); return true;
            case "createCacheIfNotExist": getOrCreateConfiguration((CaffeineCacheComponent) component).setCreateCacheIfNotExist((boolean) value); return true;
            case "evictionType": getOrCreateConfiguration((CaffeineCacheComponent) component).setEvictionType((org.apache.camel.component.caffeine.EvictionType) value); return true;
            case "expireAfterAccessTime": getOrCreateConfiguration((CaffeineCacheComponent) component).setExpireAfterAccessTime((int) value); return true;
            case "expireAfterWriteTime": getOrCreateConfiguration((CaffeineCacheComponent) component).setExpireAfterWriteTime((int) value); return true;
            case "initialCapacity": getOrCreateConfiguration((CaffeineCacheComponent) component).setInitialCapacity((int) value); return true;
            case "key": getOrCreateConfiguration((CaffeineCacheComponent) component).setKey((java.lang.Object) value); return true;
            case "lazyStartProducer": ((CaffeineCacheComponent) component).setLazyStartProducer((boolean) value); return true;
            case "maximumSize": getOrCreateConfiguration((CaffeineCacheComponent) component).setMaximumSize((int) value); return true;
            case "removalListener": getOrCreateConfiguration((CaffeineCacheComponent) component).setRemovalListener((com.github.benmanes.caffeine.cache.RemovalListener) value); return true;
            case "statsCounter": getOrCreateConfiguration((CaffeineCacheComponent) component).setStatsCounter((com.github.benmanes.caffeine.cache.stats.StatsCounter) value); return true;
            case "statsEnabled": getOrCreateConfiguration((CaffeineCacheComponent) component).setStatsEnabled((boolean) value); return true;
            case "basicPropertyBinding": ((CaffeineCacheComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((CaffeineCacheComponent) component).setConfiguration((org.apache.camel.component.caffeine.CaffeineConfiguration) value); return true;
            case "keyType": getOrCreateConfiguration((CaffeineCacheComponent) component).setKeyType((java.lang.String) value); return true;
            case "valueType": getOrCreateConfiguration((CaffeineCacheComponent) component).setValueType((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}