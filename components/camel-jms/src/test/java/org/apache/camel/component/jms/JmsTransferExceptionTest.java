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
package org.apache.camel.component.jms;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.camel.CamelContext;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import static org.apache.camel.component.jms.JmsComponent.jmsComponentClientAcknowledge;

/**
 * @version $Revision$
 */
public class JmsTransferExceptionTest extends ContextTestSupport {

    private static int counter;

    protected String getUri() {
        return "activemq:queue:foo?transferException=true";
    }

    @Override
    protected void setUp() throws Exception {
        counter = 0;
        super.setUp();
    }

    public void testOk() throws Exception {
        Object out = template.requestBody(getUri(), "Hello World");
        assertEquals("Bye World", out);

        assertEquals(1, counter);
    }

    public void testTransferExeption() throws Exception {
        // should fail as we thrown an exception
        MockEndpoint dead = getMockEndpoint("mock:dead");
        dead.expectedMessageCount(1);

        // we send something that causes a remote exception
        // then we expect our producer template to thrown
        // an exception with the remote exception as cause
        try {
            template.requestBody(getUri(), "Kabom");
            fail("Should have thrown an exception");
        } catch (RuntimeCamelException e) {
            assertEquals("Boom", e.getCause().getMessage());
            assertNotNull("Should contain a remote stacktrace", e.getCause().getStackTrace());
        }

        assertMockEndpointsSatisfied();

        // we still try redeliver
        assertEquals(3, counter);
    }

    protected CamelContext createCamelContext() throws Exception {
        CamelContext camelContext = super.createCamelContext();

        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("vm://localhost?broker.persistent=false");
        camelContext.addComponent("activemq", jmsComponentClientAcknowledge(connectionFactory));

        return camelContext;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                errorHandler(deadLetterChannel("mock:dead").maximumRedeliveries(2).delay(0).logStackTrace(false));

                from(getUri())
                        .process(new Processor() {
                            public void process(Exchange exchange) throws Exception {
                                counter++;

                                String body = exchange.getIn().getBody(String.class);
                                if (body.equals("Kabom")) {
                                    throw new IllegalArgumentException("Boom");
                                }
                                exchange.getOut().setBody("Bye World");
                            }
                        });
            }
        };
    }

}