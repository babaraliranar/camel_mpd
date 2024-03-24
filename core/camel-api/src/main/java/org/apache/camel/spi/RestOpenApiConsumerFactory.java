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
package org.apache.camel.spi;

import org.apache.camel.CamelContext;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;

import java.util.Map;

/**
 * Allows SPI to plugin a {@link RestOpenApiConsumerFactory} that creates the Camel {@link Consumer} responsible for handling
 * incoming HTTP requests from clients that request to access REST services which has been created using the
 * <a href="http://camel.apache.org/rest-dsl">rest-dsl</a> for an entire open-api specification.
 *
 * @see RestApiConsumerFactory
 * @see RestOpenApiConsumerFactory
 * @see RestApiProcessorFactory
 */
public interface RestOpenApiConsumerFactory {

    /**
     * Creates a new REST <a href="http://camel.apache.org/event-driven-consumer.html">Event Driven Consumer</a>, which
     * consumes messages from the endpoint using the given processor
     *
     * @param  camelContext  the camel context
     * @param  processor     the processor
     * @param  contextPath  the context-path
     * @param  configuration REST configuration
     * @param  parameters    additional parameters
     * @return               a newly created REST consumer
     * @throws Exception     can be thrown
     */
    Consumer createConsumer(
            CamelContext camelContext, Processor processor, String contextPath,
            RestConfiguration configuration, Map<String, Object> parameters)
            throws Exception;
}
