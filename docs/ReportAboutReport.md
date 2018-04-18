
# ReportAboutReport

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generated** | [**GeneratedEnum**](#GeneratedEnum) | Whether report was manually requested (live) or scheduled. | 
**id** | **String** | The system ID given to the report. | 
**time** | **Integer** | Unix epoch time the report was taken. | 
**type** | [**TypeEnum**](#TypeEnum) | Whether this is a summary or detail report. | 


<a name="GeneratedEnum"></a>
## Enum: GeneratedEnum
Name | Value
---- | -----
MANUAL | &quot;manual&quot;
SCHEDULED | &quot;scheduled&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
SUMMARY | &quot;summary&quot;
DETAIL | &quot;detail&quot;



