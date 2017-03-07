/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.http4.springboot;

import javax.net.ssl.HostnameVerifier;
import org.apache.camel.component.http4.HttpClientConfigurer;
import org.apache.camel.http.common.HttpBinding;
import org.apache.camel.http.common.HttpConfiguration;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.util.jsse.SSLContextParameters;
import org.apache.http.client.CookieStore;
import org.apache.http.conn.HttpClientConnectionManager;
import org.apache.http.protocol.HttpContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * For calling out to external HTTP servers using Apache HTTP Client 4.x.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.http4")
public class HttpComponentConfiguration {

    /**
     * To use the custom HttpClientConfigurer to perform configuration of the
     * HttpClient that will be used.
     */
    @NestedConfigurationProperty
    private HttpClientConfigurer httpClientConfigurer;
    /**
     * To use a custom and shared HttpClientConnectionManager to manage
     * connections. If this has been configured then this is always used for all
     * endpoints created by this component.
     */
    @NestedConfigurationProperty
    private HttpClientConnectionManager clientConnectionManager;
    /**
     * To use a custom HttpBinding to control the mapping between Camel message
     * and HttpClient.
     */
    @NestedConfigurationProperty
    private HttpBinding httpBinding;
    /**
     * To use the shared HttpConfiguration as base configuration.
     */
    @NestedConfigurationProperty
    private HttpConfiguration httpConfiguration;
    /**
     * Whether to allow java serialization when a request uses
     * context-type=application/x-java-serialized-object This is by default
     * turned off. If you enable this then be aware that Java will deserialize
     * the incoming data from the request to Java and that can be a potential
     * security risk.
     */
    private Boolean allowJavaSerializedObject = false;
    /**
     * To use a custom org.apache.http.protocol.HttpContext when executing
     * requests.
     */
    @NestedConfigurationProperty
    private HttpContext httpContext;
    /**
     * To configure security using SSLContextParameters. Important: Only one
     * instance of org.apache.camel.util.jsse.SSLContextParameters is supported
     * per HttpComponent. If you need to use 2 or more different instances you
     * need to define a new HttpComponent per instance you need.
     */
    @NestedConfigurationProperty
    private SSLContextParameters sslContextParameters;
    /**
     * To use a custom X509HostnameVerifier such as DefaultHostnameVerifier or
     * org.apache.http.conn.ssl.NoopHostnameVerifier.
     */
    private HostnameVerifier x509HostnameVerifier;
    /**
     * The maximum number of connections.
     */
    private Integer maxTotalConnections = 200;
    /**
     * The maximum number of connections per route.
     */
    private Integer connectionsPerRoute = 20;
    /**
     * The time for connection to live the time unit is millisecond the default
     * value is always keep alive.
     */
    private Long connectionTimeToLive;
    /**
     * To use a custom org.apache.http.client.CookieStore. By default the
     * org.apache.http.impl.client.BasicCookieStore is used which is an
     * in-memory only cookie store. Notice if bridgeEndpoint=true then the
     * cookie store is forced to be a noop cookie store as cookie shouldn't be
     * stored as we are just bridging (eg acting as a proxy).
     */
    @NestedConfigurationProperty
    private CookieStore cookieStore;
    /**
     * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
     * header to and from Camel message.
     */
    @NestedConfigurationProperty
    private HeaderFilterStrategy headerFilterStrategy;
    /**
     * Whether the component should resolve property placeholders on itself when
     * starting. Only properties which are of String type can use property
     * placeholders.
     */
    private Boolean resolvePropertyPlaceholders = true;

    public HttpClientConfigurer getHttpClientConfigurer() {
        return httpClientConfigurer;
    }

    public void setHttpClientConfigurer(
            HttpClientConfigurer httpClientConfigurer) {
        this.httpClientConfigurer = httpClientConfigurer;
    }

    public HttpClientConnectionManager getClientConnectionManager() {
        return clientConnectionManager;
    }

    public void setClientConnectionManager(
            HttpClientConnectionManager clientConnectionManager) {
        this.clientConnectionManager = clientConnectionManager;
    }

    public HttpBinding getHttpBinding() {
        return httpBinding;
    }

    public void setHttpBinding(HttpBinding httpBinding) {
        this.httpBinding = httpBinding;
    }

    public HttpConfiguration getHttpConfiguration() {
        return httpConfiguration;
    }

    public void setHttpConfiguration(HttpConfiguration httpConfiguration) {
        this.httpConfiguration = httpConfiguration;
    }

    public Boolean getAllowJavaSerializedObject() {
        return allowJavaSerializedObject;
    }

    public void setAllowJavaSerializedObject(Boolean allowJavaSerializedObject) {
        this.allowJavaSerializedObject = allowJavaSerializedObject;
    }

    public HttpContext getHttpContext() {
        return httpContext;
    }

    public void setHttpContext(HttpContext httpContext) {
        this.httpContext = httpContext;
    }

    public SSLContextParameters getSslContextParameters() {
        return sslContextParameters;
    }

    public void setSslContextParameters(
            SSLContextParameters sslContextParameters) {
        this.sslContextParameters = sslContextParameters;
    }

    public HostnameVerifier getX509HostnameVerifier() {
        return x509HostnameVerifier;
    }

    public void setX509HostnameVerifier(HostnameVerifier x509HostnameVerifier) {
        this.x509HostnameVerifier = x509HostnameVerifier;
    }

    public Integer getMaxTotalConnections() {
        return maxTotalConnections;
    }

    public void setMaxTotalConnections(Integer maxTotalConnections) {
        this.maxTotalConnections = maxTotalConnections;
    }

    public Integer getConnectionsPerRoute() {
        return connectionsPerRoute;
    }

    public void setConnectionsPerRoute(Integer connectionsPerRoute) {
        this.connectionsPerRoute = connectionsPerRoute;
    }

    public Long getConnectionTimeToLive() {
        return connectionTimeToLive;
    }

    public void setConnectionTimeToLive(Long connectionTimeToLive) {
        this.connectionTimeToLive = connectionTimeToLive;
    }

    public CookieStore getCookieStore() {
        return cookieStore;
    }

    public void setCookieStore(CookieStore cookieStore) {
        this.cookieStore = cookieStore;
    }

    public HeaderFilterStrategy getHeaderFilterStrategy() {
        return headerFilterStrategy;
    }

    public void setHeaderFilterStrategy(
            HeaderFilterStrategy headerFilterStrategy) {
        this.headerFilterStrategy = headerFilterStrategy;
    }

    public Boolean getResolvePropertyPlaceholders() {
        return resolvePropertyPlaceholders;
    }

    public void setResolvePropertyPlaceholders(
            Boolean resolvePropertyPlaceholders) {
        this.resolvePropertyPlaceholders = resolvePropertyPlaceholders;
    }
}