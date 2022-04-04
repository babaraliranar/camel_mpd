/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

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
public class DebeziumDb2EndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(47);
        props.add("additionalProperties");
        props.add("bridgeErrorHandler");
        props.add("columnBlacklist");
        props.add("columnExcludeList");
        props.add("databaseDbname");
        props.add("databaseHistory");
        props.add("databaseHistoryFileFilename");
        props.add("databaseHistoryKafkaBootstrapServers");
        props.add("databaseHistoryKafkaRecoveryAttempts");
        props.add("databaseHistoryKafkaRecoveryPollIntervalMs");
        props.add("databaseHistoryKafkaTopic");
        props.add("databaseHostname");
        props.add("databasePassword");
        props.add("databasePort");
        props.add("databaseServerName");
        props.add("databaseUser");
        props.add("decimalHandlingMode");
        props.add("eventProcessingFailureHandlingMode");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("heartbeatIntervalMs");
        props.add("heartbeatTopicsPrefix");
        props.add("internalKeyConverter");
        props.add("internalValueConverter");
        props.add("maxBatchSize");
        props.add("maxQueueSize");
        props.add("name");
        props.add("offsetCommitPolicy");
        props.add("offsetCommitTimeoutMs");
        props.add("offsetFlushIntervalMs");
        props.add("offsetStorage");
        props.add("offsetStorageFileName");
        props.add("offsetStoragePartitions");
        props.add("offsetStorageReplicationFactor");
        props.add("offsetStorageTopic");
        props.add("pollIntervalMs");
        props.add("snapshotDelayMs");
        props.add("snapshotFetchSize");
        props.add("snapshotMode");
        props.add("snapshotSelectStatementOverrides");
        props.add("sourceStructVersion");
        props.add("tableBlacklist");
        props.add("tableExcludeList");
        props.add("tableIgnoreBuiltin");
        props.add("tableIncludeList");
        props.add("tableWhitelist");
        props.add("timePrecisionMode");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("additionalProperties.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "debezium-db2".equals(scheme);
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
    public Set<String> multiValuePrefixes() {
        return MULTI_VALUE_PREFIXES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}

