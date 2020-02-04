/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.search;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class TwitterSearchComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "accessToken": ((TwitterSearchComponent) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accessTokenSecret": ((TwitterSearchComponent) target).setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerKey": ((TwitterSearchComponent) target).setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerSecret": ((TwitterSearchComponent) target).setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyHost": ((TwitterSearchComponent) target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyUser": ((TwitterSearchComponent) target).setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyPassword": ((TwitterSearchComponent) target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpProxyPort": ((TwitterSearchComponent) target).setHttpProxyPort(property(camelContext, int.class, value)); return true;
        case "basicPropertyBinding": ((TwitterSearchComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((TwitterSearchComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((TwitterSearchComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "accesstoken": ((TwitterSearchComponent) target).setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "accesstokensecret": ((TwitterSearchComponent) target).setAccessTokenSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerkey": ((TwitterSearchComponent) target).setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret": ((TwitterSearchComponent) target).setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyhost": ((TwitterSearchComponent) target).setHttpProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyuser": ((TwitterSearchComponent) target).setHttpProxyUser(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxypassword": ((TwitterSearchComponent) target).setHttpProxyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "httpproxyport": ((TwitterSearchComponent) target).setHttpProxyPort(property(camelContext, int.class, value)); return true;
        case "basicpropertybinding": ((TwitterSearchComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((TwitterSearchComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((TwitterSearchComponent) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

