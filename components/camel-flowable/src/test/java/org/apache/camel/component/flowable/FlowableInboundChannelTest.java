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
package org.apache.camel.component.flowable;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.apache.camel.Exchange;
import org.apache.camel.ProducerTemplate;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.engine.test.Deployment;
import org.flowable.task.api.Task;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ContextConfiguration("classpath:generic-camel-context.xml")
public class FlowableInboundChannelTest extends CamelFlowableTestCase {

    @BeforeEach
    public void setUp() throws Exception {
        eventRegistryEngineConfiguration.getEventRepositoryService().createDeployment()
                .addClasspathResource("channel/userChannel.channel")
                .addClasspathResource("event/userEvent.event")
                .deploy();
    }

    @Test
    @Deployment(resources = { "process/start.bpmn20.xml" })
    public void testStartProcessWithBasicEvent() throws Exception {
        ProducerTemplate tpl = camelContext.createProducerTemplate();
        ObjectNode bodyNode = new ObjectMapper().createObjectNode();
        bodyNode.put("name", "John Doe");
        bodyNode.put("age", 23);
        Exchange exchange = camelContext.getEndpoint("direct:start").createExchange();
        exchange.getIn().setBody(bodyNode);
        tpl.send("direct:start", exchange);

        ProcessInstance processInstance
                = runtimeService.createProcessInstanceQuery().processDefinitionKey("camelProcess").singleResult();
        assertNotNull(processInstance);

        assertEquals("John Doe", runtimeService.getVariable(processInstance.getId(), "name"));
        assertEquals(23, runtimeService.getVariable(processInstance.getId(), "age"));

        Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).singleResult();
        assertNotNull(task);
    }
}
