/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xslt;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class XsltComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "uriResolverFactory": ((XsltComponent) target).setUriResolverFactory(property(camelContext, org.apache.camel.component.xslt.XsltUriResolverFactory.class, value)); return true;
        case "uriResolver": ((XsltComponent) target).setUriResolver(property(camelContext, javax.xml.transform.URIResolver.class, value)); return true;
        case "contentCache": ((XsltComponent) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "transformerFactoryConfigurationStrategy": ((XsltComponent) target).setTransformerFactoryConfigurationStrategy(property(camelContext, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class, value)); return true;
        case "transformerFactoryClass": ((XsltComponent) target).setTransformerFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "basicPropertyBinding": ((XsltComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazyStartProducer": ((XsltComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "uriresolverfactory": ((XsltComponent) target).setUriResolverFactory(property(camelContext, org.apache.camel.component.xslt.XsltUriResolverFactory.class, value)); return true;
        case "uriresolver": ((XsltComponent) target).setUriResolver(property(camelContext, javax.xml.transform.URIResolver.class, value)); return true;
        case "contentcache": ((XsltComponent) target).setContentCache(property(camelContext, boolean.class, value)); return true;
        case "transformerfactoryconfigurationstrategy": ((XsltComponent) target).setTransformerFactoryConfigurationStrategy(property(camelContext, org.apache.camel.component.xslt.TransformerFactoryConfigurationStrategy.class, value)); return true;
        case "transformerfactoryclass": ((XsltComponent) target).setTransformerFactoryClass(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding": ((XsltComponent) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer": ((XsltComponent) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

