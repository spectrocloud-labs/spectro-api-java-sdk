# V1VmVirtualMachineMemoryDumpRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**claimName** | **String** | ClaimName is the name of the pvc that will contain the memory dump | 
**endTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**fileName** | **String** | FileName represents the name of the output file |  [optional]
**message** | **String** | Message is a detailed message about failure of the memory dump |  [optional]
**phase** | **String** | Phase represents the memory dump phase | 
**remove** | **Boolean** | Remove represents request of dissociating the memory dump pvc |  [optional]
**startTimestamp** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
