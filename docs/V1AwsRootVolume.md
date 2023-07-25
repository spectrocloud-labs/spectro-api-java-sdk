# V1AwsRootVolume

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**deviceName** | **String** | Device name |  [optional]
**encrypted** | **Boolean** | EncryptionKey is the KMS key to use to encrypt the volume. Can be either a KMS key ID or ARN |  [optional]
**encryptionKey** | **String** | EncryptionKey is the KMS key to use to encrypt the volume. Can be either a KMS key ID or ARN |  [optional]
**iops** | **Long** | IOPS is the number of IOPS requested for the disk. Not applicable to all types |  [optional]
**throughput** | **Long** | Throughput to provision in MiB/s supported for the volume type. Not applicable to all types. |  [optional]
**type** | **String** | Type is the type of the volume (e.g. gp2, io1, etc...) |  [optional]
