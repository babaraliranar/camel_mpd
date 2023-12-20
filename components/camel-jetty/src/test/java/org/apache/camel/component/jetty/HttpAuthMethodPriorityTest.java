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
package org.apache.camel.component.jetty;

import java.io.File;
import java.security.Principal;
import java.util.Arrays;

import jakarta.servlet.http.HttpServletRequest;

import org.apache.camel.BindToRegistry;
import org.apache.camel.Exchange;
import org.apache.camel.FailedToCreateProducerException;
import org.apache.camel.Processor;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.http.base.HttpOperationFailedException;
import org.eclipse.jetty.ee10.servlet.security.ConstraintMapping;
import org.eclipse.jetty.ee10.servlet.security.ConstraintSecurityHandler;
import org.eclipse.jetty.security.Constraint;
import org.eclipse.jetty.security.HashLoginService;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.security.authentication.BasicAuthenticator;
import org.eclipse.jetty.util.resource.URLResourceFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.apache.camel.test.junit5.TestSupport.assertIsInstanceOf;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

@Disabled
public class HttpAuthMethodPriorityTest extends BaseJettyTest {

    @BindToRegistry("myAuthHandler")
    public SecurityHandler getSecurityHandler() {
        Constraint constraint = new Constraint.Builder()
                .name("BASIC")
                .roles("user")
                .authorization(Constraint.Authorization.SPECIFIC_ROLE)
                .build();

        ConstraintMapping cm = new ConstraintMapping();
        cm.setPathSpec("/*");
        cm.setConstraint(constraint);

        ConstraintSecurityHandler sh = new ConstraintSecurityHandler();
        sh.setAuthenticator(new BasicAuthenticator());
        sh.setConstraintMappings(Arrays.asList(new ConstraintMapping[] { cm }));

        HashLoginService loginService = new HashLoginService(
                "MyRealm",
                new URLResourceFactory().newResource(
                        new File("src/test/resources/myRealm.properties").toURI()));
        sh.setLoginService(loginService);
        sh.setConstraintMappings(Arrays.asList(new ConstraintMapping[] { cm }));

        return sh;
    }

    @Test
    public void testAuthMethodPriorityBasicDigest() {
        String out = template.requestBody(
                "http://localhost:{{port}}/test?authMethod=Basic&authMethodPriority=Basic,Digest&authUsername=donald&authPassword=duck",
                "Hello World",
                String.class);
        assertEquals("Bye World", out);
    }

    @Test
    public void testAuthMethodPriorityNTLMBasic() {
        String out = template.requestBody(
                "http://localhost:{{port}}/test?authMethod=Basic&authMethodPriority=NTLM,Basic&authUsername=donald&authPassword=duck",
                "Hello World",
                String.class);
        assertEquals("Bye World", out);
    }

    @Test
    public void testAuthMethodPriorityInvalid() {
        try {
            template.requestBody(
                    "http://localhost:{{port}}/test?authMethod=Basic&authMethodPriority=Basic,foo&authUsername=donald&authPassword=duck",
                    "Hello World", String.class);
            fail("Should have thrown an exception");
        } catch (FailedToCreateProducerException e) {
            IllegalArgumentException cause
                    = assertIsInstanceOf(IllegalArgumentException.class, e.getCause().getCause().getCause());
            // JAXB 2.2 uses a slightly different message
            boolean b = cause.getMessage().contains("No enum const")
                    && cause.getMessage().contains("org.apache.camel.component.http.AuthMethod.foo");
            assertTrue(b, "Bad fault message: " + cause.getMessage());
        }
    }

    @Test
    public void testAuthMethodPriorityNTLM() {
        try {
            template.requestBody(
                    "http://localhost:{{port}}/test?authMethod=Basic&authMethodPriority=NTLM&authUsername=donald&authPassword=duck",
                    "Hello World", String.class);
            fail("Should have thrown exception");
        } catch (RuntimeCamelException e) {
            HttpOperationFailedException cause = assertIsInstanceOf(HttpOperationFailedException.class, e.getCause());
            assertEquals(401, cause.getStatusCode());
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("jetty://http://localhost:{{port}}/test?handlers=myAuthHandler").process(new Processor() {
                    public void process(Exchange exchange) {
                        HttpServletRequest req = exchange.getIn().getBody(HttpServletRequest.class);
                        assertNotNull(req);
                        Principal user = req.getUserPrincipal();
                        assertNotNull(user);
                        assertEquals("donald", user.getName());
                    }
                }).transform(constant("Bye World"));
            }
        };
    }
}
