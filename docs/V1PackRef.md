# V1PackRef

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotations** | **Map&lt;String, String&gt;** | Annotations is used to allow packref to add more arbitrary information one example is to add git reference for values.yaml |  [optional]
**digest** | **String** | digest is used to specify the version should be installed by palette when pack upgrade available, change this digest to trigger upgrade |  [optional]
**inValidReason** | **String** |  |  [optional]
**isInvalid** | **Boolean** | pack is invalid when the associated tag is deleted from the registry |  [optional]
**layer** | [**LayerEnum**](#LayerEnum) |  | 
**manifests** | [**List&lt;V1ObjectReference&gt;**](V1ObjectReference.md) |  |  [optional]
**name** | **String** | pack name | 
**packUid** | **String** | PackUID is Hubble packUID, not palette Pack.UID It is used by Hubble only. |  [optional]
**params** | **Map&lt;String, String&gt;** | params passed as env variables to be consumed at installation time |  [optional]
**presets** | [**List&lt;V1PackPreset&gt;**](V1PackPreset.md) |  |  [optional]
**registryUid** | **String** | pack registry uid |  [optional]
**schema** | [**List&lt;V1PackSchema&gt;**](V1PackSchema.md) |  |  [optional]
**server** | **String** | pack registry server or helm repo |  [optional]
**tag** | **String** | pack tag |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | type of the pack |  [optional]
**values** | **String** | values represents the values.yaml used as input parameters either Params OR Values should be used, not both If both applied at the same time, will only use Values |  [optional]
**version** | **String** | pack version |  [optional]

<a name="LayerEnum"></a>
## Enum: LayerEnum
Name | Value
---- | -----
KERNEL | &quot;kernel&quot;
OS | &quot;os&quot;
K8S | &quot;k8s&quot;
CNI | &quot;cni&quot;
CSI | &quot;csi&quot;
ADDON | &quot;addon&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SPECTRO | &quot;spectro&quot;
HELM | &quot;helm&quot;
MANIFEST | &quot;manifest&quot;
