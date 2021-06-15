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
package org.apache.camel.component.azure.servicebus;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

public final class TestUtils {

    public static final String CONNECTION_STRING = "connectionString";
    public static final String TOPIC_NAME = "topicName";
    public static final String SUBSCRIPTION_NAME = "subscriptionName";

    private TestUtils() {
    }

    public static Properties loadAzurePropertiesFile() throws IOException {
        final Properties properties = new Properties();
        final String fileName = "azure_key.properties";

        final InputStream inputStream = Objects.requireNonNull(TestUtils.class.getClassLoader().getResourceAsStream(fileName));

        properties.load(inputStream);

        return properties;
    }

    public static Properties loadAzureAccessFromJvmEnv() throws Exception {
        final Properties properties = new Properties();
        if (System.getProperty(CONNECTION_STRING) == null) {
            throw new Exception(
                    "Make sure to supply azure servicebus connectionString, e.g:  mvn verify -PfullTests -DconnectionString=string");
        }
        properties.setProperty(CONNECTION_STRING, System.getProperty(CONNECTION_STRING));
        properties.setProperty(TOPIC_NAME, System.getProperty(TOPIC_NAME));
        properties.setProperty(SUBSCRIPTION_NAME, System.getProperty(SUBSCRIPTION_NAME));

        return properties;
    }

}
