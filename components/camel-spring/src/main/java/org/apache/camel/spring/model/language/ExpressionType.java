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
package org.apache.camel.spring.model.language;

import javax.xml.bind.annotation.XmlValue;

/**
 * A useful base class for an expression
 *
 * @version $Revision: 1.1 $
 */
public abstract class ExpressionType {
    private String expression;

    public abstract String getLanguage();

    protected ExpressionType() {
    }

    protected ExpressionType(String expression) {
        this.expression = expression;
    }

    @Override
    public String toString() {
        return getLanguage() + "Expression[" + getExpression() + "]";
    }

    @XmlValue
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}