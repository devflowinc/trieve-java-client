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
import java.time.OffsetDateTime;
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
 * StripePlan
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class StripePlan {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount;

  public static final String SERIALIZED_NAME_CHUNK_COUNT = "chunk_count";
  @SerializedName(SERIALIZED_NAME_CHUNK_COUNT)
  private Integer chunkCount;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DATASET_COUNT = "dataset_count";
  @SerializedName(SERIALIZED_NAME_DATASET_COUNT)
  private Integer datasetCount;

  public static final String SERIALIZED_NAME_FILE_STORAGE = "file_storage";
  @SerializedName(SERIALIZED_NAME_FILE_STORAGE)
  private Long fileStorage;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_MESSAGE_COUNT = "message_count";
  @SerializedName(SERIALIZED_NAME_MESSAGE_COUNT)
  private Integer messageCount;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STRIPE_ID = "stripe_id";
  @SerializedName(SERIALIZED_NAME_STRIPE_ID)
  private String stripeId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_USER_COUNT = "user_count";
  @SerializedName(SERIALIZED_NAME_USER_COUNT)
  private Integer userCount;

  public StripePlan() {
  }

  public StripePlan amount(Long amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public StripePlan chunkCount(Integer chunkCount) {
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


  public StripePlan createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public StripePlan datasetCount(Integer datasetCount) {
    this.datasetCount = datasetCount;
    return this;
  }

   /**
   * Get datasetCount
   * @return datasetCount
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Integer getDatasetCount() {
    return datasetCount;
  }

  public void setDatasetCount(Integer datasetCount) {
    this.datasetCount = datasetCount;
  }


  public StripePlan fileStorage(Long fileStorage) {
    this.fileStorage = fileStorage;
    return this;
  }

   /**
   * Get fileStorage
   * @return fileStorage
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Long getFileStorage() {
    return fileStorage;
  }

  public void setFileStorage(Long fileStorage) {
    this.fileStorage = fileStorage;
  }


  public StripePlan id(UUID id) {
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


  public StripePlan messageCount(Integer messageCount) {
    this.messageCount = messageCount;
    return this;
  }

   /**
   * Get messageCount
   * @return messageCount
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Integer getMessageCount() {
    return messageCount;
  }

  public void setMessageCount(Integer messageCount) {
    this.messageCount = messageCount;
  }


  public StripePlan name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public StripePlan stripeId(String stripeId) {
    this.stripeId = stripeId;
    return this;
  }

   /**
   * Get stripeId
   * @return stripeId
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getStripeId() {
    return stripeId;
  }

  public void setStripeId(String stripeId) {
    this.stripeId = stripeId;
  }


  public StripePlan updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public StripePlan userCount(Integer userCount) {
    this.userCount = userCount;
    return this;
  }

   /**
   * Get userCount
   * @return userCount
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Integer getUserCount() {
    return userCount;
  }

  public void setUserCount(Integer userCount) {
    this.userCount = userCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StripePlan stripePlan = (StripePlan) o;
    return Objects.equals(this.amount, stripePlan.amount) &&
        Objects.equals(this.chunkCount, stripePlan.chunkCount) &&
        Objects.equals(this.createdAt, stripePlan.createdAt) &&
        Objects.equals(this.datasetCount, stripePlan.datasetCount) &&
        Objects.equals(this.fileStorage, stripePlan.fileStorage) &&
        Objects.equals(this.id, stripePlan.id) &&
        Objects.equals(this.messageCount, stripePlan.messageCount) &&
        Objects.equals(this.name, stripePlan.name) &&
        Objects.equals(this.stripeId, stripePlan.stripeId) &&
        Objects.equals(this.updatedAt, stripePlan.updatedAt) &&
        Objects.equals(this.userCount, stripePlan.userCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, chunkCount, createdAt, datasetCount, fileStorage, id, messageCount, name, stripeId, updatedAt, userCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StripePlan {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    chunkCount: ").append(toIndentedString(chunkCount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasetCount: ").append(toIndentedString(datasetCount)).append("\n");
    sb.append("    fileStorage: ").append(toIndentedString(fileStorage)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    messageCount: ").append(toIndentedString(messageCount)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stripeId: ").append(toIndentedString(stripeId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("chunk_count");
    openapiFields.add("created_at");
    openapiFields.add("dataset_count");
    openapiFields.add("file_storage");
    openapiFields.add("id");
    openapiFields.add("message_count");
    openapiFields.add("name");
    openapiFields.add("stripe_id");
    openapiFields.add("updated_at");
    openapiFields.add("user_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("chunk_count");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("dataset_count");
    openapiRequiredFields.add("file_storage");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("message_count");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("stripe_id");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("user_count");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to StripePlan
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StripePlan.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StripePlan is not found in the empty JSON string", StripePlan.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StripePlan.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StripePlan` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : StripePlan.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (!jsonObj.get("stripe_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `stripe_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("stripe_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StripePlan.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StripePlan' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StripePlan> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StripePlan.class));

       return (TypeAdapter<T>) new TypeAdapter<StripePlan>() {
           @Override
           public void write(JsonWriter out, StripePlan value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StripePlan read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StripePlan given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StripePlan
  * @throws IOException if the JSON string is invalid with respect to StripePlan
  */
  public static StripePlan fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StripePlan.class);
  }

 /**
  * Convert an instance of StripePlan to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

