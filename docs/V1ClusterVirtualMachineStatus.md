# V1ClusterVirtualMachineStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**conditions** | [**List&lt;V1VmVirtualMachineCondition&gt;**](V1VmVirtualMachineCondition.md) | Hold the state information of the VirtualMachine and its VirtualMachineInstance |  [optional]
**created** | **Boolean** | Created indicates if the virtual machine is created in the cluster |  [optional]
**memoryDumpRequest** | [**V1VmVirtualMachineMemoryDumpRequest**](V1VmVirtualMachineMemoryDumpRequest.md) |  |  [optional]
**printableStatus** | **String** | PrintableStatus is a human readable, high-level representation of the status of the virtual machine |  [optional]
**ready** | **Boolean** | Ready indicates if the virtual machine is running and ready |  [optional]
**restoreInProgress** | **String** | RestoreInProgress is the name of the VirtualMachineRestore currently executing |  [optional]
**snapshotInProgress** | **String** | SnapshotInProgress is the name of the VirtualMachineSnapshot currently executing |  [optional]
**startFailure** | [**V1VmVirtualMachineStartFailure**](V1VmVirtualMachineStartFailure.md) |  |  [optional]
**stateChangeRequests** | [**List&lt;V1VmVirtualMachineStateChangeRequest&gt;**](V1VmVirtualMachineStateChangeRequest.md) | StateChangeRequests indicates a list of actions that should be taken on a VMI e.g. stop a specific VMI then start a new one. |  [optional]
**volumeRequests** | [**List&lt;V1VmVirtualMachineVolumeRequest&gt;**](V1VmVirtualMachineVolumeRequest.md) | VolumeRequests indicates a list of volumes add or remove from the VMI template and hotplug on an active running VMI. |  [optional]
**volumeSnapshotStatuses** | [**List&lt;V1VmVolumeSnapshotStatus&gt;**](V1VmVolumeSnapshotStatus.md) | VolumeSnapshotStatuses indicates a list of statuses whether snapshotting is supported by each volume. |  [optional]
