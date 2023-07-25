# V1Subnet

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cidrBlock** | **String** | CidrBlock is the CIDR block to be used when the provider creates a managed Vnet. |  [optional]
**name** | **String** |  |  [optional]
**securityGroupName** | **String** | Network Security Group(NSG) to be attached to subnet. NSG for a control plane subnet, should allow inbound to port 6443, as port 6443 is used by kubeadm to bootstrap the control planes |  [optional]
