
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.recording.AddOnResult
 */
@ApiParams(apiName = "recording-add-on-result", apiMethods = "deleter,fetcher,reader")
@UriParams
@Configurer
public final class RecordingAddOnResultEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "The SID of the Account that created the resources to delete")
    private String pathAccountSid;
    @UriParam(description = "The SID of the recording to which the result to delete belongs")
    private String pathReferenceSid;
    @UriParam(description = "The unique string that identifies the resource to delete")
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathReferenceSid() {
        return pathReferenceSid;
    }

    public void setPathReferenceSid(String pathReferenceSid) {
        this.pathReferenceSid = pathReferenceSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
