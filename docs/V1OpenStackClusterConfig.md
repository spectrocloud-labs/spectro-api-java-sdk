# V1OpenStackClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bastionDisabled** | **Boolean** | Create bastion node option we have earlier supported creation of bastion by default |  [optional]
**dnsNameservers** | **List&lt;String&gt;** | DNSNameservers is the list of nameservers for OpenStack Subnet being created. Set this value when you need create a new network/subnet while the access through DNS is required. |  [optional]
**domain** | [**V1OpenStackResource**](V1OpenStackResource.md) |  |  [optional]
**network** | [**V1OpenStackResource**](V1OpenStackResource.md) |  |  [optional]
**nodeCidr** | **String** | For dynamic provision NodeCIDR is the OpenStack Subnet to be created. Cluster actuator will create a network, a subnet with NodeCIDR, and a router connected to this subnet. If you leave this empty, no network will be created. |  [optional]
**project** | [**V1OpenStackResource**](V1OpenStackResource.md) |  |  [optional]
**region** | **String** |  |  [optional]
**sshKeyName** | **String** |  |  [optional]
**subnet** | [**V1OpenStackResource**](V1OpenStackResource.md) |  |  [optional]
