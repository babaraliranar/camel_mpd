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
package org.apache.camel.management.mbean;

import java.util.Set;
import java.util.stream.Collectors;

import org.apache.camel.CamelContext;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedVariableRepositoryMBean;
import org.apache.camel.spi.BrowsableVariableRepository;

@ManagedResource(description = "Managed VariableRepository")
public class ManagedVariableRepository extends ManagedService implements ManagedVariableRepositoryMBean {
    private final BrowsableVariableRepository variableRepository;

    public ManagedVariableRepository(CamelContext context, BrowsableVariableRepository variableRepository) {
        super(context, variableRepository);
        this.variableRepository = variableRepository;
    }

    public BrowsableVariableRepository getVariableRepository() {
        return variableRepository;
    }

    @Override
    public String getId() {
        return variableRepository.getId();
    }

    @Override
    public int getSize() {
        return variableRepository.size();
    }

    @Override
    public void clear() {
        variableRepository.clear();
    }

    @Override
    public Set<String> names() {
        return variableRepository.names().collect(Collectors.toSet());
    }
}
