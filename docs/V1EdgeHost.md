# V1EdgeHost

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hostAddress** | **String** | HostAddress is a FQDN or IP address of the Host | 
**hostAuthToken** | **String** | HostAuthToken to authorize auto registration |  [optional]
**hostChecksum** | **String** | HostChecksum is the checksum provided by the edge host, to be persisted in SaaS |  [optional]
**hostIdentity** | [**V1EdgeHostIdentity**](V1EdgeHostIdentity.md) |  |  [optional]
**hostPairingKey** | **String** | HostPairingKey is the one-time pairing key to pair the edge host with the device registered in SaaS |  [optional]
**hostUid** | **String** | HostUid is the ID of the EdgeHost | 
**macAddress** | **String** | Mac address of edgehost |  [optional]
**project** | [**V1ObjectEntity**](V1ObjectEntity.md) |  |  [optional]
