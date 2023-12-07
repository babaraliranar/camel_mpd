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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Consume join/leave events of a cache instance in a Hazelcast cluster.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface HazelcastInstanceEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Hazelcast Instance component.
     */
    public interface HazelcastInstanceEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedHazelcastInstanceEndpointBuilder advanced() {
            return (AdvancedHazelcastInstanceEndpointBuilder) this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder defaultOperation(
                org.apache.camel.component.hazelcast.HazelcastOperation defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * To specify a default operation to use, if no operation header has
         * been provided.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.hazelcast.HazelcastOperation&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param defaultOperation the value to set
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder defaultOperation(
                String defaultOperation) {
            doSetProperty("defaultOperation", defaultOperation);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option is a:
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder hazelcastInstance(
                com.hazelcast.core.HazelcastInstance hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference which can be used for hazelcast
         * endpoint.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.hazelcast.core.HazelcastInstance&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param hazelcastInstance the value to set
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder hazelcastInstance(
                String hazelcastInstance) {
            doSetProperty("hazelcastInstance", hazelcastInstance);
            return this;
        }
        /**
         * The hazelcast instance reference name which can be used for hazelcast
         * endpoint. If you don't specify the instance reference, camel use the
         * default hazelcast instance from the camel-hazelcast instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param hazelcastInstanceName the value to set
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder hazelcastInstanceName(
                String hazelcastInstanceName) {
            doSetProperty("hazelcastInstanceName", hazelcastInstanceName);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Hazelcast Instance component.
     */
    public interface AdvancedHazelcastInstanceEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default HazelcastInstanceEndpointBuilder basic() {
            return (HazelcastInstanceEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedHazelcastInstanceEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
    }

    public interface HazelcastInstanceBuilders {
        /**
         * Hazelcast Instance (camel-hazelcast)
         * Consume join/leave events of a cache instance in a Hazelcast cluster.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * @return the dsl builder for the headers' name.
         */
        default HazelcastInstanceHeaderNameBuilder hazelcastInstance() {
            return HazelcastInstanceHeaderNameBuilder.INSTANCE;
        }
        /**
         * Hazelcast Instance (camel-hazelcast)
         * Consume join/leave events of a cache instance in a Hazelcast cluster.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-instance:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder hazelcastInstance(String path) {
            return HazelcastInstanceEndpointBuilderFactory.endpointBuilder("hazelcast-instance", path);
        }
        /**
         * Hazelcast Instance (camel-hazelcast)
         * Consume join/leave events of a cache instance in a Hazelcast cluster.
         * 
         * Category: cache,datagrid
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-hazelcast
         * 
         * Syntax: <code>hazelcast-instance:cacheName</code>
         * 
         * Path parameter: cacheName (required)
         * The name of the cache
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path cacheName
         * @return the dsl builder
         */
        default HazelcastInstanceEndpointBuilder hazelcastInstance(
                String componentName,
                String path) {
            return HazelcastInstanceEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Hazelcast Instance component.
     */
    public static class HazelcastInstanceHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final HazelcastInstanceHeaderNameBuilder INSTANCE = new HazelcastInstanceHeaderNameBuilder();

        /**
         * The type of event - here added and removed.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerAction}.
         */
        public String hazelcastListenerAction() {
            return "CamelHazelcastListenerAction";
        }

        /**
         * The map consumer.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerType}.
         */
        public String hazelcastListenerType() {
            return "CamelHazelcastListenerType";
        }

        /**
         * The time of the event in millis.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastListenerTime}.
         */
        public String hazelcastListenerTime() {
            return "CamelHazelcastListenerTime";
        }

        /**
         * The host name of the instance.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastInstanceHost}.
         */
        public String hazelcastInstanceHost() {
            return "CamelHazelcastInstanceHost";
        }

        /**
         * The port number of the instance.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code HazelcastInstancePort}.
         */
        public String hazelcastInstancePort() {
            return "CamelHazelcastInstancePort";
        }
    }
    static HazelcastInstanceEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class HazelcastInstanceEndpointBuilderImpl extends AbstractEndpointBuilder implements HazelcastInstanceEndpointBuilder, AdvancedHazelcastInstanceEndpointBuilder {
            public HazelcastInstanceEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new HazelcastInstanceEndpointBuilderImpl(path);
    }
}