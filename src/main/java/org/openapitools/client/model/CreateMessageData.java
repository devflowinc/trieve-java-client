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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CreateMessageData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class CreateMessageData {
  public static final String SERIALIZED_NAME_HIGHLIGHT_CITATIONS = "highlight_citations";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_CITATIONS)
  private Boolean highlightCitations;

  public static final String SERIALIZED_NAME_HIGHLIGHT_DELIMITERS = "highlight_delimiters";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_DELIMITERS)
  private List<String> highlightDelimiters;

  public static final String SERIALIZED_NAME_MODEL = "model";
  @SerializedName(SERIALIZED_NAME_MODEL)
  private String model;

  public static final String SERIALIZED_NAME_NEW_MESSAGE_CONTENT = "new_message_content";
  @SerializedName(SERIALIZED_NAME_NEW_MESSAGE_CONTENT)
  private String newMessageContent;

  public static final String SERIALIZED_NAME_STREAM_RESPONSE = "stream_response";
  @SerializedName(SERIALIZED_NAME_STREAM_RESPONSE)
  private Boolean streamResponse;

  public static final String SERIALIZED_NAME_TOPIC_ID = "topic_id";
  @SerializedName(SERIALIZED_NAME_TOPIC_ID)
  private UUID topicId;

  public CreateMessageData() {
  }

  public CreateMessageData highlightCitations(Boolean highlightCitations) {
    this.highlightCitations = highlightCitations;
    return this;
  }

   /**
   * Whether or not to highlight the citations in the response. If this is set to true or not included, the citations will be highlighted. If this is set to false, the citations will not be highlighted. Default is true.
   * @return highlightCitations
  **/
  @javax.annotation.Nullable

  public Boolean getHighlightCitations() {
    return highlightCitations;
  }

  public void setHighlightCitations(Boolean highlightCitations) {
    this.highlightCitations = highlightCitations;
  }


  public CreateMessageData highlightDelimiters(List<String> highlightDelimiters) {
    this.highlightDelimiters = highlightDelimiters;
    return this;
  }

  public CreateMessageData addHighlightDelimitersItem(String highlightDelimitersItem) {
    if (this.highlightDelimiters == null) {
      this.highlightDelimiters = new ArrayList<>();
    }
    this.highlightDelimiters.add(highlightDelimitersItem);
    return this;
  }

   /**
   * The delimiters to use for highlighting the citations. If this is not included, the default delimiters will be used. Default is &#x60;[\&quot;.\&quot;, \&quot;!\&quot;, \&quot;?\&quot;, \&quot;\\n\&quot;, \&quot;\\t\&quot;, \&quot;,\&quot;]&#x60;.
   * @return highlightDelimiters
  **/
  @javax.annotation.Nullable

  public List<String> getHighlightDelimiters() {
    return highlightDelimiters;
  }

  public void setHighlightDelimiters(List<String> highlightDelimiters) {
    this.highlightDelimiters = highlightDelimiters;
  }


  public CreateMessageData model(String model) {
    this.model = model;
    return this;
  }

   /**
   * The model to use for the assistant&#39;s messages. This can be any model from the openrouter model list. If no model is provided, gpt-3.5-turbo will be used.
   * @return model
  **/
  @javax.annotation.Nullable

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }


  public CreateMessageData newMessageContent(String newMessageContent) {
    this.newMessageContent = newMessageContent;
    return this;
  }

   /**
   * The content of the user message to attach to the topic and then generate an assistant message in response to.
   * @return newMessageContent
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getNewMessageContent() {
    return newMessageContent;
  }

  public void setNewMessageContent(String newMessageContent) {
    this.newMessageContent = newMessageContent;
  }


  public CreateMessageData streamResponse(Boolean streamResponse) {
    this.streamResponse = streamResponse;
    return this;
  }

   /**
   * Whether or not to stream the response. If this is set to true or not included, the response will be a stream. If this is set to false, the response will be a normal JSON response. Default is true.
   * @return streamResponse
  **/
  @javax.annotation.Nullable

  public Boolean getStreamResponse() {
    return streamResponse;
  }

  public void setStreamResponse(Boolean streamResponse) {
    this.streamResponse = streamResponse;
  }


  public CreateMessageData topicId(UUID topicId) {
    this.topicId = topicId;
    return this;
  }

   /**
   * The ID of the topic to attach the message to.
   * @return topicId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public UUID getTopicId() {
    return topicId;
  }

  public void setTopicId(UUID topicId) {
    this.topicId = topicId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMessageData createMessageData = (CreateMessageData) o;
    return Objects.equals(this.highlightCitations, createMessageData.highlightCitations) &&
        Objects.equals(this.highlightDelimiters, createMessageData.highlightDelimiters) &&
        Objects.equals(this.model, createMessageData.model) &&
        Objects.equals(this.newMessageContent, createMessageData.newMessageContent) &&
        Objects.equals(this.streamResponse, createMessageData.streamResponse) &&
        Objects.equals(this.topicId, createMessageData.topicId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(highlightCitations, highlightDelimiters, model, newMessageContent, streamResponse, topicId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMessageData {\n");
    sb.append("    highlightCitations: ").append(toIndentedString(highlightCitations)).append("\n");
    sb.append("    highlightDelimiters: ").append(toIndentedString(highlightDelimiters)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    newMessageContent: ").append(toIndentedString(newMessageContent)).append("\n");
    sb.append("    streamResponse: ").append(toIndentedString(streamResponse)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("highlight_citations");
    openapiFields.add("highlight_delimiters");
    openapiFields.add("model");
    openapiFields.add("new_message_content");
    openapiFields.add("stream_response");
    openapiFields.add("topic_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("new_message_content");
    openapiRequiredFields.add("topic_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CreateMessageData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CreateMessageData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateMessageData is not found in the empty JSON string", CreateMessageData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CreateMessageData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateMessageData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateMessageData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("highlight_delimiters") != null && !jsonObj.get("highlight_delimiters").isJsonNull() && !jsonObj.get("highlight_delimiters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `highlight_delimiters` to be an array in the JSON string but got `%s`", jsonObj.get("highlight_delimiters").toString()));
      }
      if ((jsonObj.get("model") != null && !jsonObj.get("model").isJsonNull()) && !jsonObj.get("model").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `model` to be a primitive type in the JSON string but got `%s`", jsonObj.get("model").toString()));
      }
      if (!jsonObj.get("new_message_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `new_message_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("new_message_content").toString()));
      }
      if (!jsonObj.get("topic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `topic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("topic_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateMessageData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateMessageData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateMessageData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateMessageData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateMessageData>() {
           @Override
           public void write(JsonWriter out, CreateMessageData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateMessageData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateMessageData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateMessageData
  * @throws IOException if the JSON string is invalid with respect to CreateMessageData
  */
  public static CreateMessageData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateMessageData.class);
  }

 /**
  * Convert an instance of CreateMessageData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
