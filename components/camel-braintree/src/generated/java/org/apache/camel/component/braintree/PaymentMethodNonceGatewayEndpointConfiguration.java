
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.braintreegateway.PaymentMethodNonceGateway}.
 */
@ApiParams(apiName = "paymentMethodNonce", description = "Provides methods to interact with nonce payments",
           apiMethods = {@ApiMethod(methodName = "create", signatures={"com.braintreegateway.Result<com.braintreegateway.PaymentMethodNonce> create(String paymentMethodToken)", "com.braintreegateway.Result<com.braintreegateway.PaymentMethodNonce> create(com.braintreegateway.PaymentMethodNonceRequest request)"}), @ApiMethod(methodName = "find", signatures={"com.braintreegateway.PaymentMethodNonce find(String paymentMethodNonce)"})}, aliases = {})
@UriParams
@Configurer
public final class PaymentMethodNonceGatewayEndpointConfiguration extends BraintreeConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "find")})
    private String paymentMethodNonce;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create")})
    private String paymentMethodToken;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "create")})
    private com.braintreegateway.PaymentMethodNonceRequest request;

    public String getPaymentMethodNonce() {
        return paymentMethodNonce;
    }

    public void setPaymentMethodNonce(String paymentMethodNonce) {
        this.paymentMethodNonce = paymentMethodNonce;
    }

    public String getPaymentMethodToken() {
        return paymentMethodToken;
    }

    public void setPaymentMethodToken(String paymentMethodToken) {
        this.paymentMethodToken = paymentMethodToken;
    }

    public com.braintreegateway.PaymentMethodNonceRequest getRequest() {
        return request;
    }

    public void setRequest(com.braintreegateway.PaymentMethodNonceRequest request) {
        this.request = request;
    }
}
