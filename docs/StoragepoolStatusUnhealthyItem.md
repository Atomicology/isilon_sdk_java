
# StoragepoolStatusUnhealthyItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affected** | [**List&lt;StoragepoolStatusUnhealthyItemAffectedItem&gt;**](StoragepoolStatusUnhealthyItemAffectedItem.md) | The affected nodes and/or drives. | 
**diskpool** | [**StoragepoolStatusUnhealthyItemDiskpool**](StoragepoolStatusUnhealthyItemDiskpool.md) |  |  [optional]
**healthFlags** | [**List&lt;HealthFlagsEnum&gt;**](#List&lt;HealthFlagsEnum&gt;) | An array of containing any health issues with this pool.  If the pool is healthy, the list is empty. |  [optional]


<a name="List<HealthFlagsEnum>"></a>
## Enum: List&lt;HealthFlagsEnum&gt;
Name | Value
---- | -----
UNDERPROVISIONED | &quot;underprovisioned&quot;
MISSING_DRIVES | &quot;missing_drives&quot;
DEVICES_DOWN | &quot;devices_down&quot;
DEVICES_SMARTFAILED | &quot;devices_smartfailed&quot;
WAITING_REPAIR | &quot;waiting_repair&quot;



