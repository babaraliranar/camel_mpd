
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.as2;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.as2.api.AS2ClientManager}.
 */
@ApiParams(apiName = "client", producerOnly = true,
           description = "Sends EDI Messages over HTTP",
           apiMethods = {@ApiMethod(methodName = "send", description="Send ediMessage to trading partner", signatures={"org.apache.http.protocol.HttpCoreContext send(String ediMessage, String requestUri, String subject, String from, String as2From, String as2To, org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure, org.apache.http.entity.ContentType ediMessageContentType, String ediMessageTransferEncoding, org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm, java.security.cert.Certificate[] signingCertificateChain, java.security.PrivateKey signingPrivateKey, org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm, String dispositionNotificationTo, String[] signedReceiptMicAlgorithms, org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm, java.security.cert.Certificate[] encryptingCertificateChain)"})}, aliases = {})
@UriParams
@Configurer(api = true)
public final class AS2ClientManagerEndpointConfiguration extends AS2Configuration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="AS2 name of sender")})
    private String as2From;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="The structure of AS2 to send; see AS2MessageStructure")})
    private org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="AS2 name of recipient")})
    private String as2To;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to compress the message or null if sending EDI message uncompressed")})
    private org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="An RFC2822 address to request a receipt or null if no receipt requested")})
    private String dispositionNotificationTo;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="EDI message to transport")})
    private String ediMessage;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="The content typw of EDI message")})
    private org.apache.http.entity.ContentType ediMessageContentType;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The transfer encoding used to transport EDI message")})
    private String ediMessageTransferEncoding;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to encrypt the message or null if sending EDI message unencrypted")})
    private org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The chain of certificates used to encrypt the message or null if sending EDI message unencrypted")})
    private java.security.cert.Certificate[] encryptingCertificateChain;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="RFC2822 address of sender")})
    private String from;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="Resource location to deliver message")})
    private String requestUri;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The senders list of signing algorithms for signing receipt, in preferred order, or null if requesting an unsigned receipt.")})
    private String[] signedReceiptMicAlgorithms;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The algorithm used to sign the message or null if sending EDI message unsigned")})
    private org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The chain of certificates used to sign the message or null if sending EDI message unsigned")})
    private java.security.cert.Certificate[] signingCertificateChain;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "send", description="The private key used to sign EDI message")})
    private java.security.PrivateKey signingPrivateKey;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "send", description="Message subject")})
    private String subject;

    public String getAs2From() {
        return as2From;
    }

    public void setAs2From(String as2From) {
        this.as2From = as2From;
    }

    public org.apache.camel.component.as2.api.AS2MessageStructure getAs2MessageStructure() {
        return as2MessageStructure;
    }

    public void setAs2MessageStructure(org.apache.camel.component.as2.api.AS2MessageStructure as2MessageStructure) {
        this.as2MessageStructure = as2MessageStructure;
    }

    public String getAs2To() {
        return as2To;
    }

    public void setAs2To(String as2To) {
        this.as2To = as2To;
    }

    public org.apache.camel.component.as2.api.AS2CompressionAlgorithm getCompressionAlgorithm() {
        return compressionAlgorithm;
    }

    public void setCompressionAlgorithm(org.apache.camel.component.as2.api.AS2CompressionAlgorithm compressionAlgorithm) {
        this.compressionAlgorithm = compressionAlgorithm;
    }

    public String getDispositionNotificationTo() {
        return dispositionNotificationTo;
    }

    public void setDispositionNotificationTo(String dispositionNotificationTo) {
        this.dispositionNotificationTo = dispositionNotificationTo;
    }

    public String getEdiMessage() {
        return ediMessage;
    }

    public void setEdiMessage(String ediMessage) {
        this.ediMessage = ediMessage;
    }

    public org.apache.http.entity.ContentType getEdiMessageContentType() {
        return ediMessageContentType;
    }

    public void setEdiMessageContentType(org.apache.http.entity.ContentType ediMessageContentType) {
        this.ediMessageContentType = ediMessageContentType;
    }

    public String getEdiMessageTransferEncoding() {
        return ediMessageTransferEncoding;
    }

    public void setEdiMessageTransferEncoding(String ediMessageTransferEncoding) {
        this.ediMessageTransferEncoding = ediMessageTransferEncoding;
    }

    public org.apache.camel.component.as2.api.AS2EncryptionAlgorithm getEncryptingAlgorithm() {
        return encryptingAlgorithm;
    }

    public void setEncryptingAlgorithm(org.apache.camel.component.as2.api.AS2EncryptionAlgorithm encryptingAlgorithm) {
        this.encryptingAlgorithm = encryptingAlgorithm;
    }

    public java.security.cert.Certificate[] getEncryptingCertificateChain() {
        return encryptingCertificateChain;
    }

    public void setEncryptingCertificateChain(java.security.cert.Certificate[] encryptingCertificateChain) {
        this.encryptingCertificateChain = encryptingCertificateChain;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getRequestUri() {
        return requestUri;
    }

    public void setRequestUri(String requestUri) {
        this.requestUri = requestUri;
    }

    public String[] getSignedReceiptMicAlgorithms() {
        return signedReceiptMicAlgorithms;
    }

    public void setSignedReceiptMicAlgorithms(String[] signedReceiptMicAlgorithms) {
        this.signedReceiptMicAlgorithms = signedReceiptMicAlgorithms;
    }

    public org.apache.camel.component.as2.api.AS2SignatureAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    public void setSigningAlgorithm(org.apache.camel.component.as2.api.AS2SignatureAlgorithm signingAlgorithm) {
        this.signingAlgorithm = signingAlgorithm;
    }

    public java.security.cert.Certificate[] getSigningCertificateChain() {
        return signingCertificateChain;
    }

    public void setSigningCertificateChain(java.security.cert.Certificate[] signingCertificateChain) {
        this.signingCertificateChain = signingCertificateChain;
    }

    public java.security.PrivateKey getSigningPrivateKey() {
        return signingPrivateKey;
    }

    public void setSigningPrivateKey(java.security.PrivateKey signingPrivateKey) {
        this.signingPrivateKey = signingPrivateKey;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
