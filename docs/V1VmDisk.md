# V1VmDisk

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**blockSize** | [**V1VmBlockSize**](V1VmBlockSize.md) |  |  [optional]
**bootOrder** | **Integer** | BootOrder is an integer value &gt; 0, used to determine ordering of boot devices. Lower values take precedence. Each disk or interface that has a boot order must have a unique value. Disks without a boot order are not tried if a disk with a boot order exists. |  [optional]
**cache** | **String** | Cache specifies which kvm disk cache mode should be used. Supported values are: CacheNone, CacheWriteThrough. |  [optional]
**cdrom** | [**V1VmCDRomTarget**](V1VmCDRomTarget.md) |  |  [optional]
**dedicatedIOThread** | **Boolean** | dedicatedIOThread indicates this disk should have an exclusive IO Thread. Enabling this implies useIOThreads &#x3D; true. Defaults to false. |  [optional]
**disk** | [**V1VmDiskTarget**](V1VmDiskTarget.md) |  |  [optional]
**io** | **String** | IO specifies which QEMU disk IO mode should be used. Supported values are: native, default, threads. |  [optional]
**lun** | [**V1VmLunTarget**](V1VmLunTarget.md) |  |  [optional]
**name** | **String** | Name is the device name | 
**serial** | **String** | Serial provides the ability to specify a serial number for the disk device. |  [optional]
**shareable** | **Boolean** | If specified the disk is made sharable and multiple write from different VMs are permitted |  [optional]
**tag** | **String** | If specified, disk address and its tag will be provided to the guest via config drive metadata |  [optional]
