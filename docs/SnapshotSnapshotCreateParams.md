
# SnapshotSnapshotCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alias** | **String** | Alias name to create for this snapshot. If null, remove any alias. |  [optional]
**expires** | **Integer** | The Unix Epoch time the snapshot will expire and be eligible for automatic deletion. |  [optional]
**name** | **String** | The user or system supplied snapshot name. This will be null for snapshots pending delete. |  [optional]
**path** | **String** | The /ifs path snapshotted. | 



