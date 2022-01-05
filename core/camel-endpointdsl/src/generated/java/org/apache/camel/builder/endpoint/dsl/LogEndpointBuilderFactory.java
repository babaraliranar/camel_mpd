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
import org.apache.camel.spi.ExchangeFormatter;

/**
 * Log messages to the underlying logging mechanism.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface LogEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Log component.
     */
    public interface LogEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedLogEndpointBuilder advanced() {
            return (AdvancedLogEndpointBuilder) this;
        }
        /**
         * If true, will hide stats when no new messages have been received for
         * a time interval, if false, show stats regardless of message traffic.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param groupActiveOnly the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupActiveOnly(Boolean groupActiveOnly) {
            doSetProperty("groupActiveOnly", groupActiveOnly);
            return this;
        }
        /**
         * If true, will hide stats when no new messages have been received for
         * a time interval, if false, show stats regardless of message traffic.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: producer
         * 
         * @param groupActiveOnly the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupActiveOnly(String groupActiveOnly) {
            doSetProperty("groupActiveOnly", groupActiveOnly);
            return this;
        }
        /**
         * Set the initial delay for stats (in millis).
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupDelay the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupDelay(Long groupDelay) {
            doSetProperty("groupDelay", groupDelay);
            return this;
        }
        /**
         * Set the initial delay for stats (in millis).
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupDelay the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupDelay(String groupDelay) {
            doSetProperty("groupDelay", groupDelay);
            return this;
        }
        /**
         * If specified will group message stats by this time interval (in
         * millis).
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupInterval the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupInterval(Long groupInterval) {
            doSetProperty("groupInterval", groupInterval);
            return this;
        }
        /**
         * If specified will group message stats by this time interval (in
         * millis).
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupInterval the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupInterval(String groupInterval) {
            doSetProperty("groupInterval", groupInterval);
            return this;
        }
        /**
         * An integer that specifies a group size for throughput logging.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupSize the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupSize(Integer groupSize) {
            doSetProperty("groupSize", groupSize);
            return this;
        }
        /**
         * An integer that specifies a group size for throughput logging.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param groupSize the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder groupSize(String groupSize) {
            doSetProperty("groupSize", groupSize);
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
        default LogEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
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
        default LogEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Logging level to use. &lt;p/&gt; The default value is INFO.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Default: INFO
         * Group: producer
         * 
         * @param level the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder level(String level) {
            doSetProperty("level", level);
            return this;
        }
        /**
         * If true, mask sensitive information like password or passphrase in
         * the log.
         * 
         * The option is a: &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param logMask the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder logMask(Boolean logMask) {
            doSetProperty("logMask", logMask);
            return this;
        }
        /**
         * If true, mask sensitive information like password or passphrase in
         * the log.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Boolean&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param logMask the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder logMask(String logMask) {
            doSetProperty("logMask", logMask);
            return this;
        }
        /**
         * An optional Marker name to use.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param marker the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder marker(String marker) {
            doSetProperty("marker", marker);
            return this;
        }
        /**
         * Limits the number of characters logged per line.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: formatting
         * 
         * @param maxChars the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder maxChars(int maxChars) {
            doSetProperty("maxChars", maxChars);
            return this;
        }
        /**
         * Limits the number of characters logged per line.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Default: 10000
         * Group: formatting
         * 
         * @param maxChars the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder maxChars(String maxChars) {
            doSetProperty("maxChars", maxChars);
            return this;
        }
        /**
         * If enabled then each information is outputted on a newline.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param multiline the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder multiline(boolean multiline) {
            doSetProperty("multiline", multiline);
            return this;
        }
        /**
         * If enabled then each information is outputted on a newline.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param multiline the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder multiline(String multiline) {
            doSetProperty("multiline", multiline);
            return this;
        }
        /**
         * Quick option for turning all options on. (multiline, maxChars has to
         * be manually set if to be used).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showAll the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showAll(boolean showAll) {
            doSetProperty("showAll", showAll);
            return this;
        }
        /**
         * Quick option for turning all options on. (multiline, maxChars has to
         * be manually set if to be used).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showAll the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showAll(String showAll) {
            doSetProperty("showAll", showAll);
            return this;
        }
        /**
         * Show all of the exchange properties (both internal and custom).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showAllProperties the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showAllProperties(boolean showAllProperties) {
            doSetProperty("showAllProperties", showAllProperties);
            return this;
        }
        /**
         * Show all of the exchange properties (both internal and custom).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showAllProperties the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showAllProperties(String showAllProperties) {
            doSetProperty("showAllProperties", showAllProperties);
            return this;
        }
        /**
         * Show the message body.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showBody the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showBody(boolean showBody) {
            doSetProperty("showBody", showBody);
            return this;
        }
        /**
         * Show the message body.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showBody the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showBody(String showBody) {
            doSetProperty("showBody", showBody);
            return this;
        }
        /**
         * Show the body Java type.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showBodyType the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showBodyType(boolean showBodyType) {
            doSetProperty("showBodyType", showBodyType);
            return this;
        }
        /**
         * Show the body Java type.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showBodyType the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showBodyType(String showBodyType) {
            doSetProperty("showBodyType", showBodyType);
            return this;
        }
        /**
         * If the exchange has a caught exception, show the exception message
         * (no stack trace). A caught exception is stored as a property on the
         * exchange (using the key org.apache.camel.Exchange#EXCEPTION_CAUGHT)
         * and for instance a doCatch can catch exceptions.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showCaughtException the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showCaughtException(
                boolean showCaughtException) {
            doSetProperty("showCaughtException", showCaughtException);
            return this;
        }
        /**
         * If the exchange has a caught exception, show the exception message
         * (no stack trace). A caught exception is stored as a property on the
         * exchange (using the key org.apache.camel.Exchange#EXCEPTION_CAUGHT)
         * and for instance a doCatch can catch exceptions.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showCaughtException the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showCaughtException(
                String showCaughtException) {
            doSetProperty("showCaughtException", showCaughtException);
            return this;
        }
        /**
         * If the exchange has an exception, show the exception message (no
         * stacktrace).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showException the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showException(boolean showException) {
            doSetProperty("showException", showException);
            return this;
        }
        /**
         * If the exchange has an exception, show the exception message (no
         * stacktrace).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showException the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showException(String showException) {
            doSetProperty("showException", showException);
            return this;
        }
        /**
         * Show the unique exchange ID.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showExchangeId the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showExchangeId(boolean showExchangeId) {
            doSetProperty("showExchangeId", showExchangeId);
            return this;
        }
        /**
         * Show the unique exchange ID.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showExchangeId the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showExchangeId(String showExchangeId) {
            doSetProperty("showExchangeId", showExchangeId);
            return this;
        }
        /**
         * Shows the Message Exchange Pattern (or MEP for short).
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showExchangePattern the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showExchangePattern(
                boolean showExchangePattern) {
            doSetProperty("showExchangePattern", showExchangePattern);
            return this;
        }
        /**
         * Shows the Message Exchange Pattern (or MEP for short).
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param showExchangePattern the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showExchangePattern(
                String showExchangePattern) {
            doSetProperty("showExchangePattern", showExchangePattern);
            return this;
        }
        /**
         * If enabled Camel will output files.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showFiles the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showFiles(boolean showFiles) {
            doSetProperty("showFiles", showFiles);
            return this;
        }
        /**
         * If enabled Camel will output files.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showFiles the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showFiles(String showFiles) {
            doSetProperty("showFiles", showFiles);
            return this;
        }
        /**
         * If enabled Camel will on Future objects wait for it to complete to
         * obtain the payload to be logged.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showFuture the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showFuture(boolean showFuture) {
            doSetProperty("showFuture", showFuture);
            return this;
        }
        /**
         * If enabled Camel will on Future objects wait for it to complete to
         * obtain the payload to be logged.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showFuture the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showFuture(String showFuture) {
            doSetProperty("showFuture", showFuture);
            return this;
        }
        /**
         * Show the message headers.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showHeaders the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showHeaders(boolean showHeaders) {
            doSetProperty("showHeaders", showHeaders);
            return this;
        }
        /**
         * Show the message headers.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showHeaders the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showHeaders(String showHeaders) {
            doSetProperty("showHeaders", showHeaders);
            return this;
        }
        /**
         * Show the exchange properties (only custom). Use showAllProperties to
         * show both internal and custom properties.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showProperties the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showProperties(boolean showProperties) {
            doSetProperty("showProperties", showProperties);
            return this;
        }
        /**
         * Show the exchange properties (only custom). Use showAllProperties to
         * show both internal and custom properties.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showProperties the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showProperties(String showProperties) {
            doSetProperty("showProperties", showProperties);
            return this;
        }
        /**
         * Show the stack trace, if an exchange has an exception. Only effective
         * if one of showAll, showException or showCaughtException are enabled.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showStackTrace the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showStackTrace(boolean showStackTrace) {
            doSetProperty("showStackTrace", showStackTrace);
            return this;
        }
        /**
         * Show the stack trace, if an exchange has an exception. Only effective
         * if one of showAll, showException or showCaughtException are enabled.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showStackTrace the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showStackTrace(String showStackTrace) {
            doSetProperty("showStackTrace", showStackTrace);
            return this;
        }
        /**
         * Whether Camel should show stream bodies or not (eg such as
         * java.io.InputStream). Beware if you enable this option then you may
         * not be able later to access the message body as the stream have
         * already been read by this logger. To remedy this you will have to use
         * Stream Caching.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showStreams the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showStreams(boolean showStreams) {
            doSetProperty("showStreams", showStreams);
            return this;
        }
        /**
         * Whether Camel should show stream bodies or not (eg such as
         * java.io.InputStream). Beware if you enable this option then you may
         * not be able later to access the message body as the stream have
         * already been read by this logger. To remedy this you will have to use
         * Stream Caching.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: formatting
         * 
         * @param showStreams the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder showStreams(String showStreams) {
            doSetProperty("showStreams", showStreams);
            return this;
        }
        /**
         * Whether to skip line separators when logging the message body. This
         * allows to log the message body in one line, setting this option to
         * false will preserve any line separators from the body, which then
         * will log the body as is.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param skipBodyLineSeparator the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder skipBodyLineSeparator(
                boolean skipBodyLineSeparator) {
            doSetProperty("skipBodyLineSeparator", skipBodyLineSeparator);
            return this;
        }
        /**
         * Whether to skip line separators when logging the message body. This
         * allows to log the message body in one line, setting this option to
         * false will preserve any line separators from the body, which then
         * will log the body as is.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: formatting
         * 
         * @param skipBodyLineSeparator the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder skipBodyLineSeparator(
                String skipBodyLineSeparator) {
            doSetProperty("skipBodyLineSeparator", skipBodyLineSeparator);
            return this;
        }
        /**
         * Sets the outputs style to use.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle&lt;/code&gt; type.
         * 
         * Default: Default
         * Group: formatting
         * 
         * @param style the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder style(OutputStyle style) {
            doSetProperty("style", style);
            return this;
        }
        /**
         * Sets the outputs style to use.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle&lt;/code&gt; type.
         * 
         * Default: Default
         * Group: formatting
         * 
         * @param style the value to set
         * @return the dsl builder
         */
        default LogEndpointBuilder style(String style) {
            doSetProperty("style", style);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Log component.
     */
    public interface AdvancedLogEndpointBuilder
            extends
                EndpointProducerBuilder {
        default LogEndpointBuilder basic() {
            return (LogEndpointBuilder) this;
        }
        /**
         * To use a custom exchange formatter.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExchangeFormatter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param exchangeFormatter the value to set
         * @return the dsl builder
         */
        default AdvancedLogEndpointBuilder exchangeFormatter(
                ExchangeFormatter exchangeFormatter) {
            doSetProperty("exchangeFormatter", exchangeFormatter);
            return this;
        }
        /**
         * To use a custom exchange formatter.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExchangeFormatter&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param exchangeFormatter the value to set
         * @return the dsl builder
         */
        default AdvancedLogEndpointBuilder exchangeFormatter(
                String exchangeFormatter) {
            doSetProperty("exchangeFormatter", exchangeFormatter);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.support.processor.DefaultExchangeFormatter$OutputStyle</code> enum.
     */
    enum OutputStyle {
        Default,
        Tab,
        Fixed;
    }

    public interface LogBuilders {
        /**
         * Log (camel-log)
         * Log messages to the underlying logging mechanism.
         * 
         * Category: core,monitoring
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-log
         * 
         * Syntax: <code>log:loggerName</code>
         * 
         * Path parameter: loggerName (required)
         * Name of the logging category to use
         * 
         * @param path loggerName
         * @return the dsl builder
         */
        default LogEndpointBuilder log(String path) {
            return LogEndpointBuilderFactory.endpointBuilder("log", path);
        }
        /**
         * Log (camel-log)
         * Log messages to the underlying logging mechanism.
         * 
         * Category: core,monitoring
         * Since: 1.1
         * Maven coordinates: org.apache.camel:camel-log
         * 
         * Syntax: <code>log:loggerName</code>
         * 
         * Path parameter: loggerName (required)
         * Name of the logging category to use
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path loggerName
         * @return the dsl builder
         */
        default LogEndpointBuilder log(String componentName, String path) {
            return LogEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static LogEndpointBuilder endpointBuilder(String componentName, String path) {
        class LogEndpointBuilderImpl extends AbstractEndpointBuilder implements LogEndpointBuilder, AdvancedLogEndpointBuilder {
            public LogEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new LogEndpointBuilderImpl(path);
    }
}