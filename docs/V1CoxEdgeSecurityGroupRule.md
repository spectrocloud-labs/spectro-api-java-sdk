# V1CoxEdgeSecurityGroupRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) |  |  [optional]
**description** | **String** |  |  [optional]
**portRange** | **String** |  |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) |  |  [optional]
**source** | **String** |  |  [optional]
**type** | **String** |  |  [optional]

<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
BLOCK | &quot;block&quot;
ALLOW | &quot;allow&quot;

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
TCP | &quot;TCP&quot;
UDP | &quot;UDP&quot;
TCP_UDP | &quot;TCP_UDP&quot;
ESP | &quot;ESP&quot;
AH | &quot;AH&quot;
ICMP | &quot;ICMP&quot;
GRE | &quot;GRE&quot;
