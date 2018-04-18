
# NodeStatusNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batterystatus** | [**NodeStatusNodeBatterystatus**](NodeStatusNodeBatterystatus.md) | Battery status information. |  [optional]
**capacity** | [**List&lt;NodeStatusNodeCapacityItem&gt;**](NodeStatusNodeCapacityItem.md) | Storage capacity of this node. |  [optional]
**cpu** | [**NodeStatusNodeCpu**](NodeStatusNodeCpu.md) | CPU status information for this node. |  [optional]
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**nvram** | [**NodeStatusNodeNvram**](NodeStatusNodeNvram.md) | Node NVRAM information. |  [optional]
**powersupplies** | [**NodeStatusNodePowersupplies**](NodeStatusNodePowersupplies.md) | Information about this node&#39;s power supplies. |  [optional]
**release** | **String** | OneFS release. |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]
**uptime** | **Integer** | Seconds this node has been online. |  [optional]
**version** | **String** | OneFS version. |  [optional]



