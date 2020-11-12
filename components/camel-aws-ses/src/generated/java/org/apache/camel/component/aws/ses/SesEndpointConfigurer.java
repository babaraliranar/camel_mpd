/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.ses;

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
public class SesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SesEndpoint target = (SesEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsesclient":
        case "amazonSESClient": target.getConfiguration().setAmazonSESClient(property(camelContext, com.amazonaws.services.simpleemail.AmazonSimpleEmailService.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, com.amazonaws.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "replytoaddresses":
        case "replyToAddresses": target.getConfiguration().setReplyToAddresses(property(camelContext, java.util.List.class, value)); return true;
        case "returnpath":
        case "returnPath": target.getConfiguration().setReturnPath(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "subject": target.getConfiguration().setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "to": target.getConfiguration().setTo(property(camelContext, java.util.List.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonsesclient":
        case "amazonSESClient": return com.amazonaws.services.simpleemail.AmazonSimpleEmailService.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return com.amazonaws.Protocol.class;
        case "region": return java.lang.String.class;
        case "replytoaddresses":
        case "replyToAddresses": return java.util.List.class;
        case "returnpath":
        case "returnPath": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "subject": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "to": return java.util.List.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SesEndpoint target = (SesEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonsesclient":
        case "amazonSESClient": return target.getConfiguration().getAmazonSESClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "replytoaddresses":
        case "replyToAddresses": return target.getConfiguration().getReplyToAddresses();
        case "returnpath":
        case "returnPath": return target.getConfiguration().getReturnPath();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "subject": return target.getConfiguration().getSubject();
        case "synchronous": return target.isSynchronous();
        case "to": return target.getConfiguration().getTo();
        default: return null;
        }
    }
}

