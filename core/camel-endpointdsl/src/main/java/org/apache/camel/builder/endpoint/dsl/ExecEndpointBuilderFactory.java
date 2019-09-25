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

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The exec component can be used to execute OS system commands.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface ExecEndpointBuilderFactory {


    /**
     * Builder for endpoint for the Exec component.
     */
    public interface ExecEndpointBuilder extends EndpointProducerBuilder {
        default AdvancedExecEndpointBuilder advanced() {
            return (AdvancedExecEndpointBuilder) this;
        }
        /**
         * The arguments may be one or many whitespace-separated tokens.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder args(String args) {
            doSetProperty("args", args);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecBinding in the Registry.
         * 
         * The option is a:
         * <code>org.apache.camel.component.exec.ExecBinding</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder binding(Object binding) {
            doSetProperty("binding", binding);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecBinding in the Registry.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.exec.ExecBinding</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder binding(String binding) {
            doSetProperty("binding", binding);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecCommandExecutor in the
         * Registry that customizes the command execution. The default command
         * executor utilizes the commons-exec library, which adds a shutdown
         * hook for every executed command.
         * 
         * The option is a:
         * <code>org.apache.camel.component.exec.ExecCommandExecutor</code>
         * type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder commandExecutor(Object commandExecutor) {
            doSetProperty("commandExecutor", commandExecutor);
            return this;
        }
        /**
         * A reference to a org.apache.commons.exec.ExecCommandExecutor in the
         * Registry that customizes the command execution. The default command
         * executor utilizes the commons-exec library, which adds a shutdown
         * hook for every executed command.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.exec.ExecCommandExecutor</code>
         * type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder commandExecutor(String commandExecutor) {
            doSetProperty("commandExecutor", commandExecutor);
            return this;
        }
        /**
         * The name of a file, created by the executable, that should be
         * considered as its output. If no outFile is set, the standard output
         * (stdout) of the executable will be used instead.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder outFile(String outFile) {
            doSetProperty("outFile", outFile);
            return this;
        }
        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. If execution has not completed within the timeout, the
         * component will send a termination request.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder timeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * The timeout, in milliseconds, after which the executable should be
         * terminated. If execution has not completed within the timeout, the
         * component will send a termination request.
         * 
         * The option will be converted to a <code>long</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder timeout(String timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * A boolean indicating that when stdout is empty, this component will
         * populate the Camel Message Body with stderr. This behavior is
         * disabled (false) by default.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder useStderrOnEmptyStdout(
                boolean useStderrOnEmptyStdout) {
            doSetProperty("useStderrOnEmptyStdout", useStderrOnEmptyStdout);
            return this;
        }
        /**
         * A boolean indicating that when stdout is empty, this component will
         * populate the Camel Message Body with stderr. This behavior is
         * disabled (false) by default.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder useStderrOnEmptyStdout(
                String useStderrOnEmptyStdout) {
            doSetProperty("useStderrOnEmptyStdout", useStderrOnEmptyStdout);
            return this;
        }
        /**
         * The directory in which the command should be executed. If null, the
         * working directory of the current process will be used.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default ExecEndpointBuilder workingDir(String workingDir) {
            doSetProperty("workingDir", workingDir);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the Exec component.
     */
    public interface AdvancedExecEndpointBuilder
            extends
                EndpointProducerBuilder {
        default ExecEndpointBuilder basic() {
            return (ExecEndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedExecEndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedExecEndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedExecEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Group: advanced
         */
        default AdvancedExecEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }
    /**
     * Exec (camel-exec)
     * The exec component can be used to execute OS system commands.
     * 
     * Category: system
     * Available as of version: 2.3
     * Maven coordinates: org.apache.camel:camel-exec
     * 
     * Syntax: <code>exec:executable</code>
     * 
     * Path parameter: executable (required)
     * Sets the executable to be executed. The executable must not be empty or
     * null.
     */
    default ExecEndpointBuilder exec(String path) {
        class ExecEndpointBuilderImpl extends AbstractEndpointBuilder implements ExecEndpointBuilder, AdvancedExecEndpointBuilder {
            public ExecEndpointBuilderImpl(String path) {
                super("exec", path);
            }
        }
        return new ExecEndpointBuilderImpl(path);
    }
}