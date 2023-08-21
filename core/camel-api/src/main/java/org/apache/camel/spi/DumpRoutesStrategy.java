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
package org.apache.camel.spi;

import org.apache.camel.StaticService;

/**
 * Strategy for dumping routes during startup dump all loaded routes (incl rests and route templates).
 */
public interface DumpRoutesStrategy extends StaticService {

    /**
     * Service factory key.
     */
    String FACTORY = "dump-routes";

    /**
     * Dump routes
     *
     * @param format xml or yaml
     */
    void dumpRoutes(String format);

    String getInclude();

    /**
     * Controls what to include in output.
     *
     * Possible values: routes, rests, routeTemplates. Multiple values can be separated by comma. Default is routes.
     */
    void setInclude(String include);

    boolean isLog();

    /**
     * Whether to log route dumps to Logger
     */
    void setLog(boolean log);

    String getDirectory();

    /**
     * Whether to save route dumps to files in the given directory. The name of the files are based on ids (route ids,
     * etc.). Existing files will be overwritten.
     */
    void setDirectory(String directory);

    boolean isUriAsParameters();

    /**
     * When dumping to YAML format, then this option controls whether endpoint URIs should be expanded into a key/value
     * parameters.
     */
    void setUriAsParameters(boolean uriAsParameters);

}
