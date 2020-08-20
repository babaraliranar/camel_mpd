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
package org.apache.camel.parser.java;

import org.apache.camel.builder.RouteBuilder;

public class MyJavaDslRouteBuilder extends RouteBuilder {

    @Override
    public void configure() {
        // setProperty is also a model name but this should not be parsed as part of a Camel route
        System.setProperty("ENV", "src/test/resources/");

        from("direct:start").routeId("bar")
                .log("I was here")
                .setHeader("foo", constant("123"))
                .choice()
                    .when(header("foo"))
                        .to("log:a")
                        .toD("log:a2")
                    .when().header("bar")
                        .toD("log:b")
                    .otherwise()
                        .log("none")
                .end()
                .to("mock:result");
    }
}
