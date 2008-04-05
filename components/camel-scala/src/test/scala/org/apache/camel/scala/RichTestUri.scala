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
package org.apache.camel.scala;

import org.apache.camel.component.mock.MockEndpoint

class RichTestUri(uri: String, support: ScalaTestSupport) {

  def !(messages: Any*) = {
    for (message <- messages) {
      support.getTemplate().sendBody(uri, message)
    }
  }

  def expect(block: MockEndpoint => Unit) = {
    val mock = support.mock(uri)
    block(mock)
  }

  def assert() = support.mock(uri).assertIsSatisfied()

}
