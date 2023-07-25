# V1AuditSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionMsg** | **String** | Audit action message |  [optional]
**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) |  |  [optional]
**actor** | [**V1AuditActor**](V1AuditActor.md) |  |  [optional]
**contentMsg** | **String** | Audit content message |  [optional]
**resource** | [**V1AuditResourceReference**](V1AuditResourceReference.md) |  |  [optional]
**userMsg** | **String** | Audit user message |  [optional]

<a name="ActionTypeEnum"></a>
## Enum: ActionTypeEnum
Name | Value
---- | -----
CREATE | &quot;create&quot;
UPDATE | &quot;update&quot;
DELETE | &quot;delete&quot;
PUBLISH | &quot;publish&quot;
DEPLOY | &quot;deploy&quot;
