
# NodeStateReadonlyNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowed** | **Boolean** | The current read-only mode allowed status for the node. |  [optional]
**enabled** | **Boolean** | The current read-only user mode status for the node. NOTE: If read-only mode is currently disallowed for this node, it will remain read/write until read-only mode is allowed again. This value only sets or clears any user-specified requests for read-only mode. If the node has been placed into read-only mode by the system, it will remain in read-only mode until the system conditions which triggered read-only mode have cleared. |  [optional]
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**mode** | **Boolean** | The current read-only mode status for the node. |  [optional]
**status** | **String** | The current read-only mode status description for the node. |  [optional]
**valid** | **Boolean** | The read-only state values are valid (False &#x3D; Error). |  [optional]
**value** | **Integer** | The current read-only value (enumerated bitfield) for the node. |  [optional]



