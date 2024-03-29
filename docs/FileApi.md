# FileApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteFileHandler**](FileApi.md#deleteFileHandler) | **DELETE** /api/file/{file_id} | Delete File |
| [**getDatasetFilesHandler**](FileApi.md#getDatasetFilesHandler) | **GET** /api/dataset/files/{dataset_id}/{page} | Get Files for Dataset |
| [**getFileHandler**](FileApi.md#getFileHandler) | **GET** /api/file/{file_id} | Get File |
| [**uploadFileHandler**](FileApi.md#uploadFileHandler) | **POST** /api/file | Upload File |


<a id="deleteFileHandler"></a>
# **deleteFileHandler**
> deleteFileHandler(trDataset, fileId, deleteChunks)

Delete File

Delete File  Delete a file from S3 attached to the server based on its id. This will disassociate chunks from the file, but will not delete the chunks. We plan to add support for deleting chunks in a release soon. Auth&#39;ed user must be an admin or owner of the dataset&#39;s organization to upload a file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    FileApi apiInstance = new FileApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID fileId = UUID.randomUUID(); // UUID | The id of the file to delete
    Boolean deleteChunks = true; // Boolean | Whether or not to delete the chunks associated with the file
    try {
      apiInstance.deleteFileHandler(trDataset, fileId, deleteChunks);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#deleteFileHandler");
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
| **fileId** | **UUID**| The id of the file to delete | |
| **deleteChunks** | **Boolean**| Whether or not to delete the chunks associated with the file | |

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
| **204** | Confirmation that the file has been deleted |  -  |
| **400** | Service error relating to finding or deleting the file |  -  |

<a id="getDatasetFilesHandler"></a>
# **getDatasetFilesHandler**
> List&lt;ModelFile&gt; getDatasetFilesHandler(trDataset, datasetId, page)

Get Files for Dataset

Get Files for Dataset  Get all files which belong to a given dataset specified by the dataset_id parameter. 10 files are returned per page.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    FileApi apiInstance = new FileApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID datasetId = UUID.randomUUID(); // UUID | The id of the dataset to fetch files for.
    Long page = 56L; // Long | The page number of files you wish to fetch. Each page contains at most 10 files.
    try {
      List<ModelFile> result = apiInstance.getDatasetFilesHandler(trDataset, datasetId, page);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getDatasetFilesHandler");
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
| **datasetId** | **UUID**| The id of the dataset to fetch files for. | |
| **page** | **Long**| The page number of files you wish to fetch. Each page contains at most 10 files. | |

### Return type

[**List&lt;ModelFile&gt;**](ModelFile.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the files in the current dataset |  -  |
| **400** | Service error relating to getting the files in the current datase |  -  |

<a id="getFileHandler"></a>
# **getFileHandler**
> FileDTO getFileHandler(trDataset, fileId)

Get File

Get File  Download a file from S3 attached to the server based on its id. We plan to add support for getting signed S3 URLs to download from S3 directly in a release soon.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    FileApi apiInstance = new FileApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UUID fileId = UUID.randomUUID(); // UUID | The id of the file to fetch
    try {
      FileDTO result = apiInstance.getFileHandler(trDataset, fileId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#getFileHandler");
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
| **fileId** | **UUID**| The id of the file to fetch | |

### Return type

[**FileDTO**](FileDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The signed s3 url corresponding to the file_id requested |  -  |
| **400** | Service error relating to finding the file |  -  |

<a id="uploadFileHandler"></a>
# **uploadFileHandler**
> UploadFileResult uploadFileHandler(trDataset, uploadFileData)

Upload File

Upload File  Upload a file to S3 attached to the server. The file will be converted to HTML with tika and chunked algorithmically, images will be OCR&#39;ed with tesseract. The resulting chunks will be indexed and searchable. Optionally, you can only upload the file and manually create chunks associated to the file after. See docs.trieve.ai and/or contact us for more details and tips. Auth&#39;ed user must be an admin or owner of the dataset&#39;s organization to upload a file.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FileApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    FileApi apiInstance = new FileApi(defaultClient);
    String trDataset = "trDataset_example"; // String | The dataset id to use for the request
    UploadFileData uploadFileData = new UploadFileData(); // UploadFileData | JSON request payload to upload a file
    try {
      UploadFileResult result = apiInstance.uploadFileHandler(trDataset, uploadFileData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FileApi#uploadFileHandler");
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
| **uploadFileData** | [**UploadFileData**](UploadFileData.md)| JSON request payload to upload a file | |

### Return type

[**UploadFileResult**](UploadFileResult.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the file is uploading |  -  |
| **400** | Service error relating to uploading the file |  -  |

