/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.beanstalk;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BeanstalkEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        if (ignoreCase) {
            return doConfigureIgnoreCase(camelContext, target, name, value);
        } else {
            return doConfigure(camelContext, target, name, value);
        }
    }

    private static boolean doConfigure(CamelContext camelContext, Object target, String name, Object value) {
        switch (name) {
        case "command": ((BeanstalkEndpoint) target).setCommand(property(camelContext, org.apache.camel.component.beanstalk.BeanstalkCommand.class, value)); return true;
        case "jobDelay": ((BeanstalkEndpoint) target).setJobDelay(property(camelContext, int.class, value)); return true;
        case "jobPriority": ((BeanstalkEndpoint) target).setJobPriority(property(camelContext, long.class, value)); return true;
        case "jobTimeToRun": ((BeanstalkEndpoint) target).setJobTimeToRun(property(camelContext, int.class, value)); return true;
        case "awaitJob": ((BeanstalkEndpoint) target).setAwaitJob(property(camelContext, boolean.class, value)); return true;
        case "bridgeErrorHandler": ((BeanstalkEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "onFailure": ((BeanstalkEndpoint) target).setOnFailure(property(camelContext, org.apache.camel.component.beanstalk.BeanstalkCommand.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((BeanstalkEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "useBlockIO": ((BeanstalkEndpoint) target).setUseBlockIO(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((BeanstalkEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((BeanstalkEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((BeanstalkEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((BeanstalkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((BeanstalkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((BeanstalkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((BeanstalkEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((BeanstalkEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((BeanstalkEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((BeanstalkEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((BeanstalkEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((BeanstalkEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((BeanstalkEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((BeanstalkEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((BeanstalkEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((BeanstalkEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((BeanstalkEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((BeanstalkEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((BeanstalkEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((BeanstalkEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "command": ((BeanstalkEndpoint) target).setCommand(property(camelContext, org.apache.camel.component.beanstalk.BeanstalkCommand.class, value)); return true;
        case "jobdelay": ((BeanstalkEndpoint) target).setJobDelay(property(camelContext, int.class, value)); return true;
        case "jobpriority": ((BeanstalkEndpoint) target).setJobPriority(property(camelContext, long.class, value)); return true;
        case "jobtimetorun": ((BeanstalkEndpoint) target).setJobTimeToRun(property(camelContext, int.class, value)); return true;
        case "awaitjob": ((BeanstalkEndpoint) target).setAwaitJob(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler": ((BeanstalkEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "onfailure": ((BeanstalkEndpoint) target).setOnFailure(property(camelContext, org.apache.camel.component.beanstalk.BeanstalkCommand.class, value)); return true;
        case "sendemptymessagewhenidle": ((BeanstalkEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "useblockio": ((BeanstalkEndpoint) target).setUseBlockIO(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((BeanstalkEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((BeanstalkEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((BeanstalkEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((BeanstalkEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((BeanstalkEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((BeanstalkEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((BeanstalkEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((BeanstalkEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((BeanstalkEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((BeanstalkEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((BeanstalkEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((BeanstalkEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((BeanstalkEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((BeanstalkEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((BeanstalkEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((BeanstalkEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((BeanstalkEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((BeanstalkEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((BeanstalkEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((BeanstalkEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

