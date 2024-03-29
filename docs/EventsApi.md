# EventsApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEvents**](EventsApi.md#getEvents) | **POST** /api/events | Get events for the dataset |


<a id="getEvents"></a>
# **getEvents**
> EventReturn getEvents(trDataset, getEventsData)

Get events for the dataset

Get events for the dataset  Get events for the auth&#39;ed user. Currently, this is only for events belonging to the auth&#39;ed user. Soon, we plan to associate events to datasets instead of users.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    EventsApi apiInstance = new EventsApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    GetEventsData getEventsData = new GetEventsData(); // GetEventsData | JSON request payload to get events for a dataset
    try {
      EventReturn result = apiInstance.getEvents(trDataset, getEventsData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventsApi#getEvents");
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
| **getEventsData** | [**GetEventsData**](GetEventsData.md)| JSON request payload to get events for a dataset | |

### Return type

[**EventReturn**](EventReturn.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Events for the dataset |  -  |
| **400** | Service error relating to getting events for the dataset |  -  |

