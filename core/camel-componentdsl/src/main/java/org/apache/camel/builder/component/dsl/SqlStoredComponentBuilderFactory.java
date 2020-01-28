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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.sql.stored.SqlStoredComponent;

/**
 * The sql component allows you to work with databases using JDBC Stored
 * Procedure queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SqlStoredComponentBuilderFactory {

    /**
     * SQL Stored Procedure (camel-sql)
     * The sql component allows you to work with databases using JDBC Stored
     * Procedure queries.
     * 
     * Category: database,sql
     * Since: 2.17
     * Maven coordinates: org.apache.camel:camel-sql
     */
    static SqlStoredComponentBuilder sqlStored() {
        return new SqlStoredComponentBuilderImpl();
    }

    /**
     * Builder for the SQL Stored Procedure component.
     */
    interface SqlStoredComponentBuilder
            extends
                ComponentBuilder<SqlStoredComponent> {
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option is a: <code>javax.sql.DataSource</code> type.
         * 
         * Default:
         * Group: producer
         */
        default SqlStoredComponentBuilder setDataSource(
                javax.sql.DataSource dataSource) {
            doSetProperty("dataSource", dataSource);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SqlStoredComponentBuilder setBasicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SqlStoredComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class SqlStoredComponentBuilderImpl
            extends
                AbstractComponentBuilder<SqlStoredComponent>
            implements
                SqlStoredComponentBuilder {
        @Override
        protected SqlStoredComponent buildConcreteComponent() {
            return new SqlStoredComponent();
        }
    }
}