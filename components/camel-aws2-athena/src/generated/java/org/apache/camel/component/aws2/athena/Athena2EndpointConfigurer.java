/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.athena;

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
public class Athena2EndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("label", java.lang.String.class);
        map.put("autoDiscoverClient", boolean.class);
        map.put("accessKey", java.lang.String.class);
        map.put("amazonAthenaClient", software.amazon.awssdk.services.athena.AthenaClient.class);
        map.put("database", java.lang.String.class);
        map.put("delay", long.class);
        map.put("encryptionOption", software.amazon.awssdk.services.athena.model.EncryptionOption.class);
        map.put("includeTrace", boolean.class);
        map.put("initialDelay", long.class);
        map.put("kmsKey", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("maxAttempts", int.class);
        map.put("maxResults", java.lang.Integer.class);
        map.put("nextToken", java.lang.String.class);
        map.put("operation", org.apache.camel.component.aws2.athena.Athena2Operations.class);
        map.put("outputLocation", java.lang.String.class);
        map.put("outputType", org.apache.camel.component.aws2.athena.Athena2OutputType.class);
        map.put("proxyHost", java.lang.String.class);
        map.put("proxyPort", java.lang.Integer.class);
        map.put("proxyProtocol", software.amazon.awssdk.core.Protocol.class);
        map.put("queryExecutionId", java.lang.String.class);
        map.put("queryString", java.lang.String.class);
        map.put("region", java.lang.String.class);
        map.put("resetWaitTimeoutOnRetry", boolean.class);
        map.put("retry", java.lang.String.class);
        map.put("secretKey", java.lang.String.class);
        map.put("waitTimeout", long.class);
        map.put("workGroup", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("clientRequestToken", java.lang.String.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(Athena2EndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        Athena2Endpoint target = (Athena2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "amazonathenaclient":
        case "amazonAthenaClient": target.getConfiguration().setAmazonAthenaClient(property(camelContext, software.amazon.awssdk.services.athena.AthenaClient.class, value)); return true;
        case "autodiscoverclient":
        case "autoDiscoverClient": target.getConfiguration().setAutoDiscoverClient(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "clientrequesttoken":
        case "clientRequestToken": target.getConfiguration().setClientRequestToken(property(camelContext, java.lang.String.class, value)); return true;
        case "database": target.getConfiguration().setDatabase(property(camelContext, java.lang.String.class, value)); return true;
        case "delay": target.getConfiguration().setDelay(property(camelContext, long.class, value)); return true;
        case "encryptionoption":
        case "encryptionOption": target.getConfiguration().setEncryptionOption(property(camelContext, software.amazon.awssdk.services.athena.model.EncryptionOption.class, value)); return true;
        case "includetrace":
        case "includeTrace": target.getConfiguration().setIncludeTrace(property(camelContext, boolean.class, value)); return true;
        case "initialdelay":
        case "initialDelay": target.getConfiguration().setInitialDelay(property(camelContext, long.class, value)); return true;
        case "kmskey":
        case "kmsKey": target.getConfiguration().setKmsKey(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxattempts":
        case "maxAttempts": target.getConfiguration().setMaxAttempts(property(camelContext, int.class, value)); return true;
        case "maxresults":
        case "maxResults": target.getConfiguration().setMaxResults(property(camelContext, java.lang.Integer.class, value)); return true;
        case "nexttoken":
        case "nextToken": target.getConfiguration().setNextToken(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.athena.Athena2Operations.class, value)); return true;
        case "outputlocation":
        case "outputLocation": target.getConfiguration().setOutputLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "outputtype":
        case "outputType": target.getConfiguration().setOutputType(property(camelContext, org.apache.camel.component.aws2.athena.Athena2OutputType.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "queryexecutionid":
        case "queryExecutionId": target.getConfiguration().setQueryExecutionId(property(camelContext, java.lang.String.class, value)); return true;
        case "querystring":
        case "queryString": target.getConfiguration().setQueryString(property(camelContext, java.lang.String.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "resetwaittimeoutonretry":
        case "resetWaitTimeoutOnRetry": target.getConfiguration().setResetWaitTimeoutOnRetry(property(camelContext, boolean.class, value)); return true;
        case "retry": target.getConfiguration().setRetry(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "waittimeout":
        case "waitTimeout": target.getConfiguration().setWaitTimeout(property(camelContext, long.class, value)); return true;
        case "workgroup":
        case "workGroup": target.getConfiguration().setWorkGroup(property(camelContext, java.lang.String.class, value)); return true;
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
        case "amazonathenaclient":
        case "amazonAthenaClient": return software.amazon.awssdk.services.athena.AthenaClient.class;
        case "autodiscoverclient":
        case "autoDiscoverClient": return boolean.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "clientrequesttoken":
        case "clientRequestToken": return java.lang.String.class;
        case "database": return java.lang.String.class;
        case "delay": return long.class;
        case "encryptionoption":
        case "encryptionOption": return software.amazon.awssdk.services.athena.model.EncryptionOption.class;
        case "includetrace":
        case "includeTrace": return boolean.class;
        case "initialdelay":
        case "initialDelay": return long.class;
        case "kmskey":
        case "kmsKey": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxattempts":
        case "maxAttempts": return int.class;
        case "maxresults":
        case "maxResults": return java.lang.Integer.class;
        case "nexttoken":
        case "nextToken": return java.lang.String.class;
        case "operation": return org.apache.camel.component.aws2.athena.Athena2Operations.class;
        case "outputlocation":
        case "outputLocation": return java.lang.String.class;
        case "outputtype":
        case "outputType": return org.apache.camel.component.aws2.athena.Athena2OutputType.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "queryexecutionid":
        case "queryExecutionId": return java.lang.String.class;
        case "querystring":
        case "queryString": return java.lang.String.class;
        case "region": return java.lang.String.class;
        case "resetwaittimeoutonretry":
        case "resetWaitTimeoutOnRetry": return boolean.class;
        case "retry": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "waittimeout":
        case "waitTimeout": return long.class;
        case "workgroup":
        case "workGroup": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        Athena2Endpoint target = (Athena2Endpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "amazonathenaclient":
        case "amazonAthenaClient": return target.getConfiguration().getAmazonAthenaClient();
        case "autodiscoverclient":
        case "autoDiscoverClient": return target.getConfiguration().isAutoDiscoverClient();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "clientrequesttoken":
        case "clientRequestToken": return target.getConfiguration().getClientRequestToken();
        case "database": return target.getConfiguration().getDatabase();
        case "delay": return target.getConfiguration().getDelay();
        case "encryptionoption":
        case "encryptionOption": return target.getConfiguration().getEncryptionOption();
        case "includetrace":
        case "includeTrace": return target.getConfiguration().isIncludeTrace();
        case "initialdelay":
        case "initialDelay": return target.getConfiguration().getInitialDelay();
        case "kmskey":
        case "kmsKey": return target.getConfiguration().getKmsKey();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxattempts":
        case "maxAttempts": return target.getConfiguration().getMaxAttempts();
        case "maxresults":
        case "maxResults": return target.getConfiguration().getMaxResults();
        case "nexttoken":
        case "nextToken": return target.getConfiguration().getNextToken();
        case "operation": return target.getConfiguration().getOperation();
        case "outputlocation":
        case "outputLocation": return target.getConfiguration().getOutputLocation();
        case "outputtype":
        case "outputType": return target.getConfiguration().getOutputType();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "queryexecutionid":
        case "queryExecutionId": return target.getConfiguration().getQueryExecutionId();
        case "querystring":
        case "queryString": return target.getConfiguration().getQueryString();
        case "region": return target.getConfiguration().getRegion();
        case "resetwaittimeoutonretry":
        case "resetWaitTimeoutOnRetry": return target.getConfiguration().isResetWaitTimeoutOnRetry();
        case "retry": return target.getConfiguration().getRetry();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "synchronous": return target.isSynchronous();
        case "waittimeout":
        case "waitTimeout": return target.getConfiguration().getWaitTimeout();
        case "workgroup":
        case "workGroup": return target.getConfiguration().getWorkGroup();
        default: return null;
        }
    }
}

