# V1AwsMachinePoolCloudConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azs** | **List&lt;String&gt;** |  |  [optional]
**capacityType** | [**CapacityTypeEnum**](#CapacityTypeEnum) | EC2 instance capacity type |  [optional]
**instanceType** | **String** | instance type | 
**rootDeviceSize** | **Long** | rootDeviceSize in GBs |  [optional]
**spotMarketOptions** | [**V1SpotMarketOptions**](V1SpotMarketOptions.md) |  |  [optional]
**subnets** | [**List&lt;V1AwsSubnetEntity&gt;**](V1AwsSubnetEntity.md) |  |  [optional]

<a name="CapacityTypeEnum"></a>
## Enum: CapacityTypeEnum
Name | Value
---- | -----
ON_DEMAND | &quot;on-demand&quot;
SPOT | &quot;spot&quot;
