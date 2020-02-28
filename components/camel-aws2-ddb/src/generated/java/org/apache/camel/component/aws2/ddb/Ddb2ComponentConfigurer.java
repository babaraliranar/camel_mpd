/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.ddb;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class Ddb2ComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.aws2.ddb.Ddb2Configuration getOrCreateConfiguration(Ddb2Component target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.aws2.ddb.Ddb2Configuration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Ddb2Component target = (Ddb2Component) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonddbclient":
        case "amazonDDBClient": getOrCreateConfiguration(target).setAmazonDDBClient(property(camelContext, software.amazon.awssdk.services.dynamodb.DynamoDbClient.class, value)); return true;
        case "consistentread":
        case "consistentRead": getOrCreateConfiguration(target).setConsistentRead(property(camelContext, boolean.class, value)); return true;
        case "keyattributename":
        case "keyAttributeName": getOrCreateConfiguration(target).setKeyAttributeName(property(camelContext, java.lang.String.class, value)); return true;
        case "keyattributetype":
        case "keyAttributeType": getOrCreateConfiguration(target).setKeyAttributeType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Operations.class, value)); return true;
        case "proxyhost":
        case "proxyHost": getOrCreateConfiguration(target).setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": getOrCreateConfiguration(target).setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": getOrCreateConfiguration(target).setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "readcapacity":
        case "readCapacity": getOrCreateConfiguration(target).setReadCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "region": target.setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "writecapacity":
        case "writeCapacity": getOrCreateConfiguration(target).setWriteCapacity(property(camelContext, java.lang.Long.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.aws2.ddb.Ddb2Configuration.class, value)); return true;
        default: return false;
        }
    }

}

