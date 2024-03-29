

# ReccomendGroupChunksRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**ChunkFilter**](ChunkFilter.md) |  |  [optional] |
|**groupSize** | **Integer** | The number of chunks to fetch for each group. This is the number of chunks which will be returned in the response for each group. The default is 10. |  [optional] |
|**limit** | **Long** | The number of groups to return. This is the number of groups which will be returned in the response. The default is 10. |  [optional] |
|**negativeGroupIds** | **List&lt;UUID&gt;** | The  ids of the groups to be used as negative examples for the recommendation. The groups in this array will be used to filter out similar groups. |  [optional] |
|**negativeGroupTrackingIds** | **List&lt;String&gt;** | The  ids of the groups to be used as negative examples for the recommendation. The groups in this array will be used to filter out similar groups. |  [optional] |
|**positiveGroupIds** | **List&lt;UUID&gt;** | The  ids of the groups to be used as positive examples for the recommendation. The groups in this array will be used to find similar groups. |  [optional] |
|**positiveGroupTrackingIds** | **List&lt;String&gt;** | The  ids of the groups to be used as positive examples for the recommendation. The groups in this array will be used to find similar groups. |  [optional] |



