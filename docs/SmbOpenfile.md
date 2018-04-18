
# SmbOpenfile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | **String** | Path of file within /ifs. | 
**id** | **Integer** | The file ID. | 
**locks** | **Integer** | Number of locks user holds on file. | 
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | The user&#39;s permissions on file. | 
**user** | **String** | User holding file open. | 


<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;
CREATE | &quot;create&quot;



