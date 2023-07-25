# V1NotificationEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**component** | **String** | Describes component of notification event |  [optional]
**digest** | **String** | Describes notification event digest |  [optional]
**message** | **String** | Describes a information for the notification event |  [optional]
**meta** | **Map&lt;String, String&gt;** | Describes a event messages with meta digest as the key |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Describes notification event type |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NOTIFICATIONPACKSYNC | &quot;NotificationPackSync&quot;
NOTIFICATIONCLUSTERPROFILESYNC | &quot;NotificationClusterProfileSync&quot;
