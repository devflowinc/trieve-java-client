# ChunkApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createChunk**](ChunkApi.md#createChunk) | **POST** /api/chunk | Create or Upsert Chunk or Chunks |
| [**createSuggestedQueriesHandler**](ChunkApi.md#createSuggestedQueriesHandler) | **POST** /api/chunk/gen_suggestions | Generate suggested queries |
| [**deleteChunk**](ChunkApi.md#deleteChunk) | **DELETE** /api/chunk/{chunk_id} | Delete Chunk |
| [**deleteChunkByTrackingId**](ChunkApi.md#deleteChunkByTrackingId) | **DELETE** /api/chunk/tracking_id/{tracking_id} | Delete Chunk By Tracking Id |
| [**generateOffChunks**](ChunkApi.md#generateOffChunks) | **POST** /api/chunk/generate | RAG on Specified Chunks |
| [**getChunkById**](ChunkApi.md#getChunkById) | **GET** /api/chunk/{chunk_id} | Get Chunk By Id |
| [**getChunkByTrackingId**](ChunkApi.md#getChunkByTrackingId) | **GET** /api/chunk/tracking_id/{tracking_id} | Get Chunk By Tracking Id |
| [**getRecommendedChunks**](ChunkApi.md#getRecommendedChunks) | **POST** /api/chunk/recommend | Get Recommended Chunks |
| [**searchChunk**](ChunkApi.md#searchChunk) | **POST** /api/chunk/search | Search |
| [**updateChunk**](ChunkApi.md#updateChunk) | **PUT** /api/chunk | Update Chunk |
| [**updateChunkByTrackingId**](ChunkApi.md#updateChunkByTrackingId) | **PUT** /api/chunk/tracking_id/update | Update Chunk By Tracking Id |


<a id="createChunk"></a>
# **createChunk**
> ReturnQueuedChunk createChunk(trDataset, createChunkData)

Create or Upsert Chunk or Chunks

Create or Upsert Chunk or Chunks  Create a new chunk. If the chunk has the same tracking_id as an existing chunk, the request will fail. Once a chunk is created, it can be searched for using the search endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    CreateChunkData createChunkData = new CreateChunkData(); // CreateChunkData | JSON request payload to create a new chunk (chunk)
    try {
      ReturnQueuedChunk result = apiInstance.createChunk(trDataset, createChunkData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#createChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **createChunkData** | [**CreateChunkData**](CreateChunkData.md)| JSON request payload to create a new chunk (chunk) | |

### Return type

[**ReturnQueuedChunk**](ReturnQueuedChunk.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON response payload containing the created chunk |  -  |
| **400** | Error typically due to deserialization issues |  -  |
| **426** | Error when upgrade is needed to process more chunks |  -  |

<a id="createSuggestedQueriesHandler"></a>
# **createSuggestedQueriesHandler**
> SuggestedQueriesResponse createSuggestedQueriesHandler(trDataset, suggestedQueriesRequest)

Generate suggested queries

Generate suggested queries  This endpoint will generate 3 suggested queries based off the query provided in the request body and return them as a JSON object.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    SuggestedQueriesRequest suggestedQueriesRequest = new SuggestedQueriesRequest(); // SuggestedQueriesRequest | JSON request payload to get alternative suggested queries
    try {
      SuggestedQueriesResponse result = apiInstance.createSuggestedQueriesHandler(trDataset, suggestedQueriesRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#createSuggestedQueriesHandler");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **suggestedQueriesRequest** | [**SuggestedQueriesRequest**](SuggestedQueriesRequest.md)| JSON request payload to get alternative suggested queries | |

### Return type

[**SuggestedQueriesResponse**](SuggestedQueriesResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object containing a list of alternative suggested queries |  -  |
| **400** | Service error relating to to updating chunk, likely due to conflicting tracking_id |  -  |

<a id="deleteChunk"></a>
# **deleteChunk**
> deleteChunk(trDataset, chunkId)

Delete Chunk

Delete Chunk  Delete a chunk by its id. If deleting a root chunk which has a collision, the most recently created collision will become a new root chunk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID chunkId = UUID.randomUUID(); // UUID | Id of the chunk you want to fetch.
    try {
      apiInstance.deleteChunk(trDataset, chunkId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#deleteChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **chunkId** | **UUID**| Id of the chunk you want to fetch. | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Confirmation that the chunk with the id specified was deleted |  -  |
| **400** | Service error relating to finding a chunk by tracking_id |  -  |

<a id="deleteChunkByTrackingId"></a>
# **deleteChunkByTrackingId**
> deleteChunkByTrackingId(trDataset, trackingId)

Delete Chunk By Tracking Id

Delete Chunk By Tracking Id  Delete a chunk by tracking_id. This is useful for when you are coordinating with an external system and want to use the tracking_id to identify the chunk. If deleting a root chunk which has a collision, the most recently created collision will become a new root chunk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String trackingId = "trackingId_example"; // String | tracking_id of the chunk you want to delete
    try {
      apiInstance.deleteChunkByTrackingId(trDataset, trackingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#deleteChunkByTrackingId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **trackingId** | **String**| tracking_id of the chunk you want to delete | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Confirmation that the chunk with the tracking_id specified was deleted |  -  |
| **400** | Service error relating to finding a chunk by tracking_id |  -  |

<a id="generateOffChunks"></a>
# **generateOffChunks**
> String generateOffChunks(trDataset, generateChunksRequest)

RAG on Specified Chunks

RAG on Specified Chunks  This endpoint exists as an alternative to the topic+message concept where our API handles chat memory. With this endpoint, the user is responsible for providing the context window and the prompt. See more in the \&quot;search before generate\&quot; page at docs.trieve.ai.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    GenerateChunksRequest generateChunksRequest = new GenerateChunksRequest(); // GenerateChunksRequest | JSON request payload to perform RAG on some chunks (chunks)
    try {
      String result = apiInstance.generateOffChunks(trDataset, generateChunksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#generateOffChunks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **generateChunksRequest** | [**GenerateChunksRequest**](GenerateChunksRequest.md)| JSON request payload to perform RAG on some chunks (chunks) | |

### Return type

**String**

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | This will be a JSON response of a string containing the LLM&#39;s generated inference. Response if not streaming. |  -  |
| **400** | Service error relating to to updating chunk, likely due to conflicting tracking_id |  -  |

<a id="getChunkById"></a>
# **getChunkById**
> ChunkMetadata getChunkById(trDataset, chunkId)

Get Chunk By Id

Get Chunk By Id  Get a singular chunk by id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID chunkId = UUID.randomUUID(); // UUID | Id of the chunk you want to fetch.
    try {
      ChunkMetadata result = apiInstance.getChunkById(trDataset, chunkId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#getChunkById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **chunkId** | **UUID**| Id of the chunk you want to fetch. | |

### Return type

[**ChunkMetadata**](ChunkMetadata.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | chunk with the id that you were searching for |  -  |
| **400** | Service error relating to fidning a chunk by tracking_id |  -  |

<a id="getChunkByTrackingId"></a>
# **getChunkByTrackingId**
> ChunkMetadata getChunkByTrackingId(trDataset, trackingId)

Get Chunk By Tracking Id

Get Chunk By Tracking Id  Get a singular chunk by tracking_id. This is useful for when you are coordinating with an external system and want to use your own id as the primary reference for a chunk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String trackingId = "trackingId_example"; // String | tracking_id of the chunk you want to fetch
    try {
      ChunkMetadata result = apiInstance.getChunkByTrackingId(trDataset, trackingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#getChunkByTrackingId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **trackingId** | **String**| tracking_id of the chunk you want to fetch | |

### Return type

[**ChunkMetadata**](ChunkMetadata.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | chunk with the tracking_id that you were searching for |  -  |
| **400** | Service error relating to fidning a chunk by tracking_id |  -  |

<a id="getRecommendedChunks"></a>
# **getRecommendedChunks**
> List&lt;ChunkMetadataWithFileData&gt; getRecommendedChunks(trDataset, recommendChunksRequest)

Get Recommended Chunks

Get Recommended Chunks  Get recommendations of chunks similar to the chunks in the request. Think about this as a feature similar to the \&quot;add to playlist\&quot; recommendation feature on Spotify. This request pairs especially well with our groups endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    RecommendChunksRequest recommendChunksRequest = new RecommendChunksRequest(); // RecommendChunksRequest | JSON request payload to get recommendations of chunks similar to the chunks in the request
    try {
      List<ChunkMetadataWithFileData> result = apiInstance.getRecommendedChunks(trDataset, recommendChunksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#getRecommendedChunks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **recommendChunksRequest** | [**RecommendChunksRequest**](RecommendChunksRequest.md)| JSON request payload to get recommendations of chunks similar to the chunks in the request | |

### Return type

[**List&lt;ChunkMetadataWithFileData&gt;**](ChunkMetadataWithFileData.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON response payload containing chunks with scores which are similar to those in the request body |  -  |
| **400** | Service error relating to to getting similar chunks |  -  |

<a id="searchChunk"></a>
# **searchChunk**
> SearchChunkQueryResponseBody searchChunk(trDataset, searchChunkData)

Search

Search  This route provides the primary search functionality for the API. It can be used to search for chunks by semantic similarity, full-text similarity, or a combination of both. Results&#39; &#x60;chunk_html&#x60; values will be modified with &#x60;&lt;b&gt;&#x60; tags for sub-sentence highlighting.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    SearchChunkData searchChunkData = new SearchChunkData(); // SearchChunkData | JSON request payload to semantically search for chunks (chunks)
    try {
      SearchChunkQueryResponseBody result = apiInstance.searchChunk(trDataset, searchChunkData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#searchChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **searchChunkData** | [**SearchChunkData**](SearchChunkData.md)| JSON request payload to semantically search for chunks (chunks) | |

### Return type

[**SearchChunkQueryResponseBody**](SearchChunkQueryResponseBody.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | chunks which are similar to the embedding vector of the search query |  -  |
| **400** | Service error relating to searching |  -  |

<a id="updateChunk"></a>
# **updateChunk**
> updateChunk(trDataset, updateChunkData)

Update Chunk

Update Chunk  Update a chunk. If you try to change the tracking_id of the chunk to have the same tracking_id as an existing chunk, the request will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UpdateChunkData updateChunkData = new UpdateChunkData(); // UpdateChunkData | JSON request payload to update a chunk (chunk)
    try {
      apiInstance.updateChunk(trDataset, updateChunkData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#updateChunk");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **updateChunkData** | [**UpdateChunkData**](UpdateChunkData.md)| JSON request payload to update a chunk (chunk) | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content Ok response indicating the chunk was updated as requested |  -  |
| **400** | Service error relating to to updating chunk, likely due to conflicting tracking_id |  -  |

<a id="updateChunkByTrackingId"></a>
# **updateChunkByTrackingId**
> updateChunkByTrackingId(trDataset, updateChunkByTrackingIdData)

Update Chunk By Tracking Id

Update Chunk By Tracking Id  Update a chunk by tracking_id. This is useful for when you are coordinating with an external system and want to use the tracking_id to identify the chunk.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkApi apiInstance = new ChunkApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UpdateChunkByTrackingIdData updateChunkByTrackingIdData = new UpdateChunkByTrackingIdData(); // UpdateChunkByTrackingIdData | JSON request payload to update a chunk by tracking_id (chunks)
    try {
      apiInstance.updateChunkByTrackingId(trDataset, updateChunkByTrackingIdData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkApi#updateChunkByTrackingId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **trDataset** | **String**| The dataset id to use for the request | |
| **updateChunkByTrackingIdData** | [**UpdateChunkByTrackingIdData**](UpdateChunkByTrackingIdData.md)| JSON request payload to update a chunk by tracking_id (chunks) | |

### Return type

null (empty response body)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Confirmation that the chunk has been updated as per your request |  -  |
| **400** | Service error relating to to updating chunk |  -  |

