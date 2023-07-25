# V1EdgeHostDeviceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudProperties** | [**V1EdgeHostCloudProperties**](V1EdgeHostCloudProperties.md) |  |  [optional]
**clusterProfileTemplates** | [**List&lt;V1ClusterProfileTemplate&gt;**](V1ClusterProfileTemplate.md) |  |  [optional]
**device** | [**V1DeviceSpec**](V1DeviceSpec.md) |  |  [optional]
**host** | [**V1EdgeHost**](V1EdgeHost.md) |  |  [optional]
**properties** | [**V1EdgeHostProperties**](V1EdgeHostProperties.md) |  |  [optional]
**service** | [**V1ServiceSpec**](V1ServiceSpec.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**version** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
LIBVIRT | &quot;libvirt&quot;
VSPHERE | &quot;vsphere&quot;
EDGE_NATIVE | &quot;edge-native&quot;
