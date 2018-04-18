
# JobJobPrepairParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mappingType** | [**MappingTypeEnum**](#MappingTypeEnum) | Type of permissions; not accepted with mode&#x3D;clone or mode&#x3D;inherit. |  [optional]
**mode** | [**ModeEnum**](#ModeEnum) | Type of PermissionRepair operation. | 
**template** | **String** | IFS file or directory to use as a template; required with mode&#x3D;clone and mode&#x3D;inherit, not accepted with mode&#x3D;convert. |  [optional]
**zone** | **String** | Authentication zone; not accepted with mode&#x3D;clone or mode&#x3D;inherit. |  [optional]


<a name="MappingTypeEnum"></a>
## Enum: MappingTypeEnum
Name | Value
---- | -----
GLOBAL | &quot;global&quot;
SID | &quot;sid&quot;
UNIX | &quot;unix&quot;
NATIVE | &quot;native&quot;


<a name="ModeEnum"></a>
## Enum: ModeEnum
Name | Value
---- | -----
CLONE | &quot;clone&quot;
INHERIT | &quot;inherit&quot;
CONVERT | &quot;convert&quot;



