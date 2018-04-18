
# MappingUsersLookupMappingItemUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dn** | **String** |  |  [optional]
**dnsDomain** | **String** |  |  [optional]
**domain** | **String** |  |  [optional]
**email** | **String** |  |  [optional]
**enabled** | **Boolean** | True, if the authenticated user is enabled. | 
**expired** | **Boolean** | True, if the authenticated user has expired. | 
**expiry** | **Integer** |  |  [optional]
**gecos** | **String** |  |  [optional]
**generatedGid** | **Boolean** | True, if the GID was generated. |  [optional]
**generatedUid** | **Boolean** | True, if the UID was generated. |  [optional]
**generatedUpn** | **Boolean** | True, if the UPN was generated. |  [optional]
**gid** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**homeDirectory** | **String** |  |  [optional]
**id** | **String** | Specifies the user or group ID. | 
**locked** | **Boolean** | If true, indicates that the account is locked. | 
**maxPasswordAge** | **Integer** | Specifies the maximum time in seconds allowed before the password expires. |  [optional]
**memberOf** | [**List&lt;AuthAccessAccessItemFileGroup&gt;**](AuthAccessAccessItemFileGroup.md) |  |  [optional]
**name** | **String** | Specifies a user or group name. | 
**objectHistory** | [**List&lt;AuthGroupObjectHistoryItem&gt;**](AuthGroupObjectHistoryItem.md) |  |  [optional]
**onDiskGroupIdentity** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**onDiskUserIdentity** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**passwordExpired** | **Boolean** | If true, the password has expired. | 
**passwordExpires** | **Boolean** | If true, the password is allowed to expire. | 
**passwordExpiry** | **Integer** |  |  [optional]
**passwordLastSet** | **Integer** |  |  [optional]
**primaryGroupSid** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**promptPasswordChange** | **Boolean** | Prompts the user to change their password at the next login. | 
**provider** | **String** |  |  [optional]
**samAccountName** | **String** |  |  [optional]
**shell** | **String** |  |  [optional]
**sid** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**type** | **String** | Specifies the object type. | 
**uid** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**upn** | **String** |  |  [optional]
**userCanChangePassword** | **Boolean** | Specifies whether the password for the user can be changed. | 



