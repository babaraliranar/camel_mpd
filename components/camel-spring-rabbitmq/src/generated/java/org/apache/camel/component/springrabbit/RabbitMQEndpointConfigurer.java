/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.springrabbit;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class RabbitMQEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        RabbitMQEndpoint target = (RabbitMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "args": target.setArgs(property(camelContext, java.util.Map.class, value)); return true;
        case "asyncconsumer":
        case "asyncConsumer": target.setAsyncConsumer(property(camelContext, boolean.class, value)); return true;
        case "autodeclare":
        case "autoDeclare": target.setAutoDeclare(property(camelContext, boolean.class, value)); return true;
        case "autostartup":
        case "autoStartup": target.setAutoStartup(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "connectionfactory":
        case "connectionFactory": target.setConnectionFactory(property(camelContext, org.springframework.amqp.rabbit.connection.ConnectionFactory.class, value)); return true;
        case "deadletterexchange":
        case "deadLetterExchange": target.setDeadLetterExchange(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": target.setDeadLetterExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterqueue":
        case "deadLetterQueue": target.setDeadLetterQueue(property(camelContext, java.lang.String.class, value)); return true;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": target.setDeadLetterRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "exchangetype":
        case "exchangeType": target.setExchangeType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "messageconverter":
        case "messageConverter": target.setMessageConverter(property(camelContext, org.springframework.amqp.support.converter.MessageConverter.class, value)); return true;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": target.setMessagePropertiesConverter(property(camelContext, org.apache.camel.component.springrabbit.MessagePropertiesConverter.class, value)); return true;
        case "queues": target.setQueues(property(camelContext, java.lang.String.class, value)); return true;
        case "routingkey":
        case "routingKey": target.setRoutingKey(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": target.setTestConnectionOnStartup(property(camelContext, boolean.class, value)); return true;
        case "transacted": target.setTransacted(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "args": return java.util.Map.class;
        case "asyncconsumer":
        case "asyncConsumer": return boolean.class;
        case "autodeclare":
        case "autoDeclare": return boolean.class;
        case "autostartup":
        case "autoStartup": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "connectionfactory":
        case "connectionFactory": return org.springframework.amqp.rabbit.connection.ConnectionFactory.class;
        case "deadletterexchange":
        case "deadLetterExchange": return java.lang.String.class;
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return java.lang.String.class;
        case "deadletterqueue":
        case "deadLetterQueue": return java.lang.String.class;
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return java.lang.String.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "exchangetype":
        case "exchangeType": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "messageconverter":
        case "messageConverter": return org.springframework.amqp.support.converter.MessageConverter.class;
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return org.apache.camel.component.springrabbit.MessagePropertiesConverter.class;
        case "queues": return java.lang.String.class;
        case "routingkey":
        case "routingKey": return java.lang.String.class;
        case "synchronous": return boolean.class;
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return boolean.class;
        case "transacted": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        RabbitMQEndpoint target = (RabbitMQEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "args": return target.getArgs();
        case "asyncconsumer":
        case "asyncConsumer": return target.isAsyncConsumer();
        case "autodeclare":
        case "autoDeclare": return target.isAutoDeclare();
        case "autostartup":
        case "autoStartup": return target.isAutoStartup();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "connectionfactory":
        case "connectionFactory": return target.getConnectionFactory();
        case "deadletterexchange":
        case "deadLetterExchange": return target.getDeadLetterExchange();
        case "deadletterexchangetype":
        case "deadLetterExchangeType": return target.getDeadLetterExchangeType();
        case "deadletterqueue":
        case "deadLetterQueue": return target.getDeadLetterQueue();
        case "deadletterroutingkey":
        case "deadLetterRoutingKey": return target.getDeadLetterRoutingKey();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "exchangetype":
        case "exchangeType": return target.getExchangeType();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "messageconverter":
        case "messageConverter": return target.getMessageConverter();
        case "messagepropertiesconverter":
        case "messagePropertiesConverter": return target.getMessagePropertiesConverter();
        case "queues": return target.getQueues();
        case "routingkey":
        case "routingKey": return target.getRoutingKey();
        case "synchronous": return target.isSynchronous();
        case "testconnectiononstartup":
        case "testConnectionOnStartup": return target.isTestConnectionOnStartup();
        case "transacted": return target.isTransacted();
        default: return null;
        }
    }

    @Override
    public Object getCollectionValueType(Object target, String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "args": return java.lang.Object.class;
        default: return null;
        }
    }
}

