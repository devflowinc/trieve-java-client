

# RecommendChunksRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**filters** | [**ChunkFilter**](ChunkFilter.md) |  |  [optional] |
|**limit** | **Long** | The number of chunks to return. This is the number of chunks which will be returned in the response. The default is 10. |  [optional] |
|**negativeChunkIds** | **List&lt;UUID&gt;** | The ids of the chunks to be used as negative examples for the recommendation. The chunks in this array will be used to filter out similar chunks. |  [optional] |
|**negativeTrackingIds** | **List&lt;String&gt;** | The tracking_ids of the chunks to be used as negative examples for the recommendation. The chunks in this array will be used to filter out similar chunks. |  [optional] |
|**positiveChunkIds** | **List&lt;UUID&gt;** | The ids of the chunks to be used as positive examples for the recommendation. The chunks in this array will be used to find similar chunks. |  [optional] |
|**positiveTrackingIds** | **List&lt;String&gt;** | The tracking_ids of the chunks to be used as positive examples for the recommendation. The chunks in this array will be used to find similar chunks. |  [optional] |



