
# CloudJobCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **List&lt;String&gt;** | The names of accounts for COI restore |  [optional]
**directories** | **List&lt;String&gt;** | Directories addressed by this job |  [optional]
**expirationDate** | **Integer** | The new expiration date in seconds |  [optional]
**fileMatchingPattern** | [**Empty**](Empty.md) | The file filtering logic to find files for this job. (Only applicable for &#39;recall&#39; jobs) |  [optional]
**files** | **List&lt;String&gt;** | Filenames addressed by this job |  [optional]
**policy** | **String** | The name of an existing cloudpool policy to apply to this job. (Only applicable for &#39;archive&#39; jobs) |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of cloud action to be performed by this job. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ARCHIVE | &quot;archive&quot;
RECALL | &quot;recall&quot;
LOCAL_GARBAGE_COLLECTION | &quot;local-garbage-collection&quot;
CLOUD_GARBAGE_COLLECTION | &quot;cloud-garbage-collection&quot;
CACHE_WRITEBACK | &quot;cache-writeback&quot;
CACHE_ON_ACCESS | &quot;cache-on-access&quot;
CACHE_INVALIDATION | &quot;cache-invalidation&quot;
RESTORE_COI | &quot;restore-coi&quot;



