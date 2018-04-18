
# SyncSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**burstMemoryConstraint** | **Integer** | The per-worker burst socket memory constraint, in bytes. |  [optional]
**burstSocketBufferSize** | **Integer** | The per-worker burst socket buffer coalesced data, in bytes. |  [optional]
**forceInterface** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Default for the \&quot;force_interface\&quot; property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  Determines whether data is sent only through the subnet and pool specified in the \&quot;source_network\&quot; field. This option can be useful if there are multiple interfaces for the given source subnet. |  [optional]
**maxConcurrentJobs** | **Integer** | The max concurrent jobs that SyncIQ can support. This number is based on the size of the current cluster and the current SyncIQ worker throttle rule. |  [optional]
**reportEmail** | **List&lt;String&gt;** | Email sync reports to these addresses. |  [optional]
**reportMaxAge** | **Integer** | The default length of time (in seconds) a policy report will be stored. |  [optional]
**reportMaxCount** | **Integer** | The default maximum number of reports to retain for a policy. |  [optional]
**restrictTargetNetwork** | **Boolean** | Default for the \&quot;restrict_target_network\&quot; property that will be applied to each new sync policy unless otherwise specified at the time of policy creation.  If you specify true, and you specify a SmartConnect zone in the \&quot;target_host\&quot; field, replication policies will connect only to nodes in the specified SmartConnect zone.  If you specify false, replication policies are not restricted to specific nodes on the target cluster. |  [optional]
**rpoAlerts** | **Boolean** | If disabled, no RPO alerts will be generated. |  [optional]
**service** | [**ServiceEnum**](#ServiceEnum) | Specifies if the SyncIQ service currently on, paused, or off.  If paused, all sync jobs will be paused.  If turned off, all jobs will be canceled. |  [optional]
**sourceNetwork** | [**SyncPolicySourceNetwork**](SyncPolicySourceNetwork.md) | Restricts replication policies on the local cluster to running on the specified subnet and pool. |  [optional]
**twChkptInterval** | **Integer** | The interval (in seconds) in which treewalk syncs are forced to checkpoint. |  [optional]


<a name="ServiceEnum"></a>
## Enum: ServiceEnum
Name | Value
---- | -----
ON | &quot;on&quot;
OFF | &quot;off&quot;
PAUSED | &quot;paused&quot;



