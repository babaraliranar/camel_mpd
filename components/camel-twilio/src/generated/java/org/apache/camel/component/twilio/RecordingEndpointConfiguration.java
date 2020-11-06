
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Recording}.
 */
@ApiParams(apiName = "recording", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", description="Create a RecordingDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.RecordingDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.RecordingDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a RecordingFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.RecordingFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.RecordingFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a RecordingReader to execute read", signatures={"com.twilio.rest.api.v2010.account.RecordingReader reader()", "com.twilio.rest.api.v2010.account.RecordingReader reader(String pathAccountSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(api = true)
public final class RecordingEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The SID of the Account that created the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resources to read")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource")})
    private String pathSid;

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
}
