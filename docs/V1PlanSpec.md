# V1PlanSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cost** | [**V1PlanCost**](V1PlanCost.md) |  |  [optional]
**developerCredits** | [**V1DeveloperCredit**](V1DeveloperCredit.md) |  |  [optional]
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**freeCredits** | [**List&lt;V1PlanCredit&gt;**](V1PlanCredit.md) |  |  [optional]
**planLimit** | [**V1PlanLimit**](V1PlanLimit.md) |  |  [optional]
**renewal** | [**V1PlanRenewal**](V1PlanRenewal.md) |  |  [optional]
**slaCredits** | [**List&lt;V1PlanCredit&gt;**](V1PlanCredit.md) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**tierPricing** | [**V1TierPrice**](V1TierPrice.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRIAL | &quot;Trial&quot;
MONTHLYONDEMAND | &quot;MonthlyOnDemand&quot;
ANNUALSUBSCRIPTION | &quot;AnnualSubscription&quot;
