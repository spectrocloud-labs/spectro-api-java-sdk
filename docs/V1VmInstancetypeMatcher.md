# V1VmInstancetypeMatcher

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inferFromVolume** | **String** | InferFromVolume lists the name of a volume that should be used to infer or discover the instancetype to be used through known annotations on the underlying resource. Once applied to the InstancetypeMatcher this field is removed. |  [optional]
**kind** | **String** | Kind specifies which instancetype resource is referenced. Allowed values are: \&quot;VirtualMachineInstancetype\&quot; and \&quot;VirtualMachineClusterInstancetype\&quot;. If not specified, \&quot;VirtualMachineClusterInstancetype\&quot; is used by default. |  [optional]
**name** | **String** | Name is the name of the VirtualMachineInstancetype or VirtualMachineClusterInstancetype |  [optional]
**revisionName** | **String** | RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachineInstancetype or VirtualMachineClusterInstancetype to be used. This is initially captured the first time the instancetype is applied to the VirtualMachineInstance. |  [optional]
