# V1AwsClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bastionDisabled** | **Boolean** | Create bastion node option we have earlier supported creation of bastion by default capa seems to favour session manager against bastion node https://github.com/kubernetes-sigs/cluster-api-provider-aws/issues/947 |  [optional]
**controlPlaneLoadBalancer** | **String** | ControlPlaneLoadBalancer specifies how API server elb will be configured, this field is optional, not provided, \&quot;\&quot;, default &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;Internet-facing\&quot; &#x3D;&gt; \&quot;Internet-facing\&quot; \&quot;internal\&quot; &#x3D;&gt; \&quot;internal\&quot; For spectro saas setup we require to talk to the apiserver from our cluster so ControlPlaneLoadBalancer should be \&quot;\&quot;, not provided or \&quot;Internet-facing\&quot; |  [optional]
**region** | **String** |  | 
**sshKeyName** | **String** |  |  [optional]
**vpcId** | **String** | VPC Id to deploy cluster into should have one public and one private subnet for the the cluster creation, this field is optional, If VPC Id is not provided a fully managed VPC will be created |  [optional]
