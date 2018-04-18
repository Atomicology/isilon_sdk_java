
# SmbSettingsShareSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessBasedEnumeration** | **Boolean** | Only enumerate files and folders the requesting user has access to. |  [optional]
**accessBasedEnumerationRootOnly** | **Boolean** | Access-based enumeration on only the root directory of the share. |  [optional]
**allowDeleteReadonly** | **Boolean** | Allow deletion of read-only files in the share. |  [optional]
**allowExecuteAlways** | **Boolean** | Allows users to execute files they have read rights for. |  [optional]
**caTimeout** | **Integer** | Persistent open timeout for the share. |  [optional]
**caWriteIntegrity** | [**CaWriteIntegrityEnum**](#CaWriteIntegrityEnum) | Specify the level of write-integrity on continuously available shares. |  [optional]
**changeNotify** | [**ChangeNotifyEnum**](#ChangeNotifyEnum) | Specify level of change notification alerts on the share. |  [optional]
**createPermissions** | [**CreatePermissionsEnum**](#CreatePermissionsEnum) | Set the create permissions for new files and directories in share. |  [optional]
**cscPolicy** | [**CscPolicyEnum**](#CscPolicyEnum) | Client-side caching policy for the shares. |  [optional]
**directoryCreateMask** | **Integer** | Unix umask or mode bits. |  [optional]
**directoryCreateMode** | **Integer** | Unix umask or mode bits. |  [optional]
**fileCreateMask** | **Integer** | Unix umask or mode bits. |  [optional]
**fileCreateMode** | **Integer** | Unix umask or mode bits. |  [optional]
**fileFilterExtensions** | **List&lt;String&gt;** | Specifies the list of file extensions. |  [optional]
**fileFilterType** | [**FileFilterTypeEnum**](#FileFilterTypeEnum) | Specifies if filter list is for deny or allow. Default is deny. |  [optional]
**fileFilteringEnabled** | **Boolean** | Enables file filtering on the share. |  [optional]
**hideDotFiles** | **Boolean** | Hide files and directories that begin with a period &#39;.&#39;. |  [optional]
**hostAcl** | **List&lt;String&gt;** | An ACL expressing which hosts are allowed access. A deny clause must be the final entry. |  [optional]
**impersonateGuest** | [**ImpersonateGuestEnum**](#ImpersonateGuestEnum) | Specify the condition in which user access is done as the guest account. |  [optional]
**impersonateUser** | **String** | User account to be used as guest account. |  [optional]
**mangleByteStart** | **Integer** | Specifies the wchar_t starting point for automatic byte mangling. |  [optional]
**mangleMap** | **List&lt;String&gt;** | Character mangle map. |  [optional]
**ntfsAclSupport** | **Boolean** | Support NTFS ACLs on files and directories. |  [optional]
**oplocks** | **Boolean** | Allow oplock requests. |  [optional]
**strictCaLockout** | **Boolean** | Specifies if persistent opens would do strict lockout on the share. |  [optional]
**strictFlush** | **Boolean** | Handle SMB flush operations. |  [optional]
**strictLocking** | **Boolean** | Specifies whether byte range locks contend against SMB I/O. |  [optional]
**zone** | **String** | Name of the access zone in which to update settings |  [optional]


<a name="CaWriteIntegrityEnum"></a>
## Enum: CaWriteIntegrityEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
WRITE_READ_COHERENT | &quot;write-read-coherent&quot;
FULL | &quot;full&quot;


<a name="ChangeNotifyEnum"></a>
## Enum: ChangeNotifyEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
NORECURSE | &quot;norecurse&quot;
NONE | &quot;none&quot;


<a name="CreatePermissionsEnum"></a>
## Enum: CreatePermissionsEnum
Name | Value
---- | -----
DEFAULT_ACL | &quot;default acl&quot;
INHERIT_MODE_BITS | &quot;inherit mode bits&quot;
USE_CREATE_MASK_AND_MODE | &quot;use create mask and mode&quot;


<a name="CscPolicyEnum"></a>
## Enum: CscPolicyEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
DOCUMENTS | &quot;documents&quot;
PROGRAMS | &quot;programs&quot;
NONE | &quot;none&quot;


<a name="FileFilterTypeEnum"></a>
## Enum: FileFilterTypeEnum
Name | Value
---- | -----
DENY | &quot;deny&quot;
ALLOW | &quot;allow&quot;


<a name="ImpersonateGuestEnum"></a>
## Enum: ImpersonateGuestEnum
Name | Value
---- | -----
ALWAYS | &quot;always&quot;
BAD_USER | &quot;bad user&quot;
NEVER | &quot;never&quot;



