# V1VmPodAffinityTerm

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**labelSelector** | [**V1VmLabelSelector**](V1VmLabelSelector.md) |  |  [optional]
**namespaceSelector** | [**V1VmLabelSelector**](V1VmLabelSelector.md) |  |  [optional]
**namespaces** | **List&lt;String&gt;** | namespaces specifies a static list of namespace names that the term applies to. The term is applied to the union of the namespaces listed in this field and the ones selected by namespaceSelector. null or empty namespaces list and null namespaceSelector means \&quot;this pod&#x27;s namespace\&quot; |  [optional]
**topologyKey** | **String** | This pod should be co-located (affinity) or not co-located (anti-affinity) with the pods matching the labelSelector in the specified namespaces, where co-located is defined as running on a node whose value of the label with key topologyKey matches that of any node on which any of the selected pods is running. Empty topologyKey is not allowed. | 
