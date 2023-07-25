# V1VmProbe

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exec** | [**V1VmExecAction**](V1VmExecAction.md) |  |  [optional]
**failureThreshold** | **Integer** | Minimum consecutive failures for the probe to be considered failed after having succeeded. Defaults to 3. Minimum value is 1. |  [optional]
**guestAgentPing** | [**V1VmGuestAgentPing**](V1VmGuestAgentPing.md) |  |  [optional]
**httpGet** | [**V1VmHttpGetAction**](V1VmHttpGetAction.md) |  |  [optional]
**initialDelaySeconds** | **Integer** | Number of seconds after the VirtualMachineInstance has started before liveness probes are initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]
**periodSeconds** | **Integer** | How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. |  [optional]
**successThreshold** | **Integer** | Minimum consecutive successes for the probe to be considered successful after having failed. Defaults to 1. Must be 1 for liveness. Minimum value is 1. |  [optional]
**tcpSocket** | [**V1VmTcpSocketAction**](V1VmTcpSocketAction.md) |  |  [optional]
**timeoutSeconds** | **Integer** | Number of seconds after which the probe times out. For exec probes the timeout fails the probe but does not terminate the command running on the guest. This means a blocking command can result in an increasing load on the guest. A small buffer will be added to the resulting workload exec probe to compensate for delays caused by the qemu guest exec mechanism. Defaults to 1 second. Minimum value is 1. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes |  [optional]
