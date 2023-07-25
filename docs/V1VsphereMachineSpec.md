# V1VsphereMachineSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**images** | [**List&lt;V1VsphereImage&gt;**](V1VsphereImage.md) |  |  [optional]
**instanceType** | [**V1VsphereInstanceType**](V1VsphereInstanceType.md) |  |  [optional]
**nics** | [**List&lt;V1VsphereNic&gt;**](V1VsphereNic.md) |  | 
**ntpServers** | **List&lt;String&gt;** | NTPServers is a list of NTP servers to use instead of the machine image&#x27;s default NTP server list. |  [optional]
**placement** | [**V1VspherePlacementConfig**](V1VspherePlacementConfig.md) |  | 
**vcenterServer** | **String** | VcenterServer is the address of the vSphere endpoint | 
