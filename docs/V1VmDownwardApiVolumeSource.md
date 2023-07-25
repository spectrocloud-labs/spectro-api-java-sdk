# V1VmDownwardApiVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fields** | [**List&lt;V1VmDownwardApiVolumeFile&gt;**](V1VmDownwardApiVolumeFile.md) | Fields is a list of downward API volume file |  [optional]
**volumeLabel** | **String** | The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \&quot;cidata\&quot; (cloud-init), \&quot;config-2\&quot; (cloud-init) or \&quot;OEMDRV\&quot; (kickstart). |  [optional]
