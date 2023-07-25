# V1VmDHCPOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bootFileName** | **String** | If specified will pass option 67 to interface&#x27;s DHCP server |  [optional]
**ntpServers** | **List&lt;String&gt;** | If specified will pass the configured NTP server to the VM via DHCP option 042. |  [optional]
**privateOptions** | [**List&lt;V1VmDHCPPrivateOptions&gt;**](V1VmDHCPPrivateOptions.md) | If specified will pass extra DHCP options for private use, range: 224-254 |  [optional]
**tftpServerName** | **String** | If specified will pass option 66 to interface&#x27;s DHCP server |  [optional]
