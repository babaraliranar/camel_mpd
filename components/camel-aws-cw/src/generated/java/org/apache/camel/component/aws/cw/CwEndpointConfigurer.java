/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.cw;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CwEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "amazonCwClient": ((CwEndpoint) target).getConfiguration().setAmazonCwClient(property(camelContext, com.amazonaws.services.cloudwatch.AmazonCloudWatch.class, value)); return true;
        case "lazyStartProducer": ((CwEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "name": ((CwEndpoint) target).getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyHost": ((CwEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((CwEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyProtocol": ((CwEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((CwEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "timestamp": ((CwEndpoint) target).getConfiguration().setTimestamp(property(camelContext, java.util.Date.class, value)); return true;
        case "unit": ((CwEndpoint) target).getConfiguration().setUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "value": ((CwEndpoint) target).getConfiguration().setValue(property(camelContext, java.lang.Double.class, value)); return true;
        case "basicPropertyBinding": ((CwEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CwEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accessKey": ((CwEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretKey": ((CwEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "amazoncwclient": ((CwEndpoint) target).getConfiguration().setAmazonCwClient(property(camelContext, com.amazonaws.services.cloudwatch.AmazonCloudWatch.class, value)); return true;
        case "lazystartproducer": ((CwEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "name": ((CwEndpoint) target).getConfiguration().setName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost": ((CwEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((CwEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol": ((CwEndpoint) target).getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": ((CwEndpoint) target).getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "timestamp": ((CwEndpoint) target).getConfiguration().setTimestamp(property(camelContext, java.util.Date.class, value)); return true;
        case "unit": ((CwEndpoint) target).getConfiguration().setUnit(property(camelContext, java.lang.String.class, value)); return true;
        case "value": ((CwEndpoint) target).getConfiguration().setValue(property(camelContext, java.lang.Double.class, value)); return true;
        case "basicpropertybinding": ((CwEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CwEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "accesskey": ((CwEndpoint) target).getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey": ((CwEndpoint) target).getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

