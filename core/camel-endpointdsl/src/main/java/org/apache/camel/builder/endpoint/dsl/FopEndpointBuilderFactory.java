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
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The fop component allows you to render a message into different output
 * formats using Apache FOP.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FopEndpointBuilderFactory {


    /**
     * Builder for endpoint for the FOP component.
     */
    public interface FopEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedFopEndpointBuilder advanced() {
            return (AdvancedFopEndpointBuilder) this;
        }
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory.
         * 
         * The option is a: <code>org.apache.fop.apps.FopFactory</code> type.
         * 
         * Group: producer
         */
        default FopEndpointBuilder fopFactory(Object fopFactory) {
            doSetProperty("fopFactory", fopFactory);
            return this;
        }
        /**
         * Allows to use a custom configured or implementation of
         * org.apache.fop.apps.FopFactory.
         * 
         * The option will be converted to a
         * <code>org.apache.fop.apps.FopFactory</code> type.
         * 
         * Group: producer
         */
        default FopEndpointBuilder fopFactory(String fopFactory) {
            doSetProperty("fopFactory", fopFactory);
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
         * Group: producer
         */
        default FopEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default FopEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The location of a configuration file which can be loaded from
         * classpath or file system.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default FopEndpointBuilder userConfigURL(String userConfigURL) {
            doSetProperty("userConfigURL", userConfigURL);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the FOP component.
     */
    public interface AdvancedFopEndpointBuilder
            extends
                EndpointProducerBuilder {
        default FopEndpointBuilder basic() {
            return (FopEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedFopEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedFopEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default AdvancedFopEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
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
        default AdvancedFopEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * FOP (camel-fop)
     * The fop component allows you to render a message into different output
     * formats using Apache FOP.
     * 
     * Category: transformation
     * Available as of version: 2.10
     * Maven coordinates: org.apache.camel:camel-fop
     * 
     * Syntax: <code>fop:outputType</code>
     * 
     * Path parameter: outputType (required)
     * The primary output format is PDF but other output formats are also
     * supported.
     * The value can be one of: pdf, ps, pcl, png, jpeg, svg, xml, mif, rtf, txt
     */
    default FopEndpointBuilder fop(String path) {
        class FopEndpointBuilderImpl extends AbstractEndpointBuilder implements FopEndpointBuilder, AdvancedFopEndpointBuilder {
            public FopEndpointBuilderImpl(String path) {
                super("fop", path);
            }
        }
        return new FopEndpointBuilderImpl(path);
    }
}