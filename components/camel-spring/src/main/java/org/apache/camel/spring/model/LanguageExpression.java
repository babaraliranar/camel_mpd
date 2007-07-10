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
package org.apache.camel.spring.model;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

/**
 * Represents a parameterised language expression
 *
 * @version $Revision: 1.1 $
 */
@XmlRootElement(name = "expression")
public class LanguageExpression implements LanguageExpressionSupport{
    private String language;
    private String expression;

    public LanguageExpression() {
    }

    public LanguageExpression(String language, String expression) {
        setLanguage(language);
        setExpression(expression);
    }

    @Override
    public String toString() {
        return getLanguage() + "Expression[" + getExpression() + "]";
    }

    @XmlAttribute
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @XmlValue
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }
}
