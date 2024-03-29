# StripeApi

All URIs are relative to *http://localhost:8090*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cancelSubscription**](StripeApi.md#cancelSubscription) | **DELETE** /api/stripe/subscription/{subscription_id} | Cancel Subscription |
| [**directToPaymentLink**](StripeApi.md#directToPaymentLink) | **GET** /api/stripe/payment_link/{plan_id}/{organization_id} | Checkout |
| [**getAllPlans**](StripeApi.md#getAllPlans) | **GET** /api/stripe/plans | Get All Plans |
| [**updateSubscriptionPlan**](StripeApi.md#updateSubscriptionPlan) | **PATCH** /api/stripe/subscription_plan/{subscription_id}/{plan_id} | Update Subscription Plan |


<a id="cancelSubscription"></a>
# **cancelSubscription**
> cancelSubscription(trOrganization, subscriptionId)

Cancel Subscription

Cancel Subscription  Cancel a subscription by its id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StripeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    StripeApi apiInstance = new StripeApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID subscriptionId = UUID.randomUUID(); // UUID | id of the subscription you want to cancel
    try {
      apiInstance.cancelSubscription(trOrganization, subscriptionId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StripeApi#cancelSubscription");
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
| **subscriptionId** | **UUID**| id of the subscription you want to cancel | |

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
| **200** | Confirmation that the subscription was cancelled |  -  |
| **400** | Service error relating to creating a URL for a stripe checkout page |  -  |

<a id="directToPaymentLink"></a>
# **directToPaymentLink**
> directToPaymentLink(planId, organizationId)

Checkout

Checkout  Get a direct link to the stripe checkout page for the plan and organization

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StripeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    StripeApi apiInstance = new StripeApi(defaultClient);
    UUID planId = UUID.randomUUID(); // UUID | id of the plan you want to subscribe to
    UUID organizationId = UUID.randomUUID(); // UUID | id of the organization you want to subscribe to the plan
    try {
      apiInstance.directToPaymentLink(planId, organizationId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StripeApi#directToPaymentLink");
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
| **planId** | **UUID**| id of the plan you want to subscribe to | |
| **organizationId** | **UUID**| id of the organization you want to subscribe to the plan | |

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
| **303** | SeeOther response redirecting user to stripe checkout page |  -  |
| **400** | Service error relating to creating a URL for a stripe checkout page |  -  |

<a id="getAllPlans"></a>
# **getAllPlans**
> List&lt;StripePlan&gt; getAllPlans()

Get All Plans

Get All Plans  Get a list of all plans

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StripeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");

    StripeApi apiInstance = new StripeApi(defaultClient);
    try {
      List<StripePlan> result = apiInstance.getAllPlans();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StripeApi#getAllPlans");
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

[**List&lt;StripePlan&gt;**](StripePlan.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of all plans |  -  |
| **400** | Service error relating to getting all plans |  -  |

<a id="updateSubscriptionPlan"></a>
# **updateSubscriptionPlan**
> updateSubscriptionPlan(trOrganization, subscriptionId, planId)

Update Subscription Plan

Update Subscription Plan  Update a subscription to a new plan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StripeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8090");
    
    // Configure API key authorization: ApiKey
    ApiKeyAuth ApiKey = (ApiKeyAuth) defaultClient.getAuthentication("ApiKey");
    ApiKey.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //ApiKey.setApiKeyPrefix("Token");

    StripeApi apiInstance = new StripeApi(defaultClient);
    String trOrganization = "trOrganization_example"; // String | The organization id to use for the request
    UUID subscriptionId = UUID.randomUUID(); // UUID | id of the subscription you want to update
    UUID planId = UUID.randomUUID(); // UUID | id of the plan you want to subscribe to
    try {
      apiInstance.updateSubscriptionPlan(trOrganization, subscriptionId, planId);
    } catch (ApiException e) {
      System.err.println("Exception when calling StripeApi#updateSubscriptionPlan");
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
| **subscriptionId** | **UUID**| id of the subscription you want to update | |
| **planId** | **UUID**| id of the plan you want to subscribe to | |

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
| **200** | Confirmation that the subscription was updated to the new plan |  -  |
| **400** | Service error relating to updating the subscription to the new plan |  -  |

