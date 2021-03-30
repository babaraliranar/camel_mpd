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
package org.apache.camel.component.azure.cosmosdb;

import java.util.Map;

import org.apache.camel.Endpoint;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.annotations.Component;
import org.apache.camel.support.DefaultComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Azure CosmosDB component
 */
@Component("azure-cosmosdb")
public class CosmosDbComponent extends DefaultComponent {

    private static final Logger LOG = LoggerFactory.getLogger(CosmosDbComponent.class);

    @Metadata
    private CosmosDbConfiguration configuration = new CosmosDbConfiguration();

    public CosmosDbComponent() {
    }

    @Override
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {

        final CosmosDbConfiguration configuration
                = this.configuration != null ? this.configuration.copy() : new CosmosDbConfiguration();

        final CosmosDbEndpoint endpoint = new CosmosDbEndpoint(uri, this, configuration);
        setProperties(endpoint, parameters);

        return endpoint;
    }

    /**
     * The component configurations
     */
    public CosmosDbConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(CosmosDbConfiguration configuration) {
        this.configuration = configuration;
    }
}
