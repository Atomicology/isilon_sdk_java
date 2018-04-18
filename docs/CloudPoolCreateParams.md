
# CloudPoolCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **List&lt;String&gt;** | A list of valid names for the accounts in this pool.  There is currently only one account allowed per pool. | 
**birthClusterId** | **String** | The guid of the cluster where this pool was created |  [optional]
**description** | **String** | A brief description of this pool |  [optional]
**name** | **String** | A unique name for this pool | 
**vendor** | **String** | A string identifier of the cloud services vendor |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3 | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ISILON | &quot;isilon&quot;
ECS | &quot;ecs&quot;
VIRTUSTREAM | &quot;virtustream&quot;
AZURE | &quot;azure&quot;
S3 | &quot;s3&quot;
RAN | &quot;ran&quot;
ECS2 | &quot;ecs2&quot;



