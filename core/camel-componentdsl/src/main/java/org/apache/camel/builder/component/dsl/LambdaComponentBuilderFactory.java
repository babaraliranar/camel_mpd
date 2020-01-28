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
import org.apache.camel.component.aws.lambda.LambdaComponent;

/**
 * The aws-lambda is used for managing and invoking functions from Amazon
 * Lambda.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface LambdaComponentBuilderFactory {

    /**
     * AWS Lambda (camel-aws-lambda)
     * The aws-lambda is used for managing and invoking functions from Amazon
     * Lambda.
     * 
     * Category: cloud,computing,serverless
     * Since: 2.20
     * Maven coordinates: org.apache.camel:camel-aws-lambda
     */
    static LambdaComponentBuilder awsLambda() {
        return new LambdaComponentBuilderImpl();
    }

    /**
     * Builder for the AWS Lambda component.
     */
    interface LambdaComponentBuilder
            extends
                ComponentBuilder<LambdaComponent> {
        /**
         * The AWS Lambda default configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws.lambda.LambdaConfiguration</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default LambdaComponentBuilder setConfiguration(
                org.apache.camel.component.aws.lambda.LambdaConfiguration configuration) {
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
        default LambdaComponentBuilder setAccessKey(java.lang.String accessKey) {
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
        default LambdaComponentBuilder setSecretKey(java.lang.String secretKey) {
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
        default LambdaComponentBuilder setRegion(java.lang.String region) {
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
        default LambdaComponentBuilder setBasicPropertyBinding(
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
        default LambdaComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
    }

    class LambdaComponentBuilderImpl
            extends
                AbstractComponentBuilder<LambdaComponent>
            implements
                LambdaComponentBuilder {
        @Override
        protected LambdaComponent buildConcreteComponent() {
            return new LambdaComponent();
        }
    }
}