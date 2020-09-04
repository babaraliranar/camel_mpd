
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for com.twilio.rest.api.v2010.account.call.FeedbackSummary
 */
@ApiParams(apiName = "call-feedback-summary", apiMethods = "creator,deleter,fetcher")
@UriParams
@Configurer
public final class CallFeedbackSummaryEndpointConfiguration extends TwilioConfiguration {
    @UriParam(description = "Only include feedback given on or before this date")
    private org.joda.time.LocalDate endDate;
    @UriParam(description = "The unique sid that identifies this account")
    private String pathAccountSid;
    @UriParam(description = "A string that uniquely identifies this feedback summary resource")
    private String pathSid;
    @UriParam(description = "Only include feedback given on or after this date")
    private org.joda.time.LocalDate startDate;

    public org.joda.time.LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(org.joda.time.LocalDate endDate) {
        this.endDate = endDate;
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

    public org.joda.time.LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(org.joda.time.LocalDate startDate) {
        this.startDate = startDate;
    }
}
