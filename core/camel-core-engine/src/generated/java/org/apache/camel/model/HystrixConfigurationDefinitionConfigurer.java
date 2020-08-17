/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.model;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.model.HystrixConfigurationDefinition;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class HystrixConfigurationDefinitionConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.model.HystrixConfigurationDefinition target = (org.apache.camel.model.HystrixConfigurationDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmaximumsizetodivergefromcoresize":
        case "AllowMaximumSizeToDivergeFromCoreSize": target.setAllowMaximumSizeToDivergeFromCoreSize(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakerenabled":
        case "CircuitBreakerEnabled": target.setCircuitBreakerEnabled(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakererrorthresholdpercentage":
        case "CircuitBreakerErrorThresholdPercentage": target.setCircuitBreakerErrorThresholdPercentage(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakerforceclosed":
        case "CircuitBreakerForceClosed": target.setCircuitBreakerForceClosed(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakerforceopen":
        case "CircuitBreakerForceOpen": target.setCircuitBreakerForceOpen(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakerrequestvolumethreshold":
        case "CircuitBreakerRequestVolumeThreshold": target.setCircuitBreakerRequestVolumeThreshold(property(camelContext, java.lang.String.class, value)); return true;
        case "circuitbreakersleepwindowinmilliseconds":
        case "CircuitBreakerSleepWindowInMilliseconds": target.setCircuitBreakerSleepWindowInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        case "corepoolsize":
        case "CorePoolSize": target.setCorePoolSize(property(camelContext, java.lang.String.class, value)); return true;
        case "executionisolationsemaphoremaxconcurrentrequests":
        case "ExecutionIsolationSemaphoreMaxConcurrentRequests": target.setExecutionIsolationSemaphoreMaxConcurrentRequests(property(camelContext, java.lang.String.class, value)); return true;
        case "executionisolationstrategy":
        case "ExecutionIsolationStrategy": target.setExecutionIsolationStrategy(property(camelContext, java.lang.String.class, value)); return true;
        case "executionisolationthreadinterruptontimeout":
        case "ExecutionIsolationThreadInterruptOnTimeout": target.setExecutionIsolationThreadInterruptOnTimeout(property(camelContext, java.lang.String.class, value)); return true;
        case "executiontimeoutenabled":
        case "ExecutionTimeoutEnabled": target.setExecutionTimeoutEnabled(property(camelContext, java.lang.String.class, value)); return true;
        case "executiontimeoutinmilliseconds":
        case "ExecutionTimeoutInMilliseconds": target.setExecutionTimeoutInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        case "fallbackenabled":
        case "FallbackEnabled": target.setFallbackEnabled(property(camelContext, java.lang.String.class, value)); return true;
        case "fallbackisolationsemaphoremaxconcurrentrequests":
        case "FallbackIsolationSemaphoreMaxConcurrentRequests": target.setFallbackIsolationSemaphoreMaxConcurrentRequests(property(camelContext, java.lang.String.class, value)); return true;
        case "groupkey":
        case "GroupKey": target.setGroupKey(property(camelContext, java.lang.String.class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "keepalivetime":
        case "KeepAliveTime": target.setKeepAliveTime(property(camelContext, java.lang.String.class, value)); return true;
        case "maxqueuesize":
        case "MaxQueueSize": target.setMaxQueueSize(property(camelContext, java.lang.String.class, value)); return true;
        case "maximumsize":
        case "MaximumSize": target.setMaximumSize(property(camelContext, java.lang.String.class, value)); return true;
        case "metricshealthsnapshotintervalinmilliseconds":
        case "MetricsHealthSnapshotIntervalInMilliseconds": target.setMetricsHealthSnapshotIntervalInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingpercentilebucketsize":
        case "MetricsRollingPercentileBucketSize": target.setMetricsRollingPercentileBucketSize(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingpercentileenabled":
        case "MetricsRollingPercentileEnabled": target.setMetricsRollingPercentileEnabled(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingpercentilewindowbuckets":
        case "MetricsRollingPercentileWindowBuckets": target.setMetricsRollingPercentileWindowBuckets(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingpercentilewindowinmilliseconds":
        case "MetricsRollingPercentileWindowInMilliseconds": target.setMetricsRollingPercentileWindowInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingstatisticalwindowbuckets":
        case "MetricsRollingStatisticalWindowBuckets": target.setMetricsRollingStatisticalWindowBuckets(property(camelContext, java.lang.String.class, value)); return true;
        case "metricsrollingstatisticalwindowinmilliseconds":
        case "MetricsRollingStatisticalWindowInMilliseconds": target.setMetricsRollingStatisticalWindowInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        case "queuesizerejectionthreshold":
        case "QueueSizeRejectionThreshold": target.setQueueSizeRejectionThreshold(property(camelContext, java.lang.String.class, value)); return true;
        case "requestlogenabled":
        case "RequestLogEnabled": target.setRequestLogEnabled(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolkey":
        case "ThreadPoolKey": target.setThreadPoolKey(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolrollingnumberstatisticalwindowbuckets":
        case "ThreadPoolRollingNumberStatisticalWindowBuckets": target.setThreadPoolRollingNumberStatisticalWindowBuckets(property(camelContext, java.lang.String.class, value)); return true;
        case "threadpoolrollingnumberstatisticalwindowinmilliseconds":
        case "ThreadPoolRollingNumberStatisticalWindowInMilliseconds": target.setThreadPoolRollingNumberStatisticalWindowInMilliseconds(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("AllowMaximumSizeToDivergeFromCoreSize", java.lang.String.class);
        answer.put("CircuitBreakerEnabled", java.lang.String.class);
        answer.put("CircuitBreakerErrorThresholdPercentage", java.lang.String.class);
        answer.put("CircuitBreakerForceClosed", java.lang.String.class);
        answer.put("CircuitBreakerForceOpen", java.lang.String.class);
        answer.put("CircuitBreakerRequestVolumeThreshold", java.lang.String.class);
        answer.put("CircuitBreakerSleepWindowInMilliseconds", java.lang.String.class);
        answer.put("CorePoolSize", java.lang.String.class);
        answer.put("ExecutionIsolationSemaphoreMaxConcurrentRequests", java.lang.String.class);
        answer.put("ExecutionIsolationStrategy", java.lang.String.class);
        answer.put("ExecutionIsolationThreadInterruptOnTimeout", java.lang.String.class);
        answer.put("ExecutionTimeoutEnabled", java.lang.String.class);
        answer.put("ExecutionTimeoutInMilliseconds", java.lang.String.class);
        answer.put("FallbackEnabled", java.lang.String.class);
        answer.put("FallbackIsolationSemaphoreMaxConcurrentRequests", java.lang.String.class);
        answer.put("GroupKey", java.lang.String.class);
        answer.put("Id", java.lang.String.class);
        answer.put("KeepAliveTime", java.lang.String.class);
        answer.put("MaxQueueSize", java.lang.String.class);
        answer.put("MaximumSize", java.lang.String.class);
        answer.put("MetricsHealthSnapshotIntervalInMilliseconds", java.lang.String.class);
        answer.put("MetricsRollingPercentileBucketSize", java.lang.String.class);
        answer.put("MetricsRollingPercentileEnabled", java.lang.String.class);
        answer.put("MetricsRollingPercentileWindowBuckets", java.lang.String.class);
        answer.put("MetricsRollingPercentileWindowInMilliseconds", java.lang.String.class);
        answer.put("MetricsRollingStatisticalWindowBuckets", java.lang.String.class);
        answer.put("MetricsRollingStatisticalWindowInMilliseconds", java.lang.String.class);
        answer.put("QueueSizeRejectionThreshold", java.lang.String.class);
        answer.put("RequestLogEnabled", java.lang.String.class);
        answer.put("ThreadPoolKey", java.lang.String.class);
        answer.put("ThreadPoolRollingNumberStatisticalWindowBuckets", java.lang.String.class);
        answer.put("ThreadPoolRollingNumberStatisticalWindowInMilliseconds", java.lang.String.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.model.HystrixConfigurationDefinition target = (org.apache.camel.model.HystrixConfigurationDefinition) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowmaximumsizetodivergefromcoresize":
        case "AllowMaximumSizeToDivergeFromCoreSize": return target.getAllowMaximumSizeToDivergeFromCoreSize();
        case "circuitbreakerenabled":
        case "CircuitBreakerEnabled": return target.getCircuitBreakerEnabled();
        case "circuitbreakererrorthresholdpercentage":
        case "CircuitBreakerErrorThresholdPercentage": return target.getCircuitBreakerErrorThresholdPercentage();
        case "circuitbreakerforceclosed":
        case "CircuitBreakerForceClosed": return target.getCircuitBreakerForceClosed();
        case "circuitbreakerforceopen":
        case "CircuitBreakerForceOpen": return target.getCircuitBreakerForceOpen();
        case "circuitbreakerrequestvolumethreshold":
        case "CircuitBreakerRequestVolumeThreshold": return target.getCircuitBreakerRequestVolumeThreshold();
        case "circuitbreakersleepwindowinmilliseconds":
        case "CircuitBreakerSleepWindowInMilliseconds": return target.getCircuitBreakerSleepWindowInMilliseconds();
        case "corepoolsize":
        case "CorePoolSize": return target.getCorePoolSize();
        case "executionisolationsemaphoremaxconcurrentrequests":
        case "ExecutionIsolationSemaphoreMaxConcurrentRequests": return target.getExecutionIsolationSemaphoreMaxConcurrentRequests();
        case "executionisolationstrategy":
        case "ExecutionIsolationStrategy": return target.getExecutionIsolationStrategy();
        case "executionisolationthreadinterruptontimeout":
        case "ExecutionIsolationThreadInterruptOnTimeout": return target.getExecutionIsolationThreadInterruptOnTimeout();
        case "executiontimeoutenabled":
        case "ExecutionTimeoutEnabled": return target.getExecutionTimeoutEnabled();
        case "executiontimeoutinmilliseconds":
        case "ExecutionTimeoutInMilliseconds": return target.getExecutionTimeoutInMilliseconds();
        case "fallbackenabled":
        case "FallbackEnabled": return target.getFallbackEnabled();
        case "fallbackisolationsemaphoremaxconcurrentrequests":
        case "FallbackIsolationSemaphoreMaxConcurrentRequests": return target.getFallbackIsolationSemaphoreMaxConcurrentRequests();
        case "groupkey":
        case "GroupKey": return target.getGroupKey();
        case "id":
        case "Id": return target.getId();
        case "keepalivetime":
        case "KeepAliveTime": return target.getKeepAliveTime();
        case "maxqueuesize":
        case "MaxQueueSize": return target.getMaxQueueSize();
        case "maximumsize":
        case "MaximumSize": return target.getMaximumSize();
        case "metricshealthsnapshotintervalinmilliseconds":
        case "MetricsHealthSnapshotIntervalInMilliseconds": return target.getMetricsHealthSnapshotIntervalInMilliseconds();
        case "metricsrollingpercentilebucketsize":
        case "MetricsRollingPercentileBucketSize": return target.getMetricsRollingPercentileBucketSize();
        case "metricsrollingpercentileenabled":
        case "MetricsRollingPercentileEnabled": return target.getMetricsRollingPercentileEnabled();
        case "metricsrollingpercentilewindowbuckets":
        case "MetricsRollingPercentileWindowBuckets": return target.getMetricsRollingPercentileWindowBuckets();
        case "metricsrollingpercentilewindowinmilliseconds":
        case "MetricsRollingPercentileWindowInMilliseconds": return target.getMetricsRollingPercentileWindowInMilliseconds();
        case "metricsrollingstatisticalwindowbuckets":
        case "MetricsRollingStatisticalWindowBuckets": return target.getMetricsRollingStatisticalWindowBuckets();
        case "metricsrollingstatisticalwindowinmilliseconds":
        case "MetricsRollingStatisticalWindowInMilliseconds": return target.getMetricsRollingStatisticalWindowInMilliseconds();
        case "queuesizerejectionthreshold":
        case "QueueSizeRejectionThreshold": return target.getQueueSizeRejectionThreshold();
        case "requestlogenabled":
        case "RequestLogEnabled": return target.getRequestLogEnabled();
        case "threadpoolkey":
        case "ThreadPoolKey": return target.getThreadPoolKey();
        case "threadpoolrollingnumberstatisticalwindowbuckets":
        case "ThreadPoolRollingNumberStatisticalWindowBuckets": return target.getThreadPoolRollingNumberStatisticalWindowBuckets();
        case "threadpoolrollingnumberstatisticalwindowinmilliseconds":
        case "ThreadPoolRollingNumberStatisticalWindowInMilliseconds": return target.getThreadPoolRollingNumberStatisticalWindowInMilliseconds();
        default: return null;
        }
    }

    @Override
    public Object getOptionNestedType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        default: return null;
        }
    }
}

