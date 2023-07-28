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
import org.apache.camel.component.jpa.JpaComponent;

/**
 * Store and retrieve Java objects from databases using Java Persistence API
 * (JPA).
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JpaComponentBuilderFactory {

    /**
     * JPA (camel-jpa)
     * Store and retrieve Java objects from databases using Java Persistence API
     * (JPA).
     * 
     * Category: database
     * Since: 1.0
     * Maven coordinates: org.apache.camel:camel-jpa
     * 
     * @return the dsl builder
     */
    static JpaComponentBuilder jpa() {
        return new JpaComponentBuilderImpl();
    }

    /**
     * Builder for the JPA component.
     */
    interface JpaComponentBuilder extends ComponentBuilder<JpaComponent> {
        /**
         * Maps an alias to a JPA entity class. The alias can then be used in
         * the endpoint URI (instead of the fully qualified class name).
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Class&amp;lt;java.lang.Object&amp;gt;&amp;gt;&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param aliases the value to set
         * @return the dsl builder
         */
        default JpaComponentBuilder aliases(
                java.util.Map<java.lang.String, java.lang.Class<java.lang.Object>> aliases) {
            doSetProperty("aliases", aliases);
            return this;
        }
        /**
         * To use the EntityManagerFactory. This is strongly recommended to
         * configure.
         * 
         * The option is a:
         * &lt;code&gt;jakarta.persistence.EntityManagerFactory&lt;/code&gt;
         * type.
         * 
         * Group: common
         * 
         * @param entityManagerFactory the value to set
         * @return the dsl builder
         */
        default JpaComponentBuilder entityManagerFactory(
                jakarta.persistence.EntityManagerFactory entityManagerFactory) {
            doSetProperty("entityManagerFactory", entityManagerFactory);
            return this;
        }
        /**
         * The camel-jpa component will join transaction by default. You can use
         * this option to turn this off, for example if you use LOCAL_RESOURCE
         * and join transaction doesn't work with your JPA provider. This option
         * can also be set globally on the JpaComponent, instead of having to
         * set it on all endpoints.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: common
         * 
         * @param joinTransaction the value to set
         * @return the dsl builder
         */
        default JpaComponentBuilder joinTransaction(boolean joinTransaction) {
            doSetProperty("joinTransaction", joinTransaction);
            return this;
        }
        /**
         * Whether to use Spring's SharedEntityManager for the
         * consumer/producer. Note in most cases joinTransaction should be set
         * to false as this is not an EXTENDED EntityManager.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: common
         * 
         * @param sharedEntityManager the value to set
         * @return the dsl builder
         */
        default JpaComponentBuilder sharedEntityManager(
                boolean sharedEntityManager) {
            doSetProperty("sharedEntityManager", sharedEntityManager);
            return this;
        }
        /**
         * To use the PlatformTransactionManager for managing transactions.
         * 
         * The option is a:
         * &lt;code&gt;org.springframework.transaction.PlatformTransactionManager&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transactionManager the value to set
         * @return the dsl builder
         */
        @Deprecated
        default JpaComponentBuilder transactionManager(
                org.springframework.transaction.PlatformTransactionManager transactionManager) {
            doSetProperty("transactionManager", transactionManager);
            return this;
        }
        /**
         * To use the TransactionStrategy for running the operations in a
         * transaction.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jpa.TransactionStrategy&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param transactionStrategy the value to set
         * @return the dsl builder
         */
        default JpaComponentBuilder transactionStrategy(
                org.apache.camel.component.jpa.TransactionStrategy transactionStrategy) {
            doSetProperty("transactionStrategy", transactionStrategy);
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
        default JpaComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
        default JpaComponentBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default JpaComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
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
        default JpaComponentBuilder healthCheckConsumerEnabled(
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
        default JpaComponentBuilder healthCheckProducerEnabled(
                boolean healthCheckProducerEnabled) {
            doSetProperty("healthCheckProducerEnabled", healthCheckProducerEnabled);
            return this;
        }
    }

    class JpaComponentBuilderImpl
            extends
                AbstractComponentBuilder<JpaComponent>
            implements
                JpaComponentBuilder {
        @Override
        protected JpaComponent buildConcreteComponent() {
            return new JpaComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "aliases": ((JpaComponent) component).setAliases((java.util.Map) value); return true;
            case "entityManagerFactory": ((JpaComponent) component).setEntityManagerFactory((jakarta.persistence.EntityManagerFactory) value); return true;
            case "joinTransaction": ((JpaComponent) component).setJoinTransaction((boolean) value); return true;
            case "sharedEntityManager": ((JpaComponent) component).setSharedEntityManager((boolean) value); return true;
            case "transactionManager": ((JpaComponent) component).setTransactionManager((org.springframework.transaction.PlatformTransactionManager) value); return true;
            case "transactionStrategy": ((JpaComponent) component).setTransactionStrategy((org.apache.camel.component.jpa.TransactionStrategy) value); return true;
            case "bridgeErrorHandler": ((JpaComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((JpaComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((JpaComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "healthCheckConsumerEnabled": ((JpaComponent) component).setHealthCheckConsumerEnabled((boolean) value); return true;
            case "healthCheckProducerEnabled": ((JpaComponent) component).setHealthCheckProducerEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}