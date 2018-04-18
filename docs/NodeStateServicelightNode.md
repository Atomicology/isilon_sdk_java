
# NodeStateServicelightNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | The node service light state (True &#x3D; on). | 
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**present** | **Boolean** | This node has a service light. |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]
**supported** | **Boolean** | This node supports a service light. |  [optional]
**valid** | **Boolean** | The node service light state is valid (False &#x3D; Error). |  [optional]



