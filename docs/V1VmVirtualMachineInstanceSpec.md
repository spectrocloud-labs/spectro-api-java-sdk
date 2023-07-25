# V1VmVirtualMachineInstanceSpec

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessCredentials** | [**List&lt;V1VmAccessCredential&gt;**](V1VmAccessCredential.md) | Specifies a set of public keys to inject into the vm guest |  [optional]
**affinity** | [**V1VmAffinity**](V1VmAffinity.md) |  |  [optional]
**dnsConfig** | [**V1VmPodDnsConfig**](V1VmPodDnsConfig.md) |  |  [optional]
**dnsPolicy** | **String** | Set DNS policy for the pod. Defaults to \&quot;ClusterFirst\&quot;. Valid values are &#x27;ClusterFirstWithHostNet&#x27;, &#x27;ClusterFirst&#x27;, &#x27;Default&#x27; or &#x27;None&#x27;. DNS parameters given in DNSConfig will be merged with the policy selected with DNSPolicy. To have DNS options set along with hostNetwork, you have to specify DNS policy explicitly to &#x27;ClusterFirstWithHostNet&#x27;. |  [optional]
**domain** | [**V1VmDomainSpec**](V1VmDomainSpec.md) |  | 
**evictionStrategy** | **String** | EvictionStrategy can be set to \&quot;LiveMigrate\&quot; if the VirtualMachineInstance should be migrated instead of shut-off in case of a node drain. |  [optional]
**hostname** | **String** | Specifies the hostname of the vmi If not specified, the hostname will be set to the name of the vmi, if dhcp or cloud-init is configured properly. |  [optional]
**livenessProbe** | [**V1VmProbe**](V1VmProbe.md) |  |  [optional]
**networks** | [**List&lt;V1VmNetwork&gt;**](V1VmNetwork.md) | List of networks that can be attached to a vm&#x27;s virtual interface. |  [optional]
**nodeSelector** | **Map&lt;String, String&gt;** | NodeSelector is a selector which must be true for the vmi to fit on a node. Selector which must match a node&#x27;s labels for the vmi to be scheduled on that node. More info: https://kubernetes.io/docs/concepts/configuration/assign-pod-node/ |  [optional]
**priorityClassName** | **String** | If specified, indicates the pod&#x27;s priority. If not specified, the pod priority will be default or zero if there is no default. |  [optional]
**readinessProbe** | [**V1VmProbe**](V1VmProbe.md) |  |  [optional]
**schedulerName** | **String** | If specified, the VMI will be dispatched by specified scheduler. If not specified, the VMI will be dispatched by default scheduler. |  [optional]
**startStrategy** | **String** | StartStrategy can be set to \&quot;Paused\&quot; if Virtual Machine should be started in paused state. |  [optional]
**subdomain** | **String** | If specified, the fully qualified vmi hostname will be \&quot;&lt;hostname&gt;.&lt;subdomain&gt;.&lt;pod namespace&gt;.svc.&lt;cluster domain&gt;\&quot;. If not specified, the vmi will not have a domainname at all. The DNS entry will resolve to the vmi, no matter if the vmi itself can pick up a hostname. |  [optional]
**terminationGracePeriodSeconds** | **Long** | Grace period observed after signalling a VirtualMachineInstance to stop after which the VirtualMachineInstance is force terminated. |  [optional]
**tolerations** | [**List&lt;V1VmToleration&gt;**](V1VmToleration.md) | If toleration is specified, obey all the toleration rules. |  [optional]
**topologySpreadConstraints** | [**List&lt;V1VmTopologySpreadConstraint&gt;**](V1VmTopologySpreadConstraint.md) | TopologySpreadConstraints describes how a group of VMIs will be spread across a given topology domains. K8s scheduler will schedule VMI pods in a way which abides by the constraints. |  [optional]
**volumes** | [**List&lt;V1VmVolume&gt;**](V1VmVolume.md) | List of volumes that can be mounted by disks belonging to the vmi. |  [optional]
