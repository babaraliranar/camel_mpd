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
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.ssh.SshComponent;

/**
 * The ssh component enables access to SSH servers such that you can send an SSH
 * command, and process the response.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface SshComponentBuilderFactory {

    /**
     * SSH (camel-ssh)
     * The ssh component enables access to SSH servers such that you can send an
     * SSH command, and process the response.
     * 
     * Category: file
     * Since: 2.10
     * Maven coordinates: org.apache.camel:camel-ssh
     */
    static SshComponentBuilder ssh() {
        return new SshComponentBuilderImpl();
    }

    /**
     * Builder for the SSH component.
     */
    interface SshComponentBuilder extends ComponentBuilder<SshComponent> {
        /**
         * To use the shared SSH configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.ssh.SshConfiguration</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default SshComponentBuilder setConfiguration(
                org.apache.camel.component.ssh.SshConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Sets the hostname of the remote SSH server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default SshComponentBuilder setHost(java.lang.String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Sets the port number for the remote SSH server.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default:
         * Group: common
         */
        default SshComponentBuilder setPort(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Sets the username to use in logging into the remote SSH server.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setUsername(java.lang.String username) {
            doSetProperty("username", username);
            return this;
        }
        /**
         * Sets the password to use in connecting to remote SSH server. Requires
         * keyPairProvider to be set to null.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setPassword(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * Sets the command string to send to the remote SSH server during every
         * poll cycle. Only works with camel-ssh component being used as a
         * consumer, i.e. from(ssh://...). You may need to end your command with
         * a newline, and that must be URL encoded %0A.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: common
         */
        default SshComponentBuilder setPollCommand(java.lang.String pollCommand) {
            doSetProperty("pollCommand", pollCommand);
            return this;
        }
        /**
         * Sets the KeyPairProvider reference to use when connecting using
         * Certificates to the remote SSH Server.
         * 
         * The option is a:
         * <code>org.apache.sshd.common.keyprovider.KeyPairProvider</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setKeyPairProvider(
                org.apache.sshd.common.keyprovider.KeyPairProvider keyPairProvider) {
            doSetProperty("keyPairProvider", keyPairProvider);
            return this;
        }
        /**
         * Sets the key type to pass to the KeyPairProvider as part of
         * authentication. KeyPairProvider.loadKey(...) will be passed this
         * value. Defaults to ssh-rsa.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setKeyType(java.lang.String keyType) {
            doSetProperty("keyType", keyType);
            return this;
        }
        /**
         * Sets the timeout in milliseconds to wait in establishing the remote
         * SSH server connection. Defaults to 30000 milliseconds.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default:
         * Group: common
         */
        default SshComponentBuilder setTimeout(long timeout) {
            doSetProperty("timeout", timeout);
            return this;
        }
        /**
         * Sets the resource path of the certificate to use for Authentication.
         * Will use ResourceHelperKeyPairProvider to resolve file based
         * certificate, and depends on keyType setting.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setCertResource(
                java.lang.String certResource) {
            doSetProperty("certResource", certResource);
            return this;
        }
        /**
         * Sets the password to use in loading certResource, if certResource is
         * an encrypted key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: security
         */
        default SshComponentBuilder setCertResourcePassword(
                java.lang.String certResourcePassword) {
            doSetProperty("certResourcePassword", certResourcePassword);
            return this;
        }
        /**
         * Sets the channel type to pass to the Channel as part of command
         * execution. Defaults to exec.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default SshComponentBuilder setChannelType(java.lang.String channelType) {
            doSetProperty("channelType", channelType);
            return this;
        }
        /**
         * Sets the shellPrompt to be dropped when response is read after
         * command execution.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default SshComponentBuilder setShellPrompt(java.lang.String shellPrompt) {
            doSetProperty("shellPrompt", shellPrompt);
            return this;
        }
        /**
         * Sets the sleep period in milliseconds to wait reading response from
         * shell prompt. Defaults to 100 milliseconds.
         * 
         * The option is a: <code>long</code> type.
         * 
         * Default:
         * Group: advanced
         */
        default SshComponentBuilder setSleepForShellPrompt(
                long sleepForShellPrompt) {
            doSetProperty("sleepForShellPrompt", sleepForShellPrompt);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default SshComponentBuilder setBasicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
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
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default SshComponentBuilder setLazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default SshComponentBuilder setBridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
    }

    class SshComponentBuilderImpl
            extends
                AbstractComponentBuilder<SshComponent>
            implements
                SshComponentBuilder {
        @Override
        protected SshComponent buildConcreteComponent() {
            return new SshComponent();
        }
    }
}