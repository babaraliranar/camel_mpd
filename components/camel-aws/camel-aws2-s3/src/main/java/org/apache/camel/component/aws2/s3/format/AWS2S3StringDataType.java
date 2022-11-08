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

package org.apache.camel.component.aws2.s3.format;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.Exchange;
import org.apache.camel.format.StringDataType;
import org.apache.camel.spi.OutputType;
import org.apache.camel.spi.annotations.DataType;
import software.amazon.awssdk.core.ResponseInputStream;
import software.amazon.awssdk.utils.IoUtils;

@DataType(scheme = "aws2-s3", name = "string")
public class AWS2S3StringDataType implements OutputType {

    @Override
    public void convertOut(Exchange exchange) {
        if (exchange.getIn().getBody() instanceof String) {
            return;
        }

        ResponseInputStream<?> bodyInputStream = exchange.getIn().getBody(ResponseInputStream.class);
        if (bodyInputStream != null) {
            try {
                exchange.getIn().setBody(IoUtils.toUtf8String(bodyInputStream));
                return;
            } catch (IOException e) {
                throw new CamelExecutionException("Failed to convert AWS S3 body to String", exchange, e);
            }
        }

        byte[] bodyContent = exchange.getIn().getBody(byte[].class);
        if (bodyContent != null) {
            exchange.getIn().setBody(new String(bodyContent, StandardCharsets.UTF_8));
            return;
        }

        new StringDataType().convertOut(exchange);
    }
}
