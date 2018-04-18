
# AntivirusQuarantine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**file** | **String** | Path of this file, starting with /ifs. | 
**lastIstag** | **String** |  |  [optional]
**lastScan** | **Integer** |  |  [optional]
**quarantined** | **Boolean** | If true, this file is quarantined.  If false, the file is not quarantined. | 
**scanResult** | **String** | The result of the last scan on this file.  This string is usually one of: never_scanned, clean, quarantined, repaired, truncated, infected_no_action_taken, skipped_per_settings.  However, a longer string starting with &#39;unknown_status&#39; and describing the details can also appear in uncommon edge cases. | 
**scanStatus** | [**ScanStatusEnum**](#ScanStatusEnum) | The scanning status of this file.  If &#39;current&#39;, the file was scanned with the most up-to-date virus definitions.  If &#39;not_current&#39;, it has either not been scanned, been modified since the last scan, or the virus definitions are not current. | 


<a name="ScanStatusEnum"></a>
## Enum: ScanStatusEnum
Name | Value
---- | -----
CURRENT | &quot;current&quot;
NOT_CURRENT | &quot;not_current&quot;



