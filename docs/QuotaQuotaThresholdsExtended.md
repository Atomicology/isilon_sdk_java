
# QuotaQuotaThresholdsExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advisory** | **Integer** | Usage bytes at which notifications will be sent but writes will not be denied. |  [optional]
**hard** | **Integer** | Usage bytes at which further writes will be denied. |  [optional]
**soft** | **Integer** | Usage bytes at which notifications will be sent and soft grace time will be started. |  [optional]
**softGrace** | **Integer** | Time in seconds after which the soft threshold has been hit before writes will be denied. |  [optional]
**advisoryExceeded** | **Boolean** | True if the advisory threshold has been hit. |  [optional]
**advisoryLastExceeded** | **Integer** | Time at which advisory threshold was hit. |  [optional]
**hardExceeded** | **Boolean** | True if the hard threshold has been hit. |  [optional]
**hardLastExceeded** | **Integer** | Time at which hard threshold was hit. |  [optional]
**softExceeded** | **Boolean** | True if the soft threshold has been hit. |  [optional]
**softLastExceeded** | **Integer** | Time at which soft threshold was hit |  [optional]



