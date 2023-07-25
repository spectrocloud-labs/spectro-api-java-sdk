# V1VmDiskTarget

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bus** | **String** | Bus indicates the type of disk device to emulate. supported values: virtio, sata, scsi, usb. |  [optional]
**pciAddress** | **String** | If specified, the virtual disk will be placed on the guests pci address with the specified PCI address. For example: 0000:81:01.10 |  [optional]
**readonly** | **Boolean** | ReadOnly. Defaults to false. |  [optional]
