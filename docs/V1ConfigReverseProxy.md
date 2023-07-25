# V1ConfigReverseProxy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**caCert** | **String** | Describes the ca certificate for system&#x27;s reverse proxy |  [optional]
**clientCert** | **String** | Describes the client certificate for system&#x27;s reverse proxy |  [optional]
**clientKey** | **String** | Describes the client certificate key for system&#x27;s reverse proxy |  [optional]
**port** | **Integer** | Describes the system&#x27;s reverse proxy server port |  [optional]
**protocol** | [**ProtocolEnum**](#ProtocolEnum) | Describes the system&#x27;s reverse proxy server protocol. Possible values [https, http] |  [optional]
**server** | **String** | Describes the system&#x27;s reverse proxy server |  [optional]

<a name="ProtocolEnum"></a>
## Enum: ProtocolEnum
Name | Value
---- | -----
HTTP | &quot;http&quot;
HTTPS | &quot;https&quot;
