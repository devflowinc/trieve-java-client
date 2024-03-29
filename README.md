# trieve-java-client

Trieve API
- API version: 0.5.0
  - Build date: 2024-03-29T12:34:27.506198300-05:00[America/Chicago]
  - Generator version: 7.4.0

Trieve OpenAPI Specification. This document describes all of the operations available through the Trieve API.

  For more information, please visit [https://trieve.ai](https://trieve.ai)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.trieve</groupId>
  <artifactId>trieve-java-client</artifactId>
  <version>0.5.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'trieve-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'trieve-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.trieve:trieve-java-client:0.5.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/trieve-java-client-0.5.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8090*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**callback**](docs/AuthApi.md#callback) | **GET** /api/auth/callback | OpenID Connect callback
*AuthApi* | [**getMe**](docs/AuthApi.md#getMe) | **GET** /api/auth/me | Get Me
*AuthApi* | [**login**](docs/AuthApi.md#login) | **GET** /api/auth | Login
*AuthApi* | [**logout**](docs/AuthApi.md#logout) | **DELETE** /api/auth | Logout
*ChunkApi* | [**createChunk**](docs/ChunkApi.md#createChunk) | **POST** /api/chunk | Create or Upsert Chunk or Chunks
*ChunkApi* | [**createSuggestedQueriesHandler**](docs/ChunkApi.md#createSuggestedQueriesHandler) | **POST** /api/chunk/gen_suggestions | Generate suggested queries
*ChunkApi* | [**deleteChunk**](docs/ChunkApi.md#deleteChunk) | **DELETE** /api/chunk/{chunk_id} | Delete Chunk
*ChunkApi* | [**deleteChunkByTrackingId**](docs/ChunkApi.md#deleteChunkByTrackingId) | **DELETE** /api/chunk/tracking_id/{tracking_id} | Delete Chunk By Tracking Id
*ChunkApi* | [**generateOffChunks**](docs/ChunkApi.md#generateOffChunks) | **POST** /api/chunk/generate | RAG on Specified Chunks
*ChunkApi* | [**getChunkById**](docs/ChunkApi.md#getChunkById) | **GET** /api/chunk/{chunk_id} | Get Chunk By Id
*ChunkApi* | [**getChunkByTrackingId**](docs/ChunkApi.md#getChunkByTrackingId) | **GET** /api/chunk/tracking_id/{tracking_id} | Get Chunk By Tracking Id
*ChunkApi* | [**getRecommendedChunks**](docs/ChunkApi.md#getRecommendedChunks) | **POST** /api/chunk/recommend | Get Recommended Chunks
*ChunkApi* | [**searchChunk**](docs/ChunkApi.md#searchChunk) | **POST** /api/chunk/search | Search
*ChunkApi* | [**updateChunk**](docs/ChunkApi.md#updateChunk) | **PUT** /api/chunk | Update Chunk
*ChunkApi* | [**updateChunkByTrackingId**](docs/ChunkApi.md#updateChunkByTrackingId) | **PUT** /api/chunk/tracking_id/update | Update Chunk By Tracking Id
*ChunkGroupApi* | [**addChunkToGroup**](docs/ChunkGroupApi.md#addChunkToGroup) | **POST** /api/chunk_group/chunk/{group_id} | Add Chunk to Group
*ChunkGroupApi* | [**addChunkToGroupByTrackingId**](docs/ChunkGroupApi.md#addChunkToGroupByTrackingId) | **POST** /api/chunk_group/tracking_id/{tracking_id} | Add Chunk to Group by Tracking ID
*ChunkGroupApi* | [**createChunkGroup**](docs/ChunkGroupApi.md#createChunkGroup) | **POST** /api/chunk_group | Create Chunk Group
*ChunkGroupApi* | [**deleteChunkGroup**](docs/ChunkGroupApi.md#deleteChunkGroup) | **DELETE** /api/chunk_group/{group_id} | Delete Group
*ChunkGroupApi* | [**deleteGroupByTrackingId**](docs/ChunkGroupApi.md#deleteGroupByTrackingId) | **DELETE** /api/chunk_group/tracking_id/{tracking_id} | Delete Group by Tracking ID
*ChunkGroupApi* | [**getChunkGroup**](docs/ChunkGroupApi.md#getChunkGroup) | **GET** /api/chunk_group/{group_id} | Get Group
*ChunkGroupApi* | [**getChunksInGroup**](docs/ChunkGroupApi.md#getChunksInGroup) | **GET** /api/chunk_group/{group_id}/{page} | Get Chunks in Group
*ChunkGroupApi* | [**getChunksInGroupByTrackingId**](docs/ChunkGroupApi.md#getChunksInGroupByTrackingId) | **GET** /api/chunk_group/tracking_id/{group_tracking_id}/{page} | Get Chunks in Group by Tracking ID
*ChunkGroupApi* | [**getGroupByTrackingId**](docs/ChunkGroupApi.md#getGroupByTrackingId) | **GET** /api/chunk_group/tracking_id/{tracking_id} | Get Group by Tracking ID
*ChunkGroupApi* | [**getGroupsChunkIsIn**](docs/ChunkGroupApi.md#getGroupsChunkIsIn) | **POST** /api/chunk_group/chunks | Get Groups for Chunks
*ChunkGroupApi* | [**getRecommendedGroups**](docs/ChunkGroupApi.md#getRecommendedGroups) | **POST** /api/chunk_group/recommend | Get Recommended Groups
*ChunkGroupApi* | [**getSpecificDatasetChunkGroups**](docs/ChunkGroupApi.md#getSpecificDatasetChunkGroups) | **GET** /api/dataset/groups/{dataset_id}/{page} | Get Groups for Dataset
*ChunkGroupApi* | [**removeChunkFromGroup**](docs/ChunkGroupApi.md#removeChunkFromGroup) | **DELETE** /api/chunk_group/chunk/{group_id} | Remove Chunk from Group
*ChunkGroupApi* | [**searchOverGroups**](docs/ChunkGroupApi.md#searchOverGroups) | **POST** /api/chunk_group/group_oriented_search | Search Over Groups
*ChunkGroupApi* | [**searchWithinGroup**](docs/ChunkGroupApi.md#searchWithinGroup) | **POST** /api/chunk_group/search | Search Within Group
*ChunkGroupApi* | [**updateChunkGroup**](docs/ChunkGroupApi.md#updateChunkGroup) | **PUT** /api/chunk_group | Update Group
*ChunkGroupApi* | [**updateGroupByTrackingId**](docs/ChunkGroupApi.md#updateGroupByTrackingId) | **PUT** /api/chunk_group/tracking_id/{tracking_id} | Update Group by Tracking ID
*DatasetApi* | [**createDataset**](docs/DatasetApi.md#createDataset) | **POST** /api/dataset | Create dataset
*DatasetApi* | [**deleteDataset**](docs/DatasetApi.md#deleteDataset) | **DELETE** /api/dataset | Delete Dataset
*DatasetApi* | [**getClientDatasetConfig**](docs/DatasetApi.md#getClientDatasetConfig) | **GET** /api/dataset/envs | Get Client Configuration
*DatasetApi* | [**getDataset**](docs/DatasetApi.md#getDataset) | **GET** /api/dataset/{dataset_id} | Get Dataset
*DatasetApi* | [**getDatasetsFromOrganization**](docs/DatasetApi.md#getDatasetsFromOrganization) | **GET** /api/dataset/organization/{organization_id} | Get Datasets from Organization
*DatasetApi* | [**updateDataset**](docs/DatasetApi.md#updateDataset) | **PUT** /api/dataset | Update Dataset
*EventsApi* | [**getEvents**](docs/EventsApi.md#getEvents) | **POST** /api/events | Get events for the dataset
*FileApi* | [**deleteFileHandler**](docs/FileApi.md#deleteFileHandler) | **DELETE** /api/file/{file_id} | Delete File
*FileApi* | [**getDatasetFilesHandler**](docs/FileApi.md#getDatasetFilesHandler) | **GET** /api/dataset/files/{dataset_id}/{page} | Get Files for Dataset
*FileApi* | [**getFileHandler**](docs/FileApi.md#getFileHandler) | **GET** /api/file/{file_id} | Get File
*FileApi* | [**uploadFileHandler**](docs/FileApi.md#uploadFileHandler) | **POST** /api/file | Upload File
*HealthApi* | [**healthCheck**](docs/HealthApi.md#healthCheck) | **GET** /api/health | Health Check
*InvitationApi* | [**postInvitation**](docs/InvitationApi.md#postInvitation) | **POST** /api/invitation | Send Invitation
*MessageApi* | [**createMessageCompletionHandler**](docs/MessageApi.md#createMessageCompletionHandler) | **POST** /api/message | Create a message
*MessageApi* | [**editMessageHandler**](docs/MessageApi.md#editMessageHandler) | **PUT** /api/message | Edit a message
*MessageApi* | [**getAllTopicMessages**](docs/MessageApi.md#getAllTopicMessages) | **GET** /api/messages/{messages_topic_id} | Get all messages for a given topic
*MessageApi* | [**regenerateMessageHandler**](docs/MessageApi.md#regenerateMessageHandler) | **DELETE** /api/message | Regenerate message
*OrganizationApi* | [**createOrganization**](docs/OrganizationApi.md#createOrganization) | **POST** /api/organization | Create Organization
*OrganizationApi* | [**deleteOrganizationById**](docs/OrganizationApi.md#deleteOrganizationById) | **DELETE** /api/organization/{organization_id} | Delete Organization
*OrganizationApi* | [**getOrganizationById**](docs/OrganizationApi.md#getOrganizationById) | **GET** /api/organization/{organization_id} | Get Organization
*OrganizationApi* | [**getOrganizationUsage**](docs/OrganizationApi.md#getOrganizationUsage) | **GET** /api/organization/usage/{organization_id} | Get Organization Usage
*OrganizationApi* | [**getOrganizationUsers**](docs/OrganizationApi.md#getOrganizationUsers) | **GET** /api/organization/users/{organization_id} | Get Organization Users
*OrganizationApi* | [**updateOrganization**](docs/OrganizationApi.md#updateOrganization) | **PUT** /api/organization | Update Organization
*StripeApi* | [**cancelSubscription**](docs/StripeApi.md#cancelSubscription) | **DELETE** /api/stripe/subscription/{subscription_id} | Cancel Subscription
*StripeApi* | [**directToPaymentLink**](docs/StripeApi.md#directToPaymentLink) | **GET** /api/stripe/payment_link/{plan_id}/{organization_id} | Checkout
*StripeApi* | [**getAllPlans**](docs/StripeApi.md#getAllPlans) | **GET** /api/stripe/plans | Get All Plans
*StripeApi* | [**updateSubscriptionPlan**](docs/StripeApi.md#updateSubscriptionPlan) | **PATCH** /api/stripe/subscription_plan/{subscription_id}/{plan_id} | Update Subscription Plan
*TopicApi* | [**createTopic**](docs/TopicApi.md#createTopic) | **POST** /api/topic | Create Topic
*TopicApi* | [**deleteTopic**](docs/TopicApi.md#deleteTopic) | **DELETE** /api/topic | Delete Topic
*TopicApi* | [**getAllTopicsForUser**](docs/TopicApi.md#getAllTopicsForUser) | **GET** /api/topic/user/{user_id} | Get All Topics for User
*TopicApi* | [**updateTopic**](docs/TopicApi.md#updateTopic) | **PUT** /api/topic | Update Topic
*UserApi* | [**deleteUserApiKey**](docs/UserApi.md#deleteUserApiKey) | **DELETE** /api/user/delete_api_key | Delete User Api Key
*UserApi* | [**setUserApiKey**](docs/UserApi.md#setUserApiKey) | **POST** /api/user/set_api_key | Set User Api Key
*UserApi* | [**updateUser**](docs/UserApi.md#updateUser) | **PUT** /api/user | Update User


## Documentation for Models

 - [AddChunkToGroupData](docs/AddChunkToGroupData.md)
 - [ApiKeyDTO](docs/ApiKeyDTO.md)
 - [AuthQuery](docs/AuthQuery.md)
 - [BatchQueuedChunkResponse](docs/BatchQueuedChunkResponse.md)
 - [BookmarkData](docs/BookmarkData.md)
 - [BookmarkGroupResult](docs/BookmarkGroupResult.md)
 - [ChatMessageProxy](docs/ChatMessageProxy.md)
 - [ChunkData](docs/ChunkData.md)
 - [ChunkFilter](docs/ChunkFilter.md)
 - [ChunkGroup](docs/ChunkGroup.md)
 - [ChunkGroupAndFile](docs/ChunkGroupAndFile.md)
 - [ChunkMetadata](docs/ChunkMetadata.md)
 - [ChunkMetadataWithFileData](docs/ChunkMetadataWithFileData.md)
 - [ClientDatasetConfiguration](docs/ClientDatasetConfiguration.md)
 - [CreateChunkData](docs/CreateChunkData.md)
 - [CreateChunkGroupData](docs/CreateChunkGroupData.md)
 - [CreateDatasetRequest](docs/CreateDatasetRequest.md)
 - [CreateMessageData](docs/CreateMessageData.md)
 - [CreateOrganizationData](docs/CreateOrganizationData.md)
 - [CreateTopicData](docs/CreateTopicData.md)
 - [Dataset](docs/Dataset.md)
 - [DatasetAndUsage](docs/DatasetAndUsage.md)
 - [DatasetDTO](docs/DatasetDTO.md)
 - [DatasetUsageCount](docs/DatasetUsageCount.md)
 - [DeleteDatasetRequest](docs/DeleteDatasetRequest.md)
 - [DeleteTopicData](docs/DeleteTopicData.md)
 - [DeleteUserApiKeyRequest](docs/DeleteUserApiKeyRequest.md)
 - [EditMessageData](docs/EditMessageData.md)
 - [ErrorResponseBody](docs/ErrorResponseBody.md)
 - [Event](docs/Event.md)
 - [EventReturn](docs/EventReturn.md)
 - [FieldCondition](docs/FieldCondition.md)
 - [FileDTO](docs/FileDTO.md)
 - [GenerateChunksRequest](docs/GenerateChunksRequest.md)
 - [GetEventsData](docs/GetEventsData.md)
 - [GetGroupsForChunksData](docs/GetGroupsForChunksData.md)
 - [GroupData](docs/GroupData.md)
 - [GroupScoreChunkDTO](docs/GroupScoreChunkDTO.md)
 - [InvitationData](docs/InvitationData.md)
 - [MatchCondition](docs/MatchCondition.md)
 - [Message](docs/Message.md)
 - [ModelFile](docs/ModelFile.md)
 - [Organization](docs/Organization.md)
 - [OrganizationUsageCount](docs/OrganizationUsageCount.md)
 - [Range](docs/Range.md)
 - [ReccomendGroupChunksRequest](docs/ReccomendGroupChunksRequest.md)
 - [RecommendChunksRequest](docs/RecommendChunksRequest.md)
 - [RegenerateMessageData](docs/RegenerateMessageData.md)
 - [ReturnQueuedChunk](docs/ReturnQueuedChunk.md)
 - [ScoreChunkDTO](docs/ScoreChunkDTO.md)
 - [SearchChunkData](docs/SearchChunkData.md)
 - [SearchChunkQueryResponseBody](docs/SearchChunkQueryResponseBody.md)
 - [SearchGroupsResult](docs/SearchGroupsResult.md)
 - [SearchOverGroupsData](docs/SearchOverGroupsData.md)
 - [SearchOverGroupsResponseBody](docs/SearchOverGroupsResponseBody.md)
 - [SearchWithinGroupData](docs/SearchWithinGroupData.md)
 - [SetUserApiKeyRequest](docs/SetUserApiKeyRequest.md)
 - [SetUserApiKeyResponse](docs/SetUserApiKeyResponse.md)
 - [SingleQueuedChunkResponse](docs/SingleQueuedChunkResponse.md)
 - [SlimGroup](docs/SlimGroup.md)
 - [SlimUser](docs/SlimUser.md)
 - [StripePlan](docs/StripePlan.md)
 - [SuggestedQueriesRequest](docs/SuggestedQueriesRequest.md)
 - [SuggestedQueriesResponse](docs/SuggestedQueriesResponse.md)
 - [Topic](docs/Topic.md)
 - [UpdateChunkByTrackingIdData](docs/UpdateChunkByTrackingIdData.md)
 - [UpdateChunkData](docs/UpdateChunkData.md)
 - [UpdateChunkGroupData](docs/UpdateChunkGroupData.md)
 - [UpdateDatasetRequest](docs/UpdateDatasetRequest.md)
 - [UpdateGroupByTrackingIDData](docs/UpdateGroupByTrackingIDData.md)
 - [UpdateOrganizationData](docs/UpdateOrganizationData.md)
 - [UpdateTopicData](docs/UpdateTopicData.md)
 - [UpdateUserData](docs/UpdateUserData.md)
 - [UploadFileData](docs/UploadFileData.md)
 - [UploadFileResult](docs/UploadFileResult.md)
 - [UserOrganization](docs/UserOrganization.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="ApiKey"></a>
### ApiKey

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

developers@trieve.ai

