
# ProvidersLdapItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternateSecurityIdentitiesAttribute** | **String** | Specifies the attribute name used when searching for alternate security identities. |  [optional]
**authentication** | **Boolean** | If true, enables authentication and identity management through the authentication provider. |  [optional]
**balanceServers** | **Boolean** | If true, connects the provider to a random server. |  [optional]
**baseDn** | **String** | Specifies the root of the tree in which to search identities. | 
**bindDn** | **String** | Specifies the distinguished name for binding to the LDAP server. |  [optional]
**bindMechanism** | [**BindMechanismEnum**](#BindMechanismEnum) | Specifies which bind mechanism to use when connecting to an LDAP server. The only supported option is the &#39;simple&#39; value. |  [optional]
**bindPassword** | **String** | Specifies the password for the distinguished name for binding to the LDAP server. |  [optional]
**bindTimeout** | **Integer** | Specifies the timeout in seconds when binding to an LDAP server. |  [optional]
**certificateAuthorityFile** | **String** | Specifies the path to the root certificates file. |  [optional]
**checkOnlineInterval** | **Integer** | Specifies the time in seconds between provider online checks. |  [optional]
**cnAttribute** | **String** | Specifies the canonical name. |  [optional]
**createHomeDirectory** | **Boolean** | Automatically create the home directory on the first login. |  [optional]
**cryptPasswordAttribute** | **String** | Specifies the hashed password value. |  [optional]
**emailAttribute** | **String** | Specifies the LDAP Email attribute. |  [optional]
**enabled** | **Boolean** | If true, enables the LDAP provider. |  [optional]
**enumerateGroups** | **Boolean** | If true, allows the provider to enumerate groups. |  [optional]
**enumerateUsers** | **Boolean** | If true, allows the provider to enumerate users. |  [optional]
**findableGroups** | **List&lt;String&gt;** | Specifies the list of groups that can be resolved. |  [optional]
**findableUsers** | **List&lt;String&gt;** | Specifies the list of users that can be resolved. |  [optional]
**gecosAttribute** | **String** | Specifies the LDAP GECOS attribute. |  [optional]
**gidAttribute** | **String** | Specifies the LDAP GID attribute. |  [optional]
**groupBaseDn** | **String** | Specifies the distinguished name of the entry where LDAP searches for groups are started. |  [optional]
**groupDomain** | **String** | Specifies the domain for this provider through which groups are qualified. |  [optional]
**groupFilter** | **String** | Specifies the LDAP filter for group objects. |  [optional]
**groupMembersAttribute** | **String** | Specifies the LDAP Group Members attribute. |  [optional]
**groupSearchScope** | [**GroupSearchScopeEnum**](#GroupSearchScopeEnum) | Specifies the depth from the base DN to perform LDAP searches. |  [optional]
**groupnet** | **String** | Groupnet identifier. |  [optional]
**homeDirectoryTemplate** | **String** | Specifies the path to the home directory template. |  [optional]
**homedirAttribute** | **String** | Specifies the LDAP Homedir attribute. |  [optional]
**ignoreTlsErrors** | **Boolean** | If true, continues over secure connections even if identity checks fail. |  [optional]
**listableGroups** | **List&lt;String&gt;** | Specifies the groups that can be viewed in the provider. |  [optional]
**listableUsers** | **List&lt;String&gt;** | Specifies the users that can be viewed in the provider. |  [optional]
**loginShell** | **String** | Specifies the login shell path. |  [optional]
**memberOfAttribute** | **String** | Specifies the LDAP Query Member Of attribute, which performs reverse membership queries. |  [optional]
**name** | **String** | Specifies the name of the LDAP provider. | 
**nameAttribute** | **String** | Specifies the LDAP UID attribute, which is used as the login name. |  [optional]
**netgroupBaseDn** | **String** | Specifies the distinguished name of the entry where LDAP searches for netgroups are started. |  [optional]
**netgroupFilter** | **String** | Specifies the LDAP filter for netgroup objects. |  [optional]
**netgroupMembersAttribute** | **String** | Specifies the LDAP Netgroup Members attribute. |  [optional]
**netgroupSearchScope** | [**NetgroupSearchScopeEnum**](#NetgroupSearchScopeEnum) | Specifies the depth from the base DN to perform LDAP searches. |  [optional]
**netgroupTripleAttribute** | **String** | Specifies the LDAP Netgroup Triple attribute. |  [optional]
**normalizeGroups** | **Boolean** | Normalizes group names to lowercase before look up. |  [optional]
**normalizeUsers** | **Boolean** | Normalizes user names to lowercase before look up. |  [optional]
**ntPasswordAttribute** | **String** | Specifies the LDAP NT Password attribute. |  [optional]
**ntlmSupport** | [**NtlmSupportEnum**](#NtlmSupportEnum) | Specifies which NTLM versions to support for users with NTLM-compatible credentials. |  [optional]
**providerDomain** | **String** | Specifies the provider domain. |  [optional]
**requireSecureConnection** | **Boolean** | Determines whether to continue over a non-TLS connection. |  [optional]
**restrictFindable** | **Boolean** | If true, checks the provider for filtered lists of findable and unfindable users and groups. |  [optional]
**restrictListable** | **Boolean** | If true, checks the provider for filtered lists of listable and unlistable users and groups. |  [optional]
**searchScope** | [**SearchScopeEnum**](#SearchScopeEnum) | Specifies the default depth from the base DN to perform LDAP searches. |  [optional]
**searchTimeout** | **Integer** | Specifies the search timeout period in seconds. |  [optional]
**serverUris** | **List&lt;String&gt;** | Specifies the server URIs. | 
**shadowExpireAttribute** | **String** | Sets the attribute name that indicates the absolute date to expire the account. |  [optional]
**shadowFlagAttribute** | **String** | Sets the attribute name that indicates the section of the shadow map that is used to store the flag value. |  [optional]
**shadowInactiveAttribute** | **String** | Sets the attribute name that indicates the number of days of inactivity that is allowed for the user. |  [optional]
**shadowLastChangeAttribute** | **String** | Sets the attribute name that indicates the last change of the shadow information. |  [optional]
**shadowMaxAttribute** | **String** | Sets the attribute name that indicates the maximum number of days a password can be valid. |  [optional]
**shadowMinAttribute** | **String** | Sets the attribute name that indicates the minimum number of days between shadow changes. |  [optional]
**shadowUserFilter** | **String** | Sets LDAP filter for shadow user objects. |  [optional]
**shadowWarningAttribute** | **String** | Sets the attribute name that indicates the number of days before the password expires to warn the user. |  [optional]
**shellAttribute** | **String** | Specifies the the LDAP Shell attribute. |  [optional]
**template** | **String** | Specifies template to be used to create the LDAP provider. The list of templates can be found at /auth/providers/ldap-templates.  Any fields directly defined in your request will override the template values. |  [optional]
**uidAttribute** | **String** | Specifies the the LDAP UID Number attribute. |  [optional]
**unfindableGroups** | **List&lt;String&gt;** | Specifies the groups that cannot be resolved by the provider. |  [optional]
**unfindableUsers** | **List&lt;String&gt;** | Specifies users that cannot be resolved by the provider. |  [optional]
**uniqueGroupMembersAttribute** | **String** | Sets the LDAP Unique Group Members attribute. |  [optional]
**unlistableGroups** | **List&lt;String&gt;** | Specifies a group that cannot be listed by the provider. |  [optional]
**unlistableUsers** | **List&lt;String&gt;** | Specifies a user that cannot be listed by the provider. |  [optional]
**userBaseDn** | **String** | Specifies the distinguished name of the entry at which to start LDAP searches for users. |  [optional]
**userDomain** | **String** | Specifies the domain for this provider through which users are qualified. |  [optional]
**userFilter** | **String** | Specifies the LDAP filter for user objects. |  [optional]
**userSearchScope** | [**UserSearchScopeEnum**](#UserSearchScopeEnum) | Specifies the depth from the base DN to perform LDAP searches. |  [optional]


<a name="BindMechanismEnum"></a>
## Enum: BindMechanismEnum
Name | Value
---- | -----
SIMPLE | &quot;simple&quot;
GSSAPI | &quot;gssapi&quot;
DIGEST_MD5 | &quot;digest-md5&quot;


<a name="GroupSearchScopeEnum"></a>
## Enum: GroupSearchScopeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
BASE | &quot;base&quot;
ONELEVEL | &quot;onelevel&quot;
SUBTREE | &quot;subtree&quot;
CHILDREN | &quot;children&quot;


<a name="NetgroupSearchScopeEnum"></a>
## Enum: NetgroupSearchScopeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
BASE | &quot;base&quot;
ONELEVEL | &quot;onelevel&quot;
SUBTREE | &quot;subtree&quot;
CHILDREN | &quot;children&quot;


<a name="NtlmSupportEnum"></a>
## Enum: NtlmSupportEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
V2ONLY | &quot;v2only&quot;
NONE | &quot;none&quot;


<a name="SearchScopeEnum"></a>
## Enum: SearchScopeEnum
Name | Value
---- | -----
BASE | &quot;base&quot;
ONELEVEL | &quot;onelevel&quot;
SUBTREE | &quot;subtree&quot;
CHILDREN | &quot;children&quot;


<a name="UserSearchScopeEnum"></a>
## Enum: UserSearchScopeEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
BASE | &quot;base&quot;
ONELEVEL | &quot;onelevel&quot;
SUBTREE | &quot;subtree&quot;
CHILDREN | &quot;children&quot;



