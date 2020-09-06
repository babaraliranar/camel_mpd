
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.zendesk;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel EndpointConfiguration for org.zendesk.client.v2.Zendesk
 */
@ApiParams(apiName = "DEFAULT", apiMethods = "addTagToOrganisations,addTagToTicket,addTagToTopics,createArticle,createArticleTranslation,createAutomation,createCategory,createCategoryTranslation,createComment,createDynamicContentItem,createDynamicContentItemVariant,createForum,createGroup,createGroupMembership,createMacro,createOrUpdateUser,createOrUpdateUsers,createOrUpdateUsersAsync,createOrganization,createOrganizationMembership,createOrganizationMemberships,createOrganizationMembershipsAsync,createOrganizations,createOrganizationsAsync,createPermissionGroup,createRequest,createSatisfactionRating,createSection,createSectionTranslation,createTarget,createTicket,createTicketAsync,createTicketField,createTicketForm,createTicketFromTweet,createTickets,createTicketsAsync,createTopic,createTrigger,createUpload,createUploadArticle,createUser,createUserIdentity,createUserSegment,createUsers,createUsersAsync,getArticle,getArticleFromSearch,getArticleSubscriptions,getArticleTranslations,getArticles,getArticlesFromAllLabels,getArticlesFromAnyLabels,getArticlesFromPage,getArticlesIncrementally,getAssignableGroupMemberships,getAssignableGroups,getAttachment,getAttachmentsFromArticle,getAuthenticatedUser,getAutoCompleteOrganizations,getAutomation,getAutomations,getBrands,getCCRequests,getCategories,getCategory,getCategoryTranslations,getComplianceDeletionStatuses,getCurrentUser,getCustomAgentRoles,getDeletedTickets,getDynamicContentItem,getDynamicContentItemVariant,getDynamicContentItemVariants,getDynamicContentItems,getForum,getForums,getGroup,getGroupMembership,getGroupMembershipByUser,getGroupMemberships,getGroupOrganization,getGroupUsers,getGroups,getHelpCenterLocales,getHolidaysForSchedule,getIncrementalTicketsResult,getJobStatus,getJobStatusAsync,getJobStatuses,getJobStatusesAsync,getMacro,getMacros,getOpenRequests,getOrganization,getOrganizationFields,getOrganizationMembership,getOrganizationMembershipByUser,getOrganizationMembershipForUser,getOrganizationMemberships,getOrganizationMembershipsForOrg,getOrganizationMembershipsForUser,getOrganizationTickets,getOrganizationUsers,getOrganizations,getOrganizationsIncrementally,getPermissionGroup,getPermissionGroups,getRecentTickets,getRequest,getRequestComment,getRequestComments,getRequests,getSatisfactionRating,getSatisfactionRatings,getSchedule,getSchedules,getSearchResults,getSection,getSectionSubscriptions,getSectionTranslations,getSections,getSolvedRequests,getSuspendedTickets,getTarget,getTargets,getTicket,getTicketAudit,getTicketAudits,getTicketCollaborators,getTicketComments,getTicketField,getTicketFields,getTicketForm,getTicketForms,getTicketIncidents,getTicketMetric,getTicketMetricByTicket,getTicketMetrics,getTickets,getTicketsByExternalId,getTicketsFromSearch,getTicketsIncrementally,getTopic,getTopics,getTopicsByUser,getTrigger,getTriggers,getTwitterMonitors,getUser,getUserCCDTickets,getUserFields,getUserIdentities,getUserIdentity,getUserRelatedInfo,getUserRequestedTickets,getUserRequests,getUserSegment,getUserSegments,getUserSegmentsApplicable,getUserSubscriptions,getUsers,getUsersByRole,getUsersIncrementally,importTicket,importTopic,lookupOrganizationsByExternalId,lookupUserByEmail,lookupUserByExternalId,macrosShowChangesToTicket,macrosShowTicketAfterChanges,mergeUsers,permanentlyDeleteTicket,permanentlyDeleteTickets,permanentlyDeleteUser,queueCreateTicketAsync,removeTagFromOrganisations,removeTagFromTicket,removeTagFromTopics,requestVerifyUserIdentity,setGroupMembershipAsDefault,setOrganizationMembershipAsDefault,setTagOnOrganisations,setTagOnTicket,setTagOnTopics,setUserPrimaryIdentity,suspendUser,unsuspendUser,updateArticle,updateArticleTranslation,updateAutomation,updateCategory,updateCategoryTranslation,updateDynamicContentItem,updateDynamicContentItemVariant,updateForum,updateGroup,updateMacro,updateOrganization,updateOrganizations,updateOrganizationsAsync,updatePermissionGroup,updateRequest,updateSection,updateSectionTranslation,updateTicket,updateTicketField,updateTickets,updateTicketsAsync,updateTopic,updateTrigger,updateUser,updateUserIdentity,updateUserSegment,updateUsers,updateUsersAsync,verifyUserIdentity")
@UriParams
@Configurer
public final class ZendeskEndpointConfiguration extends ZendeskConfiguration {
    @UriParam
    private org.zendesk.client.v2.model.hc.Article article;
    @UriParam
    private Long articleId;
    @UriParam
    private Long articleId0;
    @UriParam
    private org.zendesk.client.v2.model.Attachment attachment;
    @UriParam
    private org.zendesk.client.v2.model.Audit audit;
    @UriParam
    private Long auditId;
    @UriParam
    private org.zendesk.client.v2.model.Automation automation;
    @UriParam
    private Long automationId;
    @UriParam
    private org.zendesk.client.v2.model.hc.Category category;
    @UriParam
    private Long categoryId;
    @UriParam
    private Long category_id;
    @UriParam
    private org.zendesk.client.v2.model.Comment comment;
    @UriParam
    private Long commentId;
    @UriParam
    private byte[] content;
    @UriParam
    private String contentType;
    @UriParam
    private String email;
    @UriParam
    private java.util.Date endTime;
    @UriParam
    private String externalId;
    @UriParam
    private org.zendesk.client.v2.model.Field field;
    @UriParam
    private java.io.File file;
    @UriParam
    private String fileName;
    @UriParam
    private org.zendesk.client.v2.model.Forum forum;
    @UriParam
    private Long forum_id;
    @UriParam
    private org.zendesk.client.v2.model.Group group;
    @UriParam
    private org.zendesk.client.v2.model.GroupMembership groupMembership;
    @UriParam
    private Long group_id;
    @UriParam
    private Long group_membership_id;
    @UriParam
    private Long id;
    @UriParam
    private org.zendesk.client.v2.model.Identity identity;
    @UriParam
    private Long identityId;
    @UriParam
    private long[] ids;
    @UriParam
    private Boolean includeArchived;
    @UriParam
    private Boolean inline;
    @UriParam
    private org.zendesk.client.v2.model.dynamic.DynamicContentItem item;
    @UriParam
    private Long itemId;
    @UriParam
    private java.util.List labels;
    @UriParam
    private String locale;
    @UriParam
    private org.zendesk.client.v2.model.Macro macro;
    @UriParam
    private Long macroId;
    @UriParam
    private Long macroId0;
    @UriParam
    private Long monitorId;
    @UriParam
    private String name;
    @UriParam
    private Boolean notifySubscribers;
    @UriParam
    private org.zendesk.client.v2.model.SortOrder order;
    @UriParam
    private org.zendesk.client.v2.model.Organization organization;
    @UriParam
    private Long organizationId;
    @UriParam
    private java.util.List organizationList;
    @UriParam
    private org.zendesk.client.v2.model.OrganizationMembership organizationMembership;
    @UriParam
    private java.util.List organizationMembershipList;
    @UriParam
    private org.zendesk.client.v2.model.OrganizationMembership[] organizationMemberships;
    @UriParam
    private Long organization_id;
    @UriParam
    private Long organization_membership_id;
    @UriParam
    private org.zendesk.client.v2.model.Organization[] organizations;
    @UriParam
    private Integer page;
    @UriParam
    private String parameters;
    @UriParam
    private java.util.Map params;
    @UriParam
    private org.zendesk.client.v2.model.hc.PermissionGroup permissionGroup;
    @UriParam
    private String query;
    @UriParam
    private org.zendesk.client.v2.model.Request request;
    @UriParam
    private Long requestId;
    @UriParam
    private String role;
    @UriParam
    private String[] roles;
    @UriParam
    private org.zendesk.client.v2.model.SatisfactionRating satisfactionRating;
    @UriParam
    private org.zendesk.client.v2.model.schedules.Schedule schedule;
    @UriParam
    private Long scheduleId;
    @UriParam
    private String searchTerm;
    @UriParam
    private org.zendesk.client.v2.model.hc.Section section;
    @UriParam
    private Long sectionId;
    @UriParam
    private String sortBy;
    @UriParam
    private org.zendesk.client.v2.model.SortOrder sortOrder;
    @UriParam
    private java.util.Date startTime;
    @UriParam
    private org.zendesk.client.v2.model.JobStatus status;
    @UriParam
    private java.util.List statuses;
    @UriParam
    private String[] tags;
    @UriParam
    private org.zendesk.client.v2.model.targets.Target target;
    @UriParam
    private org.zendesk.client.v2.model.Ticket ticket;
    @UriParam
    private org.zendesk.client.v2.model.TicketForm ticketForm;
    @UriParam
    private Long ticketId;
    @UriParam
    private Long ticketId0;
    @UriParam
    private org.zendesk.client.v2.model.TicketImport ticketImport;
    @UriParam
    private java.util.List ticketList;
    @UriParam
    private org.zendesk.client.v2.model.Ticket[] tickets;
    @UriParam
    private String token;
    @UriParam
    private org.zendesk.client.v2.model.Topic topic;
    @UriParam
    private org.zendesk.client.v2.model.hc.Translation translation;
    @UriParam
    private org.zendesk.client.v2.model.Trigger trigger;
    @UriParam
    private Long triggerId0;
    @UriParam
    private Long tweetId;
    @UriParam
    private Class type;
    @UriParam
    private Long unixEpochTime;
    @UriParam
    private org.zendesk.client.v2.model.User user;
    @UriParam
    private Long userId;
    @UriParam
    private Long userId0;
    @UriParam
    private Long userIdThatWillBeMerged;
    @UriParam
    private Long userIdThatWillRemain;
    @UriParam
    private java.util.List userList;
    @UriParam
    private org.zendesk.client.v2.model.hc.UserSegment userSegment;
    @UriParam
    private Long user_id;
    @UriParam
    private org.zendesk.client.v2.model.User[] users;
    @UriParam
    private java.util.List usersList;
    @UriParam
    private org.zendesk.client.v2.model.dynamic.DynamicContentItemVariant variant;

    public org.zendesk.client.v2.model.hc.Article getArticle() {
        return article;
    }

    public void setArticle(org.zendesk.client.v2.model.hc.Article article) {
        this.article = article;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getArticleId0() {
        return articleId0;
    }

    public void setArticleId0(Long articleId0) {
        this.articleId0 = articleId0;
    }

    public org.zendesk.client.v2.model.Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(org.zendesk.client.v2.model.Attachment attachment) {
        this.attachment = attachment;
    }

    public org.zendesk.client.v2.model.Audit getAudit() {
        return audit;
    }

    public void setAudit(org.zendesk.client.v2.model.Audit audit) {
        this.audit = audit;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public org.zendesk.client.v2.model.Automation getAutomation() {
        return automation;
    }

    public void setAutomation(org.zendesk.client.v2.model.Automation automation) {
        this.automation = automation;
    }

    public Long getAutomationId() {
        return automationId;
    }

    public void setAutomationId(Long automationId) {
        this.automationId = automationId;
    }

    public org.zendesk.client.v2.model.hc.Category getCategory() {
        return category;
    }

    public void setCategory(org.zendesk.client.v2.model.hc.Category category) {
        this.category = category;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public org.zendesk.client.v2.model.Comment getComment() {
        return comment;
    }

    public void setComment(org.zendesk.client.v2.model.Comment comment) {
        this.comment = comment;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.util.Date getEndTime() {
        return endTime;
    }

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public org.zendesk.client.v2.model.Field getField() {
        return field;
    }

    public void setField(org.zendesk.client.v2.model.Field field) {
        this.field = field;
    }

    public java.io.File getFile() {
        return file;
    }

    public void setFile(java.io.File file) {
        this.file = file;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public org.zendesk.client.v2.model.Forum getForum() {
        return forum;
    }

    public void setForum(org.zendesk.client.v2.model.Forum forum) {
        this.forum = forum;
    }

    public Long getForum_id() {
        return forum_id;
    }

    public void setForum_id(Long forum_id) {
        this.forum_id = forum_id;
    }

    public org.zendesk.client.v2.model.Group getGroup() {
        return group;
    }

    public void setGroup(org.zendesk.client.v2.model.Group group) {
        this.group = group;
    }

    public org.zendesk.client.v2.model.GroupMembership getGroupMembership() {
        return groupMembership;
    }

    public void setGroupMembership(org.zendesk.client.v2.model.GroupMembership groupMembership) {
        this.groupMembership = groupMembership;
    }

    public Long getGroup_id() {
        return group_id;
    }

    public void setGroup_id(Long group_id) {
        this.group_id = group_id;
    }

    public Long getGroup_membership_id() {
        return group_membership_id;
    }

    public void setGroup_membership_id(Long group_membership_id) {
        this.group_membership_id = group_membership_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public org.zendesk.client.v2.model.Identity getIdentity() {
        return identity;
    }

    public void setIdentity(org.zendesk.client.v2.model.Identity identity) {
        this.identity = identity;
    }

    public Long getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Long identityId) {
        this.identityId = identityId;
    }

    public long[] getIds() {
        return ids;
    }

    public void setIds(long[] ids) {
        this.ids = ids;
    }

    public Boolean getIncludeArchived() {
        return includeArchived;
    }

    public void setIncludeArchived(Boolean includeArchived) {
        this.includeArchived = includeArchived;
    }

    public Boolean getInline() {
        return inline;
    }

    public void setInline(Boolean inline) {
        this.inline = inline;
    }

    public org.zendesk.client.v2.model.dynamic.DynamicContentItem getItem() {
        return item;
    }

    public void setItem(org.zendesk.client.v2.model.dynamic.DynamicContentItem item) {
        this.item = item;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public java.util.List getLabels() {
        return labels;
    }

    public void setLabels(java.util.List labels) {
        this.labels = labels;
    }

    public String getLocale() {
        return locale;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public org.zendesk.client.v2.model.Macro getMacro() {
        return macro;
    }

    public void setMacro(org.zendesk.client.v2.model.Macro macro) {
        this.macro = macro;
    }

    public Long getMacroId() {
        return macroId;
    }

    public void setMacroId(Long macroId) {
        this.macroId = macroId;
    }

    public Long getMacroId0() {
        return macroId0;
    }

    public void setMacroId0(Long macroId0) {
        this.macroId0 = macroId0;
    }

    public Long getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(Long monitorId) {
        this.monitorId = monitorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getNotifySubscribers() {
        return notifySubscribers;
    }

    public void setNotifySubscribers(Boolean notifySubscribers) {
        this.notifySubscribers = notifySubscribers;
    }

    public org.zendesk.client.v2.model.SortOrder getOrder() {
        return order;
    }

    public void setOrder(org.zendesk.client.v2.model.SortOrder order) {
        this.order = order;
    }

    public org.zendesk.client.v2.model.Organization getOrganization() {
        return organization;
    }

    public void setOrganization(org.zendesk.client.v2.model.Organization organization) {
        this.organization = organization;
    }

    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public java.util.List getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(java.util.List organizationList) {
        this.organizationList = organizationList;
    }

    public org.zendesk.client.v2.model.OrganizationMembership getOrganizationMembership() {
        return organizationMembership;
    }

    public void setOrganizationMembership(org.zendesk.client.v2.model.OrganizationMembership organizationMembership) {
        this.organizationMembership = organizationMembership;
    }

    public java.util.List getOrganizationMembershipList() {
        return organizationMembershipList;
    }

    public void setOrganizationMembershipList(java.util.List organizationMembershipList) {
        this.organizationMembershipList = organizationMembershipList;
    }

    public org.zendesk.client.v2.model.OrganizationMembership[] getOrganizationMemberships() {
        return organizationMemberships;
    }

    public void setOrganizationMemberships(org.zendesk.client.v2.model.OrganizationMembership[] organizationMemberships) {
        this.organizationMemberships = organizationMemberships;
    }

    public Long getOrganization_id() {
        return organization_id;
    }

    public void setOrganization_id(Long organization_id) {
        this.organization_id = organization_id;
    }

    public Long getOrganization_membership_id() {
        return organization_membership_id;
    }

    public void setOrganization_membership_id(Long organization_membership_id) {
        this.organization_membership_id = organization_membership_id;
    }

    public org.zendesk.client.v2.model.Organization[] getOrganizations() {
        return organizations;
    }

    public void setOrganizations(org.zendesk.client.v2.model.Organization[] organizations) {
        this.organizations = organizations;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        this.parameters = parameters;
    }

    public java.util.Map getParams() {
        return params;
    }

    public void setParams(java.util.Map params) {
        this.params = params;
    }

    public org.zendesk.client.v2.model.hc.PermissionGroup getPermissionGroup() {
        return permissionGroup;
    }

    public void setPermissionGroup(org.zendesk.client.v2.model.hc.PermissionGroup permissionGroup) {
        this.permissionGroup = permissionGroup;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public org.zendesk.client.v2.model.Request getRequest() {
        return request;
    }

    public void setRequest(org.zendesk.client.v2.model.Request request) {
        this.request = request;
    }

    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }

    public org.zendesk.client.v2.model.SatisfactionRating getSatisfactionRating() {
        return satisfactionRating;
    }

    public void setSatisfactionRating(org.zendesk.client.v2.model.SatisfactionRating satisfactionRating) {
        this.satisfactionRating = satisfactionRating;
    }

    public org.zendesk.client.v2.model.schedules.Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(org.zendesk.client.v2.model.schedules.Schedule schedule) {
        this.schedule = schedule;
    }

    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }

    public org.zendesk.client.v2.model.hc.Section getSection() {
        return section;
    }

    public void setSection(org.zendesk.client.v2.model.hc.Section section) {
        this.section = section;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public org.zendesk.client.v2.model.SortOrder getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(org.zendesk.client.v2.model.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }

    public java.util.Date getStartTime() {
        return startTime;
    }

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    public org.zendesk.client.v2.model.JobStatus getStatus() {
        return status;
    }

    public void setStatus(org.zendesk.client.v2.model.JobStatus status) {
        this.status = status;
    }

    public java.util.List getStatuses() {
        return statuses;
    }

    public void setStatuses(java.util.List statuses) {
        this.statuses = statuses;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public org.zendesk.client.v2.model.targets.Target getTarget() {
        return target;
    }

    public void setTarget(org.zendesk.client.v2.model.targets.Target target) {
        this.target = target;
    }

    public org.zendesk.client.v2.model.Ticket getTicket() {
        return ticket;
    }

    public void setTicket(org.zendesk.client.v2.model.Ticket ticket) {
        this.ticket = ticket;
    }

    public org.zendesk.client.v2.model.TicketForm getTicketForm() {
        return ticketForm;
    }

    public void setTicketForm(org.zendesk.client.v2.model.TicketForm ticketForm) {
        this.ticketForm = ticketForm;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public void setTicketId(Long ticketId) {
        this.ticketId = ticketId;
    }

    public Long getTicketId0() {
        return ticketId0;
    }

    public void setTicketId0(Long ticketId0) {
        this.ticketId0 = ticketId0;
    }

    public org.zendesk.client.v2.model.TicketImport getTicketImport() {
        return ticketImport;
    }

    public void setTicketImport(org.zendesk.client.v2.model.TicketImport ticketImport) {
        this.ticketImport = ticketImport;
    }

    public java.util.List getTicketList() {
        return ticketList;
    }

    public void setTicketList(java.util.List ticketList) {
        this.ticketList = ticketList;
    }

    public org.zendesk.client.v2.model.Ticket[] getTickets() {
        return tickets;
    }

    public void setTickets(org.zendesk.client.v2.model.Ticket[] tickets) {
        this.tickets = tickets;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public org.zendesk.client.v2.model.Topic getTopic() {
        return topic;
    }

    public void setTopic(org.zendesk.client.v2.model.Topic topic) {
        this.topic = topic;
    }

    public org.zendesk.client.v2.model.hc.Translation getTranslation() {
        return translation;
    }

    public void setTranslation(org.zendesk.client.v2.model.hc.Translation translation) {
        this.translation = translation;
    }

    public org.zendesk.client.v2.model.Trigger getTrigger() {
        return trigger;
    }

    public void setTrigger(org.zendesk.client.v2.model.Trigger trigger) {
        this.trigger = trigger;
    }

    public Long getTriggerId0() {
        return triggerId0;
    }

    public void setTriggerId0(Long triggerId0) {
        this.triggerId0 = triggerId0;
    }

    public Long getTweetId() {
        return tweetId;
    }

    public void setTweetId(Long tweetId) {
        this.tweetId = tweetId;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public Long getUnixEpochTime() {
        return unixEpochTime;
    }

    public void setUnixEpochTime(Long unixEpochTime) {
        this.unixEpochTime = unixEpochTime;
    }

    public org.zendesk.client.v2.model.User getUser() {
        return user;
    }

    public void setUser(org.zendesk.client.v2.model.User user) {
        this.user = user;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserId0() {
        return userId0;
    }

    public void setUserId0(Long userId0) {
        this.userId0 = userId0;
    }

    public Long getUserIdThatWillBeMerged() {
        return userIdThatWillBeMerged;
    }

    public void setUserIdThatWillBeMerged(Long userIdThatWillBeMerged) {
        this.userIdThatWillBeMerged = userIdThatWillBeMerged;
    }

    public Long getUserIdThatWillRemain() {
        return userIdThatWillRemain;
    }

    public void setUserIdThatWillRemain(Long userIdThatWillRemain) {
        this.userIdThatWillRemain = userIdThatWillRemain;
    }

    public java.util.List getUserList() {
        return userList;
    }

    public void setUserList(java.util.List userList) {
        this.userList = userList;
    }

    public org.zendesk.client.v2.model.hc.UserSegment getUserSegment() {
        return userSegment;
    }

    public void setUserSegment(org.zendesk.client.v2.model.hc.UserSegment userSegment) {
        this.userSegment = userSegment;
    }

    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public org.zendesk.client.v2.model.User[] getUsers() {
        return users;
    }

    public void setUsers(org.zendesk.client.v2.model.User[] users) {
        this.users = users;
    }

    public java.util.List getUsersList() {
        return usersList;
    }

    public void setUsersList(java.util.List usersList) {
        this.usersList = usersList;
    }

    public org.zendesk.client.v2.model.dynamic.DynamicContentItemVariant getVariant() {
        return variant;
    }

    public void setVariant(org.zendesk.client.v2.model.dynamic.DynamicContentItemVariant variant) {
        this.variant = variant;
    }
}
