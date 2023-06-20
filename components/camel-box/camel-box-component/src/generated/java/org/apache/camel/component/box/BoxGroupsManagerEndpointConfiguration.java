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
 * Camel endpoint configuration for {@link org.apache.camel.component.box.api.BoxGroupsManager}.
 */
@ApiParams(apiName = "groups", producerOnly = true,
           description = "Provides operations to manage Box groups",
           apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="Add a member to group with the specified role", signatures={"com.box.sdk.BoxGroupMembership addGroupMembership(String groupId, String userId, com.box.sdk.BoxGroupMembership$Role role)"}), @ApiMethod(methodName = "createGroup", description="Create a new group with a specified name and optional additional parameters", signatures={"com.box.sdk.BoxGroup createGroup(String name, String provenance, String externalSyncIdentifier, String description, String invitabilityLevel, String memberViewabilityLevel)"}), @ApiMethod(methodName = "deleteGroup", description="Delete group", signatures={"void deleteGroup(String groupId)"}), @ApiMethod(methodName = "deleteGroupMembership", description="Delete group membership", signatures={"void deleteGroupMembership(String groupMembershipId)"}), @ApiMethod(methodName = "getAllGroups", description="Get all the groups in the enterprise", signatures={"java.util.Collection<com.box.sdk.BoxGroup> getAllGroups()"}), @ApiMethod(methodName = "getGroupInfo", description="Get group information", signatures={"com.box.sdk.BoxGroup$Info getGroupInfo(String groupId)"}), @ApiMethod(methodName = "getGroupMembershipInfo", description="Get group membership information", signatures={"com.box.sdk.BoxGroupMembership$Info getGroupMembershipInfo(String groupMembershipId)"}), @ApiMethod(methodName = "getGroupMemberships", description="Get information about all of the group memberships for this group", signatures={"java.util.Collection<com.box.sdk.BoxGroupMembership$Info> getGroupMemberships(String groupId)"}), @ApiMethod(methodName = "updateGroupInfo", description="Update group information", signatures={"com.box.sdk.BoxGroup updateGroupInfo(String groupId, com.box.sdk.BoxGroup$Info groupInfo)"}), @ApiMethod(methodName = "updateGroupMembershipInfo", description="Update group membership information", signatures={"com.box.sdk.BoxGroupMembership updateGroupMembershipInfo(String groupMembershipId, com.box.sdk.BoxGroupMembership$Info info)"})}, aliases = {"createGroup=create", "deleteGroup=delete", "getAllGroups=groups", "getGroupInfo=info", "addGroupMembership=addMembership", "deleteGroupMembership=deleteMembership", "getGroupMemberships=memberships", "getGroupMembershipInfo=membershipInfo", "updateGroupMembershipInfo=updateMembershipInfo"})
@UriParams
@Configurer(extended = true)
public final class BoxGroupsManagerEndpointConfiguration extends BoxConfiguration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createGroup", description="The description of the new group")})
    private String description;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createGroup", description="The external_sync_identifier of the new group")})
    private String externalSyncIdentifier;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The id of group"), @ApiMethod(methodName = "deleteGroup", description="The id of group to delete"), @ApiMethod(methodName = "getGroupInfo", description="The id of group"), @ApiMethod(methodName = "getGroupMemberships", description="The id of group"), @ApiMethod(methodName = "updateGroupInfo", description="The id of group to update")})
    private String groupId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updateGroupInfo", description="The updated information")})
    private com.box.sdk.BoxGroup.Info groupInfo;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleteGroupMembership", description="The id of group membership to delete"), @ApiMethod(methodName = "getGroupMembershipInfo", description="The id of group membership"), @ApiMethod(methodName = "updateGroupMembershipInfo", description="The id of group membership to update")})
    private String groupMembershipId;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "updateGroupMembershipInfo", description="The updated information")})
    private com.box.sdk.BoxGroupMembership.Info info;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createGroup", description="The invitibility_level of the new group")})
    private String invitabilityLevel;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createGroup", description="The member_viewability_level of the new group")})
    private String memberViewabilityLevel;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "createGroup", description="The name of the new group")})
    private String name;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "createGroup", description="The provenance of the new group")})
    private String provenance;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The role of the user in this group. Can be null to assign the default role.")})
    private com.box.sdk.BoxGroupMembership.Role role;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "addGroupMembership", description="The id of user to be added to group")})
    private String userId;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalSyncIdentifier() {
        return externalSyncIdentifier;
    }

    public void setExternalSyncIdentifier(String externalSyncIdentifier) {
        this.externalSyncIdentifier = externalSyncIdentifier;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public com.box.sdk.BoxGroup.Info getGroupInfo() {
        return groupInfo;
    }

    public void setGroupInfo(com.box.sdk.BoxGroup.Info groupInfo) {
        this.groupInfo = groupInfo;
    }

    public String getGroupMembershipId() {
        return groupMembershipId;
    }

    public void setGroupMembershipId(String groupMembershipId) {
        this.groupMembershipId = groupMembershipId;
    }

    public com.box.sdk.BoxGroupMembership.Info getInfo() {
        return info;
    }

    public void setInfo(com.box.sdk.BoxGroupMembership.Info info) {
        this.info = info;
    }

    public String getInvitabilityLevel() {
        return invitabilityLevel;
    }

    public void setInvitabilityLevel(String invitabilityLevel) {
        this.invitabilityLevel = invitabilityLevel;
    }

    public String getMemberViewabilityLevel() {
        return memberViewabilityLevel;
    }

    public void setMemberViewabilityLevel(String memberViewabilityLevel) {
        this.memberViewabilityLevel = memberViewabilityLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvenance() {
        return provenance;
    }

    public void setProvenance(String provenance) {
        this.provenance = provenance;
    }

    public com.box.sdk.BoxGroupMembership.Role getRole() {
        return role;
    }

    public void setRole(com.box.sdk.BoxGroupMembership.Role role) {
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
