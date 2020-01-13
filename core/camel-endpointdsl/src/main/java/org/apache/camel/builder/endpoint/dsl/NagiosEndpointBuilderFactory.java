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
 * To send passive checks to Nagios using JSendNSCA.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface NagiosEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Nagios component.
     */
    public interface NagiosEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedNagiosEndpointBuilder advanced() {
            return (AdvancedNagiosEndpointBuilder) this;
        }
        /**
         * Connection timeout in millis.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosEndpointBuilder connectionTimeout(int connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
            return this;
        }
        /**
         * Connection timeout in millis.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosEndpointBuilder connectionTimeout(String connectionTimeout) {
            doSetProperty("connectionTimeout", connectionTimeout);
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
        default NagiosEndpointBuilder lazyStartProducer(
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default NagiosEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default NagiosEndpointBuilder sendSync(boolean sendSync) {
            doSetProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Whether or not to use synchronous when sending a passive check.
         * Setting it to false will allow Camel to continue routing the message
         * and the passive check message will be send asynchronously.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: producer
         */
        default NagiosEndpointBuilder sendSync(String sendSync) {
            doSetProperty("sendSync", sendSync);
            return this;
        }
        /**
         * Sending timeout in millis.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosEndpointBuilder timeout(int timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sending timeout in millis.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 5000
         * Group: producer
         */
        default NagiosEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * To specify an encryption method.
         * 
         * The option is a:
         * <code>com.googlecode.jsendnsca.encryption.Encryption</code> type.
         * 
         * Group: security
         */
        default NagiosEndpointBuilder encryption(Encryption encryption) {
            doSetProperty("encryption", encryption);
            return this;
        }
        /**
         * To specify an encryption method.
         * 
         * The option will be converted to a
         * <code>com.googlecode.jsendnsca.encryption.Encryption</code> type.
         * 
         * Group: security
         */
        default NagiosEndpointBuilder encryption(String encryption) {
            doSetProperty("encryption", encryption);
            return this;
        }
        /**
         * Password to be authenticated when sending checks to Nagios.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: security
         */
        default NagiosEndpointBuilder password(String password) {
            doSetProperty("password", password);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Nagios component.
     */
    public interface AdvancedNagiosEndpointBuilder
            extends
                EndpointProducerBuilder {
        default NagiosEndpointBuilder basic() {
            return (NagiosEndpointBuilder) this;
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
        default AdvancedNagiosEndpointBuilder basicPropertyBinding(
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
        default AdvancedNagiosEndpointBuilder basicPropertyBinding(
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
        default AdvancedNagiosEndpointBuilder synchronous(boolean synchronous) {
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
        default AdvancedNagiosEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>com.googlecode.jsendnsca.encryption.Encryption</code> enum.
     */
    enum Encryption {
        NONE,
        TRIPLE_DES,
        XOR,
        RIJNDAEL128,
        RIJNDAEL192,
        RIJNDAEL256,
        BLOWFISH;
    }
    /**
     * Nagios (camel-nagios)
     * To send passive checks to Nagios using JSendNSCA.
     * 
     * Category: monitoring
     * Since: 2.3
     * Maven coordinates: org.apache.camel:camel-nagios
     * 
     * Syntax: <code>nagios:host:port</code>
     * 
     * Path parameter: host (required)
     * This is the address of the Nagios host where checks should be send.
     * 
     * Path parameter: port (required)
     * The port number of the host.
     */
    static NagiosEndpointBuilder nagios(String path) {
        class NagiosEndpointBuilderImpl extends AbstractEndpointBuilder implements NagiosEndpointBuilder, AdvancedNagiosEndpointBuilder {
            public NagiosEndpointBuilderImpl(String path) {
                super("nagios", path);
            }
        }
        return new NagiosEndpointBuilderImpl(path);
    }
}