# V1LibvirtClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controlPlaneEndpoint** | [**V1LibvirtControlPlaneEndPoint**](V1LibvirtControlPlaneEndPoint.md) |  |  [optional]
**ntpServers** | **List&lt;String&gt;** | NTPServers is a list of NTP servers to use instead of the machine image&#x27;s default NTP server list |  [optional]
**sshKeys** | **List&lt;String&gt;** | SSHKeys specifies a list of ssh authorized keys to access the vms as a &#x27;spectro&#x27; user |  [optional]
**staticIp** | **Boolean** | StaticIP indicates if IP allocation type is static IP. DHCP is the default allocation type |  [optional]
