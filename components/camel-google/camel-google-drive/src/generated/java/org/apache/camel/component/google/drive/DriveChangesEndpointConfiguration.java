/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Changes}.
 */
@ApiParams(apiName = "drive-changes", 
           description = "The changes collection of methods",
           apiMethods = {@ApiMethod(methodName = "get", description="Deprecated - Use changes", signatures={"com.google.api.services.drive.Drive$Changes$Get get(String changeId)"}), @ApiMethod(methodName = "getStartPageToken", description="Gets the starting pageToken for listing future changes", signatures={"com.google.api.services.drive.Drive$Changes$GetStartPageToken getStartPageToken()"}), @ApiMethod(methodName = "list", description="Lists the changes for a user or shared drive", signatures={"com.google.api.services.drive.Drive$Changes$List list()"}), @ApiMethod(methodName = "watch", description="Subscribe to changes for a user", signatures={"com.google.api.services.drive.Drive$Changes$Watch watch(com.google.api.services.drive.model.Channel content)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class DriveChangesEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The ID of the change")})
    private String changeId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "watch", description="The com.google.api.services.drive.model.Channel")})
    private com.google.api.services.drive.model.Channel contentChannel;

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public com.google.api.services.drive.model.Channel getContentChannel() {
        return contentChannel;
    }

    public void setContentChannel(com.google.api.services.drive.model.Channel contentChannel) {
        this.contentChannel = contentChannel;
    }
}
