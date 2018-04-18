
# NodeSensorsNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**sensors** | [**List&lt;NodeSensorsNodeSensor&gt;**](NodeSensorsNodeSensor.md) | This node&#39;s sensor information. |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]



