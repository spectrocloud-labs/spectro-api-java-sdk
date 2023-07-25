# V1InvoiceState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentMsg** | **String** | Payment status message |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**timestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PAID | &quot;Paid&quot;
PAYMENTPENDING | &quot;PaymentPending&quot;
PAYMENTINPROGRESS | &quot;PaymentInProgress&quot;
PAYMENTFAILED | &quot;PaymentFailed&quot;
