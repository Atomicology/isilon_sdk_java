
# SummaryProtocolProtocolItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyClass** | **String** | The class of the operation. | 
**in** | [**BigDecimal**](BigDecimal.md) | Rate of input (in bytes/second) for an operation since the last time isi statistics collected the data. | 
**inAvg** | [**BigDecimal**](BigDecimal.md) | Average input (received) bytes for an operation, in bytes. | 
**inMax** | [**BigDecimal**](BigDecimal.md) | Maximum input (received) bytes for an operation, in bytes. | 
**inMin** | [**BigDecimal**](BigDecimal.md) | Minimum input (received) bytes for an operation, in bytes. | 
**inStandardDev** | [**BigDecimal**](BigDecimal.md) | Standard deviation for input (received) bytes for an operation, in bytes. | 
**node** | **Integer** | The node on which the operation was performed. |  [optional]
**operation** | **String** | The operation performed. | 
**operationCount** | **Integer** | The number of times an operation has been performed. | 
**operationRate** | [**BigDecimal**](BigDecimal.md) | The rate (in ops/second) at which an operation has been performed. | 
**out** | [**BigDecimal**](BigDecimal.md) | Rate of output (in bytes/second) for an operation since the last time isi statistics collected the data. | 
**outAvg** | [**BigDecimal**](BigDecimal.md) | Average output (sent) bytes for an operation, in bytes. | 
**outMax** | [**BigDecimal**](BigDecimal.md) | Maximum output (sent) bytes for an operation, in bytes. | 
**outMin** | [**BigDecimal**](BigDecimal.md) | Minimum output (sent) bytes for an operation, in bytes. | 
**outStandardDev** | [**BigDecimal**](BigDecimal.md) | Standard deviation for output (received) bytes for an operation, in bytes. | 
**protocol** | **String** | The protocol of the operation. | 
**time** | **Integer** | Unix Epoch time in seconds of the request. | 
**timeAvg** | [**BigDecimal**](BigDecimal.md) | The average elapsed time (in microseconds) taken to complete an operation. | 
**timeMax** | [**BigDecimal**](BigDecimal.md) | The maximum elapsed time (in microseconds) taken to complete an operation. | 
**timeMin** | [**BigDecimal**](BigDecimal.md) | The minimum elapsed time (in microseconds) taken to complete an operation. | 
**timeStandardDev** | [**BigDecimal**](BigDecimal.md) | The standard deviation time (in microseconds) taken to complete an operation. | 



