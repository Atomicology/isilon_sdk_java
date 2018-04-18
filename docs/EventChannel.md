
# EventChannel

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowedNodes** | **List&lt;Integer&gt;** | Nodes (LNNs) that can be masters for this channel |  [optional]
**enabled** | **Boolean** | Channel is to be used or not |  [optional]
**excludedNodes** | **List&lt;Integer&gt;** | Nodes (LNNs) that can NOT be the masters for this channel |  [optional]
**parameters** | [**EventChannelParameters**](EventChannelParameters.md) | Parameters to be used for an smtp channel |  [optional]
**system** | **Boolean** | Channel is a pre-defined system channel |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The mechanism used by the channel |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CONNECTEMC | &quot;connectemc&quot;
SMTP | &quot;smtp&quot;
SNMP | &quot;snmp&quot;
HEARTBEAT | &quot;heartbeat&quot;



