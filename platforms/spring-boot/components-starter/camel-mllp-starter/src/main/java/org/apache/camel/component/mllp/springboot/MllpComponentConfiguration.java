/**
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
package org.apache.camel.component.mllp.springboot;

import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.component.mllp.MllpComponent;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * Provides functionality required by Healthcare providers to communicate with
 * other systems using the MLLP protocol.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.mllp")
public class MllpComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Set the component to log PHI data.
     */
    private Boolean logPhi = true;
    /**
     * Set the maximum number of bytes of PHI that will be logged in a log
     * entry.
     */
    private Integer logPhiMaxBytes = 5120;
    /**
     * Set the default character set to use for byte to/from String conversions.
     */
    private String defaultCharset = "ISO-8859-1";
    /**
     * Sets the default configuration to use when creating MLLP endpoints.
     */
    private MllpConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public Boolean getLogPhi() {
        return logPhi;
    }

    public void setLogPhi(Boolean logPhi) {
        this.logPhi = logPhi;
    }

    public Integer getLogPhiMaxBytes() {
        return logPhiMaxBytes;
    }

    public void setLogPhiMaxBytes(Integer logPhiMaxBytes) {
        this.logPhiMaxBytes = logPhiMaxBytes;
    }

    public String getDefaultCharset() {
        return defaultCharset;
    }

    public void setDefaultCharset(String defaultCharset) {
        this.defaultCharset = defaultCharset;
    }

    public MllpConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            MllpConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class MllpConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.mllp.MllpConfiguration.class;
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * receive incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. If disabled, the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions by logging them at WARN or ERROR level and ignored.
         * 
         * @param bridgeErrorHandler
         */
        private Boolean bridgeErrorHandler = true;
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * @param exchangePattern
         */
        private ExchangePattern exchangePattern = ExchangePattern.InOut;
        /**
         * Sets whether synchronous processing should be strictly used (this
         * component only supports synchronous operations).
         * 
         * @param synchronous
         */
        private Boolean synchronous = true;
        /**
         * Set the CamelCharsetName property on the exchange
         * 
         * @param charsetName
         *            the charset
         */
        private String charsetName;
        /**
         * The maximum queue length for incoming connection indications (a
         * request to connect) is set to the backlog parameter. If a connection
         * indication arrives when the queue is full, the connection is refused.
         */
        private Integer backlog = 5;
        /**
         * TCP Server Only - The number of milliseconds to retry binding to a
         * server port
         */
        private Integer bindTimeout = 30000;
        /**
         * TCP Server Only - The number of milliseconds to wait between bind
         * attempts
         */
        private Integer bindRetryInterval = 5000;
        /**
         * Timeout (in milliseconds) while waiting for a TCP connection
         * <p/>
         * TCP Server Only
         * 
         * @param acceptTimeout
         *            timeout in milliseconds
         */
        private Integer acceptTimeout = 60000;
        /**
         * TCP Server Only - Allow the endpoint to start before the TCP
         * ServerSocket is bound. In some environments, it may be desirable to
         * allow the endpoint to start before the TCP ServerSocket is bound.
         * 
         * @param lenientBind
         *            if true, the ServerSocket will be bound asynchronously;
         *            otherwise the ServerSocket will be bound synchronously.
         */
        private Boolean lenientBind = false;
        /**
         * Timeout (in milliseconds) for establishing for a TCP connection
         * <p/>
         * TCP Client only
         * 
         * @param connectTimeout
         *            timeout in milliseconds
         */
        private Integer connectTimeout = 30000;
        /**
         * The SO_TIMEOUT value (in milliseconds) used when waiting for the
         * start of an MLLP frame
         * 
         * @param receiveTimeout
         *            timeout in milliseconds
         */
        private Integer receiveTimeout = 15000;
        /**
         * The maximum number of concurrent MLLP Consumer connections that will
         * be allowed. If a new connection is received and the maximum is number
         * are already established, the new connection will be reset
         * immediately.
         * 
         * @param maxConcurrentConsumers
         *            the maximum number of concurrent consumer connections
         *            allowed
         */
        private Integer maxConcurrentConsumers = 5;
        /**
         * The maximum number of timeouts (specified by receiveTimeout) allowed
         * before the TCP Connection will be reset.
         * 
         * @param maxReceiveTimeouts
         *            maximum number of receiveTimeouts
         * @deprecated Use the idleTimeout URI parameter. For backward
         *             compibility, setting this parameter will result in an
         *             idle timeout of maxReceiveTimeouts * receiveTimeout. If
         *             idleTimeout is also specified, this parameter will be
         *             ignored.
         */
        @Deprecated
        private Integer maxReceiveTimeouts;
        /**
         * The approximate idle time allowed before the Client TCP Connection
         * will be reset. A null value or a value less than or equal to zero
         * will disable the idle timeout.
         * 
         * @param idleTimeout
         *            timeout in milliseconds
         */
        private Integer idleTimeout;
        /**
         * The SO_TIMEOUT value (in milliseconds) used after the start of an
         * MLLP frame has been received
         * 
         * @param readTimeout
         *            timeout in milliseconds
         */
        private Integer readTimeout = 5000;
        /**
         * Enable/disable the SO_KEEPALIVE socket option.
         * 
         * @param keepAlive
         *            enable SO_KEEPALIVE when true; disable SO_KEEPALIVE when
         *            false; use system default when null
         */
        private Boolean keepAlive = true;
        /**
         * Enable/disable the TCP_NODELAY socket option.
         * 
         * @param tcpNoDelay
         *            enable TCP_NODELAY when true; disable TCP_NODELAY when
         *            false; use system default when null
         */
        private Boolean tcpNoDelay = true;
        /**
         * Enable/disable the SO_REUSEADDR socket option.
         * 
         * @param reuseAddress
         *            enable SO_REUSEADDR when true; disable SO_REUSEADDR when
         *            false; use system default when null
         */
        private Boolean reuseAddress = false;
        /**
         * Sets the SO_RCVBUF option to the specified value (in bytes)
         * 
         * @param receiveBufferSize
         *            the SO_RCVBUF option value. If null, the system default is
         *            used
         */
        private Integer receiveBufferSize = 8192;
        /**
         * Sets the SO_SNDBUF option to the specified value (in bytes)
         * 
         * @param sendBufferSize
         *            the SO_SNDBUF option value. If null, the system default is
         *            used
         */
        private Integer sendBufferSize = 8192;
        /**
         * Enable/Disable the automatic generation of a MLLP Acknowledgement
         * MLLP Consumers only
         * 
         * @param autoAck
         *            enabled if true, otherwise disabled
         */
        private Boolean autoAck = true;
        /**
         * Enable/Disable the automatic generation of message headers from the
         * HL7 Message MLLP Consumers only
         * 
         * @param hl7Headers
         *            enabled if true, otherwise disabled
         */
        private Boolean hl7Headers = true;
        /**
         * Enable/Disable strict compliance to the MLLP standard. The MLLP
         * standard specifies [START_OF_BLOCK]hl7
         * payload[END_OF_BLOCK][END_OF_DATA], however, some systems do not send
         * the final END_OF_DATA byte. This setting controls whether or not the
         * final END_OF_DATA byte is required or optional.
         * 
         * @param requireEndOfData
         *            the trailing END_OF_DATA byte is required if true;
         *            optional otherwise
         */
        private Boolean requireEndOfData = true;
        /**
         * Enable/Disable converting the payload to a String. If enabled, HL7
         * Payloads received from external systems will be validated converted
         * to a String. If the charsetName property is set, that character set
         * will be used for the conversion. If the charsetName property is not
         * set, the value of MSH-18 will be used to determine th appropriate
         * character set. If MSH-18 is not set, then the default ISO-8859-1
         * character set will be use.
         * 
         * @param stringPayload
         *            enabled if true, otherwise disabled
         */
        private Boolean stringPayload = true;
        /**
         * Enable/Disable the validation of HL7 Payloads If enabled, HL7
         * Payloads received from external systems will be validated (see
         * Hl7Util.generateInvalidPayloadExceptionMessage for details on the
         * validation). If and invalid payload is detected, a
         * MllpInvalidMessageException (for consumers) or a
         * MllpInvalidAcknowledgementException will be thrown.
         * 
         * @param validatePayload
         *            enabled if true, otherwise disabled
         */
        private Boolean validatePayload = false;
        /**
         * Enable/Disable the buffering of HL7 payloads before writing to the
         * socket.
         * 
         * @deprecated the parameter will be ignored
         * @param bufferWrites
         *            enabled if true, otherwise disabled
         */
        @Deprecated
        private Boolean bufferWrites = false;

        public Boolean getBridgeErrorHandler() {
            return bridgeErrorHandler;
        }

        public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
            this.bridgeErrorHandler = bridgeErrorHandler;
        }

        public ExchangePattern getExchangePattern() {
            return exchangePattern;
        }

        public void setExchangePattern(ExchangePattern exchangePattern) {
            this.exchangePattern = exchangePattern;
        }

        public Boolean getSynchronous() {
            return synchronous;
        }

        public void setSynchronous(Boolean synchronous) {
            this.synchronous = synchronous;
        }

        public String getCharsetName() {
            return charsetName;
        }

        public void setCharsetName(String charsetName) {
            this.charsetName = charsetName;
        }

        public Integer getBacklog() {
            return backlog;
        }

        public void setBacklog(Integer backlog) {
            this.backlog = backlog;
        }

        public Integer getBindTimeout() {
            return bindTimeout;
        }

        public void setBindTimeout(Integer bindTimeout) {
            this.bindTimeout = bindTimeout;
        }

        public Integer getBindRetryInterval() {
            return bindRetryInterval;
        }

        public void setBindRetryInterval(Integer bindRetryInterval) {
            this.bindRetryInterval = bindRetryInterval;
        }

        public Integer getAcceptTimeout() {
            return acceptTimeout;
        }

        public void setAcceptTimeout(Integer acceptTimeout) {
            this.acceptTimeout = acceptTimeout;
        }

        public Boolean getLenientBind() {
            return lenientBind;
        }

        public void setLenientBind(Boolean lenientBind) {
            this.lenientBind = lenientBind;
        }

        public Integer getConnectTimeout() {
            return connectTimeout;
        }

        public void setConnectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
        }

        public Integer getReceiveTimeout() {
            return receiveTimeout;
        }

        public void setReceiveTimeout(Integer receiveTimeout) {
            this.receiveTimeout = receiveTimeout;
        }

        public Integer getMaxConcurrentConsumers() {
            return maxConcurrentConsumers;
        }

        public void setMaxConcurrentConsumers(Integer maxConcurrentConsumers) {
            this.maxConcurrentConsumers = maxConcurrentConsumers;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public Integer getMaxReceiveTimeouts() {
            return maxReceiveTimeouts;
        }

        @Deprecated
        public void setMaxReceiveTimeouts(Integer maxReceiveTimeouts) {
            this.maxReceiveTimeouts = maxReceiveTimeouts;
        }

        public Integer getIdleTimeout() {
            return idleTimeout;
        }

        public void setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
        }

        public Integer getReadTimeout() {
            return readTimeout;
        }

        public void setReadTimeout(Integer readTimeout) {
            this.readTimeout = readTimeout;
        }

        public Boolean getKeepAlive() {
            return keepAlive;
        }

        public void setKeepAlive(Boolean keepAlive) {
            this.keepAlive = keepAlive;
        }

        public Boolean getTcpNoDelay() {
            return tcpNoDelay;
        }

        public void setTcpNoDelay(Boolean tcpNoDelay) {
            this.tcpNoDelay = tcpNoDelay;
        }

        public Boolean getReuseAddress() {
            return reuseAddress;
        }

        public void setReuseAddress(Boolean reuseAddress) {
            this.reuseAddress = reuseAddress;
        }

        public Integer getReceiveBufferSize() {
            return receiveBufferSize;
        }

        public void setReceiveBufferSize(Integer receiveBufferSize) {
            this.receiveBufferSize = receiveBufferSize;
        }

        public Integer getSendBufferSize() {
            return sendBufferSize;
        }

        public void setSendBufferSize(Integer sendBufferSize) {
            this.sendBufferSize = sendBufferSize;
        }

        public Boolean getAutoAck() {
            return autoAck;
        }

        public void setAutoAck(Boolean autoAck) {
            this.autoAck = autoAck;
        }

        public Boolean getHl7Headers() {
            return hl7Headers;
        }

        public void setHl7Headers(Boolean hl7Headers) {
            this.hl7Headers = hl7Headers;
        }

        public Boolean getRequireEndOfData() {
            return requireEndOfData;
        }

        public void setRequireEndOfData(Boolean requireEndOfData) {
            this.requireEndOfData = requireEndOfData;
        }

        public Boolean getStringPayload() {
            return stringPayload;
        }

        public void setStringPayload(Boolean stringPayload) {
            this.stringPayload = stringPayload;
        }

        public Boolean getValidatePayload() {
            return validatePayload;
        }

        public void setValidatePayload(Boolean validatePayload) {
            this.validatePayload = validatePayload;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public Boolean getBufferWrites() {
            return bufferWrites;
        }

        @Deprecated
        public void setBufferWrites(Boolean bufferWrites) {
            this.bufferWrites = bufferWrites;
        }
    }
}