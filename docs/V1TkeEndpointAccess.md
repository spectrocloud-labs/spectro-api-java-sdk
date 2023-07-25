# V1TkeEndpointAccess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isExtranet** | **Boolean** | IsExtranet Whether it is external network access (TRUE external network access FALSE internal network access, default value: FALSE) |  [optional]
**_private** | **Boolean** | Private points VPC-internal control plane access to the private endpoint |  [optional]
**privateCIDR** | **String** | Deprecated. PrivateCIDRs specifies which blocks can access the public endpoint |  [optional]
**_public** | **Boolean** | Public controls whether control plane endpoints are publicly accessible |  [optional]
**publicCIDRs** | **List&lt;String&gt;** | Deprecated. PublicCIDRs specifies which blocks can access the public endpoint |  [optional]
**securityGroup** | **String** | Tencent security group |  [optional]
**subnetId** | **String** | Tencent Subnet |  [optional]
