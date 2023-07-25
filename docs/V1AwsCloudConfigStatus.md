# V1AwsCloudConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ansibleRoleDigest** | **String** | For mold controller to identify if is there any changes in Pack |  [optional]
**conditions** | [**List&lt;V1ClusterCondition&gt;**](V1ClusterCondition.md) |  |  [optional]
**images** | [**List&lt;V1AwsAMI&gt;**](V1AwsAMI.md) | Images array items should be 1-to-1 mapping to Spec.MachinePoolConfig |  [optional]
**isAddonLayer** | **Boolean** | addon layers present in spc |  [optional]
**roleDigest** | **Map&lt;String, String&gt;** | this map will be for ansible roles present in eack pack |  [optional]
**sourceImageId** | **String** | sourceImageId, it can be from packref&#x27;s annotations or from pack.json |  [optional]
**useCapiImage** | **Boolean** | PackerVariableDigest string &#x60;json:\&quot;packerDigest,omitempty\&quot;&#x60; If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add |  [optional]
