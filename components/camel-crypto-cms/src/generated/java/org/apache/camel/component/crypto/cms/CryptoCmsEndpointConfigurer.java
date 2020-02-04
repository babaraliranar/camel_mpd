/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.crypto.cms;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CryptoCmsEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

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
        case "keyStore": ((CryptoCmsEndpoint) target).getVerifyConfig().setKeyStore(property(camelContext, java.security.KeyStore.class, value)); return true;
        case "keyStoreParameters": ((CryptoCmsEndpoint) target).getVerifyConfig().setKeyStoreParameters(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "lazyStartProducer": ((CryptoCmsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicPropertyBinding": ((CryptoCmsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CryptoCmsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "password": ((CryptoCmsEndpoint) target).getDecryptConfig().setPassword(property(camelContext, char[].class, value)); return true;
        case "fromBase64": ((CryptoCmsEndpoint) target).getVerifyConfig().setFromBase64(property(camelContext, boolean.class, value)); return true;
        case "contentEncryptionAlgorithm": ((CryptoCmsEndpoint) target).getEncryptConfig().setContentEncryptionAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "originatorInformationProvider": ((CryptoCmsEndpoint) target).getEncryptConfig().setOriginatorInformationProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider.class, value)); return true;
        case "recipient": ((CryptoCmsEndpoint) target).getEncryptConfig().setRecipient(property(camelContext, java.util.List.class, value)); return true;
        case "secretKeyLength": ((CryptoCmsEndpoint) target).getEncryptConfig().setSecretKeyLength(property(camelContext, int.class, value)); return true;
        case "unprotectedAttributesGeneratorProvider": ((CryptoCmsEndpoint) target).getEncryptConfig().setUnprotectedAttributesGeneratorProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider.class, value)); return true;
        case "toBase64": ((CryptoCmsEndpoint) target).getSignConfig().setToBase64(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includeContent": ((CryptoCmsEndpoint) target).getSignConfig().setIncludeContent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "signer": ((CryptoCmsEndpoint) target).getSignConfig().setSigner(property(camelContext, java.lang.String.class, value)); return true;
        case "signedDataHeaderBase64": ((CryptoCmsEndpoint) target).getVerifyConfig().setSignedDataHeaderBase64(property(camelContext, boolean.class, value)); return true;
        case "verifySignaturesOfAllSigners": ((CryptoCmsEndpoint) target).getVerifyConfig().setVerifySignaturesOfAllSigners(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

    private static boolean doConfigureIgnoreCase(CamelContext camelContext, Object target, String name, Object value) {
        switch (name.toLowerCase()) {
        case "keystore": ((CryptoCmsEndpoint) target).getVerifyConfig().setKeyStore(property(camelContext, java.security.KeyStore.class, value)); return true;
        case "keystoreparameters": ((CryptoCmsEndpoint) target).getVerifyConfig().setKeyStoreParameters(property(camelContext, org.apache.camel.support.jsse.KeyStoreParameters.class, value)); return true;
        case "lazystartproducer": ((CryptoCmsEndpoint) target).setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding": ((CryptoCmsEndpoint) target).setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "synchronous": ((CryptoCmsEndpoint) target).setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "password": ((CryptoCmsEndpoint) target).getDecryptConfig().setPassword(property(camelContext, char[].class, value)); return true;
        case "frombase64": ((CryptoCmsEndpoint) target).getVerifyConfig().setFromBase64(property(camelContext, boolean.class, value)); return true;
        case "contentencryptionalgorithm": ((CryptoCmsEndpoint) target).getEncryptConfig().setContentEncryptionAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "originatorinformationprovider": ((CryptoCmsEndpoint) target).getEncryptConfig().setOriginatorInformationProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.OriginatorInformationProvider.class, value)); return true;
        case "recipient": ((CryptoCmsEndpoint) target).getEncryptConfig().setRecipient(property(camelContext, java.util.List.class, value)); return true;
        case "secretkeylength": ((CryptoCmsEndpoint) target).getEncryptConfig().setSecretKeyLength(property(camelContext, int.class, value)); return true;
        case "unprotectedattributesgeneratorprovider": ((CryptoCmsEndpoint) target).getEncryptConfig().setUnprotectedAttributesGeneratorProvider(property(camelContext, org.apache.camel.component.crypto.cms.common.AttributesGeneratorProvider.class, value)); return true;
        case "tobase64": ((CryptoCmsEndpoint) target).getSignConfig().setToBase64(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "includecontent": ((CryptoCmsEndpoint) target).getSignConfig().setIncludeContent(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "signer": ((CryptoCmsEndpoint) target).getSignConfig().setSigner(property(camelContext, java.lang.String.class, value)); return true;
        case "signeddataheaderbase64": ((CryptoCmsEndpoint) target).getVerifyConfig().setSignedDataHeaderBase64(property(camelContext, boolean.class, value)); return true;
        case "verifysignaturesofallsigners": ((CryptoCmsEndpoint) target).getVerifyConfig().setVerifySignaturesOfAllSigners(property(camelContext, boolean.class, value)); return true;
            default: return false;
        }
    }

}

