
# ClusterFirmwareStatusNodeDevice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**device** | **String** | The name of the device. |  [optional]
**mismatch** | **Boolean** | Is the firmware up-to-date for this component. |  [optional]
**targetVersion** | **String** | The target firmware version. |  [optional]
**type** | **String** | The device type. |  [optional]
**upgradeStatus** | **String** | The current state of the firmware upgrade for this component. One of the following values: &#39;queued&#39;, &#39;upgrading&#39;, &#39;upgraded&#39;, &#39;error&#39;. or &#39;null&#39;.&#39;null&#39; indicates that the upgrade status is unknown. |  [optional]
**version** | **String** | The current firmware version. |  [optional]



