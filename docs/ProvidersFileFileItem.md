
# ProvidersFileFileItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication** | **Boolean** | Enables authentication and identity mapping through the authentication provider. |  [optional]
**createHomeDirectory** | **Boolean** | Automatically creates a home directory on the first login. |  [optional]
**enabled** | **Boolean** | Enables the file provider. |  [optional]
**enumerateGroups** | **Boolean** | Enables the provider to enumerate groups. |  [optional]
**enumerateUsers** | **Boolean** | Enables the provider to enumerate users. |  [optional]
**findableGroups** | **List&lt;String&gt;** | Specifies the list of groups that can be resolved. |  [optional]
**findableUsers** | **List&lt;String&gt;** | Specifies the list of users that can be resolved. |  [optional]
**groupDomain** | **String** | Specifies the domain for this provider through which domains are qualified. |  [optional]
**groupFile** | **String** | Specifies the location of the file that contains information about the group. |  [optional]
**homeDirectoryTemplate** | **String** | Specifies the path to the home directory template. |  [optional]
**id** | **String** | Specifies the file provider ID. |  [optional]
**listableGroups** | **List&lt;String&gt;** | Specifies the groups that can be viewed in the provider. |  [optional]
**listableUsers** | **List&lt;String&gt;** | Specifies the users that can be viewed in the provider. |  [optional]
**loginShell** | **String** | Specifies the login shell path. |  [optional]
**modifiableGroups** | **List&lt;String&gt;** | Specifies the groups that can be modified in the provider. |  [optional]
**modifiableUsers** | **List&lt;String&gt;** | Specifies the users that can be modified in the provider. |  [optional]
**name** | **String** | Specifies the name of the file provider. |  [optional]
**netgroupFile** | **String** | Specifies the path to a netgroups replacement file. |  [optional]
**normalizeGroups** | **Boolean** | Normalizes group names to lowercase before look up. |  [optional]
**normalizeUsers** | **Boolean** | Normalizes user names to lowercase before look up. |  [optional]
**ntlmSupport** | [**NtlmSupportEnum**](#NtlmSupportEnum) | Specifies which NTLM versions to support for users with NTLM-compatible credentials. |  [optional]
**passwordFile** | **String** | Specifies the location of the file containing information about users. |  [optional]
**providerDomain** | **String** | Specifies the domain for the provider. |  [optional]
**restrictFindable** | **Boolean** | If true, checks the provider for filtered lists of findable and unfindable users and groups. |  [optional]
**restrictListable** | **Boolean** | If true, checks the provider for filtered lists of listable and unlistable users and groups. |  [optional]
**restrictModifiable** | **Boolean** | If true, checks the provider for filtered lists of modifiable and unmodifiable users and groups. |  [optional]
**status** | **String** | Specifies the status of the provider. |  [optional]
**system** | **Boolean** | If true, indicates that this provider instance was created by OneFS and cannot be removed. |  [optional]
**unfindableGroups** | **List&lt;String&gt;** | Specifies groups that cannot be resolved by the provider. |  [optional]
**unfindableUsers** | **List&lt;String&gt;** | Specifies users that cannot be resolved by the provider. |  [optional]
**unlistableGroups** | **List&lt;String&gt;** | Specifies a group that cannot be listed by the provider. |  [optional]
**unlistableUsers** | **List&lt;String&gt;** | Specifies a user that cannot be listed by the provider. |  [optional]
**unmodifiableGroups** | **List&lt;String&gt;** | Specifies a group that cannot be modified by the provider. |  [optional]
**unmodifiableUsers** | **List&lt;String&gt;** | Specifies a user that cannot be modified by the provider. |  [optional]
**userDomain** | **String** | Specifies the domain for this provider through which users are qualified. |  [optional]


<a name="NtlmSupportEnum"></a>
## Enum: NtlmSupportEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
V2ONLY | &quot;v2only&quot;
NONE | &quot;none&quot;



