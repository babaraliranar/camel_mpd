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
import org.apache.camel.component.servlet.ServletComponent;

/**
 * To use a HTTP Servlet as entry for Camel routes when running in a servlet
 * container.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ServletComponentBuilderFactory {

    /**
     * Servlet (camel-servlet)
     * To use a HTTP Servlet as entry for Camel routes when running in a servlet
     * container.
     * 
     * Category: http
     * Since: 2.0
     * Maven coordinates: org.apache.camel:camel-servlet
     */
    static ServletComponentBuilder servlet() {
        return new ServletComponentBuilderImpl();
    }

    /**
     * Builder for the Servlet component.
     */
    interface ServletComponentBuilder
            extends
                ComponentBuilder<ServletComponent> {
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
        default ServletComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Default name of servlet to use. The default name is CamelServlet.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: CamelServlet
         * Group: consumer
         */
        default ServletComponentBuilder servletName(java.lang.String servletName) {
            doSetProperty("servletName", servletName);
            return this;
        }
        /**
         * Whether to automatic bind multipart/form-data as attachments on the
         * Camel Exchange. The options attachmentMultipartBinding=true and
         * disableStreamCache=false cannot work together. Remove
         * disableStreamCache to use AttachmentMultipartBinding. This is turn
         * off by default as this may require servlet specific configuration to
         * enable this when using Servlet's.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer (advanced)
         */
        default ServletComponentBuilder attachmentMultipartBinding(
                boolean attachmentMultipartBinding) {
            doSetProperty("attachmentMultipartBinding", attachmentMultipartBinding);
            return this;
        }
        /**
         * Whitelist of accepted filename extensions for accepting uploaded
         * files. Multiple extensions can be separated by comma, such as
         * txt,xml.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: consumer (advanced)
         */
        default ServletComponentBuilder fileNameExtWhitelist(
                java.lang.String fileNameExtWhitelist) {
            doSetProperty("fileNameExtWhitelist", fileNameExtWhitelist);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.servlet.HttpRegistry.
         * 
         * The option is a:
         * <code>org.apache.camel.component.servlet.HttpRegistry</code> type.
         * 
         * Group: consumer (advanced)
         */
        default ServletComponentBuilder httpRegistry(
                org.apache.camel.component.servlet.HttpRegistry httpRegistry) {
            doSetProperty("httpRegistry", httpRegistry);
            return this;
        }
        /**
         * Whether to allow java serialization when a request uses
         * context-type=application/x-java-serialized-object. This is by default
         * turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default ServletComponentBuilder allowJavaSerializedObject(
                boolean allowJavaSerializedObject) {
            doSetProperty("allowJavaSerializedObject", allowJavaSerializedObject);
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
        default ServletComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use a custom HttpBinding to control the mapping between Camel
         * message and HttpClient.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpBinding</code> type.
         * 
         * Group: advanced
         */
        default ServletComponentBuilder httpBinding(
                org.apache.camel.http.common.HttpBinding httpBinding) {
            doSetProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * To use the shared HttpConfiguration as base configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.http.common.HttpConfiguration</code> type.
         * 
         * Group: advanced
         */
        default ServletComponentBuilder httpConfiguration(
                org.apache.camel.http.common.HttpConfiguration httpConfiguration) {
            doSetProperty("httpConfiguration", httpConfiguration);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * <code>org.apache.camel.spi.HeaderFilterStrategy</code> type.
         * 
         * Group: filter
         */
        default ServletComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
    }

    class ServletComponentBuilderImpl
            extends
                AbstractComponentBuilder<ServletComponent>
            implements
                ServletComponentBuilder {
        @Override
        protected ServletComponent buildConcreteComponent() {
            return new ServletComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((ServletComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "servletName": ((ServletComponent) component).setServletName((java.lang.String) value); return true;
            case "attachmentMultipartBinding": ((ServletComponent) component).setAttachmentMultipartBinding((boolean) value); return true;
            case "fileNameExtWhitelist": ((ServletComponent) component).setFileNameExtWhitelist((java.lang.String) value); return true;
            case "httpRegistry": ((ServletComponent) component).setHttpRegistry((org.apache.camel.component.servlet.HttpRegistry) value); return true;
            case "allowJavaSerializedObject": ((ServletComponent) component).setAllowJavaSerializedObject((boolean) value); return true;
            case "basicPropertyBinding": ((ServletComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "httpBinding": ((ServletComponent) component).setHttpBinding((org.apache.camel.http.common.HttpBinding) value); return true;
            case "httpConfiguration": ((ServletComponent) component).setHttpConfiguration((org.apache.camel.http.common.HttpConfiguration) value); return true;
            case "headerFilterStrategy": ((ServletComponent) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            default: return false;
            }
        }
    }
}