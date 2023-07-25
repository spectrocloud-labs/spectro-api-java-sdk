# V1ControlPlaneEndPoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ddnsSearchDomain** | **String** | DDNSSearchDomain is the search domain used for resolving IP addresses when the EndpointType is DDNS. This search domain is appended to the generated Hostname to obtain the complete DNS name for the endpoint. If Host is already a DDNS FQDN, DDNSSearchDomain is not required |  [optional]
**host** | **String** | IP or FQDN(External/DDNS) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | VIP or External |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
VIP | &quot;VIP&quot;
EXTERNAL | &quot;External&quot;
DDNS | &quot;DDNS&quot;
