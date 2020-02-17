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
package org.apache.camel.component.aws2.sqs;

import org.apache.camel.component.aws2.sqs.Sqs2Component;
import org.apache.camel.component.aws2.sqs.Sqs2Endpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class SqsComponentClientRegistryTest extends CamelTestSupport {

    @Test
    public void createEndpointWithMinimalSQSClientConfiguration() throws Exception {

        AmazonSQSClientMock awsSQSClient = new AmazonSQSClientMock();
        context.getRegistry().bind("awsSQSClient", awsSQSClient);
        Sqs2Component component = context.getComponent("aws2-sqs", Sqs2Component.class);
        Sqs2Endpoint endpoint = (Sqs2Endpoint)component.createEndpoint("aws2-sqs://MyQueue");

        assertNotNull(endpoint.getConfiguration().getAmazonSQSClient());
    }

    @Test(expected = IllegalArgumentException.class)
    public void createEndpointWithMinimalSQSClientMisconfiguration() throws Exception {

        Sqs2Component component = context.getComponent("aws2-sqs", Sqs2Component.class);
        Sqs2Endpoint endpoint = (Sqs2Endpoint)component.createEndpoint("aws2-sqs://MyQueue");
    }
}
