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
package org.apache.camel.component.rest.openapi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.Operation;
import org.apache.camel.AsyncCallback;
import org.apache.camel.AsyncProducer;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.Endpoint;
import org.apache.camel.Exchange;
import org.apache.camel.NonManagedService;
import org.apache.camel.Route;
import org.apache.camel.RuntimeCamelException;
import org.apache.camel.spi.PackageScanResourceResolver;
import org.apache.camel.spi.ProducerCache;
import org.apache.camel.spi.Resource;
import org.apache.camel.support.ExchangeHelper;
import org.apache.camel.support.PluginHelper;
import org.apache.camel.support.cache.DefaultProducerCache;
import org.apache.camel.support.service.ServiceHelper;
import org.apache.camel.support.service.ServiceSupport;
import org.apache.camel.util.FileUtil;
import org.apache.camel.util.IOHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Default {@link RestOpenapiProcessorStrategy} that links the Rest DSL to routes called via direct:operationId.
 */
public class DefaultRestOpenapiProcessorStrategy extends ServiceSupport
        implements RestOpenapiProcessorStrategy, CamelContextAware, NonManagedService {

    private static final Logger LOG = LoggerFactory.getLogger(DefaultRestOpenapiProcessorStrategy.class);

    private CamelContext camelContext;
    private ProducerCache producerCache;
    private String component = "direct";
    private String missingOperation;
    private String mockIncludePattern;

    @Override
    public void validateOpenApi(OpenAPI openAPI) throws Exception {
        List<String> ids = new ArrayList<>();
        for (var e : openAPI.getPaths().entrySet()) {
            for (var o : e.getValue().readOperations()) {
                String id = o.getOperationId();
                ids.add(component + "://" + id);
            }
        }
        // should have routes with all
        List<String> existing = new ArrayList<>();
        for (Route route : camelContext.getRoutes()) {
            String base = route.getEndpoint().getEndpointBaseUri();
            existing.add(base);
        }

        // all ids must have a route
        ids.removeAll(existing);
        if (!ids.isEmpty()) {
            String missing = ids.stream()
                    .sorted()
                    .map(id -> id.replace("://", ":"))
                    .collect(Collectors.joining("\n\t"));
            String msg = String.format(
                    "OpenAPI specification has %d unmapped operations to corresponding routes: %n\t%s",
                    ids.size(),
                    missing);

            if ("fail".equalsIgnoreCase(missingOperation)) {
                throw new IllegalArgumentException(msg);
            } else if ("ignore".equalsIgnoreCase(missingOperation)) {
                LOG.warn(msg + ". This validation error is ignored.");
            } else if ("mock".equalsIgnoreCase(missingOperation)) {
                LOG.debug(msg + ". This validation error is ignored (Will return a mocked/empty response).");
            }
        }
    }

    @Override
    public boolean process(Operation operation, String path, Exchange exchange, AsyncCallback callback) {
        if ("mock".equalsIgnoreCase(missingOperation)) {
            // check if there is a route
            Endpoint e = camelContext.hasEndpoint(component + ":" + operation.getOperationId());
            if (e == null) {
                loadMockData(operation, path, exchange);
                callback.done(true);
                return true;
            }
        }

        Endpoint e = camelContext.getEndpoint(component + ":" + operation.getOperationId());
        AsyncProducer p = producerCache.acquireProducer(e);
        return p.process(exchange, doneSync -> {
            try {
                producerCache.releaseProducer(e, p);
            } finally {
                callback.done(doneSync);
            }
        });
    }

    private void loadMockData(Operation operation, String path, Exchange exchange) {
        final PackageScanResourceResolver resolver = PluginHelper.getPackageScanResourceResolver(camelContext);
        final String[] includes = mockIncludePattern != null ? mockIncludePattern.split(",") : null;

        Collection<Resource> accepted = new ArrayList<>();
        for (String include : includes) {
            try {
                for (Resource resource : resolver.findResources(include)) {
                    accepted.add(resource);
                }
            } catch (Exception e) {
                throw RuntimeCamelException.wrapRuntimeException(e);
            }
        }

        boolean json = false;
        boolean xml = false;
        String ct = ExchangeHelper.getContentType(exchange);
        if (ct != null) {
            json = ct.contains("json");
            xml = ct.contains("xml");
        }

        Resource found = null;
        for (Resource resource : accepted) {
            String target = FileUtil.stripFirstLeadingSeparator(path);
            String loc = FileUtil.stripExt(FileUtil.compactPath(resource.getLocation(), '/'));
            String onlyExt = FileUtil.onlyExt(resource.getLocation());
            boolean match = loc.endsWith(target);
            boolean matchExt = !json && !xml || json && onlyExt.equals("json") || xml && onlyExt.equals("xml");
            if (match && matchExt) {
                found = resource;
                break;
            }
        }
        if (found != null) {
            try {
                // use the mock data as response
                exchange.getMessage().setHeader(Exchange.HTTP_RESPONSE_CODE, 200);
                exchange.getMessage().setBody(IOHelper.loadText(found.getInputStream()));
            } catch (Exception e) {
                // ignore
            }
        } else {
            // no mock data, so return an empty response
            exchange.getMessage().setHeader(Exchange.HTTP_RESPONSE_CODE, 204);
            exchange.getMessage().setBody("");
        }
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    public String getComponent() {
        return component;
    }

    /**
     * Name of component to use for processing the Rest DSL requests.
     */
    public void setComponent(String component) {
        this.component = component;
    }

    public String getMissingOperation() {
        return missingOperation;
    }

    public void setMissingOperation(String missingOperation) {
        this.missingOperation = missingOperation;
    }

    @Override
    public String getMockIncludePattern() {
        return mockIncludePattern;
    }

    @Override
    public void setMockIncludePattern(String mockIncludePattern) {
        this.mockIncludePattern = mockIncludePattern;
    }

    @Override
    protected void doInit() throws Exception {
        producerCache = new DefaultProducerCache(this, getCamelContext(), 1000);
        ServiceHelper.initService(producerCache);

        // automatic adjust missing operation to fail, and ignore if you use developer mode
        if (missingOperation == null) {
            boolean dev = "dev".equalsIgnoreCase(camelContext.getCamelContextExtension().getProfile());
            missingOperation = dev ? "mock" : "fail";
        }
    }

    @Override
    protected void doStart() throws Exception {
        ServiceHelper.startService(producerCache);
    }

    @Override
    protected void doStop() throws Exception {
        ServiceHelper.stopService(producerCache);
    }

}
