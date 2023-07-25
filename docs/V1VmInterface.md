# V1VmInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acpiIndex** | **Integer** | If specified, the ACPI index is used to provide network interface device naming, that is stable across changes in PCI addresses assigned to the device. This value is required to be unique across all devices and be between 1 and (16*1024-1). |  [optional]
**bootOrder** | **Integer** | BootOrder is an integer value &gt; 0, used to determine ordering of boot devices. Lower values take precedence. Each interface or disk that has a boot order must have a unique value. Interfaces without a boot order are not tried. |  [optional]
**bridge** | [**V1VmInterfaceBridge**](V1VmInterfaceBridge.md) |  |  [optional]
**dhcpOptions** | [**V1VmDHCPOptions**](V1VmDHCPOptions.md) |  |  [optional]
**macAddress** | **String** | Interface MAC address. For example: de:ad:00:00:be:af or DE-AD-00-00-BE-AF. |  [optional]
**macvtap** | [**V1VmInterfaceMacvtap**](V1VmInterfaceMacvtap.md) |  |  [optional]
**masquerade** | [**V1VmInterfaceMasquerade**](V1VmInterfaceMasquerade.md) |  |  [optional]
**model** | **String** | Interface model. One of: e1000, e1000e, ne2k_pci, pcnet, rtl8139, virtio. Defaults to virtio. |  [optional]
**name** | **String** | Logical name of the interface as well as a reference to the associated networks. Must match the Name of a Network. | 
**passt** | [**V1VmInterfacePasst**](V1VmInterfacePasst.md) |  |  [optional]
**pciAddress** | **String** | If specified, the virtual network interface will be placed on the guests pci address with the specified PCI address. For example: 0000:81:01.10 |  [optional]
**ports** | [**List&lt;V1VmPort&gt;**](V1VmPort.md) | List of ports to be forwarded to the virtual machine. |  [optional]
**slirp** | [**V1VmInterfaceSlirp**](V1VmInterfaceSlirp.md) |  |  [optional]
**sriov** | [**V1VmInterfaceSRIOV**](V1VmInterfaceSRIOV.md) |  |  [optional]
**tag** | **String** | If specified, the virtual network interface address and its tag will be provided to the guest via config drive |  [optional]
