
# CloudAccount

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



