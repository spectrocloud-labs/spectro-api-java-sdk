# V1ClusterRbacBinding

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**namespace** | **String** |  |  [optional]
**role** | [**V1ClusterRoleRef**](V1ClusterRoleRef.md) |  |  [optional]
**subjects** | [**List&lt;V1ClusterRbacSubjects&gt;**](V1ClusterRbacSubjects.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ROLEBINDING | &quot;RoleBinding&quot;
CLUSTERROLEBINDING | &quot;ClusterRoleBinding&quot;
