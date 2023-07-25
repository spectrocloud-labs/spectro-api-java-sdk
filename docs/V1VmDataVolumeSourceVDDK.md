# V1VmDataVolumeSourceVDDK

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backingFile** | **String** | BackingFile is the path to the virtual hard disk to migrate from vCenter/ESXi |  [optional]
**initImageURL** | **String** | InitImageURL is an optional URL to an image containing an extracted VDDK library, overrides v2v-vmware config map |  [optional]
**secretRef** | **String** | SecretRef provides a reference to a secret containing the username and password needed to access the vCenter or ESXi host |  [optional]
**thumbprint** | **String** | Thumbprint is the certificate thumbprint of the vCenter or ESXi host |  [optional]
**url** | **String** | URL is the URL of the vCenter or ESXi host with the VM to migrate |  [optional]
**uuid** | **String** | UUID is the UUID of the virtual machine that the backing file is attached to in vCenter/ESXi |  [optional]
