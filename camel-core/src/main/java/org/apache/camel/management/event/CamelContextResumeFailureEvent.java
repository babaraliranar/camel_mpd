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
package org.apache.camel.management.event;

import java.util.EventObject;

import org.apache.camel.CamelContext;

/**
 */
public class CamelContextResumeFailureEvent extends EventObject {
    private static final long serialVersionUID = -4271899927507894566L;

    private CamelContext context;
    private Throwable cause;

    public CamelContextResumeFailureEvent(CamelContext context, Throwable cause) {
        super(context);
        this.context = context;
        this.cause = cause;
    }

    public CamelContext getContext() {
        return context;
    }

    public Throwable getCause() {
        return cause;
    }

    @Override
    public String toString() {
        return "Failed to resume Camel: " + context.getName() + " due to " + cause.getMessage();
    }
}
