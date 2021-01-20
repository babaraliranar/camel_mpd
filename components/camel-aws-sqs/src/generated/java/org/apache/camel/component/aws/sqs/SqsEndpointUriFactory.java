/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws.sqs;

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
public class SqsEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":queueNameOrArn";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(58);
        props.add("queueUrl");
        props.add("initialDelay");
        props.add("proxyPort");
        props.add("protocol");
        props.add("attributeNames");
        props.add("bridgeErrorHandler");
        props.add("greedy");
        props.add("maxMessagesPerPoll");
        props.add("scheduledExecutorService");
        props.add("messageRetentionPeriod");
        props.add("repeatCount");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("extendMessageVisibility");
        props.add("queueOwnerAWSAccountId");
        props.add("concurrentConsumers");
        props.add("proxyHost");
        props.add("receiveMessageWaitTimeSeconds");
        props.add("backoffIdleThreshold");
        props.add("lazyStartProducer");
        props.add("waitTimeSeconds");
        props.add("delay");
        props.add("redrivePolicy");
        props.add("startScheduler");
        props.add("accessKey");
        props.add("region");
        props.add("exceptionHandler");
        props.add("backoffMultiplier");
        props.add("maximumMessageSize");
        props.add("deleteIfFiltered");
        props.add("messageDeduplicationIdStrategy");
        props.add("kmsDataKeyReusePeriodSeconds");
        props.add("visibilityTimeout");
        props.add("scheduler");
        props.add("useFixedDelay");
        props.add("headerFilterStrategy");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("autoCreateQueue");
        props.add("kmsMasterKeyId");
        props.add("amazonAWSHost");
        props.add("delayQueue");
        props.add("policy");
        props.add("timeUnit");
        props.add("delaySeconds");
        props.add("autoDiscoverClient");
        props.add("messageAttributeNames");
        props.add("serverSideEncryptionEnabled");
        props.add("proxyProtocol");
        props.add("secretKey");
        props.add("queueNameOrArn");
        props.add("exchangePattern");
        props.add("defaultVisibilityTimeout");
        props.add("messageGroupIdStrategy");
        props.add("pollStrategy");
        props.add("amazonSQSClient");
        props.add("deleteAfterRead");
        props.add("operation");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("secretKey");
        secretProps.add("accessKey");
        secretProps.add("queueOwnerAWSAccountId");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "aws-sqs".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "queueNameOrArn", null, true, copy);
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

