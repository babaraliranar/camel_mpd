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

package org.apache.camel.model;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.AdviceWith;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.builder.RouteConfigurationBuilder;
import org.apache.camel.builder.TemplatedRouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

public class RouteConfigurationOnExceptionTest extends ContextTestSupport {

    @Override
    public boolean isUseRouteBuilder() {
        return false;
    }

    @Test
    public void testGlobal() throws Exception {
        context.addRoutes(new RouteConfigurationBuilder() {
            @Override
            public void configuration() throws Exception {
                routeConfiguration("my-error-handler").onException(Exception.class)
                        .handled(true)
                        .log(LoggingLevel.ERROR, log, "--> Exception: ${exception.message}, Delivery was NOT rolled back");
            }
        });
        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                routeTemplate("route-template-1")
                        .templateParameter("route_url-1")
                        .templateParameter("route_url-2")
                        .templateParameter("route-id-param-id")

                        .from("direct:{{route_url-1}}")
                        .routeConfigurationId("my-error-handler")
                        .end()

                        .log(LoggingLevel.INFO, log, "--> Executing")
                        .to("direct:{{route_url-2}}")
                        .id("{{route-id-param-id}}")
                        .log(LoggingLevel.INFO, log, "--> Executed!");
            }
        });

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {

                from("direct:start2")
                        .to("mock:result2");
            }
        });

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                final String routeId = TemplatedRouteBuilder.builder(context, "route-template-1")
                        .routeId("my-test-file-route")
                        .parameter("route_url-1", "start")
                        .parameter("route_url-2", "startWrong")
                        .parameter("route-id-param-id", "my-internal-route-id")
                        .add();
            }
        });

        MockEndpoint mockEndpoint = getMockEndpoint("mock:endpointMock");
        AdviceWith.adviceWith(context, "my-test-file-route", routeBuilder -> {
            routeBuilder.replaceFromWith("direct:start");
            routeBuilder.weaveAddLast().to(mockEndpoint);
            routeBuilder.setLogRouteAsXml(false);
        });

        context.start();

        final String testMsg = "{ test msg }";

        mockEndpoint.expectedMessageCount(0);
        template.sendBody("direct:start", testMsg);
        mockEndpoint.assertIsSatisfied();

    }
}
