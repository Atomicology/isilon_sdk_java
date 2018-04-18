
# HardwareFcportsNodeFcport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | The unique display id |  [optional]
**port** | **String** | Port ID |  [optional]
**rate** | [**RateEnum**](#RateEnum) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) | State of the port |  [optional]
**topology** | [**TopologyEnum**](#TopologyEnum) |  |  [optional]
**wwnn** | **String** | World wide node name of the port |  [optional]
**wwpn** | **String** | World wide port name of the port |  [optional]


<a name="RateEnum"></a>
## Enum: RateEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
_1 | &quot;1&quot;
_2 | &quot;2&quot;
_4 | &quot;4&quot;
_8 | &quot;8&quot;


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
ENABLE | &quot;enable&quot;
DISABLE | &quot;disable&quot;


<a name="TopologyEnum"></a>
## Enum: TopologyEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
PTP | &quot;ptp&quot;
LOOP | &quot;loop&quot;



