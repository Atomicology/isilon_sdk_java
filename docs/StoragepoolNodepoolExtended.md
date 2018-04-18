
# StoragepoolNodepoolExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**canEnableL3** | **Boolean** | Indicates if enabling L3 is possible. L3 cannot be enabled if there are unprovisioned drives. | 
**healthFlags** | [**List&lt;HealthFlagsEnum&gt;**](#List&lt;HealthFlagsEnum&gt;) | An array of containing any health issues with this pool.  If the pool is healthy, the list is empty. |  [optional]
**id** | **Integer** | The system ID given to the node pool. | 
**l3** | **Boolean** | Use SSDs in this node pool for L3 cache. | 
**l3Status** | [**L3StatusEnum**](#L3StatusEnum) | &#39;storage&#39; if the &#39;l3&#39; option is disabled. If the l3 option is enabled, &#39;migrating&#39; if any SSDs in this node pool have not yet been migrated to L3. If all SSDs have been migrated, &#39;l3&#39;. | 
**lnns** | **List&lt;Integer&gt;** | The nodes that are part of this node pool. | 
**manual** | **Boolean** | Whether or not the node pool is manually managed. | 
**name** | **String** | The node pool name. | 
**protectionPolicy** | **String** | The underlying protection policy. |  [optional]
**tier** | **String** | The name (if named) or system ID of the node pool&#39;s tier, if it is in a tier. Otherwise null. |  [optional]
**usage** | [**StoragepoolTierUsage**](StoragepoolTierUsage.md) | Total pool usage. | 


<a name="List<HealthFlagsEnum>"></a>
## Enum: List&lt;HealthFlagsEnum&gt;
Name | Value
---- | -----
UNDERPROVISIONED | &quot;underprovisioned&quot;
MISSING_DRIVES | &quot;missing_drives&quot;
DEVICES_DOWN | &quot;devices_down&quot;
DEVICES_SMARTFAILED | &quot;devices_smartfailed&quot;
WAITING_REPAIR | &quot;waiting_repair&quot;


<a name="L3StatusEnum"></a>
## Enum: L3StatusEnum
Name | Value
---- | -----
L3 | &quot;l3&quot;
STORAGE | &quot;storage&quot;
MIGRATING | &quot;migrating&quot;



