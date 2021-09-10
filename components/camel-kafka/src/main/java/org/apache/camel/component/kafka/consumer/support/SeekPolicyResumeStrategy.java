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

package org.apache.camel.component.kafka.consumer.support;

import java.time.Duration;

import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A resume strategy that uses Camel's seekTo configuration for resuming
 */
public class SeekPolicyResumeStrategy implements ResumeStrategy {
    private static final Logger LOG = LoggerFactory.getLogger(SeekPolicyResumeStrategy.class);

    private final String seekPolicy;
    private final KafkaConsumer<?, ?> consumer;

    public SeekPolicyResumeStrategy(KafkaConsumer<?, ?> consumer, String seekPolicy) {
        this.seekPolicy = seekPolicy;
        this.consumer = consumer;
    }

    @Override
    public void resume() {
        if (seekPolicy.equals("beginning")) {
            LOG.debug("Seeking from the beginning of topic");
            // This poll to ensure we have an assigned partition
            // otherwise seek won't work
            consumer.poll(Duration.ofMillis(100));
            consumer.seekToBeginning(consumer.assignment());
        } else if (seekPolicy.equals("end")) {
            LOG.debug("Seeking from the end off the topic");
            // This poll to ensure we have an assigned partition
            // otherwise seek won't work
            consumer.poll(Duration.ofMillis(100));
            consumer.seekToEnd(consumer.assignment());
        }
    }
}
