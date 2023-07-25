# V1VmPersistentVolumeClaimVolumeSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claimName** | **String** | ClaimName is the name of a PersistentVolumeClaim in the same namespace as the pod using this volume. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims | 
**hotpluggable** | **Boolean** | Hotpluggable indicates whether the volume can be hotplugged and hotunplugged. |  [optional]
**readOnly** | **Boolean** | Will force the ReadOnly setting in VolumeMounts. Default false. |  [optional]
