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

package org.apache.camel.component.mongodb.integration;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mongodb.MongoDbConstants;
import org.apache.camel.impl.DefaultCamelContext;

// Test class performs the same tests as DBOperationsIT but with modified URIs
public class MongoDbCredentialsFromUriConnectionIT extends MongoDbOperationsIT {

    @Override
    public void doPreSetup() throws Exception {
        // create user in db
        super.doPreSetup();
        createAuthorizationUser();
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        //This is necessary to avoid creating connection bean for the mongodb component and test credentials instead
        @SuppressWarnings("deprecation")
        CamelContext ctx = new DefaultCamelContext();
        ctx.getPropertiesComponent().setLocation("classpath:mongodb.test.properties");
        return ctx;
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {

                String uriHostnameOnly = String.format("mongodb:mongo?hosts=%s&", service.getConnectionAddress());
                //connecting with credentials for created user
                String uriWithCredentials = String.format("%susername=%s&password=%s&", uriHostnameOnly, USER, PASSWORD);

                from("direct:count").to(
                        uriHostnameOnly + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=count&dynamicity=true");
                from("direct:insert")
                        .to(uriWithCredentials
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=insert");
                from("direct:testStoreOidOnInsert")
                        .to(uriHostnameOnly
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=insert")
                        .setBody()
                        .header(MongoDbConstants.OID);
                from("direct:save")
                        .to(uriWithCredentials
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=save");
                from("direct:testStoreOidOnSave")
                        .to(uriWithCredentials
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=save")
                        .setBody()
                        .header(MongoDbConstants.OID);
                from("direct:update")
                        .to(uriWithCredentials
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=update");
                from("direct:remove")
                        .to(uriWithCredentials
                            + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=remove");
                from("direct:aggregate").to(
                        uriHostnameOnly + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=aggregate");
                from("direct:getDbStats").to(uriWithCredentials + "database={{mongodb.testDb}}&operation=getDbStats");
                from("direct:getColStats").to(
                        uriWithCredentials + "database={{mongodb.testDb}}&collection={{mongodb.testCollection}}&operation=getColStats");
                from("direct:command").to(uriWithCredentials + "database={{mongodb.testDb}}&operation=command");

            }
        };
    }
}
