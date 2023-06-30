/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Message}.
 */
@ApiParams(apiName = "message", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", signatures={"com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, String messagingServiceSid, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(com.twilio.type.PhoneNumber to, String messagingServiceSid, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, com.twilio.type.PhoneNumber from, java.util.List<java.net.URI> mediaUrl)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, String messagingServiceSid, String body)", "com.twilio.rest.api.v2010.account.MessageCreator creator(String pathAccountSid, com.twilio.type.PhoneNumber to, String messagingServiceSid, java.util.List<java.net.URI> mediaUrl)"}), @ApiMethod(methodName = "deleter", signatures={"com.twilio.rest.api.v2010.account.MessageDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.MessageDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.MessageFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.MessageFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.MessageReader reader()", "com.twilio.rest.api.v2010.account.MessageReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", signatures={"com.twilio.rest.api.v2010.account.MessageUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.MessageUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class MessageEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private String body;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.PhoneNumber from;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private java.util.List<java.net.URI> mediaUrl;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private String messagingServiceSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "updater")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "updater")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator")})
    private com.twilio.type.PhoneNumber to;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public com.twilio.type.PhoneNumber getFrom() {
        return from;
    }

    public void setFrom(com.twilio.type.PhoneNumber from) {
        this.from = from;
    }

    public java.util.List<java.net.URI> getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(java.util.List<java.net.URI> mediaUrl) {
        this.mediaUrl = mediaUrl;
    }

    public String getMessagingServiceSid() {
        return messagingServiceSid;
    }

    public void setMessagingServiceSid(String messagingServiceSid) {
        this.messagingServiceSid = messagingServiceSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public com.twilio.type.PhoneNumber getTo() {
        return to;
    }

    public void setTo(com.twilio.type.PhoneNumber to) {
        this.to = to;
    }
}
