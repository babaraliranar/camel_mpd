/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.swf;

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
public class SWFEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":type";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(32);
        props.add("activityTypeRegistrationOptions");
        props.add("clientConfigurationParameters");
        props.add("stateResultType");
        props.add("amazonSWClient");
        props.add("activitySchedulingOptions");
        props.add("synchronous");
        props.add("activityThreadPoolSize");
        props.add("type");
        props.add("terminationDetails");
        props.add("bridgeErrorHandler");
        props.add("workflowTypeRegistrationOptions");
        props.add("activityTypeExecutionOptions");
        props.add("startWorkflowOptionsParameters");
        props.add("eventName");
        props.add("dataConverter");
        props.add("taskStartToCloseTimeout");
        props.add("activityList");
        props.add("terminationReason");
        props.add("signalName");
        props.add("secretKey");
        props.add("exchangePattern");
        props.add("version");
        props.add("executionStartToCloseTimeout");
        props.add("sWClientParameters");
        props.add("lazyStartProducer");
        props.add("accessKey");
        props.add("domainName");
        props.add("childPolicy");
        props.add("region");
        props.add("exceptionHandler");
        props.add("operation");
        props.add("workflowList");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("secretKey");
        secretProps.add("accessKey");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws-swf".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "type", null, true, copy);
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

