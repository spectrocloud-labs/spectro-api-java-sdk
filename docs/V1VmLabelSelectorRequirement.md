# V1VmLabelSelectorRequirement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**key** | **String** | key is the label key that the selector applies to. | 
**operator** | **String** | operator represents a key&#x27;s relationship to a set of values. Valid operators are In, NotIn, Exists and DoesNotExist. | 
**values** | **List&lt;String&gt;** | values is an array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch. |  [optional]