/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.beanclass;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.bean.BeanEndpointConfigurer;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ClassEndpointConfigurer extends BeanEndpointConfigurer implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("beanName", java.lang.String.class);
        map.put("cache", java.lang.Boolean.class);
        map.put("method", java.lang.String.class);
        map.put("scope", org.apache.camel.BeanScope.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("parameters", java.util.Map.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(ClassEndpointConfigurer::clearBootstrapConfigurers);
    }

}

