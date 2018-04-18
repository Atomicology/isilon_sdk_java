
# DiagnosticsGatherSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**esrs** | **Boolean** | Use ESRS for upload of gather. |  [optional]
**ftpUpload** | **Boolean** |  |  [optional]
**ftpUploadHost** | **String** | Alternate FTP host to upload to. |  [optional]
**ftpUploadMode** | **String** | FTP upload mode. |  [optional]
**ftpUploadPath** | **String** | Alternate FTP path to upload to. |  [optional]
**ftpUploadProxy** | **String** | FTP proxy to use for upload. |  [optional]
**ftpUploadProxyPort** | **Integer** | FTP proxy port to use for upload. |  [optional]
**ftpUploadUser** | **String** | FTP user for upload. |  [optional]
**gatherMode** | [**GatherModeEnum**](#GatherModeEnum) | Set gather to full or incremental. |  [optional]
**httpUpload** | **Boolean** | Whether or not to use HTTP upload on completed gather. |  [optional]
**httpUploadHost** | **String** | Alternate HTTP Host to upload to. |  [optional]
**httpUploadPath** | **String** | Alternate path to write gather to. |  [optional]
**httpUploadProxy** | **String** | Proxy to use for HTTP upload. |  [optional]
**httpUploadProxyPort** | **Integer** | Alternate port for proxy server |  [optional]
**upload** | **Boolean** | Upload gather to EMC. |  [optional]


<a name="GatherModeEnum"></a>
## Enum: GatherModeEnum
Name | Value
---- | -----
FULL | &quot;full&quot;
INCREMENTAL | &quot;incremental&quot;



