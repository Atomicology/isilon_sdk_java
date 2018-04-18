
# ClusterFirmwareUpgradeItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**excludeDevice** | **String** | Exclude the specified devices in the firmware upgrade. |  [optional]
**excludeType** | **String** | Exclude the specified device type in the firmware upgrade. |  [optional]
**includeDevice** | **String** | Include the specified devices in the firmware upgrade. |  [optional]
**includeType** | **String** | Include the specified device type in the firmware upgrade. |  [optional]
**noBurn** | **Boolean** | Do not burn the firmware. |  [optional]
**noReboot** | **Boolean** | Do not reboot the node after an upgrade |  [optional]
**noVerify** | **Boolean** | Do not verify the firmware upgrade after an upgrade. |  [optional]
**nodesToUpgrade** | **List&lt;Integer&gt;** | The nodes scheduled for upgrade. Order in array determines queue position number. &#39;All&#39; and null option will upgrade all nodes in &lt;lnn&gt; order. |  [optional]



