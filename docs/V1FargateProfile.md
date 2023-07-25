# V1FargateProfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**additionalTags** | **Map&lt;String, String&gt;** | AdditionalTags is an optional set of tags to add to AWS resources managed by the AWS provider, in addition to the ones added by default. |  [optional]
**name** | **String** | name specifies the profile name. | 
**selectors** | [**List&lt;V1FargateSelector&gt;**](V1FargateSelector.md) | Selectors specify fargate pod selectors. |  [optional]
**subnetIds** | **List&lt;String&gt;** | SubnetIDs specifies which subnets are used for the auto scaling group of this nodegroup. |  [optional]
