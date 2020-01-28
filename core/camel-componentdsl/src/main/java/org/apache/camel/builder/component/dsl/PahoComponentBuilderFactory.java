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
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.paho.PahoComponent;

/**
 * Component for communicating with MQTT message brokers using Eclipse Paho MQTT
 * Client.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface PahoComponentBuilderFactory {

    /**
     * Paho (camel-paho)
     * Component for communicating with MQTT message brokers using Eclipse Paho
     * MQTT Client.
     * 
     * Category: messaging,iot
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-paho
     */
    static PahoComponentBuilder paho() {
        return new PahoComponentBuilderImpl();
    }

    /**
     * Builder for the Paho component.
     */
    interface PahoComponentBuilder extends ComponentBuilder<PahoComponent> {
        /**
         * To use the shared Paho configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.paho.PahoConfiguration</code> type.
         * 
         * Default:
         * Group: common
         */
        default PahoComponentBuilder setConfiguration(
                org.apache.camel.component.paho.PahoConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * To use a shared Paho client.
         * 
         * The option is a:
         * <code>org.eclipse.paho.client.mqttv3.MqttClient</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default PahoComponentBuilder setClient(
                org.eclipse.paho.client.mqttv3.MqttClient client) {
            doSetProperty("client", client);
            return this;
        }
        /**
         * The URL of the MQTT broker.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default PahoComponentBuilder setBrokerUrl(java.lang.String brokerUrl) {
            doSetProperty("brokerUrl", brokerUrl);
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
        default PahoComponentBuilder setBasicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
        default PahoComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
        default PahoComponentBuilder setBridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class PahoComponentBuilderImpl
            extends
                AbstractComponentBuilder<PahoComponent>
            implements
                PahoComponentBuilder {
        @Override
        protected PahoComponent buildConcreteComponent() {
            return new PahoComponent();
        }
    }
}