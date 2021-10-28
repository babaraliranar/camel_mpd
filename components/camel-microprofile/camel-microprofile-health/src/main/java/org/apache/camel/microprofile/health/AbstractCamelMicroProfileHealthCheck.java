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
package org.apache.camel.microprofile.health;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.health.HealthCheck.Result;
import org.apache.camel.health.HealthCheck.State;
import org.apache.camel.health.HealthCheckFilter;
import org.apache.camel.health.HealthCheckHelper;
import org.apache.camel.impl.health.AbstractHealthCheck;
import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;

/**
 * Invokes Camel health checks and adds their results into the HealthCheckResponseBuilder
 */
public abstract class AbstractCamelMicroProfileHealthCheck implements HealthCheck, CamelContextAware {

    @Inject
    protected CamelContext camelContext;

    protected abstract boolean acceptHealthCheck(AbstractHealthCheck check);

    @Override
    public HealthCheckResponse call() {
        Map<String, Object> data = new HashMap<>();
        HealthCheckResponse.Status status = HealthCheckResponse.Status.UP;

        if (camelContext != null) {
            Collection<Result> results = HealthCheckHelper.invoke(camelContext,
                    (HealthCheckFilter) check -> check instanceof AbstractHealthCheck
                            && !acceptHealthCheck((AbstractHealthCheck) check));

            for (Result result : results) {
                Map<String, Object> details = result.getDetails();
                boolean enabled = true;

                if (details.containsKey(AbstractHealthCheck.CHECK_ENABLED)) {
                    enabled = (boolean) details.get(AbstractHealthCheck.CHECK_ENABLED);
                }

                if (enabled) {
                    result.getError().ifPresent(
                            error -> data.put(error.getMessage(), error));

                    data.putAll(details);

                    data.put(result.getCheck().getId(), result.getState().name());
                    if (result.getState() == State.DOWN) {
                        status = HealthCheckResponse.Status.DOWN;
                    }
                }
            }
        }

        return new HealthCheckResponse(getHealthCheckName(), status, data.isEmpty() ? Optional.empty() : Optional.of(data));
    }

    @Override
    public CamelContext getCamelContext() {
        return this.camelContext;
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    /**
     * Whether this health check can be used for readiness checks
     */
    public boolean isReadiness() {
        return true;
    }

    /**
     * Whether this health check can be used for liveness checks
     */
    public boolean isLiveness() {
        return true;
    }

    /**
     * Gets the name of the health check which will be used as a heading for the associated checks.
     *
     * @return the health check name
     */
    abstract String getHealthCheckName();
}
