
# AntivirusServerExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description for the server. |  [optional]
**enabled** | **Boolean** | Whether the server is enabled. |  [optional]
**url** | **String** | The icap url for the server.  This should have a format of: icap://host.domain:port/path |  [optional]
**definitions** | **String** |  |  [optional]
**id** | **String** | A unique identifier for the server. |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | The status of the server. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACTIVE | &quot;active&quot;
INACTIVE | &quot;inactive&quot;



