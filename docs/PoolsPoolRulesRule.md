
# PoolsPoolRulesRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description for the provisioning rule. | 
**groupnet** | **String** | Name of the groupnet this rule belongs to | 
**id** | **String** | Unique rule ID. | 
**iface** | **String** | Interface name the provisioning rule applies to. | 
**name** | **String** | Name of the provisioning rule. | 
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | Node type the provisioning rule applies to. | 
**pool** | **String** | Name of the pool this rule belongs to. | 
**subnet** | **String** | Name of the subnet this rule belongs to. | 


<a name="NodeTypeEnum"></a>
## Enum: NodeTypeEnum
Name | Value
---- | -----
ANY | &quot;any&quot;
STORAGE | &quot;storage&quot;
ACCELERATOR | &quot;accelerator&quot;
STORAGE_I | &quot;storage-i&quot;
ACCELERATOR_I | &quot;accelerator-i&quot;
BACKUP_ACCELERATOR | &quot;backup-accelerator&quot;



