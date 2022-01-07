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
import org.apache.camel.component.jclouds.JcloudsComponent;

/**
 * Interact with jclouds compute and blobstore service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JcloudsComponentBuilderFactory {

    /**
     * JClouds (camel-jclouds)
     * Interact with jclouds compute and blobstore service.
     * 
     * Category: api,cloud,compute
     * Since: 2.9
     * Maven coordinates: org.apache.camel:camel-jclouds
     * 
     * @return the dsl builder
     */
    static JcloudsComponentBuilder jclouds() {
        return new JcloudsComponentBuilderImpl();
    }

    /**
     * Builder for the JClouds component.
     */
    interface JcloudsComponentBuilder
            extends
                ComponentBuilder<JcloudsComponent> {
        /**
         * To use the given BlobStore which must be configured when using
         * blobstore.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&amp;lt;org.jclouds.blobstore.BlobStore&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param blobStores the value to set
         * @return the dsl builder
         */
        default JcloudsComponentBuilder blobStores(
                java.util.List<org.jclouds.blobstore.BlobStore> blobStores) {
            doSetProperty("blobStores", blobStores);
            return this;
        }
        /**
         * To use the given ComputeService which must be configured when use
         * compute.
         * 
         * The option is a:
         * &lt;code&gt;java.util.List&amp;lt;org.jclouds.compute.ComputeService&amp;gt;&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param computeServices the value to set
         * @return the dsl builder
         */
        default JcloudsComponentBuilder computeServices(
                java.util.List<org.jclouds.compute.ComputeService> computeServices) {
            doSetProperty("computeServices", computeServices);
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
        default JcloudsComponentBuilder bridgeErrorHandler(
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
        default JcloudsComponentBuilder lazyStartProducer(
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
        default JcloudsComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
    }

    class JcloudsComponentBuilderImpl
            extends
                AbstractComponentBuilder<JcloudsComponent>
            implements
                JcloudsComponentBuilder {
        @Override
        protected JcloudsComponent buildConcreteComponent() {
            return new JcloudsComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "blobStores": ((JcloudsComponent) component).setBlobStores((java.util.List) value); return true;
            case "computeServices": ((JcloudsComponent) component).setComputeServices((java.util.List) value); return true;
            case "bridgeErrorHandler": ((JcloudsComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((JcloudsComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((JcloudsComponent) component).setAutowiredEnabled((boolean) value); return true;
            default: return false;
            }
        }
    }
}