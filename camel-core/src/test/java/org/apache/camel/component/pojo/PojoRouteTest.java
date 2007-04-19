/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.pojo;

import java.util.concurrent.atomic.AtomicInteger;

import junit.framework.TestCase;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.processor.InterceptorProcessor;

/**
 * @version $Revision: 520220 $
 */
public class PojoRouteTest extends TestCase {
	
    public void testPojoRoutes() throws Exception {

        CamelContext container = new DefaultCamelContext();
        
        PojoComponent component = new PojoComponent();
        component.addService("bye", new SayService("Good Bye!"));
        container.addComponent("default", component);
        
        final AtomicInteger hitCount = new AtomicInteger();
        final InterceptorProcessor<PojoExchange> tracingInterceptor = new InterceptorProcessor<PojoExchange>() {
        	@Override
        	public void process(PojoExchange exchange) {
        		super.process(exchange);
        		hitCount.incrementAndGet();
        	}
        };
        // lets add some routes
        container.addRoutes(new RouteBuilder() {
            public void configure() {
                from("pojo:hello").intercept(tracingInterceptor).to("pojo:bye");
            }
        });

        
        container.start();

        // now lets fire in a message
        PojoConsumer consumer = component.getConsumer("hello");        
        ISay proxy = consumer.createProxy(ISay.class);
        String rc = proxy.say();
        assertEquals("Good Bye!", rc);
        assertEquals(1, hitCount.get());
        
        container.stop();
    }
}
