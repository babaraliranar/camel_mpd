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
 * Camel endpoint configuration for {@link com.google.api.services.drive.Drive.Children}.
 */
@ApiParams(apiName = "drive-children", 
           description = "The children collection of methods",
           apiMethods = {@ApiMethod(methodName = "delete", description="Removes a child from a folder", signatures={"com.google.api.services.drive.Drive$Children$Delete delete(String folderId, String childId)"}), @ApiMethod(methodName = "get", description="Gets a specific child reference", signatures={"com.google.api.services.drive.Drive$Children$Get get(String folderId, String childId)"}), @ApiMethod(methodName = "insert", description="Inserts a file into a folder", signatures={"com.google.api.services.drive.Drive$Children$Insert insert(String folderId, com.google.api.services.drive.model.ChildReference content)"}), @ApiMethod(methodName = "list", description="Lists a folder's children", signatures={"com.google.api.services.drive.Drive$Children$List list(String folderId)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class DriveChildrenEndpointConfiguration extends GoogleDriveConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the child"), @ApiMethod(methodName = "get", description="The ID of the child")})
    private String childId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "insert", description="The com.google.api.services.drive.model.ChildReference")})
    private com.google.api.services.drive.model.ChildReference content;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "delete", description="The ID of the folder"), @ApiMethod(methodName = "get", description="The ID of the folder"), @ApiMethod(methodName = "insert", description="The ID of the folder"), @ApiMethod(methodName = "list", description="The ID of the folder")})
    private String folderId;

    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    public com.google.api.services.drive.model.ChildReference getContent() {
        return content;
    }

    public void setContent(com.google.api.services.drive.model.ChildReference content) {
        this.content = content;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }
}
