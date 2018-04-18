
# NdmpLogsNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currentPage** | **String** | The page on this node&#39;s NDMP log file being returned. |  [optional]
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**logs** | **String** | The log file entries from the current page on this node. |  [optional]
**maxPage** | **Integer** | The highest page number in this node&#39;s NDMP log file. |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]



