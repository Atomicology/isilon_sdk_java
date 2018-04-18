
# SummaryClientClientItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**propertyClass** | **String** | The class of the operation. | 
**in** | [**BigDecimal**](BigDecimal.md) | Rate of input (in bytes/second) for an operation since the last time isi statistics collected the data. | 
**inAvg** | [**BigDecimal**](BigDecimal.md) | Average input (received) bytes for an operation, in bytes. | 
**inMax** | [**BigDecimal**](BigDecimal.md) | Maximum input (received) bytes for an operation, in bytes. | 
**inMin** | [**BigDecimal**](BigDecimal.md) | Minimum input (received) bytes for an operation, in bytes. | 
**localAddr** | **String** | The IP address (in dotted-quad form) of the host receiving the operation request. | 
**localName** | **String** | The resolved text name of the LocalAddr, if resolution can be performed. | 
**node** | **Integer** | The node on which the operation was performed. |  [optional]
**numOperations** | **Integer** | The number of times an operation has been performed. | 
**operationRate** | [**BigDecimal**](BigDecimal.md) | The rate (in ops/second) at which an operation has been performed. | 
**out** | [**BigDecimal**](BigDecimal.md) | Rate of output (in bytes/second) for an operation since the last time isi statistics collected the data. | 
**outAvg** | [**BigDecimal**](BigDecimal.md) | Average output (sent) bytes for an operation, in bytes. | 
**outMax** | [**BigDecimal**](BigDecimal.md) | Maximum output (sent) bytes for an operation, in bytes. | 
**outMin** | [**BigDecimal**](BigDecimal.md) | Minimum output (sent) bytes for an operation, in bytes. | 
**protocol** | **String** | The protocol of the operation. | 
**remoteAddr** | **String** | The IP address (in dotted-quad form) of the host sending the operation request. | 
**remoteName** | **String** | The resolved text name of the RemoteAddr, if resolution can be performed. | 
**time** | **Integer** | Unix Epoch time in seconds of the request. | 
**timeAvg** | [**BigDecimal**](BigDecimal.md) | The average elapsed time (in microseconds) taken to complete an operation. | 
**timeMax** | [**BigDecimal**](BigDecimal.md) | The maximum elapsed time (in microseconds) taken to complete an operation. | 
**timeMin** | [**BigDecimal**](BigDecimal.md) | The minimum elapsed time (in microseconds) taken to complete an operation. | 
**user** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]



