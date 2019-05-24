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
package org.apache.camel.component.corda.springboot;

import javax.annotation.Generated;
import net.corda.core.node.services.vault.PageSpecification;
import net.corda.core.node.services.vault.QueryCriteria;
import net.corda.core.node.services.vault.Sort;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The corda component uses the corda-rpc to interact with corda nodes.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.corda")
public class CordaComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the corda component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Default configuration
     */
    private CordaConfigurationNestedConfiguration configuration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;

    public CordaConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            CordaConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public static class CordaConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.corda.CordaConfiguration.class;
        private String operation;
        private String username;
        private String password;
        private String host;
        private Integer port;
        private Boolean processSnapshot;
        private Class flowLociClass;
        private Object[] arguments;
        private Class contractStateClass;
        private QueryCriteria queryCriteria;
        private PageSpecification pageSpecification;
        private Sort sort;

        public String getOperation() {
            return operation;
        }

        public void setOperation(String operation) {
            this.operation = operation;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public Boolean getProcessSnapshot() {
            return processSnapshot;
        }

        public void setProcessSnapshot(Boolean processSnapshot) {
            this.processSnapshot = processSnapshot;
        }

        public Class getFlowLociClass() {
            return flowLociClass;
        }

        public void setFlowLociClass(Class flowLociClass) {
            this.flowLociClass = flowLociClass;
        }

        public Object[] getArguments() {
            return arguments;
        }

        public void setArguments(Object[] arguments) {
            this.arguments = arguments;
        }

        public Class getContractStateClass() {
            return contractStateClass;
        }

        public void setContractStateClass(Class contractStateClass) {
            this.contractStateClass = contractStateClass;
        }

        public QueryCriteria getQueryCriteria() {
            return queryCriteria;
        }

        public void setQueryCriteria(QueryCriteria queryCriteria) {
            this.queryCriteria = queryCriteria;
        }

        public PageSpecification getPageSpecification() {
            return pageSpecification;
        }

        public void setPageSpecification(PageSpecification pageSpecification) {
            this.pageSpecification = pageSpecification;
        }

        public Sort getSort() {
            return sort;
        }

        public void setSort(Sort sort) {
            this.sort = sort;
        }
    }
}