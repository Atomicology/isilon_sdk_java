
# QuotaQuota

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | **Boolean** | If true, SMB shares using the quota directory see the quota thresholds as share size. |  [optional]
**enforced** | **Boolean** | True if the quota provides enforcement, otherwise a accounting quota. |  [optional]
**linked** | **Boolean** | If false and the quota is linked, attempt to unlink. |  [optional]
**thresholds** | [**QuotaQuotaThresholds**](QuotaQuotaThresholds.md) |  |  [optional]
**thresholdsIncludeOverhead** | **Boolean** | If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. &#39;physical&#39; usage). |  [optional]



