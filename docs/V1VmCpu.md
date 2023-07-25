# V1VmCpu

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cores** | **Long** | Cores specifies the number of cores inside the vmi. Must be a value greater or equal 1. |  [optional]
**dedicatedCpuPlacement** | **Boolean** | DedicatedCPUPlacement requests the scheduler to place the VirtualMachineInstance on a node with enough dedicated pCPUs and pin the vCPUs to it. |  [optional]
**features** | [**List&lt;V1VmCpuFeature&gt;**](V1VmCpuFeature.md) | Features specifies the CPU features list inside the VMI. |  [optional]
**isolateEmulatorThread** | **Boolean** | IsolateEmulatorThread requests one more dedicated pCPU to be allocated for the VMI to place the emulator thread on it. |  [optional]
**model** | **String** | Model specifies the CPU model inside the VMI. List of available models https://github.com/libvirt/libvirt/tree/master/src/cpu_map. It is possible to specify special cases like \&quot;host-passthrough\&quot; to get the same CPU as the node and \&quot;host-model\&quot; to get CPU closest to the node one. Defaults to host-model. |  [optional]
**numa** | [**V1VmNUMA**](V1VmNUMA.md) |  |  [optional]
**realtime** | [**V1VmRealtime**](V1VmRealtime.md) |  |  [optional]
**sockets** | **Long** | Sockets specifies the number of sockets inside the vmi. Must be a value greater or equal 1. |  [optional]
**threads** | **Long** | Threads specifies the number of threads inside the vmi. Must be a value greater or equal 1. |  [optional]
