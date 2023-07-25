# V1LibvirtMachinePoolCloudConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceType** | [**V1LibvirtInstanceType**](V1LibvirtInstanceType.md) |  | 
**nonRootDisksInGB** | [**List&lt;V1LibvirtDiskSpec&gt;**](V1LibvirtDiskSpec.md) | NonRootDisksInGB is the list of additional disks, if required, in GB |  [optional]
**placements** | [**List&lt;V1LibvirtPlacementEntity&gt;**](V1LibvirtPlacementEntity.md) | Placements configuration Placements If defined, will replace default values defined in VsphereClusterConfig Array means one MachinePool can span across multiple vsphere compute cluster | 
**rootDiskInGB** | **Integer** | RootDiskInGB is the size of a vm&#x27;s root disk, in GiB | 
