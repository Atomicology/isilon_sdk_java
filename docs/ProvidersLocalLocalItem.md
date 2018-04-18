
# ProvidersLocalLocalItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authentication** | **Boolean** | If true, enables authentication and identity management through the authentication provider. |  [optional]
**createHomeDirectory** | **Boolean** | Automatically creates the home directory on the first login. |  [optional]
**homeDirectoryTemplate** | **String** | Specifies the path to the home directory template. |  [optional]
**id** | **String** | Specifies the local provider ID. |  [optional]
**lockoutDuration** | **Integer** | Specifies the length of time in seconds that an account will be inaccessible after multiple failed login attempts. |  [optional]
**lockoutThreshold** | **Integer** | Specifies the number of failed login attempts necessary before an account is locked. |  [optional]
**lockoutWindow** | **Integer** | Specifies the duration of time in seconds in which the number of failed attempts set in the &#39;lockout_threshold&#39; parameter must be made before an account is locked. |  [optional]
**loginShell** | **String** | Specifies the login shell path. |  [optional]
**machineName** | **String** | Specifies the domain for this provider through which users and groups are qualified. |  [optional]
**maxPasswordAge** | **Integer** | Specifies the maximum password age in seconds. |  [optional]
**minPasswordAge** | **Integer** | Specifies the minimum password age in seconds. |  [optional]
**minPasswordLength** | **Integer** | Specifies the minimum password length. |  [optional]
**name** | **String** | Specifies the local provider name. |  [optional]
**passwordComplexity** | [**List&lt;PasswordComplexityEnum&gt;**](#List&lt;PasswordComplexityEnum&gt;) | Specifies the conditions required for a password. |  [optional]
**passwordHistoryLength** | **Integer** | Specifies the number of previous passwords to store. |  [optional]
**passwordPromptTime** | **Integer** | Specifies the time in seconds remaining before a user will be prompted for a password change. |  [optional]
**status** | **String** | Specifies the status of the provider. |  [optional]
**system** | **Boolean** | If true, indicates that this provider instance was created by OneFS and cannot be removed. |  [optional]


<a name="List<PasswordComplexityEnum>"></a>
## Enum: List&lt;PasswordComplexityEnum&gt;
Name | Value
---- | -----
LOWERCASE | &quot;lowercase&quot;
UPPERCASE | &quot;uppercase&quot;
NUMERIC | &quot;numeric&quot;
SYMBOL | &quot;symbol&quot;



