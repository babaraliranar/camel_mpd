/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.xmlsecurity;

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
public class XmlSignerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("addKeyInfoReference", java.lang.Boolean.class);
        map.put("baseUri", java.lang.String.class);
        map.put("canonicalizationMethod", javax.xml.crypto.AlgorithmMethod.class);
        map.put("clearHeaders", java.lang.Boolean.class);
        map.put("contentObjectId", java.lang.String.class);
        map.put("contentReferenceType", java.lang.String.class);
        map.put("contentReferenceUri", java.lang.String.class);
        map.put("cryptoContextProperties", java.util.Map.class);
        map.put("digestAlgorithm", java.lang.String.class);
        map.put("disallowDoctypeDecl", java.lang.Boolean.class);
        map.put("keyAccessor", org.apache.camel.component.xmlsecurity.api.KeyAccessor.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("omitXmlDeclaration", java.lang.Boolean.class);
        map.put("outputXmlEncoding", java.lang.String.class);
        map.put("parentLocalName", java.lang.String.class);
        map.put("parentNamespace", java.lang.String.class);
        map.put("parentXpath", javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class);
        map.put("plainText", java.lang.Boolean.class);
        map.put("plainTextEncoding", java.lang.String.class);
        map.put("prefixForXmlSignatureNamespace", java.lang.String.class);
        map.put("properties", org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class);
        map.put("schemaResourceUri", java.lang.String.class);
        map.put("signatureAlgorithm", java.lang.String.class);
        map.put("signatureId", java.lang.String.class);
        map.put("transformMethods", java.util.List.class);
        map.put("xpathsToIdAttributes", java.util.List.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("signerConfiguration", org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class);
        map.put("uriDereferencer", javax.xml.crypto.URIDereferencer.class);
        ALL_OPTIONS = map;
        ConfigurerStrategy.addBootstrapConfigurerClearer(XmlSignerComponentConfigurer::clearBootstrapConfigurers);
    }

    private org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration getOrCreateSignerConfiguration(XmlSignerComponent target) {
        if (target.getSignerConfiguration() == null) {
            target.setSignerConfiguration(new org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration());
        }
        return target.getSignerConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        XmlSignerComponent target = (XmlSignerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addkeyinforeference":
        case "addKeyInfoReference": getOrCreateSignerConfiguration(target).setAddKeyInfoReference(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "baseuri":
        case "baseUri": getOrCreateSignerConfiguration(target).setBaseUri(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "canonicalizationmethod":
        case "canonicalizationMethod": getOrCreateSignerConfiguration(target).setCanonicalizationMethod(property(camelContext, javax.xml.crypto.AlgorithmMethod.class, value)); return true;
        case "clearheaders":
        case "clearHeaders": getOrCreateSignerConfiguration(target).setClearHeaders(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "contentobjectid":
        case "contentObjectId": getOrCreateSignerConfiguration(target).setContentObjectId(property(camelContext, java.lang.String.class, value)); return true;
        case "contentreferencetype":
        case "contentReferenceType": getOrCreateSignerConfiguration(target).setContentReferenceType(property(camelContext, java.lang.String.class, value)); return true;
        case "contentreferenceuri":
        case "contentReferenceUri": getOrCreateSignerConfiguration(target).setContentReferenceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "cryptocontextproperties":
        case "cryptoContextProperties": getOrCreateSignerConfiguration(target).setCryptoContextProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "digestalgorithm":
        case "digestAlgorithm": getOrCreateSignerConfiguration(target).setDigestAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": getOrCreateSignerConfiguration(target).setDisallowDoctypeDecl(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "keyaccessor":
        case "keyAccessor": getOrCreateSignerConfiguration(target).setKeyAccessor(property(camelContext, org.apache.camel.component.xmlsecurity.api.KeyAccessor.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": getOrCreateSignerConfiguration(target).setOmitXmlDeclaration(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "outputxmlencoding":
        case "outputXmlEncoding": getOrCreateSignerConfiguration(target).setOutputXmlEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "parentlocalname":
        case "parentLocalName": getOrCreateSignerConfiguration(target).setParentLocalName(property(camelContext, java.lang.String.class, value)); return true;
        case "parentnamespace":
        case "parentNamespace": getOrCreateSignerConfiguration(target).setParentNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "parentxpath":
        case "parentXpath": getOrCreateSignerConfiguration(target).setParentXpath(property(camelContext, javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class, value)); return true;
        case "plaintext":
        case "plainText": getOrCreateSignerConfiguration(target).setPlainText(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "plaintextencoding":
        case "plainTextEncoding": getOrCreateSignerConfiguration(target).setPlainTextEncoding(property(camelContext, java.lang.String.class, value)); return true;
        case "prefixforxmlsignaturenamespace":
        case "prefixForXmlSignatureNamespace": getOrCreateSignerConfiguration(target).setPrefixForXmlSignatureNamespace(property(camelContext, java.lang.String.class, value)); return true;
        case "properties": getOrCreateSignerConfiguration(target).setProperties(property(camelContext, org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class, value)); return true;
        case "schemaresourceuri":
        case "schemaResourceUri": getOrCreateSignerConfiguration(target).setSchemaResourceUri(property(camelContext, java.lang.String.class, value)); return true;
        case "signaturealgorithm":
        case "signatureAlgorithm": getOrCreateSignerConfiguration(target).setSignatureAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "signatureid":
        case "signatureId": getOrCreateSignerConfiguration(target).setSignatureId(property(camelContext, java.lang.String.class, value)); return true;
        case "signerconfiguration":
        case "signerConfiguration": target.setSignerConfiguration(property(camelContext, org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class, value)); return true;
        case "transformmethods":
        case "transformMethods": getOrCreateSignerConfiguration(target).setTransformMethods(property(camelContext, java.util.List.class, value)); return true;
        case "uridereferencer":
        case "uriDereferencer": getOrCreateSignerConfiguration(target).setUriDereferencer(property(camelContext, javax.xml.crypto.URIDereferencer.class, value)); return true;
        case "xpathstoidattributes":
        case "xpathsToIdAttributes": getOrCreateSignerConfiguration(target).setXpathsToIdAttributes(property(camelContext, java.util.List.class, value)); return true;
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
        case "addkeyinforeference":
        case "addKeyInfoReference": return java.lang.Boolean.class;
        case "baseuri":
        case "baseUri": return java.lang.String.class;
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "canonicalizationmethod":
        case "canonicalizationMethod": return javax.xml.crypto.AlgorithmMethod.class;
        case "clearheaders":
        case "clearHeaders": return java.lang.Boolean.class;
        case "contentobjectid":
        case "contentObjectId": return java.lang.String.class;
        case "contentreferencetype":
        case "contentReferenceType": return java.lang.String.class;
        case "contentreferenceuri":
        case "contentReferenceUri": return java.lang.String.class;
        case "cryptocontextproperties":
        case "cryptoContextProperties": return java.util.Map.class;
        case "digestalgorithm":
        case "digestAlgorithm": return java.lang.String.class;
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return java.lang.Boolean.class;
        case "keyaccessor":
        case "keyAccessor": return org.apache.camel.component.xmlsecurity.api.KeyAccessor.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return java.lang.Boolean.class;
        case "outputxmlencoding":
        case "outputXmlEncoding": return java.lang.String.class;
        case "parentlocalname":
        case "parentLocalName": return java.lang.String.class;
        case "parentnamespace":
        case "parentNamespace": return java.lang.String.class;
        case "parentxpath":
        case "parentXpath": return javax.xml.crypto.dsig.spec.XPathFilterParameterSpec.class;
        case "plaintext":
        case "plainText": return java.lang.Boolean.class;
        case "plaintextencoding":
        case "plainTextEncoding": return java.lang.String.class;
        case "prefixforxmlsignaturenamespace":
        case "prefixForXmlSignatureNamespace": return java.lang.String.class;
        case "properties": return org.apache.camel.component.xmlsecurity.api.XmlSignatureProperties.class;
        case "schemaresourceuri":
        case "schemaResourceUri": return java.lang.String.class;
        case "signaturealgorithm":
        case "signatureAlgorithm": return java.lang.String.class;
        case "signatureid":
        case "signatureId": return java.lang.String.class;
        case "signerconfiguration":
        case "signerConfiguration": return org.apache.camel.component.xmlsecurity.processor.XmlSignerConfiguration.class;
        case "transformmethods":
        case "transformMethods": return java.util.List.class;
        case "uridereferencer":
        case "uriDereferencer": return javax.xml.crypto.URIDereferencer.class;
        case "xpathstoidattributes":
        case "xpathsToIdAttributes": return java.util.List.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        XmlSignerComponent target = (XmlSignerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "addkeyinforeference":
        case "addKeyInfoReference": return getOrCreateSignerConfiguration(target).getAddKeyInfoReference();
        case "baseuri":
        case "baseUri": return getOrCreateSignerConfiguration(target).getBaseUri();
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "canonicalizationmethod":
        case "canonicalizationMethod": return getOrCreateSignerConfiguration(target).getCanonicalizationMethod();
        case "clearheaders":
        case "clearHeaders": return getOrCreateSignerConfiguration(target).getClearHeaders();
        case "contentobjectid":
        case "contentObjectId": return getOrCreateSignerConfiguration(target).getContentObjectId();
        case "contentreferencetype":
        case "contentReferenceType": return getOrCreateSignerConfiguration(target).getContentReferenceType();
        case "contentreferenceuri":
        case "contentReferenceUri": return getOrCreateSignerConfiguration(target).getContentReferenceUri();
        case "cryptocontextproperties":
        case "cryptoContextProperties": return getOrCreateSignerConfiguration(target).getCryptoContextProperties();
        case "digestalgorithm":
        case "digestAlgorithm": return getOrCreateSignerConfiguration(target).getDigestAlgorithm();
        case "disallowdoctypedecl":
        case "disallowDoctypeDecl": return getOrCreateSignerConfiguration(target).getDisallowDoctypeDecl();
        case "keyaccessor":
        case "keyAccessor": return getOrCreateSignerConfiguration(target).getKeyAccessor();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "omitxmldeclaration":
        case "omitXmlDeclaration": return getOrCreateSignerConfiguration(target).getOmitXmlDeclaration();
        case "outputxmlencoding":
        case "outputXmlEncoding": return getOrCreateSignerConfiguration(target).getOutputXmlEncoding();
        case "parentlocalname":
        case "parentLocalName": return getOrCreateSignerConfiguration(target).getParentLocalName();
        case "parentnamespace":
        case "parentNamespace": return getOrCreateSignerConfiguration(target).getParentNamespace();
        case "parentxpath":
        case "parentXpath": return getOrCreateSignerConfiguration(target).getParentXpath();
        case "plaintext":
        case "plainText": return getOrCreateSignerConfiguration(target).getPlainText();
        case "plaintextencoding":
        case "plainTextEncoding": return getOrCreateSignerConfiguration(target).getPlainTextEncoding();
        case "prefixforxmlsignaturenamespace":
        case "prefixForXmlSignatureNamespace": return getOrCreateSignerConfiguration(target).getPrefixForXmlSignatureNamespace();
        case "properties": return getOrCreateSignerConfiguration(target).getProperties();
        case "schemaresourceuri":
        case "schemaResourceUri": return getOrCreateSignerConfiguration(target).getSchemaResourceUri();
        case "signaturealgorithm":
        case "signatureAlgorithm": return getOrCreateSignerConfiguration(target).getSignatureAlgorithm();
        case "signatureid":
        case "signatureId": return getOrCreateSignerConfiguration(target).getSignatureId();
        case "signerconfiguration":
        case "signerConfiguration": return target.getSignerConfiguration();
        case "transformmethods":
        case "transformMethods": return getOrCreateSignerConfiguration(target).getTransformMethods();
        case "uridereferencer":
        case "uriDereferencer": return getOrCreateSignerConfiguration(target).getUriDereferencer();
        case "xpathstoidattributes":
        case "xpathsToIdAttributes": return getOrCreateSignerConfiguration(target).getXpathsToIdAttributes();
        default: return null;
        }
    }
}

