
# HttpSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessControl** | **Boolean** | Enable Access Control Authentication |  [optional]
**basicAuthentication** | **Boolean** | Enable Basic Authentication |  [optional]
**dav** | **Boolean** | Enable DAV specification |  [optional]
**enableAccessLog** | **Boolean** | Enable HTTP access logging |  [optional]
**https** | **Boolean** | Use HTTPS transport |  [optional]
**integratedAuthentication** | **Boolean** | Enable Integrated Authentication |  [optional]
**serverRoot** | **String** | Document root directory. Must be within /ifs. |  [optional]
**service** | [**ServiceEnum**](#ServiceEnum) | Enable/disable the HTTP service or redirect to WebUI. |  [optional]


<a name="ServiceEnum"></a>
## Enum: ServiceEnum
Name | Value
---- | -----
ENABLED | &quot;enabled&quot;
DISABLED | &quot;disabled&quot;
REDIRECT | &quot;redirect&quot;



