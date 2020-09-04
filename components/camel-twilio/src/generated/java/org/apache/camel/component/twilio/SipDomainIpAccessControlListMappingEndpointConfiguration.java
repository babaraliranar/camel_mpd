
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.sip.domain.IpAccessControlListMapping
 */
@ApiParams(apiName = "sip-domain-ip-access-control-list-mapping", apiMethods = "creator,deleter,fetcher,reader")
@UriParams
@Configurer
public final class SipDomainIpAccessControlListMappingEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The unique id of the IP access control list to map to the SIP domain")
    private String ipAccessControlListSid;
    @UriParam(description = "The unique id of the Account that is responsible for this resource")
    private String pathAccountSid;
    @UriParam(description = "A string that uniquely identifies the SIP Domain")
    private String pathDomainSid;
    @UriParam(description = "A 34 character string that uniquely identifies the resource to delete.")
    private String pathSid;

    public String getIpAccessControlListSid() {
        return ipAccessControlListSid;
    }

    public void setIpAccessControlListSid(String ipAccessControlListSid) {
        this.ipAccessControlListSid = ipAccessControlListSid;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathDomainSid() {
        return pathDomainSid;
    }

    public void setPathDomainSid(String pathDomainSid) {
        this.pathDomainSid = pathDomainSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
