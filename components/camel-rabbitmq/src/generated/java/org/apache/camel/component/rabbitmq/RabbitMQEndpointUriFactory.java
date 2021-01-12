/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.rabbitmq;

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
public class RabbitMQEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":exchangeName";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(67);
        props.add("prefetchCount");
        props.add("publisherAcknowledgementsTimeout");
        props.add("addresses");
        props.add("declare");
        props.add("requestTimeoutCheckerInterval");
        props.add("prefetchGlobal");
        props.add("synchronous");
        props.add("portNumber");
        props.add("consumerTag");
        props.add("hostname");
        props.add("reQueue");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("deadLetterRoutingKey");
        props.add("transferException");
        props.add("exclusive");
        props.add("trustManager");
        props.add("skipDlqDeclare");
        props.add("exclusiveConsumer");
        props.add("networkRecoveryInterval");
        props.add("bridgeEndpoint");
        props.add("automaticRecoveryEnabled");
        props.add("autoAck");
        props.add("requestedChannelMax");
        props.add("channelPoolMaxSize");
        props.add("connectionFactoryExceptionHandler");
        props.add("concurrentConsumers");
        props.add("guaranteedDeliveries");
        props.add("vhost");
        props.add("lazyStartProducer");
        props.add("threadPoolSize");
        props.add("deadLetterQueue");
        props.add("immediate");
        props.add("sslProtocol");
        props.add("publisherAcknowledgements");
        props.add("additionalProperties");
        props.add("prefetchEnabled");
        props.add("exceptionHandler");
        props.add("routingKey");
        props.add("skipQueueDeclare");
        props.add("exchangeType");
        props.add("mandatory");
        props.add("requestedFrameMax");
        props.add("prefetchSize");
        props.add("durable");
        props.add("channelPoolMaxWait");
        props.add("additionalHeaders");
        props.add("allowMessageBodySerialization");
        props.add("connectionTimeout");
        props.add("requestTimeout");
        props.add("skipExchangeDeclare");
        props.add("deadLetterExchange");
        props.add("clientProperties");
        props.add("exchangePattern");
        props.add("skipQueueBind");
        props.add("deadLetterExchangeType");
        props.add("allowCustomHeaders");
        props.add("passive");
        props.add("args");
        props.add("allowNullHeaders");
        props.add("connectionFactory");
        props.add("autoDelete");
        props.add("requestedHeartbeat");
        props.add("exchangeName");
        props.add("topologyRecoveryEnabled");
        props.add("queue");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "rabbitmq".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "exchangeName", null, true, copy);
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

