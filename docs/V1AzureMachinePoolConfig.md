# V1AzureMachinePoolConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalLabels** | **Map&lt;String, String&gt;** | additionalLabels |  [optional]
**additionalTags** | **Map&lt;String, String&gt;** | AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole |  [optional]
**azs** | **List&lt;String&gt;** |  |  [optional]
**infraProfileRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**infraProfileTemplate** | [**V1ClusterProfileTemplate**](V1ClusterProfileTemplate.md) |  |  [optional]
**instanceConfig** | [**V1InstanceConfig**](V1InstanceConfig.md) |  |  [optional]
**instanceType** | **String** | Instance type stands for VMSize in Azure |  [optional]
**isControlPlane** | **Boolean** | whether this pool is for control plane | 
**isSystemNodePool** | **Boolean** | whether this pool is for system node Pool |  [optional]
**labels** | **List&lt;String&gt;** | labels for this pool, example: master/worker, gpu, windows |  [optional]
**maxSize** | **Integer** | max size of the pool, for scaling |  [optional]
**minSize** | **Integer** | min size of the pool, for scaling |  [optional]
**name** | **String** |  |  [optional]
**osDisk** | [**V1AzureOSDisk**](V1AzureOSDisk.md) |  |  [optional]
**osType** | [**V1OsType**](V1OsType.md) |  |  [optional]
**size** | **Integer** | size of the pool, number of machines |  [optional]
**spotVMOptions** | [**V1SpotVMOptions**](V1SpotVMOptions.md) |  |  [optional]
**taints** | [**List&lt;V1Taint&gt;**](V1Taint.md) | master or worker taints |  [optional]
**updateStrategy** | [**V1UpdateStrategy**](V1UpdateStrategy.md) |  |  [optional]
**useControlPlaneAsWorker** | **Boolean** | if IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools |  [optional]
