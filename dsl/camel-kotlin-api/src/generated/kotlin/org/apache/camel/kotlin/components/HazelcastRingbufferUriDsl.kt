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
package org.apache.camel.kotlin.components

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

/**
 * Perform operations on Hazelcast distributed ringbuffer.
 */
public fun UriDsl.`hazelcast-ringbuffer`(i: HazelcastRingbufferUriDsl.() -> Unit) {
  HazelcastRingbufferUriDsl(this).apply(i)
}

@CamelDslMarker
public class HazelcastRingbufferUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("hazelcast-ringbuffer")
  }

  private var cacheName: String = ""

  /**
   * The name of the cache
   */
  public fun cacheName(cacheName: String) {
    this.cacheName = cacheName
    it.url("$cacheName")
  }

  /**
   * To specify a default operation to use, if no operation header has been provided.
   */
  public fun defaultOperation(defaultOperation: String) {
    it.property("defaultOperation", defaultOperation)
  }

  /**
   * Hazelcast configuration file.
   */
  public fun hazelcastConfigUri(hazelcastConfigUri: String) {
    it.property("hazelcastConfigUri", hazelcastConfigUri)
  }

  /**
   * The hazelcast instance reference which can be used for hazelcast endpoint.
   */
  public fun hazelcastInstance(hazelcastInstance: String) {
    it.property("hazelcastInstance", hazelcastInstance)
  }

  /**
   * The hazelcast instance reference name which can be used for hazelcast endpoint. If you don't
   * specify the instance reference, camel use the default hazelcast instance from the camel-hazelcast
   * instance.
   */
  public fun hazelcastInstanceName(hazelcastInstanceName: String) {
    it.property("hazelcastInstanceName", hazelcastInstanceName)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: String) {
    it.property("lazyStartProducer", lazyStartProducer)
  }

  /**
   * Whether the producer should be started lazy (on the first message). By starting lazy you can
   * use this to allow CamelContext and routes to startup in situations where a producer may otherwise
   * fail during starting and cause the route to fail being started. By deferring this startup to be
   * lazy then the startup failure can be handled during routing messages via Camel's routing error
   * handlers. Beware that when the first message is processed then creating and starting the producer
   * may take a little time and prolong the total processing time of the processing.
   */
  public fun lazyStartProducer(lazyStartProducer: Boolean) {
    it.property("lazyStartProducer", lazyStartProducer.toString())
  }
}
