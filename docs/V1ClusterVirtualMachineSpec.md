# V1ClusterVirtualMachineSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataVolumeTemplates** | [**List&lt;V1VmDataVolumeTemplateSpec&gt;**](V1VmDataVolumeTemplateSpec.md) | dataVolumeTemplates is a list of dataVolumes that the VirtualMachineInstance template can reference. DataVolumes in this list are dynamically created for the VirtualMachine and are tied to the VirtualMachine&#x27;s life-cycle. |  [optional]
**instancetype** | [**V1VmInstancetypeMatcher**](V1VmInstancetypeMatcher.md) |  |  [optional]
**preference** | [**V1VmPreferenceMatcher**](V1VmPreferenceMatcher.md) |  |  [optional]
**runStrategy** | **String** | Running state indicates the requested running state of the VirtualMachineInstance mutually exclusive with Running |  [optional]
**running** | **Boolean** | Running controls whether the associatied VirtualMachineInstance is created or not Mutually exclusive with RunStrategy |  [optional]
**template** | [**V1VmVirtualMachineInstanceTemplateSpec**](V1VmVirtualMachineInstanceTemplateSpec.md) |  | 
