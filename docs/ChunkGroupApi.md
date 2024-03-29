# ChunkGroupApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChunkToGroup**](ChunkGroupApi.md#addChunkToGroup) | **POST** /api/chunk_group/chunk/{group_id} | Add Chunk to Group |
| [**addChunkToGroupByTrackingId**](ChunkGroupApi.md#addChunkToGroupByTrackingId) | **POST** /api/chunk_group/tracking_id/{tracking_id} | Add Chunk to Group by Tracking ID |
| [**createChunkGroup**](ChunkGroupApi.md#createChunkGroup) | **POST** /api/chunk_group | Create Chunk Group |
| [**deleteChunkGroup**](ChunkGroupApi.md#deleteChunkGroup) | **DELETE** /api/chunk_group/{group_id} | Delete Group |
| [**deleteGroupByTrackingId**](ChunkGroupApi.md#deleteGroupByTrackingId) | **DELETE** /api/chunk_group/tracking_id/{tracking_id} | Delete Group by Tracking ID |
| [**getChunkGroup**](ChunkGroupApi.md#getChunkGroup) | **GET** /api/chunk_group/{group_id} | Get Group |
| [**getChunksInGroup**](ChunkGroupApi.md#getChunksInGroup) | **GET** /api/chunk_group/{group_id}/{page} | Get Chunks in Group |
| [**getChunksInGroupByTrackingId**](ChunkGroupApi.md#getChunksInGroupByTrackingId) | **GET** /api/chunk_group/tracking_id/{group_tracking_id}/{page} | Get Chunks in Group by Tracking ID |
| [**getGroupByTrackingId**](ChunkGroupApi.md#getGroupByTrackingId) | **GET** /api/chunk_group/tracking_id/{tracking_id} | Get Group by Tracking ID |
| [**getGroupsChunkIsIn**](ChunkGroupApi.md#getGroupsChunkIsIn) | **POST** /api/chunk_group/chunks | Get Groups for Chunks |
| [**getRecommendedGroups**](ChunkGroupApi.md#getRecommendedGroups) | **POST** /api/chunk_group/recommend | Get Recommended Groups |
| [**getSpecificDatasetChunkGroups**](ChunkGroupApi.md#getSpecificDatasetChunkGroups) | **GET** /api/dataset/groups/{dataset_id}/{page} | Get Groups for Dataset |
| [**removeChunkFromGroup**](ChunkGroupApi.md#removeChunkFromGroup) | **DELETE** /api/chunk_group/chunk/{group_id} | Remove Chunk from Group |
| [**searchOverGroups**](ChunkGroupApi.md#searchOverGroups) | **POST** /api/chunk_group/group_oriented_search | Search Over Groups |
| [**searchWithinGroup**](ChunkGroupApi.md#searchWithinGroup) | **POST** /api/chunk_group/search | Search Within Group |
| [**updateChunkGroup**](ChunkGroupApi.md#updateChunkGroup) | **PUT** /api/chunk_group | Update Group |
| [**updateGroupByTrackingId**](ChunkGroupApi.md#updateGroupByTrackingId) | **PUT** /api/chunk_group/tracking_id/{tracking_id} | Update Group by Tracking ID |


<a id="addChunkToGroup"></a>
# **addChunkToGroup**
> addChunkToGroup(trDataset, groupId, addChunkToGroupData)

Add Chunk to Group

Add Chunk to Group  Route to add a chunk to a group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID groupId = UUID.randomUUID(); // UUID | Id of the group to add the chunk to as a bookmark
    AddChunkToGroupData addChunkToGroupData = new AddChunkToGroupData(); // AddChunkToGroupData | JSON request payload to add a chunk to a group (bookmark it)
    try {
      apiInstance.addChunkToGroup(trDataset, groupId, addChunkToGroupData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#addChunkToGroup");
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
| **groupId** | **UUID**| Id of the group to add the chunk to as a bookmark | |
| **addChunkToGroupData** | [**AddChunkToGroupData**](AddChunkToGroupData.md)| JSON request payload to add a chunk to a group (bookmark it) | |

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
| **204** | Confirmation that the chunk was added to the group (bookmark&#39;ed). |  -  |
| **400** | Service error relating to getting the groups that the chunk is in. |  -  |

<a id="addChunkToGroupByTrackingId"></a>
# **addChunkToGroupByTrackingId**
> addChunkToGroupByTrackingId(trDataset, trackingId, addChunkToGroupData)

Add Chunk to Group by Tracking ID

Add Chunk to Group by Tracking ID  Route to add a chunk to a group by tracking id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String trackingId = "trackingId_example"; // String | Id of the group to add the chunk to as a bookmark
    AddChunkToGroupData addChunkToGroupData = new AddChunkToGroupData(); // AddChunkToGroupData | JSON request payload to add a chunk to a group (bookmark it)
    try {
      apiInstance.addChunkToGroupByTrackingId(trDataset, trackingId, addChunkToGroupData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#addChunkToGroupByTrackingId");
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
| **trackingId** | **String**| Id of the group to add the chunk to as a bookmark | |
| **addChunkToGroupData** | [**AddChunkToGroupData**](AddChunkToGroupData.md)| JSON request payload to add a chunk to a group (bookmark it) | |

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
| **204** | Confirmation that the chunk was added to the group (bookmark&#39;ed). |  -  |
| **400** | Service error relating to getting the groups that the chunk is in. |  -  |

<a id="createChunkGroup"></a>
# **createChunkGroup**
> ChunkGroup createChunkGroup(trDataset, createChunkGroupData)

Create Chunk Group

Create Chunk Group  Create a new chunk_group. This is a way to group chunks together. If you try to create a chunk_group with the same tracking_id as an existing chunk_group, this operation will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    CreateChunkGroupData createChunkGroupData = new CreateChunkGroupData(); // CreateChunkGroupData | JSON request payload to cretea a chunkGroup
    try {
      ChunkGroup result = apiInstance.createChunkGroup(trDataset, createChunkGroupData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#createChunkGroup");
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
| **createChunkGroupData** | [**CreateChunkGroupData**](CreateChunkGroupData.md)| JSON request payload to cretea a chunkGroup | |

### Return type

[**ChunkGroup**](ChunkGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the created chunkGroup |  -  |
| **400** | Service error relating to creating the chunkGroup |  -  |

<a id="deleteChunkGroup"></a>
# **deleteChunkGroup**
> deleteChunkGroup(trDataset, groupId, deleteChunks)

Delete Group

Delete Group  This will delete a chunk_group. This will not delete the chunks that are in the group. We will soon support deleting a chunk_group along with its member chunks.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID groupId = UUID.randomUUID(); // UUID | Id of the group you want to fetch.
    Boolean deleteChunks = true; // Boolean | Delete the chunks within the group
    try {
      apiInstance.deleteChunkGroup(trDataset, groupId, deleteChunks);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#deleteChunkGroup");
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
| **groupId** | **UUID**| Id of the group you want to fetch. | |
| **deleteChunks** | **Boolean**| Delete the chunks within the group | |

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
| **204** | Confirmation that the chunkGroup was deleted |  -  |
| **400** | Service error relating to deleting the chunkGroup |  -  |

<a id="deleteGroupByTrackingId"></a>
# **deleteGroupByTrackingId**
> deleteGroupByTrackingId(trDataset, trackingId)

Delete Group by Tracking ID

Delete Group by Tracking ID  Delete a chunk_group with the given tracking id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String trackingId = "trackingId_example"; // String | Tracking id of the chunk_group to delete
    try {
      apiInstance.deleteGroupByTrackingId(trDataset, trackingId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#deleteGroupByTrackingId");
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
| **trackingId** | **String**| Tracking id of the chunk_group to delete | |

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
| **204** | Confirmation that the chunkGroup was deleted |  -  |
| **400** | Service error relating to deleting the chunkGroup |  -  |

<a id="getChunkGroup"></a>
# **getChunkGroup**
> ChunkGroup getChunkGroup(trDataset, groupId)

Get Group

Get Group  Fetch the group with the given id. get_group

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID groupId = UUID.randomUUID(); // UUID | Id of the group you want to fetch.
    try {
      ChunkGroup result = apiInstance.getChunkGroup(trDataset, groupId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getChunkGroup");
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
| **groupId** | **UUID**| Id of the group you want to fetch. | |

### Return type

[**ChunkGroup**](ChunkGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the group with the given tracking id |  -  |
| **400** | Service error relating to getting the group with the given tracking id |  -  |

<a id="getChunksInGroup"></a>
# **getChunksInGroup**
> BookmarkData getChunksInGroup(trDataset, groupId, page)

Get Chunks in Group

Get Chunks in Group  Route to get all chunks for a group. The response is paginated, with each page containing 10 chunks. Support for custom page size is coming soon.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID groupId = UUID.randomUUID(); // UUID | Id of the group you want to fetch.
    Long page = 56L; // Long | The page of chunks to get from the group
    try {
      BookmarkData result = apiInstance.getChunksInGroup(trDataset, groupId, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getChunksInGroup");
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
| **groupId** | **UUID**| Id of the group you want to fetch. | |
| **page** | **Long**| The page of chunks to get from the group | |

### Return type

[**BookmarkData**](BookmarkData.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chunks present within the specified group |  -  |
| **400** | Service error relating to getting the groups that the chunk is in |  -  |

<a id="getChunksInGroupByTrackingId"></a>
# **getChunksInGroupByTrackingId**
> BookmarkData getChunksInGroupByTrackingId(trDataset, groupTrackingId, page)

Get Chunks in Group by Tracking ID

Get Chunks in Group by Tracking ID  Route to get all chunks for a group. The response is paginated, with each page containing 10 chunks. Support for custom page size is coming soon.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String groupTrackingId = "groupTrackingId_example"; // String | The id of the group to get the chunks from
    Long page = 56L; // Long | The page of chunks to get from the group
    try {
      BookmarkData result = apiInstance.getChunksInGroupByTrackingId(trDataset, groupTrackingId, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getChunksInGroupByTrackingId");
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
| **groupTrackingId** | **String**| The id of the group to get the chunks from | |
| **page** | **Long**| The page of chunks to get from the group | |

### Return type

[**BookmarkData**](BookmarkData.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Chunks present within the specified group |  -  |
| **400** | Service error relating to getting the groups that the chunk is in |  -  |

<a id="getGroupByTrackingId"></a>
# **getGroupByTrackingId**
> ChunkGroup getGroupByTrackingId(trDataset, trackingId)

Get Group by Tracking ID

Get Group by Tracking ID  Fetch the group with the given tracking id. get_group_by_tracking_id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    String trackingId = "trackingId_example"; // String | The tracking id of the group to fetch.
    try {
      ChunkGroup result = apiInstance.getGroupByTrackingId(trDataset, trackingId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getGroupByTrackingId");
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
| **trackingId** | **String**| The tracking id of the group to fetch. | |

### Return type

[**ChunkGroup**](ChunkGroup.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the group with the given tracking id |  -  |
| **400** | Service error relating to getting the group with the given tracking id |  -  |

<a id="getGroupsChunkIsIn"></a>
# **getGroupsChunkIsIn**
> List&lt;BookmarkGroupResult&gt; getGroupsChunkIsIn(trDataset, getGroupsForChunksData)

Get Groups for Chunks

Get Groups for Chunks  Route to get the groups that a chunk is in.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    GetGroupsForChunksData getGroupsForChunksData = new GetGroupsForChunksData(); // GetGroupsForChunksData | JSON request payload to get the groups that a chunk is in
    try {
      List<BookmarkGroupResult> result = apiInstance.getGroupsChunkIsIn(trDataset, getGroupsForChunksData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getGroupsChunkIsIn");
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
| **getGroupsForChunksData** | [**GetGroupsForChunksData**](GetGroupsForChunksData.md)| JSON request payload to get the groups that a chunk is in | |

### Return type

[**List&lt;BookmarkGroupResult&gt;**](BookmarkGroupResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the groups that the chunk is in |  -  |
| **400** | Service error relating to getting the groups that the chunk is in |  -  |

<a id="getRecommendedGroups"></a>
# **getRecommendedGroups**
> List&lt;GroupScoreChunkDTO&gt; getRecommendedGroups(trDataset, reccomendGroupChunksRequest)

Get Recommended Groups

Get Recommended Groups  Route to get recommended groups. This route will return groups which are similar to the groups in the request body.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    ReccomendGroupChunksRequest reccomendGroupChunksRequest = new ReccomendGroupChunksRequest(); // ReccomendGroupChunksRequest | JSON request payload to get recommendations of chunks similar to the chunks in the request
    try {
      List<GroupScoreChunkDTO> result = apiInstance.getRecommendedGroups(trDataset, reccomendGroupChunksRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getRecommendedGroups");
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
| **reccomendGroupChunksRequest** | [**ReccomendGroupChunksRequest**](ReccomendGroupChunksRequest.md)| JSON request payload to get recommendations of chunks similar to the chunks in the request | |

### Return type

[**List&lt;GroupScoreChunkDTO&gt;**](GroupScoreChunkDTO.md)

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

<a id="getSpecificDatasetChunkGroups"></a>
# **getSpecificDatasetChunkGroups**
> GroupData getSpecificDatasetChunkGroups(trDataset, datasetId, page)

Get Groups for Dataset

Get Groups for Dataset  Fetch the groups which belong to a dataset specified by its id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID datasetId = UUID.randomUUID(); // UUID | The id of the dataset to fetch groups for.
    Long page = 56L; // Long | The page of groups to fetch. Each page contains 10 groups. Support for custom page size is coming soon.
    try {
      GroupData result = apiInstance.getSpecificDatasetChunkGroups(trDataset, datasetId, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#getSpecificDatasetChunkGroups");
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
| **datasetId** | **UUID**| The id of the dataset to fetch groups for. | |
| **page** | **Long**| The page of groups to fetch. Each page contains 10 groups. Support for custom page size is coming soon. | |

### Return type

[**GroupData**](GroupData.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the groups created by the given dataset |  -  |
| **400** | Service error relating to getting the groups created by the given dataset |  -  |

<a id="removeChunkFromGroup"></a>
# **removeChunkFromGroup**
> removeChunkFromGroup(trDataset, groupId, createChunkGroupData)

Remove Chunk from Group

Remove Chunk from Group  Route to remove a chunk from a group.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID groupId = UUID.randomUUID(); // UUID | Id of the group to remove the bookmark'ed chunk from
    CreateChunkGroupData createChunkGroupData = new CreateChunkGroupData(); // CreateChunkGroupData | JSON request payload to cretea a chunkGroup
    try {
      apiInstance.removeChunkFromGroup(trDataset, groupId, createChunkGroupData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#removeChunkFromGroup");
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
| **groupId** | **UUID**| Id of the group to remove the bookmark&#39;ed chunk from | |
| **createChunkGroupData** | [**CreateChunkGroupData**](CreateChunkGroupData.md)| JSON request payload to cretea a chunkGroup | |

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
| **204** | Confirmation that the chunk was removed to the group |  -  |
| **400** | Service error relating to removing the chunk from the group |  -  |

<a id="searchOverGroups"></a>
# **searchOverGroups**
> SearchOverGroupsResponseBody searchOverGroups(searchOverGroupsData)

Search Over Groups

Search Over Groups  This route allows you to get groups as results instead of chunks. Each group returned will have the matching chunks sorted by similarity within the group. This is useful for when you want to get groups of chunks which are similar to the search query. If choosing hybrid search, the results will be re-ranked using BAAI/bge-reranker-large. Compatible with semantic, fulltext, or hybrid search modes.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    SearchOverGroupsData searchOverGroupsData = new SearchOverGroupsData(); // SearchOverGroupsData | JSON request payload to semantically search over groups
    try {
      SearchOverGroupsResponseBody result = apiInstance.searchOverGroups(searchOverGroupsData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#searchOverGroups");
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
| **searchOverGroupsData** | [**SearchOverGroupsData**](SearchOverGroupsData.md)| JSON request payload to semantically search over groups | |

### Return type

[**SearchOverGroupsResponseBody**](SearchOverGroupsResponseBody.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group chunks which are similar to the embedding vector of the search query |  -  |
| **400** | Service error relating to getting the groups that the chunk is in |  -  |

<a id="searchWithinGroup"></a>
# **searchWithinGroup**
> SearchGroupsResult searchWithinGroup(trDataset, searchWithinGroupData)

Search Within Group

Search Within Group  This route allows you to search only within a group. This is useful for when you only want search results to contain chunks which are members of a specific group. If choosing hybrid search, the results will be re-ranked using BAAI/bge-reranker-large.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    SearchWithinGroupData searchWithinGroupData = new SearchWithinGroupData(); // SearchWithinGroupData | JSON request payload to semantically search a group
    try {
      SearchGroupsResult result = apiInstance.searchWithinGroup(trDataset, searchWithinGroupData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#searchWithinGroup");
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
| **searchWithinGroupData** | [**SearchWithinGroupData**](SearchWithinGroupData.md)| JSON request payload to semantically search a group | |

### Return type

[**SearchGroupsResult**](SearchGroupsResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Group chunks which are similar to the embedding vector of the search query |  -  |
| **400** | Service error relating to getting the groups that the chunk is in |  -  |

<a id="updateChunkGroup"></a>
# **updateChunkGroup**
> updateChunkGroup(trDataset, updateChunkGroupData)

Update Group

Update Group  Update a chunk_group. If you try to change the tracking_id to one that already exists, this operation will fail.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UpdateChunkGroupData updateChunkGroupData = new UpdateChunkGroupData(); // UpdateChunkGroupData | JSON request payload to update a chunkGroup
    try {
      apiInstance.updateChunkGroup(trDataset, updateChunkGroupData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#updateChunkGroup");
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
| **updateChunkGroupData** | [**UpdateChunkGroupData**](UpdateChunkGroupData.md)| JSON request payload to update a chunkGroup | |

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
| **204** | Confirmation that the chunkGroup was updated |  -  |
| **400** | Service error relating to updating the chunkGroup |  -  |

<a id="updateGroupByTrackingId"></a>
# **updateGroupByTrackingId**
> updateGroupByTrackingId(trDataset, trackingId, updateGroupByTrackingIDData)

Update Group by Tracking ID

Update Group by Tracking ID  Update a chunk_group with the given tracking id.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChunkGroupApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    ChunkGroupApi apiInstance = new ChunkGroupApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID trackingId = UUID.randomUUID(); // UUID | Tracking id of the chunk_group to update
    UpdateGroupByTrackingIDData updateGroupByTrackingIDData = new UpdateGroupByTrackingIDData(); // UpdateGroupByTrackingIDData | JSON request payload to update a chunkGroup
    try {
      apiInstance.updateGroupByTrackingId(trDataset, trackingId, updateGroupByTrackingIDData);
    } catch (ApiException e) {
      System.err.println("Exception when calling ChunkGroupApi#updateGroupByTrackingId");
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
| **trackingId** | **UUID**| Tracking id of the chunk_group to update | |
| **updateGroupByTrackingIDData** | [**UpdateGroupByTrackingIDData**](UpdateGroupByTrackingIDData.md)| JSON request payload to update a chunkGroup | |

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
| **204** | Confirmation that the chunkGroup was updated |  -  |
| **400** | Service error relating to updating the chunkGroup |  -  |

