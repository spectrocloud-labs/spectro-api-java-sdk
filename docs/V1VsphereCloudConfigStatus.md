# V1VsphereCloudConfigStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ansibleDigest** | **String** |  |  [optional]
**conditions** | [**List&lt;V1ClusterCondition&gt;**](V1ClusterCondition.md) |  |  [optional]
**isAddonLayer** | **Boolean** | addon layers present in spc |  [optional]
**lastOVACreated** | **String** |  |  [optional]
**lastVMExported** | **String** |  |  [optional]
**nodeImage** | [**V1VsphereImage**](V1VsphereImage.md) |  |  [optional]
**roleDigest** | **Map&lt;String, String&gt;** | this map will be for ansible roles present in eack pack |  [optional]
**sourceImageId** | **String** | sourceImageId, it can be from packref&#x27;s annotations or from pack.json |  [optional]
**uploadOvaS3** | **String** | UploadOVAS3 will hold last image name which uploaded to S3 |  [optional]
**useCapiImage** | **Boolean** | If no ansible roles found in Packs then Mold should tell Drive to use capi image and not create custom image, because there is nothing to add |  [optional]
