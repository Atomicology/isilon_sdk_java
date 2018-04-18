
# EventEventgroupOccurrencesEventgroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**causes** | [**List&lt;List&lt;String&gt;&gt;**](List.md) | List of eventgroup IDs that may be causes of this occurrence. |  [optional]
**channels** | **List&lt;String&gt;** | List of channels to which alerts are configured for this eventgroup |  [optional]
**eventCount** | **Integer** | Number of events linked to this eventgroup. |  [optional]
**eventgroupInstance** | **String** | Unique identifier of eventgroup instance. |  [optional]
**id** | **String** | Same as eventgroup_instance. |  [optional]
**ignore** | **Boolean** | True if eventgroup is marked as &#39;ignore&#39;. |  [optional]
**ignoreTime** | **Integer** | Time eventgroup was marked as &#39;ignore&#39;. |  [optional]
**lastEvent** | **Integer** | Time the most recent event was added to this eventgroup. |  [optional]
**resolveTime** | **Integer** | When the eventgroup became resolved. |  [optional]
**resolved** | **Boolean** | True if eventgroup is resolved. |  [optional]
**resolver** | **String** | &#39;USER&#39; if the eventgroup was marked resolved via PAPI &lt;event_instance&gt; if eventgroup was marked resolved as a result of an event. |  [optional]
**sequence** | **Integer** | XXX description needed. |  [optional]
**severity** | **String** | Event Group severity. |  [optional]
**specifier** | [**Empty**](Empty.md) | A collection of parameters defined per eventgroup_id. |  [optional]
**timeNoticed** | **Integer** | Time of first event linked to this eventgroup. |  [optional]



