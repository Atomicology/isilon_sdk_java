
# CloudAccountCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | (S3 only) The user id of the S3 account |  [optional]
**accountUsername** | **String** | The username required to authenticate against the cloud service | 
**birthClusterId** | **String** | The guid of the cluster where this account was created |  [optional]
**enabled** | **Boolean** | Whether this account is explicitly enabled or disabled by a user |  [optional]
**key** | **String** | A valid authentication key for connecting to the cloud | 
**name** | **String** | A unique name for this account | 
**proxy** | **String** | The id or name of a proxy to be used by this account |  [optional]
**skipSslValidation** | **Boolean** | Indicates whether to skip SSL certificate validation when connecting to the cloud |  [optional]
**storageRegion** | **String** | (S3 only) An appropriate region for the S3 account.  For example, faster access times may be gained by referencing a nearby region |  [optional]
**telemetryBucket** | **String** | (S3 only) The name of the bucket into which generated metrics reports are placed by the cloud service provider |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3 | 
**uri** | **String** | A valid URI pointing to the location of the cloud storage | 


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



