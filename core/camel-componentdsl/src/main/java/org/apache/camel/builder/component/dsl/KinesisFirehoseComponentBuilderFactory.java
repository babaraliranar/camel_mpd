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
import org.apache.camel.component.aws.firehose.KinesisFirehoseComponent;

/**
 * The aws-kinesis-firehose component is used for producing Amazon's Kinesis
 * Firehose streams.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface KinesisFirehoseComponentBuilderFactory {

    /**
     * AWS Kinesis Firehose (camel-aws-kinesis)
     * The aws-kinesis-firehose component is used for producing Amazon's Kinesis
     * Firehose streams.
     * 
     * Category: cloud,messaging
     * Since: 2.19
     * Maven coordinates: org.apache.camel:camel-aws-kinesis
     */
    static KinesisFirehoseComponentBuilder awsKinesisFirehose() {
        return new KinesisFirehoseComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Kinesis Firehose component.
     */
    interface KinesisFirehoseComponentBuilder
            extends
                ComponentBuilder<KinesisFirehoseComponent> {
        /**
         * The AWS Kinesis Firehose default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.firehose.KinesisFirehoseConfiguration</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default KinesisFirehoseComponentBuilder setConfiguration(
                org.apache.camel.component.aws.firehose.KinesisFirehoseConfiguration configuration) {
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
        default KinesisFirehoseComponentBuilder setAccessKey(
                java.lang.String accessKey) {
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
        default KinesisFirehoseComponentBuilder setSecretKey(
                java.lang.String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Amazon AWS Region.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: producer
         */
        default KinesisFirehoseComponentBuilder setRegion(
                java.lang.String region) {
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
        default KinesisFirehoseComponentBuilder setBasicPropertyBinding(
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
        default KinesisFirehoseComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class KinesisFirehoseComponentBuilderImpl
            extends
                AbstractComponentBuilder<KinesisFirehoseComponent>
            implements
                KinesisFirehoseComponentBuilder {
        @Override
        protected KinesisFirehoseComponent buildConcreteComponent() {
            return new KinesisFirehoseComponent();
        }
    }
}