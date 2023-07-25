# V1SpectroClusterSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudConfigRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**cloudType** | [**V1CloudType**](V1CloudType.md) |  |  [optional]
**clusterConfig** | [**V1ClusterConfig**](V1ClusterConfig.md) |  |  [optional]
**clusterProfileTemplates** | [**List&lt;V1ClusterProfileTemplate&gt;**](V1ClusterProfileTemplate.md) | When a cluster created from a clusterprofile at t1, ClusterProfileTemplate is a copy of the draft version or latest published version of the clusterprofileSpec.clusterprofileTemplate then clusterprofile may evolve to v2 at t2, but before user decide to upgrade the cluster, it will stay as it is when user decide to upgrade, clusterProfileTemplate will be updated from the clusterprofile pointed by ClusterProfileRef |  [optional]
**clusterType** | [**ClusterTypeEnum**](#ClusterTypeEnum) |  |  [optional]

<a name="ClusterTypeEnum"></a>
## Enum: ClusterTypeEnum
Name | Value
---- | -----
PUREMANAGE | &quot;PureManage&quot;
ALLOYMONITOR | &quot;AlloyMonitor&quot;
ALLOYASSIST | &quot;AlloyAssist&quot;
ALLOYEXTEND | &quot;AlloyExtend&quot;
