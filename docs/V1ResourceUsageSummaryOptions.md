# V1ResourceUsageSummaryOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enableSummaryView** | **Boolean** |  |  [optional]
**groupBy** | [**GroupByEnum**](#GroupByEnum) |  |  [optional]
**period** | **Integer** |  |  [optional]

<a name="GroupByEnum"></a>
## Enum: GroupByEnum
Name | Value
---- | -----
TENANT | &quot;tenant&quot;
PROJECT | &quot;project&quot;
WORKSPACE | &quot;workspace&quot;
CLUSTER | &quot;cluster&quot;
NAMESPACE | &quot;namespace&quot;
DEPLOYMENT | &quot;deployment&quot;
STATEFULSET | &quot;statefulset&quot;
DAEMONSET | &quot;daemonset&quot;
POD | &quot;pod&quot;
CLOUD | &quot;cloud&quot;
