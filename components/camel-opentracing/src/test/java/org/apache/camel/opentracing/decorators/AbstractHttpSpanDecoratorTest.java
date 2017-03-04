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
package org.apache.camel.opentracing.decorators;

import static org.junit.Assert.*;

import java.net.URI;

import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.opentracing.SpanDecorator;
import org.junit.Test;
import org.mockito.Mockito;

import io.opentracing.mock.MockSpan;
import io.opentracing.mock.MockTracer;
import io.opentracing.tag.Tags;

public class AbstractHttpSpanDecoratorTest {

    private static final String TEST_URI = "http://localhost:8080/test";

    @Test
    public void testGetOperationNameFromMethodHeader() {
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_METHOD)).thenReturn("PUT");

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals("PUT", decorator.getOperationName(exchange, null));
    }

    @Test
    public void testGetOperationNameQueryStringHeader() {
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_QUERY)).thenReturn("MyQuery");

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(AbstractHttpSpanDecorator.GET_METHOD,
                decorator.getOperationName(exchange, null));
    }

    @Test
    public void testGetOperationNameQueryStringInEndpoint() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn("http://localhost:8080/endpoint?query=hello");
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn("http://localhost:8080/endpoint?query=hello");

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(AbstractHttpSpanDecorator.GET_METHOD,
                decorator.getOperationName(exchange, endpoint));
    }

    @Test
    public void testGetOperationNameBodyNotNull() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn(TEST_URI);
        Mockito.when(message.getBody()).thenReturn("Message Body");

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(AbstractHttpSpanDecorator.POST_METHOD,
                decorator.getOperationName(exchange, endpoint));
    }

    @Test
    public void testGetOperationNameDefault() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn(TEST_URI);

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(AbstractHttpSpanDecorator.GET_METHOD,
                decorator.getOperationName(exchange, endpoint));
    }

    @Test
    public void testPreUri() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn(TEST_URI);

        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        MockTracer tracer = new MockTracer();
        MockSpan span = (MockSpan)tracer.buildSpan("TestSpan").start();

        decorator.pre(span, exchange, endpoint);

        assertEquals(TEST_URI, span.tags().get(Tags.HTTP_URL.getKey()));
    }

    @Test
    public void testGetHttpURLFromHeaderUrl() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn("Another URL");
        Mockito.when(message.getHeader(Exchange.HTTP_URL)).thenReturn(TEST_URI);

        AbstractHttpSpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(TEST_URI, decorator.getHttpURL(exchange, endpoint));
    }

    @Test
    public void testGetHttpURLFromHeaderUri() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_URI)).thenReturn(TEST_URI);

        AbstractHttpSpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(TEST_URI, decorator.getHttpURL(exchange, endpoint));
    }

    @Test
    public void testGetHttpURLFromEndpointUri() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn(TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);

        AbstractHttpSpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(TEST_URI, decorator.getHttpURL(exchange, endpoint));
    }

    @Test
    public void testGetHttpURLFromEndpointUriWithAdditionalScheme() {
        Endpoint endpoint = Mockito.mock(Endpoint.class);
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(endpoint.getEndpointUri()).thenReturn("netty-http:" + TEST_URI);
        Mockito.when(exchange.getIn()).thenReturn(message);

        AbstractHttpSpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        assertEquals(TEST_URI, decorator.getHttpURL(exchange, endpoint));
    }

    @Test
    public void testPostResponseCode() {
        Exchange exchange = Mockito.mock(Exchange.class);
        Message message = Mockito.mock(Message.class);

        Mockito.when(exchange.hasOut()).thenReturn(true);
        Mockito.when(exchange.getOut()).thenReturn(message);
        Mockito.when(message.getHeader(Exchange.HTTP_RESPONSE_CODE)).thenReturn(200);
        
        SpanDecorator decorator = new AbstractHttpSpanDecorator() {
            @Override
            public String getComponent() {
                return null;
            }
        };

        MockTracer tracer = new MockTracer();
        MockSpan span = (MockSpan)tracer.buildSpan("TestSpan").start();

        decorator.post(span, exchange, null);

        assertEquals(200, span.tags().get(Tags.HTTP_STATUS.getKey()));
    }

}
