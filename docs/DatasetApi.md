# DatasetApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDataset**](DatasetApi.md#createDataset) | **POST** /api/dataset | Create dataset |
| [**deleteDataset**](DatasetApi.md#deleteDataset) | **DELETE** /api/dataset | Delete Dataset |
| [**getClientDatasetConfig**](DatasetApi.md#getClientDatasetConfig) | **GET** /api/dataset/envs | Get Client Configuration |
| [**getDataset**](DatasetApi.md#getDataset) | **GET** /api/dataset/{dataset_id} | Get Dataset |
| [**getDatasetsFromOrganization**](DatasetApi.md#getDatasetsFromOrganization) | **GET** /api/dataset/organization/{organization_id} | Get Datasets from Organization |
| [**updateDataset**](DatasetApi.md#updateDataset) | **PUT** /api/dataset | Update Dataset |


<a id="createDataset"></a>
# **createDataset**
> Dataset createDataset(trOrganization, createDatasetRequest)

Create dataset

Create dataset  Create a new dataset. The auth&#39;ed user must be an owner of the organization to create a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    CreateDatasetRequest createDatasetRequest = new CreateDatasetRequest(); // CreateDatasetRequest | JSON request payload to create a new dataset
    try {
      Dataset result = apiInstance.createDataset(trOrganization, createDatasetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#createDataset");
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
| **trOrganization** | **String**| The organization id to use for the request | |
| **createDatasetRequest** | [**CreateDatasetRequest**](CreateDatasetRequest.md)| JSON request payload to create a new dataset | |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset created successfully |  -  |
| **400** | Service error relating to creating the dataset |  -  |

<a id="deleteDataset"></a>
# **deleteDataset**
> deleteDataset(trOrganization, deleteDatasetRequest)

Delete Dataset

Delete Dataset  Delete a dataset. The auth&#39;ed user must be an owner of the organization to delete a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    DeleteDatasetRequest deleteDatasetRequest = new DeleteDatasetRequest(); // DeleteDatasetRequest | JSON request payload to delete a dataset
    try {
      apiInstance.deleteDataset(trOrganization, deleteDatasetRequest);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#deleteDataset");
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
| **trOrganization** | **String**| The organization id to use for the request | |
| **deleteDatasetRequest** | [**DeleteDatasetRequest**](DeleteDatasetRequest.md)| JSON request payload to delete a dataset | |

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
| **204** | Dataset deleted successfully |  -  |
| **400** | Service error relating to deleting the dataset |  -  |

<a id="getClientDatasetConfig"></a>
# **getClientDatasetConfig**
> ClientDatasetConfiguration getClientDatasetConfig(trDataset)

Get Client Configuration

Get Client Configuration  Get the client configuration for a dataset. Will use the TR-D

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    try {
      ClientDatasetConfiguration result = apiInstance.getClientDatasetConfig(trDataset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getClientDatasetConfig");
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

### Return type

[**ClientDatasetConfiguration**](ClientDatasetConfiguration.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset environment variables |  -  |
| **400** | Service error relating to retrieving the dataset. Typically this only happens when your auth credentials are invalid. |  -  |

<a id="getDataset"></a>
# **getDataset**
> Dataset getDataset(trOrganization, trDataset, datasetId)

Get Dataset

Get Dataset  Get a dataset by id. The auth&#39;ed user must be an admin or owner of the organization to get a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID datasetId = UUID.randomUUID(); // UUID | The id of the dataset you want to retrieve.
    try {
      Dataset result = apiInstance.getDataset(trOrganization, trDataset, datasetId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDataset");
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
| **trOrganization** | **String**| The organization id to use for the request | |
| **trDataset** | **String**| The dataset id to use for the request | |
| **datasetId** | **UUID**| The id of the dataset you want to retrieve. | |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset retrieved successfully |  -  |
| **400** | Service error relating to retrieving the dataset |  -  |

<a id="getDatasetsFromOrganization"></a>
# **getDatasetsFromOrganization**
> List&lt;DatasetAndUsage&gt; getDatasetsFromOrganization(trOrganization, organizationId)

Get Datasets from Organization

Get Datasets from Organization  Get all datasets for an organization. The auth&#39;ed user must be an admin or owner of the organization to get its datasets.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID organizationId = UUID.randomUUID(); // UUID | id of the organization you want to retrieve datasets for
    try {
      List<DatasetAndUsage> result = apiInstance.getDatasetsFromOrganization(trOrganization, organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#getDatasetsFromOrganization");
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
| **trOrganization** | **String**| The organization id to use for the request | |
| **organizationId** | **UUID**| id of the organization you want to retrieve datasets for | |

### Return type

[**List&lt;DatasetAndUsage&gt;**](DatasetAndUsage.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Datasets retrieved successfully |  -  |
| **400** | Service error relating to retrieving the dataset |  -  |

<a id="updateDataset"></a>
# **updateDataset**
> Dataset updateDataset(trOrganization, updateDatasetRequest)

Update Dataset

Update Dataset  Update a dataset. The auth&#39;ed user must be an owner of the organization to update a dataset.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DatasetApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    DatasetApi apiInstance = new DatasetApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UpdateDatasetRequest updateDatasetRequest = new UpdateDatasetRequest(); // UpdateDatasetRequest | JSON request payload to update a dataset
    try {
      Dataset result = apiInstance.updateDataset(trOrganization, updateDatasetRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetApi#updateDataset");
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
| **trOrganization** | **String**| The organization id to use for the request | |
| **updateDatasetRequest** | [**UpdateDatasetRequest**](UpdateDatasetRequest.md)| JSON request payload to update a dataset | |

### Return type

[**Dataset**](Dataset.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dataset updated successfully |  -  |
| **400** | Service error relating to updating the dataset |  -  |

