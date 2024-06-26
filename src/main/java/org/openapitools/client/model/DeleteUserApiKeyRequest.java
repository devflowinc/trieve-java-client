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
import java.util.Arrays;
import java.util.UUID;
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
 * DeleteUserApiKeyRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:34:27.506198300-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class DeleteUserApiKeyRequest {
  public static final String SERIALIZED_NAME_API_KEY_ID = "api_key_id";
  @SerializedName(SERIALIZED_NAME_API_KEY_ID)
  private UUID apiKeyId;

  public DeleteUserApiKeyRequest() {
  }

  public DeleteUserApiKeyRequest apiKeyId(UUID apiKeyId) {
    this.apiKeyId = apiKeyId;
    return this;
  }

   /**
   * The id of the api key to delete.
   * @return apiKeyId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public UUID getApiKeyId() {
    return apiKeyId;
  }

  public void setApiKeyId(UUID apiKeyId) {
    this.apiKeyId = apiKeyId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteUserApiKeyRequest deleteUserApiKeyRequest = (DeleteUserApiKeyRequest) o;
    return Objects.equals(this.apiKeyId, deleteUserApiKeyRequest.apiKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiKeyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteUserApiKeyRequest {\n");
    sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
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
    openapiFields.add("api_key_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("api_key_id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DeleteUserApiKeyRequest
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DeleteUserApiKeyRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeleteUserApiKeyRequest is not found in the empty JSON string", DeleteUserApiKeyRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DeleteUserApiKeyRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeleteUserApiKeyRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DeleteUserApiKeyRequest.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("api_key_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_key_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_key_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeleteUserApiKeyRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeleteUserApiKeyRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeleteUserApiKeyRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeleteUserApiKeyRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<DeleteUserApiKeyRequest>() {
           @Override
           public void write(JsonWriter out, DeleteUserApiKeyRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeleteUserApiKeyRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeleteUserApiKeyRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeleteUserApiKeyRequest
  * @throws IOException if the JSON string is invalid with respect to DeleteUserApiKeyRequest
  */
  public static DeleteUserApiKeyRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeleteUserApiKeyRequest.class);
  }

 /**
  * Convert an instance of DeleteUserApiKeyRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

