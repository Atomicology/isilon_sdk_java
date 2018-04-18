
# SmbSharePermission

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permission** | [**PermissionEnum**](#PermissionEnum) | Specifies the file system rights that are allowed or denied. | 
**permissionType** | [**PermissionTypeEnum**](#PermissionTypeEnum) | Determines whether the permission is allowed or denied. | 
**trustee** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. | 


<a name="PermissionEnum"></a>
## Enum: PermissionEnum
Name | Value
---- | -----
FULL | &quot;full&quot;
CHANGE | &quot;change&quot;
READ | &quot;read&quot;


<a name="PermissionTypeEnum"></a>
## Enum: PermissionTypeEnum
Name | Value
---- | -----
ALLOW | &quot;allow&quot;
DENY | &quot;deny&quot;



