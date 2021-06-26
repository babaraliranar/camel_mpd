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
import org.apache.camel.component.aws2.ddb.Ddb2Component;

/**
 * Store and retrieve data from AWS DynamoDB service using AWS SDK version 2.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface Aws2DdbComponentBuilderFactory {

    /**
     * AWS DynamoDB (camel-aws2-ddb)
     * Store and retrieve data from AWS DynamoDB service using AWS SDK version
     * 2.x.
     * 
     * Category: cloud,database,nosql
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-ddb
     * 
     * @return the dsl builder
     */
    static Aws2DdbComponentBuilder aws2Ddb() {
        return new Aws2DdbComponentBuilderImpl();
    }

    /**
     * Builder for the AWS DynamoDB component.
     */
    interface Aws2DdbComponentBuilder extends ComponentBuilder<Ddb2Component> {
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.dynamodb.DynamoDbClient&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param amazonDDBClient the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder amazonDDBClient(
                software.amazon.awssdk.services.dynamodb.DynamoDbClient amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * The component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ddb.Ddb2Configuration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder configuration(
                org.apache.camel.component.aws2.ddb.Ddb2Configuration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param consistentRead the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder consistentRead(boolean consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Attribute name when creating table.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyAttributeName the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder keyAttributeName(
                java.lang.String keyAttributeName) {
            doSetProperty("keyAttributeName", keyAttributeName);
            return this;
        }
        /**
         * Attribute type when creating table.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyAttributeType the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder keyAttributeType(
                java.lang.String keyAttributeType) {
            doSetProperty("keyAttributeType", keyAttributeType);
            return this;
        }
        /**
         * The key scalar type, it can be S (String), N (Number) and B (Bytes).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyScalarType the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder keyScalarType(
                java.lang.String keyScalarType) {
            doSetProperty("keyScalarType", keyScalarType);
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
        default Aws2DdbComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.ddb.Ddb2Operations&lt;/code&gt; type.
         * 
         * Default: PutItem
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder operation(
                org.apache.camel.component.aws2.ddb.Ddb2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDB client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The region in which DynamoDB client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: producer
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param readCapacity the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder readCapacity(java.lang.Long readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The region in which DDB client needs to work.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder region(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder uriEndpointOverride(
                java.lang.String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the S3 client should expect to load credentials through a
         * default credentials provider or to expect static credentials to be
         * passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param writeCapacity the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder writeCapacity(
                java.lang.Long writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
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
        default Aws2DdbComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder accessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default Aws2DdbComponentBuilder secretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    class Aws2DdbComponentBuilderImpl
            extends
                AbstractComponentBuilder<Ddb2Component>
            implements
                Aws2DdbComponentBuilder {
        @Override
        protected Ddb2Component buildConcreteComponent() {
            return new Ddb2Component();
        }
        private org.apache.camel.component.aws2.ddb.Ddb2Configuration getOrCreateConfiguration(
                org.apache.camel.component.aws2.ddb.Ddb2Component component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.aws2.ddb.Ddb2Configuration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "amazonDDBClient": getOrCreateConfiguration((Ddb2Component) component).setAmazonDDBClient((software.amazon.awssdk.services.dynamodb.DynamoDbClient) value); return true;
            case "configuration": ((Ddb2Component) component).setConfiguration((org.apache.camel.component.aws2.ddb.Ddb2Configuration) value); return true;
            case "consistentRead": getOrCreateConfiguration((Ddb2Component) component).setConsistentRead((boolean) value); return true;
            case "keyAttributeName": getOrCreateConfiguration((Ddb2Component) component).setKeyAttributeName((java.lang.String) value); return true;
            case "keyAttributeType": getOrCreateConfiguration((Ddb2Component) component).setKeyAttributeType((java.lang.String) value); return true;
            case "keyScalarType": getOrCreateConfiguration((Ddb2Component) component).setKeyScalarType((java.lang.String) value); return true;
            case "lazyStartProducer": ((Ddb2Component) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((Ddb2Component) component).setOperation((org.apache.camel.component.aws2.ddb.Ddb2Operations) value); return true;
            case "overrideEndpoint": getOrCreateConfiguration((Ddb2Component) component).setOverrideEndpoint((boolean) value); return true;
            case "proxyHost": getOrCreateConfiguration((Ddb2Component) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": getOrCreateConfiguration((Ddb2Component) component).setProxyPort((java.lang.Integer) value); return true;
            case "proxyProtocol": getOrCreateConfiguration((Ddb2Component) component).setProxyProtocol((software.amazon.awssdk.core.Protocol) value); return true;
            case "readCapacity": getOrCreateConfiguration((Ddb2Component) component).setReadCapacity((java.lang.Long) value); return true;
            case "region": getOrCreateConfiguration((Ddb2Component) component).setRegion((java.lang.String) value); return true;
            case "trustAllCertificates": getOrCreateConfiguration((Ddb2Component) component).setTrustAllCertificates((boolean) value); return true;
            case "uriEndpointOverride": getOrCreateConfiguration((Ddb2Component) component).setUriEndpointOverride((java.lang.String) value); return true;
            case "useDefaultCredentialsProvider": getOrCreateConfiguration((Ddb2Component) component).setUseDefaultCredentialsProvider((boolean) value); return true;
            case "writeCapacity": getOrCreateConfiguration((Ddb2Component) component).setWriteCapacity((java.lang.Long) value); return true;
            case "autowiredEnabled": ((Ddb2Component) component).setAutowiredEnabled((boolean) value); return true;
            case "accessKey": getOrCreateConfiguration((Ddb2Component) component).setAccessKey((java.lang.String) value); return true;
            case "secretKey": getOrCreateConfiguration((Ddb2Component) component).setSecretKey((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}