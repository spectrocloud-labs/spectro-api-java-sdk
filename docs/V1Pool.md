# V1Pool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **String** | End is the last IP address that can be rendered. It is used as a validation that the rendered IP is in bound. |  [optional]
**gateway** | **String** | Gateway is the gateway ip address |  [optional]
**nameserver** | [**V1Nameserver**](V1Nameserver.md) |  |  [optional]
**prefix** | **Integer** | Prefix is the mask of the network as integer (max 128) |  [optional]
**start** | **String** | Start is the first ip address that can be rendered |  [optional]
**subnet** | **String** | Subnet is used to validate that the rendered IP is in bounds. eg: 192.168.0.0/24 If Start value is not given, start value is derived from the subnet ip incremented by 1 (start value is &#x60;192.168.0.1&#x60; for subnet &#x60;192.168.0.0/24&#x60;) |  [optional]
