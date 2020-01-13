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

import java.util.Set;
import javax.annotation.Generated;
import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;
import org.apache.camel.spi.ExceptionHandler;

/**
 * The file-watch is used to monitor file events in directory using
 * java.nio.file.WatchService
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface FileWatchEndpointBuilderFactory {


    /**
     * Builder for endpoint for the file-watch component.
     */
    public interface FileWatchEndpointBuilder extends EndpointConsumerBuilder {
        default AdvancedFileWatchEndpointBuilder advanced() {
            return (AdvancedFileWatchEndpointBuilder) this;
        }
        /**
         * ANT style pattern to match files. The file is matched against path
         * relative to endpoint path. Pattern must be also relative (not
         * starting with slash).
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Default: **
         * Group: consumer
         */
        default FileWatchEndpointBuilder antInclude(String antInclude) {
            doSetProperty("antInclude", antInclude);
            return this;
        }
        /**
         * Auto create directory if does not exists.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder autoCreate(boolean autoCreate) {
            doSetProperty("autoCreate", autoCreate);
            return this;
        }
        /**
         * Auto create directory if does not exists.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder autoCreate(String autoCreate) {
            doSetProperty("autoCreate", autoCreate);
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
        default FileWatchEndpointBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
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
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default FileWatchEndpointBuilder bridgeErrorHandler(
                String bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * The number of concurrent consumers. Increase this value, if your
         * route is slow to prevent buffering in queue.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default FileWatchEndpointBuilder concurrentConsumers(
                int concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * The number of concurrent consumers. Increase this value, if your
         * route is slow to prevent buffering in queue.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default FileWatchEndpointBuilder concurrentConsumers(
                String concurrentConsumers) {
            doSetProperty("concurrentConsumers", concurrentConsumers);
            return this;
        }
        /**
         * Comma separated list of events to watch.
         * 
         * The option is a:
         * <code>java.util.Set&lt;org.apache.camel.component.file.watch.constants.FileEventEnum&gt;</code> type.
         * 
         * Default: CREATE,MODIFY,DELETE
         * Group: consumer
         */
        default FileWatchEndpointBuilder events(Set<FileEventEnum> events) {
            doSetProperty("events", events);
            return this;
        }
        /**
         * Comma separated list of events to watch.
         * 
         * The option will be converted to a
         * <code>java.util.Set&lt;org.apache.camel.component.file.watch.constants.FileEventEnum&gt;</code> type.
         * 
         * Default: CREATE,MODIFY,DELETE
         * Group: consumer
         */
        default FileWatchEndpointBuilder events(String events) {
            doSetProperty("events", events);
            return this;
        }
        /**
         * Reference to io.methvin.watcher.hashing.FileHasher. This prevents
         * emitting duplicate events on some platforms. For working with large
         * files and if you dont need detect multiple modifications per second
         * per file, use #lastModifiedTimeFileHasher. You can also provide
         * custom implementation in registry.
         * 
         * The option is a: <code>io.methvin.watcher.hashing.FileHasher</code>
         * type.
         * 
         * Default: #murmur3FFileHasher
         * Group: consumer
         */
        default FileWatchEndpointBuilder fileHasher(Object fileHasher) {
            doSetProperty("fileHasher", fileHasher);
            return this;
        }
        /**
         * Reference to io.methvin.watcher.hashing.FileHasher. This prevents
         * emitting duplicate events on some platforms. For working with large
         * files and if you dont need detect multiple modifications per second
         * per file, use #lastModifiedTimeFileHasher. You can also provide
         * custom implementation in registry.
         * 
         * The option will be converted to a
         * <code>io.methvin.watcher.hashing.FileHasher</code> type.
         * 
         * Default: #murmur3FFileHasher
         * Group: consumer
         */
        default FileWatchEndpointBuilder fileHasher(String fileHasher) {
            doSetProperty("fileHasher", fileHasher);
            return this;
        }
        /**
         * The number of threads polling WatchService. Increase this value, if
         * you see OVERFLOW messages in log.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default FileWatchEndpointBuilder pollThreads(int pollThreads) {
            doSetProperty("pollThreads", pollThreads);
            return this;
        }
        /**
         * The number of threads polling WatchService. Increase this value, if
         * you see OVERFLOW messages in log.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 1
         * Group: consumer
         */
        default FileWatchEndpointBuilder pollThreads(String pollThreads) {
            doSetProperty("pollThreads", pollThreads);
            return this;
        }
        /**
         * Maximum size of queue between WatchService and consumer. Unbounded by
         * default.
         * 
         * The option is a: <code>int</code> type.
         * 
         * Default: 2147483647
         * Group: consumer
         */
        default FileWatchEndpointBuilder queueSize(int queueSize) {
            doSetProperty("queueSize", queueSize);
            return this;
        }
        /**
         * Maximum size of queue between WatchService and consumer. Unbounded by
         * default.
         * 
         * The option will be converted to a <code>int</code> type.
         * 
         * Default: 2147483647
         * Group: consumer
         */
        default FileWatchEndpointBuilder queueSize(String queueSize) {
            doSetProperty("queueSize", queueSize);
            return this;
        }
        /**
         * Watch recursive in current and child directories (including newly
         * created directories).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder recursive(boolean recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * Watch recursive in current and child directories (including newly
         * created directories).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder recursive(String recursive) {
            doSetProperty("recursive", recursive);
            return this;
        }
        /**
         * Enables or disables file hashing to detect duplicate events. If you
         * disable this, you can get some events multiple times on some
         * platforms and JDKs. Check java.nio.file.WatchService limitations for
         * your target platform.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder useFileHashing(boolean useFileHashing) {
            doSetProperty("useFileHashing", useFileHashing);
            return this;
        }
        /**
         * Enables or disables file hashing to detect duplicate events. If you
         * disable this, you can get some events multiple times on some
         * platforms and JDKs. Check java.nio.file.WatchService limitations for
         * your target platform.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: true
         * Group: consumer
         */
        default FileWatchEndpointBuilder useFileHashing(String useFileHashing) {
            doSetProperty("useFileHashing", useFileHashing);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the file-watch component.
     */
    public interface AdvancedFileWatchEndpointBuilder
            extends
                EndpointConsumerBuilder {
        default FileWatchEndpointBuilder basic() {
            return (FileWatchEndpointBuilder) this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option is a: <code>org.apache.camel.spi.ExceptionHandler</code>
         * type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedFileWatchEndpointBuilder exceptionHandler(
                ExceptionHandler exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * To let the consumer use a custom ExceptionHandler. Notice if the
         * option bridgeErrorHandler is enabled then this option is not in use.
         * By default the consumer will deal with exceptions, that will be
         * logged at WARN or ERROR level and ignored.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.spi.ExceptionHandler</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedFileWatchEndpointBuilder exceptionHandler(
                String exceptionHandler) {
            doSetProperty("exceptionHandler", exceptionHandler);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option is a: <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedFileWatchEndpointBuilder exchangePattern(
                ExchangePattern exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Sets the exchange pattern when the consumer creates an exchange.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.ExchangePattern</code> type.
         * 
         * Group: consumer (advanced)
         */
        default AdvancedFileWatchEndpointBuilder exchangePattern(
                String exchangePattern) {
            doSetProperty("exchangePattern", exchangePattern);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder basicPropertyBinding(
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
         * Default: false
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder synchronous(boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedFileWatchEndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.file.watch.constants.FileEventEnum</code> enum.
     */
    enum FileEventEnum {
        CREATE,
        DELETE,
        MODIFY;
    }
    /**
     * file-watch (camel-file-watch)
     * The file-watch is used to monitor file events in directory using
     * java.nio.file.WatchService
     * 
     * Category: file
     * Since: 3.0
     * Maven coordinates: org.apache.camel:camel-file-watch
     * 
     * Syntax: <code>file-watch:path</code>
     * 
     * Path parameter: path (required)
     * Path of directory to consume events from.
     */
    static FileWatchEndpointBuilder fileWatch(String path) {
        class FileWatchEndpointBuilderImpl extends AbstractEndpointBuilder implements FileWatchEndpointBuilder, AdvancedFileWatchEndpointBuilder {
            public FileWatchEndpointBuilderImpl(String path) {
                super("file-watch", path);
            }
        }
        return new FileWatchEndpointBuilderImpl(path);
    }
}