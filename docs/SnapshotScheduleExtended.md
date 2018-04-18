
# SnapshotScheduleExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Alias name to create for each snapshot. |  [optional]
**duration** | **Integer** | Time in seconds added to creation time to construction expiration time. |  [optional]
**id** | **Integer** | The system ID given to the schedule. |  [optional]
**name** | **String** | The schedule name. |  [optional]
**nextRun** | **Integer** | Unix Epoch time of next snapshot to be created. |  [optional]
**nextSnapshot** | **String** | Formatted name (see pattern) of next snapshot to be created. |  [optional]
**path** | **String** | The /ifs path snapshotted. |  [optional]
**pattern** | **String** | Pattern expanded with strftime to create snapshot name. |  [optional]
**schedule** | **String** | The isidate compatible natural language description of the schedule. |  [optional]



