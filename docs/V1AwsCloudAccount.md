# V1AwsCloudAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKey** | **String** | AWS account access key |  [optional]
**credentialType** | [**V1AwsCloudAccountCredentialType**](V1AwsCloudAccountCredentialType.md) |  |  [optional]
**partition** | [**PartitionEnum**](#PartitionEnum) | AWS accounts are scoped to a single partition. Allowed values [aws, aws-us-gov], Default values |  [optional]
**policyARNs** | **List&lt;String&gt;** | List of policy ARNs required in case of credentialType sts. |  [optional]
**secretKey** | **String** | AWS account secret key |  [optional]
**sts** | [**V1AwsStsCredentials**](V1AwsStsCredentials.md) |  |  [optional]

<a name="PartitionEnum"></a>
## Enum: PartitionEnum
Name | Value
---- | -----
AWS | &quot;aws&quot;
AWS_US_GOV | &quot;aws-us-gov&quot;
