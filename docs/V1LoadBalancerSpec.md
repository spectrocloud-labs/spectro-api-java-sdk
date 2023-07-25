# V1LoadBalancerSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**apiServerLBStaticIP** | **String** |  |  [optional]
**ipAllocationMethod** | [**IpAllocationMethodEnum**](#IpAllocationMethodEnum) |  |  [optional]
**privateDNSName** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Load Balancer type |  [optional]

<a name="IpAllocationMethodEnum"></a>
## Enum: IpAllocationMethodEnum
Name | Value
---- | -----
STATIC | &quot;Static&quot;
DYNAMIC | &quot;Dynamic&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INTERNAL | &quot;Internal&quot;
PUBLIC | &quot;Public&quot;
