# V1VmVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudInitConfigDrive** | [**V1VmCloudInitConfigDriveSource**](V1VmCloudInitConfigDriveSource.md) |  |  [optional]
**cloudInitNoCloud** | [**V1VmCloudInitNoCloudSource**](V1VmCloudInitNoCloudSource.md) |  |  [optional]
**configMap** | [**V1VmConfigMapVolumeSource**](V1VmConfigMapVolumeSource.md) |  |  [optional]
**containerDisk** | [**V1VmContainerDiskSource**](V1VmContainerDiskSource.md) |  |  [optional]
**dataVolume** | [**V1VmCoreDataVolumeSource**](V1VmCoreDataVolumeSource.md) |  |  [optional]
**downwardAPI** | [**V1VmDownwardApiVolumeSource**](V1VmDownwardApiVolumeSource.md) |  |  [optional]
**downwardMetrics** | [**V1VmDownwardMetricsVolumeSource**](V1VmDownwardMetricsVolumeSource.md) |  |  [optional]
**emptyDisk** | [**V1VmEmptyDiskSource**](V1VmEmptyDiskSource.md) |  |  [optional]
**ephemeral** | [**V1VmEphemeralVolumeSource**](V1VmEphemeralVolumeSource.md) |  |  [optional]
**hostDisk** | [**V1VmHostDisk**](V1VmHostDisk.md) |  |  [optional]
**memoryDump** | [**V1VmMemoryDumpVolumeSource**](V1VmMemoryDumpVolumeSource.md) |  |  [optional]
**name** | **String** | Volume&#x27;s name. Must be a DNS_LABEL and unique within the vmi. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names | 
**persistentVolumeClaim** | [**V1VmPersistentVolumeClaimVolumeSource**](V1VmPersistentVolumeClaimVolumeSource.md) |  |  [optional]
**secret** | [**V1VmSecretVolumeSource**](V1VmSecretVolumeSource.md) |  |  [optional]
**serviceAccount** | [**V1VmServiceAccountVolumeSource**](V1VmServiceAccountVolumeSource.md) |  |  [optional]
**sysprep** | [**V1VmSysprepSource**](V1VmSysprepSource.md) |  |  [optional]
