# V1EdgeNativeControlPlaneEndPoint

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ddnsSearchDomain** | **String** | DDNSSearchDomain is the search domain used for resolving IP addresses when the EndpointType is DDNS. This search domain is appended to the generated Hostname to obtain the complete DNS name for the endpoint. If Host is already a DDNS FQDN, DDNSSearchDomain is not required |  [optional]
**host** | **String** | Host is FQDN(DDNS) or IP |  [optional]
**type** | **String** | Type indicates DDNS or VIP |  [optional]
