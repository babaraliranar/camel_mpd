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
package org.apache.camel.component.bonita.api;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.component.bonita.api.BonitaAPI;
import org.apache.camel.component.bonita.api.BonitaAPIBuilder;
import org.apache.camel.component.bonita.api.model.ProcessDefinitionResponse;
import org.apache.camel.component.bonita.api.util.BonitaAPIConfig;
import org.junit.Test;

public class BonitaAPITest {
	@Test(expected=IllegalArgumentException.class)
	public void testGetProcessDefinitionEmptyInput() {
		BonitaAPI bonitaApi = BonitaAPIBuilder.build(new BonitaAPIConfig("hostname","port","username","password"));
		bonitaApi.getProcessDefinition("");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testStartCaseEmptyProcessDefinitionId() {
		BonitaAPI bonitaApi = BonitaAPIBuilder.build(new BonitaAPIConfig("hostname","port","username","password"));
		bonitaApi.startCase(null, new HashMap<String,Serializable>());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testStartCaseNUllContractInput() {
		BonitaAPI bonitaApi = BonitaAPIBuilder.build(new BonitaAPIConfig("hostname","port","username","password"));
		ProcessDefinitionResponse processDefinition = new ProcessDefinitionResponse();
		bonitaApi.startCase(processDefinition, null);
	}
	
	

}
