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
package org.apache.camel.component.netty4.http;

import io.netty.util.ResourceLeakDetector;
import io.netty.util.internal.logging.InternalLoggerFactory;
import org.junit.Assert;
import org.junit.Test;

/**
 * This test ensures LogCaptureAppender is configured properly
 */
public class LogCaptureTest {
    @Test
    public void testCapture() {
        InternalLoggerFactory.getInstance(ResourceLeakDetector.class).error("testError");
        Assert.assertFalse(LogCaptureAppender.getEvents().isEmpty());
        LogCaptureAppender.reset();
    }
}
