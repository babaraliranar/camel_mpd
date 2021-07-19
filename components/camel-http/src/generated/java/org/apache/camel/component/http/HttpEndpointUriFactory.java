/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.http;

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
public class HttpEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://httpUri";
    private static final String[] SCHEMES = new String[]{"http", "https"};

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(52);
        props.add("clientBuilder");
        props.add("authMethodPriority");
        props.add("ignoreResponseBody");
        props.add("authDomain");
        props.add("proxyPort");
        props.add("transferException");
        props.add("copyHeaders");
        props.add("proxyAuthPassword");
        props.add("bridgeEndpoint");
        props.add("clearExpiredCookies");
        props.add("proxyAuthMethod");
        props.add("httpContext");
        props.add("authenticationPreemptive");
        props.add("throwExceptionOnFailure");
        props.add("httpBinding");
        props.add("authHost");
        props.add("proxyAuthUsername");
        props.add("connectionClose");
        props.add("proxyHost");
        props.add("authPassword");
        props.add("skipRequestHeaders");
        props.add("lazyStartProducer");
        props.add("preserveHostHeader");
        props.add("httpClientConfigurer");
        props.add("disableStreamCache");
        props.add("clientConnectionManager");
        props.add("cookieHandler");
        props.add("getWithBody");
        props.add("proxyAuthPort");
        props.add("maxTotalConnections");
        props.add("proxyAuthScheme");
        props.add("sslContextParameters");
        props.add("httpMethod");
        props.add("skipResponseHeaders");
        props.add("deleteWithBody");
        props.add("httpUri");
        props.add("headerFilterStrategy");
        props.add("customHostHeader");
        props.add("proxyAuthDomain");
        props.add("httpClient");
        props.add("proxyAuthNtHost");
        props.add("chunked");
        props.add("userAgent");
        props.add("httpClientOptions");
        props.add("connectionsPerRoute");
        props.add("useSystemProperties");
        props.add("okStatusCodeRange");
        props.add("proxyAuthHost");
        props.add("authUsername");
        props.add("x509HostnameVerifier");
        props.add("authMethod");
        props.add("cookieStore");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(4);
        secretProps.add("authUsername");
        secretProps.add("proxyAuthPassword");
        secretProps.add("proxyAuthUsername");
        secretProps.add("authPassword");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        for (String s : SCHEMES) {
            if (s.equals(scheme)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "httpUri", null, true, copy);
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

