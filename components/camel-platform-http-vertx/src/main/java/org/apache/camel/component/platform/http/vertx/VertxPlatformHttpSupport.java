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
package org.apache.camel.component.platform.http.vertx;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import io.vertx.core.MultiMap;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.core.net.SocketAddress;
import io.vertx.ext.web.RoutingContext;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.NoTypeConversionAvailableException;
import org.apache.camel.TypeConverter;
import org.apache.camel.spi.HeaderFilterStrategy;
import org.apache.camel.support.ExchangeHelper;
import org.apache.camel.support.MessageHelper;
import org.apache.camel.support.ObjectHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class VertxPlatformHttpSupport {
    private static final Logger LOGGER = LoggerFactory.getLogger(VertxPlatformHttpSupport.class);
    public static final String DEFAULT_CONTENT_TYPE_ON_EXCEPTION = "text/plain; charset=utf-8";

    private VertxPlatformHttpSupport() {
    }

    static Object toHttpResponse(
            HttpServerResponse response, Message message, HeaderFilterStrategy headerFilterStrategy,
            boolean muteExceptions) {
        final Exchange exchange = message.getExchange();

        final int code = determineResponseCode(exchange, message.getBody());
        response.setStatusCode(code);

        // copy headers from Message to Response
        if (headerFilterStrategy != null) {
            copyMessageHeadersToResponse(response, message, headerFilterStrategy, exchange);
        }

        final Object body = getBody(message, muteExceptions, exchange);

        // set the content-length if it can be determined, or chunked encoding
        final Integer length = determineContentLength(body);
        if (length != null) {
            response.putHeader("Content-Length", String.valueOf(length));
        } else {
            response.setChunked(true);
        }

        // set the content type in the response.
        final String contentType = MessageHelper.getContentType(message);
        if (contentType != null) {
            // set content-type
            response.putHeader("Content-Type", contentType);
        }
        return body;
    }

    private static Object getBody(Message message, boolean muteExceptions, Exchange exchange) {
        final Exception exception = exchange.getException();

        if (exception != null) {
            return handleExceptions(message, muteExceptions, exception, exchange);
        }
        return message.getBody();
    }

    private static Object handleExceptions(Message message, boolean muteExceptions, Exception exception, Exchange exchange) {
        Object body;
        if (muteExceptions) {
            body = ""; // do not include stacktrace in body
            // force content type to be text/plain as that is what the stacktrace is
            message.setHeader(Exchange.CONTENT_TYPE, DEFAULT_CONTENT_TYPE_ON_EXCEPTION);
        } else {
            // we failed due an exception so print it as plain text
            final StringWriter sw = new StringWriter();
            final PrintWriter pw = new PrintWriter(sw);
            exception.printStackTrace(pw);

            // the body should then be the stacktrace
            body = ByteBuffer.wrap(sw.toString().getBytes(StandardCharsets.UTF_8));
            // force content type to be text/plain as that is what the stacktrace is
            message.setHeader(Exchange.CONTENT_TYPE, DEFAULT_CONTENT_TYPE_ON_EXCEPTION);
        }

        // and mark the exception as failure handled, as we handled it by returning it as the response
        ExchangeHelper.setFailureHandled(exchange);
        return body;
    }

    private static void copyMessageHeadersToResponse(
            HttpServerResponse response, Message message, HeaderFilterStrategy headerFilterStrategy, Exchange exchange) {
        final TypeConverter tc = exchange.getContext().getTypeConverter();

        for (Map.Entry<String, Object> entry : message.getHeaders().entrySet()) {
            final String key = entry.getKey();
            final Object value = entry.getValue();
            // use an iterator as there can be multiple values. (must not use a delimiter)
            final Iterator<?> it = ObjectHelper.createIterator(value, null, true);

            putHeader(response, headerFilterStrategy, exchange, it, tc, key);
        }
    }

    private static void putHeader(
            HttpServerResponse response, HeaderFilterStrategy headerFilterStrategy, Exchange exchange, Iterator<?> it,
            TypeConverter tc, String key) {
        String firstValue = null;
        List<String> values = null;

        while (it.hasNext()) {
            final String headerValue = tc.convertTo(String.class, it.next());
            if (headerValue != null && !headerFilterStrategy.applyFilterToCamelHeaders(key, headerValue, exchange)) {
                if (firstValue == null) {
                    firstValue = headerValue;
                } else {
                    if (values == null) {
                        values = new ArrayList<>();
                        values.add(firstValue);
                    }
                    values.add(headerValue);
                }
            }
        }

        if (values != null) {
            response.putHeader(key, values);
        } else if (firstValue != null) {
            response.putHeader(key, firstValue);
        }
    }

    static Integer determineContentLength(Object body) {
        if (body instanceof byte[]) {
            return ((byte[]) body).length;
        } else if (body instanceof ByteBuffer) {
            return ((ByteBuffer) body).remaining();
        }
        return null;
    }

    /*
     * Copied from org.apache.camel.http.common.DefaultHttpBinding.determineResponseCode(Exchange, Object)
     * If DefaultHttpBinding.determineResponseCode(Exchange, Object) is moved to a module without the servlet-api
     * dependency we could eventually consume it from there.
     */
    static int determineResponseCode(Exchange camelExchange, Object body) {
        boolean failed = camelExchange.isFailed();
        int defaultCode = failed ? 500 : 200;

        Message message = camelExchange.getMessage();
        Integer currentCode = message.getHeader(Exchange.HTTP_RESPONSE_CODE, Integer.class);
        int codeToUse = currentCode == null ? defaultCode : currentCode;

        if (codeToUse != 500) {
            if (body == null || body instanceof String && ((String) body).isBlank()) {
                // no content
                codeToUse = currentCode == null ? 204 : currentCode;
            }
        }

        return codeToUse;
    }

    static void writeResponse(
            RoutingContext ctx, Exchange camelExchange, HeaderFilterStrategy headerFilterStrategy, boolean muteExceptions)
            throws Exception {
        final Object body = toHttpResponse(ctx.response(), camelExchange.getMessage(), headerFilterStrategy, muteExceptions);
        final HttpServerResponse response = ctx.response();

        if (body == null) {
            LOGGER.trace("No payload to send as reply for exchange: {}", camelExchange);
            response.end();
        } else if (body instanceof String) {
            response.end((String) body);
        } else if (body instanceof InputStream) {
            writeResponseAs(response, (InputStream) body);
        } else if (body instanceof Buffer) {
            response.end((Buffer) body);
        } else {
            writeResponseAsFallback(camelExchange, body, response);
        }
    }

    private static void writeResponseAsFallback(Exchange camelExchange, Object body, HttpServerResponse response)
            throws NoTypeConversionAvailableException, IOException {
        final TypeConverter tc = camelExchange.getContext().getTypeConverter();
        // Try to convert to ByteBuffer for performance reason
        final ByteBuffer bb = tc.tryConvertTo(ByteBuffer.class, camelExchange, body);
        if (bb != null) {
            writeResponseAs(response, bb);
        } else {
            // Otherwise fallback to most generic InputStream conversion
            final InputStream is = tc.mandatoryConvertTo(InputStream.class, camelExchange, body);
            writeResponseAs(response, is);
        }
    }

    private static void writeResponseAs(HttpServerResponse response, ByteBuffer bb) {
        final Buffer b = Buffer.buffer(bb.capacity());
        b.setBytes(0, bb);
        response.end(b);
    }

    private static void writeResponseAs(HttpServerResponse response, InputStream is) throws IOException {
        final byte[] bytes = new byte[4096];
        try (InputStream in = is) {
            int len;
            while ((len = in.read(bytes)) >= 0) {
                final Buffer b = Buffer.buffer(len);
                b.appendBytes(bytes, 0, len);
                response.write(b);
            }
        }
        response.end();
    }

    static void populateCamelHeaders(
            RoutingContext ctx,
            Map<String, Object> headersMap,
            Exchange exchange,
            HeaderFilterStrategy headerFilterStrategy) {

        final HttpServerRequest request = ctx.request();
        headersMap.put(Exchange.HTTP_PATH, ctx.normalizedPath());

        if (headerFilterStrategy != null) {
            applyHeaderFilterStrategy(ctx, headersMap, exchange, headerFilterStrategy, request);
        }

        // Path parameters
        for (Map.Entry<String, String> en : ctx.pathParams().entrySet()) {
            appendHeader(headersMap, en.getKey(), en.getValue());
        }

        SocketAddress localAddress = request.localAddress();
        if (localAddress != null) {
            headersMap.put(VertxPlatformHttpConstants.LOCAL_ADDRESS, localAddress);
        }

        SocketAddress remoteAddress = request.remoteAddress();
        if (remoteAddress != null) {
            headersMap.put(VertxPlatformHttpConstants.REMOTE_ADDRESS, remoteAddress);
        }

        // NOTE: these headers is applied using the same logic as camel-http/camel-jetty to be consistent
        headersMap.put(Exchange.HTTP_METHOD, request.method().toString());
        // strip query parameters from the uri
        headersMap.put(Exchange.HTTP_URL, request.absoluteURI());
        // uri is without the host and port
        headersMap.put(Exchange.HTTP_URI, request.uri());
        headersMap.put(Exchange.HTTP_QUERY, request.query());
        headersMap.put(Exchange.HTTP_RAW_QUERY, request.query());
    }

    private static void applyHeaderFilterStrategy(
            RoutingContext ctx, Map<String, Object> headersMap, Exchange exchange, HeaderFilterStrategy headerFilterStrategy,
            HttpServerRequest request) {
        final MultiMap requestHeaders = request.headers();
        final String authz = requestHeaders.get("authorization");
        // store a special header that this request was authenticated using HTTP Basic
        if (authz != null && authz.trim().startsWith("Basic")) {
            if (!headerFilterStrategy.applyFilterToExternalHeaders(Exchange.AUTHENTICATION, "Basic", exchange)) {
                appendHeader(headersMap, Exchange.AUTHENTICATION, "Basic");
            }
        }
        for (String name : requestHeaders.names()) {
            // add the headers one by one, and use the header filter strategy
            for (String value : requestHeaders.getAll(name)) {
                if (!headerFilterStrategy.applyFilterToExternalHeaders(name, value, exchange)) {
                    appendHeader(headersMap, name, value);
                }
            }
        }

        // process uri parameters as headers
        final MultiMap pathParameters = ctx.queryParams();
        // continue if the map is not empty, otherwise there are no params
        if (!pathParameters.isEmpty()) {
            for (String name : pathParameters.names()) {
                for (String value : pathParameters.getAll(name)) {
                    if (!headerFilterStrategy.applyFilterToExternalHeaders(name, value, exchange)) {
                        appendHeader(headersMap, name, value);
                    }
                }
            }
        }
    }

    @SuppressWarnings("unchecked")
    static void appendHeader(Map<String, Object> headers, String key, Object value) {
        if (headers.containsKey(key)) {
            value = addToList(headers, key, value);
        }

        headers.put(key, value);
    }

    private static Object addToList(Map<String, Object> headers, String key, Object value) {
        Object existing = headers.get(key);
        List<Object> list;
        if (existing instanceof List) {
            list = (List<Object>) existing;
        } else {
            list = new ArrayList<>();
            list.add(existing);
        }
        list.add(value);
        value = list;
        return value;
    }
}
