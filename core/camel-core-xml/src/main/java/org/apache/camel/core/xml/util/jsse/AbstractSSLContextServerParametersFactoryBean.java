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
package org.apache.camel.core.xml.util.jsse;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlTransient;

import org.apache.camel.spi.Metadata;
import org.apache.camel.support.jsse.SSLContextServerParameters;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlTransient
public abstract class AbstractSSLContextServerParametersFactoryBean
        extends AbstractBaseSSLContextParametersFactoryBean<SSLContextServerParameters> {

    @XmlAttribute
    @Metadata(description = "The configuration options for server-side client-authentication requirements.",
              enums = "NONE,WANT,REQUIRE")
    protected String clientAuthentication;

    public String getClientAuthentication() {
        return clientAuthentication;
    }

    public void setClientAuthentication(String clientAuthentication) {
        this.clientAuthentication = clientAuthentication;
    }

    @Override
    protected SSLContextServerParameters createInstance() {
        SSLContextServerParameters newInstance = new SSLContextServerParameters();
        newInstance.setClientAuthentication(clientAuthentication);
        newInstance.setCamelContext(getCamelContext());
        return newInstance;
    }

    @Override
    public Class<SSLContextServerParameters> getObjectType() {
        return SSLContextServerParameters.class;
    }
}
