# V1PackValuesEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**manifests** | [**List&lt;V1ManifestRefUpdateEntity&gt;**](V1ManifestRefUpdateEntity.md) | Pack manifests are additional content as part of the profile |  [optional]
**name** | **String** | Pack name | 
**tag** | **String** | Pack version tag |  [optional]
**type** | [**V1PackType**](V1PackType.md) |  |  [optional]
**values** | **String** | Pack values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values |  [optional]
