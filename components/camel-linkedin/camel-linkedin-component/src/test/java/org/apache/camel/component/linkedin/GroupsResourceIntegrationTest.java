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
/*
 * Camel Api Route test generated by camel-component-util-maven-plugin
 * Generated on: Wed Jul 09 19:57:10 PDT 2014
 */
package org.apache.camel.component.linkedin;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.linkedin.internal.GroupsResourceApiMethod;
import org.apache.camel.component.linkedin.internal.LinkedInApiCollection;

import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Test class for {@link org.apache.camel.component.linkedin.api.GroupsResource} APIs.
 */
public class GroupsResourceIntegrationTest extends AbstractLinkedInTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(GroupsResourceIntegrationTest.class);
    private static final String PATH_PREFIX = "groups";

    // TODO provide parameter values for addPost
    @Ignore
    @Test
    public void testAddPost() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("CamelLinkedIn.group_id", 0L);
        // parameter type is org.apache.camel.component.linkedin.api.model.Post
        headers.put("CamelLinkedIn.post", null);

        requestBodyAndHeaders("direct://ADDPOST", null, headers);
    }

    // TODO provide parameter values for getGroup
    @Ignore
    @Test
    public void testGetGroup() throws Exception {
        // using long message body for single parameter "group_id"
        final org.apache.camel.component.linkedin.api.model.Group result = requestBody("direct://GETGROUP", 0L);

        assertNotNull("getGroup result", result);
        LOG.debug("getGroup: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for addPost
                from("direct://ADDPOST")
                    .to("linkedin://" + PATH_PREFIX + "/addPost");

                // test route for getGroup
                from("direct://GETGROUP")
                    .to("linkedin://" + PATH_PREFIX + "/getGroup?inBody=group_id");

            }
        };
    }
}
