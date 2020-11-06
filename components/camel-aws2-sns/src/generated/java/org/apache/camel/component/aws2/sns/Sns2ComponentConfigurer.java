/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.sns;

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
public class Sns2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amazonSNSClient", software.amazon.awssdk.services.sns.SnsClient.class);
        map.put("autoCreateTopic", boolean.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("configuration", org.apache.camel.component.aws2.sns.Sns2Configuration.class);
        map.put("kmsMasterKeyId", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("messageStructure", java.lang.String.class);
        map.put("policy", java.lang.String.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("queueUrl", java.lang.String.class);
        map.put("region", java.lang.String.class);
        map.put("serverSideEncryptionEnabled", boolean.class);
        map.put("subject", java.lang.String.class);
        map.put("subscribeSNStoSQS", boolean.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(Sns2ComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.aws2.sns.Sns2Configuration getOrCreateConfiguration(Sns2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.sns.Sns2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Sns2Component target = (Sns2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonsnsclient":
        case "amazonSNSClient": getOrCreateConfiguration(target).setAmazonSNSClient(property(camelContext, software.amazon.awssdk.services.sns.SnsClient.class, value)); return true;
        case "autocreatetopic":
        case "autoCreateTopic": getOrCreateConfiguration(target).setAutoCreateTopic(property(camelContext, boolean.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.sns.Sns2Configuration.class, value)); return true;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": getOrCreateConfiguration(target).setKmsMasterKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messagestructure":
        case "messageStructure": getOrCreateConfiguration(target).setMessageStructure(property(camelContext, java.lang.String.class, value)); return true;
        case "policy": getOrCreateConfiguration(target).setPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queueurl":
        case "queueUrl": getOrCreateConfiguration(target).setQueueUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": getOrCreateConfiguration(target).setServerSideEncryptionEnabled(property(camelContext, boolean.class, value)); return true;
        case "subject": getOrCreateConfiguration(target).setSubject(property(camelContext, java.lang.String.class, value)); return true;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": getOrCreateConfiguration(target).setSubscribeSNStoSQS(property(camelContext, boolean.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
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
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "amazonsnsclient":
        case "amazonSNSClient": return software.amazon.awssdk.services.sns.SnsClient.class;
        case "autocreatetopic":
        case "autoCreateTopic": return boolean.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "configuration": return org.apache.camel.component.aws2.sns.Sns2Configuration.class;
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "messagestructure":
        case "messageStructure": return java.lang.String.class;
        case "policy": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "queueurl":
        case "queueUrl": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return boolean.class;
        case "subject": return java.lang.String.class;
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": return boolean.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Sns2Component target = (Sns2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonsnsclient":
        case "amazonSNSClient": return getOrCreateConfiguration(target).getAmazonSNSClient();
        case "autocreatetopic":
        case "autoCreateTopic": return getOrCreateConfiguration(target).isAutoCreateTopic();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "configuration": return target.getConfiguration();
        case "kmsmasterkeyid":
        case "kmsMasterKeyId": return getOrCreateConfiguration(target).getKmsMasterKeyId();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messagestructure":
        case "messageStructure": return getOrCreateConfiguration(target).getMessageStructure();
        case "policy": return getOrCreateConfiguration(target).getPolicy();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "queueurl":
        case "queueUrl": return getOrCreateConfiguration(target).getQueueUrl();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "serversideencryptionenabled":
        case "serverSideEncryptionEnabled": return getOrCreateConfiguration(target).isServerSideEncryptionEnabled();
        case "subject": return getOrCreateConfiguration(target).getSubject();
        case "subscribesnstosqs":
        case "subscribeSNStoSQS": return getOrCreateConfiguration(target).isSubscribeSNStoSQS();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        default: return null;
        }
    }
}

