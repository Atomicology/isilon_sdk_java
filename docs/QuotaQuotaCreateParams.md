
# QuotaQuotaCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | **Boolean** | If true, SMB shares using the quota directory see the quota thresholds as share size. |  [optional]
**enforced** | **Boolean** | True if the quota provides enforcement, otherwise a accounting quota. | 
**force** | **Boolean** | Force creation of quotas on the root of /ifs. |  [optional]
**includeSnapshots** | **Boolean** | If true, quota governs snapshot data as well as head data. | 
**path** | **String** | The /ifs path governed. | 
**persona** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**thresholds** | [**QuotaQuotaThresholds**](QuotaQuotaThresholds.md) |  |  [optional]
**thresholdsIncludeOverhead** | **Boolean** | If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. &#39;physical&#39; usage). | 
**type** | [**TypeEnum**](#TypeEnum) | The type of quota. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DIRECTORY | &quot;directory&quot;
USER | &quot;user&quot;
GROUP | &quot;group&quot;
DEFAULT_USER | &quot;default-user&quot;
DEFAULT_GROUP | &quot;default-group&quot;



