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
package org.apache.camel.component.cxf.springboot;

import org.apache.camel.spi.HeaderFilterStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The cxf component is used for SOAP WebServices using Apache CXF.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.cxf")
public class CxfComponentConfiguration {

    /**
     * This option controls whether the CXF component when running in PAYLOAD
     * mode will DOM parse the incoming messages into DOM Elements or keep the
     * payload as a javax.xml.transform.Source object that would allow streaming
     * in some cases.
     */
    private Boolean allowStreaming;
    /**
     * To use a custom HeaderFilterStrategy to filter header to and from Camel
     * message.
     */
    private HeaderFilterStrategy headerFilterStrategy;

    public Boolean getAllowStreaming() {
        return allowStreaming;
    }

    public void setAllowStreaming(Boolean allowStreaming) {
        this.allowStreaming = allowStreaming;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }
}