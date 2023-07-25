# V1ClusterGroupClustersConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpointType** | [**EndpointTypeEnum**](#EndpointTypeEnum) | Host cluster endpoint type |  [optional]
**hostClustersConfig** | [**List&lt;V1ClusterGroupHostClusterConfig&gt;**](V1ClusterGroupHostClusterConfig.md) |  |  [optional]
**limitConfig** | [**V1ClusterGroupLimitConfig**](V1ClusterGroupLimitConfig.md) |  |  [optional]
**values** | **String** |  |  [optional]

<a name="EndpointTypeEnum"></a>
## Enum: EndpointTypeEnum
Name | Value
---- | -----
INGRESS | &quot;Ingress&quot;
LOADBALANCER | &quot;LoadBalancer&quot;
