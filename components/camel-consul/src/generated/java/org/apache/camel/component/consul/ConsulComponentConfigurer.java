/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ConsulComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.consul.ConsulConfiguration getOrCreateConfiguration(ConsulComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.consul.ConsulConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ConsulComponent target = (ConsulComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "connecttimeoutmillis":
        case "connectTimeoutMillis": getOrCreateConfiguration(target).setConnectTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "consulclient":
        case "consulClient": getOrCreateConfiguration(target).setConsulClient(property(camelContext, com.orbitz.consul.Consul.class, value)); return true;
        case "key": getOrCreateConfiguration(target).setKey(property(camelContext, java.lang.String.class, value)); return true;
        case "pinginstance":
        case "pingInstance": getOrCreateConfiguration(target).setPingInstance(property(camelContext, boolean.class, value)); return true;
        case "readtimeoutmillis":
        case "readTimeoutMillis": getOrCreateConfiguration(target).setReadTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "tags": getOrCreateConfiguration(target).setTags(property(camelContext, java.lang.String.class, value)); return true;
        case "url": getOrCreateConfiguration(target).setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "writetimeoutmillis":
        case "writeTimeoutMillis": getOrCreateConfiguration(target).setWriteTimeoutMillis(property(camelContext, java.lang.Long.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "action": getOrCreateConfiguration(target).setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "valueasstring":
        case "valueAsString": getOrCreateConfiguration(target).setValueAsString(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.consul.ConsulConfiguration.class, value)); return true;
        case "consistencymode":
        case "consistencyMode": getOrCreateConfiguration(target).setConsistencyMode(property(camelContext, com.orbitz.consul.option.ConsistencyMode.class, value)); return true;
        case "datacenter": getOrCreateConfiguration(target).setDatacenter(property(camelContext, java.lang.String.class, value)); return true;
        case "nearnode":
        case "nearNode": getOrCreateConfiguration(target).setNearNode(property(camelContext, java.lang.String.class, value)); return true;
        case "nodemeta":
        case "nodeMeta": getOrCreateConfiguration(target).setNodeMeta(property(camelContext, java.util.List.class, value)); return true;
        case "blockseconds":
        case "blockSeconds": getOrCreateConfiguration(target).setBlockSeconds(property(camelContext, java.lang.Integer.class, value)); return true;
        case "firstindex":
        case "firstIndex": getOrCreateConfiguration(target).setFirstIndex(property(camelContext, java.math.BigInteger.class, value)); return true;
        case "recursive": getOrCreateConfiguration(target).setRecursive(property(camelContext, boolean.class, value)); return true;
        case "acltoken":
        case "aclToken": getOrCreateConfiguration(target).setAclToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslcontextparameters":
        case "sslContextParameters": getOrCreateConfiguration(target).setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "useglobalsslcontextparameters":
        case "useGlobalSslContextParameters": target.setUseGlobalSslContextParameters(property(camelContext, boolean.class, value)); return true;
        case "username":
        case "userName": getOrCreateConfiguration(target).setUserName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

