/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.debezium;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DebeziumMySqlComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("additionalProperties", java.util.Map.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("configuration", org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration.class);
        map.put("internalKeyConverter", java.lang.String.class);
        map.put("internalValueConverter", java.lang.String.class);
        map.put("offsetCommitPolicy", java.lang.String.class);
        map.put("offsetCommitTimeoutMs", long.class);
        map.put("offsetFlushIntervalMs", long.class);
        map.put("offsetStorage", java.lang.String.class);
        map.put("offsetStorageFileName", java.lang.String.class);
        map.put("offsetStoragePartitions", int.class);
        map.put("offsetStorageReplicationFactor", int.class);
        map.put("offsetStorageTopic", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("bigintUnsignedHandlingMode", java.lang.String.class);
        map.put("binaryHandlingMode", java.lang.String.class);
        map.put("binlogBufferSize", int.class);
        map.put("columnBlacklist", java.lang.String.class);
        map.put("columnExcludeList", java.lang.String.class);
        map.put("columnIncludeList", java.lang.String.class);
        map.put("connectKeepAlive", boolean.class);
        map.put("connectKeepAliveIntervalMs", long.class);
        map.put("connectTimeoutMs", int.class);
        map.put("databaseExcludeList", java.lang.String.class);
        map.put("databaseHistory", java.lang.String.class);
        map.put("databaseHistoryFileFilename", java.lang.String.class);
        map.put("databaseHistoryKafkaBootstrapServers", java.lang.String.class);
        map.put("databaseHistoryKafkaRecoveryAttempts", int.class);
        map.put("databaseHistoryKafkaRecoveryPollIntervalMs", int.class);
        map.put("databaseHistoryKafkaTopic", java.lang.String.class);
        map.put("databaseHistorySkipUnparseableDdl", boolean.class);
        map.put("databaseHistoryStoreOnlyMonitoredTablesDdl", boolean.class);
        map.put("databaseHostname", java.lang.String.class);
        map.put("databaseIncludeList", java.lang.String.class);
        map.put("databaseInitialStatements", java.lang.String.class);
        map.put("databaseJdbcDriver", java.lang.String.class);
        map.put("databasePassword", java.lang.String.class);
        map.put("databasePort", int.class);
        map.put("databaseServerId", long.class);
        map.put("databaseServerIdOffset", long.class);
        map.put("databaseServerName", java.lang.String.class);
        map.put("databaseSslKeystore", java.lang.String.class);
        map.put("databaseSslKeystorePassword", java.lang.String.class);
        map.put("databaseSslMode", java.lang.String.class);
        map.put("databaseSslTruststore", java.lang.String.class);
        map.put("databaseSslTruststorePassword", java.lang.String.class);
        map.put("databaseUser", java.lang.String.class);
        map.put("decimalHandlingMode", java.lang.String.class);
        map.put("enableTimeAdjuster", boolean.class);
        map.put("eventDeserializationFailureHandlingMode", java.lang.String.class);
        map.put("eventProcessingFailureHandlingMode", java.lang.String.class);
        map.put("gtidNewChannelPosition", java.lang.String.class);
        map.put("gtidSourceExcludes", java.lang.String.class);
        map.put("gtidSourceFilterDmlEvents", boolean.class);
        map.put("gtidSourceIncludes", java.lang.String.class);
        map.put("heartbeatIntervalMs", int.class);
        map.put("heartbeatTopicsPrefix", java.lang.String.class);
        map.put("includeQuery", boolean.class);
        map.put("includeSchemaChanges", boolean.class);
        map.put("inconsistentSchemaHandlingMode", java.lang.String.class);
        map.put("maxBatchSize", int.class);
        map.put("maxQueueSize", int.class);
        map.put("messageKeyColumns", java.lang.String.class);
        map.put("pollIntervalMs", long.class);
        map.put("skippedOperations", java.lang.String.class);
        map.put("snapshotDelayMs", long.class);
        map.put("snapshotFetchSize", int.class);
        map.put("snapshotLockingMode", java.lang.String.class);
        map.put("snapshotMode", java.lang.String.class);
        map.put("snapshotNewTables", java.lang.String.class);
        map.put("snapshotSelectStatementOverrides", java.lang.String.class);
        map.put("sourceStructVersion", java.lang.String.class);
        map.put("tableBlacklist", java.lang.String.class);
        map.put("tableExcludeList", java.lang.String.class);
        map.put("tableIgnoreBuiltin", boolean.class);
        map.put("tableIncludeList", java.lang.String.class);
        map.put("tableWhitelist", java.lang.String.class);
        map.put("timePrecisionMode", java.lang.String.class);
        map.put("tombstonesOnDelete", boolean.class);
        ALL_OPTIONS = map;
    }

    private org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration getOrCreateConfiguration(DebeziumMySqlComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DebeziumMySqlComponent target = (DebeziumMySqlComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": getOrCreateConfiguration(target).setAdditionalProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bigintunsignedhandlingmode":
        case "bigintUnsignedHandlingMode": getOrCreateConfiguration(target).setBigintUnsignedHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "binaryhandlingmode":
        case "binaryHandlingMode": getOrCreateConfiguration(target).setBinaryHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "binlogbuffersize":
        case "binlogBufferSize": getOrCreateConfiguration(target).setBinlogBufferSize(property(camelContext, int.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "columnblacklist":
        case "columnBlacklist": getOrCreateConfiguration(target).setColumnBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "columnexcludelist":
        case "columnExcludeList": getOrCreateConfiguration(target).setColumnExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "columnincludelist":
        case "columnIncludeList": getOrCreateConfiguration(target).setColumnIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.debezium.configuration.MySqlConnectorEmbeddedDebeziumConfiguration.class, value)); return true;
        case "connectkeepalive":
        case "connectKeepAlive": getOrCreateConfiguration(target).setConnectKeepAlive(property(camelContext, boolean.class, value)); return true;
        case "connectkeepaliveintervalms":
        case "connectKeepAliveIntervalMs": getOrCreateConfiguration(target).setConnectKeepAliveIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "connecttimeoutms":
        case "connectTimeoutMs": getOrCreateConfiguration(target).setConnectTimeoutMs(property(camelContext, int.class, value)); return true;
        case "databaseexcludelist":
        case "databaseExcludeList": getOrCreateConfiguration(target).setDatabaseExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistory":
        case "databaseHistory": getOrCreateConfiguration(target).setDatabaseHistory(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": getOrCreateConfiguration(target).setDatabaseHistoryFileFilename(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": getOrCreateConfiguration(target).setDatabaseHistoryKafkaBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryAttempts(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": getOrCreateConfiguration(target).setDatabaseHistoryKafkaRecoveryPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": getOrCreateConfiguration(target).setDatabaseHistoryKafkaTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "databasehistoryskipunparseableddl":
        case "databaseHistorySkipUnparseableDdl": getOrCreateConfiguration(target).setDatabaseHistorySkipUnparseableDdl(property(camelContext, boolean.class, value)); return true;
        case "databasehistorystoreonlymonitoredtablesddl":
        case "databaseHistoryStoreOnlyMonitoredTablesDdl": getOrCreateConfiguration(target).setDatabaseHistoryStoreOnlyMonitoredTablesDdl(property(camelContext, boolean.class, value)); return true;
        case "databasehostname":
        case "databaseHostname": getOrCreateConfiguration(target).setDatabaseHostname(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseincludelist":
        case "databaseIncludeList": getOrCreateConfiguration(target).setDatabaseIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseinitialstatements":
        case "databaseInitialStatements": getOrCreateConfiguration(target).setDatabaseInitialStatements(property(camelContext, java.lang.String.class, value)); return true;
        case "databasejdbcdriver":
        case "databaseJdbcDriver": getOrCreateConfiguration(target).setDatabaseJdbcDriver(property(camelContext, java.lang.String.class, value)); return true;
        case "databasepassword":
        case "databasePassword": getOrCreateConfiguration(target).setDatabasePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseport":
        case "databasePort": getOrCreateConfiguration(target).setDatabasePort(property(camelContext, int.class, value)); return true;
        case "databaseserverid":
        case "databaseServerId": getOrCreateConfiguration(target).setDatabaseServerId(property(camelContext, long.class, value)); return true;
        case "databaseserveridoffset":
        case "databaseServerIdOffset": getOrCreateConfiguration(target).setDatabaseServerIdOffset(property(camelContext, long.class, value)); return true;
        case "databaseservername":
        case "databaseServerName": getOrCreateConfiguration(target).setDatabaseServerName(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkeystore":
        case "databaseSslKeystore": getOrCreateConfiguration(target).setDatabaseSslKeystore(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslkeystorepassword":
        case "databaseSslKeystorePassword": getOrCreateConfiguration(target).setDatabaseSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databasesslmode":
        case "databaseSslMode": getOrCreateConfiguration(target).setDatabaseSslMode(property(camelContext, java.lang.String.class, value)); return true;
        case "databasessltruststore":
        case "databaseSslTruststore": getOrCreateConfiguration(target).setDatabaseSslTruststore(property(camelContext, java.lang.String.class, value)); return true;
        case "databasessltruststorepassword":
        case "databaseSslTruststorePassword": getOrCreateConfiguration(target).setDatabaseSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "databaseuser":
        case "databaseUser": getOrCreateConfiguration(target).setDatabaseUser(property(camelContext, java.lang.String.class, value)); return true;
        case "decimalhandlingmode":
        case "decimalHandlingMode": getOrCreateConfiguration(target).setDecimalHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "enabletimeadjuster":
        case "enableTimeAdjuster": getOrCreateConfiguration(target).setEnableTimeAdjuster(property(camelContext, boolean.class, value)); return true;
        case "eventdeserializationfailurehandlingmode":
        case "eventDeserializationFailureHandlingMode": getOrCreateConfiguration(target).setEventDeserializationFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": getOrCreateConfiguration(target).setEventProcessingFailureHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidnewchannelposition":
        case "gtidNewChannelPosition": getOrCreateConfiguration(target).setGtidNewChannelPosition(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidsourceexcludes":
        case "gtidSourceExcludes": getOrCreateConfiguration(target).setGtidSourceExcludes(property(camelContext, java.lang.String.class, value)); return true;
        case "gtidsourcefilterdmlevents":
        case "gtidSourceFilterDmlEvents": getOrCreateConfiguration(target).setGtidSourceFilterDmlEvents(property(camelContext, boolean.class, value)); return true;
        case "gtidsourceincludes":
        case "gtidSourceIncludes": getOrCreateConfiguration(target).setGtidSourceIncludes(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": getOrCreateConfiguration(target).setHeartbeatTopicsPrefix(property(camelContext, java.lang.String.class, value)); return true;
        case "includequery":
        case "includeQuery": getOrCreateConfiguration(target).setIncludeQuery(property(camelContext, boolean.class, value)); return true;
        case "includeschemachanges":
        case "includeSchemaChanges": getOrCreateConfiguration(target).setIncludeSchemaChanges(property(camelContext, boolean.class, value)); return true;
        case "inconsistentschemahandlingmode":
        case "inconsistentSchemaHandlingMode": getOrCreateConfiguration(target).setInconsistentSchemaHandlingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "internalkeyconverter":
        case "internalKeyConverter": getOrCreateConfiguration(target).setInternalKeyConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "internalvalueconverter":
        case "internalValueConverter": getOrCreateConfiguration(target).setInternalValueConverter(property(camelContext, java.lang.String.class, value)); return true;
        case "maxbatchsize":
        case "maxBatchSize": getOrCreateConfiguration(target).setMaxBatchSize(property(camelContext, int.class, value)); return true;
        case "maxqueuesize":
        case "maxQueueSize": getOrCreateConfiguration(target).setMaxQueueSize(property(camelContext, int.class, value)); return true;
        case "messagekeycolumns":
        case "messageKeyColumns": getOrCreateConfiguration(target).setMessageKeyColumns(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": getOrCreateConfiguration(target).setOffsetCommitPolicy(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": getOrCreateConfiguration(target).setOffsetCommitTimeoutMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": getOrCreateConfiguration(target).setOffsetFlushIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "offsetstorage":
        case "offsetStorage": getOrCreateConfiguration(target).setOffsetStorage(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragefilename":
        case "offsetStorageFileName": getOrCreateConfiguration(target).setOffsetStorageFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": getOrCreateConfiguration(target).setOffsetStoragePartitions(property(camelContext, int.class, value)); return true;
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": getOrCreateConfiguration(target).setOffsetStorageReplicationFactor(property(camelContext, int.class, value)); return true;
        case "offsetstoragetopic":
        case "offsetStorageTopic": getOrCreateConfiguration(target).setOffsetStorageTopic(property(camelContext, java.lang.String.class, value)); return true;
        case "pollintervalms":
        case "pollIntervalMs": getOrCreateConfiguration(target).setPollIntervalMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "skippedoperations":
        case "skippedOperations": getOrCreateConfiguration(target).setSkippedOperations(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotdelayms":
        case "snapshotDelayMs": getOrCreateConfiguration(target).setSnapshotDelayMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "snapshotfetchsize":
        case "snapshotFetchSize": getOrCreateConfiguration(target).setSnapshotFetchSize(property(camelContext, int.class, value)); return true;
        case "snapshotlockingmode":
        case "snapshotLockingMode": getOrCreateConfiguration(target).setSnapshotLockingMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotmode":
        case "snapshotMode": getOrCreateConfiguration(target).setSnapshotMode(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotnewtables":
        case "snapshotNewTables": getOrCreateConfiguration(target).setSnapshotNewTables(property(camelContext, java.lang.String.class, value)); return true;
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": getOrCreateConfiguration(target).setSnapshotSelectStatementOverrides(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcestructversion":
        case "sourceStructVersion": getOrCreateConfiguration(target).setSourceStructVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "tableblacklist":
        case "tableBlacklist": getOrCreateConfiguration(target).setTableBlacklist(property(camelContext, java.lang.String.class, value)); return true;
        case "tableexcludelist":
        case "tableExcludeList": getOrCreateConfiguration(target).setTableExcludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": getOrCreateConfiguration(target).setTableIgnoreBuiltin(property(camelContext, boolean.class, value)); return true;
        case "tableincludelist":
        case "tableIncludeList": getOrCreateConfiguration(target).setTableIncludeList(property(camelContext, java.lang.String.class, value)); return true;
        case "tablewhitelist":
        case "tableWhitelist": getOrCreateConfiguration(target).setTableWhitelist(property(camelContext, java.lang.String.class, value)); return true;
        case "timeprecisionmode":
        case "timePrecisionMode": getOrCreateConfiguration(target).setTimePrecisionMode(property(camelContext, java.lang.String.class, value)); return true;
        case "tombstonesondelete":
        case "tombstonesOnDelete": getOrCreateConfiguration(target).setTombstonesOnDelete(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DebeziumMySqlComponent target = (DebeziumMySqlComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "additionalproperties":
        case "additionalProperties": return getOrCreateConfiguration(target).getAdditionalProperties();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bigintunsignedhandlingmode":
        case "bigintUnsignedHandlingMode": return getOrCreateConfiguration(target).getBigintUnsignedHandlingMode();
        case "binaryhandlingmode":
        case "binaryHandlingMode": return getOrCreateConfiguration(target).getBinaryHandlingMode();
        case "binlogbuffersize":
        case "binlogBufferSize": return getOrCreateConfiguration(target).getBinlogBufferSize();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "columnblacklist":
        case "columnBlacklist": return getOrCreateConfiguration(target).getColumnBlacklist();
        case "columnexcludelist":
        case "columnExcludeList": return getOrCreateConfiguration(target).getColumnExcludeList();
        case "columnincludelist":
        case "columnIncludeList": return getOrCreateConfiguration(target).getColumnIncludeList();
        case "configuration": return target.getConfiguration();
        case "connectkeepalive":
        case "connectKeepAlive": return getOrCreateConfiguration(target).isConnectKeepAlive();
        case "connectkeepaliveintervalms":
        case "connectKeepAliveIntervalMs": return getOrCreateConfiguration(target).getConnectKeepAliveIntervalMs();
        case "connecttimeoutms":
        case "connectTimeoutMs": return getOrCreateConfiguration(target).getConnectTimeoutMs();
        case "databaseexcludelist":
        case "databaseExcludeList": return getOrCreateConfiguration(target).getDatabaseExcludeList();
        case "databasehistory":
        case "databaseHistory": return getOrCreateConfiguration(target).getDatabaseHistory();
        case "databasehistoryfilefilename":
        case "databaseHistoryFileFilename": return getOrCreateConfiguration(target).getDatabaseHistoryFileFilename();
        case "databasehistorykafkabootstrapservers":
        case "databaseHistoryKafkaBootstrapServers": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaBootstrapServers();
        case "databasehistorykafkarecoveryattempts":
        case "databaseHistoryKafkaRecoveryAttempts": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaRecoveryAttempts();
        case "databasehistorykafkarecoverypollintervalms":
        case "databaseHistoryKafkaRecoveryPollIntervalMs": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaRecoveryPollIntervalMs();
        case "databasehistorykafkatopic":
        case "databaseHistoryKafkaTopic": return getOrCreateConfiguration(target).getDatabaseHistoryKafkaTopic();
        case "databasehistoryskipunparseableddl":
        case "databaseHistorySkipUnparseableDdl": return getOrCreateConfiguration(target).isDatabaseHistorySkipUnparseableDdl();
        case "databasehistorystoreonlymonitoredtablesddl":
        case "databaseHistoryStoreOnlyMonitoredTablesDdl": return getOrCreateConfiguration(target).isDatabaseHistoryStoreOnlyMonitoredTablesDdl();
        case "databasehostname":
        case "databaseHostname": return getOrCreateConfiguration(target).getDatabaseHostname();
        case "databaseincludelist":
        case "databaseIncludeList": return getOrCreateConfiguration(target).getDatabaseIncludeList();
        case "databaseinitialstatements":
        case "databaseInitialStatements": return getOrCreateConfiguration(target).getDatabaseInitialStatements();
        case "databasejdbcdriver":
        case "databaseJdbcDriver": return getOrCreateConfiguration(target).getDatabaseJdbcDriver();
        case "databasepassword":
        case "databasePassword": return getOrCreateConfiguration(target).getDatabasePassword();
        case "databaseport":
        case "databasePort": return getOrCreateConfiguration(target).getDatabasePort();
        case "databaseserverid":
        case "databaseServerId": return getOrCreateConfiguration(target).getDatabaseServerId();
        case "databaseserveridoffset":
        case "databaseServerIdOffset": return getOrCreateConfiguration(target).getDatabaseServerIdOffset();
        case "databaseservername":
        case "databaseServerName": return getOrCreateConfiguration(target).getDatabaseServerName();
        case "databasesslkeystore":
        case "databaseSslKeystore": return getOrCreateConfiguration(target).getDatabaseSslKeystore();
        case "databasesslkeystorepassword":
        case "databaseSslKeystorePassword": return getOrCreateConfiguration(target).getDatabaseSslKeystorePassword();
        case "databasesslmode":
        case "databaseSslMode": return getOrCreateConfiguration(target).getDatabaseSslMode();
        case "databasessltruststore":
        case "databaseSslTruststore": return getOrCreateConfiguration(target).getDatabaseSslTruststore();
        case "databasessltruststorepassword":
        case "databaseSslTruststorePassword": return getOrCreateConfiguration(target).getDatabaseSslTruststorePassword();
        case "databaseuser":
        case "databaseUser": return getOrCreateConfiguration(target).getDatabaseUser();
        case "decimalhandlingmode":
        case "decimalHandlingMode": return getOrCreateConfiguration(target).getDecimalHandlingMode();
        case "enabletimeadjuster":
        case "enableTimeAdjuster": return getOrCreateConfiguration(target).isEnableTimeAdjuster();
        case "eventdeserializationfailurehandlingmode":
        case "eventDeserializationFailureHandlingMode": return getOrCreateConfiguration(target).getEventDeserializationFailureHandlingMode();
        case "eventprocessingfailurehandlingmode":
        case "eventProcessingFailureHandlingMode": return getOrCreateConfiguration(target).getEventProcessingFailureHandlingMode();
        case "gtidnewchannelposition":
        case "gtidNewChannelPosition": return getOrCreateConfiguration(target).getGtidNewChannelPosition();
        case "gtidsourceexcludes":
        case "gtidSourceExcludes": return getOrCreateConfiguration(target).getGtidSourceExcludes();
        case "gtidsourcefilterdmlevents":
        case "gtidSourceFilterDmlEvents": return getOrCreateConfiguration(target).isGtidSourceFilterDmlEvents();
        case "gtidsourceincludes":
        case "gtidSourceIncludes": return getOrCreateConfiguration(target).getGtidSourceIncludes();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "heartbeattopicsprefix":
        case "heartbeatTopicsPrefix": return getOrCreateConfiguration(target).getHeartbeatTopicsPrefix();
        case "includequery":
        case "includeQuery": return getOrCreateConfiguration(target).isIncludeQuery();
        case "includeschemachanges":
        case "includeSchemaChanges": return getOrCreateConfiguration(target).isIncludeSchemaChanges();
        case "inconsistentschemahandlingmode":
        case "inconsistentSchemaHandlingMode": return getOrCreateConfiguration(target).getInconsistentSchemaHandlingMode();
        case "internalkeyconverter":
        case "internalKeyConverter": return getOrCreateConfiguration(target).getInternalKeyConverter();
        case "internalvalueconverter":
        case "internalValueConverter": return getOrCreateConfiguration(target).getInternalValueConverter();
        case "maxbatchsize":
        case "maxBatchSize": return getOrCreateConfiguration(target).getMaxBatchSize();
        case "maxqueuesize":
        case "maxQueueSize": return getOrCreateConfiguration(target).getMaxQueueSize();
        case "messagekeycolumns":
        case "messageKeyColumns": return getOrCreateConfiguration(target).getMessageKeyColumns();
        case "offsetcommitpolicy":
        case "offsetCommitPolicy": return getOrCreateConfiguration(target).getOffsetCommitPolicy();
        case "offsetcommittimeoutms":
        case "offsetCommitTimeoutMs": return getOrCreateConfiguration(target).getOffsetCommitTimeoutMs();
        case "offsetflushintervalms":
        case "offsetFlushIntervalMs": return getOrCreateConfiguration(target).getOffsetFlushIntervalMs();
        case "offsetstorage":
        case "offsetStorage": return getOrCreateConfiguration(target).getOffsetStorage();
        case "offsetstoragefilename":
        case "offsetStorageFileName": return getOrCreateConfiguration(target).getOffsetStorageFileName();
        case "offsetstoragepartitions":
        case "offsetStoragePartitions": return getOrCreateConfiguration(target).getOffsetStoragePartitions();
        case "offsetstoragereplicationfactor":
        case "offsetStorageReplicationFactor": return getOrCreateConfiguration(target).getOffsetStorageReplicationFactor();
        case "offsetstoragetopic":
        case "offsetStorageTopic": return getOrCreateConfiguration(target).getOffsetStorageTopic();
        case "pollintervalms":
        case "pollIntervalMs": return getOrCreateConfiguration(target).getPollIntervalMs();
        case "skippedoperations":
        case "skippedOperations": return getOrCreateConfiguration(target).getSkippedOperations();
        case "snapshotdelayms":
        case "snapshotDelayMs": return getOrCreateConfiguration(target).getSnapshotDelayMs();
        case "snapshotfetchsize":
        case "snapshotFetchSize": return getOrCreateConfiguration(target).getSnapshotFetchSize();
        case "snapshotlockingmode":
        case "snapshotLockingMode": return getOrCreateConfiguration(target).getSnapshotLockingMode();
        case "snapshotmode":
        case "snapshotMode": return getOrCreateConfiguration(target).getSnapshotMode();
        case "snapshotnewtables":
        case "snapshotNewTables": return getOrCreateConfiguration(target).getSnapshotNewTables();
        case "snapshotselectstatementoverrides":
        case "snapshotSelectStatementOverrides": return getOrCreateConfiguration(target).getSnapshotSelectStatementOverrides();
        case "sourcestructversion":
        case "sourceStructVersion": return getOrCreateConfiguration(target).getSourceStructVersion();
        case "tableblacklist":
        case "tableBlacklist": return getOrCreateConfiguration(target).getTableBlacklist();
        case "tableexcludelist":
        case "tableExcludeList": return getOrCreateConfiguration(target).getTableExcludeList();
        case "tableignorebuiltin":
        case "tableIgnoreBuiltin": return getOrCreateConfiguration(target).isTableIgnoreBuiltin();
        case "tableincludelist":
        case "tableIncludeList": return getOrCreateConfiguration(target).getTableIncludeList();
        case "tablewhitelist":
        case "tableWhitelist": return getOrCreateConfiguration(target).getTableWhitelist();
        case "timeprecisionmode":
        case "timePrecisionMode": return getOrCreateConfiguration(target).getTimePrecisionMode();
        case "tombstonesondelete":
        case "tombstonesOnDelete": return getOrCreateConfiguration(target).isTombstonesOnDelete();
        default: return null;
        }
    }
}

