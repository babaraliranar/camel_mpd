package org.apache.camel.processor;

import java.util.concurrent.CompletableFuture;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.ShutdownRoute;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static java.util.concurrent.TimeUnit.SECONDS;
import static org.awaitility.Awaitility.await;

class LoopNoBreakOnShutdownTest extends ContextTestSupport {

    private static final int LOOP_COUNT = 100;

    @Test
    void testLoopNoBreakOnShutdown() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:result");
        mock.expectedMinimumMessageCount(LOOP_COUNT);

        CompletableFuture<Object> future = template.asyncSendBody("seda:foo", "foo");
        await().atMost(1, SECONDS).until(future::isDone);

        context.stop();

        mock.assertIsSatisfied();
    }

    @Override
    @BeforeEach
    public void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {

        return new RouteBuilder() {
            public void configure() {

                from("seda:foo")
                        .startupOrder(1)
                        .loop(LOOP_COUNT).delay(50)
                        .to("seda:bar");

                from("seda:bar")
                        .startupOrder(2)
                        .shutdownRoute(ShutdownRoute.Defer)
                        .to("mock:result");
            }
        };
    }
}
