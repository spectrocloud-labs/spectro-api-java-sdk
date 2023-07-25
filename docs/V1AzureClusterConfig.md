# V1AzureClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aadProfile** | [**V1AADProfile**](V1AADProfile.md) |  |  [optional]
**apiServerAccessProfile** | [**V1APIServerAccessProfile**](V1APIServerAccessProfile.md) |  |  [optional]
**containerName** | **String** |  |  [optional]
**controlPlaneSubnet** | [**V1Subnet**](V1Subnet.md) |  |  [optional]
**enablePrivateCluster** | **Boolean** | Deprecated. use apiServerAccessProfile.enablePrivateCluster |  [optional]
**infraLBConfig** | [**V1InfraLBConfig**](V1InfraLBConfig.md) |  |  [optional]
**location** | **String** | Location is the Azure datacenter location | 
**resourceGroup** | **String** |  |  [optional]
**sshKey** | **String** |  | 
**storageAccountName** | **String** |  |  [optional]
**subscriptionId** | **String** | Subscription ID is unique identifier for the subscription used to access Azure services | 
**vnetCidrBlock** | **String** |  |  [optional]
**vnetName** | **String** | VNETName is the virtual network in which the cluster is to be provisioned. |  [optional]
**vnetResourceGroup** | **String** |  |  [optional]
**workerSubnet** | [**V1Subnet**](V1Subnet.md) |  |  [optional]
