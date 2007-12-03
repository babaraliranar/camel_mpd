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
package org.apache.camel.component.atom;

import java.util.List;

import org.apache.abdera.model.Entry;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @version $Revision: 1.1 $
 */
public class AtomRouteTest extends ContextTestSupport {
    private static final transient Log LOG = LogFactory.getLog(AtomRouteTest.class);

    public void testFeedGetsUpdatedEvents() throws Exception {
        MockEndpoint endpoint = getMockEndpoint("mock:results");
        endpoint.expectedMessageCount(7);

        assertMockEndpointsSatisifed();

        List<Exchange> list = endpoint.getReceivedExchanges();
        String[] expectedTitles = {
                "Speaking at the Irish Java Technology Conference on Thursday and Friday",
                "a great presentation on REST, JAX-WS and JSR 311",
                "my slides on ActiveMQ and Camel from last weeks Dublin Conference",
                "webcast today on Apache ActiveMQ",
                "Feedback on my Camel talk at the IJTC conference",
                "More thoughts on RESTful Message Queues",
                "ActiveMQ webinar archive available"
        };
        int counter = 0;
        for (Exchange exchange : list) {
            Entry entry = exchange.getIn().getBody(Entry.class);
            assertNotNull("No entry found for exchange: " + exchange);

            String expectedTitle = expectedTitles[counter];
            String title = entry.getTitle();
            assertEquals("Title of message " + counter, expectedTitle, title);

            LOG.debug("<<<< " + entry);

            counter++;
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from("atom:file:src/test/data/feed.atom").to("mock:results");
            }
        };
    }
}
