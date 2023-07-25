# V1MachineHealthCheckConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**healthCheckMaxUnhealthy** | **String** | HealthCheckMaxUnhealthy is the value above which, if current nodes are unhealthy remediation will not be triggered Can be an absolute int64 number or a percentage string Default value is 100%, i.e by default it is disabled |  [optional]
**networkReadyHealthCheckDuration** | **String** | NetworkReadyHealthCheckDuration is the timeout to check for the network availability. If the network is not available in the given available time, beyond the timeout check a node will be killed and a new node will be created. Default time is 10m |  [optional]
**nodeReadyHealthCheckDuration** | **String** | NodeReadyHealthCheckDuration is the timeout to check for the node ready state. If the node is not ready within the time out set, the node will be deleted and a new node will be launched. Default time is 10m |  [optional]
