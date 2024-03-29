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
import org.openapitools.client.model.ChunkGroup;
import org.openapitools.client.model.ChunkMetadataWithFileData;
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
 * BookmarkData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:34:27.506198300-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class BookmarkData {
  public static final String SERIALIZED_NAME_CHUNKS = "chunks";
  @SerializedName(SERIALIZED_NAME_CHUNKS)
  private List<@Valid ChunkMetadataWithFileData> chunks = new ArrayList<>();

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private ChunkGroup group;

  public static final String SERIALIZED_NAME_TOTAL_PAGES = "total_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGES)
  private Long totalPages;

  public BookmarkData() {
  }

  public BookmarkData chunks(List<@Valid ChunkMetadataWithFileData> chunks) {
    this.chunks = chunks;
    return this;
  }

  public BookmarkData addChunksItem(ChunkMetadataWithFileData chunksItem) {
    if (this.chunks == null) {
      this.chunks = new ArrayList<>();
    }
    this.chunks.add(chunksItem);
    return this;
  }

   /**
   * Get chunks
   * @return chunks
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public List<@Valid ChunkMetadataWithFileData> getChunks() {
    return chunks;
  }

  public void setChunks(List<@Valid ChunkMetadataWithFileData> chunks) {
    this.chunks = chunks;
  }


  public BookmarkData group(ChunkGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public ChunkGroup getGroup() {
    return group;
  }

  public void setGroup(ChunkGroup group) {
    this.group = group;
  }


  public BookmarkData totalPages(Long totalPages) {
    this.totalPages = totalPages;
    return this;
  }

   /**
   * Get totalPages
   * @return totalPages
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Long getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Long totalPages) {
    this.totalPages = totalPages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BookmarkData bookmarkData = (BookmarkData) o;
    return Objects.equals(this.chunks, bookmarkData.chunks) &&
        Objects.equals(this.group, bookmarkData.group) &&
        Objects.equals(this.totalPages, bookmarkData.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chunks, group, totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BookmarkData {\n");
    sb.append("    chunks: ").append(toIndentedString(chunks)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
    openapiFields.add("chunks");
    openapiFields.add("group");
    openapiFields.add("total_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("chunks");
    openapiRequiredFields.add("group");
    openapiRequiredFields.add("total_pages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to BookmarkData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!BookmarkData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in BookmarkData is not found in the empty JSON string", BookmarkData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!BookmarkData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BookmarkData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : BookmarkData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("chunks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `chunks` to be an array in the JSON string but got `%s`", jsonObj.get("chunks").toString()));
      }

      JsonArray jsonArraychunks = jsonObj.getAsJsonArray("chunks");
      // validate the required field `chunks` (array)
      for (int i = 0; i < jsonArraychunks.size(); i++) {
        ChunkMetadataWithFileData.validateJsonElement(jsonArraychunks.get(i));
      };
      // validate the required field `group`
      ChunkGroup.validateJsonElement(jsonObj.get("group"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BookmarkData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BookmarkData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BookmarkData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BookmarkData.class));

       return (TypeAdapter<T>) new TypeAdapter<BookmarkData>() {
           @Override
           public void write(JsonWriter out, BookmarkData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BookmarkData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BookmarkData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BookmarkData
  * @throws IOException if the JSON string is invalid with respect to BookmarkData
  */
  public static BookmarkData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BookmarkData.class);
  }

 /**
  * Convert an instance of BookmarkData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

