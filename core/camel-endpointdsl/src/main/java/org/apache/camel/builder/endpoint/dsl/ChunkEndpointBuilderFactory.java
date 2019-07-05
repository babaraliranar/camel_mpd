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
 * Transforms the message using a Chunk template.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ChunkEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Chunk component.
     */
    public interface ChunkEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedChunkEndpointBuilder advanced() {
            return (AdvancedChunkEndpointBuilder) this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder contentCache(boolean contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Sets whether to use resource content cache or not.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder contentCache(String contentCache) {
            setProperty("contentCache", contentCache);
            return this;
        }
        /**
         * Define the encoding of the body.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder encoding(String encoding) {
            setProperty("encoding", encoding);
            return this;
        }
        /**
         * Define the file extension of the template.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder extension(String extension) {
            setProperty("extension", extension);
            return this;
        }
        /**
         * Define the themes folder to scan.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeFolder(String themeFolder) {
            setProperty("themeFolder", themeFolder);
            return this;
        }
        /**
         * Define the theme layer to elaborate.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeLayer(String themeLayer) {
            setProperty("themeLayer", themeLayer);
            return this;
        }
        /**
         * Define the themes subfolder to scan.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ChunkEndpointBuilder themeSubfolder(String themeSubfolder) {
            setProperty("themeSubfolder", themeSubfolder);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Chunk component.
     */
    public interface AdvancedChunkEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ChunkEndpointBuilder basic() {
            return (ChunkEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedChunkEndpointBuilder basicPropertyBinding(
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
        default AdvancedChunkEndpointBuilder basicPropertyBinding(
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
        default AdvancedChunkEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedChunkEndpointBuilder synchronous(String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Chunk (camel-chunk)
     * Transforms the message using a Chunk template.
     * 
     * Syntax: <code>chunk:resourceUri</code>
     * Category: transformation
     * Available as of version: 2.15
     * Maven coordinates: org.apache.camel:camel-chunk
     */
    default ChunkEndpointBuilder chunk(String path) {
        class ChunkEndpointBuilderImpl extends AbstractEndpointBuilder implements ChunkEndpointBuilder, AdvancedChunkEndpointBuilder {
            public ChunkEndpointBuilderImpl(String path) {
                super("chunk", path);
            }
        }
        return new ChunkEndpointBuilderImpl(path);
    }
}