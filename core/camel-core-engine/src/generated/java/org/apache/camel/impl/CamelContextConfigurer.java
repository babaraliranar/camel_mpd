/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.CamelContext;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class CamelContextConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.CamelContext target = (org.apache.camel.CamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "allowUseOriginalMessage": target.setAllowUseOriginalMessage(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "applicationcontextclassloader":
        case "applicationContextClassLoader": target.setApplicationContextClassLoader(property(camelContext, java.lang.ClassLoader.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "backlogtracing":
        case "backlogTracing": target.setBacklogTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "backlogtracingstandby":
        case "backlogTracingStandby": target.setBacklogTracingStandby(property(camelContext, boolean.class, value)); return true;
        case "backlogtracingtemplates":
        case "backlogTracingTemplates": target.setBacklogTracingTemplates(property(camelContext, boolean.class, value)); return true;
        case "caseinsensitiveheaders":
        case "caseInsensitiveHeaders": target.setCaseInsensitiveHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "classresolver":
        case "classResolver": target.setClassResolver(property(camelContext, org.apache.camel.spi.ClassResolver.class, value)); return true;
        case "debugstandby":
        case "debugStandby": target.setDebugStandby(property(camelContext, boolean.class, value)); return true;
        case "debugger": target.setDebugger(property(camelContext, org.apache.camel.spi.Debugger.class, value)); return true;
        case "debugging": target.setDebugging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "delayer": target.setDelayer(property(camelContext, java.lang.Long.class, value)); return true;
        case "devconsole":
        case "devConsole": target.setDevConsole(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "dumproutes":
        case "dumpRoutes": target.setDumpRoutes(property(camelContext, java.lang.String.class, value)); return true;
        case "endpointserviceregistry":
        case "endpointServiceRegistry": target.setEndpointServiceRegistry(property(camelContext, org.apache.camel.spi.EndpointServiceRegistry.class, value)); return true;
        case "executorservicemanager":
        case "executorServiceManager": target.setExecutorServiceManager(property(camelContext, org.apache.camel.spi.ExecutorServiceManager.class, value)); return true;
        case "globaloptions":
        case "globalOptions": target.setGlobalOptions(property(camelContext, java.util.Map.class, value)); return true;
        case "inflightrepository":
        case "inflightRepository": target.setInflightRepository(property(camelContext, org.apache.camel.spi.InflightRepository.class, value)); return true;
        case "injector": target.setInjector(property(camelContext, org.apache.camel.spi.Injector.class, value)); return true;
        case "loadhealthchecks":
        case "loadHealthChecks": target.setLoadHealthChecks(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "loadtypeconverters":
        case "loadTypeConverters": target.setLoadTypeConverters(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logexhaustedmessagebody":
        case "logExhaustedMessageBody": target.setLogExhaustedMessageBody(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "logmask":
        case "logMask": target.setLogMask(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "mdcloggingkeyspattern":
        case "mDCLoggingKeysPattern": target.setMDCLoggingKeysPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "managementname":
        case "managementName": target.setManagementName(property(camelContext, java.lang.String.class, value)); return true;
        case "managementnamestrategy":
        case "managementNameStrategy": target.setManagementNameStrategy(property(camelContext, org.apache.camel.spi.ManagementNameStrategy.class, value)); return true;
        case "managementstrategy":
        case "managementStrategy": target.setManagementStrategy(property(camelContext, org.apache.camel.spi.ManagementStrategy.class, value)); return true;
        case "messagehistory":
        case "messageHistory": target.setMessageHistory(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "messagehistoryfactory":
        case "messageHistoryFactory": target.setMessageHistoryFactory(property(camelContext, org.apache.camel.spi.MessageHistoryFactory.class, value)); return true;
        case "modeline": target.setModeline(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "namestrategy":
        case "nameStrategy": target.setNameStrategy(property(camelContext, org.apache.camel.spi.CamelContextNameStrategy.class, value)); return true;
        case "propertiescomponent":
        case "propertiesComponent": target.setPropertiesComponent(property(camelContext, org.apache.camel.spi.PropertiesComponent.class, value)); return true;
        case "restconfiguration":
        case "restConfiguration": target.setRestConfiguration(property(camelContext, org.apache.camel.spi.RestConfiguration.class, value)); return true;
        case "restregistry":
        case "restRegistry": target.setRestRegistry(property(camelContext, org.apache.camel.spi.RestRegistry.class, value)); return true;
        case "routecontroller":
        case "routeController": target.setRouteController(property(camelContext, org.apache.camel.spi.RouteController.class, value)); return true;
        case "runtimeendpointregistry":
        case "runtimeEndpointRegistry": target.setRuntimeEndpointRegistry(property(camelContext, org.apache.camel.spi.RuntimeEndpointRegistry.class, value)); return true;
        case "sslcontextparameters":
        case "sSLContextParameters": target.setSSLContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "shutdownroute":
        case "shutdownRoute": target.setShutdownRoute(property(camelContext, org.apache.camel.ShutdownRoute.class, value)); return true;
        case "shutdownrunningtask":
        case "shutdownRunningTask": target.setShutdownRunningTask(property(camelContext, org.apache.camel.ShutdownRunningTask.class, value)); return true;
        case "shutdownstrategy":
        case "shutdownStrategy": target.setShutdownStrategy(property(camelContext, org.apache.camel.spi.ShutdownStrategy.class, value)); return true;
        case "sourcelocationenabled":
        case "sourceLocationEnabled": target.setSourceLocationEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "startupsummarylevel":
        case "startupSummaryLevel": target.setStartupSummaryLevel(property(camelContext, org.apache.camel.StartupSummaryLevel.class, value)); return true;
        case "streamcaching":
        case "streamCaching": target.setStreamCaching(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "streamcachingstrategy":
        case "streamCachingStrategy": target.setStreamCachingStrategy(property(camelContext, org.apache.camel.spi.StreamCachingStrategy.class, value)); return true;
        case "tracer": target.setTracer(property(camelContext, org.apache.camel.spi.Tracer.class, value)); return true;
        case "tracing": target.setTracing(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "tracingloggingformat":
        case "tracingLoggingFormat": target.setTracingLoggingFormat(property(camelContext, java.lang.String.class, value)); return true;
        case "tracingpattern":
        case "tracingPattern": target.setTracingPattern(property(camelContext, java.lang.String.class, value)); return true;
        case "tracingstandby":
        case "tracingStandby": target.setTracingStandby(property(camelContext, boolean.class, value)); return true;
        case "tracingtemplates":
        case "tracingTemplates": target.setTracingTemplates(property(camelContext, boolean.class, value)); return true;
        case "typeconverterregistry":
        case "typeConverterRegistry": target.setTypeConverterRegistry(property(camelContext, org.apache.camel.spi.TypeConverterRegistry.class, value)); return true;
        case "typeconverterstatisticsenabled":
        case "typeConverterStatisticsEnabled": target.setTypeConverterStatisticsEnabled(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usebreadcrumb":
        case "useBreadcrumb": target.setUseBreadcrumb(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usedatatype":
        case "useDataType": target.setUseDataType(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "usemdclogging":
        case "useMDCLogging": target.setUseMDCLogging(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "uuidgenerator":
        case "uuidGenerator": target.setUuidGenerator(property(camelContext, org.apache.camel.spi.UuidGenerator.class, value)); return true;
        case "vaultconfiguration":
        case "vaultConfiguration": target.setVaultConfiguration(property(camelContext, org.apache.camel.vault.VaultConfiguration.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "allowUseOriginalMessage": return java.lang.Boolean.class;
        case "applicationcontextclassloader":
        case "applicationContextClassLoader": return java.lang.ClassLoader.class;
        case "autostartup":
        case "autoStartup": return java.lang.Boolean.class;
        case "autowiredenabled":
        case "autowiredEnabled": return java.lang.Boolean.class;
        case "backlogtracing":
        case "backlogTracing": return java.lang.Boolean.class;
        case "backlogtracingstandby":
        case "backlogTracingStandby": return boolean.class;
        case "backlogtracingtemplates":
        case "backlogTracingTemplates": return boolean.class;
        case "caseinsensitiveheaders":
        case "caseInsensitiveHeaders": return java.lang.Boolean.class;
        case "classresolver":
        case "classResolver": return org.apache.camel.spi.ClassResolver.class;
        case "debugstandby":
        case "debugStandby": return boolean.class;
        case "debugger": return org.apache.camel.spi.Debugger.class;
        case "debugging": return java.lang.Boolean.class;
        case "delayer": return java.lang.Long.class;
        case "devconsole":
        case "devConsole": return java.lang.Boolean.class;
        case "dumproutes":
        case "dumpRoutes": return java.lang.String.class;
        case "endpointserviceregistry":
        case "endpointServiceRegistry": return org.apache.camel.spi.EndpointServiceRegistry.class;
        case "executorservicemanager":
        case "executorServiceManager": return org.apache.camel.spi.ExecutorServiceManager.class;
        case "globaloptions":
        case "globalOptions": return java.util.Map.class;
        case "inflightrepository":
        case "inflightRepository": return org.apache.camel.spi.InflightRepository.class;
        case "injector": return org.apache.camel.spi.Injector.class;
        case "loadhealthchecks":
        case "loadHealthChecks": return java.lang.Boolean.class;
        case "loadtypeconverters":
        case "loadTypeConverters": return java.lang.Boolean.class;
        case "logexhaustedmessagebody":
        case "logExhaustedMessageBody": return java.lang.Boolean.class;
        case "logmask":
        case "logMask": return java.lang.Boolean.class;
        case "mdcloggingkeyspattern":
        case "mDCLoggingKeysPattern": return java.lang.String.class;
        case "managementname":
        case "managementName": return java.lang.String.class;
        case "managementnamestrategy":
        case "managementNameStrategy": return org.apache.camel.spi.ManagementNameStrategy.class;
        case "managementstrategy":
        case "managementStrategy": return org.apache.camel.spi.ManagementStrategy.class;
        case "messagehistory":
        case "messageHistory": return java.lang.Boolean.class;
        case "messagehistoryfactory":
        case "messageHistoryFactory": return org.apache.camel.spi.MessageHistoryFactory.class;
        case "modeline": return java.lang.Boolean.class;
        case "namestrategy":
        case "nameStrategy": return org.apache.camel.spi.CamelContextNameStrategy.class;
        case "propertiescomponent":
        case "propertiesComponent": return org.apache.camel.spi.PropertiesComponent.class;
        case "restconfiguration":
        case "restConfiguration": return org.apache.camel.spi.RestConfiguration.class;
        case "restregistry":
        case "restRegistry": return org.apache.camel.spi.RestRegistry.class;
        case "routecontroller":
        case "routeController": return org.apache.camel.spi.RouteController.class;
        case "runtimeendpointregistry":
        case "runtimeEndpointRegistry": return org.apache.camel.spi.RuntimeEndpointRegistry.class;
        case "sslcontextparameters":
        case "sSLContextParameters": return org.apache.camel.support.jsse.SSLContextParameters.class;
        case "shutdownroute":
        case "shutdownRoute": return org.apache.camel.ShutdownRoute.class;
        case "shutdownrunningtask":
        case "shutdownRunningTask": return org.apache.camel.ShutdownRunningTask.class;
        case "shutdownstrategy":
        case "shutdownStrategy": return org.apache.camel.spi.ShutdownStrategy.class;
        case "sourcelocationenabled":
        case "sourceLocationEnabled": return java.lang.Boolean.class;
        case "startupsummarylevel":
        case "startupSummaryLevel": return org.apache.camel.StartupSummaryLevel.class;
        case "streamcaching":
        case "streamCaching": return java.lang.Boolean.class;
        case "streamcachingstrategy":
        case "streamCachingStrategy": return org.apache.camel.spi.StreamCachingStrategy.class;
        case "tracer": return org.apache.camel.spi.Tracer.class;
        case "tracing": return java.lang.Boolean.class;
        case "tracingloggingformat":
        case "tracingLoggingFormat": return java.lang.String.class;
        case "tracingpattern":
        case "tracingPattern": return java.lang.String.class;
        case "tracingstandby":
        case "tracingStandby": return boolean.class;
        case "tracingtemplates":
        case "tracingTemplates": return boolean.class;
        case "typeconverterregistry":
        case "typeConverterRegistry": return org.apache.camel.spi.TypeConverterRegistry.class;
        case "typeconverterstatisticsenabled":
        case "typeConverterStatisticsEnabled": return java.lang.Boolean.class;
        case "usebreadcrumb":
        case "useBreadcrumb": return java.lang.Boolean.class;
        case "usedatatype":
        case "useDataType": return java.lang.Boolean.class;
        case "usemdclogging":
        case "useMDCLogging": return java.lang.Boolean.class;
        case "uuidgenerator":
        case "uuidGenerator": return org.apache.camel.spi.UuidGenerator.class;
        case "vaultconfiguration":
        case "vaultConfiguration": return org.apache.camel.vault.VaultConfiguration.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.CamelContext target = (org.apache.camel.CamelContext) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowuseoriginalmessage":
        case "allowUseOriginalMessage": return target.isAllowUseOriginalMessage();
        case "applicationcontextclassloader":
        case "applicationContextClassLoader": return target.getApplicationContextClassLoader();
        case "autostartup":
        case "autoStartup": return target.isAutoStartup();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "backlogtracing":
        case "backlogTracing": return target.isBacklogTracing();
        case "backlogtracingstandby":
        case "backlogTracingStandby": return target.isBacklogTracingStandby();
        case "backlogtracingtemplates":
        case "backlogTracingTemplates": return target.isBacklogTracingTemplates();
        case "caseinsensitiveheaders":
        case "caseInsensitiveHeaders": return target.isCaseInsensitiveHeaders();
        case "classresolver":
        case "classResolver": return target.getClassResolver();
        case "debugstandby":
        case "debugStandby": return target.isDebugStandby();
        case "debugger": return target.getDebugger();
        case "debugging": return target.isDebugging();
        case "delayer": return target.getDelayer();
        case "devconsole":
        case "devConsole": return target.isDevConsole();
        case "dumproutes":
        case "dumpRoutes": return target.getDumpRoutes();
        case "endpointserviceregistry":
        case "endpointServiceRegistry": return target.getEndpointServiceRegistry();
        case "executorservicemanager":
        case "executorServiceManager": return target.getExecutorServiceManager();
        case "globaloptions":
        case "globalOptions": return target.getGlobalOptions();
        case "inflightrepository":
        case "inflightRepository": return target.getInflightRepository();
        case "injector": return target.getInjector();
        case "loadhealthchecks":
        case "loadHealthChecks": return target.isLoadHealthChecks();
        case "loadtypeconverters":
        case "loadTypeConverters": return target.isLoadTypeConverters();
        case "logexhaustedmessagebody":
        case "logExhaustedMessageBody": return target.isLogExhaustedMessageBody();
        case "logmask":
        case "logMask": return target.isLogMask();
        case "mdcloggingkeyspattern":
        case "mDCLoggingKeysPattern": return target.getMDCLoggingKeysPattern();
        case "managementname":
        case "managementName": return target.getManagementName();
        case "managementnamestrategy":
        case "managementNameStrategy": return target.getManagementNameStrategy();
        case "managementstrategy":
        case "managementStrategy": return target.getManagementStrategy();
        case "messagehistory":
        case "messageHistory": return target.isMessageHistory();
        case "messagehistoryfactory":
        case "messageHistoryFactory": return target.getMessageHistoryFactory();
        case "modeline": return target.isModeline();
        case "namestrategy":
        case "nameStrategy": return target.getNameStrategy();
        case "propertiescomponent":
        case "propertiesComponent": return target.getPropertiesComponent();
        case "restconfiguration":
        case "restConfiguration": return target.getRestConfiguration();
        case "restregistry":
        case "restRegistry": return target.getRestRegistry();
        case "routecontroller":
        case "routeController": return target.getRouteController();
        case "runtimeendpointregistry":
        case "runtimeEndpointRegistry": return target.getRuntimeEndpointRegistry();
        case "sslcontextparameters":
        case "sSLContextParameters": return target.getSSLContextParameters();
        case "shutdownroute":
        case "shutdownRoute": return target.getShutdownRoute();
        case "shutdownrunningtask":
        case "shutdownRunningTask": return target.getShutdownRunningTask();
        case "shutdownstrategy":
        case "shutdownStrategy": return target.getShutdownStrategy();
        case "sourcelocationenabled":
        case "sourceLocationEnabled": return target.isSourceLocationEnabled();
        case "startupsummarylevel":
        case "startupSummaryLevel": return target.getStartupSummaryLevel();
        case "streamcaching":
        case "streamCaching": return target.isStreamCaching();
        case "streamcachingstrategy":
        case "streamCachingStrategy": return target.getStreamCachingStrategy();
        case "tracer": return target.getTracer();
        case "tracing": return target.isTracing();
        case "tracingloggingformat":
        case "tracingLoggingFormat": return target.getTracingLoggingFormat();
        case "tracingpattern":
        case "tracingPattern": return target.getTracingPattern();
        case "tracingstandby":
        case "tracingStandby": return target.isTracingStandby();
        case "tracingtemplates":
        case "tracingTemplates": return target.isTracingTemplates();
        case "typeconverterregistry":
        case "typeConverterRegistry": return target.getTypeConverterRegistry();
        case "typeconverterstatisticsenabled":
        case "typeConverterStatisticsEnabled": return target.isTypeConverterStatisticsEnabled();
        case "usebreadcrumb":
        case "useBreadcrumb": return target.isUseBreadcrumb();
        case "usedatatype":
        case "useDataType": return target.isUseDataType();
        case "usemdclogging":
        case "useMDCLogging": return target.isUseMDCLogging();
        case "uuidgenerator":
        case "uuidGenerator": return target.getUuidGenerator();
        case "vaultconfiguration":
        case "vaultConfiguration": return target.getVaultConfiguration();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "globaloptions":
        case "globalOptions": return java.lang.String.class;
        default: return null;
        }
    }
}

