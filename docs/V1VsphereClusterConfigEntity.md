# V1VsphereClusterConfigEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controlPlaneEndpoint** | [**V1ControlPlaneEndPoint**](V1ControlPlaneEndPoint.md) |  |  [optional]
**ntpServers** | **List&lt;String&gt;** | NTPServers is a list of NTP servers to use instead of the machine image&#x27;s default NTP server list. |  [optional]
**placement** | [**V1VspherePlacementConfigEntity**](V1VspherePlacementConfigEntity.md) |  | 
**sshKeys** | **List&lt;String&gt;** | SSHKeys specifies a list of ssh authorized keys for the &#x27;spectro&#x27; user |  [optional]
**staticIp** | **Boolean** | whether this cluster should use dhcp or static IP, if false, use DHCP if this is set, then all machinepools should have staticIP with provided IPPool adding this as an additional standalone flag without relating to placement.Nework main reason is to enable more validation for placement.Network.StaticIP which should come together with valid Network.IPPool and Network.Name |  [optional]
