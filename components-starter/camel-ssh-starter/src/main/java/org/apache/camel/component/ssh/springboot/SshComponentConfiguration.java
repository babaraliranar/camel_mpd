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
package org.apache.camel.component.ssh.springboot;

import org.apache.sshd.common.KeyPairProvider;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The ssh component enables access to SSH servers such that you can send an SSH
 * command and process the response.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.ssh")
public class SshComponentConfiguration {

    /**
     * To use the shared SSH configuration
     */
    private SshConfigurationNestedConfiguration configuration;
    /**
     * Sets the hostname of the remote SSH server.
     */
    private String host;
    /**
     * Sets the port number for the remote SSH server.
     */
    private Integer port;
    /**
     * Sets the username to use in logging into the remote SSH server.
     */
    private String username;
    /**
     * Sets the password to use in connecting to remote SSH server. Requires
     * keyPairProvider to be set to null.
     */
    private String password;
    /**
     * Sets the command string to send to the remote SSH server during every
     * poll cycle. Only works with camel-ssh component being used as a consumer
     * i.e. from(ssh://...). You may need to end your command with a newline and
     * that must be URL encoded 0A
     */
    private String pollCommand;
    /**
     * Sets the KeyPairProvider reference to use when connecting using
     * Certificates to the remote SSH Server.
     */
    @NestedConfigurationProperty
    private KeyPairProvider keyPairProvider;
    /**
     * Sets the key type to pass to the KeyPairProvider as part of
     * authentication. KeyPairProvider.loadKey(...) will be passed this value.
     * Defaults to ssh-rsa.
     */
    private String keyType;
    /**
     * Sets the timeout in milliseconds to wait in establishing the remote SSH
     * server connection. Defaults to 30000 milliseconds.
     */
    private Long timeout;
    /**
     * Sets the resource path of the certificate to use for Authentication.
     */
    @Deprecated
    private String certFilename;
    /**
     * Sets the resource path of the certificate to use for Authentication. Will
     * use ResourceHelperKeyPairProvider to resolve file based certificate and
     * depends on keyType setting.
     */
    private String certResource;

    public SshConfigurationNestedConfiguration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(
            SshConfigurationNestedConfiguration configuration) {
        this.configuration = configuration;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPollCommand() {
        return pollCommand;
    }

    public void setPollCommand(String pollCommand) {
        this.pollCommand = pollCommand;
    }

    public KeyPairProvider getKeyPairProvider() {
        return keyPairProvider;
    }

    public void setKeyPairProvider(KeyPairProvider keyPairProvider) {
        this.keyPairProvider = keyPairProvider;
    }

    public String getKeyType() {
        return keyType;
    }

    public void setKeyType(String keyType) {
        this.keyType = keyType;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    @Deprecated
    @DeprecatedConfigurationProperty
    public String getCertFilename() {
        return certFilename;
    }

    @Deprecated
    public void setCertFilename(String certFilename) {
        this.certFilename = certFilename;
    }

    public String getCertResource() {
        return certResource;
    }

    public void setCertResource(String certResource) {
        this.certResource = certResource;
    }

    public static class SshConfigurationNestedConfiguration {
        public static final Class CAMEL_NESTED_CLASS = org.apache.camel.component.ssh.SshConfiguration.class;
        /**
         * Sets the username to use in logging into the remote SSH server.
         * 
         * @param username
         *            String representing login username.
         */
        private String username;
        /**
         * Sets the hostname of the remote SSH server.
         * 
         * @param host
         *            String representing hostname of SSH server.
         */
        private String host;
        /**
         * Sets the port number for the remote SSH server.
         * 
         * @param port
         *            int representing port number on remote host. Defaults to
         *            22.
         */
        private Integer port;
        /**
         * Sets the password to use in connecting to remote SSH server. Requires
         * keyPairProvider to be set to null.
         * 
         * @param password
         *            String representing password for username at remote host.
         */
        private String password;
        /**
         * Sets the command string to send to the remote SSH server during every
         * poll cycle. Only works with camel-ssh component being used as a
         * consumer, i.e. from("ssh://...") You may need to end your command
         * with a newline, and that must be URL encoded %0A
         * 
         * @param pollCommand
         *            String representing the command to send.
         */
        private String pollCommand;
        /**
         * Sets the KeyPairProvider reference to use when connecting using
         * Certificates to the remote SSH Server.
         * 
         * @param keyPairProvider
         *            KeyPairProvider reference to use in authenticating. If set
         *            to 'null', then will attempt to connect using
         *            username/password settings.
         * @see KeyPairProvider
         */
        @NestedConfigurationProperty
        private KeyPairProvider keyPairProvider;
        /**
         * Sets the key type to pass to the KeyPairProvider as part of
         * authentication. KeyPairProvider.loadKey(...) will be passed this
         * value. Defaults to "ssh-rsa".
         * 
         * @param keyType
         *            String defining the type of KeyPair to use for
         *            authentication.
         * @see KeyPairProvider
         */
        private String keyType = "KeyPairProvider.SSH_RSA";
        /**
         * Sets the timeout in milliseconds to wait in establishing the remote
         * SSH server connection. Defaults to 30000 milliseconds.
         * 
         * @param timeout
         *            long milliseconds to wait.
         */
        private Long timeout;
        /**
         * @deprecated As of version 2.11, replaced by
         *             {@link #setCertResource(String)}
         */
        @Deprecated
        private String certFilename;
        /**
         * Sets the resource path of the certificate to use for Authentication.
         * Will use {@link ResourceHelperKeyPairProvider} to resolve file based
         * certificate, and depends on keyType setting.
         * 
         * @param certResource
         *            String file, classpath, or http url for the certificate
         */
        private String certResource;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public Integer getPort() {
            return port;
        }

        public void setPort(Integer port) {
            this.port = port;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPollCommand() {
            return pollCommand;
        }

        public void setPollCommand(String pollCommand) {
            this.pollCommand = pollCommand;
        }

        public KeyPairProvider getKeyPairProvider() {
            return keyPairProvider;
        }

        public void setKeyPairProvider(KeyPairProvider keyPairProvider) {
            this.keyPairProvider = keyPairProvider;
        }

        public String getKeyType() {
            return keyType;
        }

        public void setKeyType(String keyType) {
            this.keyType = keyType;
        }

        public Long getTimeout() {
            return timeout;
        }

        public void setTimeout(Long timeout) {
            this.timeout = timeout;
        }

        @Deprecated
        @DeprecatedConfigurationProperty
        public String getCertFilename() {
            return certFilename;
        }

        @Deprecated
        public void setCertFilename(String certFilename) {
            this.certFilename = certFilename;
        }

        public String getCertResource() {
            return certResource;
        }

        public void setCertResource(String certResource) {
            this.certResource = certResource;
        }
    }
}