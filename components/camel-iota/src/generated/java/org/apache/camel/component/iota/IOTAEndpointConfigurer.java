/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.iota;

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
public class IOTAEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        IOTAEndpoint target = (IOTAEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "depth": target.setDepth(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "minweightmagnitude":
        case "minWeightMagnitude": target.setMinWeightMagnitude(property(camelContext, java.lang.Integer.class, value)); return true;
        case "operation": target.setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "securitylevel":
        case "securityLevel": target.setSecurityLevel(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tag": target.setTag(property(camelContext, java.lang.String.class, value)); return true;
        case "url": target.setUrl(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "depth": return java.lang.Integer.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "minweightmagnitude":
        case "minWeightMagnitude": return java.lang.Integer.class;
        case "operation": return java.lang.String.class;
        case "securitylevel":
        case "securityLevel": return java.lang.Integer.class;
        case "synchronous": return boolean.class;
        case "tag": return java.lang.String.class;
        case "url": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        IOTAEndpoint target = (IOTAEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "depth": return target.getDepth();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "minweightmagnitude":
        case "minWeightMagnitude": return target.getMinWeightMagnitude();
        case "operation": return target.getOperation();
        case "securitylevel":
        case "securityLevel": return target.getSecurityLevel();
        case "synchronous": return target.isSynchronous();
        case "tag": return target.getTag();
        case "url": return target.getUrl();
        default: return null;
        }
    }
}

