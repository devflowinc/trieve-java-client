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
 * DatasetUsageCount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class DatasetUsageCount {
  public static final String SERIALIZED_NAME_CHUNK_COUNT = "chunk_count";
  @SerializedName(SERIALIZED_NAME_CHUNK_COUNT)
  private Integer chunkCount;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private UUID datasetId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public DatasetUsageCount() {
  }

  public DatasetUsageCount chunkCount(Integer chunkCount) {
    this.chunkCount = chunkCount;
    return this;
  }

   /**
   * Get chunkCount
   * @return chunkCount
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Integer getChunkCount() {
    return chunkCount;
  }

  public void setChunkCount(Integer chunkCount) {
    this.chunkCount = chunkCount;
  }


  public DatasetUsageCount datasetId(UUID datasetId) {
    this.datasetId = datasetId;
    return this;
  }

   /**
   * Get datasetId
   * @return datasetId
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public UUID getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(UUID datasetId) {
    this.datasetId = datasetId;
  }


  public DatasetUsageCount id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetUsageCount datasetUsageCount = (DatasetUsageCount) o;
    return Objects.equals(this.chunkCount, datasetUsageCount.chunkCount) &&
        Objects.equals(this.datasetId, datasetUsageCount.datasetId) &&
        Objects.equals(this.id, datasetUsageCount.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkCount, datasetId, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetUsageCount {\n");
    sb.append("    chunkCount: ").append(toIndentedString(chunkCount)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    openapiFields.add("chunk_count");
    openapiFields.add("dataset_id");
    openapiFields.add("id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chunk_count");
    openapiRequiredFields.add("dataset_id");
    openapiRequiredFields.add("id");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetUsageCount
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetUsageCount.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetUsageCount is not found in the empty JSON string", DatasetUsageCount.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetUsageCount.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetUsageCount` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatasetUsageCount.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("dataset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetUsageCount.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetUsageCount' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetUsageCount> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetUsageCount.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetUsageCount>() {
           @Override
           public void write(JsonWriter out, DatasetUsageCount value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetUsageCount read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetUsageCount given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetUsageCount
  * @throws IOException if the JSON string is invalid with respect to DatasetUsageCount
  */
  public static DatasetUsageCount fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetUsageCount.class);
  }

 /**
  * Convert an instance of DatasetUsageCount to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
