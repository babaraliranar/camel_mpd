
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.Domain
 */
@ApiParams(apiName = "sip-domain", apiMethods = "creator,deleter,fetcher,reader,updater")
@UriParams
@Configurer
public final class SipDomainEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The unique address on Twilio to route SIP traffic")
    private String domainName;
    @UriParam(description = "The SID of the Account that will create the resource")
    private String pathAccountSid;
    @UriParam(description = "The unique string that identifies the resource")
    private String pathSid;

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
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
