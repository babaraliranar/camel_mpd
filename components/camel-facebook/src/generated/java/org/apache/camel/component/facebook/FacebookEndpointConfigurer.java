/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.facebook;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class FacebookEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        FacebookEndpoint target = (FacebookEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "achievementurl":
        case "achievementURL": target.getConfiguration().setAchievementURL(property(camelContext, java.net.URL.class, value)); return true;
        case "albumid":
        case "albumId": target.getConfiguration().setAlbumId(property(camelContext, java.lang.String.class, value)); return true;
        case "albumupdate":
        case "albumUpdate": target.getConfiguration().setAlbumUpdate(property(camelContext, facebook4j.AlbumUpdate.class, value)); return true;
        case "appid":
        case "appId": target.getConfiguration().setAppId(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "center": target.getConfiguration().setCenter(property(camelContext, facebook4j.GeoLocation.class, value)); return true;
        case "checkinid":
        case "checkinId": target.getConfiguration().setCheckinId(property(camelContext, java.lang.String.class, value)); return true;
        case "checkinupdate":
        case "checkinUpdate": target.getConfiguration().setCheckinUpdate(property(camelContext, facebook4j.CheckinUpdate.class, value)); return true;
        case "clienturl":
        case "clientURL": target.getConfiguration().setClientURL(property(camelContext, java.lang.String.class, value)); return true;
        case "clientversion":
        case "clientVersion": target.getConfiguration().setClientVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "commentid":
        case "commentId": target.getConfiguration().setCommentId(property(camelContext, java.lang.String.class, value)); return true;
        case "commentupdate":
        case "commentUpdate": target.getConfiguration().setCommentUpdate(property(camelContext, facebook4j.CommentUpdate.class, value)); return true;
        case "debugenabled":
        case "debugEnabled": target.getConfiguration().setDebugEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "description": target.getConfiguration().setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "distance": target.getConfiguration().setDistance(property(camelContext, java.lang.Integer.class, value)); return true;
        case "domainid":
        case "domainId": target.getConfiguration().setDomainId(property(camelContext, java.lang.String.class, value)); return true;
        case "domainname":
        case "domainName": target.getConfiguration().setDomainName(property(camelContext, java.lang.String.class, value)); return true;
        case "domainnames":
        case "domainNames": target.getConfiguration().setDomainNames(property(camelContext, java.util.List.class, value)); return true;
        case "eventid":
        case "eventId": target.getConfiguration().setEventId(property(camelContext, java.lang.String.class, value)); return true;
        case "eventupdate":
        case "eventUpdate": target.getConfiguration().setEventUpdate(property(camelContext, facebook4j.EventUpdate.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "friendid":
        case "friendId": target.getConfiguration().setFriendId(property(camelContext, java.lang.String.class, value)); return true;
        case "frienduserid":
        case "friendUserId": target.getConfiguration().setFriendUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "friendlistid":
        case "friendlistId": target.getConfiguration().setFriendlistId(property(camelContext, java.lang.String.class, value)); return true;
        case "friendlistname":
        case "friendlistName": target.getConfiguration().setFriendlistName(property(camelContext, java.lang.String.class, value)); return true;
        case "groupid":
        case "groupId": target.getConfiguration().setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "gzipenabled":
        case "gzipEnabled": target.getConfiguration().setGzipEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": target.getConfiguration().setHttpConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpdefaultmaxperroute":
        case "httpDefaultMaxPerRoute": target.getConfiguration().setHttpDefaultMaxPerRoute(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpmaxtotalconnections":
        case "httpMaxTotalConnections": target.getConfiguration().setHttpMaxTotalConnections(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyhost":
        case "httpProxyHost": target.getConfiguration().setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword":
        case "httpProxyPassword": target.getConfiguration().setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport":
        case "httpProxyPort": target.getConfiguration().setHttpProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpproxyuser":
        case "httpProxyUser": target.getConfiguration().setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "httpreadtimeout":
        case "httpReadTimeout": target.getConfiguration().setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpretrycount":
        case "httpRetryCount": target.getConfiguration().setHttpRetryCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpretryintervalseconds":
        case "httpRetryIntervalSeconds": target.getConfiguration().setHttpRetryIntervalSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "httpstreamingreadtimeout":
        case "httpStreamingReadTimeout": target.getConfiguration().setHttpStreamingReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "ids": target.getConfiguration().setIds(property(camelContext, java.util.List.class, value)); return true;
        case "inbody":
        case "inBody": target.setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "includeread":
        case "includeRead": target.getConfiguration().setIncludeRead(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "ishidden":
        case "isHidden": target.getConfiguration().setIsHidden(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "jsonstoreenabled":
        case "jsonStoreEnabled": target.getConfiguration().setJsonStoreEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "link": target.getConfiguration().setLink(property(camelContext, java.net.URL.class, value)); return true;
        case "linkid":
        case "linkId": target.getConfiguration().setLinkId(property(camelContext, java.lang.String.class, value)); return true;
        case "locale": target.getConfiguration().setLocale(property(camelContext, java.util.Locale.class, value)); return true;
        case "mbeanenabled":
        case "mbeanEnabled": target.getConfiguration().setMbeanEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "message": target.getConfiguration().setMessage(property(camelContext, java.lang.String.class, value)); return true;
        case "messageid":
        case "messageId": target.getConfiguration().setMessageId(property(camelContext, java.lang.String.class, value)); return true;
        case "metric": target.getConfiguration().setMetric(property(camelContext, java.lang.String.class, value)); return true;
        case "milestoneid":
        case "milestoneId": target.getConfiguration().setMilestoneId(property(camelContext, java.lang.String.class, value)); return true;
        case "name": target.getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "noteid":
        case "noteId": target.getConfiguration().setNoteId(property(camelContext, java.lang.String.class, value)); return true;
        case "notificationid":
        case "notificationId": target.getConfiguration().setNotificationId(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthaccesstoken":
        case "oAuthAccessToken": target.getConfiguration().setOAuthAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthaccesstokenurl":
        case "oAuthAccessTokenURL": target.getConfiguration().setOAuthAccessTokenURL(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthappid":
        case "oAuthAppId": target.getConfiguration().setOAuthAppId(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthappsecret":
        case "oAuthAppSecret": target.getConfiguration().setOAuthAppSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthauthorizationurl":
        case "oAuthAuthorizationURL": target.getConfiguration().setOAuthAuthorizationURL(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthpermissions":
        case "oAuthPermissions": target.getConfiguration().setOAuthPermissions(property(camelContext, java.lang.String.class, value)); return true;
        case "objectid":
        case "objectId": target.getConfiguration().setObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "offerid":
        case "offerId": target.getConfiguration().setOfferId(property(camelContext, java.lang.String.class, value)); return true;
        case "optiondescription":
        case "optionDescription": target.getConfiguration().setOptionDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "pageid":
        case "pageId": target.getConfiguration().setPageId(property(camelContext, java.lang.String.class, value)); return true;
        case "permissionname":
        case "permissionName": target.getConfiguration().setPermissionName(property(camelContext, java.lang.String.class, value)); return true;
        case "permissions": target.getConfiguration().setPermissions(property(camelContext, java.lang.String.class, value)); return true;
        case "photoid":
        case "photoId": target.getConfiguration().setPhotoId(property(camelContext, java.lang.String.class, value)); return true;
        case "pictureid":
        case "pictureId": target.getConfiguration().setPictureId(property(camelContext, java.lang.Integer.class, value)); return true;
        case "pictureid2":
        case "pictureId2": target.getConfiguration().setPictureId2(property(camelContext, java.lang.Integer.class, value)); return true;
        case "picturesize":
        case "pictureSize": target.getConfiguration().setPictureSize(property(camelContext, facebook4j.PictureSize.class, value)); return true;
        case "placeid":
        case "placeId": target.getConfiguration().setPlaceId(property(camelContext, java.lang.String.class, value)); return true;
        case "postid":
        case "postId": target.getConfiguration().setPostId(property(camelContext, java.lang.String.class, value)); return true;
        case "postupdate":
        case "postUpdate": target.getConfiguration().setPostUpdate(property(camelContext, facebook4j.PostUpdate.class, value)); return true;
        case "prettydebugenabled":
        case "prettyDebugEnabled": target.getConfiguration().setPrettyDebugEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "queries": target.getConfiguration().setQueries(property(camelContext, java.util.Map.class, value)); return true;
        case "query": target.getConfiguration().setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "questionid":
        case "questionId": target.getConfiguration().setQuestionId(property(camelContext, java.lang.String.class, value)); return true;
        case "reading": target.getConfiguration().setReading(property(camelContext, facebook4j.Reading.class, value)); return true;
        case "readingoptions":
        case "readingOptions": target.getConfiguration().setReadingOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "restbaseurl":
        case "restBaseURL": target.getConfiguration().setRestBaseURL(property(camelContext, java.lang.String.class, value)); return true;
        case "scorevalue":
        case "scoreValue": target.getConfiguration().setScoreValue(property(camelContext, java.lang.Integer.class, value)); return true;
        case "size": target.getConfiguration().setSize(property(camelContext, facebook4j.PictureSize.class, value)); return true;
        case "source": target.getConfiguration().setSource(property(camelContext, facebook4j.Media.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tabid":
        case "tabId": target.getConfiguration().setTabId(property(camelContext, java.lang.String.class, value)); return true;
        case "tagupdate":
        case "tagUpdate": target.getConfiguration().setTagUpdate(property(camelContext, facebook4j.TagUpdate.class, value)); return true;
        case "testuser1":
        case "testUser1": target.getConfiguration().setTestUser1(property(camelContext, facebook4j.TestUser.class, value)); return true;
        case "testuser2":
        case "testUser2": target.getConfiguration().setTestUser2(property(camelContext, facebook4j.TestUser.class, value)); return true;
        case "testuserid":
        case "testUserId": target.getConfiguration().setTestUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "title": target.getConfiguration().setTitle(property(camelContext, java.lang.String.class, value)); return true;
        case "touserid":
        case "toUserId": target.getConfiguration().setToUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "touserids":
        case "toUserIds": target.getConfiguration().setToUserIds(property(camelContext, java.util.List.class, value)); return true;
        case "usessl":
        case "useSSL": target.getConfiguration().setUseSSL(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "userid":
        case "userId": target.getConfiguration().setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "userid1":
        case "userId1": target.getConfiguration().setUserId1(property(camelContext, java.lang.String.class, value)); return true;
        case "userid2":
        case "userId2": target.getConfiguration().setUserId2(property(camelContext, java.lang.String.class, value)); return true;
        case "userids":
        case "userIds": target.getConfiguration().setUserIds(property(camelContext, java.util.List.class, value)); return true;
        case "userlocale":
        case "userLocale": target.getConfiguration().setUserLocale(property(camelContext, java.lang.String.class, value)); return true;
        case "videobaseurl":
        case "videoBaseURL": target.getConfiguration().setVideoBaseURL(property(camelContext, java.lang.String.class, value)); return true;
        case "videoid":
        case "videoId": target.getConfiguration().setVideoId(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "achievementurl":
        case "achievementURL": return java.net.URL.class;
        case "albumid":
        case "albumId": return java.lang.String.class;
        case "albumupdate":
        case "albumUpdate": return facebook4j.AlbumUpdate.class;
        case "appid":
        case "appId": return java.lang.String.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "center": return facebook4j.GeoLocation.class;
        case "checkinid":
        case "checkinId": return java.lang.String.class;
        case "checkinupdate":
        case "checkinUpdate": return facebook4j.CheckinUpdate.class;
        case "clienturl":
        case "clientURL": return java.lang.String.class;
        case "clientversion":
        case "clientVersion": return java.lang.String.class;
        case "commentid":
        case "commentId": return java.lang.String.class;
        case "commentupdate":
        case "commentUpdate": return facebook4j.CommentUpdate.class;
        case "debugenabled":
        case "debugEnabled": return java.lang.Boolean.class;
        case "description": return java.lang.String.class;
        case "distance": return java.lang.Integer.class;
        case "domainid":
        case "domainId": return java.lang.String.class;
        case "domainname":
        case "domainName": return java.lang.String.class;
        case "domainnames":
        case "domainNames": return java.util.List.class;
        case "eventid":
        case "eventId": return java.lang.String.class;
        case "eventupdate":
        case "eventUpdate": return facebook4j.EventUpdate.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "friendid":
        case "friendId": return java.lang.String.class;
        case "frienduserid":
        case "friendUserId": return java.lang.String.class;
        case "friendlistid":
        case "friendlistId": return java.lang.String.class;
        case "friendlistname":
        case "friendlistName": return java.lang.String.class;
        case "groupid":
        case "groupId": return java.lang.String.class;
        case "gzipenabled":
        case "gzipEnabled": return java.lang.Boolean.class;
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": return java.lang.Integer.class;
        case "httpdefaultmaxperroute":
        case "httpDefaultMaxPerRoute": return java.lang.Integer.class;
        case "httpmaxtotalconnections":
        case "httpMaxTotalConnections": return java.lang.Integer.class;
        case "httpproxyhost":
        case "httpProxyHost": return java.lang.String.class;
        case "httpproxypassword":
        case "httpProxyPassword": return java.lang.String.class;
        case "httpproxyport":
        case "httpProxyPort": return java.lang.Integer.class;
        case "httpproxyuser":
        case "httpProxyUser": return java.lang.String.class;
        case "httpreadtimeout":
        case "httpReadTimeout": return java.lang.Integer.class;
        case "httpretrycount":
        case "httpRetryCount": return java.lang.Integer.class;
        case "httpretryintervalseconds":
        case "httpRetryIntervalSeconds": return java.lang.Integer.class;
        case "httpstreamingreadtimeout":
        case "httpStreamingReadTimeout": return java.lang.Integer.class;
        case "ids": return java.util.List.class;
        case "inbody":
        case "inBody": return java.lang.String.class;
        case "includeread":
        case "includeRead": return java.lang.Boolean.class;
        case "ishidden":
        case "isHidden": return java.lang.Boolean.class;
        case "jsonstoreenabled":
        case "jsonStoreEnabled": return java.lang.Boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "link": return java.net.URL.class;
        case "linkid":
        case "linkId": return java.lang.String.class;
        case "locale": return java.util.Locale.class;
        case "mbeanenabled":
        case "mbeanEnabled": return java.lang.Boolean.class;
        case "message": return java.lang.String.class;
        case "messageid":
        case "messageId": return java.lang.String.class;
        case "metric": return java.lang.String.class;
        case "milestoneid":
        case "milestoneId": return java.lang.String.class;
        case "name": return java.lang.String.class;
        case "noteid":
        case "noteId": return java.lang.String.class;
        case "notificationid":
        case "notificationId": return java.lang.String.class;
        case "oauthaccesstoken":
        case "oAuthAccessToken": return java.lang.String.class;
        case "oauthaccesstokenurl":
        case "oAuthAccessTokenURL": return java.lang.String.class;
        case "oauthappid":
        case "oAuthAppId": return java.lang.String.class;
        case "oauthappsecret":
        case "oAuthAppSecret": return java.lang.String.class;
        case "oauthauthorizationurl":
        case "oAuthAuthorizationURL": return java.lang.String.class;
        case "oauthpermissions":
        case "oAuthPermissions": return java.lang.String.class;
        case "objectid":
        case "objectId": return java.lang.String.class;
        case "offerid":
        case "offerId": return java.lang.String.class;
        case "optiondescription":
        case "optionDescription": return java.lang.String.class;
        case "pageid":
        case "pageId": return java.lang.String.class;
        case "permissionname":
        case "permissionName": return java.lang.String.class;
        case "permissions": return java.lang.String.class;
        case "photoid":
        case "photoId": return java.lang.String.class;
        case "pictureid":
        case "pictureId": return java.lang.Integer.class;
        case "pictureid2":
        case "pictureId2": return java.lang.Integer.class;
        case "picturesize":
        case "pictureSize": return facebook4j.PictureSize.class;
        case "placeid":
        case "placeId": return java.lang.String.class;
        case "postid":
        case "postId": return java.lang.String.class;
        case "postupdate":
        case "postUpdate": return facebook4j.PostUpdate.class;
        case "prettydebugenabled":
        case "prettyDebugEnabled": return java.lang.Boolean.class;
        case "queries": return java.util.Map.class;
        case "query": return java.lang.String.class;
        case "questionid":
        case "questionId": return java.lang.String.class;
        case "reading": return facebook4j.Reading.class;
        case "readingoptions":
        case "readingOptions": return java.util.Map.class;
        case "restbaseurl":
        case "restBaseURL": return java.lang.String.class;
        case "scorevalue":
        case "scoreValue": return java.lang.Integer.class;
        case "size": return facebook4j.PictureSize.class;
        case "source": return facebook4j.Media.class;
        case "subject": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "tabid":
        case "tabId": return java.lang.String.class;
        case "tagupdate":
        case "tagUpdate": return facebook4j.TagUpdate.class;
        case "testuser1":
        case "testUser1": return facebook4j.TestUser.class;
        case "testuser2":
        case "testUser2": return facebook4j.TestUser.class;
        case "testuserid":
        case "testUserId": return java.lang.String.class;
        case "title": return java.lang.String.class;
        case "touserid":
        case "toUserId": return java.lang.String.class;
        case "touserids":
        case "toUserIds": return java.util.List.class;
        case "usessl":
        case "useSSL": return java.lang.Boolean.class;
        case "userid":
        case "userId": return java.lang.String.class;
        case "userid1":
        case "userId1": return java.lang.String.class;
        case "userid2":
        case "userId2": return java.lang.String.class;
        case "userids":
        case "userIds": return java.util.List.class;
        case "userlocale":
        case "userLocale": return java.lang.String.class;
        case "videobaseurl":
        case "videoBaseURL": return java.lang.String.class;
        case "videoid":
        case "videoId": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        FacebookEndpoint target = (FacebookEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "achievementurl":
        case "achievementURL": return target.getConfiguration().getAchievementURL();
        case "albumid":
        case "albumId": return target.getConfiguration().getAlbumId();
        case "albumupdate":
        case "albumUpdate": return target.getConfiguration().getAlbumUpdate();
        case "appid":
        case "appId": return target.getConfiguration().getAppId();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "center": return target.getConfiguration().getCenter();
        case "checkinid":
        case "checkinId": return target.getConfiguration().getCheckinId();
        case "checkinupdate":
        case "checkinUpdate": return target.getConfiguration().getCheckinUpdate();
        case "clienturl":
        case "clientURL": return target.getConfiguration().getClientURL();
        case "clientversion":
        case "clientVersion": return target.getConfiguration().getClientVersion();
        case "commentid":
        case "commentId": return target.getConfiguration().getCommentId();
        case "commentupdate":
        case "commentUpdate": return target.getConfiguration().getCommentUpdate();
        case "debugenabled":
        case "debugEnabled": return target.getConfiguration().getDebugEnabled();
        case "description": return target.getConfiguration().getDescription();
        case "distance": return target.getConfiguration().getDistance();
        case "domainid":
        case "domainId": return target.getConfiguration().getDomainId();
        case "domainname":
        case "domainName": return target.getConfiguration().getDomainName();
        case "domainnames":
        case "domainNames": return target.getConfiguration().getDomainNames();
        case "eventid":
        case "eventId": return target.getConfiguration().getEventId();
        case "eventupdate":
        case "eventUpdate": return target.getConfiguration().getEventUpdate();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "friendid":
        case "friendId": return target.getConfiguration().getFriendId();
        case "frienduserid":
        case "friendUserId": return target.getConfiguration().getFriendUserId();
        case "friendlistid":
        case "friendlistId": return target.getConfiguration().getFriendlistId();
        case "friendlistname":
        case "friendlistName": return target.getConfiguration().getFriendlistName();
        case "groupid":
        case "groupId": return target.getConfiguration().getGroupId();
        case "gzipenabled":
        case "gzipEnabled": return target.getConfiguration().getGzipEnabled();
        case "httpconnectiontimeout":
        case "httpConnectionTimeout": return target.getConfiguration().getHttpConnectionTimeout();
        case "httpdefaultmaxperroute":
        case "httpDefaultMaxPerRoute": return target.getConfiguration().getHttpDefaultMaxPerRoute();
        case "httpmaxtotalconnections":
        case "httpMaxTotalConnections": return target.getConfiguration().getHttpMaxTotalConnections();
        case "httpproxyhost":
        case "httpProxyHost": return target.getConfiguration().getHttpProxyHost();
        case "httpproxypassword":
        case "httpProxyPassword": return target.getConfiguration().getHttpProxyPassword();
        case "httpproxyport":
        case "httpProxyPort": return target.getConfiguration().getHttpProxyPort();
        case "httpproxyuser":
        case "httpProxyUser": return target.getConfiguration().getHttpProxyUser();
        case "httpreadtimeout":
        case "httpReadTimeout": return target.getConfiguration().getHttpReadTimeout();
        case "httpretrycount":
        case "httpRetryCount": return target.getConfiguration().getHttpRetryCount();
        case "httpretryintervalseconds":
        case "httpRetryIntervalSeconds": return target.getConfiguration().getHttpRetryIntervalSeconds();
        case "httpstreamingreadtimeout":
        case "httpStreamingReadTimeout": return target.getConfiguration().getHttpStreamingReadTimeout();
        case "ids": return target.getConfiguration().getIds();
        case "inbody":
        case "inBody": return target.getInBody();
        case "includeread":
        case "includeRead": return target.getConfiguration().getIncludeRead();
        case "ishidden":
        case "isHidden": return target.getConfiguration().getIsHidden();
        case "jsonstoreenabled":
        case "jsonStoreEnabled": return target.getConfiguration().getJsonStoreEnabled();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "link": return target.getConfiguration().getLink();
        case "linkid":
        case "linkId": return target.getConfiguration().getLinkId();
        case "locale": return target.getConfiguration().getLocale();
        case "mbeanenabled":
        case "mbeanEnabled": return target.getConfiguration().getMbeanEnabled();
        case "message": return target.getConfiguration().getMessage();
        case "messageid":
        case "messageId": return target.getConfiguration().getMessageId();
        case "metric": return target.getConfiguration().getMetric();
        case "milestoneid":
        case "milestoneId": return target.getConfiguration().getMilestoneId();
        case "name": return target.getConfiguration().getName();
        case "noteid":
        case "noteId": return target.getConfiguration().getNoteId();
        case "notificationid":
        case "notificationId": return target.getConfiguration().getNotificationId();
        case "oauthaccesstoken":
        case "oAuthAccessToken": return target.getConfiguration().getOAuthAccessToken();
        case "oauthaccesstokenurl":
        case "oAuthAccessTokenURL": return target.getConfiguration().getOAuthAccessTokenURL();
        case "oauthappid":
        case "oAuthAppId": return target.getConfiguration().getOAuthAppId();
        case "oauthappsecret":
        case "oAuthAppSecret": return target.getConfiguration().getOAuthAppSecret();
        case "oauthauthorizationurl":
        case "oAuthAuthorizationURL": return target.getConfiguration().getOAuthAuthorizationURL();
        case "oauthpermissions":
        case "oAuthPermissions": return target.getConfiguration().getOAuthPermissions();
        case "objectid":
        case "objectId": return target.getConfiguration().getObjectId();
        case "offerid":
        case "offerId": return target.getConfiguration().getOfferId();
        case "optiondescription":
        case "optionDescription": return target.getConfiguration().getOptionDescription();
        case "pageid":
        case "pageId": return target.getConfiguration().getPageId();
        case "permissionname":
        case "permissionName": return target.getConfiguration().getPermissionName();
        case "permissions": return target.getConfiguration().getPermissions();
        case "photoid":
        case "photoId": return target.getConfiguration().getPhotoId();
        case "pictureid":
        case "pictureId": return target.getConfiguration().getPictureId();
        case "pictureid2":
        case "pictureId2": return target.getConfiguration().getPictureId2();
        case "picturesize":
        case "pictureSize": return target.getConfiguration().getPictureSize();
        case "placeid":
        case "placeId": return target.getConfiguration().getPlaceId();
        case "postid":
        case "postId": return target.getConfiguration().getPostId();
        case "postupdate":
        case "postUpdate": return target.getConfiguration().getPostUpdate();
        case "prettydebugenabled":
        case "prettyDebugEnabled": return target.getConfiguration().getPrettyDebugEnabled();
        case "queries": return target.getConfiguration().getQueries();
        case "query": return target.getConfiguration().getQuery();
        case "questionid":
        case "questionId": return target.getConfiguration().getQuestionId();
        case "reading": return target.getConfiguration().getReading();
        case "readingoptions":
        case "readingOptions": return target.getConfiguration().getReadingOptions();
        case "restbaseurl":
        case "restBaseURL": return target.getConfiguration().getRestBaseURL();
        case "scorevalue":
        case "scoreValue": return target.getConfiguration().getScoreValue();
        case "size": return target.getConfiguration().getSize();
        case "source": return target.getConfiguration().getSource();
        case "subject": return target.getConfiguration().getSubject();
        case "synchronous": return target.isSynchronous();
        case "tabid":
        case "tabId": return target.getConfiguration().getTabId();
        case "tagupdate":
        case "tagUpdate": return target.getConfiguration().getTagUpdate();
        case "testuser1":
        case "testUser1": return target.getConfiguration().getTestUser1();
        case "testuser2":
        case "testUser2": return target.getConfiguration().getTestUser2();
        case "testuserid":
        case "testUserId": return target.getConfiguration().getTestUserId();
        case "title": return target.getConfiguration().getTitle();
        case "touserid":
        case "toUserId": return target.getConfiguration().getToUserId();
        case "touserids":
        case "toUserIds": return target.getConfiguration().getToUserIds();
        case "usessl":
        case "useSSL": return target.getConfiguration().getUseSSL();
        case "userid":
        case "userId": return target.getConfiguration().getUserId();
        case "userid1":
        case "userId1": return target.getConfiguration().getUserId1();
        case "userid2":
        case "userId2": return target.getConfiguration().getUserId2();
        case "userids":
        case "userIds": return target.getConfiguration().getUserIds();
        case "userlocale":
        case "userLocale": return target.getConfiguration().getUserLocale();
        case "videobaseurl":
        case "videoBaseURL": return target.getConfiguration().getVideoBaseURL();
        case "videoid":
        case "videoId": return target.getConfiguration().getVideoId();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "domainnames":
        case "domainNames": return java.lang.String.class;
        case "ids": return java.lang.String.class;
        case "queries": return java.lang.String.class;
        case "readingoptions":
        case "readingOptions": return java.lang.Object.class;
        case "touserids":
        case "toUserIds": return java.lang.String.class;
        case "userids":
        case "userIds": return java.lang.String.class;
        default: return null;
        }
    }
}

