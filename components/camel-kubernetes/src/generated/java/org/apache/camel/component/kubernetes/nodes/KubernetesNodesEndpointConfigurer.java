/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.nodes;

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
public class KubernetesNodesEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("masterUrl", java.lang.String.class);
        map.put("apiVersion", java.lang.String.class);
        map.put("dnsDomain", java.lang.String.class);
        map.put("kubernetesClient", io.fabric8.kubernetes.client.KubernetesClient.class);
        map.put("portName", java.lang.String.class);
        map.put("portProtocol", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("crdGroup", java.lang.String.class);
        map.put("crdName", java.lang.String.class);
        map.put("crdPlural", java.lang.String.class);
        map.put("crdScope", java.lang.String.class);
        map.put("crdVersion", java.lang.String.class);
        map.put("labelKey", java.lang.String.class);
        map.put("labelValue", java.lang.String.class);
        map.put("namespace", java.lang.String.class);
        map.put("poolSize", int.class);
        map.put("resourceName", java.lang.String.class);
        map.put("exceptionHandler", org.apache.camel.spi.ExceptionHandler.class);
        map.put("exchangePattern", org.apache.camel.ExchangePattern.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("operation", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("connectionTimeout", java.lang.Integer.class);
        map.put("synchronous", boolean.class);
        map.put("caCertData", java.lang.String.class);
        map.put("caCertFile", java.lang.String.class);
        map.put("clientCertData", java.lang.String.class);
        map.put("clientCertFile", java.lang.String.class);
        map.put("clientKeyAlgo", java.lang.String.class);
        map.put("clientKeyData", java.lang.String.class);
        map.put("clientKeyFile", java.lang.String.class);
        map.put("clientKeyPassphrase", java.lang.String.class);
        map.put("oauthToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("trustCerts", java.lang.Boolean.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(KubernetesNodesEndpointConfigurer::clearConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        KubernetesNodesEndpoint target = (KubernetesNodesEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": target.getConfiguration().setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cacertdata":
        case "caCertData": target.getConfiguration().setCaCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "cacertfile":
        case "caCertFile": target.getConfiguration().setCaCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertdata":
        case "clientCertData": target.getConfiguration().setClientCertData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientcertfile":
        case "clientCertFile": target.getConfiguration().setClientCertFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyalgo":
        case "clientKeyAlgo": target.getConfiguration().setClientKeyAlgo(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeydata":
        case "clientKeyData": target.getConfiguration().setClientKeyData(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeyfile":
        case "clientKeyFile": target.getConfiguration().setClientKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "clientkeypassphrase":
        case "clientKeyPassphrase": target.getConfiguration().setClientKeyPassphrase(property(camelContext, java.lang.String.class, value)); return true;
        case "connectiontimeout":
        case "connectionTimeout": target.getConfiguration().setConnectionTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "crdgroup":
        case "crdGroup": target.getConfiguration().setCrdGroup(property(camelContext, java.lang.String.class, value)); return true;
        case "crdname":
        case "crdName": target.getConfiguration().setCrdName(property(camelContext, java.lang.String.class, value)); return true;
        case "crdplural":
        case "crdPlural": target.getConfiguration().setCrdPlural(property(camelContext, java.lang.String.class, value)); return true;
        case "crdscope":
        case "crdScope": target.getConfiguration().setCrdScope(property(camelContext, java.lang.String.class, value)); return true;
        case "crdversion":
        case "crdVersion": target.getConfiguration().setCrdVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "dnsdomain":
        case "dnsDomain": target.getConfiguration().setDnsDomain(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "kubernetesclient":
        case "kubernetesClient": target.getConfiguration().setKubernetesClient(property(camelContext, io.fabric8.kubernetes.client.KubernetesClient.class, value)); return true;
        case "labelkey":
        case "labelKey": target.getConfiguration().setLabelKey(property(camelContext, java.lang.String.class, value)); return true;
        case "labelvalue":
        case "labelValue": target.getConfiguration().setLabelValue(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namespace": target.getConfiguration().setNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "oauthtoken":
        case "oauthToken": target.getConfiguration().setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "poolsize":
        case "poolSize": target.getConfiguration().setPoolSize(property(camelContext, int.class, value)); return true;
        case "portname":
        case "portName": target.getConfiguration().setPortName(property(camelContext, java.lang.String.class, value)); return true;
        case "portprotocol":
        case "portProtocol": target.getConfiguration().setPortProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "resourcename":
        case "resourceName": target.getConfiguration().setResourceName(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "trustcerts":
        case "trustCerts": target.getConfiguration().setTrustCerts(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "username": target.getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        KubernetesNodesEndpoint target = (KubernetesNodesEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": return target.getConfiguration().getApiVersion();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "cacertdata":
        case "caCertData": return target.getConfiguration().getCaCertData();
        case "cacertfile":
        case "caCertFile": return target.getConfiguration().getCaCertFile();
        case "clientcertdata":
        case "clientCertData": return target.getConfiguration().getClientCertData();
        case "clientcertfile":
        case "clientCertFile": return target.getConfiguration().getClientCertFile();
        case "clientkeyalgo":
        case "clientKeyAlgo": return target.getConfiguration().getClientKeyAlgo();
        case "clientkeydata":
        case "clientKeyData": return target.getConfiguration().getClientKeyData();
        case "clientkeyfile":
        case "clientKeyFile": return target.getConfiguration().getClientKeyFile();
        case "clientkeypassphrase":
        case "clientKeyPassphrase": return target.getConfiguration().getClientKeyPassphrase();
        case "connectiontimeout":
        case "connectionTimeout": return target.getConfiguration().getConnectionTimeout();
        case "crdgroup":
        case "crdGroup": return target.getConfiguration().getCrdGroup();
        case "crdname":
        case "crdName": return target.getConfiguration().getCrdName();
        case "crdplural":
        case "crdPlural": return target.getConfiguration().getCrdPlural();
        case "crdscope":
        case "crdScope": return target.getConfiguration().getCrdScope();
        case "crdversion":
        case "crdVersion": return target.getConfiguration().getCrdVersion();
        case "dnsdomain":
        case "dnsDomain": return target.getConfiguration().getDnsDomain();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "kubernetesclient":
        case "kubernetesClient": return target.getConfiguration().getKubernetesClient();
        case "labelkey":
        case "labelKey": return target.getConfiguration().getLabelKey();
        case "labelvalue":
        case "labelValue": return target.getConfiguration().getLabelValue();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "namespace": return target.getConfiguration().getNamespace();
        case "oauthtoken":
        case "oauthToken": return target.getConfiguration().getOauthToken();
        case "operation": return target.getConfiguration().getOperation();
        case "password": return target.getConfiguration().getPassword();
        case "poolsize":
        case "poolSize": return target.getConfiguration().getPoolSize();
        case "portname":
        case "portName": return target.getConfiguration().getPortName();
        case "portprotocol":
        case "portProtocol": return target.getConfiguration().getPortProtocol();
        case "resourcename":
        case "resourceName": return target.getConfiguration().getResourceName();
        case "synchronous": return target.isSynchronous();
        case "trustcerts":
        case "trustCerts": return target.getConfiguration().getTrustCerts();
        case "username": return target.getConfiguration().getUsername();
        default: return null;
        }
    }
}

