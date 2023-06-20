/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.box;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxCollaborationsManager}.
 */
@ApiParams(apiName = "collaborations", producerOnly = true,
           description = "Provides operations to manage Box collaborations",
           apiMethods = {@ApiMethod(methodName = "addFolderCollaboration", description="Add a collaboration to this folder", signatures={"com.box.sdk.BoxCollaboration addFolderCollaboration(String folderId, com.box.sdk.BoxCollaborator collaborator, com.box.sdk.BoxCollaboration$Role role)"}), @ApiMethod(methodName = "addFolderCollaborationByEmail", description="Add a collaboration to this folder", signatures={"com.box.sdk.BoxCollaboration addFolderCollaborationByEmail(String folderId, String email, com.box.sdk.BoxCollaboration$Role role)"}), @ApiMethod(methodName = "deleteCollaboration", description="Delete collaboration", signatures={"void deleteCollaboration(String collaborationId)"}), @ApiMethod(methodName = "getCollaborationInfo", description="Get collaboration information", signatures={"com.box.sdk.BoxCollaboration$Info getCollaborationInfo(String collaborationId)"}), @ApiMethod(methodName = "getFolderCollaborations", description="Get information about all of the collaborations for folder", signatures={"java.util.Collection<com.box.sdk.BoxCollaboration$Info> getFolderCollaborations(String folderId)"}), @ApiMethod(methodName = "getPendingCollaborations", description="Get all pending collaboration invites for the current user", signatures={"java.util.Collection<com.box.sdk.BoxCollaboration$Info> getPendingCollaborations()"}), @ApiMethod(methodName = "updateCollaborationInfo", description="Update collaboration information", signatures={"com.box.sdk.BoxCollaboration updateCollaborationInfo(String collaborationId, com.box.sdk.BoxCollaboration$Info info)"})}, aliases = {"addFolderCollaboration=add", "addFolderCollaborationByEmail=addByEmail", "deleteCollaboration=delete", "getFolderCollaborations=collaborations", "getPendingCollaborations=pendingCollaborations", "getCollaborationInfo=info", "updateCollaborationInfo=updateInfo"})
@UriParams
@Configurer(extended = true)
public final class BoxCollaborationsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteCollaboration", description="The id of comment to change"), @ApiMethod(methodName = "getCollaborationInfo", description="The id of collaboration"), @ApiMethod(methodName = "updateCollaborationInfo", description="The id of collaboration")})
    private String collaborationId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFolderCollaboration", description="The collaborator to add")})
    private com.box.sdk.BoxCollaborator collaborator;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFolderCollaborationByEmail", description="The email address of the collaborator to add")})
    private String email;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFolderCollaboration", description="The id of folder to add collaboration to"), @ApiMethod(methodName = "addFolderCollaborationByEmail", description="The id of folder to add collaboration to"), @ApiMethod(methodName = "getFolderCollaborations", description="The id of folder to get collaborations information on")})
    private String folderId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updateCollaborationInfo", description="Collaboration information to update")})
    private com.box.sdk.BoxCollaboration.Info info;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addFolderCollaboration", description="The role of the collaborator"), @ApiMethod(methodName = "addFolderCollaborationByEmail", description="The role of the collaborator")})
    private com.box.sdk.BoxCollaboration.Role role;

    public String getCollaborationId() {
        return collaborationId;
    }

    public void setCollaborationId(String collaborationId) {
        this.collaborationId = collaborationId;
    }

    public com.box.sdk.BoxCollaborator getCollaborator() {
        return collaborator;
    }

    public void setCollaborator(com.box.sdk.BoxCollaborator collaborator) {
        this.collaborator = collaborator;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFolderId() {
        return folderId;
    }

    public void setFolderId(String folderId) {
        this.folderId = folderId;
    }

    public com.box.sdk.BoxCollaboration.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxCollaboration.Info info) {
        this.info = info;
    }

    public com.box.sdk.BoxCollaboration.Role getRole() {
        return role;
    }

    public void setRole(com.box.sdk.BoxCollaboration.Role role) {
        this.role = role;
    }
}
