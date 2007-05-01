/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.file;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import junit.framework.TestCase;
import org.apache.camel.CamelContext;
import org.apache.camel.Endpoint;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @version $Revision: 529902 $
 */
public class FileRouteTest extends TestCase {
    private static final transient Log log = LogFactory.getLog(FileRouteTest.class);
    protected CamelContext container = new DefaultCamelContext();
    protected CountDownLatch latch = new CountDownLatch(1);
    protected Exchange receivedExchange;
    protected String uri = "file://target/foo.txt";
    protected Producer<FileExchange> producer;

    
    public void testFileRoute() throws Exception {

        // now lets fire in a message
        Endpoint<FileExchange> endpoint = container.getEndpoint(uri);
        FileExchange exchange = endpoint.createExchange();
        Message message = exchange.getIn();
        message.setBody("Hello there!");
        message.setHeader("cheese", 123);

        producer = endpoint.createProducer();
        producer.process(exchange);

        // now lets sleep for a while
        boolean received = latch.await(5000, TimeUnit.SECONDS);
        assertTrue("Did not receive the message!", received);
    }

    @Override
    protected void setUp() throws Exception {
        container.addRoutes(createRouteBuilder());
        container.start();
    }


    @Override
    protected void tearDown() throws Exception {
        if (producer != null) {
            producer.stop();
        }
        container.stop();
    }

    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            public void configure() {
                from(uri).process(new Processor() {
                    public void process(Exchange e) {
                        System.out.println("Received exchange: " + e.getIn());
                        receivedExchange = e;
                        latch.countDown();
                    }
                });
            }
        };
    }
}
