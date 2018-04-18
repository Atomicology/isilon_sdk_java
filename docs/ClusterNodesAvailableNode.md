
# ClusterNodesAvailableNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**configurationId** | **String** | Node configuration ID. |  [optional]
**description** | **String** | Human-readable description giving further detail on status (may be empty) |  [optional]
**product** | **String** | Isilon product name. |  [optional]
**serialNumber** | **String** | Serial number of this node. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Availability of the node. |  [optional]
**version** | **String** | OneFS build version running on the node. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AVAILABLE | &quot;available&quot;
WAITING | &quot;waiting&quot;
ERROR | &quot;error&quot;
ERROR_PERMANENT | &quot;error_permanent&quot;
WORKING | &quot;working&quot;
REBOOTING | &quot;rebooting&quot;
EXITING | &quot;exiting&quot;



