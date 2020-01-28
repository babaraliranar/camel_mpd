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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.aws.sns.SnsComponent;

/**
 * The aws-sns component is used for sending messages to an Amazon Simple
 * Notification Topic.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SnsComponentBuilderFactory {

    /**
     * AWS Simple Notification System (camel-aws-sns)
     * The aws-sns component is used for sending messages to an Amazon Simple
     * Notification Topic.
     * 
     * Category: cloud,mobile,messaging
     * Since: 2.8
     * Maven coordinates: org.apache.camel:camel-aws-sns
     */
    static SnsComponentBuilder awsSns() {
        return new SnsComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Simple Notification System component.
     */
    interface SnsComponentBuilder extends ComponentBuilder<SnsComponent> {
        /**
         * The AWS SNS default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.sns.SnsConfiguration</code>
         * type.
         * 
         * Default:
         * Group: advanced
         */
        default SnsComponentBuilder setConfiguration(
                org.apache.camel.component.aws.sns.SnsConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default SnsComponentBuilder setAccessKey(java.lang.String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default SnsComponentBuilder setSecretKey(java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * The region in which SNS client needs to work.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default SnsComponentBuilder setRegion(java.lang.String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SnsComponentBuilder setBasicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SnsComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class SnsComponentBuilderImpl
            extends
                AbstractComponentBuilder<SnsComponent>
            implements
                SnsComponentBuilder {
        @Override
        protected SnsComponent buildConcreteComponent() {
            return new SnsComponent();
        }
    }
}