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
import org.apache.camel.component.rabbitmq.RabbitMQComponent;

/**
 * Send and receive messages from RabbitMQ instances.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface RabbitmqComponentBuilderFactory {

    /**
     * RabbitMQ (camel-rabbitmq)
     * Send and receive messages from RabbitMQ instances.
     * 
     * Category: messaging
     * Since: 2.12
     * Maven coordinates: org.apache.camel:camel-rabbitmq
     */
    static RabbitmqComponentBuilder rabbitmq() {
        return new RabbitmqComponentBuilderImpl();
    }

    /**
     * Builder for the RabbitMQ component.
     */
    interface RabbitmqComponentBuilder
            extends
                ComponentBuilder<RabbitMQComponent> {
        /**
         * If this option is set, camel-rabbitmq will try to create connection
         * based on the setting of option addresses. The addresses value is a
         * string which looks like server1:12345, server2:12345.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder addresses(java.lang.String addresses) {
            doSetProperty("addresses", addresses);
            return this;
        }
        /**
         * If it is true, the exchange will be deleted when it is no longer in
         * use.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default RabbitmqComponentBuilder autoDelete(boolean autoDelete) {
            doSetProperty("autoDelete", autoDelete);
            return this;
        }
        /**
         * To use a custom RabbitMQ connection factory. When this option is set,
         * all connection options (connectionTimeout, requestedChannelMax...)
         * set on URI are not used.
         * 
         * The option is a: <code>com.rabbitmq.client.ConnectionFactory</code>
         * type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder connectionFactory(
                com.rabbitmq.client.ConnectionFactory connectionFactory) {
            doSetProperty("connectionFactory", connectionFactory);
            return this;
        }
        /**
         * The name of the dead letter exchange.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder deadLetterExchange(
                java.lang.String deadLetterExchange) {
            doSetProperty("deadLetterExchange", deadLetterExchange);
            return this;
        }
        /**
         * The type of the dead letter exchange.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: direct
         * Group: common
         */
        default RabbitmqComponentBuilder deadLetterExchangeType(
                java.lang.String deadLetterExchangeType) {
            doSetProperty("deadLetterExchangeType", deadLetterExchangeType);
            return this;
        }
        /**
         * The name of the dead letter queue.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder deadLetterQueue(
                java.lang.String deadLetterQueue) {
            doSetProperty("deadLetterQueue", deadLetterQueue);
            return this;
        }
        /**
         * The routing key for the dead letter exchange.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder deadLetterRoutingKey(
                java.lang.String deadLetterRoutingKey) {
            doSetProperty("deadLetterRoutingKey", deadLetterRoutingKey);
            return this;
        }
        /**
         * If the option is true, camel declare the exchange and queue name and
         * bind them together. If the option is false, camel won't declare the
         * exchange and queue name on the server.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default RabbitmqComponentBuilder declare(boolean declare) {
            doSetProperty("declare", declare);
            return this;
        }
        /**
         * If we are declaring a durable exchange (the exchange will survive a
         * server restart).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default RabbitmqComponentBuilder durable(boolean durable) {
            doSetProperty("durable", durable);
            return this;
        }
        /**
         * Exclusive queues may only be accessed by the current connection, and
         * are deleted when that connection closes.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default RabbitmqComponentBuilder exclusive(boolean exclusive) {
            doSetProperty("exclusive", exclusive);
            return this;
        }
        /**
         * The hostname of the running RabbitMQ instance or cluster.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: common
         */
        default RabbitmqComponentBuilder hostname(java.lang.String hostname) {
            doSetProperty("hostname", hostname);
            return this;
        }
        /**
         * Passive queues depend on the queue already to be available at
         * RabbitMQ.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default RabbitmqComponentBuilder passive(boolean passive) {
            doSetProperty("passive", passive);
            return this;
        }
        /**
         * Port number for the host with the running rabbitmq instance or
         * cluster.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5672
         * Group: common
         */
        default RabbitmqComponentBuilder portNumber(int portNumber) {
            doSetProperty("portNumber", portNumber);
            return this;
        }
        /**
         * This can be used if we need to declare the queue but not the
         * exchange.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default RabbitmqComponentBuilder skipExchangeDeclare(
                boolean skipExchangeDeclare) {
            doSetProperty("skipExchangeDeclare", skipExchangeDeclare);
            return this;
        }
        /**
         * If true the queue will not be bound to the exchange after declaring
         * it.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default RabbitmqComponentBuilder skipQueueBind(boolean skipQueueBind) {
            doSetProperty("skipQueueBind", skipQueueBind);
            return this;
        }
        /**
         * If true the producer will not declare and bind a queue. This can be
         * used for directing messages via an existing routing key.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: common
         */
        default RabbitmqComponentBuilder skipQueueDeclare(
                boolean skipQueueDeclare) {
            doSetProperty("skipQueueDeclare", skipQueueDeclare);
            return this;
        }
        /**
         * The vhost for the channel.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: /
         * Group: common
         */
        default RabbitmqComponentBuilder vhost(java.lang.String vhost) {
            doSetProperty("vhost", vhost);
            return this;
        }
        /**
         * If messages should be auto acknowledged.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default RabbitmqComponentBuilder autoAck(boolean autoAck) {
            doSetProperty("autoAck", autoAck);
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
        default RabbitmqComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Request exclusive access to the queue (meaning only this consumer can
         * access the queue). This is useful when you want a long-lived shared
         * queue to be temporarily accessible by just one consumer.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RabbitmqComponentBuilder exclusiveConsumer(
                boolean exclusiveConsumer) {
            doSetProperty("exclusiveConsumer", exclusiveConsumer);
            return this;
        }
        /**
         * The maximum number of messages that the server will deliver, 0 if
         * unlimited. You need to specify the option of prefetchSize,
         * prefetchCount, prefetchGlobal at the same time.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default RabbitmqComponentBuilder prefetchCount(int prefetchCount) {
            doSetProperty("prefetchCount", prefetchCount);
            return this;
        }
        /**
         * Enables the quality of service on the RabbitMQConsumer side. You need
         * to specify the option of prefetchSize, prefetchCount, prefetchGlobal
         * at the same time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RabbitmqComponentBuilder prefetchEnabled(boolean prefetchEnabled) {
            doSetProperty("prefetchEnabled", prefetchEnabled);
            return this;
        }
        /**
         * If the settings should be applied to the entire channel rather than
         * each consumer You need to specify the option of prefetchSize,
         * prefetchCount, prefetchGlobal at the same time.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default RabbitmqComponentBuilder prefetchGlobal(boolean prefetchGlobal) {
            doSetProperty("prefetchGlobal", prefetchGlobal);
            return this;
        }
        /**
         * The maximum amount of content (measured in octets) that the server
         * will deliver, 0 if unlimited. You need to specify the option of
         * prefetchSize, prefetchCount, prefetchGlobal at the same time.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Group: consumer
         */
        default RabbitmqComponentBuilder prefetchSize(int prefetchSize) {
            doSetProperty("prefetchSize", prefetchSize);
            return this;
        }
        /**
         * The consumer uses a Thread Pool Executor with a fixed number of
         * threads. This setting allows you to set that number of threads.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10
         * Group: consumer (advanced)
         */
        default RabbitmqComponentBuilder threadPoolSize(int threadPoolSize) {
            doSetProperty("threadPoolSize", threadPoolSize);
            return this;
        }
        /**
         * Allow pass null values to header.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RabbitmqComponentBuilder allowNullHeaders(
                boolean allowNullHeaders) {
            doSetProperty("allowNullHeaders", allowNullHeaders);
            return this;
        }
        /**
         * Get maximum number of opened channel in pool.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 10
         * Group: producer
         */
        default RabbitmqComponentBuilder channelPoolMaxSize(
                int channelPoolMaxSize) {
            doSetProperty("channelPoolMaxSize", channelPoolMaxSize);
            return this;
        }
        /**
         * Set the maximum number of milliseconds to wait for a channel from the
         * pool.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: producer
         */
        default RabbitmqComponentBuilder channelPoolMaxWait(
                long channelPoolMaxWait) {
            doSetProperty("channelPoolMaxWait", channelPoolMaxWait);
            return this;
        }
        /**
         * When true, an exception will be thrown when the message cannot be
         * delivered (basic.return) and the message is marked as mandatory.
         * PublisherAcknowledgement will also be activated in this case. See
         * also publisher acknowledgements - When will messages be confirmed.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RabbitmqComponentBuilder guaranteedDeliveries(
                boolean guaranteedDeliveries) {
            doSetProperty("guaranteedDeliveries", guaranteedDeliveries);
            return this;
        }
        /**
         * This flag tells the server how to react if the message cannot be
         * routed to a queue consumer immediately. If this flag is set, the
         * server will return an undeliverable message with a Return method. If
         * this flag is zero, the server will queue the message, but with no
         * guarantee that it will ever be consumed. If the header is present
         * rabbitmq.IMMEDIATE it will override this option.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RabbitmqComponentBuilder immediate(boolean immediate) {
            doSetProperty("immediate", immediate);
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
        default RabbitmqComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * This flag tells the server how to react if the message cannot be
         * routed to a queue. If this flag is set, the server will return an
         * unroutable message with a Return method. If this flag is zero, the
         * server silently drops the message. If the header is present
         * rabbitmq.MANDATORY it will override this option.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RabbitmqComponentBuilder mandatory(boolean mandatory) {
            doSetProperty("mandatory", mandatory);
            return this;
        }
        /**
         * When true, the message will be published with publisher
         * acknowledgements turned on.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default RabbitmqComponentBuilder publisherAcknowledgements(
                boolean publisherAcknowledgements) {
            doSetProperty("publisherAcknowledgements", publisherAcknowledgements);
            return this;
        }
        /**
         * The amount of time in milliseconds to wait for a basic.ack response
         * from RabbitMQ server.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default RabbitmqComponentBuilder publisherAcknowledgementsTimeout(
                long publisherAcknowledgementsTimeout) {
            doSetProperty("publisherAcknowledgementsTimeout", publisherAcknowledgementsTimeout);
            return this;
        }
        /**
         * Specify arguments for configuring the different RabbitMQ concepts, a
         * different prefix is required for each: Exchange: arg.exchange. Queue:
         * arg.queue. Binding: arg.binding. DLQ: arg.dlq.queue. DLQ Binding:
         * arg.dlq.binding. For example to declare a queue with message ttl
         * argument:
         * http://localhost:5672/exchange/queueargs=arg.queue.x-message-ttl=60000.
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default RabbitmqComponentBuilder args(
                java.util.Map<java.lang.String, java.lang.Object> args) {
            doSetProperty("args", args);
            return this;
        }
        /**
         * Whether to auto-detect looking up RabbitMQ connection factory from
         * the registry. When enabled and a single instance of the connection
         * factory is found then it will be used. An explicit connection factory
         * can be configured on the component or endpoint level which takes
         * precedence.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: advanced
         */
        default RabbitmqComponentBuilder autoDetectConnectionFactory(
                boolean autoDetectConnectionFactory) {
            doSetProperty("autoDetectConnectionFactory", autoDetectConnectionFactory);
            return this;
        }
        /**
         * Enables connection automatic recovery (uses connection implementation
         * that performs automatic recovery when connection shutdown is not
         * initiated by the application).
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: advanced
         */
        default RabbitmqComponentBuilder automaticRecoveryEnabled(
                java.lang.Boolean automaticRecoveryEnabled) {
            doSetProperty("automaticRecoveryEnabled", automaticRecoveryEnabled);
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
        @Deprecated
        default RabbitmqComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Connection client properties (client info used in negotiating with
         * the server).
         * 
         * The option is a: <code>java.util.Map<java.lang.String,
         * java.lang.Object></code> type.
         * 
         * Group: advanced
         */
        default RabbitmqComponentBuilder clientProperties(
                java.util.Map<java.lang.String, java.lang.Object> clientProperties) {
            doSetProperty("clientProperties", clientProperties);
            return this;
        }
        /**
         * Custom rabbitmq ExceptionHandler for ConnectionFactory.
         * 
         * The option is a: <code>com.rabbitmq.client.ExceptionHandler</code>
         * type.
         * 
         * Group: advanced
         */
        default RabbitmqComponentBuilder connectionFactoryExceptionHandler(
                com.rabbitmq.client.ExceptionHandler connectionFactoryExceptionHandler) {
            doSetProperty("connectionFactoryExceptionHandler", connectionFactoryExceptionHandler);
            return this;
        }
        /**
         * Connection timeout.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60000
         * Group: advanced
         */
        default RabbitmqComponentBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Network recovery interval in milliseconds (interval used when
         * recovering from network failure).
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Default: 5000
         * Group: advanced
         */
        default RabbitmqComponentBuilder networkRecoveryInterval(
                java.lang.Integer networkRecoveryInterval) {
            doSetProperty("networkRecoveryInterval", networkRecoveryInterval);
            return this;
        }
        /**
         * Connection requested channel max (max number of channels offered).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 2047
         * Group: advanced
         */
        default RabbitmqComponentBuilder requestedChannelMax(
                int requestedChannelMax) {
            doSetProperty("requestedChannelMax", requestedChannelMax);
            return this;
        }
        /**
         * Connection requested frame max (max size of frame offered).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 0
         * Group: advanced
         */
        default RabbitmqComponentBuilder requestedFrameMax(int requestedFrameMax) {
            doSetProperty("requestedFrameMax", requestedFrameMax);
            return this;
        }
        /**
         * Connection requested heartbeat (heart-beat in seconds offered).
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 60
         * Group: advanced
         */
        default RabbitmqComponentBuilder requestedHeartbeat(
                int requestedHeartbeat) {
            doSetProperty("requestedHeartbeat", requestedHeartbeat);
            return this;
        }
        /**
         * Set timeout for waiting for a reply when using the InOut Exchange
         * Pattern (in milliseconds).
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 20000
         * Group: advanced
         */
        default RabbitmqComponentBuilder requestTimeout(long requestTimeout) {
            doSetProperty("requestTimeout", requestTimeout);
            return this;
        }
        /**
         * Set requestTimeoutCheckerInterval for inOut exchange.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default: 1000
         * Group: advanced
         */
        default RabbitmqComponentBuilder requestTimeoutCheckerInterval(
                long requestTimeoutCheckerInterval) {
            doSetProperty("requestTimeoutCheckerInterval", requestTimeoutCheckerInterval);
            return this;
        }
        /**
         * Enables connection topology recovery (should topology recovery be
         * performed).
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: advanced
         */
        default RabbitmqComponentBuilder topologyRecoveryEnabled(
                java.lang.Boolean topologyRecoveryEnabled) {
            doSetProperty("topologyRecoveryEnabled", topologyRecoveryEnabled);
            return this;
        }
        /**
         * When true and an inOut Exchange failed on the consumer side send the
         * caused Exception back in the response.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default RabbitmqComponentBuilder transferException(
                boolean transferException) {
            doSetProperty("transferException", transferException);
            return this;
        }
        /**
         * Password for authenticated access.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: guest
         * Group: security
         */
        default RabbitmqComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Enables SSL on connection, accepted value are true, TLS and 'SSLv3.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default RabbitmqComponentBuilder sslProtocol(
                java.lang.String sslProtocol) {
            doSetProperty("sslProtocol", sslProtocol);
            return this;
        }
        /**
         * Configure SSL trust manager, SSL should be enabled for this option to
         * be effective.
         * 
         * The option is a: <code>javax.net.ssl.TrustManager</code> type.
         * 
         * Group: security
         */
        default RabbitmqComponentBuilder trustManager(
                javax.net.ssl.TrustManager trustManager) {
            doSetProperty("trustManager", trustManager);
            return this;
        }
        /**
         * Username in case of authenticated access.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: guest
         * Group: security
         */
        default RabbitmqComponentBuilder username(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    class RabbitmqComponentBuilderImpl
            extends
                AbstractComponentBuilder<RabbitMQComponent>
            implements
                RabbitmqComponentBuilder {
        @Override
        protected RabbitMQComponent buildConcreteComponent() {
            return new RabbitMQComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "addresses": ((RabbitMQComponent) component).setAddresses((java.lang.String) value); return true;
            case "autoDelete": ((RabbitMQComponent) component).setAutoDelete((boolean) value); return true;
            case "connectionFactory": ((RabbitMQComponent) component).setConnectionFactory((com.rabbitmq.client.ConnectionFactory) value); return true;
            case "deadLetterExchange": ((RabbitMQComponent) component).setDeadLetterExchange((java.lang.String) value); return true;
            case "deadLetterExchangeType": ((RabbitMQComponent) component).setDeadLetterExchangeType((java.lang.String) value); return true;
            case "deadLetterQueue": ((RabbitMQComponent) component).setDeadLetterQueue((java.lang.String) value); return true;
            case "deadLetterRoutingKey": ((RabbitMQComponent) component).setDeadLetterRoutingKey((java.lang.String) value); return true;
            case "declare": ((RabbitMQComponent) component).setDeclare((boolean) value); return true;
            case "durable": ((RabbitMQComponent) component).setDurable((boolean) value); return true;
            case "exclusive": ((RabbitMQComponent) component).setExclusive((boolean) value); return true;
            case "hostname": ((RabbitMQComponent) component).setHostname((java.lang.String) value); return true;
            case "passive": ((RabbitMQComponent) component).setPassive((boolean) value); return true;
            case "portNumber": ((RabbitMQComponent) component).setPortNumber((int) value); return true;
            case "skipExchangeDeclare": ((RabbitMQComponent) component).setSkipExchangeDeclare((boolean) value); return true;
            case "skipQueueBind": ((RabbitMQComponent) component).setSkipQueueBind((boolean) value); return true;
            case "skipQueueDeclare": ((RabbitMQComponent) component).setSkipQueueDeclare((boolean) value); return true;
            case "vhost": ((RabbitMQComponent) component).setVhost((java.lang.String) value); return true;
            case "autoAck": ((RabbitMQComponent) component).setAutoAck((boolean) value); return true;
            case "bridgeErrorHandler": ((RabbitMQComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "exclusiveConsumer": ((RabbitMQComponent) component).setExclusiveConsumer((boolean) value); return true;
            case "prefetchCount": ((RabbitMQComponent) component).setPrefetchCount((int) value); return true;
            case "prefetchEnabled": ((RabbitMQComponent) component).setPrefetchEnabled((boolean) value); return true;
            case "prefetchGlobal": ((RabbitMQComponent) component).setPrefetchGlobal((boolean) value); return true;
            case "prefetchSize": ((RabbitMQComponent) component).setPrefetchSize((int) value); return true;
            case "threadPoolSize": ((RabbitMQComponent) component).setThreadPoolSize((int) value); return true;
            case "allowNullHeaders": ((RabbitMQComponent) component).setAllowNullHeaders((boolean) value); return true;
            case "channelPoolMaxSize": ((RabbitMQComponent) component).setChannelPoolMaxSize((int) value); return true;
            case "channelPoolMaxWait": ((RabbitMQComponent) component).setChannelPoolMaxWait((long) value); return true;
            case "guaranteedDeliveries": ((RabbitMQComponent) component).setGuaranteedDeliveries((boolean) value); return true;
            case "immediate": ((RabbitMQComponent) component).setImmediate((boolean) value); return true;
            case "lazyStartProducer": ((RabbitMQComponent) component).setLazyStartProducer((boolean) value); return true;
            case "mandatory": ((RabbitMQComponent) component).setMandatory((boolean) value); return true;
            case "publisherAcknowledgements": ((RabbitMQComponent) component).setPublisherAcknowledgements((boolean) value); return true;
            case "publisherAcknowledgementsTimeout": ((RabbitMQComponent) component).setPublisherAcknowledgementsTimeout((long) value); return true;
            case "args": ((RabbitMQComponent) component).setArgs((java.util.Map) value); return true;
            case "autoDetectConnectionFactory": ((RabbitMQComponent) component).setAutoDetectConnectionFactory((boolean) value); return true;
            case "automaticRecoveryEnabled": ((RabbitMQComponent) component).setAutomaticRecoveryEnabled((java.lang.Boolean) value); return true;
            case "basicPropertyBinding": ((RabbitMQComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "clientProperties": ((RabbitMQComponent) component).setClientProperties((java.util.Map) value); return true;
            case "connectionFactoryExceptionHandler": ((RabbitMQComponent) component).setConnectionFactoryExceptionHandler((com.rabbitmq.client.ExceptionHandler) value); return true;
            case "connectionTimeout": ((RabbitMQComponent) component).setConnectionTimeout((int) value); return true;
            case "networkRecoveryInterval": ((RabbitMQComponent) component).setNetworkRecoveryInterval((java.lang.Integer) value); return true;
            case "requestedChannelMax": ((RabbitMQComponent) component).setRequestedChannelMax((int) value); return true;
            case "requestedFrameMax": ((RabbitMQComponent) component).setRequestedFrameMax((int) value); return true;
            case "requestedHeartbeat": ((RabbitMQComponent) component).setRequestedHeartbeat((int) value); return true;
            case "requestTimeout": ((RabbitMQComponent) component).setRequestTimeout((long) value); return true;
            case "requestTimeoutCheckerInterval": ((RabbitMQComponent) component).setRequestTimeoutCheckerInterval((long) value); return true;
            case "topologyRecoveryEnabled": ((RabbitMQComponent) component).setTopologyRecoveryEnabled((java.lang.Boolean) value); return true;
            case "transferException": ((RabbitMQComponent) component).setTransferException((boolean) value); return true;
            case "password": ((RabbitMQComponent) component).setPassword((java.lang.String) value); return true;
            case "sslProtocol": ((RabbitMQComponent) component).setSslProtocol((java.lang.String) value); return true;
            case "trustManager": ((RabbitMQComponent) component).setTrustManager((javax.net.ssl.TrustManager) value); return true;
            case "username": ((RabbitMQComponent) component).setUsername((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}