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
package org.apache.camel.processor.interceptor;

import java.io.Serializable;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.model.ProcessorType;
import org.apache.camel.util.MessageHelper;

/**
 * A trace event message that contains decomposited information about the traced
 * {@link Exchange} at the point of interception. The information is stored as snapshot copies
 * using String types.
 */
public final class TraceEventMessage implements Serializable {

    private String fromEndpointUri;
    private String node;
    private String exchangeId;
    private String shortExchangeId;
    private String exchangePattern;
    private String properties;
    private String headers;
    private String body;
    private String bodyType;
    private String outBody;
    private String outBodyType;
    private String exception;

    /**
     * Creates a {@link TraceEventMessage} based on the given node it was traced while processing
     * the current {@link Exchange}
     *
     * @param node  the node where this trace is intercepted
     * @param exchange the current {@link Exchange}
     */
    public TraceEventMessage(final ProcessorType node, final Exchange exchange) {
        Message in = exchange.getIn();

        // false because we don't want to introduce side effects
        Message out = exchange.getOut(false);

        // need to use defensive copies to avoid Exchange altering after the point of interception
        this.fromEndpointUri = exchange.getFromEndpoint() != null ? exchange.getFromEndpoint().getEndpointUri() : null;
        this.node = extractNode(node);
        this.exchangeId = exchange.getExchangeId();
        this.shortExchangeId = extractShortExchangeId(exchange);
        this.exchangePattern = exchange.getPattern().toString();
        this.properties = exchange.getProperties().isEmpty() ? null : exchange.getProperties().toString();
        this.headers = in.getHeaders().isEmpty() ? null : in.getHeaders().toString();
        this.body = MessageHelper.extractBodyAsString(in);
        this.bodyType = MessageHelper.getBodyTypeName(in);
        this.outBody = MessageHelper.extractBodyAsString(out);
        this.outBodyType = MessageHelper.getBodyTypeName(out);
        this.exception = exchange.getException() != null ? exchange.getException().toString() : null;
    }

    // Implementation
    //---------------------------------------------------------------
    private String extractNode(ProcessorType node) {
        return node.getShortName() + "(" + node.getLabel() + ")";
    }

    private String extractShortExchangeId(Exchange exchange) {
        return exchange.getExchangeId().substring(exchange.getExchangeId().indexOf("/") + 1);
    }

    // Properties
    //---------------------------------------------------------------

    public String getFromEndpointUri() {
        return fromEndpointUri;
    }

    public String getNode() {
        return node;
    }

    public String getExchangeId() {
        return exchangeId;
    }

    public String getShortExchangeId() {
        return shortExchangeId;
    }

    public String getExchangePattern() {
        return exchangePattern;
    }

    public String getProperties() {
        return properties;
    }

    public String getHeaders() {
        return headers;
    }

    public String getBody() {
        return body;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getOutBody() {
        return outBody;
    }

    public String getOutBodyType() {
        return outBodyType;
    }

    public String getException() {
        return exception;
    }

    @Override
    public String toString() {
        return "TraceEventMessage[" + exchangeId + "] for node: " + node;
    }
}
