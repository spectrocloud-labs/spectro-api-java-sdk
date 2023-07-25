# V1VmAddVolumeOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**disk** | [**V1VmDisk**](V1VmDisk.md) |  | 
**dryRun** | **List&lt;String&gt;** | When present, indicates that modifications should not be persisted. An invalid or unrecognized dryRun directive will result in an error response and no further processing of the request. Valid values are: - All: all dry run stages will be processed |  [optional]
**name** | **String** | Name represents the name that will be used to map the disk to the corresponding volume. This overrides any name set inside the Disk struct itself. | 
**volumeSource** | [**V1VmHotplugVolumeSource**](V1VmHotplugVolumeSource.md) |  | 
