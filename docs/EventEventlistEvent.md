
# EventEventlistEvent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devid** | **Integer** | The device id of the node if it is still part of the cluster otherwise None. |  [optional]
**ended** | [**BigDecimal**](BigDecimal.md) | Time event was ended (eventgroup resolved) |  [optional]
**event** | **Integer** | Integer identifier of the event type |  [optional]
**id** | **String** | Unique identifier of event occurrence. |  [optional]
**lnn** | **Integer** | The lnn of the node if it is still part of the cluster, otherwise None. |  [optional]
**message** | **String** | Human readable description |  [optional]
**resolveTime** | **Integer** | Time the event was resolved. |  [optional]
**severity** | [**SeverityEnum**](#SeverityEnum) | Severity of event occurrence. |  [optional]
**specifier** | [**Empty**](Empty.md) | A collection of parameters defined per event. |  [optional]
**time** | **Integer** | Time event was detected as UNIX timestamp. |  [optional]
**value** | [**BigDecimal**](BigDecimal.md) | Value of measurement associated with this event. |  [optional]


<a name="SeverityEnum"></a>
## Enum: SeverityEnum
Name | Value
---- | -----
INFORMATION | &quot;information&quot;
WARNING | &quot;warning&quot;
CRITICAL | &quot;critical&quot;
EMERGENCY | &quot;emergency&quot;
UNKNOWN | &quot;unknown&quot;



