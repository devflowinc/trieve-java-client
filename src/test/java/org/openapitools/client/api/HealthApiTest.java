/*
 * Trieve API
 * Trieve OpenAPI Specification. This document describes all of the operations available through the Trieve API.
 *
 * The version of the OpenAPI document: 0.5.0
 * Contact: developers@trieve.ai
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.ErrorResponseBody;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HealthApi
 */
@Disabled
public class HealthApiTest {

    private final HealthApi api = new HealthApi();

    /**
     * Health Check
     *
     * Health Check  Confirmation that the service is healthy and can make embedding vectors
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void healthCheckTest() throws ApiException {
        api.healthCheck();
        // TODO: test validations
    }

}