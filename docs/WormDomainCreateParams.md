
# WormDomainCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**autocommitOffset** | **Integer** | Specifies the autocommit time period for the domain in seconds.  After a file is in the domain without being modified for the specified time period, the file is automatically committed. If this parameter is set to null, there is no autocommit time, and files must be committed manually. |  [optional]
**defaultRetention** | **String** |  |  [optional]
**maxRetention** | **String** |  |  [optional]
**minRetention** | **String** |  |  [optional]
**overrideDate** | **Integer** | Specifies the override retention date for the domain. If this date is later than the retention date for any committed file, the file will remain protected until the override retention date. |  [optional]
**privilegedDelete** | [**PrivilegedDeleteEnum**](#PrivilegedDeleteEnum) | When this value is set to &#39;on&#39;, files in this domain can be deleted through the privileged delete feature. If this value is set to &#39;disabled&#39;, privileged file deletes are permanently disabled and cannot be turned on again. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Specifies whether the domain is an enterprise domain or a compliance domain. Compliance domains can not be created on enterprise clusters. Enterprise and compliance domains can be created on compliance clusters. |  [optional]
**path** | **String** | Specifies the root path of this domain. Files in this directory and all sub-directories will be protected. | 


<a name="PrivilegedDeleteEnum"></a>
## Enum: PrivilegedDeleteEnum
Name | Value
---- | -----
ON | &quot;on&quot;
OFF | &quot;off&quot;
DISABLED | &quot;disabled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ENTERPRISE | &quot;enterprise&quot;
COMPLIANCE | &quot;compliance&quot;
COMPLIANCE_LEGACY_ | &quot;compliance (legacy)&quot;



