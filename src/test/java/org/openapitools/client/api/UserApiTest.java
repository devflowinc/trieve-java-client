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
import org.openapitools.client.model.ApiKeyDTO;
import org.openapitools.client.model.DeleteUserApiKeyRequest;
import org.openapitools.client.model.ErrorResponseBody;
import org.openapitools.client.model.SetUserApiKeyRequest;
import org.openapitools.client.model.SetUserApiKeyResponse;
import org.openapitools.client.model.SlimUser;
import org.openapitools.client.model.UpdateUserData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserApi
 */
@Disabled
public class UserApiTest {

    private final UserApi api = new UserApi();

    /**
     * Delete User Api Key
     *
     * Delete User Api Key  Delete an api key for the auth&#39;ed user.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUserApiKeyTest() throws ApiException {
        DeleteUserApiKeyRequest deleteUserApiKeyRequest = null;
        List<ApiKeyDTO> response = api.deleteUserApiKey(deleteUserApiKeyRequest);
        // TODO: test validations
    }

    /**
     * Set User Api Key
     *
     * Set User Api Key  Create a new api key for the auth&#39;ed user. Successful response will contain the newly created api key. If a write role is assigned the api key will have permission level of the auth&#39;ed user who calls this endpoint.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void setUserApiKeyTest() throws ApiException {
        SetUserApiKeyRequest setUserApiKeyRequest = null;
        SetUserApiKeyResponse response = api.setUserApiKey(setUserApiKeyRequest);
        // TODO: test validations
    }

    /**
     * Update User
     *
     * Update User  Update a user&#39;s information. If the user_id is not provided, the auth&#39;ed user will be updated. If the user_id is provided, the auth&#39;ed user must be an admin (1) or owner (2) of the organization.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUserTest() throws ApiException {
        UpdateUserData updateUserData = null;
        SlimUser response = api.updateUser(updateUserData);
        // TODO: test validations
    }

}