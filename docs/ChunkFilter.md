

# ChunkFilter


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**must** | [**List&lt;FieldCondition&gt;**](FieldCondition.md) | All of these field conditions have to match for the chunk to be included in the result set. |  [optional] |
|**mustNot** | [**List&lt;FieldCondition&gt;**](FieldCondition.md) | None of these field conditions can match for the chunk to be included in the result set. |  [optional] |
|**should** | [**List&lt;FieldCondition&gt;**](FieldCondition.md) | Only one of these field conditions has to match for the chunk to be included in the result set. |  [optional] |



