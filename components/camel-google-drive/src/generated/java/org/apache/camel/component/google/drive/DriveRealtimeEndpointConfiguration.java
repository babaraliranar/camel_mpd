
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.google.drive;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Realtime}.
 */
@ApiParams(apiName = "drive-realtime", 
           description = "The realtime collection of methods",
           apiMethods = {@ApiMethod(methodName = "get", description="Exports the contents of the Realtime API data model associated with this file as JSON", signatures={"com.google.api.services.drive.Drive$Realtime$Get get(String fileId)"}), @ApiMethod(methodName = "update", description="Overwrites the Realtime API data model associated with this file with the provided JSON data model", signatures={"com.google.api.services.drive.Drive$Realtime$Update update(String fileId)", "com.google.api.services.drive.Drive$Realtime$Update update(String fileId, com.google.api.client.http.AbstractInputStreamContent mediaContent)"}), }, aliases = {})
@UriParams
@Configurer(api = true)
public final class DriveRealtimeEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "get", description="The ID of the file that the Realtime API data model is associated with"), @ApiMethod(methodName = "update", description="The ID of the file that the Realtime API data model is associated with"), @ApiMethod(methodName = "update", description="The ID of the file that the Realtime API data model is associated with")})
    private String fileId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "update", description="The media HTTP content or null if none")})
    private com.google.api.client.http.AbstractInputStreamContent mediaContent;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public com.google.api.client.http.AbstractInputStreamContent getMediaContent() {
        return mediaContent;
    }

    public void setMediaContent(com.google.api.client.http.AbstractInputStreamContent mediaContent) {
        this.mediaContent = mediaContent;
    }
}
