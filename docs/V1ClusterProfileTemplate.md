# V1ClusterProfileTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudType** | [**V1CloudType**](V1CloudType.md) |  |  [optional]
**name** | **String** |  |  [optional]
**packServerRefs** | [**List&lt;V1ObjectReference&gt;**](V1ObjectReference.md) | PackServerRefs is only used on Hubble side it is reference to pack registry servers which PackRef belongs to in hubble, pack server is a top level object, so use a reference to point to it packs within a clusterprofile can come from different pack servers, so this is an array |  [optional]
**packServerSecret** | **String** | This secret is used only on Palette side use case is similar  to k8s image pull secret this single secret internally should contains all the pack servers in PackServerRefs if empty, means no credential is needed to access the pack server For spectro saas, Ally will set this field before pass to palette |  [optional]
**packs** | [**List&lt;V1PackRef&gt;**](V1PackRef.md) | Packs definitions here are final definitions. If ClonedFrom and ParamsOverwrite is present, then Packs are the final merge result of ClonedFrom and ParamsOverwrite So orchestration engine will just take the Packs and do the work, no need to worry about parameters merge |  [optional]
**profileVersion** | **String** | version start from 1.0.0, matching the index of ClusterProfileSpec.Versions[] will be used by clusterSpec to identify which version is applied to the cluster |  [optional]
**type** | **String** |  |  [optional]
**uid** | **String** |  |  [optional]
**version** | **Integer** | Deprecated. Use profileVersion |  [optional]
