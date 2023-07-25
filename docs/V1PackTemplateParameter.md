# V1PackTemplateParameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Pack template parameter description |  [optional]
**displayName** | **String** | Pack template parameter display name |  [optional]
**format** | **String** | Pack template parameter format |  [optional]
**hidden** | **Boolean** | Pack template parameter hidden flag, if true then the parameter is hidden in the UI |  [optional]
**listOptions** | **List&lt;String&gt;** | Pack template parameter list options as string array |  [optional]
**name** | **String** | Pack template parameter name |  [optional]
**optional** | **Boolean** | Pack template parameter optional flag, if true then the parameter value is not mandatory |  [optional]
**options** | [**Map&lt;String, V1PackTemplateParameterOption&gt;**](V1PackTemplateParameterOption.md) | Pack template parameter options array |  [optional]
**readOnly** | **Boolean** | Pack template parameter readonly flag, if true then the parameter value can&#x27;t be overridden |  [optional]
**regex** | **String** | Pack template parameter regex, if set then parameter value must match with specified regex |  [optional]
**targetKey** | **String** | Pack template parameter target key which is mapped to the key defined in the pack values |  [optional]
**type** | **String** | Pack template parameter data type |  [optional]
**value** | **String** | Pack template parameter value |  [optional]
