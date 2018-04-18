
# JobJobExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**controlState** | [**ControlStateEnum**](#ControlStateEnum) | State to which the job is transitioning; if control_state is identical to state, the job&#39;s state is stable. |  [optional]
**createTime** | **Integer** | The time the job was queued, in seconds since the epoch. | 
**currentPhase** | **Integer** | The current phase of the job. |  [optional]
**description** | **String** | A text representation of the job. |  [optional]
**endTime** | **Integer** | The time the job ended, in seconds since the Epoch. |  [optional]
**id** | **Integer** | The ID of the job. | 
**impact** | [**ImpactEnum**](#ImpactEnum) | The current impact of the job. | 
**participants** | **List&lt;Integer&gt;** | The set of devids working on the job. |  [optional]
**paths** | **List&lt;String&gt;** | Paths for which the job was queued. |  [optional]
**policy** | **String** | Current impact policy of the job. | 
**priority** | **Integer** | Current priority of the job; lower numbers preempt higher numbers. | 
**progress** | **String** | A text representation of the job&#39;s progress. |  [optional]
**retriesRemaining** | **Integer** | The number of retries remaining if the job fails. | 
**runningTime** | **Integer** | The number of seconds the job has executed. |  [optional]
**startTime** | **Integer** | The time the job started, in seconds since the Epoch. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Current state of the job. | 
**totalPhases** | **Integer** | The total number of phases of the job type. | 
**type** | **String** | The job type. | 
**waitingOn** | **Integer** | The ID of a job for which this job is waiting. |  [optional]
**waitingReason** | [**WaitingReasonEnum**](#WaitingReasonEnum) | The reason the job is waiting. |  [optional]


<a name="ControlStateEnum"></a>
## Enum: ControlStateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PAUSED_USER | &quot;paused_user&quot;
PAUSED_SYSTEM | &quot;paused_system&quot;
PAUSED_POLICY | &quot;paused_policy&quot;
PAUSED_PRIORITY | &quot;paused_priority&quot;
CANCELLED_USER | &quot;cancelled_user&quot;
CANCELLED_SYSTEM | &quot;cancelled_system&quot;
FAILED | &quot;failed&quot;
SUCCEEDED | &quot;succeeded&quot;
UNKNOWN | &quot;unknown&quot;


<a name="ImpactEnum"></a>
## Enum: ImpactEnum
Name | Value
---- | -----
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;
PAUSED | &quot;Paused&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUNNING | &quot;running&quot;
PAUSED_USER | &quot;paused_user&quot;
PAUSED_SYSTEM | &quot;paused_system&quot;
PAUSED_POLICY | &quot;paused_policy&quot;
PAUSED_PRIORITY | &quot;paused_priority&quot;
CANCELLED_USER | &quot;cancelled_user&quot;
CANCELLED_SYSTEM | &quot;cancelled_system&quot;
FAILED | &quot;failed&quot;
SUCCEEDED | &quot;succeeded&quot;
UNKNOWN | &quot;unknown&quot;


<a name="WaitingReasonEnum"></a>
## Enum: WaitingReasonEnum
Name | Value
---- | -----
PRIORITY | &quot;blocked_by_priority&quot;



