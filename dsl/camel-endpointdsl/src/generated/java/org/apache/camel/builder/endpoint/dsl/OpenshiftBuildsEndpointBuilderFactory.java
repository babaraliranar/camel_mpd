/* Generated by camel build tools - do NOT edit this file! */
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
package org.apache.camel.builder.endpoint.dsl;

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Perform operations on OpenShift Builds.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface OpenshiftBuildsEndpointBuilderFactory {

    /**
     * Builder for endpoint for the OpenShift Builds component.
     */
    public interface OpenshiftBuildsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedOpenshiftBuildsEndpointBuilder advanced() {
            return (AdvancedOpenshiftBuildsEndpointBuilder) this;
        }

        /**
         * The Kubernetes API Version to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param apiVersion the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder apiVersion(String apiVersion) {
            doSetProperty("apiVersion", apiVersion);
            return this;
        }
        /**
         * The dns domain, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param dnsDomain the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder dnsDomain(String dnsDomain) {
            doSetProperty("dnsDomain", dnsDomain);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option is a:
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         * 
         * @param kubernetesClient the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder kubernetesClient(io.fabric8.kubernetes.client.KubernetesClient kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * Default KubernetesClient to use if provided.
         * 
         * The option will be converted to a
         * <code>io.fabric8.kubernetes.client.KubernetesClient</code> type.
         * 
         * Group: producer
         * 
         * @param kubernetesClient the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder kubernetesClient(String kubernetesClient) {
            doSetProperty("kubernetesClient", kubernetesClient);
            return this;
        }
        /**
         * The namespace.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param namespace the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder namespace(String namespace) {
            doSetProperty("namespace", namespace);
            return this;
        }
        /**
         * Producer operation to do on Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The port name, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         * 
         * @param portName the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder portName(String portName) {
            doSetProperty("portName", portName);
            return this;
        }
        /**
         * The port protocol, used for ServiceCall EIP.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: tcp
         * Group: producer
         * 
         * @param portProtocol the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder portProtocol(String portProtocol) {
            doSetProperty("portProtocol", portProtocol);
            return this;
        }
        /**
         * The CA Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param caCertData the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder caCertData(String caCertData) {
            doSetProperty("caCertData", caCertData);
            return this;
        }
        /**
         * The CA Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param caCertFile the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder caCertFile(String caCertFile) {
            doSetProperty("caCertFile", caCertFile);
            return this;
        }
        /**
         * The Client Cert Data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientCertData the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientCertData(String clientCertData) {
            doSetProperty("clientCertData", clientCertData);
            return this;
        }
        /**
         * The Client Cert File.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientCertFile the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientCertFile(String clientCertFile) {
            doSetProperty("clientCertFile", clientCertFile);
            return this;
        }
        /**
         * The Key Algorithm used by the client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientKeyAlgo the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientKeyAlgo(String clientKeyAlgo) {
            doSetProperty("clientKeyAlgo", clientKeyAlgo);
            return this;
        }
        /**
         * The Client Key data.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientKeyData the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientKeyData(String clientKeyData) {
            doSetProperty("clientKeyData", clientKeyData);
            return this;
        }
        /**
         * The Client Key file.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientKeyFile the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientKeyFile(String clientKeyFile) {
            doSetProperty("clientKeyFile", clientKeyFile);
            return this;
        }
        /**
         * The Client Key Passphrase.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param clientKeyPassphrase the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder clientKeyPassphrase(String clientKeyPassphrase) {
            doSetProperty("clientKeyPassphrase", clientKeyPassphrase);
            return this;
        }
        /**
         * The Auth Token.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param oauthToken the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder oauthToken(String oauthToken) {
            doSetProperty("oauthToken", oauthToken);
            return this;
        }
        /**
         * Password to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option is a: <code>java.lang.Boolean</code> type.
         * 
         * Group: security
         * 
         * @param trustCerts the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder trustCerts(Boolean trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Define if the certs we used are trusted anyway or not.
         * 
         * The option will be converted to a <code>java.lang.Boolean</code>
         * type.
         * 
         * Group: security
         * 
         * @param trustCerts the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder trustCerts(String trustCerts) {
            doSetProperty("trustCerts", trustCerts);
            return this;
        }
        /**
         * Username to connect to Kubernetes.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         * 
         * @param username the value to set
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder username(String username) {
            doSetProperty("username", username);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the OpenShift Builds component.
     */
    public interface AdvancedOpenshiftBuildsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default OpenshiftBuildsEndpointBuilder basic() {
            return (OpenshiftBuildsEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedOpenshiftBuildsEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedOpenshiftBuildsEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: advanced
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedOpenshiftBuildsEndpointBuilder connectionTimeout(Integer connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in milliseconds to use when making requests to the
         * Kubernetes API server.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: advanced
         * 
         * @param connectionTimeout the value to set
         * @return the dsl builder
         */
        default AdvancedOpenshiftBuildsEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
    }

    public interface OpenshiftBuildsBuilders {
        /**
         * OpenShift Builds (camel-kubernetes)
         * Perform operations on OpenShift Builds.
         * 
         * Category: container,cloud
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * @return the dsl builder for the headers' name.
         */
        default OpenshiftBuildsHeaderNameBuilder openshiftBuilds() {
            return OpenshiftBuildsHeaderNameBuilder.INSTANCE;
        }
        /**
         * OpenShift Builds (camel-kubernetes)
         * Perform operations on OpenShift Builds.
         * 
         * Category: container,cloud
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>openshift-builds:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * URL to a remote Kubernetes API server. This should only be used when
         * your Camel application is connecting from outside Kubernetes. If you
         * run your Camel application inside Kubernetes, then you can use local
         * or client as the URL to tell Camel to run in local mode. If you
         * connect remotely to Kubernetes, then you may also need some of the
         * many other configuration options for secured connection with
         * certificates, etc.
         * 
         * @param path masterUrl
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder openshiftBuilds(String path) {
            return OpenshiftBuildsEndpointBuilderFactory.endpointBuilder("openshift-builds", path);
        }
        /**
         * OpenShift Builds (camel-kubernetes)
         * Perform operations on OpenShift Builds.
         * 
         * Category: container,cloud
         * Since: 2.17
         * Maven coordinates: org.apache.camel:camel-kubernetes
         * 
         * Syntax: <code>openshift-builds:masterUrl</code>
         * 
         * Path parameter: masterUrl (required)
         * URL to a remote Kubernetes API server. This should only be used when
         * your Camel application is connecting from outside Kubernetes. If you
         * run your Camel application inside Kubernetes, then you can use local
         * or client as the URL to tell Camel to run in local mode. If you
         * connect remotely to Kubernetes, then you may also need some of the
         * many other configuration options for secured connection with
         * certificates, etc.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path masterUrl
         * @return the dsl builder
         */
        default OpenshiftBuildsEndpointBuilder openshiftBuilds(String componentName, String path) {
            return OpenshiftBuildsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }

    }
    /**
     * The builder of headers' name for the OpenShift Builds component.
     */
    public static class OpenshiftBuildsHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final OpenshiftBuildsHeaderNameBuilder INSTANCE = new OpenshiftBuildsHeaderNameBuilder();

        /**
         * The Producer operation.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesOperation}.
         */
        public String kubernetesOperation() {
            return "CamelKubernetesOperation";
        }
        /**
         * The namespace name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesNamespaceName}.
         */
        public String kubernetesNamespaceName() {
            return "CamelKubernetesNamespaceName";
        }
        /**
         * The OpenShift build labels.
         * 
         * The option is a: {@code Map<String, String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesBuildsLabels}.
         */
        public String kubernetesBuildsLabels() {
            return "CamelKubernetesBuildsLabels";
        }
        /**
         * The OpenShift build name.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code KubernetesBuildName}.
         */
        public String kubernetesBuildName() {
            return "CamelKubernetesBuildName";
        }
    }
    static OpenshiftBuildsEndpointBuilder endpointBuilder(String componentName, String path) {
        class OpenshiftBuildsEndpointBuilderImpl extends AbstractEndpointBuilder implements OpenshiftBuildsEndpointBuilder, AdvancedOpenshiftBuildsEndpointBuilder {
            public OpenshiftBuildsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new OpenshiftBuildsEndpointBuilderImpl(path);
    }
}