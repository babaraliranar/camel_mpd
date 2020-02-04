/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.guava.eventbus;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class GuavaEventBusEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "eventClass": ((GuavaEventBusEndpoint) target).setEventClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "listenerInterface": ((GuavaEventBusEndpoint) target).setListenerInterface(property(camelContext, java.lang.Class.class, value)); return true;
        case "bridgeErrorHandler": ((GuavaEventBusEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((GuavaEventBusEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((GuavaEventBusEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazyStartProducer": ((GuavaEventBusEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((GuavaEventBusEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GuavaEventBusEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "eventclass": ((GuavaEventBusEndpoint) target).setEventClass(property(camelContext, java.lang.Class.class, value)); return true;
        case "listenerinterface": ((GuavaEventBusEndpoint) target).setListenerInterface(property(camelContext, java.lang.Class.class, value)); return true;
        case "bridgeerrorhandler": ((GuavaEventBusEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((GuavaEventBusEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((GuavaEventBusEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer": ((GuavaEventBusEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((GuavaEventBusEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((GuavaEventBusEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

