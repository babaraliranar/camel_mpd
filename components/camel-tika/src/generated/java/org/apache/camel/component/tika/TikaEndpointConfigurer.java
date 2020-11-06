/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.tika;

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
public class TikaEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("operation", org.apache.camel.component.tika.TikaOperation.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("tikaConfig", org.apache.tika.config.TikaConfig.class);
        map.put("tikaConfigUri", java.lang.String.class);
        map.put("tikaParseOutputEncoding", java.lang.String.class);
        map.put("tikaParseOutputFormat", org.apache.camel.component.tika.TikaParseOutputFormat.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("synchronous", boolean.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(TikaEndpointConfigurer::clearBootstrapConfigurers);
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        TikaEndpoint target = (TikaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "tikaconfig":
        case "tikaConfig": target.getTikaConfiguration().setTikaConfig(property(camelContext, org.apache.tika.config.TikaConfig.class, value)); return true;
        case "tikaconfiguri":
        case "tikaConfigUri": target.getTikaConfiguration().setTikaConfigUri(property(camelContext, java.lang.String.class, value)); return true;
        case "tikaparseoutputencoding":
        case "tikaParseOutputEncoding": target.getTikaConfiguration().setTikaParseOutputEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "tikaparseoutputformat":
        case "tikaParseOutputFormat": target.getTikaConfiguration().setTikaParseOutputFormat(property(camelContext, org.apache.camel.component.tika.TikaParseOutputFormat.class, value)); return true;
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
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "synchronous": return boolean.class;
        case "tikaconfig":
        case "tikaConfig": return org.apache.tika.config.TikaConfig.class;
        case "tikaconfiguri":
        case "tikaConfigUri": return java.lang.String.class;
        case "tikaparseoutputencoding":
        case "tikaParseOutputEncoding": return java.lang.String.class;
        case "tikaparseoutputformat":
        case "tikaParseOutputFormat": return org.apache.camel.component.tika.TikaParseOutputFormat.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        TikaEndpoint target = (TikaEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "synchronous": return target.isSynchronous();
        case "tikaconfig":
        case "tikaConfig": return target.getTikaConfiguration().getTikaConfig();
        case "tikaconfiguri":
        case "tikaConfigUri": return target.getTikaConfiguration().getTikaConfigUri();
        case "tikaparseoutputencoding":
        case "tikaParseOutputEncoding": return target.getTikaConfiguration().getTikaParseOutputEncoding();
        case "tikaparseoutputformat":
        case "tikaParseOutputFormat": return target.getTikaConfiguration().getTikaParseOutputFormat();
        default: return null;
        }
    }
}

