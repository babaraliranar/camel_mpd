/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kamelet;

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
public class KameletEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KameletEndpoint target = (KameletEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "block": target.setBlock(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "failifnoconsumers":
        case "failIfNoConsumers": target.setFailIfNoConsumers(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "location": target.setLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, long.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "block": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "failifnoconsumers":
        case "failIfNoConsumers": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "location": return java.lang.String.class;
        case "timeout": return long.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KameletEndpoint target = (KameletEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "block": return target.isBlock();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "failifnoconsumers":
        case "failIfNoConsumers": return target.isFailIfNoConsumers();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "location": return target.getLocation();
        case "timeout": return target.getTimeout();
        default: return null;
        }
    }
}

