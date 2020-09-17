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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Store and retrieve data from AWS DynamoDB service using AWS SDK version 2.x.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Ddb2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 DynamoDB component.
     */
    public interface Ddb2EndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDdb2EndpointBuilder advanced() {
            return (AdvancedDdb2EndpointBuilder) this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.dynamodb.DynamoDbClient</code>
         * type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder amazonDDBClient(Object amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * To use the AmazonDynamoDB as the client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.dynamodb.DynamoDbClient</code>
         * type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder amazonDDBClient(String amazonDDBClient) {
            doSetProperty("amazonDDBClient", amazonDDBClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Ddb2EndpointBuilder autoDiscoverClient(
                boolean autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Setting the autoDiscoverClient mechanism, if true, the component will
         * look for a client instance in the registry automatically otherwise it
         * will skip that checking.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: common
         */
        default Ddb2EndpointBuilder autoDiscoverClient(String autoDiscoverClient) {
            doSetProperty("autoDiscoverClient", autoDiscoverClient);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Ddb2EndpointBuilder consistentRead(boolean consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Determines whether or not strong consistency should be enforced when
         * data is read.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Ddb2EndpointBuilder consistentRead(String consistentRead) {
            doSetProperty("consistentRead", consistentRead);
            return this;
        }
        /**
         * Attribute name when creating table.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder keyAttributeName(String keyAttributeName) {
            doSetProperty("keyAttributeName", keyAttributeName);
            return this;
        }
        /**
         * Attribute type when creating table.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder keyAttributeType(String keyAttributeType) {
            doSetProperty("keyAttributeType", keyAttributeType);
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
        default Ddb2EndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * Group: producer
         */
        default Ddb2EndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.ddb.Ddb2Operations</code> type.
         * 
         * Default: put-item
         * Group: producer
         */
        default Ddb2EndpointBuilder operation(Ddb2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * What operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.ddb.Ddb2Operations</code> type.
         * 
         * Default: put-item
         * Group: producer
         */
        default Ddb2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the DDB client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * The region in which DynamoDB client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * The region in which DynamoDB client needs to work. When using this
         * parameter, the configuration will expect the lowercase name of the
         * region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Ddb2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the DDB client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Ddb2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder readCapacity(Long readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserve for reading resources from your
         * table.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder readCapacity(String readCapacity) {
            doSetProperty("readCapacity", readCapacity);
            return this;
        }
        /**
         * The region in which DDB client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Ddb2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Ddb2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option is a: <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder writeCapacity(Long writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * The provisioned throughput to reserved for writing resources to your
         * table.
         * 
         * The option will be converted to a <code>java.lang.Long</code> type.
         * 
         * Group: producer
         */
        default Ddb2EndpointBuilder writeCapacity(String writeCapacity) {
            doSetProperty("writeCapacity", writeCapacity);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Ddb2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default Ddb2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 DynamoDB component.
     */
    public interface AdvancedDdb2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Ddb2EndpointBuilder basic() {
            return (Ddb2EndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdb2EndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdb2EndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdb2EndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedDdb2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.ddb.Ddb2Operations</code> enum.
     */
    enum Ddb2Operations {
        BatchGetItems,
        DeleteItem,
        DeleteTable,
        DescribeTable,
        GetItem,
        PutItem,
        Query,
        Scan,
        UpdateItem,
        UpdateTable;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        HTTP,
        HTTPS;
    }

    public interface Ddb2Builders {
        /**
         * AWS 2 DynamoDB (camel-aws2-ddb)
         * Store and retrieve data from AWS DynamoDB service using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,database,nosql
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ddb
         * 
         * Syntax: <code>aws2-ddb:tableName</code>
         * 
         * Path parameter: tableName (required)
         * The name of the table currently worked with.
         * 
         * @param path tableName
         */
        default Ddb2EndpointBuilder aws2Ddb(String path) {
            return Ddb2EndpointBuilderFactory.endpointBuilder("aws2-ddb", path);
        }
        /**
         * AWS 2 DynamoDB (camel-aws2-ddb)
         * Store and retrieve data from AWS DynamoDB service using AWS SDK
         * version 2.x.
         * 
         * Category: cloud,database,nosql
         * Since: 3.1
         * Maven coordinates: org.apache.camel:camel-aws2-ddb
         * 
         * Syntax: <code>aws2-ddb:tableName</code>
         * 
         * Path parameter: tableName (required)
         * The name of the table currently worked with.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path tableName
         */
        default Ddb2EndpointBuilder aws2Ddb(String componentName, String path) {
            return Ddb2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static Ddb2EndpointBuilder endpointBuilder(String componentName, String path) {
        class Ddb2EndpointBuilderImpl extends AbstractEndpointBuilder implements Ddb2EndpointBuilder, AdvancedDdb2EndpointBuilder {
            public Ddb2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new Ddb2EndpointBuilderImpl(path);
    }
}