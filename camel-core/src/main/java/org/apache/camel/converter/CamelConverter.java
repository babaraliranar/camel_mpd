/**
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.converter;

import org.apache.camel.Converter;
import org.apache.camel.Processor;
import org.apache.camel.Predicate;
import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Expression;

/**
 * Some useful converters for Camel APIs such as to convert a {@link Predicate} or {@link Expression}
 * to a {@link Processor}
 *
 * @version $Revision: 1.1 $
 */
@Converter
public class CamelConverter {
    @Converter
    public Processor toProcessor(final Predicate<Exchange> predicate) {
        return new Processor() {
            public void process(Exchange exchange) throws Exception {
                boolean answer = predicate.matches(exchange);
                Message out = exchange.getOut();
                out.copyFrom(exchange.getIn());
                out.setBody(answer);
            }
        };

    }
    
    @Converter
    public Processor toProcessor(final Expression<Exchange> expresion) {
        return new Processor() {
            public void process(Exchange exchange) throws Exception {
                Object answer = expresion.evaluate(exchange);
                Message out = exchange.getOut();
                out.copyFrom(exchange.getIn());
                out.setBody(answer);
            }
        };
    }
}
