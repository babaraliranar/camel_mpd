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
package org.apache.camel.impl.health;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.health.HealthCheck;
import org.apache.camel.health.HealthCheckRegistry;
import org.apache.camel.health.HealthCheckRepository;
import org.apache.camel.health.HealthCheckResultBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.junit.Assert;
import org.junit.Test;

public class DefaultHealthCheckRegistryTest {

    @Test
    public void testDefaultHealthCheckRegistry() throws Exception {
        CamelContext context = new DefaultCamelContext();

        DefaultHealthCheckRegistry registry = new DefaultHealthCheckRegistry();
        registry.setCamelContext(context);

        registry.register(new MyHealthCheck("G1", "1"));
        registry.register(new MyHealthCheck("G1", "1"));
        registry.register(new MyHealthCheck("G1", "2"));
        registry.register(new MyHealthCheck("G2", "3"));

        List<HealthCheck> checks = registry.stream().collect(Collectors.toList());
        Assert.assertEquals(3, checks.size());

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();

            Assert.assertEquals(HealthCheck.State.UP, response.getState());
            Assert.assertFalse(response.getMessage().isPresent());
            Assert.assertFalse(response.getError().isPresent());
        }
    }

    @Test
    public void testInjectCamelContext() throws Exception {
        CamelContext context = new DefaultCamelContext();

        HealthCheckRegistry registry = new DefaultHealthCheckRegistry();
        registry.setCamelContext(context);

        registry.register(new MyHealthCheck("G1", "1"));
        registry.register(new MyHealthCheck("G1", "2"));
        registry.register(new MyHealthCheck("G2", "3"));

        context.start();
        registry.start();

        List<HealthCheck> checks = registry.stream().collect(Collectors.toList());
        Assert.assertEquals(3, checks.size());

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();

            Assert.assertEquals(HealthCheck.State.UP, response.getState());
            Assert.assertFalse(response.getMessage().isPresent());
            Assert.assertFalse(response.getError().isPresent());
            Assert.assertSame(context, ((CamelContextAware) check).getCamelContext());
        }
    }

    @Test
    public void testDiscoverFromCamelRegistry() throws Exception {
        CamelContext context = new DefaultCamelContext();

        HealthCheckRegistry registry = new DefaultHealthCheckRegistry();
        registry.setCamelContext(context);

        context.getRegistry().bind("check1", new MyHealthCheck("G1", "1"));
        context.getRegistry().bind("check2", new MyHealthCheck("G1", "2"));
        registry.register(new MyHealthCheck("G2", "3"));

        context.start();
        registry.start();

        List<HealthCheck> checks = registry.stream().collect(Collectors.toList());
        Assert.assertEquals(3, checks.size());

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();

            Assert.assertEquals(HealthCheck.State.UP, response.getState());
            Assert.assertFalse(response.getMessage().isPresent());
            Assert.assertFalse(response.getError().isPresent());
            Assert.assertSame(context, ((CamelContextAware) check).getCamelContext());
        }
    }

    @Test
    public void testResolveContextHealthCheck() throws Exception {
        CamelContext context = new DefaultCamelContext();

        HealthCheckRegistry registry = new DefaultHealthCheckRegistry();
        registry.setCamelContext(context);
        HealthCheck hc = registry.resolveHealthCheckById("context");
        Assert.assertNotNull(hc);
        Assert.assertEquals("camel", hc.getGroup());
        Assert.assertEquals("context", hc.getId());
        Assert.assertTrue(hc instanceof ContextHealthCheck);

        registry.register(hc);
        registry.register(new MyHealthCheck("G1", "1"));
        registry.register(new MyHealthCheck("G1", "2"));
        registry.register(new MyHealthCheck("G2", "3"));

        context.start();
        registry.start();

        List<HealthCheck> checks = registry.stream().collect(Collectors.toList());
        Assert.assertEquals(4, checks.size());

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();

            Assert.assertEquals(HealthCheck.State.UP, response.getState());
            Assert.assertFalse(response.getMessage().isPresent());
            Assert.assertFalse(response.getError().isPresent());
            Assert.assertSame(context, ((CamelContextAware) check).getCamelContext());
        }
    }

    @Test
    public void testResolveRoutesHealthCheck() throws Exception {
        CamelContext context = new DefaultCamelContext();

        HealthCheckRegistry registry = new DefaultHealthCheckRegistry();
        registry.setCamelContext(context);
        HealthCheckRepository hc = registry.resolveHealthCheckRepositoryById("routes");
        Assert.assertNotNull(hc);
        Assert.assertEquals("routes", hc.getId());
        Assert.assertTrue(hc instanceof RoutesHealthCheckRepository);
        registry.register(hc);

        context.addRoutes(new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                from("direct:start").to("mock:foo").routeId("foo");
                from("direct:start2").to("mock:bar").routeId("bar");
            }
        });

        context.start();
        registry.start();

        List<HealthCheck> checks = registry.stream().collect(Collectors.toList());
        Assert.assertEquals(2, checks.size());

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();

            Assert.assertEquals(HealthCheck.State.UP, response.getState());
            Assert.assertFalse(response.getMessage().isPresent());
            Assert.assertFalse(response.getError().isPresent());
        }

        context.getRouteController().stopRoute("foo");

        for (HealthCheck check : checks) {
            HealthCheck.Result response = check.call();
            boolean foo = "foo".equals(response.getDetails().get("route.id"));
            if (foo) {
                Assert.assertEquals(HealthCheck.State.DOWN, response.getState());
                Assert.assertTrue(response.getMessage().isPresent());
                Assert.assertFalse(response.getError().isPresent());
            } else {
                Assert.assertEquals(HealthCheck.State.UP, response.getState());
                Assert.assertFalse(response.getMessage().isPresent());
                Assert.assertFalse(response.getError().isPresent());
            }
        }
    }

    private class MyHealthCheck extends AbstractHealthCheck implements CamelContextAware {

        private CamelContext context;

        protected MyHealthCheck(String group, String id) {
            super(group, id);
            getConfiguration().setEnabled(true);
        }

        @Override
        public void doCall(HealthCheckResultBuilder builder, Map<String, Object> options) {
            builder.up();
        }

        @Override
        public void setCamelContext(CamelContext camelContext) {
            this.context = camelContext;
        }

        @Override
        public CamelContext getCamelContext() {
            return context;
        }
    }
}
