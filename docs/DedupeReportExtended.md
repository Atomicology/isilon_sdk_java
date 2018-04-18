
# DedupeReportExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dedupePercent** | **String** | The amount of space the directory trees under this job&#39;s paths now take up, compared to what they would take up if not deduplicated (0 ~ 100). |  [optional]
**elapsedTime** | **Integer** | The amount of time in seconds it took to run this job. |  [optional]
**id** | **Integer** | An unique identifier for this report. |  [optional]
**jobId** | **Integer** | The job id this report refers to. |  [optional]
**jobType** | **String** | The type of dedupe job this report refers to. |  [optional]
**reports** | [**List&lt;DedupeReport&gt;**](DedupeReport.md) | A list of report entries for this dedupe job. |  [optional]



