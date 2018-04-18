
# StoragepoolSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**automaticallyManageIoOptimization** | [**AutomaticallyManageIoOptimizationEnum**](#AutomaticallyManageIoOptimizationEnum) | Automatically manage IO optimization settings on files. | 
**automaticallyManageProtection** | [**AutomaticallyManageProtectionEnum**](#AutomaticallyManageProtectionEnum) | Automatically manage protection settings on files. | 
**globalNamespaceAccelerationEnabled** | **Boolean** | Optimize namespace operations by storing metadata on SSDs. | 
**globalNamespaceAccelerationState** | [**GlobalNamespaceAccelerationStateEnum**](#GlobalNamespaceAccelerationStateEnum) | Whether or not namespace operation optimizations are currently in effect. | 
**protectDirectoriesOneLevelHigher** | **Boolean** | Automatically add additional protection level to all directories. | 
**spilloverEnabled** | **Boolean** | Spill writes into other pools as needed. | 
**spilloverTarget** | [**StoragepoolSettingsSettingsSpilloverTarget**](StoragepoolSettingsSettingsSpilloverTarget.md) | Target pool for spilled writes. | 
**ssdL3CacheDefaultEnabled** | **Boolean** | The L3 Cache default enabled state. This specifies whether L3 Cache should be enabled on new node pools. | 
**ssdQabMirrors** | [**SsdQabMirrorsEnum**](#SsdQabMirrorsEnum) | Controls number of mirrors of QAB blocks to place on SSDs. | 
**ssdSystemBtreeMirrors** | [**SsdSystemBtreeMirrorsEnum**](#SsdSystemBtreeMirrorsEnum) | Controls number of mirrors of system B-tree blocks to place on SSDs. | 
**ssdSystemDeltaMirrors** | [**SsdSystemDeltaMirrorsEnum**](#SsdSystemDeltaMirrorsEnum) | Controls number of mirrors of system delta blocks to place on SSDs. | 
**virtualHotSpareDenyWrites** | **Boolean** | Deny writes into reserved virtual hot spare space. | 
**virtualHotSpareHideSpare** | **Boolean** | Hide reserved virtual hot spare space from free space counts. | 
**virtualHotSpareLimitDrives** | **Integer** | The number of drives to reserve for the virtual hot spare, from 0-4. | 
**virtualHotSpareLimitPercent** | **Integer** | The percent space to reserve for the virtual hot spare, from 0-20. | 


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


<a name="GlobalNamespaceAccelerationStateEnum"></a>
## Enum: GlobalNamespaceAccelerationStateEnum
Name | Value
---- | -----
HONORED | &quot;honored&quot;
INACTIVE | &quot;inactive&quot;


<a name="SsdQabMirrorsEnum"></a>
## Enum: SsdQabMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;
DISABLED | &quot;disabled&quot;
INVALID | &quot;invalid&quot;
NONE | &quot;none&quot;


<a name="SsdSystemBtreeMirrorsEnum"></a>
## Enum: SsdSystemBtreeMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;
DISABLED | &quot;disabled&quot;
INVALID | &quot;invalid&quot;
NONE | &quot;none&quot;


<a name="SsdSystemDeltaMirrorsEnum"></a>
## Enum: SsdSystemDeltaMirrorsEnum
Name | Value
---- | -----
ONE | &quot;one&quot;
ALL | &quot;all&quot;
DISABLED | &quot;disabled&quot;
INVALID | &quot;invalid&quot;
NONE | &quot;none&quot;



