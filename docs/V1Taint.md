# V1Taint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**effect** | [**EffectEnum**](#EffectEnum) |  |  [optional]
**key** | **String** | The taint key to be applied to a node |  [optional]
**timeAdded** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**value** | **String** | The taint value corresponding to the taint key. |  [optional]

<a name="EffectEnum"></a>
## Enum: EffectEnum
Name | Value
---- | -----
NOSCHEDULE | &quot;NoSchedule&quot;
PREFERNOSCHEDULE | &quot;PreferNoSchedule&quot;
NOEXECUTE | &quot;NoExecute&quot;
