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
package org.apache.camel.component.aws.ses;

import java.util.Arrays;
import java.util.List;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import org.apache.camel.spi.Metadata;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;
import org.apache.camel.spi.UriPath;

@UriParams
public class SesConfiguration {

    @UriPath @Metadata(required = "true")
    private String from;
    @UriParam
    private AmazonSimpleEmailService amazonSESClient;
    @UriParam
    private String accessKey;
    @UriParam
    private String secretKey;
    @UriParam
    private String amazonSESEndpoint;
    @UriParam
    private String subject;
    @UriParam
    private List<String> to;
    @UriParam
    private String returnPath;
    @UriParam
    private List<String> replyToAddresses;

    public String getAccessKey() {
        return accessKey;
    }

    /**
     * Amazon AWS Access Key
     */
    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public AmazonSimpleEmailService getAmazonSESClient() {
        return amazonSESClient;
    }

    /**
     * To use the AmazonSimpleEmailService as the client
     */
    public void setAmazonSESClient(AmazonSimpleEmailService amazonSESClient) {
        this.amazonSESClient = amazonSESClient;
    }

    public String getFrom() {
        return from;
    }

    /**
     * The sender's email address.
     */
    public void setFrom(String from) {
        this.from = from;
    }

    public List<String> getTo() {
        return to;
    }

    /**
     * List of destination email address. Can be overriden with 'CamelAwsSesTo' header.
     */
    public void setTo(List<String> to) {
        this.to = to;
    }

    /**
     * List of destination email address. Can be overriden with 'CamelAwsSesTo' header.
     */
    public void setTo(String to) {
        this.to = Arrays.asList(to.split(","));
    }

    public String getSecretKey() {
        return secretKey;
    }

    /**
     * Amazon AWS Secret Key
     */
    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getSubject() {
        return subject;
    }

    /**
     * The subject which is used if the message header 'CamelAwsSesSubject' is not present.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }
    
    public String getReturnPath() {
        return returnPath;
    }

    /**
     * The email address to which bounce notifications are to be forwarded, override it using 'CamelAwsSesReturnPath' header.
     */
    public void setReturnPath(String returnPath) {
        this.returnPath = returnPath;
    }
    
    public List<String> getReplyToAddresses() {
        return replyToAddresses;
    }

    /**
     * List of reply-to email address(es) for the message, override it using 'CamelAwsSesReplyToAddresses' header.
     */
    public void setReplyToAddresses(List<String> replyToAddresses) {
        this.replyToAddresses = replyToAddresses;
    }
    
    public void setReplyToAddresses(String replyToAddresses) {
        this.replyToAddresses = Arrays.asList(replyToAddresses.split(","));
    }
    
    public String getAmazonSESEndpoint() {
        return amazonSESEndpoint;
    }

    /**
     * The region with which the AWS-SES client wants to work with.
     */
    public void setAmazonSESEndpoint(String amazonSesEndpoint) {
        this.amazonSESEndpoint = amazonSesEndpoint;
    }

    @Override
    public String toString() {
        return "SesConfiguration{"
                + "accessKey='" + accessKey + '\''
                + ", amazonSESClient=" + amazonSESClient
                + ", secretKey=xxxxxxxxxxxxxxx"
                + ", amazonSesEndpoint='" + amazonSESEndpoint + '\''
                + ", subject='" + subject + '\''
                + ", from='" + from + '\''
                + ", to='" + to + '\''
                + ", returnPath='" + returnPath + '\''
                + ", replyToAddresses='" + replyToAddresses + '\''
                + '}';
    }
}
