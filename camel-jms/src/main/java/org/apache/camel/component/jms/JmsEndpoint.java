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
package org.apache.camel.component.jms;

import org.apache.camel.CamelContext;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.impl.DefaultEndpoint;
import org.springframework.jms.core.JmsOperations;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.AbstractMessageListenerContainer;

import javax.jms.Message;

/**
 * @version $Revision:520964 $
 */
public class JmsEndpoint extends DefaultEndpoint<JmsExchange> {
    private JmsBinding binding;
    private String destination;
    private final boolean pubSubDomain;
    private String selector;
    private JmsConfiguration configuration;

    public JmsEndpoint(String uri, CamelContext context, String destination, boolean pubSubDomain, JmsConfiguration configuration) {
        super(uri, context);
        this.configuration = configuration;
        this.destination = destination;
        this.pubSubDomain = pubSubDomain;
    }

    public Producer<JmsExchange> createProducer() throws Exception {
        JmsOperations template = configuration.createJmsOperations(pubSubDomain, destination);
        return createProducer(template);
    }

    /**
     * Creates a producer using the given template
     */
    public Producer<JmsExchange> createProducer(JmsOperations template) throws Exception {
        if (template instanceof JmsTemplate) {
            JmsTemplate jmsTemplate = (JmsTemplate) template;
            jmsTemplate.setPubSubDomain(pubSubDomain);
            jmsTemplate.setDefaultDestinationName(destination);
        }
        return startService(new JmsProducer(this, template));
    }

    public Consumer<JmsExchange> createConsumer(Processor<JmsExchange> processor) throws Exception {
        AbstractMessageListenerContainer listenerContainer = configuration.createMessageListenerContainer();
        return createConsumer(processor, listenerContainer);
    }

    /**
     * Creates a consumer using the given processor and listener container
     *
     * @param processor the processor to use to process the messages
     * @param listenerContainer the listener container
     * @return a newly created consumer
     * @throws Exception if the consumer cannot be created
     */
    public Consumer<JmsExchange> createConsumer(Processor<JmsExchange> processor, AbstractMessageListenerContainer listenerContainer) throws Exception {
        listenerContainer.setDestinationName(destination);
        listenerContainer.setPubSubDomain(pubSubDomain);

        // TODO support optional parameters
        // selector

        return startService(new JmsConsumer(this, processor, listenerContainer));
    }

    public JmsExchange createExchange() {
        return new JmsExchange(getContext(), getBinding());
    }

    public JmsExchange createExchange(Message message) {
        return new JmsExchange(getContext(), getBinding(), message);
    }

    // Properties
    //-------------------------------------------------------------------------
    public JmsBinding getBinding() {
        if (binding == null) {
            binding = new JmsBinding();
        }
        return binding;
    }

    /**
     * Sets the binding used to convert from a Camel message to and from a JMS message
     *
     * @param binding the binding to use
     */
    public void setBinding(JmsBinding binding) {
        this.binding = binding;
    }

    public String getDestination() {
        return destination;
    }

    public JmsConfiguration getConfiguration() {
        return configuration;
    }

    public String getSelector() {
        return selector;
    }

    /**
     * Sets the JMS selector to use
     */
    public void setSelector(String selector) {
        this.selector = selector;
    }
}
