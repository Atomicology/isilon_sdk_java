
# SyncJobPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributeExists** | **Boolean** | For \&quot;custom_attribute\&quot; type criteria.  The file will match as long as the attribute named by \&quot;field\&quot; exists.  Default is true. |  [optional]
**caseSensitive** | **Boolean** | If true, the value comparison will be case sensitive.  Default is true. |  [optional]
**field** | **String** | The name of the file attribute to match on (only required if this is a custom_attribute type criterion).  Default is an empty string \&quot;\&quot;. |  [optional]
**operator** | [**OperatorEnum**](#OperatorEnum) | How to compare the specified attribute of each file to the specified value. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of this criterion, that is, which file attribute to match on. | 
**value** | **String** | The value to compare the specified attribute of each file to. |  [optional]
**wholeWord** | **Boolean** | If true, the attribute must match the entire word.  Default is true. |  [optional]


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
_ | &quot;&#x3D;&#x3D;&quot;
NOT_EQUAL | &quot;!&#x3D;&quot;
GREATER_THAN | &quot;&gt;&quot;
GREATER_THAN_OR_EQUAL_TO | &quot;&gt;&#x3D;&quot;
LESS_THAN | &quot;&lt;&quot;
LESS_THAN_OR_EQUAL_TO | &quot;&lt;&#x3D;&quot;
EXCLAMATION | &quot;!&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
NAME | &quot;name&quot;
PATH | &quot;path&quot;
ACCESSED_TIME | &quot;accessed_time&quot;
ACCESSED_BEFORE | &quot;accessed_before&quot;
ACCESSED_AFTER | &quot;accessed_after&quot;
BIRTH_TIME | &quot;birth_time&quot;
BIRTH_BEFORE | &quot;birth_before&quot;
BIRTH_AFTER | &quot;birth_after&quot;
CHANGED_TIME | &quot;changed_time&quot;
CHANGED_BEFORE | &quot;changed_before&quot;
CHANGED_AFTER | &quot;changed_after&quot;
SIZE | &quot;size&quot;
FILE_TYPE | &quot;file_type&quot;
POSIX_REGEX_NAME | &quot;posix_regex_name&quot;
USER_NAME | &quot;user_name&quot;
USER_ID | &quot;user_id&quot;
GROUP_NAME | &quot;group_name&quot;
GROUP_ID | &quot;group_id&quot;
NO_USER | &quot;no_user&quot;
NO_GROUP | &quot;no_group&quot;



