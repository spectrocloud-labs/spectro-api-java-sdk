# V1VmDomainSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chassis** | [**V1VmChassis**](V1VmChassis.md) |  |  [optional]
**clock** | [**V1VmClock**](V1VmClock.md) |  |  [optional]
**cpu** | [**V1VmCpu**](V1VmCpu.md) |  |  [optional]
**devices** | [**V1VmDevices**](V1VmDevices.md) |  | 
**features** | [**V1VmFeatures**](V1VmFeatures.md) |  |  [optional]
**firmware** | [**V1VmFirmware**](V1VmFirmware.md) |  |  [optional]
**ioThreadsPolicy** | **String** | Controls whether or not disks will share IOThreads. Omitting IOThreadsPolicy disables use of IOThreads. One of: shared, auto |  [optional]
**launchSecurity** | [**V1VmLaunchSecurity**](V1VmLaunchSecurity.md) |  |  [optional]
**machine** | [**V1VmMachine**](V1VmMachine.md) |  |  [optional]
**memory** | [**V1VmMemory**](V1VmMemory.md) |  |  [optional]
**resources** | [**V1VmResourceRequirements**](V1VmResourceRequirements.md) |  |  [optional]
