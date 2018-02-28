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
package org.apache.camel.component.as2.api.entity;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.camel.component.as2.api.AS2MediaType;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.apache.commons.codec.net.QuotedPrintableCodec;
import org.apache.http.HttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.util.Args;
import org.bouncycastle.util.encoders.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EntityUtils {
    
    private static final Logger LOG = LoggerFactory.getLogger(EntityUtils.class);

    private static AtomicLong partNumber = new AtomicLong();
    
    private EntityUtils() {}

    /**
     * Generated a unique value for a Multipart boundary string.
     * <p>
     * The boundary string is composed of the components:
     * "----=_Part_&lt;global_part_number&gt;_&lt;newly_created_object's_hashcode&gt;.&lt;current_time&gt;"
     * <p>
     * The generated string contains only US-ASCII characters and hence is safe
     * for use in RFC822 headers.
     * 
     * @return The generated boundary string.
     */
    public static String createBoundaryValue() {
        // TODO: ensure boundary string is limited to 70 characters or less.
        StringBuffer s = new StringBuffer();
        s.append("----=_Part_").append(partNumber.incrementAndGet()).append("_").append(s.hashCode()).append(".")
                .append(System.currentTimeMillis());
        return s.toString();
    }

    public static boolean validateBoundaryValue(String boundaryValue) {
        return true; // TODO: add validation logic.
    }

    public static String appendParameter(String headerString, String parameterName, String parameterValue) {
        return headerString + "; " + parameterName + "=" + parameterValue;
    }
    
    public static byte[] encode(byte[] data, String encoding) throws Exception{
        Args.notNull(data, "Data");
        
        if (encoding == null) {
            // Identity encoding
            return data;
        }
        
        switch(encoding.toLowerCase()) {
        case "base64":
            return Base64.encode(data);
        case "quoted-printable":
            // TODO: implement QuotedPrintableOutputStream
            return QuotedPrintableCodec.encodeQuotedPrintable(null, data);
        case "binary":
        case "7bit":
        case "8bit":
            // Identity encoding
            return data;
         default:
            throw new Exception("Unknown encoding: " + encoding);
        }
    }
    
    public static OutputStream encode(OutputStream os, String encoding) throws Exception {
        Args.notNull(os, "Output Stream");
        
        if (encoding == null) {
            // Identity encoding
            return os;
        }
        switch (encoding.toLowerCase()) {
        case "base64":
            return new Base64OutputStream(os, true);
        case "quoted-printable":
            // TODO: implement QuotedPrintableOutputStream
            return new Base64OutputStream(os, true);
        case "binary":
        case "7bit":
        case "8bit":
            // Identity encoding
            return os;
        default:
            throw new Exception("Unknown encoding: " + encoding);
        }
    }
    
    public static ApplicationEDIEntity createEDIEntity(String ediMessage, ContentType ediMessageContentType, String contentTransferEncoding, boolean isMainBody) throws Exception {
        Args.notNull(ediMessage, "EDI Message");
        Args.notNull(ediMessageContentType, "EDI Message Content Type");
        
        switch(ediMessageContentType.getMimeType().toLowerCase()) {
        case AS2MediaType.APPLICATION_EDIFACT:
            return new ApplicationEDIFACTEntity(ediMessage, ediMessageContentType.getCharset().toString(), contentTransferEncoding, isMainBody);            
        case AS2MediaType.APPLICATION_EDI_X12:
            return new ApplicationEDIX12Entity(ediMessage, ediMessageContentType.getCharset().toString(), contentTransferEncoding, isMainBody);            
        case AS2MediaType.APPLICATION_EDI_CONSENT:
            return new ApplicationEDIConsentEntity(ediMessage, ediMessageContentType.getCharset().toString(), contentTransferEncoding, isMainBody);            
        default:
            throw new Exception("Invalid EDI entity mime type: " + ediMessageContentType.getMimeType());
        }
        
    }

    public static void parseAS2MessageEntity(HttpRequest request) throws Exception {
        HttpEntity entity = null;
        if (request instanceof HttpEntityEnclosingRequest) {
            entity = ((HttpEntityEnclosingRequest) request).getEntity();
            if (entity.getContentType() != null) {
                ContentType contentType;
                try {
                    contentType =  ContentType.parse(entity.getContentType().getValue());
                } catch (Exception e) {
                    throw new Exception("Failed to get Content Type", e);
                }
                switch (contentType.getMimeType().toLowerCase()) {
                case "application/edifact":
                    entity = ApplicationEDIEntity.parseEntity(entity, true);
                    ((HttpEntityEnclosingRequest) request).setEntity(entity);
                    break;
                case "application/edi-x12":
                    break;
                case "application/consent":
                    break;
                case "multipart/signed":
                    break;
                case "application/pkcs7-mime":
                    break;
                case "message/disposition-notification":
                    break;
                default:
                    break;
                }
            }
        }
    }
    
    public static byte[] getContent(HttpEntity entity) {
        try {
            final ByteArrayOutputStream outstream = new ByteArrayOutputStream();
            entity.writeTo(outstream);
            outstream.flush();
            return outstream.toByteArray();
        } catch (Exception e) {
            LOG.debug("failed to get content", e);
            return null;
        }
    }


    
}
