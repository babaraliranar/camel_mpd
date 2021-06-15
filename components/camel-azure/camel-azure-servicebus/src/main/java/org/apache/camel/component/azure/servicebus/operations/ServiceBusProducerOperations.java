package org.apache.camel.component.azure.servicebus.operations;

import java.time.OffsetDateTime;
import java.util.Collections;
import java.util.List;

import com.azure.messaging.servicebus.ServiceBusMessage;
import com.azure.messaging.servicebus.ServiceBusTransactionContext;
import org.apache.camel.component.azure.servicebus.ServiceBusUtils;
import org.apache.camel.component.azure.servicebus.client.ServiceBusSenderAsyncClientWrapper;
import org.apache.camel.util.ObjectHelper;
import reactor.core.publisher.Mono;

public class ServiceBusProducerOperations {

    private final ServiceBusSenderAsyncClientWrapper client;

    public ServiceBusProducerOperations(ServiceBusSenderAsyncClientWrapper client) {
        ObjectHelper.isNotEmpty(client);

        this.client = client;
    }

    public Mono<Void> sendMessages(final Object data, final ServiceBusTransactionContext context) {
        if (data instanceof Iterable) {
            return sendMessages((Iterable<Object>) data, context);
        }

        return sendMessage(data, context);
    }

    public Mono<List<Long>> scheduleMessages(
            final Object data, final OffsetDateTime scheduledEnqueueTime, final ServiceBusTransactionContext context) {
        if (data instanceof Iterable) {
            return scheduleMessages((Iterable<Object>) data, scheduledEnqueueTime, context);
        }

        return scheduleMessage(data, scheduledEnqueueTime, context);
    }

    private Mono<Void> sendMessages(final Iterable<Object> data, final ServiceBusTransactionContext context) {
        final Iterable<ServiceBusMessage> messages = ServiceBusUtils.createServiceBusMessages(data);

        if (ObjectHelper.isEmpty(context)) {
            return client.sendMessages(messages);
        }

        return client.sendMessages(messages, context);
    }

    private Mono<Void> sendMessage(final Object data, final ServiceBusTransactionContext context) {
        final ServiceBusMessage message = ServiceBusUtils.createServiceBusMessage(data);

        if (ObjectHelper.isEmpty(context)) {
            return client.sendMessage(message);
        }

        return client.sendMessage(message, context);
    }

    private Mono<List<Long>> scheduleMessage(
            final Object data, final OffsetDateTime scheduledEnqueueTime, final ServiceBusTransactionContext context) {
        final ServiceBusMessage message = ServiceBusUtils.createServiceBusMessage(data);

        if (ObjectHelper.isEmpty(context)) {
            return client.scheduleMessage(message, scheduledEnqueueTime)
                    .map(Collections::singletonList);
        }

        return client.scheduleMessage(message, scheduledEnqueueTime, context)
                .map(Collections::singletonList);
    }

    private Mono<List<Long>> scheduleMessages(
            final Iterable<Object> data, final OffsetDateTime scheduledEnqueueTime,
            final ServiceBusTransactionContext context) {
        final Iterable<ServiceBusMessage> messages = ServiceBusUtils.createServiceBusMessages(data);

        if (ObjectHelper.isEmpty(context)) {
            return client.scheduleMessages(messages, scheduledEnqueueTime)
                    .collectList();
        }

        return client.scheduleMessages(messages, scheduledEnqueueTime, context)
                .collectList();
    }
}
