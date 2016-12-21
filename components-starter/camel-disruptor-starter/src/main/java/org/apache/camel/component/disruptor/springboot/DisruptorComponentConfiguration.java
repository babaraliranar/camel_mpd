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
package org.apache.camel.component.disruptor.springboot;

import org.apache.camel.component.disruptor.DisruptorComponent;
import org.apache.camel.component.disruptor.DisruptorProducerType;
import org.apache.camel.component.disruptor.DisruptorWaitStrategy;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

/**
 * The disruptor component provides asynchronous SEDA behavior using LMAX
 * Disruptor.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.disruptor")
public class DisruptorComponentConfiguration {

    /**
     * To configure the default number of concurrent consumers
     */
    private Integer defaultConcurrentConsumers = 1;
    /**
     * To configure the default value for multiple consumers
     */
    private Boolean defaultMultipleConsumers;
    /**
     * To configure the default value for DisruptorProducerType The default
     * value is Multi.
     */
    private DisruptorProducerType defaultProducerType = DisruptorProducerType.Multi;
    /**
     * To configure the default value for DisruptorWaitStrategy The default
     * value is Blocking.
     */
    private DisruptorWaitStrategy defaultWaitStrategy = DisruptorWaitStrategy.Blocking;
    /**
     * To configure the default value for block when full The default value is
     * true.
     */
    private Boolean defaultBlockWhenFull = true;
    /**
     * To configure the ring buffer size
     */
    @Deprecated
    private Integer queueSize;
    /**
     * To configure the ring buffer size
     */
    private Integer bufferSize = 1024;

    public Integer getDefaultConcurrentConsumers() {
        return defaultConcurrentConsumers;
    }

    public void setDefaultConcurrentConsumers(Integer defaultConcurrentConsumers) {
        this.defaultConcurrentConsumers = defaultConcurrentConsumers;
    }

    public Boolean getDefaultMultipleConsumers() {
        return defaultMultipleConsumers;
    }

    public void setDefaultMultipleConsumers(Boolean defaultMultipleConsumers) {
        this.defaultMultipleConsumers = defaultMultipleConsumers;
    }

    public DisruptorProducerType getDefaultProducerType() {
        return defaultProducerType;
    }

    public void setDefaultProducerType(DisruptorProducerType defaultProducerType) {
        this.defaultProducerType = defaultProducerType;
    }

    public DisruptorWaitStrategy getDefaultWaitStrategy() {
        return defaultWaitStrategy;
    }

    public void setDefaultWaitStrategy(DisruptorWaitStrategy defaultWaitStrategy) {
        this.defaultWaitStrategy = defaultWaitStrategy;
    }

    public Boolean getDefaultBlockWhenFull() {
        return defaultBlockWhenFull;
    }

    public void setDefaultBlockWhenFull(Boolean defaultBlockWhenFull) {
        this.defaultBlockWhenFull = defaultBlockWhenFull;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public Integer getQueueSize() {
        return queueSize;
    }

    @Deprecated
    public void setQueueSize(Integer queueSize) {
        this.queueSize = queueSize;
    }

    public Integer getBufferSize() {
        return bufferSize;
    }

    public void setBufferSize(Integer bufferSize) {
        this.bufferSize = bufferSize;
    }
}