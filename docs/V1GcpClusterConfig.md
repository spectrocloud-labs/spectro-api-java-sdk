# V1GcpClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**managedClusterConfig** | [**V1GcpManagedClusterConfig**](V1GcpManagedClusterConfig.md) |  |  [optional]
**network** | **String** | NetworkName if empty would create VPC Network in auto mode. If provided, custom VPC network will be used |  [optional]
**project** | **String** | Name of the project in which cluster is to be deployed | 
**region** | **String** | GCP region for the cluster | 
