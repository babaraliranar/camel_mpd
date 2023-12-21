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
import org.apache.camel.component.azure.storage.queue.QueueComponent;

/**
 * Stores and retrieves messages to/from Azure Storage Queue.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface AzureStorageQueueComponentBuilderFactory {

    /**
     * Azure Storage Queue Service (camel-azure-storage-queue)
     * Stores and retrieves messages to/from Azure Storage Queue.
     * 
     * Category: cloud,messaging
     * Since: 3.3
     * Maven coordinates: org.apache.camel:camel-azure-storage-queue
     * 
     * @return the dsl builder
     */
    static AzureStorageQueueComponentBuilder azureStorageQueue() {
        return new AzureStorageQueueComponentBuilderImpl();
    }

    /**
     * Builder for the Azure Storage Queue Service component.
     */
    interface AzureStorageQueueComponentBuilder
            extends
                ComponentBuilder<QueueComponent> {
        /**
         * The component configurations.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.storage.queue.QueueConfiguration&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder configuration(
                org.apache.camel.component.azure.storage.queue.QueueConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Determines the credential strategy to adopt.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.storage.queue.CredentialType&lt;/code&gt; type.
         * 
         * Default: SHARED_ACCOUNT_KEY
         * Group: common
         * 
         * @param credentialType the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder credentialType(
                org.apache.camel.component.azure.storage.queue.CredentialType credentialType) {
            doSetProperty("credentialType", credentialType);
            return this;
        }
        /**
         * Service client to a storage account to interact with the queue
         * service. This client does not hold any state about a particular
         * storage account but is instead a convenient way of sending off
         * appropriate requests to the resource on the service. This client
         * contains all the operations for interacting with a queue account in
         * Azure Storage. Operations allowed by the client are creating,
         * listing, and deleting queues, retrieving and updating properties of
         * the account, and retrieving statistics of the account.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.storage.queue.QueueServiceClient&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param serviceClient the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder serviceClient(
                com.azure.storage.queue.QueueServiceClient serviceClient) {
            doSetProperty("serviceClient", serviceClient);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions (if possible) occurred while the Camel
         * consumer is trying to pickup incoming messages, or the likes, will
         * now be processed as a message and handled by the routing Error
         * Handler. Important: This is only possible if the 3rd party component
         * allows Camel to be alerted if an exception was thrown. Some
         * components handle this internally only, and therefore
         * bridgeErrorHandler is not possible. In other situations we may
         * improve the Camel component to hook into the 3rd party component and
         * make this possible for future releases. By default the consumer will
         * use the org.apache.camel.spi.ExceptionHandler to deal with
         * exceptions, that will be logged at WARN or ERROR level and ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * When is set to true, the queue will be automatically created when
         * sending messages to the queue.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param createQueue the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder createQueue(
                boolean createQueue) {
            doSetProperty("createQueue", createQueue);
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
        default AzureStorageQueueComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Queue service operation hint to the producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.storage.queue.QueueOperationDefinition&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder operation(
                org.apache.camel.component.azure.storage.queue.QueueOperationDefinition operation) {
            doSetProperty("operation", operation);
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
        default AzureStorageQueueComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all consumer based health checks from
         * this component.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckConsumerEnabled the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder healthCheckConsumerEnabled(
                boolean healthCheckConsumerEnabled) {
            doSetProperty("healthCheckConsumerEnabled", healthCheckConsumerEnabled);
            return this;
        }
        /**
         * Used for enabling or disabling all producer based health checks from
         * this component. Notice: Camel has by default disabled all producer
         * based health-checks. You can turn on producer checks globally by
         * setting camel.health.producersEnabled=true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: health
         * 
         * @param healthCheckProducerEnabled the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
        /**
         * Maximum number of messages to get, if there are less messages exist
         * in the queue than requested all the messages will be returned. If
         * left empty only 1 message will be retrieved, the allowed range is 1
         * to 32 messages.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Default: 1
         * Group: queue
         * 
         * @param maxMessages the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder maxMessages(
                java.lang.Integer maxMessages) {
            doSetProperty("maxMessages", maxMessages);
            return this;
        }
        /**
         * The ID of the message to be deleted or updated.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: queue
         * 
         * @param messageId the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder messageId(
                java.lang.String messageId) {
            doSetProperty("messageId", messageId);
            return this;
        }
        /**
         * Unique identifier that must match for the message to be deleted or
         * updated.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: queue
         * 
         * @param popReceipt the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder popReceipt(
                java.lang.String popReceipt) {
            doSetProperty("popReceipt", popReceipt);
            return this;
        }
        /**
         * An optional timeout applied to the operation. If a response is not
         * returned before the timeout concludes a RuntimeException will be
         * thrown.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: queue
         * 
         * @param timeout the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder timeout(
                java.time.Duration timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * How long the message will stay alive in the queue. If unset the value
         * will default to 7 days, if -1 is passed the message will not expire.
         * The time to live must be -1 or any positive number. The format should
         * be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as 20.345
         * seconds, P2D -- parses as 2 days However, in case you are using
         * EndpointDsl/ComponentDsl, you can do something like
         * Duration.ofSeconds() since these Java APIs are typesafe.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: queue
         * 
         * @param timeToLive the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder timeToLive(
                java.time.Duration timeToLive) {
            doSetProperty("timeToLive", timeToLive);
            return this;
        }
        /**
         * The timeout period for how long the message is invisible in the
         * queue. The timeout must be between 1 seconds and 7 days. The format
         * should be in this form: PnDTnHnMn.nS., e.g: PT20.345S -- parses as
         * 20.345 seconds, P2D -- parses as 2 days However, in case you are
         * using EndpointDsl/ComponentDsl, you can do something like
         * Duration.ofSeconds() since these Java APIs are typesafe.
         * 
         * The option is a: &lt;code&gt;java.time.Duration&lt;/code&gt; type.
         * 
         * Group: queue
         * 
         * @param visibilityTimeout the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder visibilityTimeout(
                java.time.Duration visibilityTimeout) {
            doSetProperty("visibilityTimeout", visibilityTimeout);
            return this;
        }
        /**
         * Access key for the associated azure account name to be used for
         * authentication with azure queue services.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder accessKey(
                java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * StorageSharedKeyCredential can be injected to create the azure
         * client, this holds the important authentication information.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.storage.common.StorageSharedKeyCredential&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param credentials the value to set
         * @return the dsl builder
         */
        default AzureStorageQueueComponentBuilder credentials(
                com.azure.storage.common.StorageSharedKeyCredential credentials) {
            doSetProperty("credentials", credentials);
            return this;
        }
    }

    class AzureStorageQueueComponentBuilderImpl
            extends
                AbstractComponentBuilder<QueueComponent>
            implements
                AzureStorageQueueComponentBuilder {
        @Override
        protected QueueComponent buildConcreteComponent() {
            return new QueueComponent();
        }
        private org.apache.camel.component.azure.storage.queue.QueueConfiguration getOrCreateConfiguration(
                org.apache.camel.component.azure.storage.queue.QueueComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.azure.storage.queue.QueueConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((QueueComponent) component).setConfiguration((org.apache.camel.component.azure.storage.queue.QueueConfiguration) value); return true;
            case "credentialType": getOrCreateConfiguration((QueueComponent) component).setCredentialType((org.apache.camel.component.azure.storage.queue.CredentialType) value); return true;
            case "serviceClient": getOrCreateConfiguration((QueueComponent) component).setServiceClient((com.azure.storage.queue.QueueServiceClient) value); return true;
            case "bridgeErrorHandler": ((QueueComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "createQueue": getOrCreateConfiguration((QueueComponent) component).setCreateQueue((boolean) value); return true;
            case "lazyStartProducer": ((QueueComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((QueueComponent) component).setOperation((org.apache.camel.component.azure.storage.queue.QueueOperationDefinition) value); return true;
            case "autowiredEnabled": ((QueueComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((QueueComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((QueueComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            case "maxMessages": getOrCreateConfiguration((QueueComponent) component).setMaxMessages((java.lang.Integer) value); return true;
            case "messageId": getOrCreateConfiguration((QueueComponent) component).setMessageId((java.lang.String) value); return true;
            case "popReceipt": getOrCreateConfiguration((QueueComponent) component).setPopReceipt((java.lang.String) value); return true;
            case "timeout": getOrCreateConfiguration((QueueComponent) component).setTimeout((java.time.Duration) value); return true;
            case "timeToLive": getOrCreateConfiguration((QueueComponent) component).setTimeToLive((java.time.Duration) value); return true;
            case "visibilityTimeout": getOrCreateConfiguration((QueueComponent) component).setVisibilityTimeout((java.time.Duration) value); return true;
            case "accessKey": getOrCreateConfiguration((QueueComponent) component).setAccessKey((java.lang.String) value); return true;
            case "credentials": getOrCreateConfiguration((QueueComponent) component).setCredentials((com.azure.storage.common.StorageSharedKeyCredential) value); return true;
            default: return false;
            }
        }
    }
}