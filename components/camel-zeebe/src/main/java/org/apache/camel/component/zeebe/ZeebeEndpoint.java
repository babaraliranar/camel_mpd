/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.apache.camel.component.zeebe;

import org.apache.camel.Category;
import org.apache.camel.Consumer;
import org.apache.camel.Processor;
import org.apache.camel.Producer;
import org.apache.camel.component.zeebe.internal.OperationName;
import org.apache.camel.component.zeebe.internal.ZeebeService;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriEndpoint;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriPath;
import org.apache.camel.support.DefaultEndpoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Zeebe component which does bla bla.
 *
 * TODO: Update one line description above what the component does.
 */
@UriEndpoint(firstVersion = "1.0-SNAPSHOT", scheme = "zeebe", title = "Zeebe", syntax="zeebe:operationName",
            category = {Category.JAVA},
            headersClass = ZeebeConstants.class)
public class ZeebeEndpoint extends DefaultEndpoint {

    private static final Logger LOG = LoggerFactory.getLogger(ZeebeEndpoint.class);

    @UriPath (label = "common", description = "The operation to use", enums ="startProcess," +
            "cancelProcess,publishMessage,completeJob,failJob,updateJobRetries,worker,throwError,deployResource")
    @Metadata(required = true)
    private OperationName operationName;

    @UriParam(defaultValue = "false")
    @Metadata(description = "Format the result in the body as JSON.")
    private boolean formatJSON;

    @UriParam
    @Metadata(label = "consumer", description = "JobKey for the job worker.", javaType = "String")
    private String jobKey;

    @UriParam(defaultValue = "10")
    @Metadata(label = "consumer", description = "Timeout for job worker.", javaType = "int")
    private int timeout = 10;

    public ZeebeEndpoint() {
    }

    public ZeebeEndpoint(String uri, ZeebeComponent component, OperationName operationName) {
        super(uri, component);

        this.operationName = operationName;
    }

    public Producer createProducer() throws Exception {
        if (operationName == null) {
            throw new IllegalArgumentException(String.format("Invalid Operation"));
        }

        return new ZeebeProducer(this);
    }

    public Consumer createConsumer(Processor processor) throws Exception {
        if (operationName == null) {
            throw new IllegalArgumentException(String.format("Invalid Operation"));
        }

        Consumer consumer = new ZeebeConsumer(this, processor);
        configureConsumer(consumer);
        return consumer;
    }

    /**
     * The Zeebe operation to be performed
     */
    public void setOperationName(OperationName operationName) {
        this.operationName = operationName;
    }

    public OperationName getOperationName() {
        return operationName;
    }

    /**
     * If true format the result message as JSON
     */
    public void setFormatJSON(boolean formatJSON) {
        this.formatJSON = formatJSON;
    }

    public boolean isFormatJSON() {
        return formatJSON;
    }

    public String getJobKey() {
        return jobKey;
    }

    /**
     * The jobKey used to register a JobWorker
     */
    public void setJobKey(String jobKey) {
        this.jobKey = jobKey;
    }

    public int getTimeout() {
        return timeout;
    }

    /**
     * The timeout in seconds used for JobWorkers (default: 10)
     */
    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    @Override
    public ZeebeComponent getComponent() {
        return (ZeebeComponent) super.getComponent();
    }

    protected ZeebeService getZeebeService() {
        return getComponent().getZeebeService();
    }
}
