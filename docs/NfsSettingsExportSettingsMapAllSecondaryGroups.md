
# NfsSettingsExportSettingsMapAllSecondaryGroups

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Specifies the serialized form of a persona, which can be &#39;UID:0&#39;, &#39;USER:name&#39;, &#39;GID:0&#39;, &#39;GROUP:wheel&#39;, or &#39;SID:S-1-1&#39;. |  [optional]
**name** | **String** | Specifies the persona name, which must be combined with a type. |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Specifies the type of persona, which must be combined with a name. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
USER | &quot;user&quot;
GROUP | &quot;group&quot;
WELLKNOWN | &quot;wellknown&quot;



