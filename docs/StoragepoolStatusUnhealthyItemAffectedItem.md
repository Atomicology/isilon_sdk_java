
# StoragepoolStatusUnhealthyItemAffectedItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device** | [**StoragepoolStatusUnprovisionedItem**](StoragepoolStatusUnprovisionedItem.md) |  |  [optional]
**down** | **Boolean** | Whether or not the device is currently down. | 
**restriping** | **Boolean** | Whether or not the device is currently being repaired. | 
**smartfailed** | **Boolean** | Whether or not the device is currently smartfailed. | 
**type** | [**TypeEnum**](#TypeEnum) | The type of affected device. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NODE | &quot;node&quot;
DRIVE | &quot;drive&quot;



