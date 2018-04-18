
# StatisticsHistoryStat

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**devid** | **Integer** | Devid of node of statistic or 0 for cluster scoped statistics. | 
**error** | **String** | Key specific error string, if applicable. |  [optional]
**errorCode** | **Integer** | Key specific error number, if applicable. |  [optional]
**key** | **String** | Key name of statistic. | 
**resolution** | **Integer** | The interval for which these results were figured (averaged against.) | 
**values** | [**List&lt;StatisticsHistoryStatValue&gt;**](StatisticsHistoryStatValue.md) | Time-series values. |  [optional]



