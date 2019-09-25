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
 * The Ignite Compute endpoint is one of camel-ignite endpoints which allows you
 * to run compute operations on the cluster by passing in an IgniteCallable, an
 * IgniteRunnable, an IgniteClosure, or collections of them, along with their
 * parameters if necessary.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface IgniteComputeEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Ignite Compute component.
     */
    public interface IgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedIgniteComputeEndpointBuilder advanced() {
            return (AdvancedIgniteComputeEndpointBuilder) this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                boolean propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to propagate the incoming body if the return type of the
         * underlying Ignite operation is void.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder propagateIncomingBodyIfNoReturnValue(
                String propagateIncomingBodyIfNoReturnValue) {
            doSetProperty("propagateIncomingBodyIfNoReturnValue", propagateIncomingBodyIfNoReturnValue);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                boolean treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
        /**
         * Sets whether to treat Collections as cache objects or as Collections
         * of items to insert/update/compute, etc.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default IgniteComputeEndpointBuilder treatCollectionsAsCacheObjects(
                String treatCollectionsAsCacheObjects) {
            doSetProperty("treatCollectionsAsCacheObjects", treatCollectionsAsCacheObjects);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Ignite Compute component.
     */
    public interface AdvancedIgniteComputeEndpointBuilder
            extends
                EndpointProducerBuilder {
        default IgniteComputeEndpointBuilder basic() {
            return (IgniteComputeEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedIgniteComputeEndpointBuilder basicPropertyBinding(
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
        default AdvancedIgniteComputeEndpointBuilder basicPropertyBinding(
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
        default AdvancedIgniteComputeEndpointBuilder synchronous(
                boolean synchronous) {
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
        default AdvancedIgniteComputeEndpointBuilder synchronous(
                String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.ignite.compute.IgniteComputeExecutionType</code> enum.
     */
    enum IgniteComputeExecutionType {
        CALL,
        BROADCAST,
        APPLY,
        EXECUTE,
        RUN,
        AFFINITY_CALL,
        AFFINITY_RUN;
    }
    /**
     * Ignite Compute (camel-ignite)
     * The Ignite Compute endpoint is one of camel-ignite endpoints which allows
     * you to run compute operations on the cluster by passing in an
     * IgniteCallable, an IgniteRunnable, an IgniteClosure, or collections of
     * them, along with their parameters if necessary.
     * 
     * Category: nosql,cache,compute
     * Available as of version: 2.17
     * Maven coordinates: org.apache.camel:camel-ignite
     * 
     * Syntax: <code>ignite-compute:endpointId</code>
     * 
     * Path parameter: endpointId (required)
     * The endpoint ID (not used).
     */
    default IgniteComputeEndpointBuilder igniteCompute(String path) {
        class IgniteComputeEndpointBuilderImpl extends AbstractEndpointBuilder implements IgniteComputeEndpointBuilder, AdvancedIgniteComputeEndpointBuilder {
            public IgniteComputeEndpointBuilderImpl(String path) {
                super("ignite-compute", path);
            }
        }
        return new IgniteComputeEndpointBuilderImpl(path);
    }
}