/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.file.azure;

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
public class FilesEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = "://host/share";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    private static final Set<String> MULTI_VALUE_PREFIXES;
    static {
        Set<String> props = new HashSet<>(99);
        props.add("allowNullBody");
        props.add("antExclude");
        props.add("antFilterCaseSensitive");
        props.add("antInclude");
        props.add("autoCreate");
        props.add("backoffErrorThreshold");
        props.add("backoffIdleThreshold");
        props.add("backoffMultiplier");
        props.add("bridgeErrorHandler");
        props.add("bufferSize");
        props.add("connectTimeout");
        props.add("delay");
        props.add("delete");
        props.add("directoryName");
        props.add("disconnect");
        props.add("disconnectOnBatchComplete");
        props.add("doneFileName");
        props.add("download");
        props.add("eagerDeleteTargetFile");
        props.add("eagerMaxMessagesPerPoll");
        props.add("exceptionHandler");
        props.add("exchangePattern");
        props.add("exclude");
        props.add("excludeExt");
        props.add("exclusiveReadLockStrategy");
        props.add("fileExist");
        props.add("fileName");
        props.add("filter");
        props.add("filterDirectory");
        props.add("filterFile");
        props.add("flatten");
        props.add("greedy");
        props.add("host");
        props.add("idempotent");
        props.add("idempotentKey");
        props.add("idempotentRepository");
        props.add("ignoreFileNotFoundOrPermissionError");
        props.add("inProgressRepository");
        props.add("include");
        props.add("includeExt");
        props.add("initialDelay");
        props.add("jailStartingDirectory");
        props.add("keepLastModified");
        props.add("lazyStartProducer");
        props.add("localWorkDirectory");
        props.add("maxDepth");
        props.add("maxMessagesPerPoll");
        props.add("maximumReconnectAttempts");
        props.add("minDepth");
        props.add("move");
        props.add("moveExisting");
        props.add("moveExistingFileStrategy");
        props.add("moveFailed");
        props.add("noop");
        props.add("onCompletionExceptionHandler");
        props.add("pollStrategy");
        props.add("port");
        props.add("preMove");
        props.add("preSort");
        props.add("processStrategy");
        props.add("readLock");
        props.add("readLockCheckInterval");
        props.add("readLockDeleteOrphanLockFiles");
        props.add("readLockLoggingLevel");
        props.add("readLockMarkerFile");
        props.add("readLockMinAge");
        props.add("readLockMinLength");
        props.add("readLockRemoveOnCommit");
        props.add("readLockRemoveOnRollback");
        props.add("readLockTimeout");
        props.add("reconnectDelay");
        props.add("recursive");
        props.add("repeatCount");
        props.add("resumeDownload");
        props.add("runLoggingLevel");
        props.add("scheduledExecutorService");
        props.add("scheduler");
        props.add("schedulerProperties");
        props.add("se");
        props.add("sendEmptyMessageWhenIdle");
        props.add("shuffle");
        props.add("sig");
        props.add("sortBy");
        props.add("sorter");
        props.add("sp");
        props.add("spr");
        props.add("srt");
        props.add("ss");
        props.add("st");
        props.add("startScheduler");
        props.add("streamDownload");
        props.add("sv");
        props.add("tempFileName");
        props.add("tempPrefix");
        props.add("throwExceptionOnConnectFailed");
        props.add("timeUnit");
        props.add("timeout");
        props.add("useFixedDelay");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(9);
        secretProps.add("se");
        secretProps.add("sig");
        secretProps.add("sp");
        secretProps.add("spr");
        secretProps.add("srt");
        secretProps.add("ss");
        secretProps.add("st");
        secretProps.add("sv");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
        Set<String> prefixes = new HashSet<>(1);
        prefixes.add("scheduler.");
        MULTI_VALUE_PREFIXES = Collections.unmodifiableSet(prefixes);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "azure-files".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "host", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildPathParameter(syntax, uri, "directoryName", null, false, copy);
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

