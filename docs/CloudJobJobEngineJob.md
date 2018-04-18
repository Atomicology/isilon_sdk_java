
# CloudJobJobEngineJob

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Integer** | ID of the related job engine job |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the related job engine job |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
NULL | &quot;null&quot;
RUNNING | &quot;running&quot;
USER_PAUSED | &quot;user-paused&quot;
SYSTEM_PAUSED | &quot;system-paused&quot;
POLICY_PAUSED | &quot;policy-paused&quot;
WAITING | &quot;waiting&quot;
USER_CANCELED | &quot;user-canceled&quot;
SYSTEM_CANCELED | &quot;system-canceled&quot;
FAILED | &quot;failed&quot;
SUCCEEDED | &quot;succeeded&quot;



