# V1AzureCloudConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ansibleRoleDigest** | **String** | For mold controller to identify if is there any changes in Pack |  [optional]
**conditions** | [**List&lt;V1ClusterCondition&gt;**](V1ClusterCondition.md) | spectroAnsibleProvisioner: should be added only once, subsequent recocile will use the same provisioner SpectroAnsiblePacker bool &#x60;json:\&quot;spectroAnsiblePacker,omitempty\&quot;&#x60; |  [optional]
**images** | [**V1AzureImage**](V1AzureImage.md) |  |  [optional]
**isAddonLayer** | **Boolean** | addon layers present in spc |  [optional]
**roleDigest** | **Map&lt;String, String&gt;** | this map will be for ansible roles present in eack pack |  [optional]
**sourceImageId** | **String** | sourceImageId, it can be from packref&#x27;s annotations or from pack.json |  [optional]
**useCapiImage** | **Boolean** | PackerVariableDigest string &#x60;json:\&quot;packerDigest,omitempty\&quot;&#x60; If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add |  [optional]
**vhdImage** | [**V1AzureVHDImage**](V1AzureVHDImage.md) |  |  [optional]
