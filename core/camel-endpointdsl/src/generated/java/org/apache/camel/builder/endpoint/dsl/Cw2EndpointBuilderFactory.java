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

import java.time.Instant;
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Sending metrics to AWS CloudWatch using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Cw2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 CloudWatch component.
     */
    public interface Cw2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedCw2EndpointBuilder advanced() {
            return (AdvancedCw2EndpointBuilder) this;
        }
        /**
         * To use the AmazonCloudWatch as the client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.cloudwatch.CloudWatchClient</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder amazonCwClient(Object amazonCwClient) {
            doSetProperty("amazonCwClient", amazonCwClient);
            return this;
        }
        /**
         * To use the AmazonCloudWatch as the client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.cloudwatch.CloudWatchClient</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder amazonCwClient(String amazonCwClient) {
            doSetProperty("amazonCwClient", amazonCwClient);
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
        default Cw2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * Default: false
         * Group: producer
         */
        default Cw2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The metric name.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder name(String name) {
            doSetProperty("name", name);
            return this;
        }
        /**
         * To define a proxy host when instantiating the CW client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the CW client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the CW client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the CW client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Cw2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the CW client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Cw2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which EKS client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * The metric timestamp.
         * 
         * The option is a: <code>java.time.Instant</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder timestamp(Instant timestamp) {
            doSetProperty("timestamp", timestamp);
            return this;
        }
        /**
         * The metric timestamp.
         * 
         * The option will be converted to a <code>java.time.Instant</code>
         * type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder timestamp(String timestamp) {
            doSetProperty("timestamp", timestamp);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Cw2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Cw2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * The metric unit.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder unit(String unit) {
            doSetProperty("unit", unit);
            return this;
        }
        /**
         * The metric value.
         * 
         * The option is a: <code>java.lang.Double</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder value(Double value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * The metric value.
         * 
         * The option will be converted to a <code>java.lang.Double</code> type.
         * 
         * Group: producer
         */
        default Cw2EndpointBuilder value(String value) {
            doSetProperty("value", value);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Cw2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Cw2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 CloudWatch component.
     */
    public interface AdvancedCw2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Cw2EndpointBuilder basic() {
            return (Cw2EndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCw2EndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedCw2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface Cw2Builders {
        /**
         * AWS 2 CloudWatch (camel-aws2-cw)
         * Sending metrics to AWS CloudWatch using AWS SDK version 2.x.
         * 
         * Category: cloud,monitoring
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-cw
         * 
         * Syntax: <code>aws2-cw:namespace</code>
         * 
         * Path parameter: namespace (required)
         * The metric namespace
         * 
         * @param path namespace
         */
        default Cw2EndpointBuilder aws2Cw(String path) {
            return Cw2EndpointBuilderFactory.endpointBuilder("aws2-cw", path);
        }
        /**
         * AWS 2 CloudWatch (camel-aws2-cw)
         * Sending metrics to AWS CloudWatch using AWS SDK version 2.x.
         * 
         * Category: cloud,monitoring
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-cw
         * 
         * Syntax: <code>aws2-cw:namespace</code>
         * 
         * Path parameter: namespace (required)
         * The metric namespace
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path namespace
         */
        default Cw2EndpointBuilder aws2Cw(String componentName, String path) {
            return Cw2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Cw2EndpointBuilder endpointBuilder(String componentName, String path) {
        class Cw2EndpointBuilderImpl extends AbstractEndpointBuilder implements Cw2EndpointBuilder, AdvancedCw2EndpointBuilder {
            public Cw2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Cw2EndpointBuilderImpl(path);
    }
}