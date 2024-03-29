# TopicApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTopic**](TopicApi.md#createTopic) | **POST** /api/topic | Create Topic |
| [**deleteTopic**](TopicApi.md#deleteTopic) | **DELETE** /api/topic | Delete Topic |
| [**getAllTopicsForUser**](TopicApi.md#getAllTopicsForUser) | **GET** /api/topic/user/{user_id} | Get All Topics for User |
| [**updateTopic**](TopicApi.md#updateTopic) | **PUT** /api/topic | Update Topic |


<a id="createTopic"></a>
# **createTopic**
> Topic createTopic(trDataset, createTopicData)

Create Topic

Create Topic  Create a new chat topic. Topics are attached to a user and act as a coordinator for memory of gen-AI chat sessions. We are considering refactoring this resource of the API soon.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TopicApi apiInstance = new TopicApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    CreateTopicData createTopicData = new CreateTopicData(); // CreateTopicData | JSON request payload to create chat topic
    try {
      Topic result = apiInstance.createTopic(trDataset, createTopicData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#createTopic");
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
| **createTopicData** | [**CreateTopicData**](CreateTopicData.md)| JSON request payload to create chat topic | |

### Return type

[**Topic**](Topic.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The JSON response payload containing the created topic |  -  |
| **400** | Topic name empty or a service error |  -  |

<a id="deleteTopic"></a>
# **deleteTopic**
> deleteTopic(trDataset, deleteTopicData)

Delete Topic

Delete Topic  Delete an existing chat topic. When a topic is deleted, all associated chat messages are also deleted.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TopicApi apiInstance = new TopicApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    DeleteTopicData deleteTopicData = new DeleteTopicData(); // DeleteTopicData | JSON request payload to delete a chat topic
    try {
      apiInstance.deleteTopic(trDataset, deleteTopicData);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#deleteTopic");
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
| **deleteTopicData** | [**DeleteTopicData**](DeleteTopicData.md)| JSON request payload to delete a chat topic | |

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
| **204** | Confirmation that the topic was deleted |  -  |
| **400** | Service error relating to topic deletion |  -  |

<a id="getAllTopicsForUser"></a>
# **getAllTopicsForUser**
> List&lt;Topic&gt; getAllTopicsForUser(userId, trDataset)

Get All Topics for User

Get All Topics for User  Get all topics belonging to a the auth&#39;ed user. Soon, we plan to allow specification of the user for this route and include pagination.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TopicApi apiInstance = new TopicApi(defaultClient);
    UUID userId = UUID.randomUUID(); // UUID | The id of the user to get topics for
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    try {
      List<Topic> result = apiInstance.getAllTopicsForUser(userId, trDataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#getAllTopicsForUser");
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
| **userId** | **UUID**| The id of the user to get topics for | |
| **trDataset** | **String**| The dataset id to use for the request | |

### Return type

[**List&lt;Topic&gt;**](Topic.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All topics belonging to a given user |  -  |
| **400** | Service error relating to topic get |  -  |

<a id="updateTopic"></a>
# **updateTopic**
> updateTopic(trDataset, updateTopicData)

Update Topic

Update Topic  Update an existing chat topic. Currently, only the name of the topic can be updated.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TopicApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    TopicApi apiInstance = new TopicApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UpdateTopicData updateTopicData = new UpdateTopicData(); // UpdateTopicData | JSON request payload to update a chat topic
    try {
      apiInstance.updateTopic(trDataset, updateTopicData);
    } catch (ApiException e) {
      System.err.println("Exception when calling TopicApi#updateTopic");
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
| **updateTopicData** | [**UpdateTopicData**](UpdateTopicData.md)| JSON request payload to update a chat topic | |

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
| **204** | Confirmation that the topic was updated |  -  |
| **400** | Service error relating to topic update |  -  |

