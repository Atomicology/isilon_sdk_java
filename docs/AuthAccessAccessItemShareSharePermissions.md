
# AuthAccessAccessItemShareSharePermissions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expectedPermissions** | **String** | Returns Share level permissions for the user.{ &#39;read&#39; , &#39;write&#39; , &#39;full&#39; or &#39;none&#39; will be the values} |  [optional]
**impersonateGuest** | **Boolean** | Returns whether impersonate guest setting is enabled for the user on the share. |  [optional]
**impersonateUser** | **Boolean** | Returns whether impersonate user setting is enabled on the share |  [optional]
**runAsRoot** | **Boolean** | Returns whether run as root is enabled for the user on the share |  [optional]
**shareRelevantAces** | [**List&lt;AuthAccessAccessItemShareSharePermissionsShareRelevantAce&gt;**](AuthAccessAccessItemShareSharePermissionsShareRelevantAce.md) | Specifies a list of the relevant Access Control Entries withrespect to the user in the share. |  [optional]



