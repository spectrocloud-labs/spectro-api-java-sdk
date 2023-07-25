# V1SpectroClusterVMCloneEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**annotationFilters** | **List&lt;String&gt;** | Annotation filters |  [optional]
**cloneName** | **String** | Cloning Virtual machine&#x27;s name | 
**labelFilters** | **List&lt;String&gt;** | Label filters |  [optional]
**newMacAddresses** | **Map&lt;String, String&gt;** | NewMacAddresses manually sets that target interfaces&#x27; mac addresses. The key is the interface name and the value is the new mac address. If this field is not specified, a new MAC address will be generated automatically, as for any interface that is not included in this map |  [optional]
**newSMBiosSerial** | **String** | NewSMBiosSerial manually sets that target&#x27;s SMbios serial. If this field is not specified, a new serial will be generated automatically. |  [optional]
