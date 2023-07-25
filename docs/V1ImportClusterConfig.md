# V1ImportClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fips** | [**V1FipsConfig**](V1FipsConfig.md) |  |  [optional]
**importMode** | [**ImportModeEnum**](#ImportModeEnum) | If the importMode is empty then cluster is imported with full permission mode. By default importMode is empty and cluster is imported in full permission mode. |  [optional]
**proxy** | [**V1ClusterProxySpec**](V1ClusterProxySpec.md) |  |  [optional]

<a name="ImportModeEnum"></a>
## Enum: ImportModeEnum
Name | Value
---- | -----
READ_ONLY | &quot;read-only&quot;
