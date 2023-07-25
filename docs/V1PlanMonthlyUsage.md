# V1PlanMonthlyUsage

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dailyUsages** | [**List&lt;V1ResourceUsage&gt;**](V1ResourceUsage.md) |  |  [optional]
**month** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**planLimit** | [**V1PlanLimit**](V1PlanLimit.md) |  |  [optional]
**planType** | [**PlanTypeEnum**](#PlanTypeEnum) |  |  [optional]
**planUid** | **String** |  |  [optional]
**totalMonthlyUsage** | [**V1TotalResourceUsage**](V1TotalResourceUsage.md) |  |  [optional]

<a name="PlanTypeEnum"></a>
## Enum: PlanTypeEnum
Name | Value
---- | -----
TRIAL | &quot;Trial&quot;
MONTHLYONDEMAND | &quot;MonthlyOnDemand&quot;
ANNUALSUBSCRIPTION | &quot;AnnualSubscription&quot;
