
# SummaryWorkloadWorkloadItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cpu** | [**BigDecimal**](BigDecimal.md) | The number (across all cores) of micro-seconds per second. | 
**jobType** | **String** | The canonical name for the job followed by phase in brackets, ie. &#39;AVscan[1]&#39;, etc... |  [optional]
**l2** | [**BigDecimal**](BigDecimal.md) | L2 cache hits per second. | 
**l3** | [**BigDecimal**](BigDecimal.md) | L3 cache hits per second. | 
**node** | [**BigDecimal**](BigDecimal.md) | The node on which the operation was performed. | 
**reads** | [**BigDecimal**](BigDecimal.md) | Disk read operations per second. | 
**systemName** | **String** | The process name, job ID, etc... |  [optional]
**writes** | [**BigDecimal**](BigDecimal.md) | Disk write operations per second. | 



