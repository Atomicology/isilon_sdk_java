
# StatisticsKey

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**aggregationType** | [**AggregationTypeEnum**](#AggregationTypeEnum) | Type of aggregation used in down-sampling. | 
**baseName** | **String** | Name of key this keys is derived from, if any. |  [optional]
**defaultCacheTime** | **Integer** | Default time in seconds system will used cached values. | 
**description** | **String** | Description of statistics key. | 
**key** | **String** | Key name. | 
**policies** | [**List&lt;StatisticsKeyPolicy&gt;**](StatisticsKeyPolicy.md) | List of effective history policies for key. |  [optional]
**policyCacheTime** | **Integer** | Configured time in seconds system will used cached values. |  [optional]
**realName** | **String** | Name of real key if this is an alias. |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Scope of key. | 
**type** | **String** | Data type of key values. | 
**units** | **String** | Units of key values. | 


<a name="AggregationTypeEnum"></a>
## Enum: AggregationTypeEnum
Name | Value
---- | -----
LAST | &quot;last&quot;
MIN | &quot;min&quot;
MAX | &quot;max&quot;
AVG | &quot;avg&quot;
SUM | &quot;sum&quot;
CUSTOM | &quot;custom&quot;


<a name="ScopeEnum"></a>
## Enum: ScopeEnum
Name | Value
---- | -----
CLUSTER | &quot;cluster&quot;
NODE | &quot;node&quot;



