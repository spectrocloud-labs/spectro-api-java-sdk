# V1SpectroClusterFilterSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudAccounts** | **List&lt;String&gt;** |  |  [optional]
**clusterName** | [**V1FilterString**](V1FilterString.md) |  |  [optional]
**clusterProfiles** | **List&lt;String&gt;** |  |  [optional]
**clusterState** | [**V1ClusterState**](V1ClusterState.md) |  |  [optional]
**clusterStates** | [**List&lt;V1ClusterState&gt;**](V1ClusterState.md) |  |  [optional]
**cpuUsage** | [**V1FilterIntRange**](V1FilterIntRange.md) |  |  [optional]
**environment** | [**List&lt;V1CloudType&gt;**](V1CloudType.md) | Deprecated. Use environments |  [optional]
**environments** | [**List&lt;V1CloudType&gt;**](V1CloudType.md) |  |  [optional]
**healthState** | [**HealthStateEnum**](#HealthStateEnum) |  |  [optional]
**isDeleted** | **Boolean** |  |  [optional]
**isHostCluster** | **Boolean** |  |  [optional]
**memoryUsage** | [**V1FilterNumberRange**](V1FilterNumberRange.md) |  |  [optional]
**metricPeriod** | **Integer** | Metric period in minutes defines latest metrics by period |  [optional]
**projectUids** | **List&lt;String&gt;** |  |  [optional]
**tags** | [**V1FilterArray**](V1FilterArray.md) |  |  [optional]

<a name="HealthStateEnum"></a>
## Enum: HealthStateEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
HEALTHY | &quot;Healthy&quot;
UNHEALTHY | &quot;UnHealthy&quot;
