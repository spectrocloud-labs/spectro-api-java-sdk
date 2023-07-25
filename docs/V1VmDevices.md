# V1VmDevices

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autoattachGraphicsDevice** | **Boolean** | Whether to attach the default graphics device or not. VNC will not be available if set to false. Defaults to true. |  [optional]
**autoattachInputDevice** | **Boolean** | Whether to attach an Input Device. Defaults to false. |  [optional]
**autoattachMemBalloon** | **Boolean** | Whether to attach the Memory balloon device with default period. Period can be adjusted in virt-config. Defaults to true. |  [optional]
**autoattachPodInterface** | **Boolean** | Whether to attach a pod network interface. Defaults to true. |  [optional]
**autoattachSerialConsole** | **Boolean** | Whether to attach the default serial console or not. Serial console access will not be available if set to false. Defaults to true. |  [optional]
**autoattachVSOCK** | **Boolean** | Whether to attach the VSOCK CID to the VM or not. VSOCK access will be available if set to true. Defaults to false. |  [optional]
**blockMultiQueue** | **Boolean** | Whether or not to enable virtio multi-queue for block devices. Defaults to false. |  [optional]
**clientPassthrough** | [**V1VmClientPassthroughDevices**](V1VmClientPassthroughDevices.md) |  |  [optional]
**disableHotplug** | **Boolean** | DisableHotplug disabled the ability to hotplug disks. |  [optional]
**disks** | [**List&lt;V1VmDisk&gt;**](V1VmDisk.md) | Disks describes disks, cdroms and luns which are connected to the vmi. |  [optional]
**filesystems** | [**List&lt;V1VmFilesystem&gt;**](V1VmFilesystem.md) | Filesystems describes filesystem which is connected to the vmi. |  [optional]
**gpus** | [**List&lt;V1VmGPU&gt;**](V1VmGPU.md) | Whether to attach a GPU device to the vmi. |  [optional]
**hostDevices** | [**List&lt;V1VmHostDevice&gt;**](V1VmHostDevice.md) | Whether to attach a host device to the vmi. |  [optional]
**inputs** | [**List&lt;V1VmInput&gt;**](V1VmInput.md) | Inputs describe input devices |  [optional]
**interfaces** | [**List&lt;V1VmInterface&gt;**](V1VmInterface.md) | Interfaces describe network interfaces which are added to the vmi. |  [optional]
**networkInterfaceMultiqueue** | **Boolean** | If specified, virtual network interfaces configured with a virtio bus will also enable the vhost multiqueue feature for network devices. The number of queues created depends on additional factors of the VirtualMachineInstance, like the number of guest CPUs. |  [optional]
**rng** | [**V1VmRng**](V1VmRng.md) |  |  [optional]
**sound** | [**V1VmSoundDevice**](V1VmSoundDevice.md) |  |  [optional]
**tpm** | [**V1VmTPMDevice**](V1VmTPMDevice.md) |  |  [optional]
**useVirtioTransitional** | **Boolean** | Fall back to legacy virtio 0.9 support if virtio bus is selected on devices. This is helpful for old machines like CentOS6 or RHEL6 which do not understand virtio_non_transitional (virtio 1.0). |  [optional]
**watchdog** | [**V1VmWatchdog**](V1VmWatchdog.md) |  |  [optional]
