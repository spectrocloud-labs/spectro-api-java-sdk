# V1PackManifestEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**layer** | **String** | Pack layer |  [optional]
**manifests** | [**List&lt;V1ManifestInputEntity&gt;**](V1ManifestInputEntity.md) | Pack manifests are additional content as part of the profile |  [optional]
**name** | **String** | Pack name | 
**registryUid** | **String** | Pack registry uid |  [optional]
**tag** | **String** | Pack tag |  [optional]
**type** | [**V1PackType**](V1PackType.md) |  |  [optional]
**uid** | **String** | Pack uid |  [optional]
**values** | **String** | Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values |  [optional]
