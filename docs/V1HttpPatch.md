# V1HttpPatch

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**from** | **String** | A path to the pointer from which reference will be taken |  [optional]
**op** | [**OpEnum**](#OpEnum) | The operation to be performed | 
**path** | **String** | A path to the pointer on which operation will be done | 
**value** | **Object** | The value to be used within the operations. |  [optional]

<a name="OpEnum"></a>
## Enum: OpEnum
Name | Value
---- | -----
ADD | &quot;add&quot;
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;
MOVE | &quot;move&quot;
COPY | &quot;copy&quot;
