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
 * The splunk component allows to publish events in Splunk using the HTTP Event
 * Collector.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface SplunkHECEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Splunk HEC component.
     */
    public interface SplunkHECEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedSplunkHECEndpointBuilder advanced() {
            return (AdvancedSplunkHECEndpointBuilder) this;
        }
        /**
         * Send only the message body.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param bodyOnly the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder bodyOnly(boolean bodyOnly) {
            doSetProperty("bodyOnly", bodyOnly);
            return this;
        }
        /**
         * Send only the message body.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param bodyOnly the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder bodyOnly(String bodyOnly) {
            doSetProperty("bodyOnly", bodyOnly);
            return this;
        }
        /**
         * Send only message headers.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param headersOnly the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder headersOnly(boolean headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * Send only message headers.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param headersOnly the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder headersOnly(String headersOnly) {
            doSetProperty("headersOnly", headersOnly);
            return this;
        }
        /**
         * Splunk host field of the event message. This is not the Splunk host
         * to connect to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder host(String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Splunk index to write to.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel
         * Group: producer
         * 
         * @param index the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder index(String index) {
            doSetProperty("index", index);
            return this;
        }
        /**
         * Splunk source argument.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel
         * Group: producer
         * 
         * @param source the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder source(String source) {
            doSetProperty("source", source);
            return this;
        }
        /**
         * Splunk sourcetype argument.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: camel
         * Group: producer
         * 
         * @param sourceType the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder sourceType(String sourceType) {
            doSetProperty("sourceType", sourceType);
            return this;
        }
        /**
         * Splunk endpoint Defaults to /services/collector/event To write RAW
         * data like JSON use /services/collector/raw For a list of all
         * endpoints refer to splunk documentation (HTTP Event Collector REST
         * API endpoints) Example for Spunk 8.2.x:
         * https://docs.splunk.com/Documentation/SplunkCloud/8.2.2203/Data/HECRESTendpoints To extract timestamps in Splunk8.0 /services/collector/eventauto_extract_timestamp=true Remember to utilize RAW{} for questionmarks or slashes in parameters.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: /services/collector/event
         * Group: producer
         * 
         * @param splunkEndpoint the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder splunkEndpoint(String splunkEndpoint) {
            doSetProperty("splunkEndpoint", splunkEndpoint);
            return this;
        }
        /**
         * Time this even occurred. By default, the time will be when this event
         * hits the splunk server.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param time the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder time(Long time) {
            doSetProperty("time", time);
            return this;
        }
        /**
         * Time this even occurred. By default, the time will be when this event
         * hits the splunk server.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param time the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder time(String time) {
            doSetProperty("time", time);
            return this;
        }
        /**
         * Contact HEC over https.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: security
         * 
         * @param https the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder https(boolean https) {
            doSetProperty("https", https);
            return this;
        }
        /**
         * Contact HEC over https.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: security
         * 
         * @param https the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder https(String https) {
            doSetProperty("https", https);
            return this;
        }
        /**
         * Splunk HEC TLS verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param skipTlsVerify the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder skipTlsVerify(boolean skipTlsVerify) {
            doSetProperty("skipTlsVerify", skipTlsVerify);
            return this;
        }
        /**
         * Splunk HEC TLS verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: security
         * 
         * @param skipTlsVerify the value to set
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder skipTlsVerify(String skipTlsVerify) {
            doSetProperty("skipTlsVerify", skipTlsVerify);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Splunk HEC component.
     */
    public interface AdvancedSplunkHECEndpointBuilder
            extends
                EndpointProducerBuilder {
        default SplunkHECEndpointBuilder basic() {
            return (SplunkHECEndpointBuilder) this;
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
        default AdvancedSplunkHECEndpointBuilder lazyStartProducer(
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
        default AdvancedSplunkHECEndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    public interface SplunkHECBuilders {
        /**
         * Splunk HEC (camel-splunk-hec)
         * The splunk component allows to publish events in Splunk using the
         * HTTP Event Collector.
         * 
         * Category: monitoring
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-splunk-hec
         * 
         * @return the dsl builder for the headers' name.
         */
        default SplunkHECHeaderNameBuilder splunkHec() {
            return SplunkHECHeaderNameBuilder.INSTANCE;
        }
        /**
         * Splunk HEC (camel-splunk-hec)
         * The splunk component allows to publish events in Splunk using the
         * HTTP Event Collector.
         * 
         * Category: monitoring
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-splunk-hec
         * 
         * Syntax: <code>splunk-hec:splunkURL/token</code>
         * 
         * Path parameter: splunkURL (required)
         * Splunk Host and Port (example: my_splunk_server:8089)
         * 
         * Path parameter: token (required)
         * Splunk HEC token (this is the token created for HEC and not the
         * user's token)
         * 
         * @param path splunkURL/token
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder splunkHec(String path) {
            return SplunkHECEndpointBuilderFactory.endpointBuilder("splunk-hec", path);
        }
        /**
         * Splunk HEC (camel-splunk-hec)
         * The splunk component allows to publish events in Splunk using the
         * HTTP Event Collector.
         * 
         * Category: monitoring
         * Since: 3.3
         * Maven coordinates: org.apache.camel:camel-splunk-hec
         * 
         * Syntax: <code>splunk-hec:splunkURL/token</code>
         * 
         * Path parameter: splunkURL (required)
         * Splunk Host and Port (example: my_splunk_server:8089)
         * 
         * Path parameter: token (required)
         * Splunk HEC token (this is the token created for HEC and not the
         * user's token)
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path splunkURL/token
         * @return the dsl builder
         */
        default SplunkHECEndpointBuilder splunkHec(
                String componentName,
                String path) {
            return SplunkHECEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Splunk HEC component.
     */
    public static class SplunkHECHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final SplunkHECHeaderNameBuilder INSTANCE = new SplunkHECHeaderNameBuilder();

        /**
         * Epoch-formatted time. Specify with the time query string parameter.
         * Sets a default for all events in the request. The default time can be
         * overridden.
         * 
         * The option is a: {@code Long} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code SplunkHECIndexTime}.
         */
        public String splunkHECIndexTime() {
            return "CamelSplunkHECIndexTime";
        }
    }
    static SplunkHECEndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class SplunkHECEndpointBuilderImpl extends AbstractEndpointBuilder implements SplunkHECEndpointBuilder, AdvancedSplunkHECEndpointBuilder {
            public SplunkHECEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new SplunkHECEndpointBuilderImpl(path);
    }
}