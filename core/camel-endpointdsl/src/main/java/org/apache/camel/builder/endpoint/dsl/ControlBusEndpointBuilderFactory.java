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

import javax.annotation.Generated;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The controlbus component provides easy management of Camel applications based
 * on the Control Bus EIP pattern.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ControlBusEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Control Bus component.
     */
    public interface ControlBusEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedControlBusEndpointBuilder advanced() {
            return (AdvancedControlBusEndpointBuilder) this;
        }
        /**
         * To denote an action that can be either: start, stop, or status. To
         * either start or stop a route, or to get the status of the route as
         * output in the message body. You can use suspend and resume from Camel
         * 2.11.1 onwards to either suspend or resume a route. And from Camel
         * 2.11.1 onwards you can use stats to get performance statics returned
         * in XML format; the routeId option can be used to define which route
         * to get the performance stats for, if routeId is not defined, then you
         * get statistics for the entire CamelContext. The restart action will
         * restart the route.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder action(String action) {
            setProperty("action", action);
            return this;
        }
        /**
         * Whether to execute the control bus task asynchronously. Important: If
         * this option is enabled, then any result from the task is not set on
         * the Exchange. This is only possible if executing tasks synchronously.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder async(boolean async) {
            setProperty("async", async);
            return this;
        }
        /**
         * Whether to execute the control bus task asynchronously. Important: If
         * this option is enabled, then any result from the task is not set on
         * the Exchange. This is only possible if executing tasks synchronously.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder async(String async) {
            setProperty("async", async);
            return this;
        }
        /**
         * Logging level used for logging when task is done, or if any
         * exceptions occurred during processing the task.
         * 
         * The option is a: <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder loggingLevel(LoggingLevel loggingLevel) {
            setProperty("loggingLevel", loggingLevel);
            return this;
        }
        /**
         * Logging level used for logging when task is done, or if any
         * exceptions occurred during processing the task.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.LoggingLevel</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder loggingLevel(String loggingLevel) {
            setProperty("loggingLevel", loggingLevel);
            return this;
        }
        /**
         * The delay in millis to use when restarting a route.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder restartDelay(int restartDelay) {
            setProperty("restartDelay", restartDelay);
            return this;
        }
        /**
         * The delay in millis to use when restarting a route.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder restartDelay(String restartDelay) {
            setProperty("restartDelay", restartDelay);
            return this;
        }
        /**
         * To specify a route by its id. The special keyword current indicates
         * the current route.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ControlBusEndpointBuilder routeId(String routeId) {
            setProperty("routeId", routeId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Control Bus component.
     */
    public interface AdvancedControlBusEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ControlBusEndpointBuilder basic() {
            return (ControlBusEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedControlBusEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedControlBusEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            setProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedControlBusEndpointBuilder synchronous(
                boolean synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedControlBusEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Control Bus (camel-controlbus)
     * The controlbus component provides easy management of Camel applications
     * based on the Control Bus EIP pattern.
     * 
     * Syntax: <code>controlbus:command:language</code>
     * Category: core,monitoring
     * Available as of version: 2.11
     * Maven coordinates: org.apache.camel:camel-controlbus
     */
    default ControlBusEndpointBuilder controlBus(String path) {
        class ControlBusEndpointBuilderImpl extends AbstractEndpointBuilder implements ControlBusEndpointBuilder, AdvancedControlBusEndpointBuilder {
            public ControlBusEndpointBuilderImpl(String path) {
                super("controlbus", path);
            }
        }
        return new ControlBusEndpointBuilderImpl(path);
    }
}