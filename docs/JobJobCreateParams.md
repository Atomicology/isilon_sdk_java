
# JobJobCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowDup** | **Boolean** | Whether or not to queue the job if one of the same type is already running or queued. |  [optional]
**avscanParams** | [**JobJobAvscanParams**](JobJobAvscanParams.md) |  |  [optional]
**changelistcreateParams** | [**JobJobChangelistcreateParams**](JobJobChangelistcreateParams.md) |  |  [optional]
**domainmarkParams** | [**JobJobDomainmarkParams**](JobJobDomainmarkParams.md) |  |  [optional]
**paths** | **List&lt;String&gt;** | For jobs which take paths, the IFS paths to pass to the job. | 
**policy** | **String** | Impact policy of this job instance. |  [optional]
**prepairParams** | [**JobJobPrepairParams**](JobJobPrepairParams.md) |  |  [optional]
**priority** | **Integer** | Priority of this job instance; lower numbers preempt higher numbers. |  [optional]
**smartpoolstreeParams** | [**JobJobSmartpoolstreeParams**](JobJobSmartpoolstreeParams.md) |  |  [optional]
**snaprevertParams** | [**JobJobSnaprevertParams**](JobJobSnaprevertParams.md) |  |  [optional]
**type** | **String** | Job type to queue. | 



