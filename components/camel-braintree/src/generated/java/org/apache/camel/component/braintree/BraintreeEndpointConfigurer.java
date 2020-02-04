/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.braintree;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BraintreeEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "environment": ((BraintreeEndpoint) target).getConfiguration().setEnvironment(property(camelContext, java.lang.String.class, value)); return true;
        case "inBody": ((BraintreeEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "merchantId": ((BraintreeEndpoint) target).getConfiguration().setMerchantId(property(camelContext, java.lang.String.class, value)); return true;
        case "privateKey": ((BraintreeEndpoint) target).getConfiguration().setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "publicKey": ((BraintreeEndpoint) target).getConfiguration().setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeErrorHandler": ((BraintreeEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendEmptyMessageWhenIdle": ((BraintreeEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((BraintreeEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((BraintreeEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollStrategy": ((BraintreeEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazyStartProducer": ((BraintreeEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "accessToken": ((BraintreeEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((BraintreeEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpReadTimeout": ((BraintreeEndpoint) target).getConfiguration().setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((BraintreeEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "httpLogLevel": ((BraintreeEndpoint) target).getConfiguration().setHttpLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "logHandlerEnabled": ((BraintreeEndpoint) target).getConfiguration().setLogHandlerEnabled(property(camelContext, boolean.class, value)); return true;
        case "backoffErrorThreshold": ((BraintreeEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffIdleThreshold": ((BraintreeEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffMultiplier": ((BraintreeEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((BraintreeEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((BraintreeEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialDelay": ((BraintreeEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatCount": ((BraintreeEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runLoggingLevel": ((BraintreeEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledExecutorService": ((BraintreeEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((BraintreeEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerProperties": ((BraintreeEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startScheduler": ((BraintreeEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeUnit": ((BraintreeEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "useFixedDelay": ((BraintreeEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "proxyHost": ((BraintreeEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyPort": ((BraintreeEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "environment": ((BraintreeEndpoint) target).getConfiguration().setEnvironment(property(camelContext, java.lang.String.class, value)); return true;
        case "inbody": ((BraintreeEndpoint) target).setInBody(property(camelContext, java.lang.String.class, value)); return true;
        case "merchantid": ((BraintreeEndpoint) target).getConfiguration().setMerchantId(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey": ((BraintreeEndpoint) target).getConfiguration().setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "publickey": ((BraintreeEndpoint) target).getConfiguration().setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bridgeerrorhandler": ((BraintreeEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "sendemptymessagewhenidle": ((BraintreeEndpoint) target).setSendEmptyMessageWhenIdle(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((BraintreeEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((BraintreeEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "pollstrategy": ((BraintreeEndpoint) target).setPollStrategy(property(camelContext, org.apache.camel.spi.PollingConsumerPollStrategy.class, value)); return true;
        case "lazystartproducer": ((BraintreeEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "accesstoken": ((BraintreeEndpoint) target).getConfiguration().setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((BraintreeEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "httpreadtimeout": ((BraintreeEndpoint) target).getConfiguration().setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "synchronous": ((BraintreeEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "httploglevel": ((BraintreeEndpoint) target).getConfiguration().setHttpLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "loghandlerenabled": ((BraintreeEndpoint) target).getConfiguration().setLogHandlerEnabled(property(camelContext, boolean.class, value)); return true;
        case "backofferrorthreshold": ((BraintreeEndpoint) target).setBackoffErrorThreshold(property(camelContext, int.class, value)); return true;
        case "backoffidlethreshold": ((BraintreeEndpoint) target).setBackoffIdleThreshold(property(camelContext, int.class, value)); return true;
        case "backoffmultiplier": ((BraintreeEndpoint) target).setBackoffMultiplier(property(camelContext, int.class, value)); return true;
        case "delay": ((BraintreeEndpoint) target).setDelay(property(camelContext, long.class, value)); return true;
        case "greedy": ((BraintreeEndpoint) target).setGreedy(property(camelContext, boolean.class, value)); return true;
        case "initialdelay": ((BraintreeEndpoint) target).setInitialDelay(property(camelContext, long.class, value)); return true;
        case "repeatcount": ((BraintreeEndpoint) target).setRepeatCount(property(camelContext, long.class, value)); return true;
        case "runlogginglevel": ((BraintreeEndpoint) target).setRunLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "scheduledexecutorservice": ((BraintreeEndpoint) target).setScheduledExecutorService(property(camelContext, java.util.concurrent.ScheduledExecutorService.class, value)); return true;
        case "scheduler": ((BraintreeEndpoint) target).setScheduler(property(camelContext, java.lang.String.class, value)); return true;
        case "schedulerproperties": ((BraintreeEndpoint) target).setSchedulerProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "startscheduler": ((BraintreeEndpoint) target).setStartScheduler(property(camelContext, boolean.class, value)); return true;
        case "timeunit": ((BraintreeEndpoint) target).setTimeUnit(property(camelContext, java.util.concurrent.TimeUnit.class, value)); return true;
        case "usefixeddelay": ((BraintreeEndpoint) target).setUseFixedDelay(property(camelContext, boolean.class, value)); return true;
        case "proxyhost": ((BraintreeEndpoint) target).getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport": ((BraintreeEndpoint) target).getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
            default: return false;
        }
    }

}

