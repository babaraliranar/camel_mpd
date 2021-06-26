/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.dataset;

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
public class DataSetTestEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(17);
        props.add("log");
        props.add("anyOrder");
        props.add("expectedCount");
        props.add("retainLast");
        props.add("assertPeriod");
        props.add("failFast");
        props.add("resultMinimumWaitTime");
        props.add("timeout");
        props.add("reportGroup");
        props.add("sleepForEmptyTest");
        props.add("lazyStartProducer");
        props.add("split");
        props.add("delimiter");
        props.add("name");
        props.add("copyOnExchange");
        props.add("resultWaitTime");
        props.add("retainFirst");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "dataset-test".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
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

