
# ClusterVersionNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**build** | **String** | OneFS build string. | 
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**release** | **String** | Kernel release number. | 
**revision** | **String** | OneFS build number. | 
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]
**type** | **String** | Kernel release type. | 
**version** | **String** | Kernel full version information. | 



