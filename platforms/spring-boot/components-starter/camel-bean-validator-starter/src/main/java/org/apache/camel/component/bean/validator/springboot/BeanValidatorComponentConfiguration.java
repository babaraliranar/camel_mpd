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
package org.apache.camel.component.bean.validator.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.ComponentConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * The Validator component performs bean validation of the message body using
 * the Java Bean Validation API.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.component.bean-validator")
public class BeanValidatorComponentConfiguration
        extends
            ComponentConfigurationPropertiesCommon {

    /**
     * Whether to enable auto configuration of the bean-validator component.
     * This is enabled by default.
     */
    private Boolean enabled;
    /**
     * Whether to ignore data from the META-INF/validation.xml file.
     */
    private Boolean ignoreXmlConfiguration = false;
    /**
     * To use a a custom ValidationProviderResolver. The option is a
     * javax.validation.ValidationProviderResolver type.
     */
    private String validationProviderResolver;
    /**
     * To use a custom MessageInterpolator. The option is a
     * javax.validation.MessageInterpolator type.
     */
    private String messageInterpolator;
    /**
     * To use a custom TraversableResolver. The option is a
     * javax.validation.TraversableResolver type.
     */
    private String traversableResolver;
    /**
     * To use a custom ConstraintValidatorFactory. The option is a
     * javax.validation.ConstraintValidatorFactory type.
     */
    private String constraintValidatorFactory;
    /**
     * Whether the component should use basic property binding (Camel 2.x) or
     * the newer property binding with additional capabilities
     */
    private Boolean basicPropertyBinding = false;
    /**
     * Whether the producer should be started lazy (on the first message). By
     * starting lazy you can use this to allow CamelContext and routes to
     * startup in situations where a producer may otherwise fail during starting
     * and cause the route to fail being started. By deferring this startup to
     * be lazy then the startup failure can be handled during routing messages
     * via Camel's routing error handlers. Beware that when the first message is
     * processed then creating and starting the producer may take a little time
     * and prolong the total processing time of the processing.
     */
    private Boolean lazyStartProducer = false;
    /**
     * Allows for bridging the consumer to the Camel routing Error Handler,
     * which mean any exceptions occurred while the consumer is trying to pickup
     * incoming messages, or the likes, will now be processed as a message and
     * handled by the routing Error Handler. By default the consumer will use
     * the org.apache.camel.spi.ExceptionHandler to deal with exceptions, that
     * will be logged at WARN or ERROR level and ignored.
     */
    private Boolean bridgeErrorHandler = false;

    public Boolean getIgnoreXmlConfiguration() {
        return ignoreXmlConfiguration;
    }

    public void setIgnoreXmlConfiguration(Boolean ignoreXmlConfiguration) {
        this.ignoreXmlConfiguration = ignoreXmlConfiguration;
    }

    public String getValidationProviderResolver() {
        return validationProviderResolver;
    }

    public void setValidationProviderResolver(String validationProviderResolver) {
        this.validationProviderResolver = validationProviderResolver;
    }

    public String getMessageInterpolator() {
        return messageInterpolator;
    }

    public void setMessageInterpolator(String messageInterpolator) {
        this.messageInterpolator = messageInterpolator;
    }

    public String getTraversableResolver() {
        return traversableResolver;
    }

    public void setTraversableResolver(String traversableResolver) {
        this.traversableResolver = traversableResolver;
    }

    public String getConstraintValidatorFactory() {
        return constraintValidatorFactory;
    }

    public void setConstraintValidatorFactory(String constraintValidatorFactory) {
        this.constraintValidatorFactory = constraintValidatorFactory;
    }

    public Boolean getBasicPropertyBinding() {
        return basicPropertyBinding;
    }

    public void setBasicPropertyBinding(Boolean basicPropertyBinding) {
        this.basicPropertyBinding = basicPropertyBinding;
    }

    public Boolean getLazyStartProducer() {
        return lazyStartProducer;
    }

    public void setLazyStartProducer(Boolean lazyStartProducer) {
        this.lazyStartProducer = lazyStartProducer;
    }

    public Boolean getBridgeErrorHandler() {
        return bridgeErrorHandler;
    }

    public void setBridgeErrorHandler(Boolean bridgeErrorHandler) {
        this.bridgeErrorHandler = bridgeErrorHandler;
    }
}