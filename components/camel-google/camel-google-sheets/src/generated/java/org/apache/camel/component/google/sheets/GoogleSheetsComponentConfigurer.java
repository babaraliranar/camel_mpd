/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.google.sheets;

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
public class GoogleSheetsComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("applicationName", java.lang.String.class);
        map.put("clientId", java.lang.String.class);
        map.put("configuration", org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class);
        map.put("delegate", java.lang.String.class);
        map.put("scopes", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("splitResult", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("autowiredEnabled", boolean.class);
        map.put("clientFactory", org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class);
        map.put("accessToken", java.lang.String.class);
        map.put("clientSecret", java.lang.String.class);
        map.put("refreshToken", java.lang.String.class);
        map.put("serviceAccountKey", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.google.sheets.GoogleSheetsConfiguration getOrCreateConfiguration(GoogleSheetsComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.google.sheets.GoogleSheetsConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GoogleSheetsComponent target = (GoogleSheetsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": getOrCreateConfiguration(target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "applicationname":
        case "applicationName": getOrCreateConfiguration(target).setApplicationName(property(camelContext, java.lang.String.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientfactory":
        case "clientFactory": target.setClientFactory(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "clientSecret": getOrCreateConfiguration(target).setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class, value)); return true;
        case "delegate": getOrCreateConfiguration(target).setDelegate(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "refreshtoken":
        case "refreshToken": getOrCreateConfiguration(target).setRefreshToken(property(camelContext, java.lang.String.class, value)); return true;
        case "scopes": getOrCreateConfiguration(target).setScopes(property(camelContext, java.lang.String.class, value)); return true;
        case "serviceaccountkey":
        case "serviceAccountKey": getOrCreateConfiguration(target).setServiceAccountKey(property(camelContext, java.lang.String.class, value)); return true;
        case "splitresult":
        case "splitResult": getOrCreateConfiguration(target).setSplitResult(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "applicationname":
        case "applicationName": return java.lang.String.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientfactory":
        case "clientFactory": return org.apache.camel.component.google.sheets.GoogleSheetsClientFactory.class;
        case "clientid":
        case "clientId": return java.lang.String.class;
        case "clientsecret":
        case "clientSecret": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.google.sheets.GoogleSheetsConfiguration.class;
        case "delegate": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "refreshtoken":
        case "refreshToken": return java.lang.String.class;
        case "scopes": return java.lang.String.class;
        case "serviceaccountkey":
        case "serviceAccountKey": return java.lang.String.class;
        case "splitresult":
        case "splitResult": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GoogleSheetsComponent target = (GoogleSheetsComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return getOrCreateConfiguration(target).getAccessToken();
        case "applicationname":
        case "applicationName": return getOrCreateConfiguration(target).getApplicationName();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientfactory":
        case "clientFactory": return target.getClientFactory();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientsecret":
        case "clientSecret": return getOrCreateConfiguration(target).getClientSecret();
        case "configuration": return target.getConfiguration();
        case "delegate": return getOrCreateConfiguration(target).getDelegate();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "refreshtoken":
        case "refreshToken": return getOrCreateConfiguration(target).getRefreshToken();
        case "scopes": return getOrCreateConfiguration(target).getScopes();
        case "serviceaccountkey":
        case "serviceAccountKey": return getOrCreateConfiguration(target).getServiceAccountKey();
        case "splitresult":
        case "splitResult": return getOrCreateConfiguration(target).isSplitResult();
        default: return null;
        }
    }
}

