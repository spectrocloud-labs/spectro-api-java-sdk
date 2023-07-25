# V1VmPreferenceMatcher

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inferFromVolume** | **String** | InferFromVolume lists the name of a volume that should be used to infer or discover the preference to be used through known annotations on the underlying resource. Once applied to the PreferenceMatcher this field is removed. |  [optional]
**kind** | **String** | Kind specifies which preference resource is referenced. Allowed values are: \&quot;VirtualMachinePreference\&quot; and \&quot;VirtualMachineClusterPreference\&quot;. If not specified, \&quot;VirtualMachineClusterPreference\&quot; is used by default. |  [optional]
**name** | **String** | Name is the name of the VirtualMachinePreference or VirtualMachineClusterPreference |  [optional]
**revisionName** | **String** | RevisionName specifies a ControllerRevision containing a specific copy of the VirtualMachinePreference or VirtualMachineClusterPreference to be used. This is initially captured the first time the instancetype is applied to the VirtualMachineInstance. |  [optional]
