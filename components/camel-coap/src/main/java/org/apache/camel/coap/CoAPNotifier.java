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
package org.apache.camel.coap;

import java.net.URI;

import org.apache.camel.Exchange;
import org.apache.camel.support.DefaultProducer;
import org.eclipse.californium.core.CoapClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The CoAP notifier.
 */
public class CoAPNotifier extends DefaultProducer {

    private static final Logger LOG = LoggerFactory.getLogger(CoAPNotifier.class);

    private final CoAPEndpoint endpoint;
    private CoapClient client;

    public CoAPNotifier(CoAPEndpoint endpoint) {
        super(endpoint);
        this.endpoint = endpoint;
    }

    @Override
    public void process(Exchange exchange) throws Exception {
        URI uri = exchange.getIn().getHeader(CoAPConstants.COAP_URI, URI.class);
        if (uri == null) {
            uri = endpoint.getUri();
        }
        CamelCoapResource resource = endpoint.getCamelCoapResource(uri.getPath());
        if (resource == null) {
            throw new IllegalStateException("Resource not found: " + endpoint.getUri());
        }
        if (!resource.isObservable()) {
            LOG.warn("Ignoring notification attempt for resource that is not observable: " + endpoint.getUri());
            return;
        }
        resource.changed();
    }

}
