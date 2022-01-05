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
import org.apache.camel.component.milo.server.MiloServerComponent;

/**
 * Make telemetry data available as an OPC UA server.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface MiloServerComponentBuilderFactory {

    /**
     * OPC UA Server (camel-milo)
     * Make telemetry data available as an OPC UA server.
     * 
     * Category: iot
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-milo
     * 
     * @return the dsl builder
     */
    static MiloServerComponentBuilder miloServer() {
        return new MiloServerComponentBuilderImpl();
    }

    /**
     * Builder for the OPC UA Server component.
     */
    interface MiloServerComponentBuilder
            extends
                ComponentBuilder<MiloServerComponent> {
        /**
         * The application name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param applicationName the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder applicationName(
                java.lang.String applicationName) {
            doSetProperty("applicationName", applicationName);
            return this;
        }
        /**
         * The application URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param applicationUri the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder applicationUri(
                java.lang.String applicationUri) {
            doSetProperty("applicationUri", applicationUri);
            return this;
        }
        /**
         * Set the addresses of the local addresses the server should bind to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param bindAddresses the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder bindAddresses(
                java.lang.String bindAddresses) {
            doSetProperty("bindAddresses", bindAddresses);
            return this;
        }
        /**
         * Server build info.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param buildInfo the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder buildInfo(
                org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo buildInfo) {
            doSetProperty("buildInfo", buildInfo);
            return this;
        }
        /**
         * The URI of the namespace, defaults to
         * &lt;code&gt;urn:org:apache:camel.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: urn:org:apache:camel
         * Group: common
         * 
         * @param namespaceUri the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder namespaceUri(
                java.lang.String namespaceUri) {
            doSetProperty("namespaceUri", namespaceUri);
            return this;
        }
        /**
         * The path to be appended to the end of the endpoint url. (doesn't need
         * to start with '/').
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param path the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder path(java.lang.String path) {
            doSetProperty("path", path);
            return this;
        }
        /**
         * The TCP port the server binds to.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * The product URI.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: common
         * 
         * @param productUri the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder productUri(
                java.lang.String productUri) {
            doSetProperty("productUri", productUri);
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
        default MiloServerComponentBuilder bridgeErrorHandler(
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
        default MiloServerComponentBuilder lazyStartProducer(
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
        default MiloServerComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Server certificate.
         * 
         * The option is a:
         * &lt;code&gt;java.security.cert.X509Certificate&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param certificate the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder certificate(
                java.security.cert.X509Certificate certificate) {
            doSetProperty("certificate", certificate);
            return this;
        }
        /**
         * Server certificate manager.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.security.CertificateManager&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param certificateManager the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder certificateManager(
                org.eclipse.milo.opcua.stack.core.security.CertificateManager certificateManager) {
            doSetProperty("certificateManager", certificateManager);
            return this;
        }
        /**
         * Validator for client certificates.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.security.CertificateValidator&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param certificateValidator the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder certificateValidator(
                org.eclipse.milo.opcua.stack.core.security.CertificateValidator certificateValidator) {
            doSetProperty("certificateValidator", certificateValidator);
            return this;
        }
        /**
         * Validator for client certificates using default file based approach.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param defaultCertificateValidator the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder defaultCertificateValidator(
                java.lang.String defaultCertificateValidator) {
            doSetProperty("defaultCertificateValidator", defaultCertificateValidator);
            return this;
        }
        /**
         * Enable anonymous authentication, disabled by default.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param enableAnonymousAuthentication the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder enableAnonymousAuthentication(
                boolean enableAnonymousAuthentication) {
            doSetProperty("enableAnonymousAuthentication", enableAnonymousAuthentication);
            return this;
        }
        /**
         * Security policies.
         * 
         * The option is a:
         * &lt;code&gt;java.util.Set&lt;org.eclipse.milo.opcua.stack.core.security.SecurityPolicy&gt;&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param securityPolicies the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder securityPolicies(
                java.util.Set<org.eclipse.milo.opcua.stack.core.security.SecurityPolicy> securityPolicies) {
            doSetProperty("securityPolicies", securityPolicies);
            return this;
        }
        /**
         * Security policies by URI or name. Multiple policies can be separated
         * by comma.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param securityPoliciesById the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder securityPoliciesById(
                java.lang.String securityPoliciesById) {
            doSetProperty("securityPoliciesById", securityPoliciesById);
            return this;
        }
        /**
         * Set user password combinations in the form of user1:pwd1,user2:pwd2
         * Usernames and passwords will be URL decoded.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param userAuthenticationCredentials the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder userAuthenticationCredentials(
                java.lang.String userAuthenticationCredentials) {
            doSetProperty("userAuthenticationCredentials", userAuthenticationCredentials);
            return this;
        }
        /**
         * Set the UserTokenPolicy used when.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.milo.opcua.stack.core.security.SecurityPolicy&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param usernameSecurityPolicyUri the value to set
         * @return the dsl builder
         */
        default MiloServerComponentBuilder usernameSecurityPolicyUri(
                org.eclipse.milo.opcua.stack.core.security.SecurityPolicy usernameSecurityPolicyUri) {
            doSetProperty("usernameSecurityPolicyUri", usernameSecurityPolicyUri);
            return this;
        }
    }

    class MiloServerComponentBuilderImpl
            extends
                AbstractComponentBuilder<MiloServerComponent>
            implements
                MiloServerComponentBuilder {
        @Override
        protected MiloServerComponent buildConcreteComponent() {
            return new MiloServerComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "applicationName": ((MiloServerComponent) component).setApplicationName((java.lang.String) value); return true;
            case "applicationUri": ((MiloServerComponent) component).setApplicationUri((java.lang.String) value); return true;
            case "bindAddresses": ((MiloServerComponent) component).setBindAddresses((java.lang.String) value); return true;
            case "buildInfo": ((MiloServerComponent) component).setBuildInfo((org.eclipse.milo.opcua.stack.core.types.structured.BuildInfo) value); return true;
            case "namespaceUri": ((MiloServerComponent) component).setNamespaceUri((java.lang.String) value); return true;
            case "path": ((MiloServerComponent) component).setPath((java.lang.String) value); return true;
            case "port": ((MiloServerComponent) component).setPort((int) value); return true;
            case "productUri": ((MiloServerComponent) component).setProductUri((java.lang.String) value); return true;
            case "bridgeErrorHandler": ((MiloServerComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((MiloServerComponent) component).setLazyStartProducer((boolean) value); return true;
            case "autowiredEnabled": ((MiloServerComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "certificate": ((MiloServerComponent) component).setCertificate((java.security.cert.X509Certificate) value); return true;
            case "certificateManager": ((MiloServerComponent) component).setCertificateManager((org.eclipse.milo.opcua.stack.core.security.CertificateManager) value); return true;
            case "certificateValidator": ((MiloServerComponent) component).setCertificateValidator((org.eclipse.milo.opcua.stack.core.security.CertificateValidator) value); return true;
            case "defaultCertificateValidator": ((MiloServerComponent) component).setDefaultCertificateValidator((java.lang.String) value); return true;
            case "enableAnonymousAuthentication": ((MiloServerComponent) component).setEnableAnonymousAuthentication((boolean) value); return true;
            case "securityPolicies": ((MiloServerComponent) component).setSecurityPolicies((java.util.Set) value); return true;
            case "securityPoliciesById": ((MiloServerComponent) component).setSecurityPoliciesById((java.lang.String) value); return true;
            case "userAuthenticationCredentials": ((MiloServerComponent) component).setUserAuthenticationCredentials((java.lang.String) value); return true;
            case "usernameSecurityPolicyUri": ((MiloServerComponent) component).setUsernameSecurityPolicyUri((org.eclipse.milo.opcua.stack.core.security.SecurityPolicy) value); return true;
            default: return false;
            }
        }
    }
}