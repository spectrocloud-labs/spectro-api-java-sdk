# V1NatsConfiguration

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connectionString** | **String** | Describes the preCalculated connection string, can be used directly to make connection |  [optional]
**enableTls** | **Boolean** | Describes the NATs application option to use a TLS based custom dialer. Its enabled when external Certificate is used over the existing one. |  [optional]
**insecureTls** | **Boolean** | Describes the NATs tls option to skip verifying the client certificate |  [optional]
**password** | **String** | Describes the NATs user&#x27;s password |  [optional]
**scheme** | **String** | Describes the NATs protocol for the connection. Eg- &#x27;tls&#x27;, &#x27;nats&#x27; |  [optional]
**tlsCertificate** | **String** | Describes the NATs tls certificate used for making a secure connection |  [optional]
**tlsKey** | **String** | Describes the NATs tls certificate key used for making a secure connection |  [optional]
**urls** | **String** | Describes the URLs of the nats nodes used in nats HA setup where the client will connect |  [optional]
**userName** | **String** | Describes the NATs user name |  [optional]
