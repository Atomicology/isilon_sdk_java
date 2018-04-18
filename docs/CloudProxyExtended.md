
# CloudProxyExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**host** | **String** | A host name or network address for connecting to this proxy |  [optional]
**name** | **String** | A unique friendly name for this proxy configuration |  [optional]
**password** | **String** | The password to connect to this proxy if required (write-only) |  [optional]
**port** | **Integer** | The port used to connect to this proxy |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of connection used to connect to this proxy |  [optional]
**username** | **String** | The username to connect to this proxy if required |  [optional]
**id** | **String** | A globally unique ID (guid) or the name of this proxy (read-only) |  [optional]
**passwordIsSet** | **Boolean** | Indicates whether a password has been set for this proxy |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SOCKS_4 | &quot;socks_4&quot;
SOCKS_5 | &quot;socks_5&quot;
HTTP | &quot;http&quot;



