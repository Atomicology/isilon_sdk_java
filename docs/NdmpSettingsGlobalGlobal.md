
# NdmpSettingsGlobalGlobal

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**breMaxNumContexts** | **Integer** | Maximum number of BRE contexts. |  [optional]
**dma** | [**DmaEnum**](#DmaEnum) | A unique identifier for the dma vendor. |  [optional]
**msbContextRetentionDuration** | **Integer** | Multi-Stream Backup context retention duration. |  [optional]
**msrContextRetentionDuration** | **Integer** | Multi-Stream Restore context retention duration. |  [optional]
**port** | **Integer** | The port to listen on. |  [optional]
**service** | **Boolean** | Property to enable/diable the NDMP service. |  [optional]


<a name="DmaEnum"></a>
## Enum: DmaEnum
Name | Value
---- | -----
GENERIC | &quot;generic&quot;
ATEMPO | &quot;atempo&quot;
BAKBONE | &quot;bakbone&quot;
COMMVAULT | &quot;commvault&quot;
EMC | &quot;emc&quot;
SYMANTEC | &quot;symantec&quot;
TIVOLI | &quot;tivoli&quot;
SYMANTEC_NETBACKUP | &quot;symantec-netbackup&quot;
SYMANTEC_BACKUPEXEC | &quot;symantec-backupexec&quot;



