# V1TencentMachinePoolConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalLabels** | **Map&lt;String, String&gt;** | AdditionalLabels |  [optional]
**additionalTags** | **Map&lt;String, String&gt;** | AdditionalTags is an optional set of tags to add to resources managed by the provider, in addition to the ones added by default. For eg., tags for EKS nodeGroup or EKS NodegroupIAMRole |  [optional]
**azs** | **List&lt;String&gt;** | AZs is only used for dynamic placement |  [optional]
**infraProfileRef** | [**V1ObjectReference**](V1ObjectReference.md) |  |  [optional]
**infraProfileTemplate** | [**V1ClusterProfileTemplate**](V1ClusterProfileTemplate.md) |  |  [optional]
**instanceConfig** | [**V1InstanceConfig**](V1InstanceConfig.md) |  |  [optional]
**instanceType** | **String** | instance type |  [optional]
**isControlPlane** | **Boolean** | whether this pool is for control plane |  [optional]
**labels** | **List&lt;String&gt;** | labels for this pool, example: master/worker, gpu, windows |  [optional]
**maxSize** | **Integer** | max size of the pool, for scaling |  [optional]
**minSize** | **Integer** | min size of the pool, for scaling |  [optional]
**name** | **String** |  |  [optional]
**rootDeviceSize** | **Long** | rootDeviceSize in GBs |  [optional]
**size** | **Integer** | size of the pool, number of machines |  [optional]
**subnetIds** | **Map&lt;String, String&gt;** | AZ to subnet mapping filled by ally from hubble SubnetIDs [\&quot;ap-guangzhou-6\&quot;] &#x3D; \&quot;subnet-079b6061\&quot; This field is optional If we don&#x27;t provide a subnetId then by default the first subnet from the AZ will be picked up for deployment |  [optional]
**taints** | [**List&lt;V1Taint&gt;**](V1Taint.md) | master or worker taints |  [optional]
**updateStrategy** | [**V1UpdateStrategy**](V1UpdateStrategy.md) |  |  [optional]
**useControlPlaneAsWorker** | **Boolean** | if IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools |  [optional]
