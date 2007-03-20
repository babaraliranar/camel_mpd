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

/**
 * Represents an endpoint on which messages can be exchanged
 *
 * @version $Revision$
 */
public interface Endpoint<E>  {

    /**
     * Returns the string representation of the URI
     */
    public String getEndpointUri();

    /**
     * Sends the message exchange to this endpoint
     */
    void send(E exchange);

    /**
     * Sets the processor for inbound messages
     */
    void setInboundProcessor(Processor<E> processor);
    
    /**
     * Create a new exchange for communicating with this endpoint
     */
    E createExchange();


    /**
     * Called by the container when an endpoint is activiated
     */
    void activate();

    /**
     * Called by the container when the endpoint is deactivated
     */
    void deactivate();
}
