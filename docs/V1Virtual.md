# V1Virtual

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**appDeployments** | [**List&lt;V1ObjectResReference&gt;**](V1ObjectResReference.md) | list of apps deployed on the virtual cluster |  [optional]
**clusterGroup** | [**V1ObjectResReference**](V1ObjectResReference.md) |  |  [optional]
**hostCluster** | [**V1ObjectResReference**](V1ObjectResReference.md) |  |  [optional]
**lifecycleStatus** | [**V1LifecycleStatus**](V1LifecycleStatus.md) |  |  [optional]
**nestedClusters** | [**List&lt;V1ObjectResReference&gt;**](V1ObjectResReference.md) | Deprecated. Use field &#x27;virtualClusters&#x27; |  [optional]
**state** | **String** | cluster virtual host status |  [optional]
**virtualClusters** | [**List&lt;V1ObjectResReference&gt;**](V1ObjectResReference.md) | list of virtual clusters deployed on the cluster |  [optional]
