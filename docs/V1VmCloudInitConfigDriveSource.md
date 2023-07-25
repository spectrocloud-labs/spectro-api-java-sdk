# V1VmCloudInitConfigDriveSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkData** | **String** | NetworkData contains config drive inline cloud-init networkdata. |  [optional]
**networkDataBase64** | **String** | NetworkDataBase64 contains config drive cloud-init networkdata as a base64 encoded string. |  [optional]
**networkDataSecretRef** | [**V1VmLocalObjectReference**](V1VmLocalObjectReference.md) |  |  [optional]
**secretRef** | [**V1VmLocalObjectReference**](V1VmLocalObjectReference.md) |  |  [optional]
**userData** | **String** | UserData contains config drive inline cloud-init userdata. |  [optional]
**userDataBase64** | **String** | UserDataBase64 contains config drive cloud-init userdata as a base64 encoded string. |  [optional]
