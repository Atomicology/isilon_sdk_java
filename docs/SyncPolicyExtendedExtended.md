
# SyncPolicyExtendedExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleratedFailback** | **Boolean** | If set to true, SyncIQ will perform failback configuration tasks during the next job run, rather than waiting to perform those tasks during the failback process. Performing these tasks ahead of time will increase the speed of failback operations. |  [optional]
**action** | [**ActionEnum**](#ActionEnum) | If &#39;copy&#39;, source files will be copied to the target cluster.  If &#39;sync&#39;, the target directory will be made an image of the source directory:  Files and directories that have been deleted on the source, have been moved within the target directory, or no longer match the selection criteria will be deleted from the target directory. |  [optional]
**burstMode** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Enable/disable UDP-based data transfer. |  [optional]
**changelist** | **Boolean** | If true, retain previous source snapshot and incremental repstate, both of which are required for changelist creation. |  [optional]
**checkIntegrity** | **Boolean** | If true, the sync target performs cyclic redundancy checks (CRC) on the data as it is received. |  [optional]
**cloudDeepCopy** | [**CloudDeepCopyEnum**](#CloudDeepCopyEnum) | If set to deny, replicates all CloudPools smartlinks to the target cluster as smartlinks; if the target cluster does not support the smartlinks, the job will fail. If set to force, replicates all smartlinks to the target cluster as regular files. If set to allow, SyncIQ will attempt to replicate smartlinks to the target cluster as smartlinks; if the target cluster does not support the smartlinks, SyncIQ will replicate the smartlinks as regular files. |  [optional]
**conflicted** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  If true, the most recent run of this policy encountered an error and this policy will not start any more scheduled jobs until this field is manually set back to &#39;false&#39;. |  [optional]
**description** | **String** | User-assigned description of this sync policy. |  [optional]
**disableFileSplit** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  If true, the 7.2+ file splitting capability will be disabled. |  [optional]
**disableFofb** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Enable/disable sync failover/failback. |  [optional]
**disableStf** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Enable/disable the 6.5+ STF based data transfer and uses only treewalk. |  [optional]
**enabled** | **Boolean** | If true, jobs will be automatically run based on this policy, according to its schedule. | 
**expectedDataloss** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Continue sending files even with the corrupted filesystem. |  [optional]
**fileMatchingPattern** | [**SyncJobPolicyFileMatchingPattern**](SyncJobPolicyFileMatchingPattern.md) | A file matching pattern, organized as an OR&#39;ed set of AND&#39;ed file criteria, for example ((a AND b) OR (x AND y)) used to define a set of files with specific properties.  Policies of type &#39;sync&#39; cannot use &#39;path&#39; or time criteria in their matching patterns, but policies of type &#39;copy&#39; can use all listed criteria. |  [optional]
**forceInterface** | **Boolean** | NOTE: This field should not be changed without the help of Isilon support.  Determines whether data is sent only through the subnet and pool specified in the \&quot;source_network\&quot; field. This option can be useful if there are multiple interfaces for the given source subnet.  If you enable this option, the net.inet.ip.choose_ifa_by_ipsrc sysctl should be set. |  [optional]
**hasSyncState** | **Boolean** | This field is false if the policy is in its initial sync state and true otherwise.  Setting this field to false will reset the policy&#39;s sync state. |  [optional]
**id** | **String** | The system ID given to this sync policy. | 
**jobDelay** | **Integer** | If --schedule is set to When-Source-Modified, the duration to wait after a modification is made before starting a job (default is 0 seconds). |  [optional]
**lastJobState** | **String** | This is the state of the most recent job for this policy. |  [optional]
**lastStarted** | **Integer** | The most recent time a job was started for this policy.  Value is null if the policy has never been run. |  [optional]
**lastSuccess** | **Integer** | Timestamp of last known successfully completed synchronization.  Value is null if the policy has never completed successfully. |  [optional]
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Severity an event must reach before it is logged. |  [optional]
**logRemovedFiles** | **Boolean** | If true, the system will log any files or directories that are deleted due to a sync. |  [optional]
**name** | **String** | User-assigned name of this sync policy. | 
**nextRun** | **Integer** | This is the next time a job is scheduled to run for this policy in Unix epoch seconds.  This field is null if the job is not scheduled. |  [optional]
**passwordSet** | **Boolean** | Indicates if a password is set for accessing the target cluster. Password value is not shown with GET. |  [optional]
**priority** | **Integer** | Determines the priority level of a policy. Policies with higher priority will have precedence to run over lower priority policies. Valid range is [0, 1]. Default is 0. |  [optional]
**reportMaxAge** | **Integer** | Length of time (in seconds) a policy report will be stored. |  [optional]
**reportMaxCount** | **Integer** | Maximum number of policy reports that will be stored on the system. |  [optional]
**restrictTargetNetwork** | **Boolean** | If you specify true, and you specify a SmartConnect zone in the \&quot;target_host\&quot; field, replication policies will connect only to nodes in the specified SmartConnect zone.  If you specify false, replication policies are not restricted to specific nodes on the target cluster. |  [optional]
**rpoAlert** | **Integer** | If --schedule is set to a time/date, an alert is created if the specified RPO for this policy is exceeded. The default value is 0, which will not generate RPO alerts. |  [optional]
**schedule** | **String** | The schedule on which new jobs will be run for this policy. | 
**skipLookup** | **Boolean** | Skip DNS lookup of target IPs. |  [optional]
**skipWhenSourceUnmodified** | **Boolean** | If true and --schedule is set to a time/date, the policy will not run if no changes have been made to the contents of the source directory since the last job successfully completed. |  [optional]
**snapshotSyncExisting** | **Boolean** | If true, snapshot-triggered syncs will include snapshots taken before policy creation time (requires --schedule when-snapshot-taken). |  [optional]
**snapshotSyncPattern** | **String** | The naming pattern that a snapshot must match to trigger a sync when the schedule is when-snapshot-taken (default is \&quot;*\&quot;). |  [optional]
**sourceExcludeDirectories** | **List&lt;String&gt;** | Directories that will be excluded from the sync.  Modifying this field will result in a full synchronization of all data. |  [optional]
**sourceIncludeDirectories** | **List&lt;String&gt;** | Directories that will be included in the sync.  Modifying this field will result in a full synchronization of all data. |  [optional]
**sourceNetwork** | [**SyncPolicySourceNetwork**](SyncPolicySourceNetwork.md) | Restricts replication policies on the local cluster to running on the specified subnet and pool. |  [optional]
**sourceRootPath** | **String** | The root directory on the source cluster the files will be synced from.  Modifying this field will result in a full synchronization of all data. | 
**sourceSnapshotArchive** | **Boolean** | If true, archival snapshots of the source data will be taken on the source cluster before a sync. |  [optional]
**sourceSnapshotExpiration** | **Integer** | The length of time in seconds to keep snapshots on the source cluster. |  [optional]
**sourceSnapshotPattern** | **String** | The name pattern for snapshots taken on the source cluster before a sync. |  [optional]
**targetCompareInitialSync** | **Boolean** | If true, the target creates diffs against the original sync. |  [optional]
**targetDetectModifications** | **Boolean** | If true, target cluster will detect if files have been changed on the target by legacy tree walk syncs. |  [optional]
**targetHost** | **String** | Hostname or IP address of sync target cluster.  Modifying the target cluster host can result in the policy being unrunnable if the new target does not match the current target association. | 
**targetPath** | **String** | Absolute filesystem path on the target cluster for the sync destination. | 
**targetSnapshotAlias** | **String** | The alias of the snapshot taken on the target cluster after the sync completes. A value of @DEFAULT will reset this field to the default creation value. |  [optional]
**targetSnapshotArchive** | **Boolean** | If true, archival snapshots of the target data will be taken on the target cluster after successful sync completions. |  [optional]
**targetSnapshotExpiration** | **Integer** | The length of time in seconds to keep snapshots on the target cluster. |  [optional]
**targetSnapshotPattern** | **String** | The name pattern for snapshots taken on the target cluster after the sync completes.  A value of @DEFAULT will reset this field to the default creation value. |  [optional]
**workersPerNode** | **Integer** | The number of worker threads on a node performing a sync. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
COPY | &quot;copy&quot;
SYNC | &quot;sync&quot;


<a name="CloudDeepCopyEnum"></a>
## Enum: CloudDeepCopyEnum
Name | Value
---- | -----
DENY | &quot;deny&quot;
ALLOW | &quot;allow&quot;
FORCE | &quot;force&quot;


<a name="LogLevelEnum"></a>
## Enum: LogLevelEnum
Name | Value
---- | -----
FATAL | &quot;fatal&quot;
ERROR | &quot;error&quot;
NOTICE | &quot;notice&quot;
INFO | &quot;info&quot;
COPY | &quot;copy&quot;
DEBUG | &quot;debug&quot;
TRACE | &quot;trace&quot;



