# V1NotificationAction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ack** | **Boolean** | Describes the acknowledgement status for the notification |  [optional]
**actionMessage** | **String** | Describes information related to notification action |  [optional]
**actionType** | [**ActionTypeEnum**](#ActionTypeEnum) | Describes action type for the notification. Possible Values [NotifyActionPacksUpdate, NotifyActionClusterProfileUpdate, NotifyActionPackRegistryUpdate, NotifyActionClusterUpdate, NotifyActionNone] |  [optional]
**events** | [**Map&lt;String, Map&lt;String, String&gt;&gt;**](Map.md) | Describes the events happened for the notifications |  [optional]
**isDone** | **Boolean** | Describes the \&quot;Done\&quot; status for the notification |  [optional]
**isInfo** | **Boolean** | Describes the notification as a information |  [optional]
**link** | **String** |  |  [optional]

<a name="ActionTypeEnum"></a>
## Enum: ActionTypeEnum
Name | Value
---- | -----
NOTIFYACTIONPACKSUPDATE | &quot;NotifyActionPacksUpdate&quot;
NOTIFYACTIONCLUSTERPROFILEUPDATE | &quot;NotifyActionClusterProfileUpdate&quot;
NOTIFYACTIONPACKREGISTRYUPDATE | &quot;NotifyActionPackRegistryUpdate&quot;
NOTIFYACTIONCLUSTERUPDATE | &quot;NotifyActionClusterUpdate&quot;
NOTIFYACTIONNONE | &quot;NotifyActionNone&quot;
