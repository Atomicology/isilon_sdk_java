
# MappingIdentityTargetCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**onDisk** | **Boolean** | Identity is preferred on-disk. |  [optional]
**target** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md) | Specifies properties for a persona, which consists of either a &#39;type&#39; and a &#39;name&#39; or an &#39;ID&#39;. | 
**type** | [**TypeEnum**](#TypeEnum) | Origin of identity mapping. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
EXTERNAL | &quot;external&quot;
MANUAL | &quot;manual&quot;



