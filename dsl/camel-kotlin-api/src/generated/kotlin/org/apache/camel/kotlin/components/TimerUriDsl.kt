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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import org.apache.camel.kotlin.CamelDslMarker
import org.apache.camel.kotlin.UriDsl

public fun UriDsl.timer(i: TimerUriDsl.() -> Unit) {
  TimerUriDsl(this).apply(i)
}

@CamelDslMarker
public class TimerUriDsl(
  it: UriDsl,
) {
  private val it: UriDsl

  init {
    this.it = it
    this.it.component("timer")
  }

  private var timerName: String = ""

  public fun timerName(timerName: String) {
    this.timerName = timerName
    it.url("$timerName")
  }

  public fun delay(delay: String) {
    it.property("delay", delay)
  }

  public fun fixedRate(fixedRate: String) {
    it.property("fixedRate", fixedRate)
  }

  public fun fixedRate(fixedRate: Boolean) {
    it.property("fixedRate", fixedRate.toString())
  }

  public fun includeMetadata(includeMetadata: String) {
    it.property("includeMetadata", includeMetadata)
  }

  public fun includeMetadata(includeMetadata: Boolean) {
    it.property("includeMetadata", includeMetadata.toString())
  }

  public fun period(period: String) {
    it.property("period", period)
  }

  public fun repeatCount(repeatCount: String) {
    it.property("repeatCount", repeatCount)
  }

  public fun repeatCount(repeatCount: Int) {
    it.property("repeatCount", repeatCount.toString())
  }

  public fun bridgeErrorHandler(bridgeErrorHandler: String) {
    it.property("bridgeErrorHandler", bridgeErrorHandler)
  }

  public fun bridgeErrorHandler(bridgeErrorHandler: Boolean) {
    it.property("bridgeErrorHandler", bridgeErrorHandler.toString())
  }

  public fun exceptionHandler(exceptionHandler: String) {
    it.property("exceptionHandler", exceptionHandler)
  }

  public fun exchangePattern(exchangePattern: String) {
    it.property("exchangePattern", exchangePattern)
  }

  public fun daemon(daemon: String) {
    it.property("daemon", daemon)
  }

  public fun daemon(daemon: Boolean) {
    it.property("daemon", daemon.toString())
  }

  public fun pattern(pattern: String) {
    it.property("pattern", pattern)
  }

  public fun synchronous(synchronous: String) {
    it.property("synchronous", synchronous)
  }

  public fun synchronous(synchronous: Boolean) {
    it.property("synchronous", synchronous.toString())
  }

  public fun time(time: String) {
    it.property("time", time)
  }

  public fun timer(timer: String) {
    it.property("timer", timer)
  }

  public fun runLoggingLevel(runLoggingLevel: String) {
    it.property("runLoggingLevel", runLoggingLevel)
  }
}
