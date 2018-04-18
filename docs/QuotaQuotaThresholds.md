
# QuotaQuotaThresholds

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**advisory** | **Integer** | Usage bytes at which notifications will be sent but writes will not be denied. |  [optional]
**hard** | **Integer** | Usage bytes at which further writes will be denied. |  [optional]
**soft** | **Integer** | Usage bytes at which notifications will be sent and soft grace time will be started. |  [optional]
**softGrace** | **Integer** | Time in seconds after which the soft threshold has been hit before writes will be denied. |  [optional]



