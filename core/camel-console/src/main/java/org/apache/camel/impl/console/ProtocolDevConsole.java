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
package org.apache.camel.impl.console;

import org.apache.camel.Consumer;
import org.apache.camel.Endpoint;
import org.apache.camel.Route;
import org.apache.camel.spi.EndpointServiceLocation;
import org.apache.camel.spi.EndpointRegistry;
import org.apache.camel.spi.RuntimeEndpointRegistry;
import org.apache.camel.spi.annotations.DevConsole;
import org.apache.camel.support.DefaultConsumer;
import org.apache.camel.support.console.AbstractDevConsole;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@DevConsole(name = "protocol", displayName = "Protocols", description = "Protocols used for network communication with clients")
public class ProtocolDevConsole extends AbstractDevConsole {

    public ProtocolDevConsole() {
        super("camel", "protocol", "Protocols", "Protocols used for network communication with clients");
    }

    @Override
    protected String doCallText(Map<String, Object> options) {
        StringBuilder sb = new StringBuilder();

        // runtime registry is optional but if enabled we have additional statistics to use in output
        List<RuntimeEndpointRegistry.Statistic> stats = null;
        RuntimeEndpointRegistry runtimeReg = getCamelContext().getRuntimeEndpointRegistry();
        if (runtimeReg != null) {
            stats = runtimeReg.getEndpointStatistics();
        }
        EndpointRegistry reg = getCamelContext().getEndpointRegistry();

        // find all consumers (IN) direction
        for (Route route : getCamelContext().getRoutes()) {
            Consumer consumer = route.getConsumer();
            Endpoint endpoint = consumer.getEndpoint();
            if (endpoint instanceof EndpointServiceLocation raa) {
                String component = endpoint.getComponent().getDefaultName();
                boolean hosted = false;
                if (consumer instanceof DefaultConsumer dc) {
                    hosted = dc.isHostedService();
                }
                String adr = raa.getServiceUrl();
                String protocol = raa.getServiceProtocol();
                if (adr != null) {
                    var stat = findStats(stats, endpoint.getEndpointUri(), "in");
                    var uri = endpoint.toString();
                    printLine(sb, component, stat, "in", hosted, protocol, adr, uri);
                }
            }
        }

        // find all endpoint (OUT) direction
        for (Endpoint endpoint : reg.getReadOnlyValues()) {
            if (endpoint instanceof EndpointServiceLocation raa) {
                String component = endpoint.getComponent().getDefaultName();
                boolean hosted = false;
                String adr = raa.getServiceUrl();
                String protocol = raa.getServiceProtocol();
                if (adr != null) {
                    var stat = findStats(stats, endpoint.getEndpointUri(), "in");
                    // skip IN as already found via consumer (platform-http is only IN)
                    boolean skip = "platform-http".equals(component) || stat.isPresent() && "in".equals(stat.get().getDirection());
                    if (!skip) {
                        var uri = endpoint.toString();
                        printLine(sb, component, stat, "in", hosted, protocol, adr, uri);
                    }
                }
            }
        }

        sb.append("\n");

        return sb.toString();
    }

    private static void printLine(StringBuilder sb, String component, Optional<RuntimeEndpointRegistry.Statistic> stat,
                                  String dir, boolean hosted, String protocol, String adr, String uri) {

        long total = 0;
        if (stat.isPresent()) {
            dir = stat.get().getDirection();
            total = stat.get().getHits();
        }

        if (!sb.isEmpty()) {
            sb.append("\n");
        }
        sb.append(String.format("\n    Component: %s", component));
        sb.append(String.format("\n    Direction: %s", dir));
        sb.append(String.format("\n    Hosted Service: %b", hosted));
        sb.append(String.format("\n    Usage: %d", total));
        sb.append(String.format("\n    Protocol: %s", protocol));
        sb.append(String.format("\n    Service: %s", adr));
        sb.append(String.format("\n    Endpoint Uri: %s", uri));
    }

    @Override
    protected Map<String, Object> doCallJson(Map<String, Object> options) {
        // TODO:
        return null;
    }

    private static Optional<RuntimeEndpointRegistry.Statistic> findStats(
            List<RuntimeEndpointRegistry.Statistic> stats, String uri, String direction) {
        if (stats == null) {
            return Optional.empty();
        }
        return stats.stream()
                .filter(s -> uri.equals(s.getUri()) && (direction == null || s.getDirection().equals(direction)))
                .findFirst();
    }

}
