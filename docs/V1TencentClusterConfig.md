# V1TencentClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**endpointAccess** | [**V1TkeEndpointAccess**](V1TkeEndpointAccess.md) |  |  [optional]
**region** | **String** |  | 
**sshKeyIDs** | **List&lt;String&gt;** |  |  [optional]
**vpcID** | **String** | VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created |  [optional]
