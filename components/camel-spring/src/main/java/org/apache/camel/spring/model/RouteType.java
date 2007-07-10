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
package org.apache.camel.spring.model;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Endpoint;
import org.apache.camel.Processor;
import org.apache.camel.builder.ProcessorFactory;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an XML &lt;route/&gt; element
 *
 * @version $Revision: $
 */
@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class RouteType extends OutputType implements CamelContextAware, ProcessorFactory {
    @XmlTransient
    private CamelContext camelContext;
    @XmlElement(required = true)
    private List<FromType> from = new ArrayList<FromType>();

/*
    public Route createRoute() throws Exception {
        return new EventDrivenConsumerRoute(getEndpoint(), createProcessor());
    }
*/

    @Override
    public String toString() {
        return "Route[from: " + from + " processor: " + processor + "]";
    }


    // Properties
    //-----------------------------------------------------------------------

    public List<FromType> getFrom() {
        return from;
    }

    public void setFrom(List<FromType> from) {
        this.from = from;
    }

    public CamelContext getCamelContext() {
        return camelContext;
    }

    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public Processor createProcessor() throws Exception {
        return null;  // TODO
    }

    protected Endpoint resolveEndpoint(String uri) {
        CamelContext context = getCamelContext();
        if (context == null) {
            throw new IllegalArgumentException("No CamelContext has been injected!");
        }
        Endpoint answer = context.getEndpoint(uri);
        if (answer == null) {
            throw new IllegalArgumentException("No Endpoint found for uri: " + uri);
        }
        return answer;
    }
}
