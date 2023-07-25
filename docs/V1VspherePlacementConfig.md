# V1VspherePlacementConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster** | **String** | Cluster is the computecluster in vsphere |  [optional]
**datacenter** | **String** | Datacenter is the name or inventory path of the datacenter where this machine&#x27;s VM is created/located. |  [optional]
**datastore** | **String** | Datastore is the datastore in which VMs are created/located. |  [optional]
**folder** | **String** | Folder is the folder in which VMs are created/located. |  [optional]
**imageTemplateFolder** | **String** | ImageTemplateFolder is the folder in which VMs templates are created/located. if empty will use default value spectro-templates |  [optional]
**network** | [**V1VsphereNetworkConfig**](V1VsphereNetworkConfig.md) |  |  [optional]
**resourcePool** | **String** | ResourcePool is the resource pool within the above computecluster Cluster |  [optional]
**storagePolicyName** | **String** | StoragePolicyName of the storage policy to use with this Virtual Machine |  [optional]
**uid** | **String** | UID for this placement |  [optional]
