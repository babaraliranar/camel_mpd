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
package org.apache.camel.component.sjms.producer;

import java.util.UUID;

import jakarta.jms.Connection;
import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageConsumer;
import jakarta.jms.MessageListener;
import jakarta.jms.MessageProducer;
import jakarta.jms.Session;
import jakarta.jms.TextMessage;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.component.sjms.SjmsComponent;
import org.apache.camel.component.sjms.jms.DefaultDestinationCreationStrategy;
import org.apache.camel.component.sjms.jms.DestinationCreationStrategy;
import org.apache.camel.component.sjms.jms.Jms11ObjectFactory;
import org.apache.camel.component.sjms.support.JmsTestSupport;
import org.apache.camel.test.infra.artemis.services.ArtemisService;
import org.apache.camel.test.infra.artemis.services.ArtemisServiceFactory;
import org.apache.camel.test.infra.core.impl.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class InOutTempQueueProducerTest extends CamelTestSupport {
    private DestinationCreationStrategy strategy = new DefaultDestinationCreationStrategy();

    protected ActiveMQConnectionFactory connectionFactory;

    protected Session session;

    @RegisterExtension
    public static ArtemisService service = ArtemisServiceFactory.createSingletonVMService();

    private static final String QUEUE_NAME = "in.out.queue.producer.test.request.InOutTempQueueProducerTest";

    protected boolean useJmx() {
        return true;
    }

    @Test
    public void testInOutQueueProducer() throws Exception {
        MessageConsumer mc = createQueueConsumer(QUEUE_NAME);
        assertNotNull(mc);
        final String requestText = "Hello World!";
        final String responseText = "How are you";
        mc.setMessageListener(new MyMessageListener(requestText, responseText));
        Object responseObject = template.requestBody("sjms:queue:" + QUEUE_NAME + "?exchangePattern=InOut", requestText);
        assertNotNull(responseObject);
        assertTrue(responseObject instanceof String);
        assertEquals(responseText, responseObject);
        mc.close();

    }

    @Test
    public void testInOutQueueProducerWithCorrelationId() throws Exception {
        MessageConsumer mc = createQueueConsumer(QUEUE_NAME);
        assertNotNull(mc);
        final String requestText = "Hello World!";
        final String responseText = "How are you";
        mc.setMessageListener(new MyMessageListener(requestText, responseText));
        final String correlationId = UUID.randomUUID().toString().replace("-", "");
        Exchange exchange = template.request("sjms:queue:" + QUEUE_NAME + "?exchangePattern=InOut", exchange1 -> {
            exchange1.getIn().setBody(requestText);
            exchange1.getIn().setHeader("JMSCorrelationID", correlationId);
        });
        assertNotNull(exchange);
        assertTrue(exchange.getIn().getBody() instanceof String);
        assertEquals(responseText, exchange.getMessage().getBody());
        assertEquals(correlationId, exchange.getMessage().getHeader("JMSCorrelationID", String.class));
        mc.close();

    }

    @Override
    protected void configureCamelContext(CamelContext camelContext) throws Exception {
        connectionFactory = new ActiveMQConnectionFactory(service.serviceAddress());

        Connection connection = connectionFactory.createConnection();
        connection.start();
        session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);

        SjmsComponent component = new SjmsComponent();
        component.setConnectionFactory(connectionFactory);
        camelContext.addComponent("sjms", component);
    }

    public MessageConsumer createQueueConsumer(String destination) throws Exception {
        return new Jms11ObjectFactory().createMessageConsumer(session,
                strategy.createDestination(session, destination, false), null, false, null, true, false);
    }

    protected class MyMessageListener implements MessageListener {
        private String requestText;
        private String responseText;

        public MyMessageListener(String request, String response) {
            this.requestText = request;
            this.responseText = response;
        }

        @Override
        public void onMessage(Message message) {
            try {
                TextMessage request = (TextMessage) message;
                assertNotNull(request);
                String text = request.getText();
                assertEquals(requestText, text);

                TextMessage response = session.createTextMessage();
                response.setText(responseText);
                response.setJMSCorrelationID(request.getJMSCorrelationID());
                MessageProducer mp = session.createProducer(message.getJMSReplyTo());
                mp.send(response);
                mp.close();
            } catch (JMSException e) {
                fail(e.getLocalizedMessage());
            }
        }
    }
}
