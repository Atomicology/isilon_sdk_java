
# CloudJobExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**completionTime** | **Integer** | The time at which the job was completed (if applicable) |  [optional]
**createTime** | **Integer** | The time at which the job was created |  [optional]
**description** | **String** | A brief description of the job contents |  [optional]
**effectiveState** | [**EffectiveStateEnum**](#EffectiveStateEnum) | The effective state of the job (e.g,. the combination of operation_state and job_state) |  [optional]
**files** | [**CloudJobFiles**](CloudJobFiles.md) | The files and filters addressed by this job |  [optional]
**id** | **Integer** | The job&#39;s ID |  [optional]
**jobEngineJob** | [**CloudJobJobEngineJob**](CloudJobJobEngineJob.md) | Information about the related job engine job if there is one |  [optional]
**jobState** | [**JobStateEnum**](#JobStateEnum) | The current state of the job |  [optional]
**operationState** | [**OperationStateEnum**](#OperationStateEnum) | The current state of the operation associated with the job |  [optional]
**stateChangeTime** | **Integer** | The last time at which the job state changed |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of cloud action to be performed by this job. |  [optional]


<a name="EffectiveStateEnum"></a>
## Enum: EffectiveStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PAUSED | &quot;paused&quot;
CANCELED | &quot;canceled&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;


<a name="JobStateEnum"></a>
## Enum: JobStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PAUSED | &quot;paused&quot;
CANCELED | &quot;canceled&quot;
COMPLETED | &quot;completed&quot;
FAILED | &quot;failed&quot;


<a name="OperationStateEnum"></a>
## Enum: OperationStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PAUSED | &quot;paused&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ARCHIVE | &quot;archive&quot;
RECALL | &quot;recall&quot;
LOCAL_GARBAGE_COLLECTION | &quot;local-garbage-collection&quot;
CLOUD_GARBAGE_COLLECTION | &quot;cloud-garbage-collection&quot;
CACHE_WRITEBACK | &quot;cache-writeback&quot;
CACHE_ON_ACCESS | &quot;cache-on-access&quot;
CACHE_INVALIDATION | &quot;cache-invalidation&quot;
RESTORE_COI | &quot;restore-coi&quot;



