
# ProvidersSummaryProviderInstance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**activeServer** | **String** |  |  [optional]
**clientSite** | **String** |  |  [optional]
**connections** | [**List&lt;ProvidersSummaryProviderInstanceConnection&gt;**](ProvidersSummaryProviderInstanceConnection.md) |  |  [optional]
**dcSite** | **String** |  |  [optional]
**forest** | **String** |  |  [optional]
**groupnet** | **String** |  |  [optional]
**id** | **String** | Specifies the ID of the provider. |  [optional]
**name** | **String** | Specifies the name of the provider. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | Indicates the status of the provider. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Specifies the type of provider. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
OFFLINE | &quot;offline&quot;
ACTIVE | &quot;active&quot;
ONLINE | &quot;online&quot;
INITIALIZING | &quot;initializing&quot;
JOINING | &quot;joining&quot;
DISABLED | &quot;disabled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FILE | &quot;file&quot;
LDAP | &quot;ldap&quot;
LOCAL | &quot;local&quot;
NIS | &quot;nis&quot;
ADS | &quot;ads&quot;
KRB5 | &quot;krb5&quot;
UNKNOWN | &quot;unknown&quot;



