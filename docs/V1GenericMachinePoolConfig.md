# V1GenericMachinePoolConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceType** | **String** |  |  [optional]
**isControlPlane** | **Boolean** | whether this pool is for control plane | 
**labels** | **List&lt;String&gt;** | labels for this pool, example: master/worker, gpu, windows |  [optional]
**name** | **String** |  |  [optional]
**rootDeviceSize** | **Long** | Size of root volume in GB. Default is 30GB |  [optional]
**size** | **Integer** | size of the pool, number of machines |  [optional]
**useControlPlaneAsWorker** | **Boolean** | if IsControlPlane&#x3D;&#x3D;true &amp;&amp; useControlPlaneAsWorker&#x3D;&#x3D;true, then will remove master taint this will not be used for worker pools |  [optional]
