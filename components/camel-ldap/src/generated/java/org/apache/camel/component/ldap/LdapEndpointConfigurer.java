/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ldap;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class LdapEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("dirContextName", java.lang.String.class);
        map.put("base", java.lang.String.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("pageSize", java.lang.Integer.class);
        map.put("returnedAttributes", java.lang.String.class);
        map.put("scope", java.lang.String.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(LdapEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        LdapEndpoint target = (LdapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "base": target.setBase(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "pagesize":
        case "pageSize": target.setPageSize(property(camelContext, java.lang.Integer.class, value)); return true;
        case "returnedattributes":
        case "returnedAttributes": target.setReturnedAttributes(property(camelContext, java.lang.String.class, value)); return true;
        case "scope": target.setScope(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    public static void clearBootstrapConfigurers() {
        ALL_OPTIONS.clear();
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "base": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "pagesize":
        case "pageSize": return java.lang.Integer.class;
        case "returnedattributes":
        case "returnedAttributes": return java.lang.String.class;
        case "scope": return java.lang.String.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        LdapEndpoint target = (LdapEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "base": return target.getBase();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "pagesize":
        case "pageSize": return target.getPageSize();
        case "returnedattributes":
        case "returnedAttributes": return target.getReturnedAttributes();
        case "scope": return target.getScope();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

