
# SettingsGlobalGlobalSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allocRetries** | **Integer** | Specifies the number of times to retry an ID allocation before failing. |  [optional]
**gidRangeEnabled** | **Boolean** | If true, allocates GIDs from a fixed range. |  [optional]
**gidRangeMax** | **Integer** | Specifies the ending number for a fixed range from which GIDs are allocated. |  [optional]
**gidRangeMin** | **Integer** | Specifies the starting number for a fixed range from which GIDs are allocated. |  [optional]
**gidRangeNext** | **Integer** | Specifies the next GID to allocate. |  [optional]
**groupUid** | **Integer** | Specifies the user iD for a group when requested by the kernel. |  [optional]
**loadProviders** | [**List&lt;LoadProvidersEnum&gt;**](#List&lt;LoadProvidersEnum&gt;) | Specifies which providers are loaded by the authentication daemon (lsassd). |  [optional]
**minMappedRid** | **Integer** | Starts the RID in the local domain to map a UID and a GID. |  [optional]
**nullGid** | **Integer** | Specifies an alternative GID when the kernel is unable to retrieve a GID for a persona. |  [optional]
**nullUid** | **Integer** | Specifies an alternative UID when the kernel is unable to retrieve a UID for a persona. |  [optional]
**onDiskIdentity** | **String** | Specifies the type of identity that is stored on disk. |  [optional]
**rpcBlockTime** | **Integer** | Specifies the minimum amount of time in milliseconds to wait before performing an oprestart. |  [optional]
**rpcMaxRequests** | **Integer** | Specifies the maximum number of outstanding RPC requests. |  [optional]
**rpcTimeout** | **Integer** | Specifies the maximum amount of time in seconds to wait for an idmap response. |  [optional]
**sendNtlmv2** | **Boolean** | If true, sends NTLMv2 responses. |  [optional]
**spaceReplacement** | **String** | Specifies the space replacement character. |  [optional]
**systemGidThreshold** | **Integer** | Specifies the minimum GID to attempt to look up in the idmap database. |  [optional]
**systemUidThreshold** | **Integer** | Specifies the minimum UID to attempt to look up in the idmap database. |  [optional]
**uidRangeEnabled** | **Boolean** | If true, allocates UIDs from a fixed range. |  [optional]
**uidRangeMax** | **Integer** | Specifies the ending number for a fixed range from which UIDs are allocated. |  [optional]
**uidRangeMin** | **Integer** | Specifies the starting number for a fixed range from which UIDs are allocated. |  [optional]
**uidRangeNext** | **Integer** | Specifies the next UID to allocate. |  [optional]
**unknownGid** | **Integer** | Specifies the GID for the unknown (anonymous) group. |  [optional]
**unknownUid** | **Integer** | Specifies the UID for the unknown (anonymous) user. |  [optional]
**userObjectCacheSize** | **Integer** | Specifies the maximum size (in bytes) of the security object cache in the authentication daemon. |  [optional]
**workgroup** | **String** | Specifies the NetBIOS workgroup or domain. |  [optional]


<a name="List<LoadProvidersEnum>"></a>
## Enum: List&lt;LoadProvidersEnum&gt;
Name | Value
---- | -----
ACTIVEDIRECTORY | &quot;ActiveDirectory&quot;
LOCAL | &quot;Local&quot;
NSS | &quot;Nss&quot;
FILE | &quot;File&quot;
NIS | &quot;Nis&quot;
LDAP | &quot;Ldap&quot;
KRB5 | &quot;Krb5&quot;



