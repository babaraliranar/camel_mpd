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
package org.apache.camel.component.fhir;

import java.util.Map;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.rest.client.api.IGenericClient;
import ca.uhn.fhir.rest.server.exceptions.ResourceGoneException;
import org.apache.camel.CamelContext;
import org.apache.camel.CamelExecutionException;
import org.apache.camel.test.infra.fhir.services.FhirServiceFactory;
import org.apache.camel.test.infra.fhir.services.FhirTestService;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.hl7.fhir.r4.model.Bundle;
import org.hl7.fhir.r4.model.HumanName;
import org.hl7.fhir.r4.model.Patient;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.RegisterExtension;

/**
 * Abstract base class for Fhir Integration tests generated by Camel API component maven plugin.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class AbstractFhirTestSupport extends CamelTestSupport {

    @RegisterExtension
    public static FhirTestService service = FhirServiceFactory.createSingletonService();

    protected Patient patient;
    FhirContext fhirContext;
    IGenericClient fhirClient;

    @BeforeEach
    public void cleanFhirServerState() {
        createPatient();
        Assumptions.assumeTrue(patientExists(), "The test cannot proceed: a patient was just created and it should exist");
    }

    boolean patientExists() {
        try {
            Bundle bundle
                    = fhirClient.search().byUrl("Patient?given=Vincent&family=Freeman").returnBundle(Bundle.class).execute();
            return !bundle.getEntry().isEmpty();
        } catch (ResourceGoneException e) {
            return false;
        }
    }

    private void deletePatient() {
        fhirClient.delete().resourceConditionalByUrl("Patient?given=Vincent&family=Freeman").execute();
    }

    private void createPatient() {
        this.patient = new Patient().addName(new HumanName().addGiven("Vincent").setFamily("Freeman")).setActive(false);
        this.patient.setId(fhirClient.create().resource(patient).execute().getId());
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        final CamelContext context = super.createCamelContext();
        this.fhirContext = new FhirContext(FhirVersionEnum.R4);
        this.fhirContext.getRestfulClientFactory().setSocketTimeout(60 * 1000);
        // Set proxy so that FHIR resource URLs returned by the server are using the correct host and port
        this.fhirContext.getRestfulClientFactory().setProxy(service.getHost(), service.getPort());
        this.fhirClient = this.fhirContext.newRestfulGenericClient(service.getServiceBaseURL());
        final FhirConfiguration configuration = new FhirConfiguration();
        configuration.setServerUrl(service.getServiceBaseURL());
        configuration.setFhirContext(this.fhirContext);

        // add FhirComponent to Camel context
        final FhirComponent component = new FhirComponent(context);
        component.setConfiguration(configuration);
        context.addComponent("fhir", component);
        return context;
    }

    @SuppressWarnings("unchecked")
    <T> T requestBodyAndHeaders(String endpointUri, Object body, Map<String, Object> headers)
            throws CamelExecutionException {
        return (T) template().requestBodyAndHeaders(endpointUri, body, headers);
    }

    @SuppressWarnings("unchecked")
    <T> T requestBody(String endpoint, Object body) throws CamelExecutionException {
        return (T) template().requestBody(endpoint, body);
    }
}
