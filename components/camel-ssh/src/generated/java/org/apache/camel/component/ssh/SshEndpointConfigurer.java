/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ssh;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SshEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "failOnUnknownHost": ((SshEndpoint) target).getConfiguration().setFailOnUnknownHost(property(camelContext, boolean.class, value)); return true;
        case "knownHostsResource": ((SshEndpoint) target).getConfiguration().setKnownHostsResource(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": ((SshEndpoint) target).getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "bridgeErrorHandler": ((SshEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "pollCommand": ((SshEndpoint) target).getConfiguration().setPollCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((SshEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SshEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SshEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((SshEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((SshEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SshEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channelType": ((SshEndpoint) target).getConfiguration().setChannelType(property(camelContext, java.lang.String.class, value)); return true;
        case "shellPrompt": ((SshEndpoint) target).getConfiguration().setShellPrompt(property(camelContext, java.lang.String.class, value)); return true;
        case "sleepForShellPrompt": ((SshEndpoint) target).getConfiguration().setSleepForShellPrompt(property(camelContext, long.class, value)); return true;
        case "synchronous": ((SshEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((SshEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((SshEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((SshEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SshEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SshEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((SshEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((SshEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((SshEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((SshEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SshEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((SshEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((SshEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((SshEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((SshEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "certResource": ((SshEndpoint) target).getConfiguration().setCertResource(property(camelContext, java.lang.String.class, value)); return true;
        case "certResourcePassword": ((SshEndpoint) target).getConfiguration().setCertResourcePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keyPairProvider": ((SshEndpoint) target).getConfiguration().setKeyPairProvider(property(camelContext, org.apache.sshd.common.keyprovider.KeyPairProvider.class, value)); return true;
        case "keyType": ((SshEndpoint) target).getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((SshEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((SshEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "failonunknownhost": ((SshEndpoint) target).getConfiguration().setFailOnUnknownHost(property(camelContext, boolean.class, value)); return true;
        case "knownhostsresource": ((SshEndpoint) target).getConfiguration().setKnownHostsResource(property(camelContext, java.lang.String.class, value)); return true;
        case "timeout": ((SshEndpoint) target).getConfiguration().setTimeout(property(camelContext, long.class, value)); return true;
        case "bridgeerrorhandler": ((SshEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "pollcommand": ((SshEndpoint) target).getConfiguration().setPollCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "sendemptymessagewhenidle": ((SshEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SshEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SshEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((SshEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((SshEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SshEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "channeltype": ((SshEndpoint) target).getConfiguration().setChannelType(property(camelContext, java.lang.String.class, value)); return true;
        case "shellprompt": ((SshEndpoint) target).getConfiguration().setShellPrompt(property(camelContext, java.lang.String.class, value)); return true;
        case "sleepforshellprompt": ((SshEndpoint) target).getConfiguration().setSleepForShellPrompt(property(camelContext, long.class, value)); return true;
        case "synchronous": ((SshEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((SshEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((SshEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((SshEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((SshEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((SshEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((SshEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((SshEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((SshEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((SshEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((SshEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((SshEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((SshEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((SshEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((SshEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "certresource": ((SshEndpoint) target).getConfiguration().setCertResource(property(camelContext, java.lang.String.class, value)); return true;
        case "certresourcepassword": ((SshEndpoint) target).getConfiguration().setCertResourcePassword(property(camelContext, java.lang.String.class, value)); return true;
        case "keypairprovider": ((SshEndpoint) target).getConfiguration().setKeyPairProvider(property(camelContext, org.apache.sshd.common.keyprovider.KeyPairProvider.class, value)); return true;
        case "keytype": ((SshEndpoint) target).getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "password": ((SshEndpoint) target).getConfiguration().setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "username": ((SshEndpoint) target).getConfiguration().setUsername(property(camelContext, java.lang.String.class, value)); return true;
            default: return false;
        }
    }

}

