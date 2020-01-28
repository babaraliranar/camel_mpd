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
import org.apache.camel.component.elsql.ElsqlComponent;

/**
 * The elsql component is an extension to the existing SQL Component that uses
 * ElSql to define the SQL queries.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ElsqlComponentBuilderFactory {

    /**
     * ElSQL (camel-elsql)
     * The elsql component is an extension to the existing SQL Component that
     * uses ElSql to define the SQL queries.
     * 
     * Category: database,sql
     * Since: 2.16
     * Maven coordinates: org.apache.camel:camel-elsql
     */
    static ElsqlComponentBuilder elsql() {
        return new ElsqlComponentBuilderImpl();
    }

    /**
     * Builder for the ElSQL component.
     */
    interface ElsqlComponentBuilder extends ComponentBuilder<ElsqlComponent> {
        /**
         * To use a vendor specific com.opengamma.elsql.ElSqlConfig.
         * 
         * The option is a:
         * <code>org.apache.camel.component.elsql.ElSqlDatabaseVendor</code>
         * type.
         * 
         * Default:
         * Group: common
         */
        default ElsqlComponentBuilder setDatabaseVendor(
                org.apache.camel.component.elsql.ElSqlDatabaseVendor databaseVendor) {
            doSetProperty("databaseVendor", databaseVendor);
            return this;
        }
        /**
         * Sets the DataSource to use to communicate with the database.
         * 
         * The option is a: <code>javax.sql.DataSource</code> type.
         * 
         * Default:
         * Group: common
         */
        default ElsqlComponentBuilder setDataSource(
                javax.sql.DataSource dataSource) {
            doSetProperty("dataSource", dataSource);
            return this;
        }
        /**
         * To use a specific configured ElSqlConfig. It may be better to use the
         * databaseVendor option instead.
         * 
         * The option is a: <code>com.opengamma.elsql.ElSqlConfig</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default ElsqlComponentBuilder setElSqlConfig(
                com.opengamma.elsql.ElSqlConfig elSqlConfig) {
            doSetProperty("elSqlConfig", elSqlConfig);
            return this;
        }
        /**
         * The resource file which contains the elsql SQL statements to use. You
         * can specify multiple resources separated by comma. The resources are
         * loaded on the classpath by default, you can prefix with file: to load
         * from file system. Notice you can set this option on the component and
         * then you do not have to configure this on the endpoint.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default ElsqlComponentBuilder setResourceUri(
                java.lang.String resourceUri) {
            doSetProperty("resourceUri", resourceUri);
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
        default ElsqlComponentBuilder setBasicPropertyBinding(
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
        default ElsqlComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default ElsqlComponentBuilder setBridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class ElsqlComponentBuilderImpl
            extends
                AbstractComponentBuilder<ElsqlComponent>
            implements
                ElsqlComponentBuilder {
        @Override
        protected ElsqlComponent buildConcreteComponent() {
            return new ElsqlComponent();
        }
    }
}