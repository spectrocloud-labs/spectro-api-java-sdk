# V1CloudMachineStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health** | [**V1MachineHealth**](V1MachineHealth.md) |  |  [optional]
**instanceState** | [**InstanceStateEnum**](#InstanceStateEnum) |  |  [optional]

<a name="InstanceStateEnum"></a>
## Enum: InstanceStateEnum
Name | Value
---- | -----
PENDING | &quot;Pending&quot;
PROVISIONING | &quot;Provisioning&quot;
PROVISIONED | &quot;Provisioned&quot;
RUNNING | &quot;Running&quot;
DELETING | &quot;Deleting&quot;
DELETED | &quot;Deleted&quot;
FAILED | &quot;Failed&quot;
UNKNOWN | &quot;Unknown&quot;
