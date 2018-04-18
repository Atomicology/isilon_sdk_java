
# SyncJobCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | The action to be taken by this job. |  [optional]
**id** | **String** | The ID or Name of the policy | 
**logLevel** | [**LogLevelEnum**](#LogLevelEnum) | Only valid for allow_write, and allow_write_revert; specify the desired logging level, will be stored in the logs for isi_migrate, defaults to &#39;info&#39;. |  [optional]
**sourceSnapshot** | **String** | An optional snapshot to copy/sync from. |  [optional]
**workersPerNode** | **Integer** | Only valid for allow_write, and allow_write_revert; specify the desired workers per node, defaults to 3. |  [optional]


<a name="ActionEnum"></a>
## Enum: ActionEnum
Name | Value
---- | -----
RESYNC_PREP | &quot;resync_prep&quot;
ALLOW_WRITE | &quot;allow_write&quot;
ALLOW_WRITE_REVERT | &quot;allow_write_revert&quot;
TEST | &quot;test&quot;


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



