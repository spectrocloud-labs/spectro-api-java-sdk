# V1EdgeNativeMachinePoolConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalLabels** | **Map&lt;String, String&gt;** | AdditionalLabels |  [optional]
**additionalTags** | **Map&lt;String, String&gt;** | AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole |  [optional]
**hosts** | [**List&lt;V1EdgeNativeHost&gt;**](V1EdgeNativeHost.md) |  | 
**infraProfileRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**infraProfileTemplate** | [**V1ClusterProfileTemplate**](V1ClusterProfileTemplate.md) |  |  [optional]
**isControlPlane** | **Boolean** | whether this pool is for control plane |  [optional]
**labels** | **List&lt;String&gt;** | labels for this pool, example: master/worker, gpu, windows |  [optional]
**maxSize** | **Integer** | max size of the pool, for scaling |  [optional]
**minSize** | **Integer** | min size of the pool, for scaling |  [optional]
**name** | **String** |  |  [optional]
**osType** | **String** | the os type for the pool, must be supported by the provider |  [optional]
**size** | **Integer** | size of the pool, number of machines |  [optional]
**taints** | [**List&lt;V1Taint&gt;**](V1Taint.md) | master or worker taints |  [optional]
**updateStrategy** | [**V1UpdateStrategy**](V1UpdateStrategy.md) |  |  [optional]
**useControlPlaneAsWorker** | **Boolean** | if IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools |  [optional]
