
# SmbShare

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessBasedEnumeration** | **Boolean** | Only enumerate files and folders the requesting user has access to. |  [optional]
**accessBasedEnumerationRootOnly** | **Boolean** | Access-based enumeration on only the root directory of the share. |  [optional]
**allowDeleteReadonly** | **Boolean** | Allow deletion of read-only files in the share. |  [optional]
**allowExecuteAlways** | **Boolean** | Allows users to execute files they have read rights for. |  [optional]
**allowVariableExpansion** | **Boolean** | Allow automatic expansion of variables for home directories. |  [optional]
**autoCreateDirectory** | **Boolean** | Automatically create home directories. |  [optional]
**browsable** | **Boolean** | Share is visible in net view and the browse list. |  [optional]
**caTimeout** | **Integer** | Persistent open timeout for the share. |  [optional]
**caWriteIntegrity** | **String** | Specify the level of write-integrity on continuously available shares. |  [optional]
**changeNotify** | **String** | Level of change notification alerts on the share. |  [optional]
**createPermissions** | **String** | Create permissions for new files and directories in share. |  [optional]
**cscPolicy** | **String** | Client-side caching policy for the shares. |  [optional]
**description** | **String** | Description for this SMB share. |  [optional]
**directoryCreateMask** | **Integer** | Directory create mask bits. |  [optional]
**directoryCreateMode** | **Integer** | Directory create mode bits. |  [optional]
**fileCreateMask** | **Integer** | File create mask bits. |  [optional]
**fileCreateMode** | **Integer** | File create mode bits. |  [optional]
**fileFilterExtensions** | **List&lt;String&gt;** | Specifies the list of file extensions. |  [optional]
**fileFilterType** | **String** | Specifies if filter list is for deny or allow. Default is deny. |  [optional]
**fileFilteringEnabled** | **Boolean** | Enables file filtering on this zone. |  [optional]
**hideDotFiles** | **Boolean** | Hide files and directories that begin with a period &#39;.&#39;. |  [optional]
**hostAcl** | **List&lt;String&gt;** | An ACL expressing which hosts are allowed access. A deny clause must be the final entry. |  [optional]
**impersonateGuest** | **String** | Specify the condition in which user access is done as the guest account. |  [optional]
**impersonateUser** | **String** | User account to be used as guest account. |  [optional]
**inheritablePathAcl** | **Boolean** | Set the inheritable ACL on the share path. |  [optional]
**mangleByteStart** | **Integer** | Specifies the wchar_t starting point for automatic byte mangling. |  [optional]
**mangleMap** | **List&lt;String&gt;** | Character mangle map. |  [optional]
**name** | **String** | Share name. |  [optional]
**ntfsAclSupport** | **Boolean** | Support NTFS ACLs on files and directories. |  [optional]
**oplocks** | **Boolean** | Support oplocks. |  [optional]
**path** | **String** | Path of share within /ifs. |  [optional]
**permissions** | [**List&lt;SmbSharePermission&gt;**](SmbSharePermission.md) | Specifies an ordered list of permission modifications. |  [optional]
**runAsRoot** | [**List&lt;AuthAccessAccessItemFileGroup&gt;**](AuthAccessAccessItemFileGroup.md) | Allow account to run as root. |  [optional]
**strictCaLockout** | **Boolean** | Specifies if persistent opens would do strict lockout on the share. |  [optional]
**strictFlush** | **Boolean** | Handle SMB flush operations. |  [optional]
**strictLocking** | **Boolean** | Specifies whether byte range locks contend against SMB I/O. |  [optional]
**zone** | **String** | Name of the access zone to which to move this SMB share |  [optional]



