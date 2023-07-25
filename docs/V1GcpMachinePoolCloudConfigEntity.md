# V1GcpMachinePoolCloudConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**azs** | **List&lt;String&gt;** |  |  [optional]
**instanceType** | **String** |  | 
**rootDeviceSize** | **Long** | Size of root volume in GB. Default is 30GB |  [optional]
**subnet** | **String** | Subnet specifies the subnetwork to use for given instance. If not specified, the first subnet from the cluster region and network is used |  [optional]
**subnets** | [**List&lt;V1GcpSubnetEntity&gt;**](V1GcpSubnetEntity.md) |  |  [optional]
