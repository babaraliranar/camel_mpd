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

import org.apache.camel.component.as2.api.AS2Header;
import org.apache.camel.component.as2.api.AS2MimeType;
import org.apache.camel.component.as2.api.AS2SignedDataGenerator;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.io.AbstractMessageParser;
import org.apache.http.impl.io.HttpTransportMetricsImpl;
import org.apache.http.impl.io.SessionInputBufferImpl;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicLineParser;
import org.apache.http.util.Args;

public class MultipartSignedEntity extends MultipartMimeEntity {

    public MultipartSignedEntity(MimeEntity data, AS2SignedDataGenerator signer, String signatureCharSet, String signatureTransferEncoding, boolean isMainBody, String boundary) throws Exception {
        super(null, isMainBody, boundary);
        ContentType contentType = signer.createMultipartSignedContentType(this.boundary);
        this.contentType = new BasicHeader(AS2Header.CONTENT_TYPE, contentType.toString());
        addPart(data);
        ApplicationPkcs7SignatureEntity signature = new ApplicationPkcs7SignatureEntity(data, signer, signatureCharSet, signatureTransferEncoding, false);
        addPart(signature);
    }
    
    protected MultipartSignedEntity() {
    }
    
    public HttpEntity parseEntity(HttpEntity entity, boolean isMainBody) throws Exception{
        Args.notNull(entity, "Entity");
        Args.check(entity.isStreaming(), "Entity is not streaming");
        MultipartSignedEntity multipartSignedEntity = null;
        Header[] headers = null;

        try {
            // Determine and validate the Content Type
            Header contentTypeHeader = entity.getContentType();
            if (contentTypeHeader == null) {
                throw new HttpException("Content-Type header is missing");
            }
            ContentType contentType =  ContentType.parse(entity.getContentType().getValue());
            if (!contentType.getMimeType().equals(AS2MimeType.MULTIPART_SIGNED)) {
                throw new HttpException("Entity has invalid MIME type '" + contentType.getMimeType() + "'");
            }

            // Determine Transfer Encoding
            Header transferEncoding = entity.getContentEncoding();
            String contentTransferEncoding = transferEncoding == null ? null : transferEncoding.getValue();
            
            SessionInputBufferImpl inBuffer = new SessionInputBufferImpl(new HttpTransportMetricsImpl(), 8 * 1024);
            inBuffer.bind(entity.getContent());
            
            // Parse Headers
            if (!isMainBody) {
               headers = AbstractMessageParser.parseHeaders(
                        inBuffer,
                        -1,
                        -1,
                        BasicLineParser.INSTANCE,
                        null);
            }
            
            // Get Boundary Value
            String boundary = contentType.getParameter("boundary");
            if (boundary == null) {
                throw new HttpException("Failed to retrive boundary value");
            }
            
            // TODO: parse encapsulated parts and create sub-entities. 
            
            multipartSignedEntity = new MultipartSignedEntity();
            
            if (headers != null) {
                multipartSignedEntity.setHeaders(headers);
            }

            return multipartSignedEntity;
        } catch (HttpException e) {
            throw e;
        } catch (Exception e) {
            throw new HttpException("Failed to parse entity content", e);
        }
    }
    
}
