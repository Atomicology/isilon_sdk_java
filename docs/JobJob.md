
# JobJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policy** | **String** | Impact policy of this job instance. |  [optional]
**priority** | **Integer** | Priority of this job instance; lower numbers preempt higher numbers. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Desired new state of this job instance. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
RUN | &quot;run&quot;
PAUSE | &quot;pause&quot;
CANCEL | &quot;cancel&quot;



