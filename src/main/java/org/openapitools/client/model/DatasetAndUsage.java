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
import org.openapitools.client.model.DatasetDTO;
import org.openapitools.client.model.DatasetUsageCount;
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
 * DatasetAndUsage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class DatasetAndUsage {
  public static final String SERIALIZED_NAME_DATASET = "dataset";
  @SerializedName(SERIALIZED_NAME_DATASET)
  private DatasetDTO dataset;

  public static final String SERIALIZED_NAME_DATASET_USAGE = "dataset_usage";
  @SerializedName(SERIALIZED_NAME_DATASET_USAGE)
  private DatasetUsageCount datasetUsage;

  public DatasetAndUsage() {
  }

  public DatasetAndUsage dataset(DatasetDTO dataset) {
    this.dataset = dataset;
    return this;
  }

   /**
   * Get dataset
   * @return dataset
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public DatasetDTO getDataset() {
    return dataset;
  }

  public void setDataset(DatasetDTO dataset) {
    this.dataset = dataset;
  }


  public DatasetAndUsage datasetUsage(DatasetUsageCount datasetUsage) {
    this.datasetUsage = datasetUsage;
    return this;
  }

   /**
   * Get datasetUsage
   * @return datasetUsage
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public DatasetUsageCount getDatasetUsage() {
    return datasetUsage;
  }

  public void setDatasetUsage(DatasetUsageCount datasetUsage) {
    this.datasetUsage = datasetUsage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatasetAndUsage datasetAndUsage = (DatasetAndUsage) o;
    return Objects.equals(this.dataset, datasetAndUsage.dataset) &&
        Objects.equals(this.datasetUsage, datasetAndUsage.datasetUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataset, datasetUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatasetAndUsage {\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
    sb.append("    datasetUsage: ").append(toIndentedString(datasetUsage)).append("\n");
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
    openapiFields.add("dataset");
    openapiFields.add("dataset_usage");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dataset");
    openapiRequiredFields.add("dataset_usage");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to DatasetAndUsage
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!DatasetAndUsage.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in DatasetAndUsage is not found in the empty JSON string", DatasetAndUsage.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!DatasetAndUsage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DatasetAndUsage` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : DatasetAndUsage.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `dataset`
      DatasetDTO.validateJsonElement(jsonObj.get("dataset"));
      // validate the required field `dataset_usage`
      DatasetUsageCount.validateJsonElement(jsonObj.get("dataset_usage"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DatasetAndUsage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DatasetAndUsage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DatasetAndUsage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DatasetAndUsage.class));

       return (TypeAdapter<T>) new TypeAdapter<DatasetAndUsage>() {
           @Override
           public void write(JsonWriter out, DatasetAndUsage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DatasetAndUsage read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DatasetAndUsage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DatasetAndUsage
  * @throws IOException if the JSON string is invalid with respect to DatasetAndUsage
  */
  public static DatasetAndUsage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DatasetAndUsage.class);
  }

 /**
  * Convert an instance of DatasetAndUsage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
