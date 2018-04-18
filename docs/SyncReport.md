
# SyncReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **String** | The action to be taken by this job. | 
**adsStreamsReplicated** | **Integer** | The number of ads streams replicated by this job. | 
**blockSpecsReplicated** | **Integer** | The number of block specs replicated by this job. | 
**bytesRecoverable** | **Integer** | The number of bytes recoverable by this job. | 
**bytesTransferred** | **Integer** | The number of bytes that have been transferred by this job. | 
**charSpecsReplicated** | **Integer** | The number of char specs replicated by this job. | 
**correctedLins** | **Integer** | The number of LINs corrected by this job. | 
**deadNode** | **Boolean** | This field is true if the node running this job is dead. | 
**directoriesReplicated** | **Integer** | The number of directories replicated. | 
**dirsChanged** | **Integer** | The number of directories changed by this job. | 
**dirsDeleted** | **Integer** | The number of directories deleted by this job. | 
**dirsMoved** | **Integer** | The number of directories moved by this job. | 
**dirsNew** | **Integer** | The number of directories created by this job. | 
**duration** | **Integer** | The amount of time in seconds between when the job was started and when it ended.  If the job has not yet ended, this is the amount of time since the job started.  This field is null if the job has not yet started. |  [optional]
**endTime** | **Integer** | The time the job ended in unix epoch seconds. The field is null if the job hasn&#39;t ended. |  [optional]
**error** | **String** | The primary error message for this job. | 
**errorChecksumFilesSkipped** | **Integer** | The number of files with checksum errors skipped by this job. | 
**errorIoFilesSkipped** | **Integer** | The number of files with io errors skipped by this job. | 
**errorNetFilesSkipped** | **Integer** | The number of files with network errors skipped by this job. | 
**errors** | **List&lt;String&gt;** | A list of error messages for this job. | 
**failedChunks** | **Integer** | Tyhe number of data chunks that failed transmission. | 
**fifosReplicated** | **Integer** | The number of fifos replicated by this job. | 
**fileDataBytes** | **Integer** | The number of bytes transferred that belong to files. | 
**filesChanged** | **Integer** | The number of files changed by this job. | 
**filesLinked** | **Integer** | The number of files linked by this job. | 
**filesNew** | **Integer** | The number of files created by this job. | 
**filesSelected** | **Integer** | The number of files selected by this job. | 
**filesTransferred** | **Integer** | The number of files transferred by this job. | 
**filesUnlinked** | **Integer** | The number of files unlinked by this job. | 
**filesWithAdsReplicated** | **Integer** | The number of files with ads replicated by this job. | 
**flippedLins** | **Integer** | The number of LINs flipped by this job. | 
**hardLinksReplicated** | **Integer** | The number of hard links replicated by this job. | 
**hashExceptionsFixed** | **Integer** | The number of hash exceptions fixed by this job. | 
**hashExceptionsFound** | **Integer** | The number of hash exceptions found by this job. | 
**id** | **String** | A unique identifier for this object. | 
**jobId** | **Integer** | The ID of the job. |  [optional]
**linsTotal** | **Integer** | The number of LINs transferred by this job. | 
**networkBytesToSource** | **Integer** | The total number of bytes sent to the source by this job. | 
**networkBytesToTarget** | **Integer** | The total number of bytes sent to the target by this job. | 
**newFilesReplicated** | **Integer** | The number of new files replicated by this job. | 
**numRetransmittedFiles** | **Integer** | The number of files that have been retransmitted by this job. | 
**phases** | [**List&lt;SyncJobPhase&gt;**](SyncJobPhase.md) | Data for each phase of this job. | 
**policy** | [**SyncReportPolicy**](SyncReportPolicy.md) |  | 
**policyAction** | [**PolicyActionEnum**](#PolicyActionEnum) | This is the action the policy is configured to perform. | 
**policyId** | **String** | The ID of the policy. | 
**policyName** | **String** | The name of the policy. | 
**regularFilesReplicated** | **Integer** | The number of regular files replicated by this job. | 
**resyncedLins** | **Integer** | The number of LINs resynched by this job. | 
**retransmittedFiles** | **List&lt;String&gt;** | The files that have been retransmitted by this job. | 
**retry** | **Integer** | The number of times the job has been retried. | 
**runningChunks** | **Integer** | The number of data chunks currently being transmitted. | 
**socketsReplicated** | **Integer** | The number of sockets replicated by this job. | 
**sourceBytesRecovered** | **Integer** | The number of bytes recovered on the source. | 
**sourceDirectoriesCreated** | **Integer** | The number of directories created on the source. | 
**sourceDirectoriesDeleted** | **Integer** | The number of directories deleted on the source. | 
**sourceDirectoriesLinked** | **Integer** | The number of directories linked on the source. | 
**sourceDirectoriesUnlinked** | **Integer** | The number of directories unlinked on the source. | 
**sourceDirectoriesVisited** | **Integer** | The number of directories visited on the source. | 
**sourceFilesDeleted** | **Integer** | The number of files deleted on the source. | 
**sourceFilesLinked** | **Integer** | The number of files linked on the source. | 
**sourceFilesUnlinked** | **Integer** | The number of files unlinked on the source. | 
**sparseDataBytes** | **Integer** | The number of sparse data bytes transferred by this job. | 
**startTime** | **Integer** | The time the job started in unix epoch seconds. The field is null if the job hasn&#39;t started. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the job. | 
**subreportCount** | **Integer** | The number of subreports that are available for this job report. | 
**succeededChunks** | **Integer** | The number of data chunks that have been transmitted successfully. | 
**symlinksReplicated** | **Integer** | The number of symlinks replicated by this job. | 
**syncType** | [**SyncTypeEnum**](#SyncTypeEnum) | The type of sync being performed by this job. | 
**targetBytesRecovered** | **Integer** | The number of bytes recovered on the target. | 
**targetDirectoriesCreated** | **Integer** | The number of directories created on the target. | 
**targetDirectoriesDeleted** | **Integer** | The number of directories deleted on the target. | 
**targetDirectoriesLinked** | **Integer** | The number of directories linked on the target. | 
**targetDirectoriesUnlinked** | **Integer** | The number of directories unlinked on the target. | 
**targetFilesDeleted** | **Integer** | The number of files deleted on the target. | 
**targetFilesLinked** | **Integer** | The number of files linked on the target. | 
**targetFilesUnlinked** | **Integer** | The number of files unlinked on the target. | 
**targetSnapshots** | **List&lt;String&gt;** | The target snapshots created by this job. | 
**totalChunks** | **Integer** | The total number of data chunks transmitted by this job. | 
**totalDataBytes** | **Integer** | The total number of bytes transferred by this job. | 
**totalFiles** | **Integer** | The number of files affected by this job. | 
**totalNetworkBytes** | **Integer** | The total number of bytes sent over the network by this job. | 
**totalPhases** | **Integer** | The total number of phases for this job. | 
**unchangedDataBytes** | **Integer** | The number of bytes unchanged by this job. | 
**upToDateFilesSkipped** | **Integer** | The number of up-to-date files skipped by this job. | 
**updatedFilesReplicated** | **Integer** | The number of updated files replicated by this job. | 
**userConflictFilesSkipped** | **Integer** | The number of files with user conflicts skipped by this job. | 
**warnings** | **List&lt;String&gt;** | A list of warning messages for this job. | 
**wormCommittedFileConflicts** | **Integer** | The number of WORM committed files which needed to be reverted. Since WORM committed files cannot be reverted, this is the number of files that were preserved in the compliance store. | 


<a name="PolicyActionEnum"></a>
## Enum: PolicyActionEnum
Name | Value
---- | -----
COPY | &quot;copy&quot;
SYNC | &quot;sync&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
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


<a name="SyncTypeEnum"></a>
## Enum: SyncTypeEnum
Name | Value
---- | -----
INVALID | &quot;invalid&quot;
LEGACY | &quot;legacy&quot;
INITIAL | &quot;initial&quot;
INCREMENTAL | &quot;incremental&quot;
UPGRADE | &quot;upgrade&quot;
FOFB | &quot;fofb&quot;
DOMAINMARK | &quot;domainmark&quot;



