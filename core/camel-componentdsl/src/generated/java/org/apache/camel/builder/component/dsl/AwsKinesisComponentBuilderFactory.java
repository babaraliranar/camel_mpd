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
import org.apache.camel.component.aws.kinesis.KinesisComponent;

/**
 * The aws-kinesis component is for consuming and producing records from Amazon
 * Kinesis Streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsKinesisComponentBuilderFactory {

    /**
     * AWS Kinesis (camel-aws-kinesis)
     * The aws-kinesis component is for consuming and producing records from
     * Amazon Kinesis Streams.
     * 
     * Category: cloud,messaging
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-aws-kinesis
     */
    static AwsKinesisComponentBuilder awsKinesis() {
        return new AwsKinesisComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Kinesis component.
     */
    interface AwsKinesisComponentBuilder
            extends
                ComponentBuilder<KinesisComponent> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon Kinesis client to use for all requests for this endpoint.
         * 
         * The option is a:
         * <code>com.amazonaws.services.kinesis.AmazonKinesis</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder amazonKinesisClient(
                com.amazonaws.services.kinesis.AmazonKinesis amazonKinesisClient) {
            doSetProperty("amazonKinesisClient", amazonKinesisClient);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Kinesis client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Kinesis client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Kinesis client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: common
         */
        default AwsKinesisComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Region.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsKinesisComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AwsKinesisComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Defines where in the Kinesis stream to start getting records.
         * 
         * The option is a:
         * <code>com.amazonaws.services.kinesis.model.ShardIteratorType</code>
         * type.
         * 
         * Default: TRIM_HORIZON
         * Group: consumer
         */
        default AwsKinesisComponentBuilder iteratorType(
                com.amazonaws.services.kinesis.model.ShardIteratorType iteratorType) {
            doSetProperty("iteratorType", iteratorType);
            return this;
        }
        /**
         * Maximum number of records that will be fetched in each poll.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default AwsKinesisComponentBuilder maxResultsPerRequest(
                int maxResultsPerRequest) {
            doSetProperty("maxResultsPerRequest", maxResultsPerRequest);
            return this;
        }
        /**
         * The sequence number to start polling from. Required if iteratorType
         * is set to AFTER_SEQUENCE_NUMBER or AT_SEQUENCE_NUMBER.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsKinesisComponentBuilder sequenceNumber(
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
         * <code>org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum</code> type.
         * 
         * Default: ignore
         * Group: consumer
         */
        default AwsKinesisComponentBuilder shardClosed(
                org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum shardClosed) {
            doSetProperty("shardClosed", shardClosed);
            return this;
        }
        /**
         * Defines which shardId in the Kinesis stream to get records from.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsKinesisComponentBuilder shardId(java.lang.String shardId) {
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default AwsKinesisComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default AwsKinesisComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The AWS S3 default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.kinesis.KinesisConfiguration</code> type.
         * 
         * Group: advanced
         */
        default AwsKinesisComponentBuilder configuration(
                org.apache.camel.component.aws.kinesis.KinesisConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
    }

    class AwsKinesisComponentBuilderImpl
            extends
                AbstractComponentBuilder<KinesisComponent>
            implements
                AwsKinesisComponentBuilder {
        @Override
        protected KinesisComponent buildConcreteComponent() {
            return new KinesisComponent();
        }
        private org.apache.camel.component.aws.kinesis.KinesisConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.kinesis.KinesisComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.kinesis.KinesisConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": ((KinesisComponent) component).setAccessKey((java.lang.String) value); return true;
            case "amazonKinesisClient": getOrCreateConfiguration((KinesisComponent) component).setAmazonKinesisClient((com.amazonaws.services.kinesis.AmazonKinesis) value); return true;
            case "proxyHost": getOrCreateConfiguration((KinesisComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((KinesisComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((KinesisComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "region": ((KinesisComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": ((KinesisComponent) component).setSecretKey((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((KinesisComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "iteratorType": getOrCreateConfiguration((KinesisComponent) component).setIteratorType((com.amazonaws.services.kinesis.model.ShardIteratorType) value); return true;
            case "maxResultsPerRequest": getOrCreateConfiguration((KinesisComponent) component).setMaxResultsPerRequest((int) value); return true;
            case "sequenceNumber": getOrCreateConfiguration((KinesisComponent) component).setSequenceNumber((java.lang.String) value); return true;
            case "shardClosed": getOrCreateConfiguration((KinesisComponent) component).setShardClosed((org.apache.camel.component.aws.kinesis.KinesisShardClosedStrategyEnum) value); return true;
            case "shardId": getOrCreateConfiguration((KinesisComponent) component).setShardId((java.lang.String) value); return true;
            case "lazyStartProducer": ((KinesisComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((KinesisComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((KinesisComponent) component).setConfiguration((org.apache.camel.component.aws.kinesis.KinesisConfiguration) value); return true;
            default: return false;
            }
        }
    }
}