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
package org.apache.camel.component.atomix.client;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import io.atomix.resource.Resource;
import org.apache.camel.AsyncCallback;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.component.atomix.AtomixAsyncMessageProcessor;
import org.apache.camel.support.DefaultAsyncProducer;
import org.apache.camel.util.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_ACTION_HAS_RESULT;
import static org.apache.camel.component.atomix.client.AtomixClientConstants.RESOURCE_NAME;

public abstract class AbstractAtomixClientProducer<E extends AbstractAtomixClientEndpoint, R extends Resource>
        extends DefaultAsyncProducer {

    private static final Logger LOG = LoggerFactory.getLogger(AbstractAtomixClientProducer.class);

    private final Map<String, AtomixAsyncMessageProcessor> processors;
    private ConcurrentMap<String, R> resources;

    protected AbstractAtomixClientProducer(E endpoint) {
        super(endpoint);

        this.processors = new HashMap<>();
        this.resources = new ConcurrentHashMap<>();
    }

    @Override
    public boolean process(Exchange exchange, AsyncCallback callback) {
        final Message message = exchange.getIn();
        final String key = getProcessorKey(message);

        AtomixAsyncMessageProcessor processor = this.processors.get(key);
        if (processor != null) {
            try {
                return processor.process(message, callback);
            } catch (Exception e) {
                exchange.setException(e);
            }
        } else {
            exchange.setException(new IllegalArgumentException("No handler for action " + key));
        }

        callback.done(true);
        return true;
    }

    // **********************************
    //
    // **********************************

    @SuppressWarnings("unchecked")
    protected E getAtomixEndpoint() {
        return (E) super.getEndpoint();
    }

    protected void processResult(Message message, AsyncCallback callback, Object result) {
        if (result != null && !(result instanceof Void)) {
            message.setHeader(RESOURCE_ACTION_HAS_RESULT, true);

            String resultHeader = getAtomixEndpoint().getConfiguration().getResultHeader();
            if (resultHeader != null) {
                message.setHeader(resultHeader, result);
            } else {
                message.setBody(result);
            }
        } else {
            message.setHeader(RESOURCE_ACTION_HAS_RESULT, false);
        }

        callback.done(false);
    }

    protected R getResource(Message message) {
        String resourceName = getResourceName(message);

        ObjectHelper.notNull(resourceName, RESOURCE_NAME);

        return resources.computeIfAbsent(resourceName, name -> createResource(name));
    }

    protected abstract String getProcessorKey(Message message);

    protected abstract String getResourceName(Message message);

    protected abstract R createResource(String name);

}
