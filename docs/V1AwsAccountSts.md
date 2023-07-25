# V1AwsAccountSts

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A 12-digit number, such as 123456789012, that uniquely identifies an AWS account |  [optional]
**externalId** | **String** | It can be passed to the AssumeRole API of the STS. It can be used in the condition element in a role&#x27;s trust policy, allowing the role to be assumed only when a certain value is present in the external ID |  [optional]
**partition** | [**V1AwsPartition**](V1AwsPartition.md) |  |  [optional]
