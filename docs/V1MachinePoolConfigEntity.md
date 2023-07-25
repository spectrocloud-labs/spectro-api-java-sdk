# V1MachinePoolConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalLabels** | **Map&lt;String, String&gt;** | Additional labels to be part of the machine pool |  [optional]
**additionalTags** | **Map&lt;String, String&gt;** | AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole |  [optional]
**isControlPlane** | **Boolean** | Whether this pool is for control plane |  [optional]
**labels** | **List&lt;String&gt;** | Labels for this machine pool, example: master/worker, gpu, windows | 
**maxSize** | **Integer** | Max size of the pool, for scaling |  [optional]
**minSize** | **Integer** | Min size of the pool, for scaling |  [optional]
**name** | **String** |  | 
**size** | **Integer** | Size of the pool, number of nodes/machines | 
**taints** | [**List&lt;V1Taint&gt;**](V1Taint.md) | Master or worker taints |  [optional]
**updateStrategy** | [**V1UpdateStrategy**](V1UpdateStrategy.md) |  |  [optional]
**useControlPlaneAsWorker** | **Boolean** | If IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools |  [optional]
