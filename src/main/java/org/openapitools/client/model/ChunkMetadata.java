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
 * ChunkMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class ChunkMetadata {
  public static final String SERIALIZED_NAME_CHUNK_HTML = "chunk_html";
  @SerializedName(SERIALIZED_NAME_CHUNK_HTML)
  private String chunkHtml;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_DATASET_ID = "dataset_id";
  @SerializedName(SERIALIZED_NAME_DATASET_ID)
  private UUID datasetId;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private String link;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata = null;

  public static final String SERIALIZED_NAME_QDRANT_POINT_ID = "qdrant_point_id";
  @SerializedName(SERIALIZED_NAME_QDRANT_POINT_ID)
  private UUID qdrantPointId;

  public static final String SERIALIZED_NAME_TAG_SET = "tag_set";
  @SerializedName(SERIALIZED_NAME_TAG_SET)
  private String tagSet;

  public static final String SERIALIZED_NAME_TIME_STAMP = "time_stamp";
  @SerializedName(SERIALIZED_NAME_TIME_STAMP)
  private OffsetDateTime timeStamp;

  public static final String SERIALIZED_NAME_TRACKING_ID = "tracking_id";
  @SerializedName(SERIALIZED_NAME_TRACKING_ID)
  private String trackingId;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private Double weight;

  public ChunkMetadata() {
  }

  public ChunkMetadata chunkHtml(String chunkHtml) {
    this.chunkHtml = chunkHtml;
    return this;
  }

   /**
   * Get chunkHtml
   * @return chunkHtml
  **/
  @javax.annotation.Nullable

  public String getChunkHtml() {
    return chunkHtml;
  }

  public void setChunkHtml(String chunkHtml) {
    this.chunkHtml = chunkHtml;
  }


  public ChunkMetadata content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public ChunkMetadata createdAt(OffsetDateTime createdAt) {
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


  public ChunkMetadata datasetId(UUID datasetId) {
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


  public ChunkMetadata id(UUID id) {
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


  public ChunkMetadata link(String link) {
    this.link = link;
    return this;
  }

   /**
   * Get link
   * @return link
  **/
  @javax.annotation.Nullable

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }


  public ChunkMetadata metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable

  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  public ChunkMetadata qdrantPointId(UUID qdrantPointId) {
    this.qdrantPointId = qdrantPointId;
    return this;
  }

   /**
   * Get qdrantPointId
   * @return qdrantPointId
  **/
  @javax.annotation.Nullable
  @Valid

  public UUID getQdrantPointId() {
    return qdrantPointId;
  }

  public void setQdrantPointId(UUID qdrantPointId) {
    this.qdrantPointId = qdrantPointId;
  }


  public ChunkMetadata tagSet(String tagSet) {
    this.tagSet = tagSet;
    return this;
  }

   /**
   * Get tagSet
   * @return tagSet
  **/
  @javax.annotation.Nullable

  public String getTagSet() {
    return tagSet;
  }

  public void setTagSet(String tagSet) {
    this.tagSet = tagSet;
  }


  public ChunkMetadata timeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * Get timeStamp
   * @return timeStamp
  **/
  @javax.annotation.Nullable
  @Valid

  public OffsetDateTime getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(OffsetDateTime timeStamp) {
    this.timeStamp = timeStamp;
  }


  public ChunkMetadata trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Get trackingId
   * @return trackingId
  **/
  @javax.annotation.Nullable

  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public ChunkMetadata updatedAt(OffsetDateTime updatedAt) {
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


  public ChunkMetadata weight(Double weight) {
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChunkMetadata chunkMetadata = (ChunkMetadata) o;
    return Objects.equals(this.chunkHtml, chunkMetadata.chunkHtml) &&
        Objects.equals(this.content, chunkMetadata.content) &&
        Objects.equals(this.createdAt, chunkMetadata.createdAt) &&
        Objects.equals(this.datasetId, chunkMetadata.datasetId) &&
        Objects.equals(this.id, chunkMetadata.id) &&
        Objects.equals(this.link, chunkMetadata.link) &&
        Objects.equals(this.metadata, chunkMetadata.metadata) &&
        Objects.equals(this.qdrantPointId, chunkMetadata.qdrantPointId) &&
        Objects.equals(this.tagSet, chunkMetadata.tagSet) &&
        Objects.equals(this.timeStamp, chunkMetadata.timeStamp) &&
        Objects.equals(this.trackingId, chunkMetadata.trackingId) &&
        Objects.equals(this.updatedAt, chunkMetadata.updatedAt) &&
        Objects.equals(this.weight, chunkMetadata.weight);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunkHtml, content, createdAt, datasetId, id, link, metadata, qdrantPointId, tagSet, timeStamp, trackingId, updatedAt, weight);
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
    sb.append("class ChunkMetadata {\n");
    sb.append("    chunkHtml: ").append(toIndentedString(chunkHtml)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    qdrantPointId: ").append(toIndentedString(qdrantPointId)).append("\n");
    sb.append("    tagSet: ").append(toIndentedString(tagSet)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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
    openapiFields.add("chunk_html");
    openapiFields.add("content");
    openapiFields.add("created_at");
    openapiFields.add("dataset_id");
    openapiFields.add("id");
    openapiFields.add("link");
    openapiFields.add("metadata");
    openapiFields.add("qdrant_point_id");
    openapiFields.add("tag_set");
    openapiFields.add("time_stamp");
    openapiFields.add("tracking_id");
    openapiFields.add("updated_at");
    openapiFields.add("weight");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("created_at");
    openapiRequiredFields.add("dataset_id");
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("updated_at");
    openapiRequiredFields.add("weight");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to ChunkMetadata
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ChunkMetadata.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ChunkMetadata is not found in the empty JSON string", ChunkMetadata.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ChunkMetadata.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ChunkMetadata` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ChunkMetadata.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("chunk_html") != null && !jsonObj.get("chunk_html").isJsonNull()) && !jsonObj.get("chunk_html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `chunk_html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("chunk_html").toString()));
      }
      if (!jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (!jsonObj.get("dataset_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataset_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataset_id").toString()));
      }
      if (!jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("link") != null && !jsonObj.get("link").isJsonNull()) && !jsonObj.get("link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link").toString()));
      }
      if ((jsonObj.get("qdrant_point_id") != null && !jsonObj.get("qdrant_point_id").isJsonNull()) && !jsonObj.get("qdrant_point_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `qdrant_point_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("qdrant_point_id").toString()));
      }
      if ((jsonObj.get("tag_set") != null && !jsonObj.get("tag_set").isJsonNull()) && !jsonObj.get("tag_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag_set").toString()));
      }
      if ((jsonObj.get("tracking_id") != null && !jsonObj.get("tracking_id").isJsonNull()) && !jsonObj.get("tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tracking_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ChunkMetadata.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ChunkMetadata' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ChunkMetadata> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ChunkMetadata.class));

       return (TypeAdapter<T>) new TypeAdapter<ChunkMetadata>() {
           @Override
           public void write(JsonWriter out, ChunkMetadata value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ChunkMetadata read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ChunkMetadata given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ChunkMetadata
  * @throws IOException if the JSON string is invalid with respect to ChunkMetadata
  */
  public static ChunkMetadata fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ChunkMetadata.class);
  }

 /**
  * Convert an instance of ChunkMetadata to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
