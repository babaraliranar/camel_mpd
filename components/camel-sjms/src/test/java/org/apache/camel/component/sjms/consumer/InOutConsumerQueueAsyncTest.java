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
package org.apache.camel.component.sjms.consumer;

import jakarta.jms.Connection;
import jakarta.jms.Session;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.Exchange;
import org.apache.camel.ExchangePattern;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.sjms.SjmsComponent;
import org.apache.camel.component.sjms.support.JmsTestSupport;
import org.apache.camel.test.infra.artemis.services.ArtemisService;
import org.apache.camel.test.infra.artemis.services.ArtemisServiceFactory;
import org.apache.camel.test.infra.core.annotations.RouteFixture;
import org.apache.camel.test.infra.core.impl.CamelTestSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class InOutConsumerQueueAsyncTest extends CamelTestSupport {

    protected ActiveMQConnectionFactory connectionFactory;

    protected Session session;

    @RegisterExtension
    public static ArtemisService service = ArtemisServiceFactory.createSingletonVMService();

    @Test
    public void testAsync() throws Exception {
        getMockEndpoint("mock:result").expectedBodiesReceived("Hello World", "Hello Camel");

        template.sendBody("sjms:start.queue.InOutConsumerQueueAsyncTest", "Hello Camel");
        template.sendBody("sjms:start.queue.InOutConsumerQueueAsyncTest", "Hello World");

        MockEndpoint.assertIsSatisfied(context);
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

    @Override
    @RouteFixture
    public void createRouteBuilder(CamelContext context) throws Exception {
        final RouteBuilder routeBuilder = createRouteBuilder();

        if (routeBuilder != null) {
            context.addRoutes(routeBuilder);
        }
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from("sjms:queue:start.queue.InOutConsumerQueueAsyncTest?asyncConsumer=true")
                        .log("Requesting ${body} with thread ${threadName}")
                        .to(ExchangePattern.InOut,
                                "sjms:queue:in.out.queue.InOutConsumerQueueAsyncTest?replyToConcurrentConsumers=2&replyTo=in.out.queue.response")
                        .log("Result ${body} with thread ${threadName}")
                        .to("mock:result");

                from("sjms:queue:in.out.queue.InOutConsumerQueueAsyncTest?concurrentConsumers=2").to("log:before")
                        .log("Replying ${body} with thread ${threadName}")
                        .process(new Processor() {
                            public void process(Exchange exchange) throws Exception {
                                String body = (String) exchange.getIn().getBody();
                                if (body.contains("Camel")) {
                                    Thread.sleep(2000);
                                }
                            }
                        });
            }
        };
    }

}
