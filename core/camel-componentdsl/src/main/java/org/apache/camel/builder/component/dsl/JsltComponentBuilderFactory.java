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
import org.apache.camel.component.jslt.JsltComponent;

/**
 * The jslt component allows you to process a JSON messages using an JSLT
 * transformations.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JsltComponentBuilderFactory {

    /**
     * JSLT (camel-jslt)
     * The jslt component allows you to process a JSON messages using an JSLT
     * transformations.
     * 
     * Category: transformation
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-jslt
     */
    static JsltComponentBuilder jslt() {
        return new JsltComponentBuilderImpl();
    }

    /**
     * Builder for the JSLT component.
     */
    interface JsltComponentBuilder extends ComponentBuilder<JsltComponent> {
        /**
         * JSLT can be extended by plugging in functions written in Java.
         * 
         * The option is a:
         * <code>java.util.Collection<com.schibsted.spt.data.jslt.Function></code> type.
         * 
         * Default:
         * Group: advanced
         */
        default JsltComponentBuilder setFunctions(
                java.util.Collection<com.schibsted.spt.data.jslt.Function> functions) {
            doSetProperty("functions", functions);
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
        default JsltComponentBuilder setBasicPropertyBinding(
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
        default JsltComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class JsltComponentBuilderImpl
            extends
                AbstractComponentBuilder<JsltComponent>
            implements
                JsltComponentBuilder {
        @Override
        protected JsltComponent buildConcreteComponent() {
            return new JsltComponent();
        }
    }
}