
# NodeStateSmartfailNode

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dead** | **Boolean** | This node is dead (dead_devs). |  [optional]
**down** | **Boolean** | This node is down (down_devs). |  [optional]
**error** | **String** | Error message, if the HTTP status returned from this node was not 200. |  [optional]
**id** | **Integer** | Node ID of the node reporting this information. |  [optional]
**inCluster** | **Boolean** | This node is in the cluster (all_devs). |  [optional]
**lnn** | **Integer** | Logical node number of the node reporting this information. |  [optional]
**readonly** | **Boolean** | This node is readonly (ro_devs). |  [optional]
**shutdownReadonly** | **Boolean** | This node is shutdown readonly (down_devs). |  [optional]
**smartfailed** | **Boolean** | This node is smartfailed (soft_devs). |  [optional]
**status** | **Integer** | Status of the HTTP response from this node if not 200.  If 200, this field does not appear. |  [optional]



