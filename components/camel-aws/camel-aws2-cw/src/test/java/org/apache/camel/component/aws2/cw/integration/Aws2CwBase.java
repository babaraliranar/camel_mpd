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
package org.apache.camel.component.aws2.cw.integration;

import org.apache.camel.CamelContext;
import org.apache.camel.component.aws2.cw.Cw2Component;
import org.apache.camel.test.infra.aws2.clients.AWSSDKClientUtils;
import org.apache.camel.test.infra.aws2.services.AWSServiceFactory;
import org.apache.camel.test.infra.aws2.services.AWSTestService;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.RegisterExtension;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Aws2CwBase extends CamelTestSupport {
    @RegisterExtension
    public static AWSTestService service = AWSServiceFactory.createCloudWatchService();

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        Cw2Component cwComponent = context.getComponent("aws2-cw", Cw2Component.class);
        cwComponent.getConfiguration().setAmazonCwClient(AWSSDKClientUtils.newCloudWatchClient());
        return context;
    }
}
