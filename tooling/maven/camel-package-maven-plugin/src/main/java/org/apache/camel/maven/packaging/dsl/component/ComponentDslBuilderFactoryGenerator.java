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
package org.apache.camel.maven.packaging.dsl.component;

import java.util.Objects;

import javax.annotation.Generated;

import org.apache.camel.maven.packaging.ComponentDslMojo;
import org.apache.camel.maven.packaging.dsl.DslHelper;
import org.apache.camel.tooling.model.ComponentModel;
import org.apache.camel.tooling.util.JavadocHelper;
import org.apache.camel.tooling.util.srcgen.JavaClass;
import org.apache.camel.tooling.util.srcgen.Method;

/**
 * DSL Generator class that generates main component specific builder factory, e.g: KafkaComponentBuilderFactory
 */
public final class ComponentDslBuilderFactoryGenerator {
    private static final String BUILDER_FACTORY_SUFFIX = "BuilderFactory";

    private final ComponentModel componentModel;
    private final String packageName;
    private final JavaClass javaClass;
    private ComponentDslInnerBuilderGenerator componentDslInnerBuilderGenerator;
    private ComponentDslInnerImplBuilderGenerator componentDslInnerImplBuilderGenerator;

    private ComponentDslBuilderFactoryGenerator(final ComponentModel componentModel, final ClassLoader classLoader,
                                                final String packageName) {
        this.componentModel = componentModel;
        this.packageName = packageName;

        javaClass = new JavaClass(classLoader);
        // generate java class
        generateJavaClass();
    }

    public static ComponentDslBuilderFactoryGenerator generateClass(
            final ComponentModel componentModel, final ClassLoader classLoader, final String componentDslPackageName) {
        Objects.requireNonNull(componentModel);
        Objects.requireNonNull(classLoader);

        return new ComponentDslBuilderFactoryGenerator(componentModel, classLoader, componentDslPackageName);
    }

    public static String getExpectedGeneratedClassName(final ComponentModel componentModel) {
        return DslHelper.generateComponentBuilderClassName(componentModel, BUILDER_FACTORY_SUFFIX);
    }

    public String printClassAsString() {
        return javaClass.printClass(true);
    }

    @Override
    public String toString() {
        return printClassAsString();
    }

    public String getGeneratedClassName() {
        return getExpectedGeneratedClassName(componentModel);
    }

    public ComponentDslInnerBuilderGenerator getComponentDslInnerBuilderGenerator() {
        return componentDslInnerBuilderGenerator;
    }

    public ComponentDslInnerImplBuilderGenerator getComponentDslInnerImplBuilderGenerator() {
        return componentDslInnerImplBuilderGenerator;
    }

    private void generateJavaClass() {
        setPackage();
        setImports();
        setJavaDoc();
        setMainAnnotations();
        setBuilderFactoryClassNameAndType();
        componentDslInnerBuilderGenerator
                = ComponentDslInnerBuilderGenerator.generateClass(javaClass.addNestedType(), componentModel);
        componentDslInnerImplBuilderGenerator = ComponentDslInnerImplBuilderGenerator.generateClass(javaClass.addNestedType(),
                componentModel, componentDslInnerBuilderGenerator.getGeneratedInterfaceName());
        setDslEntryMethod(componentDslInnerBuilderGenerator.getGeneratedInterfaceName(),
                componentDslInnerImplBuilderGenerator.getGeneratedClassName());
    }

    private void setPackage() {
        javaClass.setPackage(packageName + ".dsl");
    }

    private void setImports() {
        javaClass.addImport("org.apache.camel.Component");
        javaClass.addImport(packageName + ".AbstractComponentBuilder");
        javaClass.addImport(packageName + ".ComponentBuilder");
        javaClass.addImport(componentModel.getJavaType());
    }

    private void setJavaDoc() {
        String doc = "Generated by camel-package-maven-plugin - do not edit this file!";
        if (!componentModel.getDescription().isEmpty()) {
            doc = componentModel.getDescription() + "\n\n" + doc;
        }
        // must xml encode description as in some rare cases it contains & chars which is invalid javadoc
        doc = JavadocHelper.xmlEncode(doc);
        javaClass.getJavaDoc().setText(doc);
    }

    private void setMainAnnotations() {
        javaClass.addAnnotation(Generated.class).setStringValue("value", ComponentDslMojo.class.getName());
    }

    private void setBuilderFactoryClassNameAndType() {
        javaClass.setClass(false)
                .setName(getGeneratedClassName());

    }

    private void setDslEntryMethod(final String innerBuilderInterfaceName, final String innerBuilderImplName) {
        final Method method = javaClass.addMethod()
                .setStatic()
                .setReturnType(innerBuilderInterfaceName)
                .setName(DslHelper.toCamelCaseLower(componentModel.getScheme()))
                .setBody(String.format("return new %s();", innerBuilderImplName));

        if (componentModel.isDeprecated()) {
            method.addAnnotation(Deprecated.class);
        }

        String doc = DslHelper.getMainDescriptionWithoutPathOptions(componentModel);
        // must xml encode description as in some rare cases it contains & chars which is invalid javadoc
        doc = JavadocHelper.xmlEncode(doc);
        doc += "\n\n@return the dsl builder\n";
        method.getJavaDoc().setText(doc);
    }
}
