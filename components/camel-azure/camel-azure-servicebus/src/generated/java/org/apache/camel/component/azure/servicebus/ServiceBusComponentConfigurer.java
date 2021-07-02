/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.azure.servicebus;

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
public class ServiceBusComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private org.apache.camel.component.azure.servicebus.ServiceBusConfiguration getOrCreateConfiguration(ServiceBusComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.azure.servicebus.ServiceBusConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ServiceBusComponent target = (ServiceBusComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": getOrCreateConfiguration(target).setAmqpRetryOptions(property(camelContext, com.azure.core.amqp.AmqpRetryOptions.class, value)); return true;
        case "amqptransporttype":
        case "amqpTransportType": getOrCreateConfiguration(target).setAmqpTransportType(property(camelContext, com.azure.core.amqp.AmqpTransportType.class, value)); return true;
        case "autowiredenabled":
        case "autowiredEnabled": target.setAutowiredEnabled(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "clientoptions":
        case "clientOptions": getOrCreateConfiguration(target).setClientOptions(property(camelContext, com.azure.core.util.ClientOptions.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class, value)); return true;
        case "connectionstring":
        case "connectionString": getOrCreateConfiguration(target).setConnectionString(property(camelContext, java.lang.String.class, value)); return true;
        case "consumeroperation":
        case "consumerOperation": getOrCreateConfiguration(target).setConsumerOperation(property(camelContext, org.apache.camel.component.azure.servicebus.ServiceBusConsumerOperationDefinition.class, value)); return true;
        case "disableautocomplete":
        case "disableAutoComplete": getOrCreateConfiguration(target).setDisableAutoComplete(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "maxautolockrenewduration":
        case "maxAutoLockRenewDuration": getOrCreateConfiguration(target).setMaxAutoLockRenewDuration(property(camelContext, java.time.Duration.class, value)); return true;
        case "peaknummaxmessages":
        case "peakNumMaxMessages": getOrCreateConfiguration(target).setPeakNumMaxMessages(property(camelContext, java.lang.Integer.class, value)); return true;
        case "prefetchcount":
        case "prefetchCount": getOrCreateConfiguration(target).setPrefetchCount(property(camelContext, int.class, value)); return true;
        case "produceroperation":
        case "producerOperation": getOrCreateConfiguration(target).setProducerOperation(property(camelContext, org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition.class, value)); return true;
        case "proxyoptions":
        case "proxyOptions": getOrCreateConfiguration(target).setProxyOptions(property(camelContext, com.azure.core.amqp.ProxyOptions.class, value)); return true;
        case "receiverasyncclient":
        case "receiverAsyncClient": getOrCreateConfiguration(target).setReceiverAsyncClient(property(camelContext, com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class, value)); return true;
        case "scheduledenqueuetime":
        case "scheduledEnqueueTime": getOrCreateConfiguration(target).setScheduledEnqueueTime(property(camelContext, java.time.OffsetDateTime.class, value)); return true;
        case "senderasyncclient":
        case "senderAsyncClient": getOrCreateConfiguration(target).setSenderAsyncClient(property(camelContext, com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class, value)); return true;
        case "servicebusreceivemode":
        case "serviceBusReceiveMode": getOrCreateConfiguration(target).setServiceBusReceiveMode(property(camelContext, com.azure.messaging.servicebus.models.ServiceBusReceiveMode.class, value)); return true;
        case "servicebustransactioncontext":
        case "serviceBusTransactionContext": getOrCreateConfiguration(target).setServiceBusTransactionContext(property(camelContext, com.azure.messaging.servicebus.ServiceBusTransactionContext.class, value)); return true;
        case "servicebustype":
        case "serviceBusType": getOrCreateConfiguration(target).setServiceBusType(property(camelContext, org.apache.camel.component.azure.servicebus.ServiceBusType.class, value)); return true;
        case "subqueue":
        case "subQueue": getOrCreateConfiguration(target).setSubQueue(property(camelContext, com.azure.messaging.servicebus.models.SubQueue.class, value)); return true;
        case "subscriptionname":
        case "subscriptionName": getOrCreateConfiguration(target).setSubscriptionName(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"receiverAsyncClient","senderAsyncClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return com.azure.core.amqp.AmqpRetryOptions.class;
        case "amqptransporttype":
        case "amqpTransportType": return com.azure.core.amqp.AmqpTransportType.class;
        case "autowiredenabled":
        case "autowiredEnabled": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "clientoptions":
        case "clientOptions": return com.azure.core.util.ClientOptions.class;
        case "configuration": return org.apache.camel.component.azure.servicebus.ServiceBusConfiguration.class;
        case "connectionstring":
        case "connectionString": return java.lang.String.class;
        case "consumeroperation":
        case "consumerOperation": return org.apache.camel.component.azure.servicebus.ServiceBusConsumerOperationDefinition.class;
        case "disableautocomplete":
        case "disableAutoComplete": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "maxautolockrenewduration":
        case "maxAutoLockRenewDuration": return java.time.Duration.class;
        case "peaknummaxmessages":
        case "peakNumMaxMessages": return java.lang.Integer.class;
        case "prefetchcount":
        case "prefetchCount": return int.class;
        case "produceroperation":
        case "producerOperation": return org.apache.camel.component.azure.servicebus.ServiceBusProducerOperationDefinition.class;
        case "proxyoptions":
        case "proxyOptions": return com.azure.core.amqp.ProxyOptions.class;
        case "receiverasyncclient":
        case "receiverAsyncClient": return com.azure.messaging.servicebus.ServiceBusReceiverAsyncClient.class;
        case "scheduledenqueuetime":
        case "scheduledEnqueueTime": return java.time.OffsetDateTime.class;
        case "senderasyncclient":
        case "senderAsyncClient": return com.azure.messaging.servicebus.ServiceBusSenderAsyncClient.class;
        case "servicebusreceivemode":
        case "serviceBusReceiveMode": return com.azure.messaging.servicebus.models.ServiceBusReceiveMode.class;
        case "servicebustransactioncontext":
        case "serviceBusTransactionContext": return com.azure.messaging.servicebus.ServiceBusTransactionContext.class;
        case "servicebustype":
        case "serviceBusType": return org.apache.camel.component.azure.servicebus.ServiceBusType.class;
        case "subqueue":
        case "subQueue": return com.azure.messaging.servicebus.models.SubQueue.class;
        case "subscriptionname":
        case "subscriptionName": return java.lang.String.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ServiceBusComponent target = (ServiceBusComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "amqpretryoptions":
        case "amqpRetryOptions": return getOrCreateConfiguration(target).getAmqpRetryOptions();
        case "amqptransporttype":
        case "amqpTransportType": return getOrCreateConfiguration(target).getAmqpTransportType();
        case "autowiredenabled":
        case "autowiredEnabled": return target.isAutowiredEnabled();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "clientoptions":
        case "clientOptions": return getOrCreateConfiguration(target).getClientOptions();
        case "configuration": return target.getConfiguration();
        case "connectionstring":
        case "connectionString": return getOrCreateConfiguration(target).getConnectionString();
        case "consumeroperation":
        case "consumerOperation": return getOrCreateConfiguration(target).getConsumerOperation();
        case "disableautocomplete":
        case "disableAutoComplete": return getOrCreateConfiguration(target).isDisableAutoComplete();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "maxautolockrenewduration":
        case "maxAutoLockRenewDuration": return getOrCreateConfiguration(target).getMaxAutoLockRenewDuration();
        case "peaknummaxmessages":
        case "peakNumMaxMessages": return getOrCreateConfiguration(target).getPeakNumMaxMessages();
        case "prefetchcount":
        case "prefetchCount": return getOrCreateConfiguration(target).getPrefetchCount();
        case "produceroperation":
        case "producerOperation": return getOrCreateConfiguration(target).getProducerOperation();
        case "proxyoptions":
        case "proxyOptions": return getOrCreateConfiguration(target).getProxyOptions();
        case "receiverasyncclient":
        case "receiverAsyncClient": return getOrCreateConfiguration(target).getReceiverAsyncClient();
        case "scheduledenqueuetime":
        case "scheduledEnqueueTime": return getOrCreateConfiguration(target).getScheduledEnqueueTime();
        case "senderasyncclient":
        case "senderAsyncClient": return getOrCreateConfiguration(target).getSenderAsyncClient();
        case "servicebusreceivemode":
        case "serviceBusReceiveMode": return getOrCreateConfiguration(target).getServiceBusReceiveMode();
        case "servicebustransactioncontext":
        case "serviceBusTransactionContext": return getOrCreateConfiguration(target).getServiceBusTransactionContext();
        case "servicebustype":
        case "serviceBusType": return getOrCreateConfiguration(target).getServiceBusType();
        case "subqueue":
        case "subQueue": return getOrCreateConfiguration(target).getSubQueue();
        case "subscriptionname":
        case "subscriptionName": return getOrCreateConfiguration(target).getSubscriptionName();
        default: return null;
        }
    }
}

