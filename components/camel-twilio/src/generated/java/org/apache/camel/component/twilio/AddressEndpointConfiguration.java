
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link com.twilio.rest.api.v2010.account.Address}.
 */
@ApiParams(apiName = "address", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "creator", description="Create a AddressCreator to execute create", signatures={"com.twilio.rest.api.v2010.account.AddressCreator creator(String customerName, String street, String city, String region, String postalCode, String isoCountry)", "com.twilio.rest.api.v2010.account.AddressCreator creator(String pathAccountSid, String customerName, String street, String city, String region, String postalCode, String isoCountry)"}), @ApiMethod(methodName = "deleter", description="Create a AddressDeleter to execute delete", signatures={"com.twilio.rest.api.v2010.account.AddressDeleter deleter(String pathSid)", "com.twilio.rest.api.v2010.account.AddressDeleter deleter(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "fetcher", description="Create a AddressFetcher to execute fetch", signatures={"com.twilio.rest.api.v2010.account.AddressFetcher fetcher(String pathSid)", "com.twilio.rest.api.v2010.account.AddressFetcher fetcher(String pathAccountSid, String pathSid)"}), @ApiMethod(methodName = "reader", description="Create a AddressReader to execute read", signatures={"com.twilio.rest.api.v2010.account.AddressReader reader()", "com.twilio.rest.api.v2010.account.AddressReader reader(String pathAccountSid)"}), @ApiMethod(methodName = "updater", description="Create a AddressUpdater to execute update", signatures={"com.twilio.rest.api.v2010.account.AddressUpdater updater(String pathSid)", "com.twilio.rest.api.v2010.account.AddressUpdater updater(String pathAccountSid, String pathSid)"}), }, aliases = {"^creator$=create", "^deleter$=delete", "^fetcher$=fetch", "^reader$=read", "^updater$=update"})
@UriParams
@Configurer(api = true)
public final class AddressEndpointConfiguration extends TwilioConfiguration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The city of the new address")})
    private String city;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The name to associate with the new address")})
    private String customerName;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The ISO country code of the new address")})
    private String isoCountry;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The SID of the Account that will be responsible for the new Address resource"), @ApiMethod(methodName = "deleter", description="The SID of the Account that is responsible for the resources to delete"), @ApiMethod(methodName = "fetcher", description="The SID of the Account that is responsible for this address"), @ApiMethod(methodName = "reader", description="The SID of the Account that is responsible for this address"), @ApiMethod(methodName = "updater", description="The SID of the Account that is responsible for the resource to update")})
    private String pathAccountSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "deleter", description="The unique string that identifies the resource"), @ApiMethod(methodName = "fetcher", description="The unique string that identifies the resource"), @ApiMethod(methodName = "updater", description="The unique string that identifies the resource")})
    private String pathSid;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The postal code of the new address")})
    private String postalCode;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The state or region of the new address")})
    private String region;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "creator", description="The number and street address of the new address")})
    private String street;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public String getPathAccountSid() {
        return pathAccountSid;
    }

    public void setPathAccountSid(String pathAccountSid) {
        this.pathAccountSid = pathAccountSid;
    }

    public String getPathSid() {
        return pathSid;
    }

    public void setPathSid(String pathSid) {
        this.pathSid = pathSid;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}
