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
package org.apache.camel;

import java.util.concurrent.ScheduledExecutorService;

/**
 * Implements the <a href="http://activemq.apache.org/camel/message-endpoint.html">Message Endpoint</a>
 * pattern and represents an endpoint that can send and receive message exchanges
 *
 * @version $Revision$
 */
public interface Endpoint<E extends Exchange> {

    /**
     * Returns the string representation of the endpoint URI
     */
    public String getEndpointUri();
    
    /**
     * Create a new exchange for communicating with this endpoint
     */
    E createExchange();

    /**
     * Creates a new exchange for communicating with this exchange using the given exchange to pre-populate the values
     * of the headers and messages
     */
    E createExchange(E exchange);

    /**
     * Returns the context which created the endpoint
     *
     * @return the context which created the endpoint
     */
    CamelContext getContext();

    /**
     * Creates a new producer which is used send messages into the endpoint
     *
     * @return a newly created producer
     */
    Producer<E> createProducer() throws Exception;

    /**
     * Creates a new consumer which consumes messages from the endpoint using the given processor
     *
     * @return a newly created consumer
     */
    Consumer<E> createConsumer(Processor<E> processor) throws Exception;

    /**
     * Returns the executor for this endpoint which typically defaults to the components executor
     *
     * @return the executor for this endpoint
     */
    ScheduledExecutorService getExecutorService();
}
