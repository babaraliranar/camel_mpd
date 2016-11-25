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
package org.apache.camel.management;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import javax.management.openmbean.TabularData;

import org.apache.camel.ServiceStatus;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;

/**
 */
public class ManagedWeightedLoadBalancerTest extends ManagementTestSupport {

    public void testManageWeightedLoadBalancer() throws Exception {
        // JMX tests dont work well on AIX CI servers (hangs them)
        if (isPlatform("aix")) {
            return;
        }

        MockEndpoint foo = getMockEndpoint("mock:foo");
        foo.expectedMessageCount(1);

        MockEndpoint bar = getMockEndpoint("mock:bar");
        bar.expectedMessageCount(2);

        template.sendBodyAndHeader("direct:start", "Hello World", "foo", "123");
        template.sendBodyAndHeader("direct:start", "Bye World", "foo", "123");
        template.sendBodyAndHeader("direct:start", "Hi World", "foo", "123");

        assertMockEndpointsSatisfied();

        // get the stats for the route
        MBeanServer mbeanServer = getMBeanServer();

        // get the object name for the delayer
        ObjectName on = ObjectName.getInstance("org.apache.camel:context=camel-1,type=processors,name=\"mysend\"");

        // should be on route1
        String routeId = (String) mbeanServer.getAttribute(on, "RouteId");
        assertEquals("route1", routeId);

        String camelId = (String) mbeanServer.getAttribute(on, "CamelId");
        assertEquals("camel-1", camelId);

        String state = (String) mbeanServer.getAttribute(on, "State");
        assertEquals(ServiceStatus.Started.name(), state);

        Integer size = (Integer) mbeanServer.getAttribute(on, "Size");
        assertEquals(2, size.intValue());

        Boolean roundRobin = (Boolean) mbeanServer.getAttribute(on, "RoundRobin");
        assertEquals(true, roundRobin.booleanValue());

        String ratio = (String) mbeanServer.getAttribute(on, "DistributionRatio");
        assertEquals("1,2", ratio);

        String delim = (String) mbeanServer.getAttribute(on, "DistributionRatioDelimiter");
        assertEquals(",", delim);

        String last = (String) mbeanServer.getAttribute(on, "LastChosenProcessorId");
        assertEquals("bar", last);

        TabularData data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{false}, new String[]{"boolean"});
        assertNotNull(data);
        assertEquals(2, data.size());

        data = (TabularData) mbeanServer.invoke(on, "explain", new Object[]{true}, new String[]{"boolean"});
        assertNotNull(data);
        assertEquals(5, data.size());

        String json = (String) mbeanServer.invoke(on, "informationJson", null, null);
        assertNotNull(json);
        assertTrue(json.contains("\"description\": \"Balances message processing among a number of nodes"));
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start")
                    .loadBalance().weighted(true, "1,2").id("mysend")
                        .to("mock:foo").id("foo").to("mock:bar").id("bar");
            }
        };
    }

}
