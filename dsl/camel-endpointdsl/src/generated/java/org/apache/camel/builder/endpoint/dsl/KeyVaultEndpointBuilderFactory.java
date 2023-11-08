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
import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage secrets and keys in Azure Key Vault Service
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface KeyVaultEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Azure Key Vault component.
     */
    public interface KeyVaultEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedKeyVaultEndpointBuilder advanced() {
            return (AdvancedKeyVaultEndpointBuilder) this;
        }
        /**
         * Operation to be performed.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.azure.key.vault.KeyVaultOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder operation(
                org.apache.camel.component.azure.key.vault.KeyVaultOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Operation to be performed.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.azure.key.vault.KeyVaultOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Instance of Secret client.
         * 
         * The option is a:
         * &lt;code&gt;com.azure.security.keyvault.secrets.SecretClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretClient the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder secretClient(
                com.azure.security.keyvault.secrets.SecretClient secretClient) {
            doSetProperty("secretClient", secretClient);
            return this;
        }
        /**
         * Instance of Secret client.
         * 
         * The option will be converted to a
         * &lt;code&gt;com.azure.security.keyvault.secrets.SecretClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param secretClient the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder secretClient(String secretClient) {
            doSetProperty("secretClient", secretClient);
            return this;
        }
        /**
         * Client Id to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientId the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder clientId(String clientId) {
            doSetProperty("clientId", clientId);
            return this;
        }
        /**
         * Client Secret to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param clientSecret the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder clientSecret(String clientSecret) {
            doSetProperty("clientSecret", clientSecret);
            return this;
        }
        /**
         * Tenant Id to be used.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param tenantId the value to set
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder tenantId(String tenantId) {
            doSetProperty("tenantId", tenantId);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Azure Key Vault component.
     */
    public interface AdvancedKeyVaultEndpointBuilder
            extends
                EndpointProducerBuilder {
        default KeyVaultEndpointBuilder basic() {
            return (KeyVaultEndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKeyVaultEndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedKeyVaultEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface KeyVaultBuilders {
        /**
         * Azure Key Vault (camel-azure-key-vault)
         * Manage secrets and keys in Azure Key Vault Service
         * 
         * Category: cloud,cloud
         * Since: 3.17
         * Maven coordinates: org.apache.camel:camel-azure-key-vault
         * 
         * @return the dsl builder for the headers' name.
         */
        default KeyVaultHeaderNameBuilder azureKeyVault() {
            return KeyVaultHeaderNameBuilder.INSTANCE;
        }
        /**
         * Azure Key Vault (camel-azure-key-vault)
         * Manage secrets and keys in Azure Key Vault Service
         * 
         * Category: cloud,cloud
         * Since: 3.17
         * Maven coordinates: org.apache.camel:camel-azure-key-vault
         * 
         * Syntax: <code>azure-key-vault:vaultName</code>
         * 
         * Path parameter: vaultName
         * Vault Name to be used
         * 
         * @param path vaultName
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder azureKeyVault(String path) {
            return KeyVaultEndpointBuilderFactory.endpointBuilder("azure-key-vault", path);
        }
        /**
         * Azure Key Vault (camel-azure-key-vault)
         * Manage secrets and keys in Azure Key Vault Service
         * 
         * Category: cloud,cloud
         * Since: 3.17
         * Maven coordinates: org.apache.camel:camel-azure-key-vault
         * 
         * Syntax: <code>azure-key-vault:vaultName</code>
         * 
         * Path parameter: vaultName
         * Vault Name to be used
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path vaultName
         * @return the dsl builder
         */
        default KeyVaultEndpointBuilder azureKeyVault(
                String componentName,
                String path) {
            return KeyVaultEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Azure Key Vault component.
     */
    public static class KeyVaultHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final KeyVaultHeaderNameBuilder INSTANCE = new KeyVaultHeaderNameBuilder();

        /**
         * Overrides the desired operation to be used in the producer.
         * 
         * The option is a: {@code
         * org.apache.camel.component.azure.key.vault.KeyVaultOperationDefinition} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AzureKeyVaultProducerOperation}.
         */
        public String azureKeyVaultProducerOperation() {
            return "CamelAzureKeyVaultProducerOperation";
        }

        /**
         * The secret name to be used in Key Vault.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AzureKeyVaultSecretName}.
         */
        public String azureKeyVaultSecretName() {
            return "CamelAzureKeyVaultSecretName";
        }
    }
    static KeyVaultEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class KeyVaultEndpointBuilderImpl extends AbstractEndpointBuilder implements KeyVaultEndpointBuilder, AdvancedKeyVaultEndpointBuilder {
            public KeyVaultEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new KeyVaultEndpointBuilderImpl(path);
    }
}