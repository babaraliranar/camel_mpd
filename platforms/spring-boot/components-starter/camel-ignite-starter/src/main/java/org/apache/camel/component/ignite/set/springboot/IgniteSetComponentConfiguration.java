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
package org.apache.camel.component.ignite.set.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Ignite Sets endpoint is one of camel-ignite endpoints which allows you to
 * interact with Ignite Set data structures.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.ignite-set")
public class IgniteSetComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the ignite-set component. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Sets the Ignite instance. The option is a org.apache.ignite.Ignite type.
     */
    private String ignite;
    /**
     * Sets the resource from where to load the configuration. It can be a: URI,
     * String (URI) or an InputStream. The option is a java.lang.Object type.
     */
    private String configurationResource;
    /**
     * Allows the user to set a programmatic IgniteConfiguration. The option is
     * a org.apache.ignite.configuration.IgniteConfiguration type.
     */
    private String igniteConfiguration;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public String getIgnite() {
        return ignite;
    }

    public void setIgnite(String ignite) {
        this.ignite = ignite;
    }

    public String getConfigurationResource() {
        return configurationResource;
    }

    public void setConfigurationResource(String configurationResource) {
        this.configurationResource = configurationResource;
    }

    public String getIgniteConfiguration() {
        return igniteConfiguration;
    }

    public void setIgniteConfiguration(String igniteConfiguration) {
        this.igniteConfiguration = igniteConfiguration;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}