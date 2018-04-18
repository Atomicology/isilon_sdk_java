
# TargetPolicy

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**failoverFailbackState** | [**FailoverFailbackStateEnum**](#FailoverFailbackStateEnum) | The condition of this policy with respect to sync failover/failback. | 
**id** | **String** | The system ID given to this sync policy. | 
**lastJobState** | [**LastJobStateEnum**](#LastJobStateEnum) | The state of the last job run for this policy. | 
**lastSourceCoordinatorIp** | **String** | The IP address from which a SyncIQ coordinator daemon most recently connected to this cluster to update it about the progress of a job for this policy. | 
**lastUpdateFromSource** | **Integer** | The last time this cluster was updated with sync information from the source cluster for this policy, in unix epoch seconds.  Null if no such update has occurred yet. |  [optional]
**legacyPolicy** | **Boolean** | Was this policy defined by a OneFS version earlier than 6.0? (Pre-6.0 policies did not have the target policy concept and canceling from the target side will not be available.) | 
**name** | **String** | User-assigned name of this sync policy. | 
**sourceClusterGuid** | **String** | Unique identifier for the source cluster. | 
**sourceHost** | **String** | Hostname or IP address of sync source cluster. | 
**targetPath** | **String** | Absolute filesystem path on the target cluster for the sync destination. | 


<a name="FailoverFailbackStateEnum"></a>
## Enum: FailoverFailbackStateEnum
Name | Value
---- | -----
WRITES_DISABLED | &quot;writes_disabled&quot;
ENABLING_WRITES | &quot;enabling_writes&quot;
WRITES_ENABLED | &quot;writes_enabled&quot;
DISABLING_WRITES | &quot;disabling_writes&quot;
CREATING_RESYNC_POLICY | &quot;creating_resync_policy&quot;
RESYNC_POLICY_CREATED | &quot;resync_policy_created&quot;


<a name="LastJobStateEnum"></a>
## Enum: LastJobStateEnum
Name | Value
---- | -----
SCHEDULED | &quot;scheduled&quot;
RUNNING | &quot;running&quot;
PAUSED | &quot;paused&quot;
FINISHED | &quot;finished&quot;
FAILED | &quot;failed&quot;
CANCELED | &quot;canceled&quot;
NEEDS_ATTENTION | &quot;needs_attention&quot;
SKIPPED | &quot;skipped&quot;
PENDING | &quot;pending&quot;
UNKNOWN | &quot;unknown&quot;



