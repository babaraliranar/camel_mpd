/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.disruptor;

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
public class DisruptorEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        DisruptorEndpoint target = (DisruptorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": target.setBlockWhenFull(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "concurrentconsumers":
        case "concurrentConsumers": target.setConcurrentConsumers(property(camelContext, int.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "multipleconsumers":
        case "multipleConsumers": target.setMultipleConsumers(property(camelContext, boolean.class, value)); return true;
        case "producertype":
        case "producerType": target.setProducerType(property(camelContext, org.apache.camel.component.disruptor.DisruptorProducerType.class, value)); return true;
        case "size": target.setSize(property(camelContext, int.class, value)); return true;
        case "timeout": target.setTimeout(property(camelContext, java.time.Duration.class, value).toMillis()); return true;
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": target.setWaitForTaskToComplete(property(camelContext, org.apache.camel.WaitForTaskToComplete.class, value)); return true;
        case "waitstrategy":
        case "waitStrategy": target.setWaitStrategy(property(camelContext, org.apache.camel.component.disruptor.DisruptorWaitStrategy.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "concurrentconsumers":
        case "concurrentConsumers": return int.class;
        case "exceptionhandler":
        case "exceptionHandler": return org.apache.camel.spi.ExceptionHandler.class;
        case "exchangepattern":
        case "exchangePattern": return org.apache.camel.ExchangePattern.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "multipleconsumers":
        case "multipleConsumers": return boolean.class;
        case "producertype":
        case "producerType": return org.apache.camel.component.disruptor.DisruptorProducerType.class;
        case "size": return int.class;
        case "timeout": return long.class;
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": return org.apache.camel.WaitForTaskToComplete.class;
        case "waitstrategy":
        case "waitStrategy": return org.apache.camel.component.disruptor.DisruptorWaitStrategy.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        DisruptorEndpoint target = (DisruptorEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "blockwhenfull":
        case "blockWhenFull": return target.isBlockWhenFull();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "concurrentconsumers":
        case "concurrentConsumers": return target.getConcurrentConsumers();
        case "exceptionhandler":
        case "exceptionHandler": return target.getExceptionHandler();
        case "exchangepattern":
        case "exchangePattern": return target.getExchangePattern();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "multipleconsumers":
        case "multipleConsumers": return target.isMultipleConsumers();
        case "producertype":
        case "producerType": return target.getProducerType();
        case "size": return target.getSize();
        case "timeout": return target.getTimeout();
        case "waitfortasktocomplete":
        case "waitForTaskToComplete": return target.getWaitForTaskToComplete();
        case "waitstrategy":
        case "waitStrategy": return target.getWaitStrategy();
        default: return null;
        }
    }
}

