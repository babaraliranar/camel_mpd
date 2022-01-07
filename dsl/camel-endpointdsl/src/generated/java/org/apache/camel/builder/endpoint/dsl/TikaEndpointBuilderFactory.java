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
 * Parse documents and extract metadata and text using Apache Tika.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface TikaEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Tika component.
     */
    public interface TikaEndpointBuilder extends EndpointProducerBuilder {
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
        default TikaEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Tika Config.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.tika.config.TikaConfig&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param tikaConfig the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaConfig(
                org.apache.tika.config.TikaConfig tikaConfig) {
            doSetProperty("tikaConfig", tikaConfig);
            return this;
        }
        /**
         * Tika Config.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.tika.config.TikaConfig&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param tikaConfig the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaConfig(String tikaConfig) {
            doSetProperty("tikaConfig", tikaConfig);
            return this;
        }
        /**
         * Tika Config Url.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param tikaConfigUri the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaConfigUri(String tikaConfigUri) {
            doSetProperty("tikaConfigUri", tikaConfigUri);
            return this;
        }
        /**
         * Tika Parse Output Encoding.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param tikaParseOutputEncoding the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaParseOutputEncoding(
                String tikaParseOutputEncoding) {
            doSetProperty("tikaParseOutputEncoding", tikaParseOutputEncoding);
            return this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.tika.TikaParseOutputFormat&lt;/code&gt; type.
         * 
         * Default: xml
         * Group: producer
         * 
         * @param tikaParseOutputFormat the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaParseOutputFormat(
                org.apache.camel.component.tika.TikaParseOutputFormat tikaParseOutputFormat) {
            doSetProperty("tikaParseOutputFormat", tikaParseOutputFormat);
            return this;
        }
        /**
         * Tika Output Format. Supported output formats. xml: Returns Parsed
         * Content as XML. html: Returns Parsed Content as HTML. text: Returns
         * Parsed Content as Text. textMain: Uses the boilerpipe library to
         * automatically extract the main content from a web page.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.tika.TikaParseOutputFormat&lt;/code&gt; type.
         * 
         * Default: xml
         * Group: producer
         * 
         * @param tikaParseOutputFormat the value to set
         * @return the dsl builder
         */
        default TikaEndpointBuilder tikaParseOutputFormat(
                String tikaParseOutputFormat) {
            doSetProperty("tikaParseOutputFormat", tikaParseOutputFormat);
            return this;
        }
    }

    public interface TikaBuilders {
        /**
         * Tika (camel-tika)
         * Parse documents and extract metadata and text using Apache Tika.
         * 
         * Category: document,transformation
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-tika
         * 
         * Syntax: <code>tika:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation type
         * There are 2 enums and the value can be one of: parse, detect
         * 
         * @param path operation
         * @return the dsl builder
         */
        default TikaEndpointBuilder tika(String path) {
            return TikaEndpointBuilderFactory.endpointBuilder("tika", path);
        }
        /**
         * Tika (camel-tika)
         * Parse documents and extract metadata and text using Apache Tika.
         * 
         * Category: document,transformation
         * Since: 2.19
         * Maven coordinates: org.apache.camel:camel-tika
         * 
         * Syntax: <code>tika:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation type
         * There are 2 enums and the value can be one of: parse, detect
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default TikaEndpointBuilder tika(String componentName, String path) {
            return TikaEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static TikaEndpointBuilder endpointBuilder(String componentName, String path) {
        class TikaEndpointBuilderImpl extends AbstractEndpointBuilder implements TikaEndpointBuilder {
            public TikaEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new TikaEndpointBuilderImpl(path);
    }
}