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
package org.apache.camel.component.http;

import org.apache.camel.Exchange;
import org.apache.http.HttpStatus;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.bootstrap.HttpServer;
import org.apache.http.impl.bootstrap.ServerBootstrap;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HttpProducerContentTypeWithSemiColonTest extends BaseHttpTest {

    private static final String CONTENT_TYPE = "multipart/form-data;boundary=---------------------------j2radvtrk";

    private HttpServer localServer;

    private String endpointUrl;

    @Before
    @Override
    public void setUp() throws Exception {
        super.setUp();

        localServer = ServerBootstrap.bootstrap().
                setHttpProcessor(getBasicHttpProcessor()).
                setConnectionReuseStrategy(getConnectionReuseStrategy()).
                setResponseFactory(getHttpResponseFactory()).
                setExpectationVerifier(getHttpExpectationVerifier()).
                setSslContext(getSSLContext()).
                registerHandler("/content", (request, response, context) -> {
                    String contentType = request.getFirstHeader(Exchange.CONTENT_TYPE).getValue();

                    assertEquals(CONTENT_TYPE.replace(";", "; "), contentType);

                    response.setEntity(new StringEntity(contentType, "ASCII"));
                    response.setStatusCode(HttpStatus.SC_OK);
                }).create();
        localServer.start();

        endpointUrl = "http://" + localServer.getInetAddress().getHostName() + ":" + localServer.getLocalPort();
    }

    @After
    @Override
    public void tearDown() throws Exception {
        super.tearDown();

        if (localServer != null) {
            localServer.stop();
        }
    }

    @Test
    public void testContentTypeWithBoundary() throws Exception {
        Exchange out = template.request(endpointUrl + "/content", exchange -> {
            exchange.getIn().setHeader(Exchange.CONTENT_TYPE, CONTENT_TYPE);
            exchange.getIn().setBody("This is content");
        });

        assertNotNull(out);
        assertFalse("Should not fail", out.isFailed());
        assertEquals(CONTENT_TYPE.replace(";", "; "), out.getMessage().getBody(String.class));

    }

    @Test
    public void testContentTypeWithBoundaryWithIgnoreResponseBody() throws Exception {
        Exchange out = template.request(endpointUrl + "/content?ignoreResponseBody=true", exchange -> {
            exchange.getIn().setHeader(Exchange.CONTENT_TYPE, CONTENT_TYPE);
            exchange.getIn().setBody("This is content");
        });

        assertNotNull(out);
        assertFalse("Should not fail", out.isFailed());
        assertNull(out.getMessage().getBody());

    }
}
