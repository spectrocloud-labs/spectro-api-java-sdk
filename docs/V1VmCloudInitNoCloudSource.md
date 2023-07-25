# V1VmCloudInitNoCloudSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**networkData** | **String** | NetworkData contains NoCloud inline cloud-init networkdata. |  [optional]
**networkDataBase64** | **String** | NetworkDataBase64 contains NoCloud cloud-init networkdata as a base64 encoded string. |  [optional]
**networkDataSecretRef** | [**V1VmLocalObjectReference**](V1VmLocalObjectReference.md) |  |  [optional]
**secretRef** | [**V1VmLocalObjectReference**](V1VmLocalObjectReference.md) |  |  [optional]
**userData** | **String** | UserData contains NoCloud inline cloud-init userdata. |  [optional]
**userDataBase64** | **String** | UserDataBase64 contains NoCloud cloud-init userdata as a base64 encoded string. |  [optional]
