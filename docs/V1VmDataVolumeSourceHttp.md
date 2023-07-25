# V1VmDataVolumeSourceHttp

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certConfigMap** | **String** | CertConfigMap is a configmap reference, containing a Certificate Authority(CA) public key, and a base64 encoded pem certificate |  [optional]
**extraHeaders** | **List&lt;String&gt;** | ExtraHeaders is a list of strings containing extra headers to include with HTTP transfer requests |  [optional]
**secretExtraHeaders** | **List&lt;String&gt;** | SecretExtraHeaders is a list of Secret references, each containing an extra HTTP header that may include sensitive information |  [optional]
**secretRef** | **String** | SecretRef A Secret reference, the secret should contain accessKeyId (user name) base64 encoded, and secretKey (password) also base64 encoded |  [optional]
**url** | **String** | URL is the URL of the http(s) endpoint | 
