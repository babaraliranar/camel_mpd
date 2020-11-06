/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.calendar;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.google.calendar.CalendarSettingsEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CalendarSettingsEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.google.calendar.internal.GoogleCalendarApiName.class);
        map.put("ApplicationName", java.lang.String.class);
        map.put("ClientId", java.lang.String.class);
        map.put("ClientSecret", java.lang.String.class);
        map.put("ContentChannel", com.google.api.services.calendar.model.Channel.class);
        map.put("EmailAddress", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("P12FileName", java.lang.String.class);
        map.put("RefreshToken", java.lang.String.class);
        map.put("Scopes", java.lang.String.class);
        map.put("Setting", java.lang.String.class);
        map.put("User", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.google.calendar.CalendarSettingsEndpointConfiguration target = (org.apache.camel.component.google.calendar.CalendarSettingsEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.google.calendar.internal.GoogleCalendarApiName.class, value)); return true;
        case "applicationname":
        case "ApplicationName": target.setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "contentchannel":
        case "ContentChannel": target.setContentChannel(property(camelContext, com.google.api.services.calendar.model.Channel.class, value)); return true;
        case "emailaddress":
        case "EmailAddress": target.setEmailAddress(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "p12filename":
        case "P12FileName": target.setP12FileName(property(camelContext, java.lang.String.class, value)); return true;
        case "refreshtoken":
        case "RefreshToken": target.setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes":
        case "Scopes": target.setScopes(property(camelContext, java.lang.String.class, value)); return true;
        case "setting":
        case "Setting": target.setSetting(property(camelContext, java.lang.String.class, value)); return true;
        case "user":
        case "User": target.setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": return java.lang.String.class;
        case "apiname":
        case "ApiName": return org.apache.camel.component.google.calendar.internal.GoogleCalendarApiName.class;
        case "applicationname":
        case "ApplicationName": return java.lang.String.class;
        case "clientid":
        case "ClientId": return java.lang.String.class;
        case "clientsecret":
        case "ClientSecret": return java.lang.String.class;
        case "contentchannel":
        case "ContentChannel": return com.google.api.services.calendar.model.Channel.class;
        case "emailaddress":
        case "EmailAddress": return java.lang.String.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "p12filename":
        case "P12FileName": return java.lang.String.class;
        case "refreshtoken":
        case "RefreshToken": return java.lang.String.class;
        case "scopes":
        case "Scopes": return java.lang.String.class;
        case "setting":
        case "Setting": return java.lang.String.class;
        case "user":
        case "User": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.google.calendar.CalendarSettingsEndpointConfiguration target = (org.apache.camel.component.google.calendar.CalendarSettingsEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": return target.getAccessToken();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "applicationname":
        case "ApplicationName": return target.getApplicationName();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "contentchannel":
        case "ContentChannel": return target.getContentChannel();
        case "emailaddress":
        case "EmailAddress": return target.getEmailAddress();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "p12filename":
        case "P12FileName": return target.getP12FileName();
        case "refreshtoken":
        case "RefreshToken": return target.getRefreshToken();
        case "scopes":
        case "Scopes": return target.getScopes();
        case "setting":
        case "Setting": return target.getSetting();
        case "user":
        case "User": return target.getUser();
        default: return null;
        }
    }
}

