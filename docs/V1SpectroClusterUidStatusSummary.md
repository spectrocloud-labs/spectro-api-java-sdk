# V1SpectroClusterUidStatusSummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abortTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**addOnServices** | [**List&lt;V1SpectroClusterAddOnServiceSummary&gt;**](V1SpectroClusterAddOnServiceSummary.md) |  |  [optional]
**apiEndpoints** | [**List&lt;V1APIEndpoint&gt;**](V1APIEndpoint.md) |  |  [optional]
**clusterImport** | [**V1ClusterImport**](V1ClusterImport.md) |  |  [optional]
**conditions** | [**List&lt;V1ClusterCondition&gt;**](V1ClusterCondition.md) |  |  [optional]
**cost** | [**V1ResourceCost**](V1ResourceCost.md) |  |  [optional]
**health** | [**V1SpectroClusterHealthStatus**](V1SpectroClusterHealthStatus.md) |  |  [optional]
**hourlyRate** | [**V1ResourceCost**](V1ResourceCost.md) |  |  [optional]
**kubeMeta** | [**V1KubeMeta**](V1KubeMeta.md) |  |  [optional]
**location** | [**V1ClusterMetaSpecLocation**](V1ClusterMetaSpecLocation.md) |  |  [optional]
**metrics** | [**V1SpectroClusterMetrics**](V1SpectroClusterMetrics.md) |  |  [optional]
**nested** | [**V1Virtual**](V1Virtual.md) |  |  [optional]
**notifications** | [**V1SpectroClusterNotifications**](V1SpectroClusterNotifications.md) |  |  [optional]
**packs** | [**List&lt;V1ClusterPackStatus&gt;**](V1ClusterPackStatus.md) |  |  [optional]
**services** | [**List&lt;V1LoadBalancerService&gt;**](V1LoadBalancerService.md) |  |  [optional]
**spcApply** | [**V1SpcApply**](V1SpcApply.md) |  |  [optional]
**state** | **String** | current operational state |  [optional]
**upgrades** | [**List&lt;V1Upgrades&gt;**](V1Upgrades.md) |  |  [optional]
**virtual** | [**V1Virtual**](V1Virtual.md) |  |  [optional]
**workspaces** | [**List&lt;V1ResourceReference&gt;**](V1ResourceReference.md) |  |  [optional]
