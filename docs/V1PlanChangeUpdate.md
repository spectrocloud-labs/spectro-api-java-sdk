# V1PlanChangeUpdate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expiry** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**isPaymentGateway** | **Boolean** |  |  [optional]
**planLimit** | [**V1PlanLimit**](V1PlanLimit.md) |  |  [optional]
**start** | [**OffsetDateTime**](OffsetDateTime.md) |  | 
**tierPrice** | [**V1TierPrice**](V1TierPrice.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  | 

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
TRIAL | &quot;Trial&quot;
MONTHLYONDEMAND | &quot;MonthlyOnDemand&quot;
ANNUALSUBSCRIPTION | &quot;AnnualSubscription&quot;
