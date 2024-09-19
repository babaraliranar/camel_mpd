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
package org.apache.camel.component.microprofile.faulttolerance;

import org.apache.camel.RuntimeCamelException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.Test;

import static org.apache.camel.test.junit5.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FaultToleranceRouteFallbackViaNetworkTest extends CamelTestSupport {

    @Override
    public void configureTest(org.apache.camel.test.junit5.TestExecutionConfiguration testExecutionConfiguration) {
        super.configureTest(testExecutionConfiguration);

        testConfigurationBuilder.withUseRouteBuilder(false);
    }

    @Test
    public void testFaultTolerance() throws Exception {
        context.addRoutes(createRouteBuilder());

        RuntimeCamelException exception = assertThrows(RuntimeCamelException.class, () -> context.start());
        assertIsInstanceOf(UnsupportedOperationException.class, exception.getCause());
        assertEquals("camel-microprofile-fault-tolerance does not support onFallbackViaNetwork",
                exception.getCause().getMessage());
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").to("log:start").circuitBreaker().throwException(new IllegalArgumentException("Forced"))
                        .onFallbackViaNetwork().transform()
                        .constant("Fallback message").end().to("log:result").to("mock:result");
            }
        };
    }

}
