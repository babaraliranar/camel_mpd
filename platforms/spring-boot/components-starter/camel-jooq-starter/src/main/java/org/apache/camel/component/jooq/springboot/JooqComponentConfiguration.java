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
package org.apache.camel.component.jooq.springboot;

import javax.annotation.Generated;
import org.apache.camel.component.jooq.JooqOperation;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.jooq.Configuration;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The jooq component enables you to store and retrieve entities from databases
 * using JOOQ.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.jooq")
public class JooqComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the jooq component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Component configuration (database connection, database entity type, etc.)
     */
    private JooqConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public JooqConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            JooqConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class JooqConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.jooq.JooqConfiguration.class;
        /**
         * Type of operation to execute on query: execute, fetch, etc.
         */
        private JooqOperation operation;
        private Configuration databaseConfiguration;
        /**
         * JOOQ entity class.
         */
        private Class entityType;
        /**
         * Delete entity after it is consumed.
         */
        private Boolean consumeDelete = true;

        public JooqOperation getOperation() {
            return operation;
        }

        public void setOperation(JooqOperation operation) {
            this.operation = operation;
        }

        public Configuration getDatabaseConfiguration() {
            return databaseConfiguration;
        }

        public void setDatabaseConfiguration(Configuration databaseConfiguration) {
            this.databaseConfiguration = databaseConfiguration;
        }

        public Class getEntityType() {
            return entityType;
        }

        public void setEntityType(Class entityType) {
            this.entityType = entityType;
        }

        public Boolean getConsumeDelete() {
            return consumeDelete;
        }

        public void setConsumeDelete(Boolean consumeDelete) {
            this.consumeDelete = consumeDelete;
        }
    }
}