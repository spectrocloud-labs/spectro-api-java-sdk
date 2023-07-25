# V1ClusterLogFetcherRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**duration** | **Long** | Duration for which log is requested |  [optional]
**k8s** | [**V1ClusterLogFetcherK8sRequest**](V1ClusterLogFetcherK8sRequest.md) |  |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Accepted Values - [\&quot;cluster\&quot;, \&quot;app\&quot;]. if \&quot;app\&quot; then logs will be fetched from the virtual cluster |  [optional]
**noOfLines** | **Long** | No of lines of logs requested |  [optional]
**node** | [**V1ClusterLogFetcherNodeRequest**](V1ClusterLogFetcherNodeRequest.md) |  |  [optional]

<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
CLUSTER | &quot;cluster&quot;
APP | &quot;app&quot;
