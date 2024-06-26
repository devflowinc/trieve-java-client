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
import org.openapitools.client.model.GroupScoreChunkDTO;
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
 * SearchOverGroupsResponseBody
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:34:27.506198300-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class SearchOverGroupsResponseBody {
  public static final String SERIALIZED_NAME_GROUP_CHUNKS = "group_chunks";
  @SerializedName(SERIALIZED_NAME_GROUP_CHUNKS)
  private List<@Valid GroupScoreChunkDTO> groupChunks = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_CHUNK_PAGES = "total_chunk_pages";
  @SerializedName(SERIALIZED_NAME_TOTAL_CHUNK_PAGES)
  private Long totalChunkPages;

  public SearchOverGroupsResponseBody() {
  }

  public SearchOverGroupsResponseBody groupChunks(List<@Valid GroupScoreChunkDTO> groupChunks) {
    this.groupChunks = groupChunks;
    return this;
  }

  public SearchOverGroupsResponseBody addGroupChunksItem(GroupScoreChunkDTO groupChunksItem) {
    if (this.groupChunks == null) {
      this.groupChunks = new ArrayList<>();
    }
    this.groupChunks.add(groupChunksItem);
    return this;
  }

   /**
   * Get groupChunks
   * @return groupChunks
  **/
  @javax.annotation.Nonnull
  @NotNull
  @Valid

  public List<@Valid GroupScoreChunkDTO> getGroupChunks() {
    return groupChunks;
  }

  public void setGroupChunks(List<@Valid GroupScoreChunkDTO> groupChunks) {
    this.groupChunks = groupChunks;
  }


  public SearchOverGroupsResponseBody totalChunkPages(Long totalChunkPages) {
    this.totalChunkPages = totalChunkPages;
    return this;
  }

   /**
   * Get totalChunkPages
   * @return totalChunkPages
  **/
  @javax.annotation.Nonnull
  @NotNull

  public Long getTotalChunkPages() {
    return totalChunkPages;
  }

  public void setTotalChunkPages(Long totalChunkPages) {
    this.totalChunkPages = totalChunkPages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOverGroupsResponseBody searchOverGroupsResponseBody = (SearchOverGroupsResponseBody) o;
    return Objects.equals(this.groupChunks, searchOverGroupsResponseBody.groupChunks) &&
        Objects.equals(this.totalChunkPages, searchOverGroupsResponseBody.totalChunkPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(groupChunks, totalChunkPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOverGroupsResponseBody {\n");
    sb.append("    groupChunks: ").append(toIndentedString(groupChunks)).append("\n");
    sb.append("    totalChunkPages: ").append(toIndentedString(totalChunkPages)).append("\n");
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
    openapiFields.add("group_chunks");
    openapiFields.add("total_chunk_pages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("group_chunks");
    openapiRequiredFields.add("total_chunk_pages");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchOverGroupsResponseBody
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchOverGroupsResponseBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOverGroupsResponseBody is not found in the empty JSON string", SearchOverGroupsResponseBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchOverGroupsResponseBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOverGroupsResponseBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchOverGroupsResponseBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the json data is an array
      if (!jsonObj.get("group_chunks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_chunks` to be an array in the JSON string but got `%s`", jsonObj.get("group_chunks").toString()));
      }

      JsonArray jsonArraygroupChunks = jsonObj.getAsJsonArray("group_chunks");
      // validate the required field `group_chunks` (array)
      for (int i = 0; i < jsonArraygroupChunks.size(); i++) {
        GroupScoreChunkDTO.validateJsonElement(jsonArraygroupChunks.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOverGroupsResponseBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOverGroupsResponseBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOverGroupsResponseBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOverGroupsResponseBody.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOverGroupsResponseBody>() {
           @Override
           public void write(JsonWriter out, SearchOverGroupsResponseBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOverGroupsResponseBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchOverGroupsResponseBody given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOverGroupsResponseBody
  * @throws IOException if the JSON string is invalid with respect to SearchOverGroupsResponseBody
  */
  public static SearchOverGroupsResponseBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOverGroupsResponseBody.class);
  }

 /**
  * Convert an instance of SearchOverGroupsResponseBody to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

