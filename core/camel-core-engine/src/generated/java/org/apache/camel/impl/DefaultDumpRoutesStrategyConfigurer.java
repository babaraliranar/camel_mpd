/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.impl;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.impl.DefaultDumpRoutesStrategy;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class DefaultDumpRoutesStrategyConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.impl.DefaultDumpRoutesStrategy target = (org.apache.camel.impl.DefaultDumpRoutesStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": target.setCamelContext(property(camelContext, org.apache.camel.CamelContext.class, value)); return true;
        case "directory":
        case "Directory": target.setDirectory(property(camelContext, java.lang.String.class, value)); return true;
        case "include":
        case "Include": target.setInclude(property(camelContext, java.lang.String.class, value)); return true;
        case "log":
        case "Log": target.setLog(property(camelContext, boolean.class, value)); return true;
        case "uriasparameters":
        case "UriAsParameters": target.setUriAsParameters(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": return org.apache.camel.CamelContext.class;
        case "directory":
        case "Directory": return java.lang.String.class;
        case "include":
        case "Include": return java.lang.String.class;
        case "log":
        case "Log": return boolean.class;
        case "uriasparameters":
        case "UriAsParameters": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.impl.DefaultDumpRoutesStrategy target = (org.apache.camel.impl.DefaultDumpRoutesStrategy) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "camelcontext":
        case "CamelContext": return target.getCamelContext();
        case "directory":
        case "Directory": return target.getDirectory();
        case "include":
        case "Include": return target.getInclude();
        case "log":
        case "Log": return target.isLog();
        case "uriasparameters":
        case "UriAsParameters": return target.isUriAsParameters();
        default: return null;
        }
    }
}

