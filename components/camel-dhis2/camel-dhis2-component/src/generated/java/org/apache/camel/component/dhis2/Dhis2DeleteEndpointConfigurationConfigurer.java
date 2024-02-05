/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dhis2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.dhis2.Dhis2DeleteEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Dhis2DeleteEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.dhis2.internal.Dhis2ApiName.class);
        map.put("BaseApiUrl", java.lang.String.class);
        map.put("Client", org.hisp.dhis.integration.sdk.api.Dhis2Client.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("Path", java.lang.String.class);
        map.put("PersonalAccessToken", java.lang.String.class);
        map.put("QueryParams", java.util.Map.class);
        map.put("Resource", java.lang.Object.class);
        map.put("Username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2DeleteEndpointConfiguration target = (org.apache.camel.component.dhis2.Dhis2DeleteEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.dhis2.internal.Dhis2ApiName.class, value)); return true;
        case "baseapiurl":
        case "BaseApiUrl": target.setBaseApiUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "client":
        case "Client": target.setClient(property(camelContext, org.hisp.dhis.integration.sdk.api.Dhis2Client.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password":
        case "Password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "path":
        case "Path": target.setPath(property(camelContext, java.lang.String.class, value)); return true;
        case "personalaccesstoken":
        case "PersonalAccessToken": target.setPersonalAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "queryparams":
        case "QueryParams": target.setQueryParams(property(camelContext, java.util.Map.class, value)); return true;
        case "resource":
        case "Resource": target.setResource(property(camelContext, java.lang.Object.class, value)); return true;
        case "username":
        case "Username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
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
        case "apiname":
        case "ApiName": return org.apache.camel.component.dhis2.internal.Dhis2ApiName.class;
        case "baseapiurl":
        case "BaseApiUrl": return java.lang.String.class;
        case "client":
        case "Client": return org.hisp.dhis.integration.sdk.api.Dhis2Client.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "password":
        case "Password": return java.lang.String.class;
        case "path":
        case "Path": return java.lang.String.class;
        case "personalaccesstoken":
        case "PersonalAccessToken": return java.lang.String.class;
        case "queryparams":
        case "QueryParams": return java.util.Map.class;
        case "resource":
        case "Resource": return java.lang.Object.class;
        case "username":
        case "Username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2DeleteEndpointConfiguration target = (org.apache.camel.component.dhis2.Dhis2DeleteEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "baseapiurl":
        case "BaseApiUrl": return target.getBaseApiUrl();
        case "client":
        case "Client": return target.getClient();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "password":
        case "Password": return target.getPassword();
        case "path":
        case "Path": return target.getPath();
        case "personalaccesstoken":
        case "PersonalAccessToken": return target.getPersonalAccessToken();
        case "queryparams":
        case "QueryParams": return target.getQueryParams();
        case "resource":
        case "Resource": return target.getResource();
        case "username":
        case "Username": return target.getUsername();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "queryparams":
        case "QueryParams": return java.lang.Object.class;
        default: return null;
        }
    }
}

