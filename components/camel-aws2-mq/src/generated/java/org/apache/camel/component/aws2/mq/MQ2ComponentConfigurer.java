/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.mq;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class MQ2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "configuration": ((MQ2Component) target).setConfiguration(property(camelContext, org.apache.camel.component.aws2.mq.MQ2Configuration.class, value)); return true;
        case "accessKey": ((MQ2Component) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((MQ2Component) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((MQ2Component) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((MQ2Component) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((MQ2Component) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "configuration": ((MQ2Component) target).setConfiguration(property(camelContext, org.apache.camel.component.aws2.mq.MQ2Configuration.class, value)); return true;
        case "accesskey": ((MQ2Component) target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((MQ2Component) target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "region": ((MQ2Component) target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((MQ2Component) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((MQ2Component) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

