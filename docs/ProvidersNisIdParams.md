
# ProvidersNisIdParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication** | **Boolean** | If true, enables authentication and identity management through the authentication provider. |  [optional]
**balanceServers** | **Boolean** | If true, connects the provider to a random server. |  [optional]
**checkOnlineInterval** | **Integer** | Specifies the time in seconds between provider online checks. |  [optional]
**createHomeDirectory** | **Boolean** | Automatically creates the home directory on the first login. |  [optional]
**enabled** | **Boolean** | If true, enables the NIS provider. |  [optional]
**enumerateGroups** | **Boolean** | If true, allows the provider to enumerate groups. |  [optional]
**enumerateUsers** | **Boolean** | If true, allows the provider to enumerate users. |  [optional]
**findableGroups** | **List&lt;String&gt;** | Specifies the list of groups that can be resolved. |  [optional]
**findableUsers** | **List&lt;String&gt;** | Specifies the list of users that can be resolved. |  [optional]
**groupDomain** | **String** | Specifies the domain for this provider through which groups are qualified. |  [optional]
**homeDirectoryTemplate** | **String** | Specifies the path to the home directory template. |  [optional]
**hostnameLookup** | **Boolean** | If true, enables host name look ups. |  [optional]
**listableGroups** | **List&lt;String&gt;** | Specifies the groups that can be viewed in the provider. |  [optional]
**listableUsers** | **List&lt;String&gt;** | Specifies the users that can be viewed in the provider. |  [optional]
**loginShell** | **String** | Specifies the login shell path. |  [optional]
**name** | **String** | Specifies the NIS provider name. |  [optional]
**nisDomain** | **String** | Specifies the NIS domain name. |  [optional]
**normalizeGroups** | **Boolean** | Normalizes group names to lowercase before look up. |  [optional]
**normalizeUsers** | **Boolean** | Normalizes user names to lowercase before look up. |  [optional]
**ntlmSupport** | **String** | Specifies which NTLM versions to support for users with NTLM-compatible credentials. |  [optional]
**providerDomain** | **String** | Specifies the domain for the provider. |  [optional]
**requestTimeout** | **Integer** | Specifies the request timeout interval in seconds. |  [optional]
**restrictFindable** | **Boolean** | If true, checks the provider for filtered lists of findable and unfindable users and groups. |  [optional]
**restrictListable** | **Boolean** | If true, checks the provider for filtered lists of listable and unlistable users and groups. |  [optional]
**retryTime** | **Integer** | Specifies the timeout period in seconds after which a request will be retried. |  [optional]
**servers** | **List&lt;String&gt;** | Adds an NIS server for this provider. |  [optional]
**unfindableGroups** | **List&lt;String&gt;** | Specifies groups that cannot be resolved by the provider. |  [optional]
**unfindableUsers** | **List&lt;String&gt;** | Specifies users that cannot be resolved by the provider. |  [optional]
**unlistableGroups** | **List&lt;String&gt;** | Specifies a group that cannot be listed by the provider. |  [optional]
**unlistableUsers** | **List&lt;String&gt;** | Specifies a user that cannot be listed by the provider. |  [optional]
**userDomain** | **String** | Specifies the domain for this provider through which users are qualified. |  [optional]
**ypmatchUsingTcp** | **Boolean** | If true, specifies TCP for YP Match operations. |  [optional]



