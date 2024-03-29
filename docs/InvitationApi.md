# InvitationApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postInvitation**](InvitationApi.md#postInvitation) | **POST** /api/invitation | Send Invitation |


<a id="postInvitation"></a>
# **postInvitation**
> postInvitation(trOrganization, invitationData)

Send Invitation

Send Invitation  Invitations act as a way to invite users to join an organization. After a user is invited, they will automatically be added to the organization with the role specified in the invitation once they set their.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InvitationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    InvitationApi apiInstance = new InvitationApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    InvitationData invitationData = new InvitationData(); // InvitationData | JSON request payload to send an invitation
    try {
      apiInstance.postInvitation(trOrganization, invitationData);
    } catch (ApiException e) {
      System.err.println("Exception when calling InvitationApi#postInvitation");
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
| **invitationData** | [**InvitationData**](InvitationData.md)| JSON request payload to send an invitation | |

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
| **204** | Ok response. Indicates that invitation email was sent correctly. |  -  |
| **400** | Invalid email or some other error |  -  |

