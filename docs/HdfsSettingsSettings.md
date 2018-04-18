
# HdfsSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ambariMetricsCollector** | **String** | Ambari metrics collector |  [optional]
**ambariNamenode** | **String** | NameNode of Ambari server |  [optional]
**ambariServer** | **String** | Ambari server |  [optional]
**authenticationMode** | [**AuthenticationModeEnum**](#AuthenticationModeEnum) | Type of authentication for HDFS protocol. |  [optional]
**dataTransferCipher** | [**DataTransferCipherEnum**](#DataTransferCipherEnum) | Encryption algorithm to use for data transfer (if any) |  [optional]
**defaultBlockSize** | **Integer** | Block size (size&#x3D;2**value) reported by HDFS server. |  [optional]
**defaultChecksumType** | [**DefaultChecksumTypeEnum**](#DefaultChecksumTypeEnum) | Checksum type reported by HDFS server. |  [optional]
**odpVersion** | **String** | ODP stack repository version number |  [optional]
**rootDirectory** | **String** | HDFS root directory |  [optional]
**service** | **Boolean** | Enable or disable the HDFS service. |  [optional]
**webhdfsEnabled** | **Boolean** | Enable or disable WebHDFS |  [optional]


<a name="AuthenticationModeEnum"></a>
## Enum: AuthenticationModeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
SIMPLE_ONLY | &quot;simple_only&quot;
KERBEROS_ONLY | &quot;kerberos_only&quot;


<a name="DataTransferCipherEnum"></a>
## Enum: DataTransferCipherEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
AES_128_CTR | &quot;aes_128_ctr&quot;
AES_192_CTR | &quot;aes_192_ctr&quot;
AES_256_CTR | &quot;aes_256_ctr&quot;


<a name="DefaultChecksumTypeEnum"></a>
## Enum: DefaultChecksumTypeEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
CRC32 | &quot;crc32&quot;
CRC32C | &quot;crc32c&quot;



