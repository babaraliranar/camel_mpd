/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.sjms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class SjmsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "acknowledgementMode": ((SjmsEndpoint) target).setAcknowledgementMode(property(camelContext, org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class, value)); return true;
        case "bridgeErrorHandler": ((SjmsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumerCount": ((SjmsEndpoint) target).setConsumerCount(property(camelContext, int.class, value)); return true;
        case "durableSubscriptionId": ((SjmsEndpoint) target).setDurableSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": ((SjmsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "exceptionHandler": ((SjmsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangePattern": ((SjmsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "messageSelector": ((SjmsEndpoint) target).setMessageSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((SjmsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namedReplyTo": ((SjmsEndpoint) target).setNamedReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": ((SjmsEndpoint) target).setPersistent(property(camelContext, boolean.class, value)); return true;
        case "producerCount": ((SjmsEndpoint) target).setProducerCount(property(camelContext, int.class, value)); return true;
        case "ttl": ((SjmsEndpoint) target).setTtl(property(camelContext, long.class, value)); return true;
        case "allowNullBody": ((SjmsEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "prefillPool": ((SjmsEndpoint) target).setPrefillPool(property(camelContext, boolean.class, value)); return true;
        case "responseTimeOut": ((SjmsEndpoint) target).setResponseTimeOut(property(camelContext, long.class, value)); return true;
        case "asyncStartListener": ((SjmsEndpoint) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncStopListener": ((SjmsEndpoint) target).setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((SjmsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectionCount": ((SjmsEndpoint) target).setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionFactory": ((SjmsEndpoint) target).setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionResource": ((SjmsEndpoint) target).setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "destinationCreationStrategy": ((SjmsEndpoint) target).setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "exceptionListener": ((SjmsEndpoint) target).setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "headerFilterStrategy": ((SjmsEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includeAllJMSXProperties": ((SjmsEndpoint) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmsKeyFormatStrategy": ((SjmsEndpoint) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "mapJmsMessage": ((SjmsEndpoint) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messageCreatedStrategy": ((SjmsEndpoint) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "errorHandlerLoggingLevel": ((SjmsEndpoint) target).setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorHandlerLogStackTrace": ((SjmsEndpoint) target).setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((SjmsEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transactionBatchCount": ((SjmsEndpoint) target).setTransactionBatchCount(property(camelContext, int.class, value)); return true;
        case "transactionBatchTimeout": ((SjmsEndpoint) target).setTransactionBatchTimeout(property(camelContext, long.class, value)); return true;
        case "transactionCommitStrategy": ((SjmsEndpoint) target).setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
        case "sharedJMSSession": ((SjmsEndpoint) target).setSharedJMSSession(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "acknowledgementmode": ((SjmsEndpoint) target).setAcknowledgementMode(property(camelContext, org.apache.camel.component.sjms.jms.SessionAcknowledgementType.class, value)); return true;
        case "bridgeerrorhandler": ((SjmsEndpoint) target).setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "consumercount": ((SjmsEndpoint) target).setConsumerCount(property(camelContext, int.class, value)); return true;
        case "durablesubscriptionid": ((SjmsEndpoint) target).setDurableSubscriptionId(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": ((SjmsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "exceptionhandler": ((SjmsEndpoint) target).setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern": ((SjmsEndpoint) target).setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "messageselector": ((SjmsEndpoint) target).setMessageSelector(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((SjmsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "namedreplyto": ((SjmsEndpoint) target).setNamedReplyTo(property(camelContext, java.lang.String.class, value)); return true;
        case "persistent": ((SjmsEndpoint) target).setPersistent(property(camelContext, boolean.class, value)); return true;
        case "producercount": ((SjmsEndpoint) target).setProducerCount(property(camelContext, int.class, value)); return true;
        case "ttl": ((SjmsEndpoint) target).setTtl(property(camelContext, long.class, value)); return true;
        case "allownullbody": ((SjmsEndpoint) target).setAllowNullBody(property(camelContext, boolean.class, value)); return true;
        case "prefillpool": ((SjmsEndpoint) target).setPrefillPool(property(camelContext, boolean.class, value)); return true;
        case "responsetimeout": ((SjmsEndpoint) target).setResponseTimeOut(property(camelContext, long.class, value)); return true;
        case "asyncstartlistener": ((SjmsEndpoint) target).setAsyncStartListener(property(camelContext, boolean.class, value)); return true;
        case "asyncstoplistener": ((SjmsEndpoint) target).setAsyncStopListener(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((SjmsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "connectioncount": ((SjmsEndpoint) target).setConnectionCount(property(camelContext, java.lang.Integer.class, value)); return true;
        case "connectionfactory": ((SjmsEndpoint) target).setConnectionFactory(property(camelContext, javax.jms.ConnectionFactory.class, value)); return true;
        case "connectionresource": ((SjmsEndpoint) target).setConnectionResource(property(camelContext, org.apache.camel.component.sjms.jms.ConnectionResource.class, value)); return true;
        case "destinationcreationstrategy": ((SjmsEndpoint) target).setDestinationCreationStrategy(property(camelContext, org.apache.camel.component.sjms.jms.DestinationCreationStrategy.class, value)); return true;
        case "exceptionlistener": ((SjmsEndpoint) target).setExceptionListener(property(camelContext, javax.jms.ExceptionListener.class, value)); return true;
        case "headerfilterstrategy": ((SjmsEndpoint) target).setHeaderFilterStrategy(property(camelContext, org.apache.camel.spi.HeaderFilterStrategy.class, value)); return true;
        case "includealljmsxproperties": ((SjmsEndpoint) target).setIncludeAllJMSXProperties(property(camelContext, boolean.class, value)); return true;
        case "jmskeyformatstrategy": ((SjmsEndpoint) target).setJmsKeyFormatStrategy(property(camelContext, org.apache.camel.component.sjms.jms.JmsKeyFormatStrategy.class, value)); return true;
        case "mapjmsmessage": ((SjmsEndpoint) target).setMapJmsMessage(property(camelContext, boolean.class, value)); return true;
        case "messagecreatedstrategy": ((SjmsEndpoint) target).setMessageCreatedStrategy(property(camelContext, org.apache.camel.component.sjms.jms.MessageCreatedStrategy.class, value)); return true;
        case "errorhandlerlogginglevel": ((SjmsEndpoint) target).setErrorHandlerLoggingLevel(property(camelContext, org.apache.camel.LoggingLevel.class, value)); return true;
        case "errorhandlerlogstacktrace": ((SjmsEndpoint) target).setErrorHandlerLogStackTrace(property(camelContext, boolean.class, value)); return true;
        case "transacted": ((SjmsEndpoint) target).setTransacted(property(camelContext, boolean.class, value)); return true;
        case "transactionbatchcount": ((SjmsEndpoint) target).setTransactionBatchCount(property(camelContext, int.class, value)); return true;
        case "transactionbatchtimeout": ((SjmsEndpoint) target).setTransactionBatchTimeout(property(camelContext, long.class, value)); return true;
        case "transactioncommitstrategy": ((SjmsEndpoint) target).setTransactionCommitStrategy(property(camelContext, org.apache.camel.component.sjms.TransactionCommitStrategy.class, value)); return true;
        case "sharedjmssession": ((SjmsEndpoint) target).setSharedJMSSession(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

