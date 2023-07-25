# V1EksClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**addons** | [**List&lt;V1EksAddon&gt;**](V1EksAddon.md) | Addons defines the EKS addons to enable with the EKS cluster. This may be required for brownfield clusters |  [optional]
**bastionDisabled** | **Boolean** | BastionDisabled is the option to disable bastion node |  [optional]
**controlPlaneLoadBalancer** | **String** | ControlPlaneLoadBalancer specifies how API server elb will be configured, this field is optional, not provided, \&quot;\&quot;, default &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;Internet-facing\&quot; &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;internal\&quot; &#x3D;&gt; \&quot;internal\&quot; For spectro saas setup we require to talk to the apiserver from our cluster so ControlPlaneLoadBalancer should be \&quot;\&quot;, not provided or \&quot;Internet-facing\&quot; |  [optional]
**encryptionConfig** | [**V1EncryptionConfig**](V1EncryptionConfig.md) |  |  [optional]
**endpointAccess** | [**V1EksClusterConfigEndpointAccess**](V1EksClusterConfigEndpointAccess.md) |  |  [optional]
**region** | **String** | The AWS Region the cluster lives in. | 
**sshKeyName** | **String** | SSHKeyName specifies which EC2 SSH key can be used to access machines. |  [optional]
**vpcId** | **String** | VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created |  [optional]
