# OrganizationApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrganization**](OrganizationApi.md#createOrganization) | **POST** /api/organization | Create Organization |
| [**deleteOrganizationById**](OrganizationApi.md#deleteOrganizationById) | **DELETE** /api/organization/{organization_id} | Delete Organization |
| [**getOrganizationById**](OrganizationApi.md#getOrganizationById) | **GET** /api/organization/{organization_id} | Get Organization |
| [**getOrganizationUsage**](OrganizationApi.md#getOrganizationUsage) | **GET** /api/organization/usage/{organization_id} | Get Organization Usage |
| [**getOrganizationUsers**](OrganizationApi.md#getOrganizationUsers) | **GET** /api/organization/users/{organization_id} | Get Organization Users |
| [**updateOrganization**](OrganizationApi.md#updateOrganization) | **PUT** /api/organization | Update Organization |


<a id="createOrganization"></a>
# **createOrganization**
> Organization createOrganization(createOrganizationData)

Create Organization

Create Organization  Create a new organization. The auth&#39;ed user who creates the organization will be the default owner of the organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    CreateOrganizationData createOrganizationData = new CreateOrganizationData(); // CreateOrganizationData | The organization data that you want to create
    try {
      Organization result = apiInstance.createOrganization(createOrganizationData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#createOrganization");
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
| **createOrganizationData** | [**CreateOrganizationData**](CreateOrganizationData.md)| The organization data that you want to create | |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created organization object |  -  |
| **400** | Service error relating to creating the organization |  -  |

<a id="deleteOrganizationById"></a>
# **deleteOrganizationById**
> Organization deleteOrganizationById(trOrganization, organizationId)

Delete Organization

Delete Organization  Delete an organization by its id. The auth&#39;ed user must be an owner of the organization to delete it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID organizationId = UUID.randomUUID(); // UUID | The id of the organization you want to fetch.
    try {
      Organization result = apiInstance.deleteOrganizationById(trOrganization, organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#deleteOrganizationById");
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
| **organizationId** | **UUID**| The id of the organization you want to fetch. | |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Confirmation that the organization was deleted |  -  |
| **400** | Service error relating to deleting the organization by id |  -  |

<a id="getOrganizationById"></a>
# **getOrganizationById**
> Organization getOrganizationById(trOrganization, organizationId)

Get Organization

Get Organization  Fetch the details of an organization by its id. The auth&#39;ed user must be an admin or owner of the organization to fetch it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID organizationId = UUID.randomUUID(); // UUID | The id of the organization you want to fetch.
    try {
      Organization result = apiInstance.getOrganizationById(trOrganization, organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationById");
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
| **organizationId** | **UUID**| The id of the organization you want to fetch. | |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Organization with the id that was requested |  -  |
| **400** | Service error relating to finding the organization by id |  -  |

<a id="getOrganizationUsage"></a>
# **getOrganizationUsage**
> OrganizationUsageCount getOrganizationUsage(trOrganization, organizationId)

Get Organization Usage

Get Organization Usage  Fetch the current usage specification of an organization by its id. The auth&#39;ed user must be an admin or owner of the organization to fetch it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID organizationId = UUID.randomUUID(); // UUID | The id of the organization you want to fetch the usage of.
    try {
      OrganizationUsageCount result = apiInstance.getOrganizationUsage(trOrganization, organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationUsage");
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
| **organizationId** | **UUID**| The id of the organization you want to fetch the usage of. | |

### Return type

[**OrganizationUsageCount**](OrganizationUsageCount.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current usage of the specified organization |  -  |
| **400** | Service error relating to finding the organization&#39;s usage by id |  -  |

<a id="getOrganizationUsers"></a>
# **getOrganizationUsers**
> List&lt;SlimUser&gt; getOrganizationUsers(trOrganization, organizationId)

Get Organization Users

Get Organization Users  Fetch the users of an organization by its id. The auth&#39;ed user must be an admin or owner of the organization to fetch it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID organizationId = UUID.randomUUID(); // UUID | The id of the organization you want to fetch the users of.
    try {
      List<SlimUser> result = apiInstance.getOrganizationUsers(trOrganization, organizationId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#getOrganizationUsers");
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
| **organizationId** | **UUID**| The id of the organization you want to fetch the users of. | |

### Return type

[**List&lt;SlimUser&gt;**](SlimUser.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of users who belong to the specified by organization |  -  |
| **400** | Service error relating to finding the organization&#39;s users by id |  -  |

<a id="updateOrganization"></a>
# **updateOrganization**
> Organization updateOrganization(trOrganization, updateOrganizationData)

Update Organization

Update Organization  Update an organization. Only the owner of the organization can update it.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrganizationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    OrganizationApi apiInstance = new OrganizationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UpdateOrganizationData updateOrganizationData = new UpdateOrganizationData(); // UpdateOrganizationData | The organization data that you want to update
    try {
      Organization result = apiInstance.updateOrganization(trOrganization, updateOrganizationData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganizationApi#updateOrganization");
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
| **updateOrganizationData** | [**UpdateOrganizationData**](UpdateOrganizationData.md)| The organization data that you want to update | |

### Return type

[**Organization**](Organization.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated organization object |  -  |
| **400** | Service error relating to updating the organization |  -  |

