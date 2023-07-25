# V1EdgeHostDeviceStatus

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**health** | [**V1EdgeHostHealth**](V1EdgeHostHealth.md) |  |  [optional]
**inUseClusters** | [**List&lt;V1ObjectEntity&gt;**](V1ObjectEntity.md) |  |  [optional]
**packs** | [**List&lt;V1ClusterPackStatus&gt;**](V1ClusterPackStatus.md) |  |  [optional]
**profileStatus** | [**V1ProfileStatus**](V1ProfileStatus.md) |  |  [optional]
**serviceAuthToken** | **String** |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
READY | &quot;ready&quot;
UNPAIRED | &quot;unpaired&quot;
IN_USE | &quot;in-use&quot;
