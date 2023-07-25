# V1MgmtBackupSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupUid** | **String** |  |  [optional]
**mode** | **String** |  |  [optional]
**modeUid** | **String** |  |  [optional]
**proxy** | **String** | proxy information if applicable |  [optional]
**scheduleTime** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) |  |  [optional]

<a name="ScheduleTypeEnum"></a>
## Enum: ScheduleTypeEnum
Name | Value
---- | -----
ONDEMAND | &quot;OnDemand&quot;
AUTOMATED | &quot;Automated&quot;
