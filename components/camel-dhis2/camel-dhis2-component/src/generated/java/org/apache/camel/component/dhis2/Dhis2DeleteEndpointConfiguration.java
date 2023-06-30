/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.dhis2;

import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.dhis2.api.Dhis2Delete}.
 */
@ApiParams(apiName = "delete", 
           description = "",
           apiMethods = {@ApiMethod(methodName = "resource", signatures={"java.io.InputStream resource(String path, Object resource, java.util.Map<String, Object> queryParams)"})}, aliases = {})
@UriParams
@Configurer(extended = true)
public final class Dhis2DeleteEndpointConfiguration extends Dhis2Configuration {
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "resource")})
    private String path;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource")})
    private java.util.Map<String, Object> queryParams;
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "resource")})
    private Object resource;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public java.util.Map<String, Object> getQueryParams() {
        return queryParams;
    }

    public void setQueryParams(java.util.Map<String, Object> queryParams) {
        this.queryParams = queryParams;
    }

    public Object getResource() {
        return resource;
    }

    public void setResource(Object resource) {
        this.resource = resource;
    }
}
