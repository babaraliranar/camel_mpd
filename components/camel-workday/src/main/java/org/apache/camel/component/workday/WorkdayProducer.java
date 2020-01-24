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
package org.apache.camel.component.workday;

import org.apache.camel.Exchange;
import org.apache.camel.component.workday.auth.AuthClientForIntegration;
import org.apache.camel.component.workday.auth.AutheticationClient;
import org.apache.camel.support.DefaultProducer;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * The camel-workday producer.
 */
public class WorkdayProducer extends DefaultProducer {

    public static final String WORKDAY_RAAS_HEADER = "CamelWorkdayRAAS";

    private static final Logger LOG = LoggerFactory.getLogger(WorkdayProducer.class);

    private String workdayUri;

    private WorkdayEndpoint endpoint;

    private WorkdayComponent component;

    private AutheticationClient autheticationClient;

    public WorkdayProducer(WorkdayEndpoint endpoint, String workdayUri) {
        super(endpoint);
        this.endpoint = endpoint;
        this.workdayUri = workdayUri;
        this.component = (WorkdayComponent)this.endpoint.getComponent();
        this.autheticationClient = new AuthClientForIntegration(
                this.component.getWorkdayConfiguration()
            );
    }

    @Override
    public WorkdayEndpoint getEndpoint() {
        return (WorkdayEndpoint) super.getEndpoint();
    }

    public void process(Exchange exchange) throws Exception {

        HttpClient httpClient = this.component.getHttpClient();

        GetMethod getMethod  = new GetMethod(workdayUri);
        this.autheticationClient.configure(httpClient, getMethod);

        try {
            int statusCode = httpClient.executeMethod(getMethod);

            if (statusCode != HttpStatus.SC_OK) {
                throw new IllegalStateException("Got the invalid http status value '" + getMethod.getStatusLine() + "' as the result of the RAAS '" + workdayUri + "'");
            }

            String report = getEndpoint().getCamelContext().getTypeConverter().mandatoryConvertTo(String.class, getMethod.getResponseBodyAsStream());

            if ("".equals(report)) {
                throw new IllegalStateException("Got the unexpected value '" + report + "' as the result of the report '" + workdayUri + "'");
            }

            exchange.getIn().setBody(report);
            exchange.getIn().setHeader(WORKDAY_RAAS_HEADER , workdayUri);

        } finally {
            getMethod.releaseConnection();
        }
    }

}
