
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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.sip.IpAccessControlList}.
 */
@ApiParams(apiName = "sip-ip-access-control-list", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a IpAccessControlListCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.sip.IpAccessControlListCreator creator(String friendlyName)", "com.twilio.rest.api.v2010.account.sip.IpAccessControlListCreator creator(String pathAccountSid, String friendlyName)"}), @ApiMethod(methodName = "deleter", description="Create a IpAccessControlListDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.sip.IpAccessControlListDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.sip.IpAccessControlListDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a IpAccessControlListFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.sip.IpAccessControlListFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.sip.IpAccessControlListFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a IpAccessControlListReader to execute read", signatures={"com.twilio.rest.api.v2010.account.sip.IpAccessControlListReader reader()", "com.twilio.rest.api.v2010.account.sip.IpAccessControlListReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a IpAccessControlListUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.sip.IpAccessControlListUpdater updater(String pathSid, String friendlyName)", "com.twilio.rest.api.v2010.account.sip.IpAccessControlListUpdater updater(String pathAccountSid, String pathSid, String friendlyName)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(api = true)
public final class SipIpAccessControlListEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="A human readable description of this resource"), @ApiMethod(methodName = "updater", description="A human readable description of this resource")})
    private String friendlyName;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The unique sid that identifies this account"), @ApiMethod(methodName = "deleter", description="The unique sid that identifies this account"), @ApiMethod(methodName = "fetcher", description="The unique sid that identifies this account"), @ApiMethod(methodName = "reader", description="The unique sid that identifies this account"), @ApiMethod(methodName = "updater", description="The unique sid that identifies this account")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="A string that identifies the resource to delete"), @ApiMethod(methodName = "fetcher", description="A string that identifies the resource to fetch"), @ApiMethod(methodName = "updater", description="A string that identifies the resource to update")})
    private String pathSid;

    public String getFriendlyName() {
        return friendlyName;
    }

    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
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
}
