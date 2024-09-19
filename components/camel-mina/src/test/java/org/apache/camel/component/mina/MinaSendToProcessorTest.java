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
package org.apache.camel.component.mina;

import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MinaSendToProcessorTest extends BaseMinaTest {

    private RouteBuilder getRouteBuilder(String uri) {
        return new RouteBuilder() {

            @Override
            public void configure() {
                from("direct:start")
                        .toF(uri, getPort());
            }
        };
    }

    @Test
    public void testConnectionOnStartupTest() throws Exception {
        context.addRoutes(getRouteBuilder("mina:tcp://localhost:%1$s?sync=false&lazySessionCreation=false"));

        assertThrows(Exception.class, () -> context.start(), "Should have thrown an exception");
    }

    @Test
    public void testConnectionOnSendMessage() throws Exception {
        context.addRoutes(getRouteBuilder("mina:tcp://localhost:%1$s?sync=false"));

        assertDoesNotThrow(() -> context.start(), "Should not have thrown an exception");
    }

    @Override
    public void configureTest(org.apache.camel.test.junit5.TestExecutionConfiguration testExecutionConfiguration) {
        super.configureTest(testExecutionConfiguration);

        testConfigurationBuilder.withUseRouteBuilder(false);
    }
}
