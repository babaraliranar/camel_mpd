/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.docker;

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
public class DockerEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":operation";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(23);
        props.add("followRedirectFilter");
        props.add("cmdExecFactory");
        props.add("synchronous");
        props.add("tlsVerify");
        props.add("exchangePattern");
        props.add("maxTotalConnections");
        props.add("serverAddress");
        props.add("secure");
        props.add("lazyStartProducer");
        props.add("maxPerRouteConnections");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("certPath");
        props.add("port");
        props.add("loggingFilter");
        props.add("host");
        props.add("socket");
        props.add("operation");
        props.add("exceptionHandler");
        props.add("parameters");
        props.add("email");
        props.add("requestTimeout");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "docker".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "operation", null, true, copy);
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
    public boolean isLenientProperties() {
        return true;
    }
}

