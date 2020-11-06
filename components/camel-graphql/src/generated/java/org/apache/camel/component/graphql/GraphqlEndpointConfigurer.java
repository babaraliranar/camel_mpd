/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.graphql;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GraphqlEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("httpUri", java.net.URI.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operationName", java.lang.String.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("query", java.lang.String.class);
        map.put("queryFile", java.lang.String.class);
        map.put("variables", org.apache.camel.util.json.JsonObject.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        map.put("accessToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(GraphqlEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        GraphqlEndpoint target = (GraphqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operationname":
        case "operationName": target.setOperationName(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "query": target.setQuery(property(camelContext, java.lang.String.class, value)); return true;
        case "queryfile":
        case "queryFile": target.setQueryFile(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "variables": target.setVariables(property(camelContext, org.apache.camel.util.json.JsonObject.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "operationname":
        case "operationName": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "query": return java.lang.String.class;
        case "queryfile":
        case "queryFile": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "username": return java.lang.String.class;
        case "variables": return org.apache.camel.util.json.JsonObject.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        GraphqlEndpoint target = (GraphqlEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "accessToken": return target.getAccessToken();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "operationname":
        case "operationName": return target.getOperationName();
        case "password": return target.getPassword();
        case "proxyhost":
        case "proxyHost": return target.getProxyHost();
        case "query": return target.getQuery();
        case "queryfile":
        case "queryFile": return target.getQueryFile();
        case "synchronous": return target.isSynchronous();
        case "username": return target.getUsername();
        case "variables": return target.getVariables();
        default: return null;
        }
    }
}

