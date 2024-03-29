# HealthApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**healthCheck**](HealthApi.md#healthCheck) | **GET** /api/health | Health Check |


<a id="healthCheck"></a>
# **healthCheck**
> healthCheck()

Health Check

Health Check  Confirmation that the service is healthy and can make embedding vectors

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HealthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    HealthApi apiInstance = new HealthApi(defaultClient);
    try {
      apiInstance.healthCheck();
    } catch (ApiException e) {
      System.err.println("Exception when calling HealthApi#healthCheck");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the service is healthy and can make embedding vectors |  -  |
| **400** | Service error relating to making an embedding or overall service health |  -  |

