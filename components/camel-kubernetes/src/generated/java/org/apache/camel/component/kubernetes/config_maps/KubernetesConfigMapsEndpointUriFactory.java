/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.kubernetes.config_maps;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class KubernetesConfigMapsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":masterUrl";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(23);
        props.add("basicPropertyBinding");
        props.add("portProtocol");
        props.add("synchronous");
        props.add("caCertData");
        props.add("portName");
        props.add("oauthToken");
        props.add("clientKeyAlgo");
        props.add("dnsDomain");
        props.add("clientCertFile");
        props.add("lazyStartProducer");
        props.add("password");
        props.add("apiVersion");
        props.add("clientKeyData");
        props.add("masterUrl");
        props.add("clientCertData");
        props.add("caCertFile");
        props.add("clientKeyFile");
        props.add("operation");
        props.add("connectionTimeout");
        props.add("clientKeyPassphrase");
        props.add("kubernetesClient");
        props.add("trustCerts");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(12);
        secretProps.add("password");
        secretProps.add("clientKeyData");
        secretProps.add("caCertData");
        secretProps.add("clientCertData");
        secretProps.add("caCertFile");
        secretProps.add("clientKeyFile");
        secretProps.add("oauthToken");
        secretProps.add("clientKeyPassphrase");
        secretProps.add("clientKeyAlgo");
        secretProps.add("clientCertFile");
        secretProps.add("trustCerts");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "kubernetes-config-maps".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "masterUrl", null, true, copy);
        uri = buildQueryParameters(uri, copy);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

