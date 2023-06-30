/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.fhir.api.FhirUpdate;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.fhir.api.FhirUpdate
 */
public enum FhirUpdateApiMethod implements ApiMethod {

    RESOURCE(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resource",
        arg("resource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCE_1(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resource",
        arg("resource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("stringId", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCE_2(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resource",
        arg("resourceAsString", String.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCE_3(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resource",
        arg("resourceAsString", String.class),
        arg("stringId", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCE_BY_SEARCH_URL(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resourceBySearchUrl",
        arg("resource", org.hl7.fhir.instance.model.api.IBaseResource.class),
        arg("url", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    RESOURCE_BY_SEARCH_URL_1(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "resourceBySearchUrl",
        arg("resourceAsString", String.class),
        arg("url", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class));

    private final ApiMethod apiMethod;

    private FhirUpdateApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FhirUpdate.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
