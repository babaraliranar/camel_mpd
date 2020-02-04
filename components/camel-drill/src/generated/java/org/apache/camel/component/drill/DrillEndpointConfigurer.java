/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.drill;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DrillEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "clusterId": ((DrillEndpoint) target).setClusterId(property(camelContext, java.lang.String.class, value)); return true;
        case "directory": ((DrillEndpoint) target).setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "lazyStartProducer": ((DrillEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mode": ((DrillEndpoint) target).setMode(property(camelContext, org.apache.camel.component.drill.DrillConnectionMode.class, value)); return true;
        case "port": ((DrillEndpoint) target).setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "basicPropertyBinding": ((DrillEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DrillEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "clusterid": ((DrillEndpoint) target).setClusterId(property(camelContext, java.lang.String.class, value)); return true;
        case "directory": ((DrillEndpoint) target).setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer": ((DrillEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "mode": ((DrillEndpoint) target).setMode(property(camelContext, org.apache.camel.component.drill.DrillConnectionMode.class, value)); return true;
        case "port": ((DrillEndpoint) target).setPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "basicpropertybinding": ((DrillEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((DrillEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

