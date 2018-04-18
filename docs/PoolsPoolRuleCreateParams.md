
# PoolsPoolRuleCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description for the provisioning rule. |  [optional]
**iface** | **String** | Interface name the provisioning rule applies to. | 
**name** | **String** | Name of the provisioning rule. | 
**nodeType** | [**NodeTypeEnum**](#NodeTypeEnum) | Node type the provisioning rule applies to. |  [optional]


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



