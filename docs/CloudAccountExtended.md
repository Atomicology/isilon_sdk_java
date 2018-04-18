
# CloudAccountExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | (S3 only) The user id of the S3 account |  [optional]
**accountUsername** | **String** | The username required to authenticate against the cloud service |  [optional]
**birthClusterId** | **String** | The guid of the cluster where this account was created |  [optional]
**enabled** | **Boolean** | Whether this account is explicitly enabled or disabled by a user |  [optional]
**key** | **String** | A valid authentication key for connecting to the cloud |  [optional]
**name** | **String** | A unique name for this account |  [optional]
**proxy** | **String** | The id or name of a proxy to be used by this account |  [optional]
**skipAccountCheck** | **Boolean** | (Not recommended) Indicates whether to skip validation that the cloud account is still accessible |  [optional]
**skipSslValidation** | **Boolean** | Indicates whether to skip SSL certificate validation when connecting to the cloud |  [optional]
**storageRegion** | **String** | (S3 only) An appropriate region for the S3 account.  For example, faster access times may be gained by referencing a nearby region |  [optional]
**telemetryBucket** | **String** | (S3 only) The name of the bucket into which generated metrics reports are placed by the cloud service provider |  [optional]
**uri** | **String** | A valid URI pointing to the location of the cloud storage |  [optional]
**bucket** | **String** | The machine generated name of the account bucket to store data |  [optional]
**id** | **String** | A globally unique name for this account |  [optional]
**metadataBucket** | **String** | The machine generated name of the account bucket to store metadata |  [optional]
**pool** | **String** | Name of the pool referencing this account.  Empty if none. |  [optional]
**state** | [**StateEnum**](#StateEnum) | Indicates whether this account is in a good state (\&quot;OK\&quot;), disabled (\&quot;disabled\&quot;) or inaccessible via the network (\&quot;unreachable\&quot;) |  [optional]
**stateDetails** | **String** | Gives further information to describe the state of this account |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of cloud protocol required.  E.g., \&quot;isilon\&quot; for EMC Isilon, \&quot;ecs\&quot; for EMC ECS Appliance, \&quot;virtustream\&quot; for Virtustream Storage Cloud, \&quot;azure\&quot; for Microsoft Azure and \&quot;s3\&quot; for Amazon S3 |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
DISABLED | &quot;disabled&quot;
UNREACHABLE | &quot;unreachable&quot;


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



