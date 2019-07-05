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
 * The Twitter Streaming component consumes twitter statuses using Streaming
 * API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TwitterStreamingEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Twitter Streaming component.
     */
    public interface TwitterStreamingEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AdvancedTwitterStreamingEndpointBuilder advanced() {
            return (AdvancedTwitterStreamingEndpointBuilder) this;
        }
        /**
         * The http proxy host which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default TwitterStreamingEndpointBuilder httpProxyHost(
                String httpProxyHost) {
            setProperty("httpProxyHost", httpProxyHost);
            return this;
        }
        /**
         * The http proxy password which can be used for the camel-twitter. Can
         * also be configured on the TwitterComponent level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default TwitterStreamingEndpointBuilder httpProxyPassword(
                String httpProxyPassword) {
            setProperty("httpProxyPassword", httpProxyPassword);
            return this;
        }
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default TwitterStreamingEndpointBuilder httpProxyPort(
                Integer httpProxyPort) {
            setProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * The http proxy port which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: proxy
         */
        default TwitterStreamingEndpointBuilder httpProxyPort(
                String httpProxyPort) {
            setProperty("httpProxyPort", httpProxyPort);
            return this;
        }
        /**
         * The http proxy user which can be used for the camel-twitter. Can also
         * be configured on the TwitterComponent level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default TwitterStreamingEndpointBuilder httpProxyUser(
                String httpProxyUser) {
            setProperty("httpProxyUser", httpProxyUser);
            return this;
        }
        /**
         * The access token. Can also be configured on the TwitterComponent
         * level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default TwitterStreamingEndpointBuilder accessToken(String accessToken) {
            setProperty("accessToken", accessToken);
            return this;
        }
        /**
         * The access secret. Can also be configured on the TwitterComponent
         * level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default TwitterStreamingEndpointBuilder accessTokenSecret(
                String accessTokenSecret) {
            setProperty("accessTokenSecret", accessTokenSecret);
            return this;
        }
        /**
         * The consumer key. Can also be configured on the TwitterComponent
         * level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default TwitterStreamingEndpointBuilder consumerKey(String consumerKey) {
            setProperty("consumerKey", consumerKey);
            return this;
        }
        /**
         * The consumer secret. Can also be configured on the TwitterComponent
         * level instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default TwitterStreamingEndpointBuilder consumerSecret(
                String consumerSecret) {
            setProperty("consumerSecret", consumerSecret);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Twitter Streaming component.
     */
    public interface AdvancedTwitterStreamingEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default TwitterStreamingEndpointBuilder basic() {
            return (TwitterStreamingEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedTwitterStreamingEndpointBuilder basicPropertyBinding(
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
        default AdvancedTwitterStreamingEndpointBuilder basicPropertyBinding(
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
        default AdvancedTwitterStreamingEndpointBuilder synchronous(
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
        default AdvancedTwitterStreamingEndpointBuilder synchronous(
                String synchronous) {
            setProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.twitter.data.EndpointType</code> enum.
     */
    enum EndpointType {
        POLLING,
        DIRECT,
        EVENT;
    }
    /**
     * Twitter Streaming (camel-twitter)
     * The Twitter Streaming component consumes twitter statuses using Streaming
     * API.
     * 
     * Syntax: <code>twitter-streaming:streamingType</code>
     * Category: api,social
     * Available as of version: 2.10
     * Maven coordinates: org.apache.camel:camel-twitter
     */
    default TwitterStreamingEndpointBuilder twitterStreaming(String path) {
        class TwitterStreamingEndpointBuilderImpl extends AbstractEndpointBuilder implements TwitterStreamingEndpointBuilder, AdvancedTwitterStreamingEndpointBuilder {
            public TwitterStreamingEndpointBuilderImpl(String path) {
                super("twitter-streaming", path);
            }
        }
        return new TwitterStreamingEndpointBuilderImpl(path);
    }
}