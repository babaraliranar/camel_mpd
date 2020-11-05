/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.vertx.kafka;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class VertxKafkaComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("bootstrapServers", java.lang.String.class);
        map.put("clientDnsLookup", java.lang.String.class);
        map.put("clientId", java.lang.String.class);
        map.put("configuration", org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration.class);
        map.put("connectionsMaxIdleMs", long.class);
        map.put("interceptorClasses", java.lang.String.class);
        map.put("metadataMaxAgeMs", long.class);
        map.put("metricReporters", java.lang.String.class);
        map.put("metricsNumSamples", int.class);
        map.put("metricsRecordingLevel", java.lang.String.class);
        map.put("metricsSampleWindowMs", long.class);
        map.put("receiveBufferBytes", int.class);
        map.put("reconnectBackoffMaxMs", long.class);
        map.put("reconnectBackoffMs", long.class);
        map.put("requestTimeoutMs", int.class);
        map.put("retryBackoffMs", long.class);
        map.put("sendBufferBytes", int.class);
        map.put("allowAutoCreateTopics", boolean.class);
        map.put("autoCommitIntervalMs", int.class);
        map.put("autoOffsetReset", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("checkCrcs", boolean.class);
        map.put("clientRack", java.lang.String.class);
        map.put("defaultApiTimeoutMs", int.class);
        map.put("enableAutoCommit", boolean.class);
        map.put("excludeInternalTopics", boolean.class);
        map.put("fetchMaxBytes", int.class);
        map.put("fetchMaxWaitMs", int.class);
        map.put("fetchMinBytes", int.class);
        map.put("groupId", java.lang.String.class);
        map.put("groupInstanceId", java.lang.String.class);
        map.put("heartbeatIntervalMs", int.class);
        map.put("isolationLevel", java.lang.String.class);
        map.put("keyDeserializer", java.lang.String.class);
        map.put("maxPartitionFetchBytes", int.class);
        map.put("maxPollIntervalMs", int.class);
        map.put("maxPollRecords", int.class);
        map.put("partitionAssignmentStrategy", java.lang.String.class);
        map.put("sessionTimeoutMs", int.class);
        map.put("valueDeserializer", java.lang.String.class);
        map.put("acks", java.lang.String.class);
        map.put("batchSize", int.class);
        map.put("bufferMemory", long.class);
        map.put("compressionType", java.lang.String.class);
        map.put("deliveryTimeoutMs", int.class);
        map.put("enableIdempotence", boolean.class);
        map.put("keySerializer", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("lingerMs", long.class);
        map.put("maxBlockMs", long.class);
        map.put("maxInFlightRequestsPerConnection", int.class);
        map.put("maxRequestSize", int.class);
        map.put("metadataMaxIdleMs", long.class);
        map.put("partitionerClass", java.lang.String.class);
        map.put("retries", int.class);
        map.put("transactionalId", java.lang.String.class);
        map.put("transactionTimeoutMs", int.class);
        map.put("valueSerializer", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("saslClientCallbackHandlerClass", java.lang.String.class);
        map.put("saslJaasConfig", java.lang.String.class);
        map.put("saslKerberosKinitCmd", java.lang.String.class);
        map.put("saslKerberosMinTimeBeforeRelogin", long.class);
        map.put("saslKerberosServiceName", java.lang.String.class);
        map.put("saslKerberosTicketRenewJitter", double.class);
        map.put("saslKerberosTicketRenewWindowFactor", double.class);
        map.put("saslLoginCallbackHandlerClass", java.lang.String.class);
        map.put("saslLoginClass", java.lang.String.class);
        map.put("saslLoginRefreshBufferSeconds", short.class);
        map.put("saslLoginRefreshMinPeriodSeconds", short.class);
        map.put("saslLoginRefreshWindowFactor", double.class);
        map.put("saslLoginRefreshWindowJitter", double.class);
        map.put("saslMechanism", java.lang.String.class);
        map.put("securityProtocol", java.lang.String.class);
        map.put("securityProviders", java.lang.String.class);
        map.put("sslCipherSuites", java.lang.String.class);
        map.put("sslEnabledProtocols", java.lang.String.class);
        map.put("sslEndpointIdentificationAlgorithm", java.lang.String.class);
        map.put("sslEngineFactoryClass", java.lang.String.class);
        map.put("sslKeymanagerAlgorithm", java.lang.String.class);
        map.put("sslKeyPassword", java.lang.String.class);
        map.put("sslKeystoreLocation", java.lang.String.class);
        map.put("sslKeystorePassword", java.lang.String.class);
        map.put("sslKeystoreType", java.lang.String.class);
        map.put("sslProtocol", java.lang.String.class);
        map.put("sslProvider", java.lang.String.class);
        map.put("sslSecureRandomImplementation", java.lang.String.class);
        map.put("sslTrustmanagerAlgorithm", java.lang.String.class);
        map.put("sslTruststoreLocation", java.lang.String.class);
        map.put("sslTruststorePassword", java.lang.String.class);
        map.put("sslTruststoreType", java.lang.String.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addConfigurerClearer(VertxKafkaComponentConfigurer::clearConfigurers);
    }

    private org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration getOrCreateConfiguration(VertxKafkaComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        VertxKafkaComponent target = (VertxKafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": getOrCreateConfiguration(target).setAcks(property(camelContext, java.lang.String.class, value)); return true;
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": getOrCreateConfiguration(target).setAllowAutoCreateTopics(property(camelContext, boolean.class, value)); return true;
        case "autocommitintervalms":
        case "autoCommitIntervalMs": getOrCreateConfiguration(target).setAutoCommitIntervalMs(property(camelContext, int.class, value)); return true;
        case "autooffsetreset":
        case "autoOffsetReset": getOrCreateConfiguration(target).setAutoOffsetReset(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "batchsize":
        case "batchSize": getOrCreateConfiguration(target).setBatchSize(property(camelContext, int.class, value)); return true;
        case "bootstrapservers":
        case "bootstrapServers": getOrCreateConfiguration(target).setBootstrapServers(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "buffermemory":
        case "bufferMemory": getOrCreateConfiguration(target).setBufferMemory(property(camelContext, long.class, value)); return true;
        case "checkcrcs":
        case "checkCrcs": getOrCreateConfiguration(target).setCheckCrcs(property(camelContext, boolean.class, value)); return true;
        case "clientdnslookup":
        case "clientDnsLookup": getOrCreateConfiguration(target).setClientDnsLookup(property(camelContext, java.lang.String.class, value)); return true;
        case "clientid":
        case "clientId": getOrCreateConfiguration(target).setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientrack":
        case "clientRack": getOrCreateConfiguration(target).setClientRack(property(camelContext, java.lang.String.class, value)); return true;
        case "compressiontype":
        case "compressionType": getOrCreateConfiguration(target).setCompressionType(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.vertx.kafka.configuration.VertxKafkaConfiguration.class, value)); return true;
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": getOrCreateConfiguration(target).setConnectionsMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": getOrCreateConfiguration(target).setDefaultApiTimeoutMs(property(camelContext, int.class, value)); return true;
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": getOrCreateConfiguration(target).setDeliveryTimeoutMs(property(camelContext, int.class, value)); return true;
        case "enableautocommit":
        case "enableAutoCommit": getOrCreateConfiguration(target).setEnableAutoCommit(property(camelContext, boolean.class, value)); return true;
        case "enableidempotence":
        case "enableIdempotence": getOrCreateConfiguration(target).setEnableIdempotence(property(camelContext, boolean.class, value)); return true;
        case "excludeinternaltopics":
        case "excludeInternalTopics": getOrCreateConfiguration(target).setExcludeInternalTopics(property(camelContext, boolean.class, value)); return true;
        case "fetchmaxbytes":
        case "fetchMaxBytes": getOrCreateConfiguration(target).setFetchMaxBytes(property(camelContext, int.class, value)); return true;
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": getOrCreateConfiguration(target).setFetchMaxWaitMs(property(camelContext, int.class, value)); return true;
        case "fetchminbytes":
        case "fetchMinBytes": getOrCreateConfiguration(target).setFetchMinBytes(property(camelContext, int.class, value)); return true;
        case "groupid":
        case "groupId": getOrCreateConfiguration(target).setGroupId(property(camelContext, java.lang.String.class, value)); return true;
        case "groupinstanceid":
        case "groupInstanceId": getOrCreateConfiguration(target).setGroupInstanceId(property(camelContext, java.lang.String.class, value)); return true;
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": getOrCreateConfiguration(target).setHeartbeatIntervalMs(property(camelContext, int.class, value)); return true;
        case "interceptorclasses":
        case "interceptorClasses": getOrCreateConfiguration(target).setInterceptorClasses(property(camelContext, java.lang.String.class, value)); return true;
        case "isolationlevel":
        case "isolationLevel": getOrCreateConfiguration(target).setIsolationLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "keydeserializer":
        case "keyDeserializer": getOrCreateConfiguration(target).setKeyDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "keyserializer":
        case "keySerializer": getOrCreateConfiguration(target).setKeySerializer(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "lingerms":
        case "lingerMs": getOrCreateConfiguration(target).setLingerMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxblockms":
        case "maxBlockMs": getOrCreateConfiguration(target).setMaxBlockMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": getOrCreateConfiguration(target).setMaxInFlightRequestsPerConnection(property(camelContext, int.class, value)); return true;
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": getOrCreateConfiguration(target).setMaxPartitionFetchBytes(property(camelContext, int.class, value)); return true;
        case "maxpollintervalms":
        case "maxPollIntervalMs": getOrCreateConfiguration(target).setMaxPollIntervalMs(property(camelContext, int.class, value)); return true;
        case "maxpollrecords":
        case "maxPollRecords": getOrCreateConfiguration(target).setMaxPollRecords(property(camelContext, int.class, value)); return true;
        case "maxrequestsize":
        case "maxRequestSize": getOrCreateConfiguration(target).setMaxRequestSize(property(camelContext, int.class, value)); return true;
        case "metadatamaxagems":
        case "metadataMaxAgeMs": getOrCreateConfiguration(target).setMetadataMaxAgeMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": getOrCreateConfiguration(target).setMetadataMaxIdleMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "metricreporters":
        case "metricReporters": getOrCreateConfiguration(target).setMetricReporters(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsnumsamples":
        case "metricsNumSamples": getOrCreateConfiguration(target).setMetricsNumSamples(property(camelContext, int.class, value)); return true;
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": getOrCreateConfiguration(target).setMetricsRecordingLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": getOrCreateConfiguration(target).setMetricsSampleWindowMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": getOrCreateConfiguration(target).setPartitionAssignmentStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "partitionerclass":
        case "partitionerClass": getOrCreateConfiguration(target).setPartitionerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "receivebufferbytes":
        case "receiveBufferBytes": getOrCreateConfiguration(target).setReceiveBufferBytes(property(camelContext, int.class, value)); return true;
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": getOrCreateConfiguration(target).setReconnectBackoffMaxMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "reconnectbackoffms":
        case "reconnectBackoffMs": getOrCreateConfiguration(target).setReconnectBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "requesttimeoutms":
        case "requestTimeoutMs": getOrCreateConfiguration(target).setRequestTimeoutMs(property(camelContext, int.class, value)); return true;
        case "retries": getOrCreateConfiguration(target).setRetries(property(camelContext, int.class, value)); return true;
        case "retrybackoffms":
        case "retryBackoffMs": getOrCreateConfiguration(target).setRetryBackoffMs(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": getOrCreateConfiguration(target).setSaslClientCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sasljaasconfig":
        case "saslJaasConfig": getOrCreateConfiguration(target).setSaslJaasConfig(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": getOrCreateConfiguration(target).setSaslKerberosKinitCmd(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": getOrCreateConfiguration(target).setSaslKerberosMinTimeBeforeRelogin(property(camelContext, long.class, value)); return true;
        case "saslkerberosservicename":
        case "saslKerberosServiceName": getOrCreateConfiguration(target).setSaslKerberosServiceName(property(camelContext, java.lang.String.class, value)); return true;
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": getOrCreateConfiguration(target).setSaslKerberosTicketRenewJitter(property(camelContext, double.class, value)); return true;
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": getOrCreateConfiguration(target).setSaslKerberosTicketRenewWindowFactor(property(camelContext, double.class, value)); return true;
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": getOrCreateConfiguration(target).setSaslLoginCallbackHandlerClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginclass":
        case "saslLoginClass": getOrCreateConfiguration(target).setSaslLoginClass(property(camelContext, java.lang.String.class, value)); return true;
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": getOrCreateConfiguration(target).setSaslLoginRefreshBufferSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": getOrCreateConfiguration(target).setSaslLoginRefreshMinPeriodSeconds(property(camelContext, short.class, value)); return true;
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": getOrCreateConfiguration(target).setSaslLoginRefreshWindowFactor(property(camelContext, double.class, value)); return true;
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": getOrCreateConfiguration(target).setSaslLoginRefreshWindowJitter(property(camelContext, double.class, value)); return true;
        case "saslmechanism":
        case "saslMechanism": getOrCreateConfiguration(target).setSaslMechanism(property(camelContext, java.lang.String.class, value)); return true;
        case "securityprotocol":
        case "securityProtocol": getOrCreateConfiguration(target).setSecurityProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "securityproviders":
        case "securityProviders": getOrCreateConfiguration(target).setSecurityProviders(property(camelContext, java.lang.String.class, value)); return true;
        case "sendbufferbytes":
        case "sendBufferBytes": getOrCreateConfiguration(target).setSendBufferBytes(property(camelContext, int.class, value)); return true;
        case "sessiontimeoutms":
        case "sessionTimeoutMs": getOrCreateConfiguration(target).setSessionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "sslciphersuites":
        case "sslCipherSuites": getOrCreateConfiguration(target).setSslCipherSuites(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenabledprotocols":
        case "sslEnabledProtocols": getOrCreateConfiguration(target).setSslEnabledProtocols(property(camelContext, java.lang.String.class, value)); return true;
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": getOrCreateConfiguration(target).setSslEndpointIdentificationAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": getOrCreateConfiguration(target).setSslEngineFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeypassword":
        case "sslKeyPassword": getOrCreateConfiguration(target).setSslKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": getOrCreateConfiguration(target).setSslKeymanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorelocation":
        case "sslKeystoreLocation": getOrCreateConfiguration(target).setSslKeystoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystorepassword":
        case "sslKeystorePassword": getOrCreateConfiguration(target).setSslKeystorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "sslkeystoretype":
        case "sslKeystoreType": getOrCreateConfiguration(target).setSslKeystoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprotocol":
        case "sslProtocol": getOrCreateConfiguration(target).setSslProtocol(property(camelContext, java.lang.String.class, value)); return true;
        case "sslprovider":
        case "sslProvider": getOrCreateConfiguration(target).setSslProvider(property(camelContext, java.lang.String.class, value)); return true;
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": getOrCreateConfiguration(target).setSslSecureRandomImplementation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": getOrCreateConfiguration(target).setSslTrustmanagerAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorelocation":
        case "sslTruststoreLocation": getOrCreateConfiguration(target).setSslTruststoreLocation(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststorepassword":
        case "sslTruststorePassword": getOrCreateConfiguration(target).setSslTruststorePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "ssltruststoretype":
        case "sslTruststoreType": getOrCreateConfiguration(target).setSslTruststoreType(property(camelContext, java.lang.String.class, value)); return true;
        case "transactiontimeoutms":
        case "transactionTimeoutMs": getOrCreateConfiguration(target).setTransactionTimeoutMs(property(camelContext, int.class, value)); return true;
        case "transactionalid":
        case "transactionalId": getOrCreateConfiguration(target).setTransactionalId(property(camelContext, java.lang.String.class, value)); return true;
        case "valuedeserializer":
        case "valueDeserializer": getOrCreateConfiguration(target).setValueDeserializer(property(camelContext, java.lang.String.class, value)); return true;
        case "valueserializer":
        case "valueSerializer": getOrCreateConfiguration(target).setValueSerializer(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
    }

    public static void clearConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        VertxKafkaComponent target = (VertxKafkaComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "acks": return getOrCreateConfiguration(target).getAcks();
        case "allowautocreatetopics":
        case "allowAutoCreateTopics": return getOrCreateConfiguration(target).isAllowAutoCreateTopics();
        case "autocommitintervalms":
        case "autoCommitIntervalMs": return getOrCreateConfiguration(target).getAutoCommitIntervalMs();
        case "autooffsetreset":
        case "autoOffsetReset": return getOrCreateConfiguration(target).getAutoOffsetReset();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "batchsize":
        case "batchSize": return getOrCreateConfiguration(target).getBatchSize();
        case "bootstrapservers":
        case "bootstrapServers": return getOrCreateConfiguration(target).getBootstrapServers();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "buffermemory":
        case "bufferMemory": return getOrCreateConfiguration(target).getBufferMemory();
        case "checkcrcs":
        case "checkCrcs": return getOrCreateConfiguration(target).isCheckCrcs();
        case "clientdnslookup":
        case "clientDnsLookup": return getOrCreateConfiguration(target).getClientDnsLookup();
        case "clientid":
        case "clientId": return getOrCreateConfiguration(target).getClientId();
        case "clientrack":
        case "clientRack": return getOrCreateConfiguration(target).getClientRack();
        case "compressiontype":
        case "compressionType": return getOrCreateConfiguration(target).getCompressionType();
        case "configuration": return target.getConfiguration();
        case "connectionsmaxidlems":
        case "connectionsMaxIdleMs": return getOrCreateConfiguration(target).getConnectionsMaxIdleMs();
        case "defaultapitimeoutms":
        case "defaultApiTimeoutMs": return getOrCreateConfiguration(target).getDefaultApiTimeoutMs();
        case "deliverytimeoutms":
        case "deliveryTimeoutMs": return getOrCreateConfiguration(target).getDeliveryTimeoutMs();
        case "enableautocommit":
        case "enableAutoCommit": return getOrCreateConfiguration(target).isEnableAutoCommit();
        case "enableidempotence":
        case "enableIdempotence": return getOrCreateConfiguration(target).isEnableIdempotence();
        case "excludeinternaltopics":
        case "excludeInternalTopics": return getOrCreateConfiguration(target).isExcludeInternalTopics();
        case "fetchmaxbytes":
        case "fetchMaxBytes": return getOrCreateConfiguration(target).getFetchMaxBytes();
        case "fetchmaxwaitms":
        case "fetchMaxWaitMs": return getOrCreateConfiguration(target).getFetchMaxWaitMs();
        case "fetchminbytes":
        case "fetchMinBytes": return getOrCreateConfiguration(target).getFetchMinBytes();
        case "groupid":
        case "groupId": return getOrCreateConfiguration(target).getGroupId();
        case "groupinstanceid":
        case "groupInstanceId": return getOrCreateConfiguration(target).getGroupInstanceId();
        case "heartbeatintervalms":
        case "heartbeatIntervalMs": return getOrCreateConfiguration(target).getHeartbeatIntervalMs();
        case "interceptorclasses":
        case "interceptorClasses": return getOrCreateConfiguration(target).getInterceptorClasses();
        case "isolationlevel":
        case "isolationLevel": return getOrCreateConfiguration(target).getIsolationLevel();
        case "keydeserializer":
        case "keyDeserializer": return getOrCreateConfiguration(target).getKeyDeserializer();
        case "keyserializer":
        case "keySerializer": return getOrCreateConfiguration(target).getKeySerializer();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "lingerms":
        case "lingerMs": return getOrCreateConfiguration(target).getLingerMs();
        case "maxblockms":
        case "maxBlockMs": return getOrCreateConfiguration(target).getMaxBlockMs();
        case "maxinflightrequestsperconnection":
        case "maxInFlightRequestsPerConnection": return getOrCreateConfiguration(target).getMaxInFlightRequestsPerConnection();
        case "maxpartitionfetchbytes":
        case "maxPartitionFetchBytes": return getOrCreateConfiguration(target).getMaxPartitionFetchBytes();
        case "maxpollintervalms":
        case "maxPollIntervalMs": return getOrCreateConfiguration(target).getMaxPollIntervalMs();
        case "maxpollrecords":
        case "maxPollRecords": return getOrCreateConfiguration(target).getMaxPollRecords();
        case "maxrequestsize":
        case "maxRequestSize": return getOrCreateConfiguration(target).getMaxRequestSize();
        case "metadatamaxagems":
        case "metadataMaxAgeMs": return getOrCreateConfiguration(target).getMetadataMaxAgeMs();
        case "metadatamaxidlems":
        case "metadataMaxIdleMs": return getOrCreateConfiguration(target).getMetadataMaxIdleMs();
        case "metricreporters":
        case "metricReporters": return getOrCreateConfiguration(target).getMetricReporters();
        case "metricsnumsamples":
        case "metricsNumSamples": return getOrCreateConfiguration(target).getMetricsNumSamples();
        case "metricsrecordinglevel":
        case "metricsRecordingLevel": return getOrCreateConfiguration(target).getMetricsRecordingLevel();
        case "metricssamplewindowms":
        case "metricsSampleWindowMs": return getOrCreateConfiguration(target).getMetricsSampleWindowMs();
        case "partitionassignmentstrategy":
        case "partitionAssignmentStrategy": return getOrCreateConfiguration(target).getPartitionAssignmentStrategy();
        case "partitionerclass":
        case "partitionerClass": return getOrCreateConfiguration(target).getPartitionerClass();
        case "receivebufferbytes":
        case "receiveBufferBytes": return getOrCreateConfiguration(target).getReceiveBufferBytes();
        case "reconnectbackoffmaxms":
        case "reconnectBackoffMaxMs": return getOrCreateConfiguration(target).getReconnectBackoffMaxMs();
        case "reconnectbackoffms":
        case "reconnectBackoffMs": return getOrCreateConfiguration(target).getReconnectBackoffMs();
        case "requesttimeoutms":
        case "requestTimeoutMs": return getOrCreateConfiguration(target).getRequestTimeoutMs();
        case "retries": return getOrCreateConfiguration(target).getRetries();
        case "retrybackoffms":
        case "retryBackoffMs": return getOrCreateConfiguration(target).getRetryBackoffMs();
        case "saslclientcallbackhandlerclass":
        case "saslClientCallbackHandlerClass": return getOrCreateConfiguration(target).getSaslClientCallbackHandlerClass();
        case "sasljaasconfig":
        case "saslJaasConfig": return getOrCreateConfiguration(target).getSaslJaasConfig();
        case "saslkerberoskinitcmd":
        case "saslKerberosKinitCmd": return getOrCreateConfiguration(target).getSaslKerberosKinitCmd();
        case "saslkerberosmintimebeforerelogin":
        case "saslKerberosMinTimeBeforeRelogin": return getOrCreateConfiguration(target).getSaslKerberosMinTimeBeforeRelogin();
        case "saslkerberosservicename":
        case "saslKerberosServiceName": return getOrCreateConfiguration(target).getSaslKerberosServiceName();
        case "saslkerberosticketrenewjitter":
        case "saslKerberosTicketRenewJitter": return getOrCreateConfiguration(target).getSaslKerberosTicketRenewJitter();
        case "saslkerberosticketrenewwindowfactor":
        case "saslKerberosTicketRenewWindowFactor": return getOrCreateConfiguration(target).getSaslKerberosTicketRenewWindowFactor();
        case "sasllogincallbackhandlerclass":
        case "saslLoginCallbackHandlerClass": return getOrCreateConfiguration(target).getSaslLoginCallbackHandlerClass();
        case "saslloginclass":
        case "saslLoginClass": return getOrCreateConfiguration(target).getSaslLoginClass();
        case "saslloginrefreshbufferseconds":
        case "saslLoginRefreshBufferSeconds": return getOrCreateConfiguration(target).getSaslLoginRefreshBufferSeconds();
        case "saslloginrefreshminperiodseconds":
        case "saslLoginRefreshMinPeriodSeconds": return getOrCreateConfiguration(target).getSaslLoginRefreshMinPeriodSeconds();
        case "saslloginrefreshwindowfactor":
        case "saslLoginRefreshWindowFactor": return getOrCreateConfiguration(target).getSaslLoginRefreshWindowFactor();
        case "saslloginrefreshwindowjitter":
        case "saslLoginRefreshWindowJitter": return getOrCreateConfiguration(target).getSaslLoginRefreshWindowJitter();
        case "saslmechanism":
        case "saslMechanism": return getOrCreateConfiguration(target).getSaslMechanism();
        case "securityprotocol":
        case "securityProtocol": return getOrCreateConfiguration(target).getSecurityProtocol();
        case "securityproviders":
        case "securityProviders": return getOrCreateConfiguration(target).getSecurityProviders();
        case "sendbufferbytes":
        case "sendBufferBytes": return getOrCreateConfiguration(target).getSendBufferBytes();
        case "sessiontimeoutms":
        case "sessionTimeoutMs": return getOrCreateConfiguration(target).getSessionTimeoutMs();
        case "sslciphersuites":
        case "sslCipherSuites": return getOrCreateConfiguration(target).getSslCipherSuites();
        case "sslenabledprotocols":
        case "sslEnabledProtocols": return getOrCreateConfiguration(target).getSslEnabledProtocols();
        case "sslendpointidentificationalgorithm":
        case "sslEndpointIdentificationAlgorithm": return getOrCreateConfiguration(target).getSslEndpointIdentificationAlgorithm();
        case "sslenginefactoryclass":
        case "sslEngineFactoryClass": return getOrCreateConfiguration(target).getSslEngineFactoryClass();
        case "sslkeypassword":
        case "sslKeyPassword": return getOrCreateConfiguration(target).getSslKeyPassword();
        case "sslkeymanageralgorithm":
        case "sslKeymanagerAlgorithm": return getOrCreateConfiguration(target).getSslKeymanagerAlgorithm();
        case "sslkeystorelocation":
        case "sslKeystoreLocation": return getOrCreateConfiguration(target).getSslKeystoreLocation();
        case "sslkeystorepassword":
        case "sslKeystorePassword": return getOrCreateConfiguration(target).getSslKeystorePassword();
        case "sslkeystoretype":
        case "sslKeystoreType": return getOrCreateConfiguration(target).getSslKeystoreType();
        case "sslprotocol":
        case "sslProtocol": return getOrCreateConfiguration(target).getSslProtocol();
        case "sslprovider":
        case "sslProvider": return getOrCreateConfiguration(target).getSslProvider();
        case "sslsecurerandomimplementation":
        case "sslSecureRandomImplementation": return getOrCreateConfiguration(target).getSslSecureRandomImplementation();
        case "ssltrustmanageralgorithm":
        case "sslTrustmanagerAlgorithm": return getOrCreateConfiguration(target).getSslTrustmanagerAlgorithm();
        case "ssltruststorelocation":
        case "sslTruststoreLocation": return getOrCreateConfiguration(target).getSslTruststoreLocation();
        case "ssltruststorepassword":
        case "sslTruststorePassword": return getOrCreateConfiguration(target).getSslTruststorePassword();
        case "ssltruststoretype":
        case "sslTruststoreType": return getOrCreateConfiguration(target).getSslTruststoreType();
        case "transactiontimeoutms":
        case "transactionTimeoutMs": return getOrCreateConfiguration(target).getTransactionTimeoutMs();
        case "transactionalid":
        case "transactionalId": return getOrCreateConfiguration(target).getTransactionalId();
        case "valuedeserializer":
        case "valueDeserializer": return getOrCreateConfiguration(target).getValueDeserializer();
        case "valueserializer":
        case "valueSerializer": return getOrCreateConfiguration(target).getValueSerializer();
        default: return null;
        }
    }
}

