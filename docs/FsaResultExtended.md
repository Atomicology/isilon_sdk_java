
# FsaResultExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pinned** | **Boolean** | True if the result is pinned to prevent automatic removal. | 
**beginTime** | **Integer** | Unix Epoch time of start of results collection job. | 
**contentPath** | **String** | Path to results database. |  [optional]
**deleteLink** | **String** | Resource to call with DELETE to remove results.. |  [optional]
**endTime** | **Integer** | Unix Epoch time of end of results collection job. | 
**fsaState** | [**FsaStateEnum**](#FsaStateEnum) | State of the result set. | 
**id** | **Integer** | The system generated result set ID. | 
**jobState** | **List&lt;String&gt;** | State information about the FSA Job. | 
**propertiesLink** | **String** | Resource to call to get result properties. | 
**size** | **Integer** | Size of the result set database in bytes. | 
**version** | **Integer** | FSA version used to create result set. | 


<a name="FsaStateEnum"></a>
## Enum: FsaStateEnum
Name | Value
---- | -----
UNKNOWN | &quot;unknown&quot;
WORK | &quot;work&quot;
REDUCE | &quot;reduce&quot;
PUBLISH | &quot;publish&quot;



