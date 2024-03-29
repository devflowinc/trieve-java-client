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
import org.openapitools.client.model.CreateMessageData;
import org.openapitools.client.model.EditMessageData;
import org.openapitools.client.model.ErrorResponseBody;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.RegenerateMessageData;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessageApi
 */
@Disabled
public class MessageApiTest {

    private final MessageApi api = new MessageApi();

    /**
     * Create a message
     *
     * Create a message  Create a message. Messages are attached to topics in order to coordinate memory of gen-AI chat sessions. We are considering refactoring this resource of the API soon. Currently, you can only send user messages. If the topic is a RAG topic then the response will include Chunks first on the stream. The structure will look like &#x60;[chunks]||mesage&#x60;. See docs.trieve.ai for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createMessageCompletionHandlerTest() throws ApiException {
        String trDataset = null;
        CreateMessageData createMessageData = null;
        String response = api.createMessageCompletionHandler(trDataset, createMessageData);
        // TODO: test validations
    }

    /**
     * Edit a message
     *
     * Edit a message  Edit a message which exists within the topic&#39;s chat history. This will delete the message and replace it with a new message. The new message will be generated by the AI based on the new content provided in the request body. The response will include Chunks first on the stream if the topic is using RAG. The structure will look like &#x60;[chunks]||mesage&#x60;. See docs.trieve.ai for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void editMessageHandlerTest() throws ApiException {
        String trDataset = null;
        EditMessageData editMessageData = null;
        api.editMessageHandler(trDataset, editMessageData);
        // TODO: test validations
    }

    /**
     * Get all messages for a given topic
     *
     * Get all messages for a given topic  Get all messages for a given topic. If the topic is a RAG topic then the response will include Chunks first on each message. The structure will look like &#x60;[chunks]||mesage&#x60;. See docs.trieve.ai for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllTopicMessagesTest() throws ApiException {
        String trDataset = null;
        UUID messagesTopicId = null;
        List<Message> response = api.getAllTopicMessages(trDataset, messagesTopicId);
        // TODO: test validations
    }

    /**
     * Regenerate message
     *
     * Regenerate message  Regenerate the assistant response to the last user message of a topic. This will delete the last message and replace it with a new message. The response will include Chunks first on the stream if the topic is using RAG. The structure will look like &#x60;[chunks]||mesage&#x60;. See docs.trieve.ai for more information.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void regenerateMessageHandlerTest() throws ApiException {
        String trDataset = null;
        RegenerateMessageData regenerateMessageData = null;
        String response = api.regenerateMessageHandler(trDataset, regenerateMessageData);
        // TODO: test validations
    }

}
