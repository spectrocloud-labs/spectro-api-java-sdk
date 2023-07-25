# V1ClusterComplianceScanSyftDriverConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**format** | [**FormatEnum**](#FormatEnum) |  |  [optional]
**labelSelector** | **String** |  |  [optional]
**location** | [**V1ObjectEntity**](V1ObjectEntity.md) |  |  [optional]
**namespace** | **String** |  |  [optional]
**podName** | **String** |  |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) |  |  [optional]

<a name="FormatEnum"></a>
## Enum: FormatEnum
Name | Value
---- | -----
CYCLONEDX_JSON | &quot;cyclonedx-json&quot;
GITHUB_JSON | &quot;github-json&quot;
SPDX_JSON | &quot;spdx-json&quot;
SYFT_JSON | &quot;syft-json&quot;

<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
CLUSTER | &quot;cluster&quot;
NAMESPACE | &quot;namespace&quot;
LABEL_SELECTOR | &quot;label-selector&quot;
POD | &quot;pod&quot;
