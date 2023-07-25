# V1VmSecretVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**optional** | **Boolean** | Specify whether the Secret or it&#x27;s keys must be defined |  [optional]
**secretName** | **String** | Name of the secret in the pod&#x27;s namespace to use. More info: https://kubernetes.io/docs/concepts/storage/volumes#secret |  [optional]
**volumeLabel** | **String** | The volume label of the resulting disk inside the VMI. Different bootstrapping mechanisms require different values. Typical values are \&quot;cidata\&quot; (cloud-init), \&quot;config-2\&quot; (cloud-init) or \&quot;OEMDRV\&quot; (kickstart). |  [optional]
