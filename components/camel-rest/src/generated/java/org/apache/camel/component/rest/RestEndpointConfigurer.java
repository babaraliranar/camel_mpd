/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rest;

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
public class RestEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("method", java.lang.String.class);
        map.put("path", java.lang.String.class);
        map.put("uriTemplate", java.lang.String.class);
        map.put("consumes", java.lang.String.class);
        map.put("inType", java.lang.String.class);
        map.put("outType", java.lang.String.class);
        map.put("produces", java.lang.String.class);
        map.put("routeId", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("consumerComponentName", java.lang.String.class);
        map.put("description", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("apiDoc", java.lang.String.class);
        map.put("bindingMode", org.apache.camel.spi.RestConfiguration.RestBindingMode.class);
        map.put("host", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("producerComponentName", java.lang.String.class);
        map.put("queryParameters", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(RestEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RestEndpoint target = (RestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": target.setApiDoc(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bindingmode":
        case "bindingMode": target.setBindingMode(property(camelContext, org.apache.camel.spi.RestConfiguration.RestBindingMode.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercomponentname":
        case "consumerComponentName": target.setConsumerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "consumes": target.setConsumes(property(camelContext, java.lang.String.class, value)); return true;
        case "description": target.setDescription(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "host": target.setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "intype":
        case "inType": target.setInType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "outtype":
        case "outType": target.setOutType(property(camelContext, java.lang.String.class, value)); return true;
        case "producercomponentname":
        case "producerComponentName": target.setProducerComponentName(property(camelContext, java.lang.String.class, value)); return true;
        case "produces": target.setProduces(property(camelContext, java.lang.String.class, value)); return true;
        case "queryparameters":
        case "queryParameters": target.setQueryParameters(property(camelContext, java.lang.String.class, value)); return true;
        case "routeid":
        case "routeId": target.setRouteId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
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
        case "apidoc":
        case "apiDoc": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bindingmode":
        case "bindingMode": return org.apache.camel.spi.RestConfiguration.RestBindingMode.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "consumercomponentname":
        case "consumerComponentName": return java.lang.String.class;
        case "consumes": return java.lang.String.class;
        case "description": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "host": return java.lang.String.class;
        case "intype":
        case "inType": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "outtype":
        case "outType": return java.lang.String.class;
        case "producercomponentname":
        case "producerComponentName": return java.lang.String.class;
        case "produces": return java.lang.String.class;
        case "queryparameters":
        case "queryParameters": return java.lang.String.class;
        case "routeid":
        case "routeId": return java.lang.String.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RestEndpoint target = (RestEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apidoc":
        case "apiDoc": return target.getApiDoc();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bindingmode":
        case "bindingMode": return target.getBindingMode();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "consumercomponentname":
        case "consumerComponentName": return target.getConsumerComponentName();
        case "consumes": return target.getConsumes();
        case "description": return target.getDescription();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "host": return target.getHost();
        case "intype":
        case "inType": return target.getInType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "outtype":
        case "outType": return target.getOutType();
        case "producercomponentname":
        case "producerComponentName": return target.getProducerComponentName();
        case "produces": return target.getProduces();
        case "queryparameters":
        case "queryParameters": return target.getQueryParameters();
        case "routeid":
        case "routeId": return target.getRouteId();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

