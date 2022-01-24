/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.consul;

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
public class ConsulEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":apiEndpoint";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(29);
        props.add("nearNode");
        props.add("sslContextParameters");
        props.add("writeTimeout");
        props.add("nodeMeta");
        props.add("recursive");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("connectTimeout");
        props.add("consulClient");
        props.add("action");
        props.add("writeTimeoutMillis");
        props.add("key");
        props.add("readTimeoutMillis");
        props.add("valueAsString");
        props.add("exchangePattern");
        props.add("pingInstance");
        props.add("datacenter");
        props.add("userName");
        props.add("url");
        props.add("tags");
        props.add("lazyStartProducer");
        props.add("apiEndpoint");
        props.add("firstIndex");
        props.add("aclToken");
        props.add("consistencyMode");
        props.add("readTimeout");
        props.add("connectTimeoutMillis");
        props.add("exceptionHandler");
        props.add("blockSeconds");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("password");
        secretProps.add("aclToken");
        secretProps.add("userName");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        MULTI_VALUE_PREFIXES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "consul".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "apiEndpoint", null, true, copy);
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

