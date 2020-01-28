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
import org.apache.camel.component.jt400.Jt400Component;

/**
 * The jt400 component allows you to exchanges messages with an AS/400 system
 * using data queues or program call.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Jt400ComponentBuilderFactory {

    /**
     * JT400 (camel-jt400)
     * The jt400 component allows you to exchanges messages with an AS/400
     * system using data queues or program call.
     * 
     * Category: messaging
     * Since: 1.5
     * Maven coordinates: org.apache.camel:camel-jt400
     */
    static Jt400ComponentBuilder jt400() {
        return new Jt400ComponentBuilderImpl();
    }

    /**
     * Builder for the JT400 component.
     */
    interface Jt400ComponentBuilder extends ComponentBuilder<Jt400Component> {
        /**
         * Returns the default connection pool used by this component.
         * 
         * The option is a:
         * <code>com.ibm.as400.access.AS400ConnectionPool</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default Jt400ComponentBuilder setConnectionPool(
                com.ibm.as400.access.AS400ConnectionPool connectionPool) {
            doSetProperty("connectionPool", connectionPool);
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
        default Jt400ComponentBuilder setBasicPropertyBinding(
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
        default Jt400ComponentBuilder setLazyStartProducer(
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
        default Jt400ComponentBuilder setBridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class Jt400ComponentBuilderImpl
            extends
                AbstractComponentBuilder<Jt400Component>
            implements
                Jt400ComponentBuilder {
        @Override
        protected Jt400Component buildConcreteComponent() {
            return new Jt400Component();
        }
    }
}