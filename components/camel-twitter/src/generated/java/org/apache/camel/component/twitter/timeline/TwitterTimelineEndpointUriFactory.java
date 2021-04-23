/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twitter.timeline;

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
public class TwitterTimelineEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":timelineType";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(45);
        props.add("backoffMultiplier");
        props.add("latitude");
        props.add("httpProxyHost");
        props.add("initialDelay");
        props.add("type");
        props.add("scheduler");
        props.add("consumerSecret");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("numberOfPages");
        props.add("runLoggingLevel");
        props.add("sortById");
        props.add("backoffErrorThreshold");
        props.add("userIds");
        props.add("greedy");
        props.add("distanceMetric");
        props.add("radius");
        props.add("lang");
        props.add("scheduledExecutorService");
        props.add("consumerKey");
        props.add("longitude");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("sinceId");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("count");
        props.add("httpProxyPort");
        props.add("list");
        props.add("accessToken");
        props.add("httpProxyPassword");
        props.add("backoffIdleThreshold");
        props.add("accessTokenSecret");
        props.add("timelineType");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("startScheduler");
        props.add("filterOld");
        props.add("locations");
        props.add("extendedMode");
        props.add("user");
        props.add("exceptionHandler");
        props.add("httpProxyUser");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(4);
        secretProps.add("consumerSecret");
        secretProps.add("accessToken");
        secretProps.add("consumerKey");
        secretProps.add("accessTokenSecret");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "twitter-timeline".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "timelineType", null, true, copy);
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
        return false;
    }
}

