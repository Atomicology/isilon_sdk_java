
# QuotaQuotaExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**container** | **Boolean** | If true, SMB shares using the quota directory see the quota thresholds as share size. | 
**enforced** | **Boolean** | True if the quota provides enforcement, otherwise a accounting quota. | 
**id** | **String** | The system ID given to the quota. | 
**includeSnapshots** | **Boolean** | If true, quota governs snapshot data as well as head data. | 
**linked** | **Boolean** | For user and group quotas, true if the quota is linked and controlled by a parent default-* quota. Linked quotas cannot be modified until they are unlinked. |  [optional]
**notifications** | [**NotificationsEnum**](#NotificationsEnum) | Summary of notifications: &#39;custom&#39; indicates one or more notification rules available from the notifications sub-resource; &#39;default&#39; indicates system default rules are used; &#39;disabled&#39; indicates that no notifications will be used for this quota. | 
**path** | **String** | The /ifs path governed. | 
**persona** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. |  [optional]
**ready** | **Boolean** | True if the accounting is accurate on the quota.  If false, this quota is waiting on completion of a QuotaScan job. | 
**thresholds** | [**QuotaQuotaThresholdsExtended**](QuotaQuotaThresholdsExtended.md) |  | 
**thresholdsIncludeOverhead** | **Boolean** | If true, thresholds apply to data plus filesystem overhead required to store the data (i.e. &#39;physical&#39; usage). | 
**type** | [**TypeEnum**](#TypeEnum) | The type of quota. | 
**usage** | [**QuotaQuotaUsage**](QuotaQuotaUsage.md) |  | 


<a name="NotificationsEnum"></a>
## Enum: NotificationsEnum
Name | Value
---- | -----
CUSTOM | &quot;custom&quot;
DEFAULT | &quot;default&quot;
DISABLED | &quot;disabled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
DIRECTORY | &quot;directory&quot;
USER | &quot;user&quot;
GROUP | &quot;group&quot;
DEFAULT_USER | &quot;default-user&quot;
DEFAULT_GROUP | &quot;default-group&quot;



