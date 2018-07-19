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
package org.apache.camel.dataformat.castor.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Castor data format is used for unmarshal a XML payload to POJO or to marshal
 * POJO back to XML payload.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.castor")
public class CastorDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the castor data format. This is
     * enabled by default.
     */
    private Boolean enabled;
    /**
     * Path to a Castor mapping file to load from the classpath.
     */
    private String mappingFile;
    /**
     * Define if Whitelist feature is enabled or not
     */
    private Boolean whitelistEnabled = true;
    /**
     * Define the allowed objects to be unmarshalled. You can specify the FQN
     * class name of allowed objects, and you can use comma to separate multiple
     * entries. It is also possible to use wildcards and regular expression
     * which is based on the pattern defined by link
     * org.apache.camel.util.EndpointHelpermatchPattern(String, String). Denied
     * objects takes precedence over allowed objects.
     */
    private String allowedUnmarshallObjects;
    /**
     * Define the denied objects to be unmarshalled. You can specify the FQN
     * class name of deined objects, and you can use comma to separate multiple
     * entries. It is also possible to use wildcards and regular expression
     * which is based on the pattern defined by link
     * org.apache.camel.util.EndpointHelpermatchPattern(String, String). Denied
     * objects takes precedence over allowed objects.
     */
    private String deniedUnmarshallObjects;
    /**
     * Whether validation is turned on or off. Is by default true.
     */
    private Boolean validation = true;
    /**
     * Encoding to use when marshalling an Object to XML. Is by default UTF-8
     */
    private String encoding = "UTF-8";
    /**
     * Add additional packages to Castor XmlContext
     */
    private String[] packages;
    /**
     * Add additional class names to Castor XmlContext
     */
    private String[] classes;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML, or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public String getMappingFile() {
        return mappingFile;
    }

    public void setMappingFile(String mappingFile) {
        this.mappingFile = mappingFile;
    }

    public Boolean getWhitelistEnabled() {
        return whitelistEnabled;
    }

    public void setWhitelistEnabled(Boolean whitelistEnabled) {
        this.whitelistEnabled = whitelistEnabled;
    }

    public String getAllowedUnmarshallObjects() {
        return allowedUnmarshallObjects;
    }

    public void setAllowedUnmarshallObjects(String allowedUnmarshallObjects) {
        this.allowedUnmarshallObjects = allowedUnmarshallObjects;
    }

    public String getDeniedUnmarshallObjects() {
        return deniedUnmarshallObjects;
    }

    public void setDeniedUnmarshallObjects(String deniedUnmarshallObjects) {
        this.deniedUnmarshallObjects = deniedUnmarshallObjects;
    }

    public Boolean getValidation() {
        return validation;
    }

    public void setValidation(Boolean validation) {
        this.validation = validation;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String[] getPackages() {
        return packages;
    }

    public void setPackages(String[] packages) {
        this.packages = packages;
    }

    public String[] getClasses() {
        return classes;
    }

    public void setClasses(String[] classes) {
        this.classes = classes;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}