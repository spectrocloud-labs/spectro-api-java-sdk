# V1VmPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | If specified, this must be an IANA_SVC_NAME and unique within the pod. Each named port in a pod must have a unique name. Name for the port that can be referred to by services. |  [optional]
**port** | **Integer** | Number of port to expose for the virtual machine. This must be a valid port number, 0 &lt; x &lt; 65536. | 
**protocol** | **String** | Protocol for port. Must be UDP or TCP. Defaults to \&quot;TCP\&quot;. |  [optional]
