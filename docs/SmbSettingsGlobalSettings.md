
# SmbSettingsGlobalSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessBasedShareEnum** | **Boolean** | Only enumerate files and folders the requesting user has access to. |  [optional]
**auditFileshare** | [**AuditFileshareEnum**](#AuditFileshareEnum) | Specify level of file share audit events to log. |  [optional]
**auditGlobalSacl** | [**List&lt;SmbSettingsGlobalSettingsAuditGlobalSaclItem&gt;**](SmbSettingsGlobalSettingsAuditGlobalSaclItem.md) | Specifies a list of permissions to audit. |  [optional]
**auditLogon** | [**AuditLogonEnum**](#AuditLogonEnum) | Specify the level of logon audit events to log. |  [optional]
**dotSnapAccessibleChild** | **Boolean** | Allow access to .snapshot directories in share subdirectories. |  [optional]
**dotSnapAccessibleRoot** | **Boolean** | Allow access to the .snapshot directory in the root of the share. |  [optional]
**dotSnapVisibleChild** | **Boolean** | Show .snapshot directories in share subdirectories. |  [optional]
**dotSnapVisibleRoot** | **Boolean** | Show the .snapshot directory in the root of a share. |  [optional]
**enableSecuritySignatures** | **Boolean** | Indicates whether the server supports signed SMB packets. |  [optional]
**guestUser** | **String** | Specifies the fully-qualified user to use for guest access. |  [optional]
**ignoreEas** | **Boolean** | Specify whether to ignore EAs on files. |  [optional]
**onefsCpuMultiplier** | **Integer** | Specify the number of OneFS driver worker threads per CPU. |  [optional]
**onefsNumWorkers** | **Integer** | Set the maximum number of OneFS driver worker threads. |  [optional]
**requireSecuritySignatures** | **Boolean** | Indicates whether the server requires signed SMB packets. |  [optional]
**serverSideCopy** | **Boolean** | Enable Server Side Copy. |  [optional]
**serverString** | **String** | Provides a description of the server. |  [optional]
**service** | **Boolean** | Specify whether service is enabled. |  [optional]
**srvCpuMultiplier** | **Integer** | Specify the number of SRV service worker threads per CPU. |  [optional]
**srvNumWorkers** | **Integer** | Set the maximum number of SRV service worker threads. |  [optional]
**supportMultichannel** | **Boolean** | Support multichannel. |  [optional]
**supportNetbios** | **Boolean** | Support NetBIOS. |  [optional]
**supportSmb2** | **Boolean** | Support the SMB2 protocol on the server. |  [optional]


<a name="AuditFileshareEnum"></a>
## Enum: AuditFileshareEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
NONE | &quot;none&quot;


<a name="AuditLogonEnum"></a>
## Enum: AuditLogonEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
SUCCESS | &quot;success&quot;
FAILURE | &quot;failure&quot;
NONE | &quot;none&quot;



