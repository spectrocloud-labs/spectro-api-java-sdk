# V1VmDataVolumeSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**checkpoints** | [**List&lt;V1VmDataVolumeCheckpoint&gt;**](V1VmDataVolumeCheckpoint.md) | Checkpoints is a list of DataVolumeCheckpoints, representing stages in a multistage import. |  [optional]
**contentType** | **String** | DataVolumeContentType options: \&quot;kubevirt\&quot;, \&quot;archive\&quot; |  [optional]
**finalCheckpoint** | **Boolean** | FinalCheckpoint indicates whether the current DataVolumeCheckpoint is the final checkpoint. |  [optional]
**preallocation** | **Boolean** | Preallocation controls whether storage for DataVolumes should be allocated in advance. |  [optional]
**priorityClassName** | **String** | PriorityClassName for Importer, Cloner and Uploader pod |  [optional]
**pvc** | [**V1VmPersistentVolumeClaimSpec**](V1VmPersistentVolumeClaimSpec.md) |  |  [optional]
**source** | [**V1VmDataVolumeSource**](V1VmDataVolumeSource.md) |  |  [optional]
**sourceRef** | [**V1VmDataVolumeSourceRef**](V1VmDataVolumeSourceRef.md) |  |  [optional]
**storage** | [**V1VmStorageSpec**](V1VmStorageSpec.md) |  |  [optional]
