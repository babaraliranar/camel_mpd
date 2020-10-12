/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.kinesis;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Kinesis2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("amazonKinesisClient", software.amazon.awssdk.services.kinesis.KinesisClient.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("cborEnabled", boolean.class);
        map.put("configuration", org.apache.camel.component.aws2.kinesis.Kinesis2Configuration.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("region", java.lang.String.class);
        map.put("trustAllCertificates", boolean.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("iteratorType", software.amazon.awssdk.services.kinesis.model.ShardIteratorType.class);
        map.put("maxResultsPerRequest", int.class);
        map.put("sequenceNumber", java.lang.String.class);
        map.put("shardClosed", org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum.class);
        map.put("shardId", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.aws2.kinesis.Kinesis2Configuration getOrCreateConfiguration(Kinesis2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.kinesis.Kinesis2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Kinesis2Component target = (Kinesis2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": getOrCreateConfiguration(target).setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonkinesisclient":
        case "amazonKinesisClient": getOrCreateConfiguration(target).setAmazonKinesisClient(property(camelContext, software.amazon.awssdk.services.kinesis.KinesisClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": getOrCreateConfiguration(target).setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cborenabled":
        case "cborEnabled": getOrCreateConfiguration(target).setCborEnabled(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.kinesis.Kinesis2Configuration.class, value)); return true;
        case "iteratortype":
        case "iteratorType": getOrCreateConfiguration(target).setIteratorType(property(camelContext, software.amazon.awssdk.services.kinesis.model.ShardIteratorType.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxresultsperrequest":
        case "maxResultsPerRequest": getOrCreateConfiguration(target).setMaxResultsPerRequest(property(camelContext, int.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": getOrCreateConfiguration(target).setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": getOrCreateConfiguration(target).setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sequencenumber":
        case "sequenceNumber": getOrCreateConfiguration(target).setSequenceNumber(property(camelContext, java.lang.String.class, value)); return true;
        case "shardclosed":
        case "shardClosed": getOrCreateConfiguration(target).setShardClosed(property(camelContext, org.apache.camel.component.aws2.kinesis.Kinesis2ShardClosedStrategyEnum.class, value)); return true;
        case "shardid":
        case "shardId": getOrCreateConfiguration(target).setShardId(property(camelContext, java.lang.String.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": getOrCreateConfiguration(target).setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Kinesis2Component target = (Kinesis2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return getOrCreateConfiguration(target).getAccessKey();
        case "amazonkinesisclient":
        case "amazonKinesisClient": return getOrCreateConfiguration(target).getAmazonKinesisClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return getOrCreateConfiguration(target).isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cborenabled":
        case "cborEnabled": return getOrCreateConfiguration(target).isCborEnabled();
        case "configuration": return target.getConfiguration();
        case "iteratortype":
        case "iteratorType": return getOrCreateConfiguration(target).getIteratorType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxresultsperrequest":
        case "maxResultsPerRequest": return getOrCreateConfiguration(target).getMaxResultsPerRequest();
        case "proxyhost":
        case "proxyHost": return getOrCreateConfiguration(target).getProxyHost();
        case "proxyport":
        case "proxyPort": return getOrCreateConfiguration(target).getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return getOrCreateConfiguration(target).getProxyProtocol();
        case "region": return getOrCreateConfiguration(target).getRegion();
        case "secretkey":
        case "secretKey": return getOrCreateConfiguration(target).getSecretKey();
        case "sequencenumber":
        case "sequenceNumber": return getOrCreateConfiguration(target).getSequenceNumber();
        case "shardclosed":
        case "shardClosed": return getOrCreateConfiguration(target).getShardClosed();
        case "shardid":
        case "shardId": return getOrCreateConfiguration(target).getShardId();
        case "trustallcertificates":
        case "trustAllCertificates": return getOrCreateConfiguration(target).isTrustAllCertificates();
        default: return null;
        }
    }
}

