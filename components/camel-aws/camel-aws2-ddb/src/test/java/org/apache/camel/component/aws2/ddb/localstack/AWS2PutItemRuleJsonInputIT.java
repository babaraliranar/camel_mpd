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
package org.apache.camel.component.aws2.ddb.localstack;

import org.apache.camel.EndpointInject;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.aws2.ddb.Ddb2Constants;
import org.junit.jupiter.api.Test;
import software.amazon.awssdk.services.dynamodb.model.KeyType;
import software.amazon.awssdk.services.dynamodb.model.ScalarAttributeType;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AWS2PutItemRuleJsonInputIT extends Aws2DDBBase {

    @EndpointInject("direct:start")
    private ProducerTemplate template;

    private final String attributeName = "clave";
    private final String tableName = "TestTable";

    @Test
    public void putItem() {
        String jsonInput = "{" +
            "\"operation\": \"PutItem\", " +
            "\"key\": {" +
                "\"clave\": \"hello\"" +
            "}, " +
            "\"item\": {" +
                "\"clave\": \"hello\", " +
                "\"secondary_attribute\": \"value\"" +
            "}" +
        "}";

        Exchange exchange = template.send("direct:start", new Processor() {
            public void process(Exchange exchange) {
                exchange.getIn().setHeader(Ddb2Constants.CONSISTENT_READ, "true");
                exchange.getIn().setHeader(Ddb2Constants.RETURN_VALUES, "ALL_OLD");
                exchange.getIn().setBody(jsonInput);
            }
        });

        assertNotNull(exchange.getIn().getHeader(Ddb2Constants.ITEM));
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").to(
                        "aws2-ddb://" + tableName + "?format=json&keyAttributeName=" + attributeName + "&keyAttributeType=" + KeyType.HASH
                                        + "&keyScalarType=" + ScalarAttributeType.S
                                        + "&readCapacity=1&writeCapacity=1");
            }
        };
    }
}
