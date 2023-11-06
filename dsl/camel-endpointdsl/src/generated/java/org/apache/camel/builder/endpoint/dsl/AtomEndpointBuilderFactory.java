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
import java.util.Map;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Poll Atom RSS feeds.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface AtomEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Atom component.
     */
    public interface AtomEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedAtomEndpointBuilder advanced() {
            return (AdvancedAtomEndpointBuilder) this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder sendEmptyMessageWhenIdle(
                boolean sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * If the polling consumer did not poll any files, you can enable this
         * option to send an empty message (no body) instead.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sendEmptyMessageWhenIdle the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder sendEmptyMessageWhenIdle(
                String sendEmptyMessageWhenIdle) {
            doSetProperty("sendEmptyMessageWhenIdle", sendEmptyMessageWhenIdle);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sortEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder sortEntries(boolean sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether to sort entries by published date. Only works when
         * splitEntries = true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param sortEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder sortEntries(String sortEntries) {
            doSetProperty("sortEntries", sortEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param splitEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder splitEntries(boolean splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether or not entries should be sent individually or whether
         * the entire feed should be sent as a single message.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param splitEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder splitEntries(String splitEntries) {
            doSetProperty("splitEntries", splitEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * delay. Only applicable when splitEntries = true.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param throttleEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder throttleEntries(boolean throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * Sets whether all entries identified in a single feed poll should be
         * delivered immediately. If true, only one entry is processed per
         * delay. Only applicable when splitEntries = true.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param throttleEntries the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder throttleEntries(String throttleEntries) {
            doSetProperty("throttleEntries", throttleEntries);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffErrorThreshold(
                int backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent error polls (failed due some error) that
         * should happen before the backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffErrorThreshold the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffErrorThreshold(
                String backoffErrorThreshold) {
            doSetProperty("backoffErrorThreshold", backoffErrorThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffIdleThreshold(
                int backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * The number of subsequent idle polls that should happen before the
         * backoffMultipler should kick-in.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffIdleThreshold the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffIdleThreshold(
                String backoffIdleThreshold) {
            doSetProperty("backoffIdleThreshold", backoffIdleThreshold);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffMultiplier(int backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * To let the scheduled polling consumer backoff if there has been a
         * number of subsequent idles/errors in a row. The multiplier is then
         * the number of polls that will be skipped before the next actual
         * attempt is happening again. When this option is in use then
         * backoffIdleThreshold and/or backoffErrorThreshold must also be
         * configured.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param backoffMultiplier the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder backoffMultiplier(String backoffMultiplier) {
            doSetProperty("backoffMultiplier", backoffMultiplier);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder delay(long delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * Milliseconds before the next poll.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 500
         * Group: scheduler
         * 
         * @param delay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder delay(String delay) {
            doSetProperty("delay", delay);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder greedy(boolean greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * If greedy is enabled, then the ScheduledPollConsumer will run
         * immediately again, if the previous run polled 1 or more messages.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: scheduler
         * 
         * @param greedy the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder greedy(String greedy) {
            doSetProperty("greedy", greedy);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder initialDelay(long initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Milliseconds before the first poll starts.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 1000
         * Group: scheduler
         * 
         * @param initialDelay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder initialDelay(String initialDelay) {
            doSetProperty("initialDelay", initialDelay);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option is a: &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder repeatCount(long repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * Specifies a maximum limit of number of fires. So if you set it to 1,
         * the scheduler will only fire once. If you set it to 5, it will only
         * fire five times. A value of zero or negative means fire forever.
         * 
         * The option will be converted to a &lt;code&gt;long&lt;/code&gt; type.
         * 
         * Default: 0
         * Group: scheduler
         * 
         * @param repeatCount the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder repeatCount(String repeatCount) {
            doSetProperty("repeatCount", repeatCount);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder runLoggingLevel(
                org.apache.camel.LoggingLevel runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * The consumer logs a start/complete log line when it polls. This
         * option allows you to configure the logging level for that.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.LoggingLevel&lt;/code&gt; type.
         * 
         * Default: TRACE
         * Group: scheduler
         * 
         * @param runLoggingLevel the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder runLoggingLevel(String runLoggingLevel) {
            doSetProperty("runLoggingLevel", runLoggingLevel);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder scheduledExecutorService(
                ScheduledExecutorService scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * Allows for configuring a custom/shared thread pool to use for the
         * consumer. By default each consumer has its own single threaded thread
         * pool.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.ScheduledExecutorService&lt;/code&gt; type.
         * 
         * Group: scheduler
         * 
         * @param scheduledExecutorService the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder scheduledExecutorService(
                String scheduledExecutorService) {
            doSetProperty("scheduledExecutorService", scheduledExecutorService);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option is a: &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder scheduler(Object scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To use a cron scheduler from either camel-spring or camel-quartz
         * component. Use value spring or quartz for built in scheduler.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Object&lt;/code&gt; type.
         * 
         * Default: none
         * Group: scheduler
         * 
         * @param scheduler the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder scheduler(String scheduler) {
            doSetProperty("scheduler", scheduler);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param key the option key
         * @param value the option value
         * @return the dsl builder
         */
        default AtomEndpointBuilder schedulerProperties(String key, Object value) {
            doSetMultiValueProperty("schedulerProperties", "scheduler." + key, value);
            return this;
        }
        /**
         * To configure additional properties when using a custom scheduler or
         * any of the Quartz, Spring based scheduler.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * The option is multivalued, and you can use the
         * schedulerProperties(String, Object) method to add a value (call the
         * method multiple times to set more values).
         * 
         * Group: scheduler
         * 
         * @param values the values
         * @return the dsl builder
         */
        default AtomEndpointBuilder schedulerProperties(Map values) {
            doSetMultiValueProperties("schedulerProperties", "scheduler.", values);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder startScheduler(boolean startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Whether the scheduler should be auto started.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param startScheduler the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder startScheduler(String startScheduler) {
            doSetProperty("startScheduler", startScheduler);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option is a:
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder timeUnit(TimeUnit timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Time unit for initialDelay and delay options.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.util.concurrent.TimeUnit&lt;/code&gt; type.
         * 
         * Default: MILLISECONDS
         * Group: scheduler
         * 
         * @param timeUnit the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder timeUnit(String timeUnit) {
            doSetProperty("timeUnit", timeUnit);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder useFixedDelay(boolean useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
        /**
         * Controls if fixed delay or fixed rate is used. See
         * ScheduledExecutorService in JDK for details.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: scheduler
         * 
         * @param useFixedDelay the value to set
         * @return the dsl builder
         */
        default AtomEndpointBuilder useFixedDelay(String useFixedDelay) {
            doSetProperty("useFixedDelay", useFixedDelay);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Atom component.
     */
    public interface AdvancedAtomEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default AtomEndpointBuilder basic() {
            return (AtomEndpointBuilder) this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: consumer (advanced)
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder exceptionHandler(
                org.apache.camel.spi.ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.ExceptionHandler&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exceptionHandler the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder exchangePattern(
                org.apache.camel.ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.ExchangePattern&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param exchangePattern the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder pollStrategy(
                org.apache.camel.spi.PollingConsumerPollStrategy pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * A pluggable org.apache.camel.PollingConsumerPollingStrategy allowing
         * you to provide your custom implementation to control error handling
         * usually occurred during the poll operation before an Exchange have
         * been created and being routed in Camel.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.spi.PollingConsumerPollStrategy&lt;/code&gt; type.
         * 
         * Group: consumer (advanced)
         * 
         * @param pollStrategy the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder pollStrategy(String pollStrategy) {
            doSetProperty("pollStrategy", pollStrategy);
            return this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param feedHeader the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder feedHeader(boolean feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
        /**
         * Sets whether to add the feed object as a header.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param feedHeader the value to set
         * @return the dsl builder
         */
        default AdvancedAtomEndpointBuilder feedHeader(String feedHeader) {
            doSetProperty("feedHeader", feedHeader);
            return this;
        }
    }

    public interface AtomBuilders {
        /**
         * Atom (camel-atom)
         * Poll Atom RSS feeds.
         * 
         * Category: document
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-atom
         * 
         * @return the dsl builder for the headers' name.
         */
        default AtomHeaderNameBuilder atom() {
            return AtomHeaderNameBuilder.INSTANCE;
        }
        /**
         * Atom (camel-atom)
         * Poll Atom RSS feeds.
         * 
         * Category: document
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-atom
         * 
         * Syntax: <code>atom:feedUri</code>
         * 
         * Path parameter: feedUri (required)
         * The URI to the feed to poll.
         * 
         * @param path feedUri
         * @return the dsl builder
         */
        default AtomEndpointBuilder atom(String path) {
            return AtomEndpointBuilderFactory.endpointBuilder("atom", path);
        }
        /**
         * Atom (camel-atom)
         * Poll Atom RSS feeds.
         * 
         * Category: document
         * Since: 1.2
         * Maven coordinates: org.apache.camel:camel-atom
         * 
         * Syntax: <code>atom:feedUri</code>
         * 
         * Path parameter: feedUri (required)
         * The URI to the feed to poll.
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path feedUri
         * @return the dsl builder
         */
        default AtomEndpointBuilder atom(String componentName, String path) {
            return AtomEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the Atom component.
     */
    public static class AtomHeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final AtomHeaderNameBuilder INSTANCE = new AtomHeaderNameBuilder();

        /**
         * When consuming the List object is set to this header.
         * 
         * The option is a: {@code java.util.List} type.
         * 
         * Group: consumer
         * 
         * @return the name of the header {@code AtomFeed}.
         */
        public String atomFeed() {
            return "CamelAtomFeed";
        }
    }
    static AtomEndpointBuilder endpointBuilder(String componentName, String path) {
        class AtomEndpointBuilderImpl extends AbstractEndpointBuilder implements AtomEndpointBuilder, AdvancedAtomEndpointBuilder {
            public AtomEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new AtomEndpointBuilderImpl(path);
    }
}