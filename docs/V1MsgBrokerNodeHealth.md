# V1MsgBrokerNodeHealth

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allyPublishersByTenant** | [**Map&lt;String, V1MsgBrokerConnectionList&gt;**](V1MsgBrokerConnectionList.md) |  |  [optional]
**duplicateSubscribersCount** | **Map&lt;String, Integer&gt;** |  |  [optional]
**hubbleSubscribersByService** | [**Map&lt;String, V1MsgBrokerConnectionList&gt;**](V1MsgBrokerConnectionList.md) |  |  [optional]
**hubbleSubscribersByTenant** | [**Map&lt;String, V1MsgBrokerConnectionList&gt;**](V1MsgBrokerConnectionList.md) |  |  [optional]
**hubbleSubscribersByType** | [**Map&lt;String, V1MsgBrokerConnectionList&gt;**](V1MsgBrokerConnectionList.md) |  |  [optional]
**nodeId** | **String** |  |  [optional]
**subscriberWithAbnormalRTT** | [**V1MsgBrokerConnectionList**](V1MsgBrokerConnectionList.md) |  |  [optional]
**subscribersWithAbnormalSubscriptions** | [**V1MsgBrokerConnectionList**](V1MsgBrokerConnectionList.md) |  |  [optional]
**uniqueSubscribers** | **Integer** |  |  [optional]
**unrecognizedClients** | [**V1MsgBrokerConnectionList**](V1MsgBrokerConnectionList.md) |  |  [optional]
