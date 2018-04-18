
# DrivesDriveFirmwareNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**drives** | [**List&lt;DrivesDriveFirmwareNodeDrive&gt;**](DrivesDriveFirmwareNodeDrive.md) | List of the firmware revisions on the drives in this node. |  [optional]
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]



