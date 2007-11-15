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
package org.apache.camel.component.cxf;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.xml.transform.Source;

import org.apache.camel.Exchange;
import org.apache.cxf.helpers.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.message.ExchangeImpl;
import org.apache.cxf.message.Message;
import org.apache.cxf.message.MessageImpl;

public class CxfSoapBinding {
    private CxfSoapBinding() {
        
    }
    
    public static org.apache.cxf.message.Message getCxfInMessage(org.apache.camel.Exchange exchange, boolean isClient) {
        MessageImpl answer = new MessageImpl();
        org.apache.cxf.message.Exchange cxfExchange = exchange.getProperty("CxfExchange", 
                                                                        org.apache.cxf.message.Exchange.class);
        org.apache.camel.Message message = null;
        if (isClient) {
            message = exchange.getOut();            
        } else {
            message = exchange.getIn();
        }
        if (cxfExchange == null) {
            cxfExchange = new ExchangeImpl();
            exchange.setProperty("CxfExchange", cxfExchange);
        }    
        Object body = message.getBody(InputStream.class);
        if (body == null) {
            body = message.getBody();
        }
        if (body instanceof InputStream) {
            answer.setContent(InputStream.class, body);             
        }
        answer.setExchange(cxfExchange);
        cxfExchange.setInMessage(answer);
        return answer;
    }
    
    public static org.apache.cxf.message.Message getCxfOutMessage(org.apache.camel.Exchange exchange, boolean isClient) {
        org.apache.cxf.message.Exchange cxfExchange = exchange.getProperty("CxfExchange", org.apache.cxf.message.Exchange.class);
        assert cxfExchange != null;
        org.apache.cxf.endpoint.Endpoint cxfEndpoint = cxfExchange.get(org.apache.cxf.endpoint.Endpoint.class);
        org.apache.cxf.message.Message outMessage = cxfEndpoint.getBinding().createMessage();
        outMessage.setExchange(cxfExchange);
        cxfExchange.setOutMessage(outMessage);
        org.apache.camel.Message message = null;
        if (isClient) {
            message = exchange.getIn();
        }
        else {
            message = exchange.getOut();
        }    
        // send the body back
        Object body = message.getBody(Source.class);
        if (body == null) {
            body = message.getBody();
        }
        if (body instanceof Source) {
            outMessage.setContent(Source.class, body);             
        }
        outMessage.putAll(message.getHeaders());
        return outMessage;
    }
     

}
