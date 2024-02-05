/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dhis2;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.dhis2.Dhis2ResourceTablesEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Dhis2ResourceTablesEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.dhis2.internal.Dhis2ApiName.class);
        map.put("Async", java.lang.Boolean.class);
        map.put("BaseApiUrl", java.lang.String.class);
        map.put("Client", org.hisp.dhis.integration.sdk.api.Dhis2Client.class);
        map.put("Interval", java.lang.Integer.class);
        map.put("LastYears", java.lang.Integer.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Password", java.lang.String.class);
        map.put("Pat", java.lang.String.class);
        map.put("SkipAggregate", java.lang.Boolean.class);
        map.put("SkipEvents", java.lang.Boolean.class);
        map.put("Username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2ResourceTablesEndpointConfiguration target = (org.apache.camel.component.dhis2.Dhis2ResourceTablesEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.dhis2.internal.Dhis2ApiName.class, value)); return true;
        case "async":
        case "Async": target.setAsync(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "baseapiurl":
        case "BaseApiUrl": target.setBaseApiUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "client":
        case "Client": target.setClient(property(camelContext, org.hisp.dhis.integration.sdk.api.Dhis2Client.class, value)); return true;
        case "interval":
        case "Interval": target.setInterval(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lastyears":
        case "LastYears": target.setLastYears(property(camelContext, java.lang.Integer.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "password":
        case "Password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "pat":
        case "Pat": target.setPat(property(camelContext, java.lang.String.class, value)); return true;
        case "skipaggregate":
        case "SkipAggregate": target.setSkipAggregate(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "skipevents":
        case "SkipEvents": target.setSkipEvents(property(camelContext, java.lang.Boolean.class, value)); return true;
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
        case "async":
        case "Async": return java.lang.Boolean.class;
        case "baseapiurl":
        case "BaseApiUrl": return java.lang.String.class;
        case "client":
        case "Client": return org.hisp.dhis.integration.sdk.api.Dhis2Client.class;
        case "interval":
        case "Interval": return java.lang.Integer.class;
        case "lastyears":
        case "LastYears": return java.lang.Integer.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "password":
        case "Password": return java.lang.String.class;
        case "pat":
        case "Pat": return java.lang.String.class;
        case "skipaggregate":
        case "SkipAggregate": return java.lang.Boolean.class;
        case "skipevents":
        case "SkipEvents": return java.lang.Boolean.class;
        case "username":
        case "Username": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.dhis2.Dhis2ResourceTablesEndpointConfiguration target = (org.apache.camel.component.dhis2.Dhis2ResourceTablesEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "async":
        case "Async": return target.getAsync();
        case "baseapiurl":
        case "BaseApiUrl": return target.getBaseApiUrl();
        case "client":
        case "Client": return target.getClient();
        case "interval":
        case "Interval": return target.getInterval();
        case "lastyears":
        case "LastYears": return target.getLastYears();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "password":
        case "Password": return target.getPassword();
        case "pat":
        case "Pat": return target.getPat();
        case "skipaggregate":
        case "SkipAggregate": return target.getSkipAggregate();
        case "skipevents":
        case "SkipEvents": return target.getSkipEvents();
        case "username":
        case "Username": return target.getUsername();
        default: return null;
        }
    }
}

