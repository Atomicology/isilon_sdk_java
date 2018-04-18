
# SummaryDriveDriveItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessLatency** | [**BigDecimal**](BigDecimal.md) | The average operation latency. | 
**accessSlow** | [**BigDecimal**](BigDecimal.md) | The rate of slow (long-latency) operations. | 
**busy** | [**BigDecimal**](BigDecimal.md) | The percentage of time the drive was busy. | 
**bytesIn** | [**BigDecimal**](BigDecimal.md) | The rate of bytes written. | 
**bytesOut** | [**BigDecimal**](BigDecimal.md) | The rate of bytes read. | 
**driveId** | **String** | Drive ID LNN:bay. | 
**ioschedLatency** | [**BigDecimal**](BigDecimal.md) | The average time spent in the I/O scheduler. | 
**ioschedQueue** | [**BigDecimal**](BigDecimal.md) | The average length of the I/O scheduler queue. | 
**time** | **Integer** | Unix Epoch time in seconds of the request. | 
**type** | **String** | The type of the drive. | 
**usedBytesPercent** | [**BigDecimal**](BigDecimal.md) | The percent of blocks used on the drive. | 
**usedInodes** | [**BigDecimal**](BigDecimal.md) | The number of inodes allocated on the drive. | 
**xferSizeIn** | [**BigDecimal**](BigDecimal.md) | The average size of write operations. | 
**xferSizeOut** | [**BigDecimal**](BigDecimal.md) | The average size of read operations. | 
**xfersIn** | [**BigDecimal**](BigDecimal.md) | The rate of write operations. | 
**xfersOut** | [**BigDecimal**](BigDecimal.md) | The rate of read operations. | 



