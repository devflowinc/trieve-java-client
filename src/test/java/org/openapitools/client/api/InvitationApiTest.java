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
import org.openapitools.client.model.InvitationData;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvitationApi
 */
@Disabled
public class InvitationApiTest {

    private final InvitationApi api = new InvitationApi();

    /**
     * Send Invitation
     *
     * Send Invitation  Invitations act as a way to invite users to join an organization. After a user is invited, they will automatically be added to the organization with the role specified in the invitation once they set their.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postInvitationTest() throws ApiException {
        String trOrganization = null;
        InvitationData invitationData = null;
        api.postInvitation(trOrganization, invitationData);
        // TODO: test validations
    }

}
