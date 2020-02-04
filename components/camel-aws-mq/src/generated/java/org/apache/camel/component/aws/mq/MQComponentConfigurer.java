/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.mq;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MQComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((MQComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.mq.MQConfiguration.class, value)); return true;
        case "accessKey": ((MQComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((MQComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((MQComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((MQComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((MQComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((MQComponent) target).setConfiguration(property(camelContext, org.apache.camel.component.aws.mq.MQConfiguration.class, value)); return true;
        case "accesskey": ((MQComponent) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((MQComponent) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((MQComponent) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((MQComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((MQComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

