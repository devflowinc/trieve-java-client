# AuthApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**callback**](AuthApi.md#callback) | **GET** /api/auth/callback | OpenID Connect callback |
| [**getMe**](AuthApi.md#getMe) | **GET** /api/auth/me | Get Me |
| [**login**](AuthApi.md#login) | **GET** /api/auth | Login |
| [**logout**](AuthApi.md#logout) | **DELETE** /api/auth | Logout |


<a id="callback"></a>
# **callback**
> SlimUser callback()

OpenID Connect callback

OpenID Connect callback  This is the callback route for the OAuth provider, it should not be called directly. Redirects to browser with set-cookie header.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      SlimUser result = apiInstance.callback();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#callback");
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

[**SlimUser**](SlimUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response that returns with set-cookie header |  -  |
| **400** | Email or password empty or incorrect |  -  |

<a id="getMe"></a>
# **getMe**
> SlimUser getMe()

Get Me

Get Me  Get the user corresponding to your current auth credentials.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      SlimUser result = apiInstance.getMe();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#getMe");
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

[**SlimUser**](SlimUser.md)

### Authorization

[ApiKey](../README.md#ApiKey)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The user corresponding to your current auth credentials |  -  |
| **400** | Error message indicitating you are not currently signed in |  -  |

<a id="login"></a>
# **login**
> login(content)

Login

Login  This will redirect you to the OAuth provider for authentication with email/pass, SSO, Google, Github, etc.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    AuthApi apiInstance = new AuthApi(defaultClient);
    AuthQuery content = new AuthQuery(); // AuthQuery | Query parameters for login to be included as kv pairs after ? on the request URL.
    try {
      apiInstance.login(content);
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#login");
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
| **content** | [**AuthQuery**](.md)| Query parameters for login to be included as kv pairs after ? on the request URL. | |

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
| **303** | Response that redirects to OAuth provider through a Location header to be handled by browser. |  -  |
| **400** | OAuth error likely with OIDC provider. |  -  |

<a id="logout"></a>
# **logout**
> logout()

Logout

Logout  Invalidate your current auth credential stored typically stored in a cookie. This does not invalidate your API key.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AuthApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    AuthApi apiInstance = new AuthApi(defaultClient);
    try {
      apiInstance.logout();
    } catch (ApiException e) {
      System.err.println("Exception when calling AuthApi#logout");
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
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Confirmation that your current auth token has been invalidated. This does not invalidate your API key. |  -  |

