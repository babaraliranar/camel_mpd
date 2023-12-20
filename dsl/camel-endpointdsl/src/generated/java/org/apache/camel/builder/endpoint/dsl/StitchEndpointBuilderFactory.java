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
 * Stitch is a cloud ETL service that integrates various data sources into a
 * central data warehouse through various integrations.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StitchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Stitch component.
     */
    public interface StitchEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedStitchEndpointBuilder advanced() {
            return (AdvancedStitchEndpointBuilder) this;
        }
        /**
         * A collection of comma separated strings representing the Primary Key
         * fields in the source table. Stitch use these Primary Keys to de-dupe
         * data during loading If not provided, the table will be loaded in an
         * append-only manner.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param keyNames the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder keyNames(String keyNames) {
            doSetProperty("keyNames", keyNames);
            return this;
        }
        /**
         * Stitch account region, e.g: europe.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchRegion&lt;/code&gt; type.
         * 
         * Default: EUROPE
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder region(
                org.apache.camel.component.stitch.client.StitchRegion region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Stitch account region, e.g: europe.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchRegion&lt;/code&gt; type.
         * 
         * Default: EUROPE
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * A schema that describes the record(s).
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.models.StitchSchema&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param stitchSchema the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder stitchSchema(
                org.apache.camel.component.stitch.client.models.StitchSchema stitchSchema) {
            doSetProperty("stitchSchema", stitchSchema);
            return this;
        }
        /**
         * A schema that describes the record(s).
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.stitch.client.models.StitchSchema&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param stitchSchema the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder stitchSchema(String stitchSchema) {
            doSetProperty("stitchSchema", stitchSchema);
            return this;
        }
        /**
         * Stitch access token for the Stitch Import API.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: security
         * 
         * @param token the value to set
         * @return the dsl builder
         */
        default StitchEndpointBuilder token(String token) {
            doSetProperty("token", token);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Stitch component.
     */
    public interface AdvancedStitchEndpointBuilder
            extends
                EndpointProducerBuilder {
        default StitchEndpointBuilder basic() {
            return (StitchEndpointBuilder) this;
        }
        /**
         * ConnectionProvider contain configuration for the HttpClient like
         * Maximum connection limit .. etc, you can inject this
         * ConnectionProvider and the StitchClient will initialize HttpClient
         * with this ConnectionProvider.
         * 
         * The option is a:
         * &lt;code&gt;reactor.netty.resources.ConnectionProvider&lt;/code&gt;
         * type.
         * 
         * Group: producer (advanced)
         * 
         * @param connectionProvider the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder connectionProvider(
                reactor.netty.resources.ConnectionProvider connectionProvider) {
            doSetProperty("connectionProvider", connectionProvider);
            return this;
        }
        /**
         * ConnectionProvider contain configuration for the HttpClient like
         * Maximum connection limit .. etc, you can inject this
         * ConnectionProvider and the StitchClient will initialize HttpClient
         * with this ConnectionProvider.
         * 
         * The option will be converted to a
         * &lt;code&gt;reactor.netty.resources.ConnectionProvider&lt;/code&gt;
         * type.
         * 
         * Group: producer (advanced)
         * 
         * @param connectionProvider the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder connectionProvider(
                String connectionProvider) {
            doSetProperty("connectionProvider", connectionProvider);
            return this;
        }
        /**
         * Reactor Netty HttpClient, you can injected it if you want to have
         * custom HttpClient.
         * 
         * The option is a:
         * &lt;code&gt;reactor.netty.http.client.HttpClient&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param httpClient the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder httpClient(
                reactor.netty.http.client.HttpClient httpClient) {
            doSetProperty("httpClient", httpClient);
            return this;
        }
        /**
         * Reactor Netty HttpClient, you can injected it if you want to have
         * custom HttpClient.
         * 
         * The option will be converted to a
         * &lt;code&gt;reactor.netty.http.client.HttpClient&lt;/code&gt; type.
         * 
         * Group: producer (advanced)
         * 
         * @param httpClient the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder httpClient(String httpClient) {
            doSetProperty("httpClient", httpClient);
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder lazyStartProducer(
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
        default AdvancedStitchEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Set a custom StitchClient that implements
         * org.apache.camel.component.stitch.client.StitchClient interface.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param stitchClient the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder stitchClient(
                org.apache.camel.component.stitch.client.StitchClient stitchClient) {
            doSetProperty("stitchClient", stitchClient);
            return this;
        }
        /**
         * Set a custom StitchClient that implements
         * org.apache.camel.component.stitch.client.StitchClient interface.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.stitch.client.StitchClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param stitchClient the value to set
         * @return the dsl builder
         */
        default AdvancedStitchEndpointBuilder stitchClient(String stitchClient) {
            doSetProperty("stitchClient", stitchClient);
            return this;
        }
    }

    public interface StitchBuilders {
        /**
         * Stitch (camel-stitch)
         * Stitch is a cloud ETL service that integrates various data sources
         * into a central data warehouse through various integrations.
         * 
         * Category: cloud,api,saas,bigdata
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-stitch
         * 
         * @return the dsl builder for the headers' name.
         */
        default StitchHeaderNameBuilder stitch() {
            return StitchHeaderNameBuilder.INSTANCE;
        }
        /**
         * Stitch (camel-stitch)
         * Stitch is a cloud ETL service that integrates various data sources
         * into a central data warehouse through various integrations.
         * 
         * Category: cloud,api,saas,bigdata
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-stitch
         * 
         * Syntax: <code>stitch:tableName</code>
         * 
         * Path parameter: tableName
         * The name of the destination table the data is being pushed to. Table
         * names must be unique in each destination schema, or loading issues
         * will occur. Note: The number of characters in the table name should
         * be within the destination's allowed limits or data will rejected.
         * 
         * @param path tableName
         * @return the dsl builder
         */
        default StitchEndpointBuilder stitch(String path) {
            return StitchEndpointBuilderFactory.endpointBuilder("stitch", path);
        }
        /**
         * Stitch (camel-stitch)
         * Stitch is a cloud ETL service that integrates various data sources
         * into a central data warehouse through various integrations.
         * 
         * Category: cloud,api,saas,bigdata
         * Since: 3.8
         * Maven coordinates: org.apache.camel:camel-stitch
         * 
         * Syntax: <code>stitch:tableName</code>
         * 
         * Path parameter: tableName
         * The name of the destination table the data is being pushed to. Table
         * names must be unique in each destination schema, or loading issues
         * will occur. Note: The number of characters in the table name should
         * be within the destination's allowed limits or data will rejected.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path tableName
         * @return the dsl builder
         */
        default StitchEndpointBuilder stitch(String componentName, String path) {
            return StitchEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Stitch component.
     */
    public static class StitchHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final StitchHeaderNameBuilder INSTANCE = new StitchHeaderNameBuilder();

        /**
         * The name of the destination table the data is being pushed to. Table
         * names must be unique in each destination schema, or loading issues
         * will occur. Note: The number of characters in the table name should
         * be within the destinations allowed limits or data will rejected.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchTableName}.
         */
        public String stitchTableName() {
            return "CamelStitchTableName";
        }

        /**
         * The schema that describes the Stitch message.
         * 
         * The option is a: {@code StitchSchema or Map} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchSchema}.
         */
        public String stitchSchema() {
            return "CamelStitchSchema";
        }

        /**
         * A collection of strings representing the Primary Key fields in the
         * source table. Stitch use these Primary Keys to de-dupe data during
         * loading If not provided, the table will be loaded in an append-only
         * manner.
         * 
         * The option is a: {@code Collection<String>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchKeyNames}.
         */
        public String stitchKeyNames() {
            return "CamelStitchKeyNames";
        }

        /**
         * HTTP Status code that is returned from Stitch Import HTTP API.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchCode}.
         */
        public String stitchCode() {
            return "CamelStitchCode";
        }

        /**
         * HTTP headers that are returned from Stitch Import HTTP API.
         * 
         * The option is a: {@code Map<String, Object>} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchHeaders}.
         */
        public String stitchHeaders() {
            return "CamelStitchHeaders";
        }

        /**
         * The status message that Stitch returns after sending the data through
         * Stitch Import API.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code StitchStatus}.
         */
        public String stitchStatus() {
            return "CamelStitchStatus";
        }
    }
    static StitchEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class StitchEndpointBuilderImpl extends AbstractEndpointBuilder implements StitchEndpointBuilder, AdvancedStitchEndpointBuilder {
            public StitchEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new StitchEndpointBuilderImpl(path);
    }
}