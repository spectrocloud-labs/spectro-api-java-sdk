# V1InvoiceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | [**V1Address**](V1Address.md) |  |  [optional]
**billingPeriod** | [**V1InvoiceBillingPeriod**](V1InvoiceBillingPeriod.md) |  |  [optional]
**credits** | [**V1InvoiceCredits**](V1InvoiceCredits.md) |  |  [optional]
**envType** | **String** | Environment type [Trial,MonthlyOnDemand,AnnualSubscription,OnPrem] |  [optional]
**month** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**paymentUnit** | [**PaymentUnitEnum**](#PaymentUnitEnum) |  |  [optional]
**plan** | [**V1InvoicePlan**](V1InvoicePlan.md) |  |  [optional]

<a name="PaymentUnitEnum"></a>
## Enum: PaymentUnitEnum
Name | Value
---- | -----
USD | &quot;usd&quot;
