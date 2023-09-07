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

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.component.sjms.SjmsComponent;
import org.apache.camel.component.sjms.support.MyAsyncComponent;
import org.apache.camel.test.infra.artemis.services.ArtemisService;
import org.apache.camel.test.infra.artemis.services.ArtemisServiceFactory;
import org.apache.camel.test.infra.core.CamelContextExtension;
import org.apache.camel.test.infra.core.annotations.ContextFixture;
import org.apache.camel.test.infra.core.annotations.RouteFixture;
import org.apache.camel.test.infra.core.impl.CamelTestSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 *
 */
public class AsyncConsumerFalseTest extends CamelTestSupport {

    @BeforeEach
    void setupTest() {
        context = camelContextExtension.getContext();
    }

    private static final String SJMS_QUEUE_URI = "sjms:queue:start.AsyncConsumerFalseTest";

    @RegisterExtension
    public static ArtemisService service = ArtemisServiceFactory.createSingletonVMService();

    @Test
    public void testAsyncJmsConsumer() throws Exception {
        // async is disabled (so we should receive in same order)
        getMockEndpoint("mock:result").expectedBodiesReceived("Camel", "Hello World");

        template.sendBody("sjms:queue:start.AsyncConsumerFalseTest", "Hello Camel");
        template.sendBody("sjms:queue:start.AsyncConsumerFalseTest", "Hello World");
        MockEndpoint.assertIsSatisfied(context);
    }


    public void configureContext(CamelContext context) {

        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                service.serviceAddress());
        SjmsComponent component = new SjmsComponent();
        component.setConnectionFactory(connectionFactory);
        context.addComponent("sjms", component);
    }

    @ContextFixture
    public void configureComponent(CamelContext context) {
        context.addComponent("async", new MyAsyncComponent());
    }



    @Override
    @RouteFixture
    public void createRouteBuilder(CamelContext context) throws Exception {
        final RouteBuilder routeBuilder = createRouteBuilder();

        if (routeBuilder != null) {
            context.addRoutes(routeBuilder);
        }
    }

    @RouteFixture
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // disable async in only mode on the consumer
                from(SJMS_QUEUE_URI)
                        .choice()
                        .when(body().contains("Camel"))
                        .to("async:camel?delay=2000")
                        .to("mock:result")
                        .otherwise()
                        .to("mock:result");
            }
        };
    }

}
