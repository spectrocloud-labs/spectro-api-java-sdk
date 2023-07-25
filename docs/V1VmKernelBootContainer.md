# V1VmKernelBootContainer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**image** | **String** | Image that contains initrd / kernel files. | 
**imagePullPolicy** | **String** | Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images |  [optional]
**imagePullSecret** | **String** | ImagePullSecret is the name of the Docker registry secret required to pull the image. The secret must already exist. |  [optional]
**initrdPath** | **String** | the fully-qualified path to the ramdisk image in the host OS |  [optional]
**kernelPath** | **String** | The fully-qualified path to the kernel image in the host OS |  [optional]
