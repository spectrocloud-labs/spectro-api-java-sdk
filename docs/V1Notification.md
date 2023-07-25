# V1Notification

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**V1NotificationAction**](V1NotificationAction.md) |  |  [optional]
**metadata** | [**V1ObjectMeta**](V1ObjectMeta.md) |  |  [optional]
**relatedObject** | [**V1RelatedObject**](V1RelatedObject.md) |  |  [optional]
**source** | [**V1NotificationSource**](V1NotificationSource.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Describes type of notification. Possible values [NotificationPackUpdate, NotificationPackRegistryUpdate, NotificationNone] |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NOTIFICATIONPACKUPDATE | &quot;NotificationPackUpdate&quot;
NOTIFICATIONPACKREGISTRYUPDATE | &quot;NotificationPackRegistryUpdate&quot;
NOTIFICATIONNONE | &quot;NotificationNone&quot;
