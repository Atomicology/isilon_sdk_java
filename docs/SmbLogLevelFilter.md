
# SmbLogLevelFilter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ipAddrs** | **List&lt;String&gt;** | Array of client IP addresses to filter against. |  [optional]
**level** | [**LevelEnum**](#LevelEnum) | Logging level of the filter. | 
**ops** | [**List&lt;OpsEnum&gt;**](#List&lt;OpsEnum&gt;) | Array of SMB operations to filter against. |  [optional]


<a name="LevelEnum"></a>
## Enum: LevelEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
ERROR | &quot;error&quot;
WARNING | &quot;warning&quot;
INFO | &quot;info&quot;
VERBOSE | &quot;verbose&quot;
DEBUG | &quot;debug&quot;
TRACE | &quot;trace&quot;


<a name="List<OpsEnum>"></a>
## Enum: List&lt;OpsEnum&gt;
Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;
SESSION_SETUP | &quot;session-setup&quot;
LOGOFF | &quot;logoff&quot;
FLUSH | &quot;flush&quot;
NOTIFY | &quot;notify&quot;
TREE_CONNECT | &quot;tree-connect&quot;
TREE_DISCONNECT | &quot;tree-disconnect&quot;
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
OPLOCK | &quot;oplock&quot;
LOCKING | &quot;locking&quot;
SET_INFO | &quot;set-info&quot;
QUERY | &quot;query&quot;
CLOSE | &quot;close&quot;
CREATE_DIRECTORY | &quot;create-directory&quot;
DELETE_DIRECTORY | &quot;delete-directory&quot;



