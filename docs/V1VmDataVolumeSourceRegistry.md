# V1VmDataVolumeSourceRegistry

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certConfigMap** | **String** | CertConfigMap provides a reference to the Registry certs |  [optional]
**imageStream** | **String** | ImageStream is the name of image stream for import |  [optional]
**pullMethod** | **String** | PullMethod can be either \&quot;pod\&quot; (default import), or \&quot;node\&quot; (node docker cache based import) |  [optional]
**secretRef** | **String** | SecretRef provides the secret reference needed to access the Registry source |  [optional]
**url** | **String** | URL is the url of the registry source (starting with the scheme: docker, oci-archive) |  [optional]
