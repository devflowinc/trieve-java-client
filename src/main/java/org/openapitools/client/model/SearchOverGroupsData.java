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
import org.openapitools.client.model.ChunkFilter;
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
 * SearchOverGroupsData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class SearchOverGroupsData {
  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private ChunkFilter filters;

  public static final String SERIALIZED_NAME_GET_COLLISIONS = "get_collisions";
  @SerializedName(SERIALIZED_NAME_GET_COLLISIONS)
  private Boolean getCollisions;

  public static final String SERIALIZED_NAME_GROUP_SIZE = "group_size";
  @SerializedName(SERIALIZED_NAME_GROUP_SIZE)
  private Integer groupSize;

  public static final String SERIALIZED_NAME_HIGHLIGHT_DELIMITERS = "highlight_delimiters";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_DELIMITERS)
  private List<String> highlightDelimiters;

  public static final String SERIALIZED_NAME_HIGHLIGHT_RESULTS = "highlight_results";
  @SerializedName(SERIALIZED_NAME_HIGHLIGHT_RESULTS)
  private Boolean highlightResults;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_SCORE_THRESHOLD = "score_threshold";
  @SerializedName(SERIALIZED_NAME_SCORE_THRESHOLD)
  private Float scoreThreshold;

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "search_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private String searchType;

  public SearchOverGroupsData() {
  }

  public SearchOverGroupsData filters(ChunkFilter filters) {
    this.filters = filters;
    return this;
  }

   /**
   * Get filters
   * @return filters
  **/
  @javax.annotation.Nullable
  @Valid

  public ChunkFilter getFilters() {
    return filters;
  }

  public void setFilters(ChunkFilter filters) {
    this.filters = filters;
  }


  public SearchOverGroupsData getCollisions(Boolean getCollisions) {
    this.getCollisions = getCollisions;
    return this;
  }

   /**
   * Set get_collisions to true to get the collisions for each chunk. This will only apply if environment variable COLLISIONS_ENABLED is set to true.
   * @return getCollisions
  **/
  @javax.annotation.Nullable

  public Boolean getGetCollisions() {
    return getCollisions;
  }

  public void setGetCollisions(Boolean getCollisions) {
    this.getCollisions = getCollisions;
  }


  public SearchOverGroupsData groupSize(Integer groupSize) {
    this.groupSize = groupSize;
    return this;
  }

   /**
   * Get groupSize
   * minimum: 0
   * @return groupSize
  **/
  @javax.annotation.Nullable
 @Min(0)
  public Integer getGroupSize() {
    return groupSize;
  }

  public void setGroupSize(Integer groupSize) {
    this.groupSize = groupSize;
  }


  public SearchOverGroupsData highlightDelimiters(List<String> highlightDelimiters) {
    this.highlightDelimiters = highlightDelimiters;
    return this;
  }

  public SearchOverGroupsData addHighlightDelimitersItem(String highlightDelimitersItem) {
    if (this.highlightDelimiters == null) {
      this.highlightDelimiters = new ArrayList<>();
    }
    this.highlightDelimiters.add(highlightDelimitersItem);
    return this;
  }

   /**
   * Set highlight_delimiters to a list of strings to use as delimiters for highlighting. If not specified, this defaults to [\&quot;?\&quot;, \&quot;,\&quot;, \&quot;.\&quot;, \&quot;!\&quot;].
   * @return highlightDelimiters
  **/
  @javax.annotation.Nullable

  public List<String> getHighlightDelimiters() {
    return highlightDelimiters;
  }

  public void setHighlightDelimiters(List<String> highlightDelimiters) {
    this.highlightDelimiters = highlightDelimiters;
  }


  public SearchOverGroupsData highlightResults(Boolean highlightResults) {
    this.highlightResults = highlightResults;
    return this;
  }

   /**
   * Set highlight_results to true to highlight the results. If not specified, this defaults to true.
   * @return highlightResults
  **/
  @javax.annotation.Nullable

  public Boolean getHighlightResults() {
    return highlightResults;
  }

  public void setHighlightResults(Boolean highlightResults) {
    this.highlightResults = highlightResults;
  }


  public SearchOverGroupsData page(Long page) {
    this.page = page;
    return this;
  }

   /**
   * Page of chunks to fetch. Each page is 10 chunks. Support for custom page size is coming soon.
   * minimum: 0
   * @return page
  **/
  @javax.annotation.Nullable
 @Min(0L)
  public Long getPage() {
    return page;
  }

  public void setPage(Long page) {
    this.page = page;
  }


  public SearchOverGroupsData pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * Page size is the number of chunks to fetch. This can be used to fetch more than 10 chunks at a time.
   * minimum: 0
   * @return pageSize
  **/
  @javax.annotation.Nullable
 @Min(0)
  public Integer getPageSize() {
    return pageSize;
  }

  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public SearchOverGroupsData query(String query) {
    this.query = query;
    return this;
  }

   /**
   * Query is the search query. This can be any string. The query will be used to create an embedding vector and/or SPLADE vector which will be used to find the result set.
   * @return query
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }


  public SearchOverGroupsData scoreThreshold(Float scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
    return this;
  }

   /**
   * Set score_threshold to a float to filter out chunks with a score below the threshold.
   * @return scoreThreshold
  **/
  @javax.annotation.Nullable

  public Float getScoreThreshold() {
    return scoreThreshold;
  }

  public void setScoreThreshold(Float scoreThreshold) {
    this.scoreThreshold = scoreThreshold;
  }


  public SearchOverGroupsData searchType(String searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * Can be either \&quot;semantic\&quot;, \&quot;fulltext\&quot;, or \&quot;hybrid\&quot;. \&quot;hybrid\&quot; will pull in one page (10 chunks) of both semantic and full-text results then re-rank them using BAAI/bge-reranker-large. \&quot;semantic\&quot; will pull in one page (10 chunks) of the nearest cosine distant vectors. \&quot;fulltext\&quot; will pull in one page (10 chunks) of full-text results based on SPLADE.
   * @return searchType
  **/
  @javax.annotation.Nonnull
  @NotNull

  public String getSearchType() {
    return searchType;
  }

  public void setSearchType(String searchType) {
    this.searchType = searchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOverGroupsData searchOverGroupsData = (SearchOverGroupsData) o;
    return Objects.equals(this.filters, searchOverGroupsData.filters) &&
        Objects.equals(this.getCollisions, searchOverGroupsData.getCollisions) &&
        Objects.equals(this.groupSize, searchOverGroupsData.groupSize) &&
        Objects.equals(this.highlightDelimiters, searchOverGroupsData.highlightDelimiters) &&
        Objects.equals(this.highlightResults, searchOverGroupsData.highlightResults) &&
        Objects.equals(this.page, searchOverGroupsData.page) &&
        Objects.equals(this.pageSize, searchOverGroupsData.pageSize) &&
        Objects.equals(this.query, searchOverGroupsData.query) &&
        Objects.equals(this.scoreThreshold, searchOverGroupsData.scoreThreshold) &&
        Objects.equals(this.searchType, searchOverGroupsData.searchType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, getCollisions, groupSize, highlightDelimiters, highlightResults, page, pageSize, query, scoreThreshold, searchType);
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
    sb.append("class SearchOverGroupsData {\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    getCollisions: ").append(toIndentedString(getCollisions)).append("\n");
    sb.append("    groupSize: ").append(toIndentedString(groupSize)).append("\n");
    sb.append("    highlightDelimiters: ").append(toIndentedString(highlightDelimiters)).append("\n");
    sb.append("    highlightResults: ").append(toIndentedString(highlightResults)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
    openapiFields.add("filters");
    openapiFields.add("get_collisions");
    openapiFields.add("group_size");
    openapiFields.add("highlight_delimiters");
    openapiFields.add("highlight_results");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("query");
    openapiFields.add("score_threshold");
    openapiFields.add("search_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("search_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchOverGroupsData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchOverGroupsData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOverGroupsData is not found in the empty JSON string", SearchOverGroupsData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchOverGroupsData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOverGroupsData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchOverGroupsData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        ChunkFilter.validateJsonElement(jsonObj.get("filters"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("highlight_delimiters") != null && !jsonObj.get("highlight_delimiters").isJsonNull() && !jsonObj.get("highlight_delimiters").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `highlight_delimiters` to be an array in the JSON string but got `%s`", jsonObj.get("highlight_delimiters").toString()));
      }
      if (!jsonObj.get("query").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `query` to be a primitive type in the JSON string but got `%s`", jsonObj.get("query").toString()));
      }
      if (!jsonObj.get("search_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `search_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("search_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOverGroupsData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOverGroupsData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOverGroupsData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOverGroupsData.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOverGroupsData>() {
           @Override
           public void write(JsonWriter out, SearchOverGroupsData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOverGroupsData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchOverGroupsData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOverGroupsData
  * @throws IOException if the JSON string is invalid with respect to SearchOverGroupsData
  */
  public static SearchOverGroupsData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOverGroupsData.class);
  }

 /**
  * Convert an instance of SearchOverGroupsData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

