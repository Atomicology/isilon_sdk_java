
# SyncRuleExtendedExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | User-entered description of this performance rule. |  [optional]
**enabled** | **Boolean** | Whether this performance rule is currently in effect during its specified intervals. |  [optional]
**id** | **String** | The system ID given to this performance rule. |  [optional]
**limit** | **Integer** | Amount the specified system resource type is limited by this rule.  Units are kb/s for bandwidth, files/s for file-count, processing percentage used for cpu, or percentage of maximum available workers. |  [optional]
**schedule** | [**SyncRuleSchedule**](SyncRuleSchedule.md) | A schedule defining when during a week this performance rule is in effect.  If unspecified or null, the schedule will always be in effect. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of system resource this rule limits. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
BANDWIDTH | &quot;bandwidth&quot;
FILE_COUNT | &quot;file_count&quot;
CPU | &quot;cpu&quot;
WORKER | &quot;worker&quot;



