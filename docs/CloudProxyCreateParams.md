
# CloudProxyCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | A host name or network address for connecting to this proxy | 
**name** | **String** | A unique friendly name for this proxy configuration | 
**password** | **String** | The password to connect to this proxy if required (write-only) |  [optional]
**port** | **Integer** | The port used to connect to this proxy | 
**type** | [**TypeEnum**](#TypeEnum) | The type of connection used to connect to this proxy | 
**username** | **String** | The username to connect to this proxy if required |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SOCKS_4 | &quot;socks_4&quot;
SOCKS_5 | &quot;socks_5&quot;
HTTP | &quot;http&quot;



