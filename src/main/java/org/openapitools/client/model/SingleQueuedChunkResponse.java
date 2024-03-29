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
import org.openapitools.client.model.ChunkMetadata;
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
 * SingleQueuedChunkResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:34:27.506198300-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class SingleQueuedChunkResponse {
  public static final String SERIALIZED_NAME_CHUNK_METADATA = "chunk_metadata";
  @SerializedName(SERIALIZED_NAME_CHUNK_METADATA)
  private ChunkMetadata chunkMetadata;

  public static final String SERIALIZED_NAME_POS_IN_QUEUE = "pos_in_queue";
  @SerializedName(SERIALIZED_NAME_POS_IN_QUEUE)
  private Integer posInQueue;

  public SingleQueuedChunkResponse() {
  }

  public SingleQueuedChunkResponse chunkMetadata(ChunkMetadata chunkMetadata) {
    this.chunkMetadata = chunkMetadata;
    return this;
  }

   /**
   * Get chunkMetadata
   * @return chunkMetadata
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public ChunkMetadata getChunkMetadata() {
    return chunkMetadata;
  }

  public void setChunkMetadata(ChunkMetadata chunkMetadata) {
    this.chunkMetadata = chunkMetadata;
  }


  public SingleQueuedChunkResponse posInQueue(Integer posInQueue) {
    this.posInQueue = posInQueue;
    return this;
  }

   /**
   * The current position the last access item is in the queue
   * @return posInQueue
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Integer getPosInQueue() {
    return posInQueue;
  }

  public void setPosInQueue(Integer posInQueue) {
    this.posInQueue = posInQueue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SingleQueuedChunkResponse singleQueuedChunkResponse = (SingleQueuedChunkResponse) o;
    return Objects.equals(this.chunkMetadata, singleQueuedChunkResponse.chunkMetadata) &&
        Objects.equals(this.posInQueue, singleQueuedChunkResponse.posInQueue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkMetadata, posInQueue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleQueuedChunkResponse {\n");
    sb.append("    chunkMetadata: ").append(toIndentedString(chunkMetadata)).append("\n");
    sb.append("    posInQueue: ").append(toIndentedString(posInQueue)).append("\n");
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
    openapiFields.add("chunk_metadata");
    openapiFields.add("pos_in_queue");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chunk_metadata");
    openapiRequiredFields.add("pos_in_queue");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SingleQueuedChunkResponse
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SingleQueuedChunkResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SingleQueuedChunkResponse is not found in the empty JSON string", SingleQueuedChunkResponse.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SingleQueuedChunkResponse.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SingleQueuedChunkResponse` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SingleQueuedChunkResponse.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `chunk_metadata`
      ChunkMetadata.validateJsonElement(jsonObj.get("chunk_metadata"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SingleQueuedChunkResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SingleQueuedChunkResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SingleQueuedChunkResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SingleQueuedChunkResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<SingleQueuedChunkResponse>() {
           @Override
           public void write(JsonWriter out, SingleQueuedChunkResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SingleQueuedChunkResponse read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SingleQueuedChunkResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SingleQueuedChunkResponse
  * @throws IOException if the JSON string is invalid with respect to SingleQueuedChunkResponse
  */
  public static SingleQueuedChunkResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SingleQueuedChunkResponse.class);
  }

 /**
  * Convert an instance of SingleQueuedChunkResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

