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
import org.apache.camel.component.aws.sqs.SqsComponent;

/**
 * The aws-sqs component is used for sending and receiving messages to Amazon's
 * SQS service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AwsSqsComponentBuilderFactory {

    /**
     * AWS Simple Queue Service (camel-aws-sqs)
     * The aws-sqs component is used for sending and receiving messages to
     * Amazon's SQS service.
     * 
     * Category: cloud,messaging
     * Since: 2.6
     * Maven coordinates: org.apache.camel:camel-aws-sqs
     */
    static AwsSqsComponentBuilder awsSqs() {
        return new AwsSqsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Queue Service component.
     */
    interface AwsSqsComponentBuilder extends ComponentBuilder<SqsComponent> {
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSqsComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * The hostname of the Amazon AWS cloud.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: amazonaws.com
         * Group: common
         */
        default AwsSqsComponentBuilder amazonAWSHost(
                java.lang.String amazonAWSHost) {
            doSetProperty("amazonAWSHost", amazonAWSHost);
            return this;
        }
        /**
         * To use the AmazonSQS as client.
         * 
         * The option is a: <code>com.amazonaws.services.sqs.AmazonSQS</code>
         * type.
         * 
         * Group: common
         */
        default AwsSqsComponentBuilder amazonSQSClient(
                com.amazonaws.services.sqs.AmazonSQS amazonSQSClient) {
            doSetProperty("amazonSQSClient", amazonSQSClient);
            return this;
        }
        /**
         * Setting the autocreation of the queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default AwsSqsComponentBuilder autoCreateQueue(boolean autoCreateQueue) {
            doSetProperty("autoCreateQueue", autoCreateQueue);
            return this;
        }
        /**
         * The underlying protocol used to communicate with SQS.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: https
         * Group: common
         */
        default AwsSqsComponentBuilder protocol(java.lang.String protocol) {
            doSetProperty("protocol", protocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the SQS client.
         * 
         * The option is a: <code>com.amazonaws.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: common
         */
        default AwsSqsComponentBuilder proxyProtocol(
                com.amazonaws.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Specify the queue owner aws account id when you need to connect the
         * queue with different account owner.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSqsComponentBuilder queueOwnerAWSAccountId(
                java.lang.String queueOwnerAWSAccountId) {
            doSetProperty("queueOwnerAWSAccountId", queueOwnerAWSAccountId);
            return this;
        }
        /**
         * Specify the queue region which could be used with
         * queueOwnerAWSAccountId to build the service URL.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default AwsSqsComponentBuilder region(java.lang.String region) {
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
        default AwsSqsComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * A list of attribute names to receive when consuming. Multiple names
         * can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder attributeNames(
                java.lang.String attributeNames) {
            doSetProperty("attributeNames", attributeNames);
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
        default AwsSqsComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows you to use multiple threads to poll the sqs queue to increase
         * throughput.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default AwsSqsComponentBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The default visibility timeout (in seconds).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder defaultVisibilityTimeout(
                java.lang.Integer defaultVisibilityTimeout) {
            doSetProperty("defaultVisibilityTimeout", defaultVisibilityTimeout);
            return this;
        }
        /**
         * Delete message from SQS after it has been read.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default AwsSqsComponentBuilder deleteAfterRead(boolean deleteAfterRead) {
            doSetProperty("deleteAfterRead", deleteAfterRead);
            return this;
        }
        /**
         * Whether or not to send the DeleteMessage to the SQS queue if an
         * exchange fails to get through a filter. If 'false' and exchange does
         * not make it through a Camel filter upstream in the route, then don't
         * send DeleteMessage.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default AwsSqsComponentBuilder deleteIfFiltered(boolean deleteIfFiltered) {
            doSetProperty("deleteIfFiltered", deleteIfFiltered);
            return this;
        }
        /**
         * If enabled then a scheduled background task will keep extending the
         * message visibility on SQS. This is needed if it takes a long time to
         * process the message. If set to true defaultVisibilityTimeout must be
         * set. See details at Amazon docs.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AwsSqsComponentBuilder extendMessageVisibility(
                boolean extendMessageVisibility) {
            doSetProperty("extendMessageVisibility", extendMessageVisibility);
            return this;
        }
        /**
         * The length of time, in seconds, for which Amazon SQS can reuse a data
         * key to encrypt or decrypt messages before calling AWS KMS again. An
         * integer representing seconds, between 60 seconds (1 minute) and
         * 86,400 seconds (24 hours). Default: 300 (5 minutes).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder kmsDataKeyReusePeriodSeconds(
                java.lang.Integer kmsDataKeyReusePeriodSeconds) {
            doSetProperty("kmsDataKeyReusePeriodSeconds", kmsDataKeyReusePeriodSeconds);
            return this;
        }
        /**
         * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or
         * a custom CMK.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder kmsMasterKeyId(
                java.lang.String kmsMasterKeyId) {
            doSetProperty("kmsMasterKeyId", kmsMasterKeyId);
            return this;
        }
        /**
         * A list of message attribute names to receive when consuming. Multiple
         * names can be separated by comma.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder messageAttributeNames(
                java.lang.String messageAttributeNames) {
            doSetProperty("messageAttributeNames", messageAttributeNames);
            return this;
        }
        /**
         * Define if Server Side Encryption is enabled or not on the queue.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default AwsSqsComponentBuilder serverSideEncryptionEnabled(
                boolean serverSideEncryptionEnabled) {
            doSetProperty("serverSideEncryptionEnabled", serverSideEncryptionEnabled);
            return this;
        }
        /**
         * The duration (in seconds) that the received messages are hidden from
         * subsequent retrieve requests after being retrieved by a
         * ReceiveMessage request to set in the
         * com.amazonaws.services.sqs.model.SetQueueAttributesRequest. This only
         * make sense if its different from defaultVisibilityTimeout. It changes
         * the queue visibility timeout attribute permanently.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder visibilityTimeout(
                java.lang.Integer visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Duration in seconds (0 to 20) that the ReceiveMessage action call
         * will wait until a message is in the queue to include in the response.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: consumer
         */
        default AwsSqsComponentBuilder waitTimeSeconds(
                java.lang.Integer waitTimeSeconds) {
            doSetProperty("waitTimeSeconds", waitTimeSeconds);
            return this;
        }
        /**
         * Delay sending messages for a number of seconds.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default AwsSqsComponentBuilder delaySeconds(
                java.lang.Integer delaySeconds) {
            doSetProperty("delaySeconds", delaySeconds);
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
        default AwsSqsComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Only for FIFO queues. Strategy for setting the messageDeduplicationId
         * on the message. Can be one of the following options: useExchangeId,
         * useContentBasedDeduplication. For the useContentBasedDeduplication
         * option, no messageDeduplicationId will be set on the message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sqs.MessageDeduplicationIdStrategy</code> type.
         * 
         * Default: useExchangeId
         * Group: producer
         */
        default AwsSqsComponentBuilder messageDeduplicationIdStrategy(
                org.apache.camel.component.aws.sqs.MessageDeduplicationIdStrategy messageDeduplicationIdStrategy) {
            doSetProperty("messageDeduplicationIdStrategy", messageDeduplicationIdStrategy);
            return this;
        }
        /**
         * Only for FIFO queues. Strategy for setting the messageGroupId on the
         * message. Can be one of the following options: useConstant,
         * useExchangeId, usePropertyValue. For the usePropertyValue option, the
         * value of property CamelAwsMessageGroupId will be used.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sqs.MessageGroupIdStrategy</code> type.
         * 
         * Group: producer
         */
        default AwsSqsComponentBuilder messageGroupIdStrategy(
                org.apache.camel.component.aws.sqs.MessageGroupIdStrategy messageGroupIdStrategy) {
            doSetProperty("messageGroupIdStrategy", messageGroupIdStrategy);
            return this;
        }
        /**
         * The operation to do in case the user don't want to send only a
         * message.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sqs.SqsOperations</code> type.
         * 
         * Group: producer
         */
        default AwsSqsComponentBuilder operation(
                org.apache.camel.component.aws.sqs.SqsOperations operation) {
            doSetProperty("operation", operation);
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
        default AwsSqsComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * The AWS SQS default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sqs.SqsConfiguration</code>
         * type.
         * 
         * Group: advanced
         */
        default AwsSqsComponentBuilder configuration(
                org.apache.camel.component.aws.sqs.SqsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Define if you want to apply delaySeconds option to the queue or on
         * single messages.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AwsSqsComponentBuilder delayQueue(boolean delayQueue) {
            doSetProperty("delayQueue", delayQueue);
            return this;
        }
        /**
         * To define the queueUrl explicitly. All other parameters, which would
         * influence the queueUrl, are ignored. This parameter is intended to be
         * used, to connect to a mock implementation of SQS, for testing
         * purposes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: advanced
         */
        default AwsSqsComponentBuilder queueUrl(java.lang.String queueUrl) {
            doSetProperty("queueUrl", queueUrl);
            return this;
        }
        /**
         * To define a proxy host when instantiating the SQS client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: proxy
         */
        default AwsSqsComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the SQS client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: proxy
         */
        default AwsSqsComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The maximumMessageSize (in bytes) an SQS message can contain for this
         * queue.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default AwsSqsComponentBuilder maximumMessageSize(
                java.lang.Integer maximumMessageSize) {
            doSetProperty("maximumMessageSize", maximumMessageSize);
            return this;
        }
        /**
         * The messageRetentionPeriod (in seconds) a message will be retained by
         * SQS for this queue.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default AwsSqsComponentBuilder messageRetentionPeriod(
                java.lang.Integer messageRetentionPeriod) {
            doSetProperty("messageRetentionPeriod", messageRetentionPeriod);
            return this;
        }
        /**
         * The policy for this queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: queue
         */
        default AwsSqsComponentBuilder policy(java.lang.String policy) {
            doSetProperty("policy", policy);
            return this;
        }
        /**
         * If you do not specify WaitTimeSeconds in the request, the queue
         * attribute ReceiveMessageWaitTimeSeconds is used to determine how long
         * to wait.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: queue
         */
        default AwsSqsComponentBuilder receiveMessageWaitTimeSeconds(
                java.lang.Integer receiveMessageWaitTimeSeconds) {
            doSetProperty("receiveMessageWaitTimeSeconds", receiveMessageWaitTimeSeconds);
            return this;
        }
        /**
         * Specify the policy that send message to DeadLetter queue. See detail
         * at Amazon docs.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: queue
         */
        default AwsSqsComponentBuilder redrivePolicy(
                java.lang.String redrivePolicy) {
            doSetProperty("redrivePolicy", redrivePolicy);
            return this;
        }
    }

    class AwsSqsComponentBuilderImpl
            extends
                AbstractComponentBuilder<SqsComponent>
            implements
                AwsSqsComponentBuilder {
        @Override
        protected SqsComponent buildConcreteComponent() {
            return new SqsComponent();
        }
        private org.apache.camel.component.aws.sqs.SqsConfiguration getOrCreateConfiguration(
                org.apache.camel.component.aws.sqs.SqsComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws.sqs.SqsConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "accessKey": ((SqsComponent) component).setAccessKey((java.lang.String) value); return true;
            case "amazonAWSHost": getOrCreateConfiguration((SqsComponent) component).setAmazonAWSHost((java.lang.String) value); return true;
            case "amazonSQSClient": getOrCreateConfiguration((SqsComponent) component).setAmazonSQSClient((com.amazonaws.services.sqs.AmazonSQS) value); return true;
            case "autoCreateQueue": getOrCreateConfiguration((SqsComponent) component).setAutoCreateQueue((boolean) value); return true;
            case "protocol": getOrCreateConfiguration((SqsComponent) component).setProtocol((java.lang.String) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((SqsComponent) component).setProxyProtocol((com.amazonaws.Protocol) value); return true;
            case "queueOwnerAWSAccountId": getOrCreateConfiguration((SqsComponent) component).setQueueOwnerAWSAccountId((java.lang.String) value); return true;
            case "region": ((SqsComponent) component).setRegion((java.lang.String) value); return true;
            case "secretKey": ((SqsComponent) component).setSecretKey((java.lang.String) value); return true;
            case "attributeNames": getOrCreateConfiguration((SqsComponent) component).setAttributeNames((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((SqsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "concurrentConsumers": getOrCreateConfiguration((SqsComponent) component).setConcurrentConsumers((int) value); return true;
            case "defaultVisibilityTimeout": getOrCreateConfiguration((SqsComponent) component).setDefaultVisibilityTimeout((java.lang.Integer) value); return true;
            case "deleteAfterRead": getOrCreateConfiguration((SqsComponent) component).setDeleteAfterRead((boolean) value); return true;
            case "deleteIfFiltered": getOrCreateConfiguration((SqsComponent) component).setDeleteIfFiltered((boolean) value); return true;
            case "extendMessageVisibility": getOrCreateConfiguration((SqsComponent) component).setExtendMessageVisibility((boolean) value); return true;
            case "kmsDataKeyReusePeriodSeconds": getOrCreateConfiguration((SqsComponent) component).setKmsDataKeyReusePeriodSeconds((java.lang.Integer) value); return true;
            case "kmsMasterKeyId": getOrCreateConfiguration((SqsComponent) component).setKmsMasterKeyId((java.lang.String) value); return true;
            case "messageAttributeNames": getOrCreateConfiguration((SqsComponent) component).setMessageAttributeNames((java.lang.String) value); return true;
            case "serverSideEncryptionEnabled": getOrCreateConfiguration((SqsComponent) component).setServerSideEncryptionEnabled((boolean) value); return true;
            case "visibilityTimeout": getOrCreateConfiguration((SqsComponent) component).setVisibilityTimeout((java.lang.Integer) value); return true;
            case "waitTimeSeconds": getOrCreateConfiguration((SqsComponent) component).setWaitTimeSeconds((java.lang.Integer) value); return true;
            case "delaySeconds": getOrCreateConfiguration((SqsComponent) component).setDelaySeconds((java.lang.Integer) value); return true;
            case "lazyStartProducer": ((SqsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "messageDeduplicationIdStrategy": getOrCreateConfiguration((SqsComponent) component).setMessageDeduplicationIdStrategy((org.apache.camel.component.aws.sqs.MessageDeduplicationIdStrategy) value); return true;
            case "messageGroupIdStrategy": getOrCreateConfiguration((SqsComponent) component).setMessageGroupIdStrategy((org.apache.camel.component.aws.sqs.MessageGroupIdStrategy) value); return true;
            case "operation": getOrCreateConfiguration((SqsComponent) component).setOperation((org.apache.camel.component.aws.sqs.SqsOperations) value); return true;
            case "basicPropertyBinding": ((SqsComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "configuration": ((SqsComponent) component).setConfiguration((org.apache.camel.component.aws.sqs.SqsConfiguration) value); return true;
            case "delayQueue": getOrCreateConfiguration((SqsComponent) component).setDelayQueue((boolean) value); return true;
            case "queueUrl": getOrCreateConfiguration((SqsComponent) component).setQueueUrl((java.lang.String) value); return true;
            case "proxyHost": getOrCreateConfiguration((SqsComponent) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((SqsComponent) component).setProxyPort((java.lang.Integer) value); return true;
            case "maximumMessageSize": getOrCreateConfiguration((SqsComponent) component).setMaximumMessageSize((java.lang.Integer) value); return true;
            case "messageRetentionPeriod": getOrCreateConfiguration((SqsComponent) component).setMessageRetentionPeriod((java.lang.Integer) value); return true;
            case "policy": getOrCreateConfiguration((SqsComponent) component).setPolicy((java.lang.String) value); return true;
            case "receiveMessageWaitTimeSeconds": getOrCreateConfiguration((SqsComponent) component).setReceiveMessageWaitTimeSeconds((java.lang.Integer) value); return true;
            case "redrivePolicy": getOrCreateConfiguration((SqsComponent) component).setRedrivePolicy((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}