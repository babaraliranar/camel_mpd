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
 * Perform DNS queries using DNSJava.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DnsEndpointBuilderFactory {


    /**
     * Builder for endpoint for the DNS component.
     */
    public interface DnsEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedDnsEndpointBuilder advanced() {
            return (AdvancedDnsEndpointBuilder) this;
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
        default DnsEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default DnsEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the DNS component.
     */
    public interface AdvancedDnsEndpointBuilder
            extends
                EndpointProducerBuilder {
        default DnsEndpointBuilder basic() {
            return (DnsEndpointBuilder) this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedDnsEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param synchronous the value to set
         * @return the dsl builder
         */
        default AdvancedDnsEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    public interface DnsBuilders {
        /**
         * DNS (camel-dns)
         * Perform DNS queries using DNSJava.
         * 
         * Category: networking
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-dns
         * 
         * Syntax: <code>dns:dnsType</code>
         * 
         * Path parameter: dnsType (required)
         * The type of the lookup.
         * There are 4 enums and the value can be one of: dig, ip, lookup,
         * wikipedia
         * 
         * @param path dnsType
         * @return the dsl builder
         */
        default DnsEndpointBuilder dns(String path) {
            return DnsEndpointBuilderFactory.endpointBuilder("dns", path);
        }
        /**
         * DNS (camel-dns)
         * Perform DNS queries using DNSJava.
         * 
         * Category: networking
         * Since: 2.7
         * Maven coordinates: org.apache.camel:camel-dns
         * 
         * Syntax: <code>dns:dnsType</code>
         * 
         * Path parameter: dnsType (required)
         * The type of the lookup.
         * There are 4 enums and the value can be one of: dig, ip, lookup,
         * wikipedia
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path dnsType
         * @return the dsl builder
         */
        default DnsEndpointBuilder dns(String componentName, String path) {
            return DnsEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DnsEndpointBuilder endpointBuilder(String componentName, String path) {
        class DnsEndpointBuilderImpl extends AbstractEndpointBuilder implements DnsEndpointBuilder, AdvancedDnsEndpointBuilder {
            public DnsEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DnsEndpointBuilderImpl(path);
    }
}