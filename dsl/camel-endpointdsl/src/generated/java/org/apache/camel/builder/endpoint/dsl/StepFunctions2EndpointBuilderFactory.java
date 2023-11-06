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

import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.stream.*;
import javax.annotation.processing.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * Manage and invoke AWS Step functions.
 * 
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface StepFunctions2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS StepFunctions component.
     */
    public interface StepFunctions2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedStepFunctions2EndpointBuilder advanced() {
            return (AdvancedStepFunctions2EndpointBuilder) this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.aws2.stepfunctions.StepFunctions2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder operation(
                org.apache.camel.component.aws2.stepfunctions.StepFunctions2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform. It can be listFunctions, getFunction,
         * createFunction, deleteFunction or invokeFunction.
         * 
         * The option will be converted to a
         * &lt;code&gt;org.apache.camel.component.aws2.stepfunctions.StepFunctions2Operations&lt;/code&gt; type.
         * 
         * Required: true
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder overrideEndpoint(
                boolean overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * Set the need for overidding the endpoint. This option needs to be
         * used in combination with uriEndpointOverride option.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param overrideEndpoint the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder overrideEndpoint(
                String overrideEndpoint) {
            doSetProperty("overrideEndpoint", overrideEndpoint);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder pojoRequest(boolean pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If we want to use a POJO request as body or not.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param pojoRequest the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder pojoRequest(String pojoRequest) {
            doSetProperty("pojoRequest", pojoRequest);
            return this;
        }
        /**
         * If using a profile credentials provider this parameter will set the
         * profile name.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param profileCredentialsName the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder profileCredentialsName(
                String profileCredentialsName) {
            doSetProperty("profileCredentialsName", profileCredentialsName);
            return this;
        }
        /**
         * The region in which StepFunctions client needs to work. When using
         * this parameter, the configuration will expect the lowercase name of
         * the region (for example ap-east-1) You'll need to use the name
         * Region.EU_WEST_1.id().
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param region the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder trustAllCertificates(
                boolean trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * If we want to trust all certificates in case of overriding the
         * endpoint.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param trustAllCertificates the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder trustAllCertificates(
                String trustAllCertificates) {
            doSetProperty("trustAllCertificates", trustAllCertificates);
            return this;
        }
        /**
         * Set the overriding uri endpoint. This option needs to be used in
         * combination with overrideEndpoint option.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param uriEndpointOverride the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder uriEndpointOverride(
                String uriEndpointOverride) {
            doSetProperty("uriEndpointOverride", uriEndpointOverride);
            return this;
        }
        /**
         * Set whether the StepFunctions client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder useDefaultCredentialsProvider(
                boolean useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the StepFunctions client should expect to load
         * credentials through a default credentials provider or to expect
         * static credentials to be passed in.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useDefaultCredentialsProvider the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder useDefaultCredentialsProvider(
                String useDefaultCredentialsProvider) {
            doSetProperty("useDefaultCredentialsProvider", useDefaultCredentialsProvider);
            return this;
        }
        /**
         * Set whether the StepFunctions client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder useProfileCredentialsProvider(
                boolean useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * Set whether the StepFunctions client should expect to load
         * credentials through a profile credentials provider.
         * 
         * The option will be converted to a &lt;code&gt;boolean&lt;/code&gt;
         * type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param useProfileCredentialsProvider the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder useProfileCredentialsProvider(
                String useProfileCredentialsProvider) {
            doSetProperty("useProfileCredentialsProvider", useProfileCredentialsProvider);
            return this;
        }
        /**
         * To define a proxy host when instantiating the StepFunctions client.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the StepFunctions client.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the StepFunctions client.
         * 
         * The option will be converted to a
         * &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the StepFunctions
         * client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder proxyProtocol(
                software.amazon.awssdk.core.Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the StepFunctions
         * client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.core.Protocol&lt;/code&gt; type.
         * 
         * Default: HTTPS
         * Group: proxy
         * 
         * @param proxyProtocol the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param accessKey the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param secretKey the value to set
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS StepFunctions component.
     */
    public interface AdvancedStepFunctions2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default StepFunctions2EndpointBuilder basic() {
            return (StepFunctions2EndpointBuilder) this;
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedStepFunctions2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
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
         * Group: producer (advanced)
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default AdvancedStepFunctions2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * To use a existing configured AwsStepFunctionsClient as client.
         * 
         * The option is a:
         * &lt;code&gt;software.amazon.awssdk.services.sfn.SfnClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsSfnClient the value to set
         * @return the dsl builder
         */
        default AdvancedStepFunctions2EndpointBuilder awsSfnClient(
                software.amazon.awssdk.services.sfn.SfnClient awsSfnClient) {
            doSetProperty("awsSfnClient", awsSfnClient);
            return this;
        }
        /**
         * To use a existing configured AwsStepFunctionsClient as client.
         * 
         * The option will be converted to a
         * &lt;code&gt;software.amazon.awssdk.services.sfn.SfnClient&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param awsSfnClient the value to set
         * @return the dsl builder
         */
        default AdvancedStepFunctions2EndpointBuilder awsSfnClient(
                String awsSfnClient) {
            doSetProperty("awsSfnClient", awsSfnClient);
            return this;
        }
    }

    public interface StepFunctions2Builders {
        /**
         * AWS StepFunctions (camel-aws2-step-functions)
         * Manage and invoke AWS Step functions.
         * 
         * Category: cloud,serverless
         * Since: 4.0
         * Maven coordinates: org.apache.camel:camel-aws2-step-functions
         * 
         * @return the dsl builder for the headers' name.
         */
        default StepFunctions2HeaderNameBuilder aws2StepFunctions() {
            return StepFunctions2HeaderNameBuilder.INSTANCE;
        }
        /**
         * AWS StepFunctions (camel-aws2-step-functions)
         * Manage and invoke AWS Step functions.
         * 
         * Category: cloud,serverless
         * Since: 4.0
         * Maven coordinates: org.apache.camel:camel-aws2-step-functions
         * 
         * Syntax: <code>aws2-step-functions:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param path label
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder aws2StepFunctions(String path) {
            return StepFunctions2EndpointBuilderFactory.endpointBuilder("aws2-step-functions", path);
        }
        /**
         * AWS StepFunctions (camel-aws2-step-functions)
         * Manage and invoke AWS Step functions.
         * 
         * Category: cloud,serverless
         * Since: 4.0
         * Maven coordinates: org.apache.camel:camel-aws2-step-functions
         * 
         * Syntax: <code>aws2-step-functions:label</code>
         * 
         * Path parameter: label (required)
         * Logical name
         * 
         * @param componentName to use a custom component name for the endpoint
         * instead of the default name
         * @param path label
         * @return the dsl builder
         */
        default StepFunctions2EndpointBuilder aws2StepFunctions(
                String componentName,
                String path) {
            return StepFunctions2EndpointBuilderFactory.endpointBuilder(componentName, path);
        }
    }

    /**
     * The builder of headers' name for the AWS StepFunctions component.
     */
    public static class StepFunctions2HeaderNameBuilder {
        /**
         * The internal instance of the builder used to access to all the
         * methods representing the name of headers.
         */
        private static final StepFunctions2HeaderNameBuilder INSTANCE = new StepFunctions2HeaderNameBuilder();

        /**
         * The operation we want to perform.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsStateMachineOperation}.
         */
        public String awsStateMachineOperation() {
            return "CamelAwsStateMachineOperation";
        }

        /**
         * The name of the state machine.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineName}.
         */
        public String awsStepFunctionsStateMachineName() {
            return "CamelAwsStepFunctionsStateMachineName";
        }

        /**
         * The Amazon States Language definition of the state machine.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineDefinition}.
         */
        public String awsStepFunctionsStateMachineDefinition() {
            return "CamelAwsStepFunctionsStateMachineDefinition";
        }

        /**
         * Determines whether a Standard or Express state machine is created.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineType}.
         */
        public String awsStepFunctionsStateMachineType() {
            return "CamelAwsStepFunctionsStateMachineType";
        }

        /**
         * The Amazon Resource Name (ARN) of the IAM role to use for this state
         * machine.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineRoleArn}.
         */
        public String awsStepFunctionsStateMachineRoleArn() {
            return "CamelAwsStepFunctionsStateMachineRoleArn";
        }

        /**
         * The Amazon Resource Name (ARN) of state machine.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineArn}.
         */
        public String awsStepFunctionsStateMachineArn() {
            return "CamelAwsStepFunctionsStateMachineArn";
        }

        /**
         * The limit number of results while listing state machines.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsStateMachinesMaxResults}.
         */
        public String awsStateMachinesMaxResults() {
            return "CamelAwsStateMachinesMaxResults";
        }

        /**
         * The name of the state machine activity.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineActivityName}.
         */
        public String awsStepFunctionsStateMachineActivityName() {
            return "CamelAwsStepFunctionsStateMachineActivityName";
        }

        /**
         * The ARN of the state machine activity.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStepFunctionsStateMachineActivityArn}.
         */
        public String awsStepFunctionsStateMachineActivityArn() {
            return "CamelAwsStepFunctionsStateMachineActivityArn";
        }

        /**
         * The limit number of results while listing state machines.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineActivitiesMaxResults}.
         */
        public String awsStateMachineActivitiesMaxResults() {
            return "CamelAwsStateMachineActivitiesMaxResults";
        }

        /**
         * The Amazon Resource Name (ARN) of the execution.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsStateMachineExecutionArn}.
         */
        public String awsStateMachineExecutionArn() {
            return "CamelAwsStateMachineExecutionArn";
        }

        /**
         * Optional name of the execution.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsStateMachineExecutionName}.
         */
        public String awsStateMachineExecutionName() {
            return "CamelAwsStateMachineExecutionName";
        }

        /**
         * The string that contains the JSON input data for the execution.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code AwsStateMachineExecutionInput}.
         */
        public String awsStateMachineExecutionInput() {
            return "CamelAwsStateMachineExecutionInput";
        }

        /**
         * Passes the X-Ray trace header.
         * 
         * The option is a: {@code String} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineExecutionTraceHeader}.
         */
        public String awsStateMachineExecutionTraceHeader() {
            return "CamelAwsStateMachineExecutionTraceHeader";
        }

        /**
         * The limit number of results while listing execution history.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineExecutionHistoryMaxResults}.
         */
        public String awsStateMachineExecutionHistoryMaxResults() {
            return "CamelAwsStateMachineExecutionHistoryMaxResults";
        }

        /**
         * You can select whether execution data (input or output of a history
         * event) is returned.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineExecutionHistoryIncludeExecutionData}.
         */
        public String awsStateMachineExecutionHistoryIncludeExecutionData() {
            return "CamelAwsStateMachineExecutionHistoryIncludeExecutionData";
        }

        /**
         * Lists events in descending order of their timeStamp.
         * 
         * The option is a: {@code Boolean} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineExecutionHistoryReverseOrder}.
         */
        public String awsStateMachineExecutionHistoryReverseOrder() {
            return "CamelAwsStateMachineExecutionHistoryReverseOrder";
        }

        /**
         * The limit number of results while listing executions.
         * 
         * The option is a: {@code Integer} type.
         * 
         * Group: producer
         * 
         * @return the name of the header {@code
         * AwsStateMachineExecutionMaxResults}.
         */
        public String awsStateMachineExecutionMaxResults() {
            return "CamelAwsStateMachineExecutionMaxResults";
        }
    }
    static StepFunctions2EndpointBuilder endpointBuilder(
            String componentName,
            String path) {
        class StepFunctions2EndpointBuilderImpl extends AbstractEndpointBuilder implements StepFunctions2EndpointBuilder, AdvancedStepFunctions2EndpointBuilder {
            public StepFunctions2EndpointBuilderImpl(String path) {
                super(componentName, path);
            }
        }
        return new StepFunctions2EndpointBuilderImpl(path);
    }
}