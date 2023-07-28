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

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws2.kinesis.Kinesis2Component;

/**
 * Consume and produce records from and to AWS Kinesis Streams using AWS SDK
 * version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2KinesisComponentBuilderFactory {

    /**
     * AWS Kinesis (camel-aws2-kinesis)
     * Consume and produce records from and to AWS Kinesis Streams using AWS SDK
     * version 2.x.
     * 
     * Category: cloud,messaging
     * Since: 3.2
     * Maven coordinates: org.apache.camel:camel-aws2-kinesis
     * 
     * @return the dsl builder
     */
    static Aws2KinesisComponentBuilder aws2Kinesis() {
        return new Aws2KinesisComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Kinesis component.
     */
    interface Aws2KinesisComponentBuilder
            extends
                ComponentBuilder<Kinesis2Component> {
        /**
         * Amazon Kinesis client to use for all requests for this endpoint.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.kinesis.KinesisClient&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param amazonKinesisClient the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder amazonKinesisClient(
                software.amazon.awssdk.services.kinesis.KinesisClient amazonKinesisClient) {
            doSetProperty("amazonKinesisClient", amazonKinesisClient);
            return this;
        }
        /**
         * If we want to a KinesisAsyncClient instance set it to true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param asyncClient the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder asyncClient(boolean asyncClient) {
            doSetProperty("asyncClient", asyncClient);
            return this;
        }
        /**
         * This option will set the CBOR_ENABLED property during the execution.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param cborEnabled the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder cborEnabled(boolean cborEnabled) {
            doSetProperty("cborEnabled", cborEnabled);
            return this;
        }
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.kinesis.Kinesis2Configuration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder configuration(
                org.apache.camel.component.aws2.kinesis.Kinesis2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder profileCredentialsName(
                java.lang.String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Kinesis client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder proxyPort(
                java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: common
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Kinesis Firehose client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the Kinesis client should expect to load credentials
         * through a default credentials provider or to expect static
         * credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the Kinesis client should expect to load credentials
         * through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Defines where in the Kinesis stream to start getting records.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.kinesis.model.ShardIteratorType&lt;/code&gt; type.
         * 
         * Default: TRIM_HORIZON
         * Group: consumer
         * 
         * @param iteratorType the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder iteratorType(
                software.amazon.awssdk.services.kinesis.model.ShardIteratorType iteratorType) {
            doSetProperty("iteratorType", iteratorType);
            return this;
        }
        /**
         * Maximum number of records that will be fetched in each poll.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: consumer
         * 
         * @param maxResultsPerRequest the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder maxResultsPerRequest(
                int maxResultsPerRequest) {
            doSetProperty("maxResultsPerRequest", maxResultsPerRequest);
            return this;
        }
        /**
         * The sequence number to start polling from. Required if iteratorType
         * is set to AFTER_SEQUENCE_NUMBER or AT_SEQUENCE_NUMBER.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param sequenceNumber the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder sequenceNumber(
                java.lang.String sequenceNumber) {
            doSetProperty("sequenceNumber", sequenceNumber);
            return this;
        }
        /**
         * Define what will be the behavior in case of shard closed. Possible
         * value are ignore, silent and fail. In case of ignore a message will
         * be logged and the consumer will restart from the beginning,in case of
         * silent there will be no logging and the consumer will start from the
         * beginning,in case of fail a ReachedClosedStateException will be
         * raised.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum&lt;/code&gt; type.
         * 
         * Default: ignore
         * Group: consumer
         * 
         * @param shardClosed the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder shardClosed(
                org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum shardClosed) {
            doSetProperty("shardClosed", shardClosed);
            return this;
        }
        /**
         * Defines which shardId in the Kinesis stream to get records from.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param shardId the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder shardId(java.lang.String shardId) {
            doSetProperty("shardId", shardId);
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
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component (default enabled).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component (default disabled).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2KinesisComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2KinesisComponentBuilderImpl
            extends
                AbstractComponentBuilder<Kinesis2Component>
            implements
                Aws2KinesisComponentBuilder {
        @Override
        protected Kinesis2Component buildConcreteComponent() {
            return new Kinesis2Component();
        }
        private org.apache.camel.component.aws2.kinesis.Kinesis2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.kinesis.Kinesis2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.kinesis.Kinesis2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonKinesisClient": getOrCreateConfiguration((Kinesis2Component) component).setAmazonKinesisClient((software.amazon.awssdk.services.kinesis.KinesisClient) value); return true;
            case "asyncClient": getOrCreateConfiguration((Kinesis2Component) component).setAsyncClient((boolean) value); return true;
            case "cborEnabled": getOrCreateConfiguration((Kinesis2Component) component).setCborEnabled((boolean) value); return true;
            case "configuration": ((Kinesis2Component) component).setConfiguration((org.apache.camel.component.aws2.kinesis.Kinesis2Configuration) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((Kinesis2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "profileCredentialsName": getOrCreateConfiguration((Kinesis2Component) component).setProfileCredentialsName((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((Kinesis2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Kinesis2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Kinesis2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "region": getOrCreateConfiguration((Kinesis2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Kinesis2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((Kinesis2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((Kinesis2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "useProfileCredentialsProvider": getOrCreateConfiguration((Kinesis2Component) component).setUseProfileCredentialsProvider((boolean) value); return true;
            case "bridgeErrorHandler": ((Kinesis2Component) component).setBridgeErrorHandler((boolean) value); return true;
            case "iteratorType": getOrCreateConfiguration((Kinesis2Component) component).setIteratorType((software.amazon.awssdk.services.kinesis.model.ShardIteratorType) value); return true;
            case "maxResultsPerRequest": getOrCreateConfiguration((Kinesis2Component) component).setMaxResultsPerRequest((int) value); return true;
            case "sequenceNumber": getOrCreateConfiguration((Kinesis2Component) component).setSequenceNumber((java.lang.String) value); return true;
            case "shardClosed": getOrCreateConfiguration((Kinesis2Component) component).setShardClosed((org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum) value); return true;
            case "shardId": getOrCreateConfiguration((Kinesis2Component) component).setShardId((java.lang.String) value); return true;
            case "lazyStartProducer": ((Kinesis2Component) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((Kinesis2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((Kinesis2Component) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((Kinesis2Component) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((Kinesis2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Kinesis2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}