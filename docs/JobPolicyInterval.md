
# JobPolicyInterval

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**begin** | **String** | Beginning time for the corresponding impact, in the format &#39;WWWW HH:MM&#39;, where &#39;WWWW&#39; is the full English name of the day of the week, &#39;HH&#39; is the hour (00-23), and &#39;MM&#39; is the minute (00-59). | 
**end** | **String** | Ending time for the corresponding impact, in the format &#39;WWWW HH:MM&#39;, where &#39;WWWW&#39; is the full English name of the day of the week, &#39;HH&#39; is the hour (00-23), and &#39;MM&#39; is the minute (00-59). | 
**impact** | [**ImpactEnum**](#ImpactEnum) | Impact for the corresponding time span. | 


<a name="ImpactEnum"></a>
## Enum: ImpactEnum
Name | Value
---- | -----
LOW | &quot;Low&quot;
MEDIUM | &quot;Medium&quot;
HIGH | &quot;High&quot;
PAUSED | &quot;Paused&quot;



