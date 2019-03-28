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
package org.apache.camel.component.zookeepermaster.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Represents an endpoint which only becomes active when it obtains the master
 * lock
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.zookeeper-master")
public class MasterComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the zookeeper-master component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * To use a custom ContainerIdFactory for creating container ids. The option
     * is a org.apache.camel.component.zookeepermaster.ContainerIdFactory type.
     */
    private String containerIdFactory;
    /**
     * The root path to use in zookeeper where information is stored which nodes
     * are master/slave etc. Will by default use:
     * /camel/zookeepermaster/clusters/master
     */
    private String zkRoot = "/camel/zookeepermaster/clusters/master";
    /**
     * To use a custom configured CuratorFramework as connection to zookeeper
     * ensemble. The option is a org.apache.curator.framework.CuratorFramework
     * type.
     */
    private String curator;
    /**
     * Timeout in millis to use when connecting to the zookeeper ensemble
     */
    private Integer maximumConnectionTimeout = 10000;
    /**
     * The url for the zookeeper ensemble
     */
    private String zooKeeperUrl = "localhost:2181";
    /**
     * The password to use when connecting to the zookeeper ensemble
     */
    private String zooKeeperPassword;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getContainerIdFactory() {
        return containerIdFactory;
    }

    public void setContainerIdFactory(String containerIdFactory) {
        this.containerIdFactory = containerIdFactory;
    }

    public String getZkRoot() {
        return zkRoot;
    }

    public void setZkRoot(String zkRoot) {
        this.zkRoot = zkRoot;
    }

    public String getCurator() {
        return curator;
    }

    public void setCurator(String curator) {
        this.curator = curator;
    }

    public Integer getMaximumConnectionTimeout() {
        return maximumConnectionTimeout;
    }

    public void setMaximumConnectionTimeout(Integer maximumConnectionTimeout) {
        this.maximumConnectionTimeout = maximumConnectionTimeout;
    }

    public String getZooKeeperUrl() {
        return zooKeeperUrl;
    }

    public void setZooKeeperUrl(String zooKeeperUrl) {
        this.zooKeeperUrl = zooKeeperUrl;
    }

    public String getZooKeeperPassword() {
        return zooKeeperPassword;
    }

    public void setZooKeeperPassword(String zooKeeperPassword) {
        this.zooKeeperPassword = zooKeeperPassword;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}