# V1ClusterGroupSummarySpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpu** | [**V1ClusterGroupResource**](V1ClusterGroupResource.md) |  |  [optional]
**endpointType** | [**EndpointTypeEnum**](#EndpointTypeEnum) |  |  [optional]
**hostClusters** | [**List&lt;V1ObjectResReference&gt;**](V1ObjectResReference.md) |  |  [optional]
**hostClustersCount** | **Integer** |  |  [optional]
**memory** | [**V1ClusterGroupResource**](V1ClusterGroupResource.md) |  |  [optional]
**nestedClusters** | [**List&lt;V1ObjectResReference&gt;**](V1ObjectResReference.md) | Deprecated. Use virtualClustersCount |  [optional]
**nestedClustersCount** | **Integer** | Deprecated. Use field &#x27;virtualClustersCount&#x27; |  [optional]
**scope** | **String** |  |  [optional]
**virtualClustersCount** | **Integer** |  |  [optional]

<a name="EndpointTypeEnum"></a>
## Enum: EndpointTypeEnum
Name | Value
---- | -----
INGRESS | &quot;Ingress&quot;
LOADBALANCER | &quot;LoadBalancer&quot;
