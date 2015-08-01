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
package org.apache.camel.impl;

import java.util.Collections;
import java.util.Map;

import org.apache.camel.spi.EndpointUtilizationStatistics;
import org.apache.camel.util.LRUCache;

public class DefaultEndpointUtilizationStatistics implements EndpointUtilizationStatistics {

    private final LRUCache<String, Long> map;

    public DefaultEndpointUtilizationStatistics(int maxCapacity) {
        this.map = new LRUCache<String, Long>(16, maxCapacity, false);
    }

    @Override
    public int maxCapacity() {
        return map.getMaxCacheSize();
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public synchronized void onHit(String uri) {
        Long counter = map.get(uri);
        if (counter == null) {
            counter = 1L;
            map.put(uri, counter);
        } else {
            counter++;
            map.put(uri, counter);
        }
    }

    @Override
    public void remove(String uri) {
        map.remove(uri);
    }

    @Override
    public Map<String, Long> getStatistics() {
        return Collections.unmodifiableMap(map);
    }

    @Override
    public void clear() {
        map.clear();
    }
}
