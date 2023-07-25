# V1NatsCredentialRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterUid** | **String** | Deprecated. please use resourceUid |  [optional]
**isSystem** | **Boolean** | Describes if its a system request |  [optional]
**resourceUid** | **String** | Describes the resource for which credentials has to be fetched |  [optional]
**serviceName** | [**ServiceNameEnum**](#ServiceNameEnum) | Describes the service for which credentials has to be fetched. Possible values [ally, jet] |  [optional]
**tenantUid** | **String** | Describes the tenant of the resource |  [optional]

<a name="ServiceNameEnum"></a>
## Enum: ServiceNameEnum
Name | Value
---- | -----
ALLY | &quot;ally&quot;
JET | &quot;jet&quot;
