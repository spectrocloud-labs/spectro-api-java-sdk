# V1EksMachineCloudConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**awsLaunchTemplate** | [**V1AwsLaunchTemplate**](V1AwsLaunchTemplate.md) |  |  [optional]
**azs** | **List&lt;String&gt;** |  |  [optional]
**capacityType** | [**CapacityTypeEnum**](#CapacityTypeEnum) | EC2 instance capacity type |  [optional]
**enableAwsLaunchTemplate** | **Boolean** | flag to know if aws launch template is enabled |  [optional]
**instanceType** | **String** | instance type |  [optional]
**rootDeviceSize** | **Long** | rootDeviceSize in GBs |  [optional]
**spotMarketOptions** | [**V1SpotMarketOptions**](V1SpotMarketOptions.md) |  |  [optional]
**subnets** | [**List&lt;V1EksSubnetEntity&gt;**](V1EksSubnetEntity.md) |  |  [optional]

<a name="CapacityTypeEnum"></a>
## Enum: CapacityTypeEnum
Name | Value
---- | -----
ON_DEMAND | &quot;on-demand&quot;
SPOT | &quot;spot&quot;
