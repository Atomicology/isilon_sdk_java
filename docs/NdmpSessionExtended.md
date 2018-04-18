
# NdmpSessionExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataBytesTransferred** | **Integer** | Bytes transferred to/from the filesystem | 
**dataState** | [**DataStateEnum**](#DataStateEnum) | State of the NDMP Data Service | 
**destPath** | **String** | The path being recovered to | 
**dmaIpAddr** | **String** | IP address of the DMA | 
**elapsedTime** | **Integer** | Number of seconds elapsed since the backup was started | 
**id** | **String** | Unique display ID. | 
**moverBytesTransferred** | **Integer** | Bytes transferred to/from tape or remote writer | 
**moverState** | [**MoverStateEnum**](#MoverStateEnum) | State of the NDMP Mover Service | 
**operation** | [**OperationEnum**](#OperationEnum) | The type of backup session | 
**remoteIpAddr** | **String** | IP address of the remote NDMP participant | 
**scsiDevice** | **String** | Name of the media changer device used if any | 
**session** | **String** | Session ID in form &lt;lnn&gt;.&lt;pid&gt;. | 
**sourcePath** | **String** | The path being backed up | 
**startTime** | **Integer** | Time backup was started in seconds since epoch | 
**tapeDevice** | **String** | Name of the tape device used if any | 
**tapeOpenMode** | [**TapeOpenModeEnum**](#TapeOpenModeEnum) | Describes the mode in which the tape is opened | 
**throughput** | **Integer** | The throughput in MB/s | 


<a name="DataStateEnum"></a>
## Enum: DataStateEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
LISTEN | &quot;LISTEN&quot;
ACTIVE | &quot;ACTIVE&quot;
CONNECTED | &quot;CONNECTED&quot;
HALTED | &quot;HALTED&quot;
INVALID | &quot;INVALID&quot;


<a name="MoverStateEnum"></a>
## Enum: MoverStateEnum
Name | Value
---- | -----
IDLE | &quot;IDLE&quot;
LISTEN | &quot;LISTEN&quot;
ACTIVE | &quot;ACTIVE&quot;
PAUSED | &quot;PAUSED&quot;
HALTED | &quot;HALTED&quot;
INVALID | &quot;INVALID&quot;


<a name="OperationEnum"></a>
## Enum: OperationEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
BACKUP | &quot;Backup&quot;
RECOVER | &quot;Recover&quot;
RECOVER_FILE_HISTORY | &quot;Recover file history&quot;


<a name="TapeOpenModeEnum"></a>
## Enum: TapeOpenModeEnum
Name | Value
---- | -----
READ | &quot;Read&quot;
READ_WRITE | &quot;Read/Write&quot;
RAW | &quot;Raw&quot;
INVALID | &quot;Invalid&quot;



