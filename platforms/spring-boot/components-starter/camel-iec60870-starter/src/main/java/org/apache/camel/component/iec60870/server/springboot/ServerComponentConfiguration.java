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
package org.apache.camel.component.iec60870.server.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.eclipse.neoscada.protocol.iec60870.server.data.DataModuleOptions;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * IEC 60870 component used for telecontrol (supervisory control and data
 * acquisition) such as controlling electric power transmission grids and other
 * geographically widespread control systems.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.iec60870-server")
public class ServerComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the iec60870-server component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Default connection options
     */
    private ServerOptionsNestedConfiguration defaultConnectionOptions;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public ServerOptionsNestedConfiguration getDefaultConnectionOptions() {
        return defaultConnectionOptions;
    }

    public void setDefaultConnectionOptions(
            ServerOptionsNestedConfiguration defaultConnectionOptions) {
        this.defaultConnectionOptions = defaultConnectionOptions;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }

    public static class ServerOptionsNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.iec60870.server.ServerOptions.class;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private DataModuleOptions dataModuleOptions;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private Integer bufferingPeriod;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private Boolean booleansWithTimestamp;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private Boolean floatsWithTimestamp;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private Integer spontaneousDuplicates;
        /**
         * The period in "ms" between background transmission cycles. <p> If
         * this is set to zero or less, background transmissions will be
         * disabled. </p>
         */
        private Integer backgroundScanPeriod;

        public DataModuleOptions getDataModuleOptions() {
            return dataModuleOptions;
        }

        public void setDataModuleOptions(DataModuleOptions dataModuleOptions) {
            this.dataModuleOptions = dataModuleOptions;
        }

        public Integer getBufferingPeriod() {
            return bufferingPeriod;
        }

        public void setBufferingPeriod(Integer bufferingPeriod) {
            this.bufferingPeriod = bufferingPeriod;
        }

        public Boolean getBooleansWithTimestamp() {
            return booleansWithTimestamp;
        }

        public void setBooleansWithTimestamp(Boolean booleansWithTimestamp) {
            this.booleansWithTimestamp = booleansWithTimestamp;
        }

        public Boolean getFloatsWithTimestamp() {
            return floatsWithTimestamp;
        }

        public void setFloatsWithTimestamp(Boolean floatsWithTimestamp) {
            this.floatsWithTimestamp = floatsWithTimestamp;
        }

        public Integer getSpontaneousDuplicates() {
            return spontaneousDuplicates;
        }

        public void setSpontaneousDuplicates(Integer spontaneousDuplicates) {
            this.spontaneousDuplicates = spontaneousDuplicates;
        }

        public Integer getBackgroundScanPeriod() {
            return backgroundScanPeriod;
        }

        public void setBackgroundScanPeriod(Integer backgroundScanPeriod) {
            this.backgroundScanPeriod = backgroundScanPeriod;
        }
    }
}