# V1InvoicePlan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**freeCredits** | [**List&lt;V1InvoicePlanCredit&gt;**](V1InvoicePlanCredit.md) | List of free credits |  [optional]
**plantype** | [**PlantypeEnum**](#PlantypeEnum) |  |  [optional]
**slaCredits** | [**List&lt;V1InvoicePlanCredit&gt;**](V1InvoicePlanCredit.md) | List of SLA credits |  [optional]

<a name="PlantypeEnum"></a>
## Enum: PlantypeEnum
Name | Value
---- | -----
TRIAL | &quot;Trial&quot;
MONTHLYONDEMAND | &quot;MonthlyOnDemand&quot;
ANNUALSUBSCRIPTION | &quot;AnnualSubscription&quot;
