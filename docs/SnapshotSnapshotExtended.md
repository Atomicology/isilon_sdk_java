
# SnapshotSnapshotExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Alias name to create for this snapshot. If null, remove any alias. |  [optional]
**expires** | **Integer** | The Unix Epoch time the snapshot will expire and be eligible for automatic deletion. |  [optional]
**name** | **String** | The user or system supplied snapshot name. This will be null for snapshots pending delete. |  [optional]
**created** | **Integer** | The Unix Epoch time the snapshot was created. | 
**hasLocks** | **Boolean** | True if the snapshot has one or more locks present see, see the locks subresource of a snapshot for a list of locks. | 
**id** | **Integer** | The system ID given to the snapshot. This is useful for tracking the status of delete pending snapshots. | 
**path** | **String** | The /ifs path snapshotted. |  [optional]
**pctFilesystem** | [**BigDecimal**](BigDecimal.md) | Percentage of /ifs used for storing this snapshot. | 
**pctReserve** | [**BigDecimal**](BigDecimal.md) | Percentage of configured snapshot reserved used for storing this snapshot. | 
**schedule** | **String** | The name of the schedule used to create this snapshot, if applicable. |  [optional]
**shadowBytes** | **Integer** | The amount of shadow bytes referred to by this snapshot. | 
**size** | **Integer** | The amount of storage in bytes used to store this snapshot. | 
**state** | [**StateEnum**](#StateEnum) | Snapshot state. | 
**targetId** | **Integer** | The ID of the snapshot pointed to if this is an alias. |  [optional]
**targetName** | **String** | The name of the snapshot pointed to if this is an alias. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
DELETING | &quot;deleting&quot;



