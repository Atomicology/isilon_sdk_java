
# CloudJobFiles

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fileMatchingPattern** | [**Empty**](Empty.md) | The file filtering logic to find files for this job |  [optional]
**names** | [**List&lt;CloudJobFilesName&gt;**](CloudJobFilesName.md) | A list of files to be addressed by this job.  (Note* these are only reported when audit_level is &#39;high&#39; |  [optional]
**total** | **Integer** | The total number of files addressed by this job |  [optional]
**totalCanceled** | **Integer** | The number of canceled files |  [optional]
**totalFailed** | **Integer** | The number of files which failed |  [optional]
**totalPending** | **Integer** | The number of files pending action |  [optional]
**totalProcessing** | **Integer** | The number of files currently being processed |  [optional]
**totalSucceeded** | **Integer** | The total number of files successfully completed |  [optional]



