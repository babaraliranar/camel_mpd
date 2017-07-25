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
package org.apache.camel.component.as2.api;

import org.apache.http.protocol.HTTP;
import org.apache.http.protocol.HttpCoreContext;

/**
 * Constants for AS2 component.
 */
public interface AS2Constants {
    
    public static final String HTTP_USER_AGENT = "Camel AS2 Component";
    
    public static final String HTTP_ORIGIN_SERVER = "Camel AS2 Component";
    
    public static final String HTTP_MESSAGE_ID_FQDN = "camel.apache.org";
    
    //
    // HTTP Context Attribute Names
    //

    /**
     * HTTP Context Attribute Name for HTTP Client Connection object stored in context.
     */
    public static final String HTTP_CLIENT_CONNECTION = HttpCoreContext.HTTP_CONNECTION;
    
    /**
     * HTTP Context Attribute Name for HTTP Client Processor object stored in context.
     */
    public static final String HTTP_CLIENT_PROCESSOR = "http.processor";
    
    /**
     * HTTP Context Attribute Name for HTTP Client Fully Qualified Domain Name (FQDN) stored in context.
     */
    public static final String HTTP_CLIENT_FQDN = "client.fqdn";
    
    /**
     * HTTP Context Attribute Name for HTTP Server Connection object stored in context.
     */
    public static final String HTTP_SERVER_CONNECTION = "http.server.connection";
    
    /**
     * HTTP Context Attribute Name for HTTP Server Processor object stored in context.
     */
    public static final String HTTP_SERVER_PROCESSOR = "http.server.processor";
    
    /**
     * HTTP Context Attribute Name for HTTP Server Service object stored in context.
     */
    public static final String HTTP_SERVER_SERVICE = "http.server.service";
    
    
    //
    // AS2 Header Names
    //
    
    /**
     * Message Header Name for AS2 Version
     */
    public static final String AS2_VERSION_HEADER = "AS2-Version";
    
    /**
     * Message Header Name for Content Type
     */
    public static final String CONTENT_TYPE_HEADER = "Content-Type";
    
    /**
     * Message Header Name for AS2 From
     */
    public static final String AS2_FROM_HEADER = "AS2-From";
    
    /**
     * Message Header Name for AS2 To
     */
    public static final String AS2_TO_HEADER = "AS2-To";
    
    /**
     * Message Header Name for Subject
     */
    public static final String SUBJECT_HEADER = "Subject";
    
    /**
     * Message Header Name for Message ID
     */
    public static final String MESSAGE_ID_HEADER = "Message-Id";
    
    /**
     * Message Header Name for Target Host
     */
    public static final String TARGET_HOST_HEADER = HTTP.TARGET_HOST;
    
    /**
     * Message Header Name for User Agent
     */
    public static final String USER_AGENT_HEADER = HTTP.USER_AGENT;
    
    /**
     * Message Header Name for Date
     */
    public static final String DATE_HEADER = HTTP.DATE_HEADER;
    
    /**
     * Message Header Name for Content Length
     */
    public static final String CONTENT_LENGTH_HEADER = HTTP.CONTENT_LEN;
    
    /**
     * Message Header Name for Connection
     */
    public static final String CONNECTION_HEADER = HTTP.CONN_DIRECTIVE;
    
    /**
     * Message Header Name for Connection
     */
    public static final String EXPECT_HEADER = HTTP.EXPECT_DIRECTIVE;
    
    //
    // AS2 MIME Content Types
    //
    
    /**
     * Application EDIFACT content type
     */
    public static final String APPLICATION_EDIFACT_MIME_TYPE  = "Application/EDIFACT";
    
}
