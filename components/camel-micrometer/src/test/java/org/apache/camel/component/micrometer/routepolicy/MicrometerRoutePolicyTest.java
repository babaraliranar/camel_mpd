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
package org.apache.camel.component.micrometer.routepolicy;

import java.util.List;
import io.micrometer.core.instrument.Meter;
import io.micrometer.core.instrument.Timer;
import org.apache.camel.builder.RouteBuilder;
import org.junit.Test;

public class MicrometerRoutePolicyTest extends AbstractMicrometerRoutePolicyTest {

    @Test
    public void testMetricsRoutePolicy() throws Exception {
        getMockEndpoint("mock:result").expectedMessageCount(10);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                template.sendBody("seda:foo", "Hello " + i);
            } else {
                template.sendBody("seda:bar", "Hello " + i);
            }
        }

        assertMockEndpointsSatisfied();

        // there should be 2 names
        List<Meter> meters = registry.getMeters();
        assertEquals(2, meters.size());
        meters.forEach(meter -> assertTrue(meter instanceof Timer));
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("seda:foo").routeId("foo")
                    .to("mock:result");

                from("seda:bar").routeId("bar")
                    .to("mock:result");
            }
        };
    }
}
