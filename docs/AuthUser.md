
# AuthUser

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **String** | Specifies an email address for the user. |  [optional]
**enabled** | **Boolean** | If true, the authenticated user is enabled. |  [optional]
**expiry** | **Integer** | Specifies the Unix Epoch time when the auth user will expire. |  [optional]
**gecos** | **String** | Specifies the GECOS value, which is usually the full name. |  [optional]
**homeDirectory** | **String** | Specifies a home directory for the user. |  [optional]
**password** | **String** | Changes the password for the user. |  [optional]
**passwordExpires** | **Boolean** | If true, the password should expire. |  [optional]
**primaryGroup** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**promptPasswordChange** | **Boolean** | If true, prompts the user to change their password at the next login. |  [optional]
**shell** | **String** | Specifies the shell for the user. |  [optional]
**sid** | **String** | Specifies a security identifier. |  [optional]
**uid** | **Integer** | Specifies a numeric user identifier. |  [optional]
**unlock** | **Boolean** | If true, the user account should be unlocked. |  [optional]



