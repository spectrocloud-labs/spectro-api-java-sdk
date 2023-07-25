# V1VmContainerDiskSource

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | **String** | Image is the name of the image with the embedded disk. | 
**imagePullPolicy** | **String** | Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images |  [optional]
**imagePullSecret** | **String** | ImagePullSecret is the name of the Docker registry secret required to pull the image. The secret must already exist. |  [optional]
**path** | **String** | Path defines the path to disk file in the container |  [optional]
