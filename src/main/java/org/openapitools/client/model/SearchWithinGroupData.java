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
 * SearchWithinGroupData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-03-29T12:28:22.088024700-05:00[America/Chicago]", comments = "Generator version: 7.4.0")
public class SearchWithinGroupData {
  public static final String SERIALIZED_NAME_DATE_BIAS = "date_bias";
  @SerializedName(SERIALIZED_NAME_DATE_BIAS)
  private Boolean dateBias;

  public static final String SERIALIZED_NAME_FILTERS = "filters";
  @SerializedName(SERIALIZED_NAME_FILTERS)
  private ChunkFilter filters;

  public static final String SERIALIZED_NAME_GROUP_ID = "group_id";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private UUID groupId;

  public static final String SERIALIZED_NAME_GROUP_TRACKING_ID = "group_tracking_id";
  @SerializedName(SERIALIZED_NAME_GROUP_TRACKING_ID)
  private String groupTrackingId;

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
  private Long pageSize;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private String query;

  public static final String SERIALIZED_NAME_SCORE_THRESHOLD = "score_threshold";
  @SerializedName(SERIALIZED_NAME_SCORE_THRESHOLD)
  private Float scoreThreshold;

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "search_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private String searchType;

  public static final String SERIALIZED_NAME_USE_WEIGHTS = "use_weights";
  @SerializedName(SERIALIZED_NAME_USE_WEIGHTS)
  private Boolean useWeights;

  public SearchWithinGroupData() {
  }

  public SearchWithinGroupData dateBias(Boolean dateBias) {
    this.dateBias = dateBias;
    return this;
  }

   /**
   * Set date_bias to true to bias search results towards more recent chunks. This will work best in hybrid search mode.
   * @return dateBias
  **/
  @javax.annotation.Nullable

  public Boolean getDateBias() {
    return dateBias;
  }

  public void setDateBias(Boolean dateBias) {
    this.dateBias = dateBias;
  }


  public SearchWithinGroupData filters(ChunkFilter filters) {
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


  public SearchWithinGroupData groupId(UUID groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * Group specifies the group to search within. Results will only consist of chunks which are bookmarks within the specified group.
   * @return groupId
  **/
  @javax.annotation.Nullable
  @Valid

  public UUID getGroupId() {
    return groupId;
  }

  public void setGroupId(UUID groupId) {
    this.groupId = groupId;
  }


  public SearchWithinGroupData groupTrackingId(String groupTrackingId) {
    this.groupTrackingId = groupTrackingId;
    return this;
  }

   /**
   * Group_tracking_id specifies the group to search within by tracking id. Results will only consist of chunks which are bookmarks within the specified group. If both group_id and group_tracking_id are provided, group_id will be used.
   * @return groupTrackingId
  **/
  @javax.annotation.Nullable

  public String getGroupTrackingId() {
    return groupTrackingId;
  }

  public void setGroupTrackingId(String groupTrackingId) {
    this.groupTrackingId = groupTrackingId;
  }


  public SearchWithinGroupData highlightDelimiters(List<String> highlightDelimiters) {
    this.highlightDelimiters = highlightDelimiters;
    return this;
  }

  public SearchWithinGroupData addHighlightDelimitersItem(String highlightDelimitersItem) {
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


  public SearchWithinGroupData highlightResults(Boolean highlightResults) {
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


  public SearchWithinGroupData page(Long page) {
    this.page = page;
    return this;
  }

   /**
   * The page of chunks to fetch. Each page is 10 chunks. Support for custom page size is coming soon.
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


  public SearchWithinGroupData pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

   /**
   * The page size is the number of chunks to fetch. This can be used to fetch more than 10 chunks at a time.
   * minimum: 0
   * @return pageSize
  **/
  @javax.annotation.Nullable
 @Min(0L)
  public Long getPageSize() {
    return pageSize;
  }

  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public SearchWithinGroupData query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query is the search query. This can be any string. The query will be used to create an embedding vector and/or SPLADE vector which will be used to find the result set.
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


  public SearchWithinGroupData scoreThreshold(Float scoreThreshold) {
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


  public SearchWithinGroupData searchType(String searchType) {
    this.searchType = searchType;
    return this;
  }

   /**
   * Search_type can be either \&quot;semantic\&quot;, \&quot;fulltext\&quot;, or \&quot;hybrid\&quot;. \&quot;hybrid\&quot; will pull in one page (10 chunks) of both semantic and full-text results then re-rank them using BAAI/bge-reranker-large. \&quot;semantic\&quot; will pull in one page (10 chunks) of the nearest cosine distant vectors. \&quot;fulltext\&quot; will pull in one page (10 chunks) of full-text results based on SPLADE.
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


  public SearchWithinGroupData useWeights(Boolean useWeights) {
    this.useWeights = useWeights;
    return this;
  }

   /**
   * Set use_weights to true to use the weights of the chunks in the result set in order to sort them. If not specified, this defaults to true.
   * @return useWeights
  **/
  @javax.annotation.Nullable

  public Boolean getUseWeights() {
    return useWeights;
  }

  public void setUseWeights(Boolean useWeights) {
    this.useWeights = useWeights;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchWithinGroupData searchWithinGroupData = (SearchWithinGroupData) o;
    return Objects.equals(this.dateBias, searchWithinGroupData.dateBias) &&
        Objects.equals(this.filters, searchWithinGroupData.filters) &&
        Objects.equals(this.groupId, searchWithinGroupData.groupId) &&
        Objects.equals(this.groupTrackingId, searchWithinGroupData.groupTrackingId) &&
        Objects.equals(this.highlightDelimiters, searchWithinGroupData.highlightDelimiters) &&
        Objects.equals(this.highlightResults, searchWithinGroupData.highlightResults) &&
        Objects.equals(this.page, searchWithinGroupData.page) &&
        Objects.equals(this.pageSize, searchWithinGroupData.pageSize) &&
        Objects.equals(this.query, searchWithinGroupData.query) &&
        Objects.equals(this.scoreThreshold, searchWithinGroupData.scoreThreshold) &&
        Objects.equals(this.searchType, searchWithinGroupData.searchType) &&
        Objects.equals(this.useWeights, searchWithinGroupData.useWeights);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateBias, filters, groupId, groupTrackingId, highlightDelimiters, highlightResults, page, pageSize, query, scoreThreshold, searchType, useWeights);
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
    sb.append("class SearchWithinGroupData {\n");
    sb.append("    dateBias: ").append(toIndentedString(dateBias)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    groupTrackingId: ").append(toIndentedString(groupTrackingId)).append("\n");
    sb.append("    highlightDelimiters: ").append(toIndentedString(highlightDelimiters)).append("\n");
    sb.append("    highlightResults: ").append(toIndentedString(highlightResults)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    scoreThreshold: ").append(toIndentedString(scoreThreshold)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    useWeights: ").append(toIndentedString(useWeights)).append("\n");
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
    openapiFields.add("date_bias");
    openapiFields.add("filters");
    openapiFields.add("group_id");
    openapiFields.add("group_tracking_id");
    openapiFields.add("highlight_delimiters");
    openapiFields.add("highlight_results");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("query");
    openapiFields.add("score_threshold");
    openapiFields.add("search_type");
    openapiFields.add("use_weights");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("query");
    openapiRequiredFields.add("search_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to SearchWithinGroupData
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SearchWithinGroupData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchWithinGroupData is not found in the empty JSON string", SearchWithinGroupData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SearchWithinGroupData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchWithinGroupData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : SearchWithinGroupData.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `filters`
      if (jsonObj.get("filters") != null && !jsonObj.get("filters").isJsonNull()) {
        ChunkFilter.validateJsonElement(jsonObj.get("filters"));
      }
      if ((jsonObj.get("group_id") != null && !jsonObj.get("group_id").isJsonNull()) && !jsonObj.get("group_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_id").toString()));
      }
      if ((jsonObj.get("group_tracking_id") != null && !jsonObj.get("group_tracking_id").isJsonNull()) && !jsonObj.get("group_tracking_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `group_tracking_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("group_tracking_id").toString()));
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
       if (!SearchWithinGroupData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchWithinGroupData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchWithinGroupData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchWithinGroupData.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchWithinGroupData>() {
           @Override
           public void write(JsonWriter out, SearchWithinGroupData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchWithinGroupData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchWithinGroupData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchWithinGroupData
  * @throws IOException if the JSON string is invalid with respect to SearchWithinGroupData
  */
  public static SearchWithinGroupData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchWithinGroupData.class);
  }

 /**
  * Convert an instance of SearchWithinGroupData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
