
# StoragepoolSettingsExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automaticallyManageIoOptimization** | [**AutomaticallyManageIoOptimizationEnum**](#AutomaticallyManageIoOptimizationEnum) | Automatically manage IO optimization settings on files. |  [optional]
**automaticallyManageProtection** | [**AutomaticallyManageProtectionEnum**](#AutomaticallyManageProtectionEnum) | Automatically manage protection settings on files. |  [optional]
**globalNamespaceAccelerationEnabled** | **Boolean** | Optimize namespace operations by storing metadata on SSDs. |  [optional]
**protectDirectoriesOneLevelHigher** | **Boolean** | Automatically add additional protection level to all directories. |  [optional]
**spilloverEnabled** | **Boolean** | Spill writes into other pools as needed. |  [optional]
**spilloverTarget** | [**StoragepoolSettingsSpilloverTarget**](StoragepoolSettingsSpilloverTarget.md) | Target pool for spilled writes. |  [optional]
**ssdL3CacheDefaultEnabled** | **Boolean** | The L3 Cache default enabled state. This specifies whether L3 Cache should be enabled on new node pools |  [optional]
**ssdQabMirrors** | [**SsdQabMirrorsEnum**](#SsdQabMirrorsEnum) | Controls number of mirrors of QAB blocks to place on SSDs. |  [optional]
**ssdSystemBtreeMirrors** | [**SsdSystemBtreeMirrorsEnum**](#SsdSystemBtreeMirrorsEnum) | Controls number of mirrors of system B-tree blocks to place on SSDs. |  [optional]
**ssdSystemDeltaMirrors** | [**SsdSystemDeltaMirrorsEnum**](#SsdSystemDeltaMirrorsEnum) | Controls number of mirrors of system delta blocks to place on SSDs. |  [optional]
**virtualHotSpareDenyWrites** | **Boolean** | Deny writes into reserved virtual hot spare space. |  [optional]
**virtualHotSpareHideSpare** | **Boolean** | Hide reserved virtual hot spare space from free space counts. |  [optional]
**virtualHotSpareLimitDrives** | **Integer** | The number of drives to reserve for the virtual hot spare, from 0-4. |  [optional]
**virtualHotSpareLimitPercent** | **Integer** | The percent space to reserve for the virtual hot spare, from 0-20. |  [optional]


<a name="AutomaticallyManageIoOptimizationEnum"></a>
## Enum: AutomaticallyManageIoOptimizationEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
FILES_AT_DEFAULT | &quot;files_at_default&quot;
NONE | &quot;none&quot;


<a name="AutomaticallyManageProtectionEnum"></a>
## Enum: AutomaticallyManageProtectionEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
FILES_AT_DEFAULT | &quot;files_at_default&quot;
NONE | &quot;none&quot;


<a name="SsdQabMirrorsEnum"></a>
## Enum: SsdQabMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;


<a name="SsdSystemBtreeMirrorsEnum"></a>
## Enum: SsdSystemBtreeMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;


<a name="SsdSystemDeltaMirrorsEnum"></a>
## Enum: SsdSystemDeltaMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;



