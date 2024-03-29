# UserApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUserApiKey**](UserApi.md#deleteUserApiKey) | **DELETE** /api/user/delete_api_key | Delete User Api Key |
| [**setUserApiKey**](UserApi.md#setUserApiKey) | **POST** /api/user/set_api_key | Set User Api Key |
| [**updateUser**](UserApi.md#updateUser) | **PUT** /api/user | Update User |


<a id="deleteUserApiKey"></a>
# **deleteUserApiKey**
> List&lt;ApiKeyDTO&gt; deleteUserApiKey(deleteUserApiKeyRequest)

Delete User Api Key

Delete User Api Key  Delete an api key for the auth&#39;ed user.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    DeleteUserApiKeyRequest deleteUserApiKeyRequest = new DeleteUserApiKeyRequest(); // DeleteUserApiKeyRequest | JSON request payload to delete a user api key
    try {
      List<ApiKeyDTO> result = apiInstance.deleteUserApiKey(deleteUserApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#deleteUserApiKey");
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
| **deleteUserApiKeyRequest** | [**DeleteUserApiKeyRequest**](DeleteUserApiKeyRequest.md)| JSON request payload to delete a user api key | |

### Return type

[**List&lt;ApiKeyDTO&gt;**](ApiKeyDTO.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the api_key for the user |  -  |
| **400** | Service error relating to creating api_key for the user |  -  |

<a id="setUserApiKey"></a>
# **setUserApiKey**
> SetUserApiKeyResponse setUserApiKey(setUserApiKeyRequest)

Set User Api Key

Set User Api Key  Create a new api key for the auth&#39;ed user. Successful response will contain the newly created api key. If a write role is assigned the api key will have permission level of the auth&#39;ed user who calls this endpoint.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    SetUserApiKeyRequest setUserApiKeyRequest = new SetUserApiKeyRequest(); // SetUserApiKeyRequest | JSON request payload to create a new user api key
    try {
      SetUserApiKeyResponse result = apiInstance.setUserApiKey(setUserApiKeyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#setUserApiKey");
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
| **setUserApiKeyRequest** | [**SetUserApiKeyRequest**](SetUserApiKeyRequest.md)| JSON request payload to create a new user api key | |

### Return type

[**SetUserApiKeyResponse**](SetUserApiKeyResponse.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the api_key for the user |  -  |
| **400** | Service error relating to creating api_key for the user |  -  |

<a id="updateUser"></a>
# **updateUser**
> SlimUser updateUser(updateUserData)

Update User

Update User  Update a user&#39;s information. If the user_id is not provided, the auth&#39;ed user will be updated. If the user_id is provided, the auth&#39;ed user must be an admin (1) or owner (2) of the organization.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UserApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    UserApi apiInstance = new UserApi(defaultClient);
    UpdateUserData updateUserData = new UpdateUserData(); // UpdateUserData | JSON request payload to update user information for the auth'ed user
    try {
      SlimUser result = apiInstance.updateUser(updateUserData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UserApi#updateUser");
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
| **updateUserData** | [**UpdateUserData**](UpdateUserData.md)| JSON request payload to update user information for the auth&#39;ed user | |

### Return type

[**SlimUser**](SlimUser.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | JSON body representing the updated user information |  -  |
| **400** | Service error relating to updating the user |  -  |

