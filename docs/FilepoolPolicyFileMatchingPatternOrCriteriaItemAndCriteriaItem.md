
# FilepoolPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeExists** | **Boolean** | Indicates whether the existence of an attribute indicates a match (valid only with &#39;type&#39; &#x3D; &#39;custom_attribute&#39;) |  [optional]
**beginsWith** | **Boolean** | True to match files recursively under the given path. (valid only with &#39;type&#39; &#x3D; &#39;path&#39;) |  [optional]
**caseSensitive** | **Boolean** | True to indicate case sensitivity when comparing file attributes (valid only with &#39;type&#39; &#x3D; &#39;name&#39; or &#39;type&#39; &#x3D; &#39;path&#39;) |  [optional]
**field** | **String** | File attribute field name to be compared in a custom comparison (valid only with &#39;type&#39; &#x3D; &#39;custom_attribute&#39;) |  [optional]
**operator** | **String** | The comparison operator to use while comparing an attribute with its value |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The file attribute to be compared to a given value | 
**units** | **String** | Size unit value. One of &#39;B&#39;,&#39;KB&#39;,&#39;MB&#39;,&#39;GB&#39;,&#39;TB&#39;,&#39;PB&#39;,&#39;EB&#39; (valid only with &#39;type&#39; &#x3D; &#39;size&#39;) |  [optional]
**useRelativeTime** | **Boolean** | Whether time units refer to a calendar date and time (e.g., Jun 3, 2009) or a relative duration (e.g., 2 weeks) (valid only with &#39;type&#39; in {accessed_time, birth_time, changed_time or metadata_changed_time} |  [optional]
**value** | **String** | The value to be compared against a file attribute |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NAME | &quot;name&quot;
PATH | &quot;path&quot;
LINK_COUNT | &quot;link_count&quot;
ACCESSED_TIME | &quot;accessed_time&quot;
BIRTH_TIME | &quot;birth_time&quot;
CHANGED_TIME | &quot;changed_time&quot;
METADATA_CHANGED_TIME | &quot;metadata_changed_time&quot;
SIZE | &quot;size&quot;
FILE_TYPE | &quot;file_type&quot;
CUSTOM_ATTRIBUTE | &quot;custom_attribute&quot;



