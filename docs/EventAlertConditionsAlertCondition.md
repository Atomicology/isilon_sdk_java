
# EventAlertConditionsAlertCondition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**categories** | [**List&lt;CategoriesEnum&gt;**](#List&lt;CategoriesEnum&gt;) | Event Group categories to be alerted: all, 100000000 (SYS_DISK_EVENTS), 200000000 (NODE_STATUS_EVENTS), 300000000 (REBOOT_EVENTS), 400000000 (SW_EVENTS), 500000000 (QUOTA_EVENTS), 600000000 (SNAP_EVENTS), 700000000 (WINNET_EVENTS), 800000000 (FILESYS_EVENTS), 900000000 (HW_EVENTS), 1100000000 (CPOOL_EVENTS) |  [optional]
**channels** | **List&lt;String&gt;** | Channels for alert |  [optional]
**condition** | [**ConditionEnum**](#ConditionEnum) | Trigger condition for alert |  [optional]
**eventgroupIds** | **List&lt;String&gt;** | Event Group IDs to be alerted |  [optional]
**id** | **String** | Unique identifier. |  [optional]
**interval** | **Integer** | Required with ONGOING condition only, period in seconds between alerts of ongoing conditions |  [optional]
**limit** | **Integer** | Required with NEW EVENTS condition only, limits the number of alerts sent as events are added |  [optional]
**name** | **String** | Unique identifier. |  [optional]
**severities** | [**List&lt;SeveritiesEnum&gt;**](#List&lt;SeveritiesEnum&gt;) | Severities to be alerted |  [optional]
**_transient** | **Integer** | Any eventgroup lasting less than this many seconds is deemed transient and will not generate alerts under this condition. |  [optional]


<a name="List<CategoriesEnum>"></a>
## Enum: List&lt;CategoriesEnum&gt;
Name | Value
---- | -----
ALL | &quot;all&quot;
SYS_DISK_EVENTS | &quot;SYS_DISK_EVENTS&quot;
_100000000 | &quot;100000000&quot;
NODE_STATUS_EVENTS | &quot;NODE_STATUS_EVENTS&quot;
_200000000 | &quot;200000000&quot;
REBOOT_EVENTS | &quot;REBOOT_EVENTS&quot;
_300000000 | &quot;300000000&quot;
SW_EVENTS | &quot;SW_EVENTS&quot;
_400000000 | &quot;400000000&quot;
QUOTA_EVENTS | &quot;QUOTA_EVENTS&quot;
_500000000 | &quot;500000000&quot;
SNAP_EVENTS | &quot;SNAP_EVENTS&quot;
_600000000 | &quot;600000000&quot;
WINNET_EVENTS | &quot;WINNET_EVENTS&quot;
_700000000 | &quot;700000000&quot;
FILESYS_EVENTS | &quot;FILESYS_EVENTS&quot;
_800000000 | &quot;800000000&quot;
HW_EVENTS | &quot;HW_EVENTS&quot;
_900000000 | &quot;900000000&quot;
CPOOL_EVENTS | &quot;CPOOL_EVENTS&quot;
_1100000000 | &quot;1100000000&quot;


<a name="ConditionEnum"></a>
## Enum: ConditionEnum
Name | Value
---- | -----
NEW | &quot;NEW&quot;
NEW_EVENTS | &quot;NEW EVENTS&quot;
ONGOING | &quot;ONGOING&quot;
SEVERITY_INCREASE | &quot;SEVERITY INCREASE&quot;
SEVERITY_DECREASE | &quot;SEVERITY DECREASE&quot;
RESOLVED | &quot;RESOLVED&quot;


<a name="List<SeveritiesEnum>"></a>
## Enum: List&lt;SeveritiesEnum&gt;
Name | Value
---- | -----
EMERGENCY | &quot;emergency&quot;
CRITICAL | &quot;critical&quot;
WARNING | &quot;warning&quot;
INFORMATION | &quot;information&quot;



