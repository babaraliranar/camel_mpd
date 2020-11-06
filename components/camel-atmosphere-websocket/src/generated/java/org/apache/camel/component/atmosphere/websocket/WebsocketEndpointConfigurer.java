/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.atmosphere.websocket;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.servlet.ServletEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WebsocketEndpointConfigurer extends ServletEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("servicePath", java.lang.String.class);
        map.put("chunked", boolean.class);
        map.put("disableStreamCache", boolean.class);
        map.put("headerFilterStrategy", org.apache.camel.spi.HeaderFilterStrategy.class);
        map.put("sendToAll", boolean.class);
        map.put("transferException", boolean.class);
        map.put("useStreaming", boolean.class);
        map.put("httpBinding", org.apache.camel.http.common.HttpBinding.class);
        map.put("async", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("httpMethodRestrict", java.lang.String.class);
        map.put("matchOnUriPrefix", boolean.class);
        map.put("muteException", boolean.class);
        map.put("responseBufferSize", java.lang.Integer.class);
        map.put("servletName", java.lang.String.class);
        map.put("attachmentMultipartBinding", boolean.class);
        map.put("eagerCheckContentAvailable", boolean.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("fileNameExtWhitelist", java.lang.String.class);
        map.put("optionsEnabled", boolean.class);
        map.put("traceEnabled", boolean.class);
        map.put("bridgeEndpoint", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("mapHttpMessageBody", boolean.class);
        map.put("mapHttpMessageFormUrlEncodedBody", boolean.class);
        map.put("mapHttpMessageHeaders", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(WebsocketEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeendpoint":
        case "bridgeEndpoint": target.setBridgeEndpoint(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "sendtoall":
        case "sendToAll": target.setSendToAll(property(camelContext, boolean.class, value)); return true;
        case "usestreaming":
        case "useStreaming": target.setUseStreaming(property(camelContext, boolean.class, value)); return true;
        default: return super.configure(camelContext, obj, name, value, ignoreCase);
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
        case "bridgeendpoint":
        case "bridgeEndpoint": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "sendtoall":
        case "sendToAll": return boolean.class;
        case "usestreaming":
        case "useStreaming": return boolean.class;
        default: return super.getOptionType(name, ignoreCase);
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        WebsocketEndpoint target = (WebsocketEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeendpoint":
        case "bridgeEndpoint": return target.isBridgeEndpoint();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "sendtoall":
        case "sendToAll": return target.isSendToAll();
        case "usestreaming":
        case "useStreaming": return target.isUseStreaming();
        default: return super.getOptionValue(obj, name, ignoreCase);
        }
    }
}

