
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.queue.Member}.
 */
@ApiParams(apiName = "queue-member", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "fetcher", description="Create a MemberFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.queue.MemberFetcher fetcher(String pathQueueSid, String pathCallSid)", "com.twilio.rest.api.v2010.account.queue.MemberFetcher fetcher(String pathAccountSid, String pathQueueSid, String pathCallSid)"}), @ApiMethod(methodName = "reader", description="Create a MemberReader to execute read", signatures={"com.twilio.rest.api.v2010.account.queue.MemberReader reader(String pathQueueSid)", "com.twilio.rest.api.v2010.account.queue.MemberReader reader(String pathAccountSid, String pathQueueSid)"}), @ApiMethod(methodName = "updater", description="Create a MemberUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.queue.MemberUpdater updater(String pathQueueSid, String pathCallSid, java.net.URI url)", "com.twilio.rest.api.v2010.account.queue.MemberUpdater updater(String pathAccountSid, String pathQueueSid, String pathCallSid, java.net.URI url)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(api = true)
public final class QueueMemberEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The SID of the Account that created the resource(s) to fetch"), @ApiMethod(methodName = "reader", description="The SID of the Account that created the resource(s) to read"), @ApiMethod(methodName = "updater", description="The SID of the Account that created the resource(s) to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The Call SID of the resource(s) to fetch"), @ApiMethod(methodName = "updater", description="The Call SID of the resource(s) to update")})
    private String pathCallSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "fetcher", description="The SID of the Queue in which to find the members"), @ApiMethod(methodName = "fetcher", description="The SID of the Queue in which to find the members"), @ApiMethod(methodName = "reader", description="The SID of the Queue in which to find the members"), @ApiMethod(methodName = "reader", description="The SID of the Queue in which to find the members"), @ApiMethod(methodName = "updater", description="The SID of the Queue in which to find the members"), @ApiMethod(methodName = "updater", description="The SID of the Queue in which to find the members")})
    private String pathQueueSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updater", description="The absolute URL of the Queue resource")})
    private java.net.URI url;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathCallSid() {
        return pathCallSid;
    }

    public void setPathCallSid(String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    public String getPathQueueSid() {
        return pathQueueSid;
    }

    public void setPathQueueSid(String pathQueueSid) {
        this.pathQueueSid = pathQueueSid;
    }

    public java.net.URI getUrl() {
        return url;
    }

    public void setUrl(java.net.URI url) {
        this.url = url;
    }
}
