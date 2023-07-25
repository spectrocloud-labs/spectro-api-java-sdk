# V1AwsLaunchTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalSecurityGroups** | [**List&lt;V1AwsResourceReference&gt;**](V1AwsResourceReference.md) | AdditionalSecurityGroups is an array of references to security groups that should be applied to the instances |  [optional]
**ami** | [**V1AwsAmiReference**](V1AwsAmiReference.md) |  |  [optional]
**imageLookupBaseOS** | **String** | ImageLookupBaseOS is the name of the base operating system to use for image lookup the AMI is not set |  [optional]
**imageLookupFormat** | **String** | ImageLookupFormat is the AMI naming format to look up the image |  [optional]
**imageLookupOrg** | **String** | ImageLookupOrg is the AWS Organization ID to use for image lookup if AMI is not set |  [optional]
**rootVolume** | [**V1AwsRootVolume**](V1AwsRootVolume.md) |  |  [optional]
