/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.milo.client;

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
public class MiloClientEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":endpointUri";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(33);
        props.add("productUri");
        props.add("monitorFilterType");
        props.add("keyAlias");
        props.add("channelLifetime");
        props.add("discoveryEndpointSuffix");
        props.add("defaultAwaitWrites");
        props.add("dataChangeFilterDeadbandValue");
        props.add("samplingInterval");
        props.add("keyStoreUrl");
        props.add("maxPendingPublishRequests");
        props.add("bridgeErrorHandler");
        props.add("keyPassword");
        props.add("endpointUri");
        props.add("applicationName");
        props.add("requestTimeout");
        props.add("keyStoreType");
        props.add("maxResponseMessageSize");
        props.add("clientId");
        props.add("method");
        props.add("keyStorePassword");
        props.add("dataChangeFilterTrigger");
        props.add("sessionName");
        props.add("exchangePattern");
        props.add("dataChangeFilterDeadbandType");
        props.add("node");
        props.add("lazyStartProducer");
        props.add("overrideHost");
        props.add("sessionTimeout");
        props.add("discoveryEndpointUri");
        props.add("applicationUri");
        props.add("allowedSecurityPolicies");
        props.add("exceptionHandler");
        props.add("requestedPublishingInterval");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("keyStorePassword");
        secretProps.add("keyPassword");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "milo-client".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "endpointUri", null, true, copy);
        uri = buildQueryParameters(uri, copy, encode);
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
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

