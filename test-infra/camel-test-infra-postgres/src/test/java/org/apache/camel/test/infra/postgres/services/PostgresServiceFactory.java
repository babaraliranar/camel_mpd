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
package org.apache.camel.test.infra.postgres.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class PostgresServiceFactory {
    private static final Logger LOG = LoggerFactory.getLogger(PostgresServiceFactory.class);

    private PostgresServiceFactory() {

    }

    public static PostgresService createService() {
        String instanceType = System.getProperty("postgres.instance.type");

        if (instanceType == null || instanceType.equals("local-postgres-container")) {
            return new PostgresLocalContainerService();
        }

        if (instanceType.equals("remote")) {
            return new PostgresRemoteService();
        }

        LOG.error("Postgres instance must be one of 'local-postgres-container' or 'remote");
        throw new UnsupportedOperationException("Invalid Postgres instance type");
    }
}
