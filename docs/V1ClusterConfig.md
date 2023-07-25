# V1ClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterRbac** | [**List&lt;V1ResourceReference&gt;**](V1ResourceReference.md) | Deprecated. Use clusterResources |  [optional]
**clusterResources** | [**V1ClusterResources**](V1ClusterResources.md) |  |  [optional]
**controlPlaneHealthCheckTimeout** | **String** | ControlPlaneHealthCheckTimeout is the timeout to check for ready state of the control plane nodes. If the node is not ready within the time out set, the node will be deleted and a new node will be launched. |  [optional]
**fips** | [**V1FipsConfig**](V1FipsConfig.md) |  |  [optional]
**hostClusterConfig** | [**V1HostClusterConfig**](V1HostClusterConfig.md) |  |  [optional]
**lifecycleConfig** | [**V1LifecycleConfig**](V1LifecycleConfig.md) |  |  [optional]
**machineHealthConfig** | [**V1MachineHealthCheckConfig**](V1MachineHealthCheckConfig.md) |  |  [optional]
**machineManagementConfig** | [**V1MachineManagementConfig**](V1MachineManagementConfig.md) |  |  [optional]
**updateWorkerPoolsInParallel** | **Boolean** | UpdateWorkerPoolsInParallel is used to decide if the update of workerpools happen in parallel. When this flag is false, the workerpools are updated sequentially. |  [optional]
