# V1EdgeCloudConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;V1ClusterCondition&gt;**](V1ClusterCondition.md) |  |  [optional]
**nodeImage** | **String** |  |  [optional]
**sourceImageId** | **String** | SourceImageId can be from packref&#x27;s annotations or from pack.json |  [optional]
**useCapiImage** | **Boolean** | PackerVariableDigest string &#x60;json:\&quot;packerDigest,omitempty\&quot;&#x60; If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add |  [optional]
