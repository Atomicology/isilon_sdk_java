
# ZoneExtendedExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alternateSystemProvider** | **String** | Specifies an alternate system provider. |  [optional]
**authProviders** | **List&lt;String&gt;** | Specifies the list of authentication providers available on this access zone. |  [optional]
**cacheEntryExpiry** | **Integer** | Specifies amount of time in seconds to cache a user/group. |  [optional]
**createPath** | **Boolean** | Determines if a path is created when a path does not exist. |  [optional]
**groupnet** | **String** | Groupnet identitier |  [optional]
**homeDirectoryUmask** | **Integer** | Specifies the permissions set on automatically created user home directories. |  [optional]
**id** | **String** | Specifies the system-assigned ID for the access zone. This value is returned when an access zone is created through the POST method |  [optional]
**ifsRestricted** | [**List&lt;AuthAccessAccessItemFileGroup&gt;**](AuthAccessAccessItemFileGroup.md) | Specifies a list of users and groups that have read and write access to /ifs. |  [optional]
**mapUntrusted** | **String** | Maps untrusted domains to this NetBIOS domain during authentication. |  [optional]
**name** | **String** | Specifies the access zone name. |  [optional]
**negativeCacheEntryExpiry** | **Integer** | Specifies number of seconds the negative cache entry is valid. |  [optional]
**netbiosName** | **String** | Specifies the NetBIOS name. |  [optional]
**path** | **String** | Specifies the access zone base directory path. |  [optional]
**skeletonDirectory** | **String** | Specifies the skeleton directory that is used for user home directories. |  [optional]
**system** | **Boolean** | True if the access zone is built-in. |  [optional]
**systemProvider** | **String** | Specifies the system provider for the access zone. |  [optional]
**userMappingRules** | **List&lt;String&gt;** | Specifies the current ID mapping rules. |  [optional]
**zoneId** | **Integer** | Specifies the access zone ID on the system. |  [optional]



