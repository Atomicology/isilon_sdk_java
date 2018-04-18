
# LicenseLicense

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**daysSinceExpiry** | **Integer** | Number of days since a license expired. |  [optional]
**daysToExpiry** | **Integer** | Number of days before a license expires. |  [optional]
**expiration** | **String** | Date of license expiry. Format is YYYY-MM-DD. It is not included if there is no expiration. Feature is considered expired at end of this day. The cluster time is used to determine expiry. |  [optional]
**expiredAlert** | **Boolean** | True when we are generating an alert that this feature has expired. | 
**expiringAlert** | **Boolean** | True when we are generating an alert that this feature is expiring. | 
**id** | **String** | Name of the licensed feature. | 
**name** | **String** | Name of the licensed feature. | 
**status** | [**StatusEnum**](#StatusEnum) | Current status of the license. | 
**tiers** | [**List&lt;LicenseLicenseTier&gt;**](LicenseLicenseTier.md) | Tiered License details. | 


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNLICENSED | &quot;Unlicensed&quot;
LICENSED | &quot;Licensed&quot;
EXPIRED | &quot;Expired&quot;
EVALUATION | &quot;Evaluation&quot;
EVALUATION_EXPIRED | &quot;Evaluation Expired&quot;



