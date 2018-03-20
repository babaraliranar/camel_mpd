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
package org.apache.camel.component.couchbase;


import java.net.URI;
import java.util.ArrayList;

import com.couchbase.client.CouchbaseClient;
import com.couchbase.client.vbucket.ConfigurationException;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.junit.Test;

public class CouchbaseConsumerTest {

    @Test(expected = ConfigurationException.class)
    public void testNewCouchbaseConsumer() throws Exception {
        new CouchbaseConsumer(new CouchbaseEndpoint(), new CouchbaseClient(new ArrayList<URI>(), "bucketName", "pwd"), new Processor() {
            @Override
            public void process(Exchange exchange) throws Exception {
                // Nothing to do
            }
        });
    }
}
