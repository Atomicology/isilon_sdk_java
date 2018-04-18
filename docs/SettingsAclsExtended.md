
# SettingsAclsExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | [**AccessEnum**](#AccessEnum) | Access checks (chmod, chown). |  [optional]
**calcmode** | [**CalcmodeEnum**](#CalcmodeEnum) | Displayed mode bits. |  [optional]
**calcmodeGroup** | [**CalcmodeGroupEnum**](#CalcmodeGroupEnum) | Approximate group mode bits when ACL exists. |  [optional]
**calcmodeOwner** | [**CalcmodeOwnerEnum**](#CalcmodeOwnerEnum) | Approximate owner mode bits when ACL exists. |  [optional]
**chmod** | [**ChmodEnum**](#ChmodEnum) | chmod on files with existing ACLs. |  [optional]
**chmod007** | [**Chmod007Enum**](#Chmod007Enum) | chmod (007) on files with existing ACLs. |  [optional]
**chmodInheritable** | [**ChmodInheritableEnum**](#ChmodInheritableEnum) | ACLs created on directories by UNIX chmod. |  [optional]
**chown** | [**ChownEnum**](#ChownEnum) | chown/chgrp on files with existing ACLs. |  [optional]
**createOverSmb** | [**CreateOverSmbEnum**](#CreateOverSmbEnum) | ACL creation over SMB. |  [optional]
**dosAttr** | [**DosAttrEnum**](#DosAttrEnum) |  Read only DOS attribute. |  [optional]
**groupOwnerInheritance** | [**GroupOwnerInheritanceEnum**](#GroupOwnerInheritanceEnum) | Group owner inheritance. |  [optional]
**rwx** | [**RwxEnum**](#RwxEnum) | Treatment of &#39;rwx&#39; permissions. |  [optional]
**syntheticDenies** | [**SyntheticDeniesEnum**](#SyntheticDeniesEnum) | Synthetic &#39;deny&#39; ACEs. |  [optional]
**utimes** | [**UtimesEnum**](#UtimesEnum) | Access check (utimes) |  [optional]


<a name="AccessEnum"></a>
## Enum: AccessEnum
Name | Value
---- | -----
UNIX | &quot;unix&quot;
WINDOWS | &quot;windows&quot;


<a name="CalcmodeEnum"></a>
## Enum: CalcmodeEnum
Name | Value
---- | -----
APPROX | &quot;approx&quot;
_777 | &quot;777&quot;


<a name="CalcmodeGroupEnum"></a>
## Enum: CalcmodeGroupEnum
Name | Value
---- | -----
ACES | &quot;group_aces&quot;
ONLY | &quot;group_only&quot;


<a name="CalcmodeOwnerEnum"></a>
## Enum: CalcmodeOwnerEnum
Name | Value
---- | -----
ACES | &quot;owner_aces&quot;
ONLY | &quot;owner_only&quot;


<a name="ChmodEnum"></a>
## Enum: ChmodEnum
Name | Value
---- | -----
REMOVE | &quot;remove&quot;
REPLACE | &quot;replace&quot;
REPLACE_USERS_AND_GROUPS | &quot;replace_users_and_groups&quot;
MERGE | &quot;merge&quot;
DENY | &quot;deny&quot;
IGNORE | &quot;ignore&quot;


<a name="Chmod007Enum"></a>
## Enum: Chmod007Enum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
REMOVE | &quot;remove&quot;


<a name="ChmodInheritableEnum"></a>
## Enum: ChmodInheritableEnum
Name | Value
---- | -----
YES | &quot;yes&quot;
NO | &quot;no&quot;


<a name="ChownEnum"></a>
## Enum: ChownEnum
Name | Value
---- | -----
OWNER_GROUP_AND_ACL | &quot;owner_group_and_acl&quot;
OWNER_GROUP_ONLY | &quot;owner_group_only&quot;
IGNORE | &quot;ignore&quot;


<a name="CreateOverSmbEnum"></a>
## Enum: CreateOverSmbEnum
Name | Value
---- | -----
ALLOW | &quot;allow&quot;
DISALLOW | &quot;disallow&quot;


<a name="DosAttrEnum"></a>
## Enum: DosAttrEnum
Name | Value
---- | -----
SMB | &quot;deny_smb&quot;
SMB_AND_NFS | &quot;deny_smb_and_nfs&quot;


<a name="GroupOwnerInheritanceEnum"></a>
## Enum: GroupOwnerInheritanceEnum
Name | Value
---- | -----
NATIVE | &quot;native&quot;
PARENT | &quot;parent&quot;
CREATOR | &quot;creator&quot;


<a name="RwxEnum"></a>
## Enum: RwxEnum
Name | Value
---- | -----
RETAIN | &quot;retain&quot;
FULL_CONTROL | &quot;full_control&quot;


<a name="SyntheticDeniesEnum"></a>
## Enum: SyntheticDeniesEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
REMOVE | &quot;remove&quot;


<a name="UtimesEnum"></a>
## Enum: UtimesEnum
Name | Value
---- | -----
ONLY_OWNER | &quot;only_owner&quot;
OWNER_AND_WRITE | &quot;owner_and_write&quot;



