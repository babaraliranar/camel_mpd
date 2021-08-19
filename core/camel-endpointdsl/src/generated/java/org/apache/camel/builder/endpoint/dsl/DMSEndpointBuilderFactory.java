/*
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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * To integrate with a fully managed, high-performance message queuing service
 * on Huawei Cloud
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface DMSEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Huawei Distributed Message Service (DMS)
     * component.
     */
    public interface DMSEndpointBuilder extends EndpointProducerBuilder {
        /**
         * Authentication key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param authenticationKey the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder authenticationKey(String authenticationKey) {
            doSetProperty("authenticationKey", authenticationKey);
            return this;
        }
        /**
         * DMS url. Carries higher precedence than region parameter based client
         * initialization.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param endpoint the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder endpoint(String endpoint) {
            doSetProperty("endpoint", endpoint);
            return this;
        }
        /**
         * The message engine. Either kafka or rabbitmq. If the parameter is not
         * specified, all instances will be queried.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param engine the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder engine(String engine) {
            doSetProperty("engine", engine);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder ignoreSslVerification(
                boolean ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * Ignore SSL verification.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param ignoreSslVerification the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder ignoreSslVerification(
                String ignoreSslVerification) {
            doSetProperty("ignoreSslVerification", ignoreSslVerification);
            return this;
        }
        /**
         * The id of the instance. This option is mandatory when querying an
         * instance.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param instanceId the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder instanceId(String instanceId) {
            doSetProperty("instanceId", instanceId);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder lazyStartProducer(boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder lazyStartProducer(String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Cloud project ID.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param projectId the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder projectId(String projectId) {
            doSetProperty("projectId", projectId);
            return this;
        }
        /**
         * Proxy server ip/hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * Proxy authentication password.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPassword the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder proxyPassword(String proxyPassword) {
            doSetProperty("proxyPassword", proxyPassword);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder proxyPort(int proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy server port.
         * 
         * The option will be converted to a &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Proxy authentication user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param proxyUser the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder proxyUser(String proxyUser) {
            doSetProperty("proxyUser", proxyUser);
            return this;
        }
        /**
         * DMS service region.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Secret key for the cloud user.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder serviceKeys(Object serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
        /**
         * Configuration object for cloud service authentication.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.huaweicloud.common.models.ServiceKeys&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param serviceKeys the value to set
         * @return the dsl builder
         */
        default DMSEndpointBuilder serviceKeys(String serviceKeys) {
            doSetProperty("serviceKeys", serviceKeys);
            return this;
        }
    }

    public interface DMSBuilders {
        /**
         * Huawei Distributed Message Service (DMS) (camel-huaweicloud-dms)
         * To integrate with a fully managed, high-performance message queuing
         * service on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.12
         * Maven coordinates: org.apache.camel:camel-huaweicloud-dms
         * 
         * Syntax: <code>hwcloud-dms:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param path operation
         * @return the dsl builder
         */
        default DMSEndpointBuilder hwcloudDms(String path) {
            return DMSEndpointBuilderFactory.endpointBuilder("hwcloud-dms", path);
        }
        /**
         * Huawei Distributed Message Service (DMS) (camel-huaweicloud-dms)
         * To integrate with a fully managed, high-performance message queuing
         * service on Huawei Cloud
         * 
         * Category: cloud
         * Since: 3.12
         * Maven coordinates: org.apache.camel:camel-huaweicloud-dms
         * 
         * Syntax: <code>hwcloud-dms:operation</code>
         * 
         * Path parameter: operation (required)
         * Operation to be performed
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path operation
         * @return the dsl builder
         */
        default DMSEndpointBuilder hwcloudDms(String componentName, String path) {
            return DMSEndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }
    static DMSEndpointBuilder endpointBuilder(String componentName, String path) {
        class DMSEndpointBuilderImpl extends AbstractEndpointBuilder implements DMSEndpointBuilder {
            public DMSEndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new DMSEndpointBuilderImpl(path);
    }
}