# V1PackImportEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**layer** | **String** | Pack layer [ \&quot;os\&quot;, \&quot;k8s\&quot;, \&quot;cni\&quot;, \&quot;csi\&quot;, \&quot;addon\&quot; ] |  [optional]
**manifests** | [**List&lt;V1PackManifestImportEntity&gt;**](V1PackManifestImportEntity.md) | Pack manifests array |  [optional]
**name** | **String** | Pack name |  [optional]
**registry** | [**V1PackRegistryImportEntity**](V1PackRegistryImportEntity.md) |  |  [optional]
**tag** | **String** | Pack version tag |  [optional]
**type** | **String** | Pack type [ \&quot;spectro\&quot;, \&quot;helm\&quot;, \&quot;manifest\&quot;, \&quot;oci\&quot; ] |  [optional]
**values** | **String** | Pack values are the customizable configurations for the pack |  [optional]
**version** | **String** | Pack version |  [optional]
