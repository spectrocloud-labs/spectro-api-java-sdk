# V1PackManifestsSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addonType** | **String** | Pack add-on type such as logging, monitoring, security etc |  [optional]
**annotations** | **Map&lt;String, String&gt;** | Pack annotations is used to allow pack to add more arbitrary configurations |  [optional]
**cloudTypes** | [**List&lt;V1CloudType&gt;**](V1CloudType.md) | Pack supported cloud types |  [optional]
**digest** | **String** | Pack digest |  [optional]
**displayName** | **String** | Pack display name |  [optional]
**eol** | **String** | Pack end of life, date format: yyyy-MM-dd |  [optional]
**group** | **String** | Pack group |  [optional]
**layer** | [**V1PackLayer**](V1PackLayer.md) |  |  [optional]
**logoUrl** | **String** | Pack logo url |  [optional]
**manifests** | [**List&lt;V1ManifestSummary&gt;**](V1ManifestSummary.md) | Pack manifests are additional content as part of the cluster profile |  [optional]
**name** | **String** | Pack name |  [optional]
**presets** | [**List&lt;V1PackPreset&gt;**](V1PackPreset.md) | Pack presets are the set of configurations applied on user selection of presets |  [optional]
**registryUid** | **String** | Pack registry uid |  [optional]
**schema** | [**List&lt;V1PackSchema&gt;**](V1PackSchema.md) | Pack schema contains constraints such as data type, format, hints for the pack values |  [optional]
**type** | [**V1PackType**](V1PackType.md) |  |  [optional]
**values** | **String** | Pack values |  [optional]
**version** | **String** | Pack version |  [optional]
