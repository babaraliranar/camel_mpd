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
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.recording.Transcription}.
 */
@ApiParams(apiName = "recording-transcription", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "deleter", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionDeleter deleter(String pathRecordingSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionDeleter deleter(String pathAccountSid, String pathRecordingSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionFetcher fetcher(String pathRecordingSid, String pathSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionFetcher fetcher(String pathAccountSid, String pathRecordingSid, String pathSid)"}), @ApiMethod(methodName = "reader", signatures={"com.twilio.rest.api.v2010.account.recording.TranscriptionReader reader(String pathRecordingSid)", "com.twilio.rest.api.v2010.account.recording.TranscriptionReader reader(String pathAccountSid, String pathRecordingSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(extended = true)
public final class RecordingTranscriptionEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "fetcher"), @ApiMethod(methodName = "reader"), @ApiMethod(methodName = "reader")})
    private String pathRecordingSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter"), @ApiMethod(methodName = "fetcher")})
    private String pathSid;

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathRecordingSid() {
        return pathRecordingSid;
    }

    public void setPathRecordingSid(String pathRecordingSid) {
        this.pathRecordingSid = pathRecordingSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }
}
