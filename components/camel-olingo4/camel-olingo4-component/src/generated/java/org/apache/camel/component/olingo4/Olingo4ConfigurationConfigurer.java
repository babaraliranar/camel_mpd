/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.olingo4;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.olingo4.Olingo4Configuration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Olingo4ConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.olingo4.internal.Olingo4ApiName.class);
        map.put("ConnectTimeout", int.class);
        map.put("ContentType", java.lang.String.class);
        map.put("FilterAlreadySeen", boolean.class);
        map.put("HttpAsyncClientBuilder", org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class);
        map.put("HttpClientBuilder", org.apache.http.impl.client.HttpClientBuilder.class);
        map.put("HttpHeaders", java.util.Map.class);
        map.put("MethodName", java.lang.String.class);
        map.put("Proxy", org.apache.http.HttpHost.class);
        map.put("ServiceUri", java.lang.String.class);
        map.put("SocketTimeout", int.class);
        map.put("SplitResult", boolean.class);
        map.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4Configuration target = (org.apache.camel.component.olingo4.Olingo4Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.olingo4.internal.Olingo4ApiName.class, value)); return true;
        case "connecttimeout":
        case "ConnectTimeout": target.setConnectTimeout(property(camelContext, int.class, value)); return true;
        case "contenttype":
        case "ContentType": target.setContentType(property(camelContext, java.lang.String.class, value)); return true;
        case "filteralreadyseen":
        case "FilterAlreadySeen": target.setFilterAlreadySeen(property(camelContext, boolean.class, value)); return true;
        case "httpasyncclientbuilder":
        case "HttpAsyncClientBuilder": target.setHttpAsyncClientBuilder(property(camelContext, org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class, value)); return true;
        case "httpclientbuilder":
        case "HttpClientBuilder": target.setHttpClientBuilder(property(camelContext, org.apache.http.impl.client.HttpClientBuilder.class, value)); return true;
        case "httpheaders":
        case "HttpHeaders": target.setHttpHeaders(property(camelContext, java.util.Map.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxy":
        case "Proxy": target.setProxy(property(camelContext, org.apache.http.HttpHost.class, value)); return true;
        case "serviceuri":
        case "ServiceUri": target.setServiceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "sockettimeout":
        case "SocketTimeout": target.setSocketTimeout(property(camelContext, int.class, value)); return true;
        case "splitresult":
        case "SplitResult": target.setSplitResult(property(camelContext, boolean.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
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
        case "ApiName": return org.apache.camel.component.olingo4.internal.Olingo4ApiName.class;
        case "connecttimeout":
        case "ConnectTimeout": return int.class;
        case "contenttype":
        case "ContentType": return java.lang.String.class;
        case "filteralreadyseen":
        case "FilterAlreadySeen": return boolean.class;
        case "httpasyncclientbuilder":
        case "HttpAsyncClientBuilder": return org.apache.http.impl.nio.client.HttpAsyncClientBuilder.class;
        case "httpclientbuilder":
        case "HttpClientBuilder": return org.apache.http.impl.client.HttpClientBuilder.class;
        case "httpheaders":
        case "HttpHeaders": return java.util.Map.class;
        case "methodname":
        case "MethodName": return java.lang.String.class;
        case "proxy":
        case "Proxy": return org.apache.http.HttpHost.class;
        case "serviceuri":
        case "ServiceUri": return java.lang.String.class;
        case "sockettimeout":
        case "SocketTimeout": return int.class;
        case "splitresult":
        case "SplitResult": return boolean.class;
        case "sslcontextparameters":
        case "SslContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.olingo4.Olingo4Configuration target = (org.apache.camel.component.olingo4.Olingo4Configuration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "connecttimeout":
        case "ConnectTimeout": return target.getConnectTimeout();
        case "contenttype":
        case "ContentType": return target.getContentType();
        case "filteralreadyseen":
        case "FilterAlreadySeen": return target.isFilterAlreadySeen();
        case "httpasyncclientbuilder":
        case "HttpAsyncClientBuilder": return target.getHttpAsyncClientBuilder();
        case "httpclientbuilder":
        case "HttpClientBuilder": return target.getHttpClientBuilder();
        case "httpheaders":
        case "HttpHeaders": return target.getHttpHeaders();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "proxy":
        case "Proxy": return target.getProxy();
        case "serviceuri":
        case "ServiceUri": return target.getServiceUri();
        case "sockettimeout":
        case "SocketTimeout": return target.getSocketTimeout();
        case "splitresult":
        case "SplitResult": return target.isSplitResult();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "httpheaders":
        case "HttpHeaders": return java.lang.String.class;
        default: return null;
        }
    }
}

