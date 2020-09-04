
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.address.DependentPhoneNumber
 */
@ApiParams(apiName = "address-dependent-phone-number", apiMethods = "reader")
@UriParams
@Configurer
public final class AddressDependentPhoneNumberEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The SID of the Account that created the resources to read")
    private String pathAccountSid;
    @UriParam(description = "The SID of the Address resource associated with the phone number")
    private String pathAddressSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathAddressSid() {
        return pathAddressSid;
    }

    public void setPathAddressSid(String pathAddressSid) {
        this.pathAddressSid = pathAddressSid;
    }
}
