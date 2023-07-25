# V1VmResourceRequirements

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**limits** | **Object** | Limits describes the maximum amount of compute resources allowed. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;. |  [optional]
**overcommitGuestOverhead** | **Boolean** | Don&#x27;t ask the scheduler to take the guest-management overhead into account. Instead put the overhead only into the container&#x27;s memory limit. This can lead to crashes if all memory is in use on a node. Defaults to false. |  [optional]
**requests** | **Object** | Requests is a description of the initial vmi resources. Valid resource keys are \&quot;memory\&quot; and \&quot;cpu\&quot;. |  [optional]
