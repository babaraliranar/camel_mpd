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
package org.apache.camel.component.file.remote;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.file.FileComponent;
import org.apache.camel.component.mock.MockEndpoint;

/**
 * @version $Revision$
 */
public class FtpConsumerMultipleDirectoriesTest extends FtpServerTestSupport {

    private String getFtpUrl() {
        return "ftp://admin@localhost:" + getPort() + "/multidir/?password=admin&recursive=true&consumer.delay=5000&sortBy=file:path";
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        deleteDirectory("./res/home/multidir");
        prepareFtpServer();
    }

    private void prepareFtpServer() throws Exception {
        template.sendBodyAndHeader(getFtpUrl(), "Bye World", FileComponent.HEADER_FILE_NAME, "bye.txt");
        template.sendBodyAndHeader(getFtpUrl(), "Hello World", FileComponent.HEADER_FILE_NAME, "sub/hello.txt");
        template.sendBodyAndHeader(getFtpUrl(), "Godday World", FileComponent.HEADER_FILE_NAME, "sub/sub2/godday.txt");
    }

    public void testMultiDir() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedBodiesReceived("Bye World", "Hello World", "Godday World");

        assertMockEndpointsSatisfied();

        RemoteFileExchange exchange = (RemoteFileExchange) mock.getExchanges().get(0);
        RemoteFile file = exchange.getRemoteFile();
        assertEquals("multidir/bye.txt", file.getAbsolutelFileName());
        assertEquals("bye.txt", file.getRelativeFileName());
        assertEquals("bye.txt", file.getFileName());

        exchange = (RemoteFileExchange) mock.getExchanges().get(1);
        file = exchange.getRemoteFile();
        assertEquals("multidir/sub/hello.txt", file.getAbsolutelFileName());
        assertEquals("sub/hello.txt", file.getRelativeFileName());
        assertEquals("hello.txt", file.getFileName());

        exchange = (RemoteFileExchange) mock.getExchanges().get(2);
        file = exchange.getRemoteFile();
        assertEquals("multidir/sub/sub2/godday.txt", file.getAbsolutelFileName());
        assertEquals("sub/sub2/godday.txt", file.getRelativeFileName());
        assertEquals("godday.txt", file.getFileName());
    }

    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() throws Exception {
                from(getFtpUrl()).to("mock:result");
            }
        };
    }

}