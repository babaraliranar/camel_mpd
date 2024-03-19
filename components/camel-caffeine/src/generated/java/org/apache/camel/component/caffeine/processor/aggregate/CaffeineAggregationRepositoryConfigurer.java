/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.caffeine.processor.aggregate;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.caffeine.processor.aggregate.CaffeineAggregationRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CaffeineAggregationRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.caffeine.processor.aggregate.CaffeineAggregationRepository target = (org.apache.camel.component.caffeine.processor.aggregate.CaffeineAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "AllowSerializedHeaders": target.setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "deadletteruri":
        case "DeadLetterUri": target.setDeadLetterUri(property(camelContext, java.lang.String.class, value)); return true;
        case "maximumredeliveries":
        case "MaximumRedeliveries": target.setMaximumRedeliveries(property(camelContext, int.class, value)); return true;
        case "recoveryinterval":
        case "RecoveryInterval": target.setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "userecovery":
        case "UseRecovery": target.setUseRecovery(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "AllowSerializedHeaders": return boolean.class;
        case "deadletteruri":
        case "DeadLetterUri": return java.lang.String.class;
        case "maximumredeliveries":
        case "MaximumRedeliveries": return int.class;
        case "recoveryinterval":
        case "RecoveryInterval": return long.class;
        case "userecovery":
        case "UseRecovery": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.caffeine.processor.aggregate.CaffeineAggregationRepository target = (org.apache.camel.component.caffeine.processor.aggregate.CaffeineAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "AllowSerializedHeaders": return target.isAllowSerializedHeaders();
        case "deadletteruri":
        case "DeadLetterUri": return target.getDeadLetterUri();
        case "maximumredeliveries":
        case "MaximumRedeliveries": return target.getMaximumRedeliveries();
        case "recoveryinterval":
        case "RecoveryInterval": return target.getRecoveryInterval();
        case "userecovery":
        case "UseRecovery": return target.isUseRecovery();
        default: return null;
        }
    }
}

