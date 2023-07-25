# V1LibvirtPlacementConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataStoragePool** | **String** | DataStoragePool is the storage pool from which additional disks are assigned |  [optional]
**gpuDevices** | [**List&lt;V1GPUDeviceSpec&gt;**](V1GPUDeviceSpec.md) | GPU Devices is the list of LibvirtHost GPU devices, to be used for this placement |  [optional]
**hostAddress** | **String** | HostAddress is a FQDN or IP address of the LibvirtHost | 
**hostIdentity** | [**V1LibvirtHostIdentity**](V1LibvirtHostIdentity.md) |  |  [optional]
**hostUid** | **String** | HostUid is the ID of the LibvirtHost | 
**networks** | [**List&lt;V1LibvirtNetworkSpec&gt;**](V1LibvirtNetworkSpec.md) | Networks defines the network specifications of the vms in the machine pool | 
**sourceStoragePool** | **String** | SourceStoragePool is the storage pool for the vm image | 
**targetStoragePool** | **String** | TargetStoragePool is the optional storage pool from which additional disks are assigned. If not specified, the sourceStoragePool is also used as the targetStoragePool |  [optional]
