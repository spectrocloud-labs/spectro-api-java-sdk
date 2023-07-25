# V1OsPatchConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onDemandPatchAfter** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**patchOnBoot** | **Boolean** | PatchOnBoot indicates need to do patch when node first boot up, only once |  [optional]
**rebootIfRequired** | **Boolean** | Reboot once the OS patch is applied |  [optional]
**schedule** | **String** | The schedule at which security patches will be applied to OS. Schedule should be in Cron format, see https://en.wikipedia.org/wiki/Cron for more help. |  [optional]
