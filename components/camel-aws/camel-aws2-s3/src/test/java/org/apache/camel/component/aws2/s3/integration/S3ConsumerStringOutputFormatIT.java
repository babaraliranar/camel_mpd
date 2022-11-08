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
package org.apache.camel.component.aws2.s3.integration;

import java.util.concurrent.TimeUnit;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws2.s3.AWS2S3Constants;
import org.apache.camel.component.mock.MockEndpoint;
import org.awaitility.Awaitility;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class S3ConsumerStringOutputFormatIT extends Aws2S3Base {

    @EndpointInject
    private ProducerTemplate template;

    @EndpointInject("mock:result")
    private MockEndpoint result;

    @Test
    public void sendIn() throws Exception {
        result.expectedMessageCount(1);

        template.send("direct:putObject", new Processor() {

            @Override
            public void process(Exchange exchange) {
                exchange.getIn().setHeader(AWS2S3Constants.KEY, "test.txt");
                exchange.getIn().setBody("Test");
            }
        });

        Awaitility.await().atMost(10, TimeUnit.SECONDS)
                .untilAsserted(() -> MockEndpoint.assertIsSatisfied(context));
        assertNotNull(result.getExchanges().get(0).getMessage().getBody());
        assertEquals(String.class, result.getExchanges().get(0).getMessage().getBody().getClass());
        assertEquals(result.getExchanges().get(0).getMessage().getBody(), "Test");
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                String awsEndpoint = "aws2-s3://mycamel?autoCreateBucket=true";

                from("direct:putObject").startupOrder(1).to(awsEndpoint);

                from("aws2-s3://mycamel?format=string&moveAfterRead=true&destinationBucket=camel-kafka-connector&autoCreateBucket=true&destinationBucketPrefix=RAW(movedPrefix)&destinationBucketSuffix=RAW(movedSuffix)")
                        .startupOrder(2).log("${body}").to("mock:result");

            }
        };
    }
}
