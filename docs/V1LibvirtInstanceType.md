# V1LibvirtInstanceType

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpuPassthroughSpec** | [**V1CPUPassthroughSpec**](V1CPUPassthroughSpec.md) |  |  [optional]
**cpuset** | **String** | CPUSet defines cpuset for an instance which allows allocation specific set of cpus E.g  cpuset&#x3D;\&quot;1-4,^3,6\&quot; See https://libvirt.org/formatdomain.html#cpu-allocation |  [optional]
**gpuConfig** | [**V1GPUConfig**](V1GPUConfig.md) |  |  [optional]
**memoryInMB** | **Integer** | MemoryinMB is the memory in megabytes | 
**numCPUs** | **Integer** | NumCPUs is the number of CPUs | 
