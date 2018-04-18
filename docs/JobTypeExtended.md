
# JobTypeExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enabled** | **Boolean** | Whether the job type is enabled and able to run. | 
**policy** | **String** | Default impact policy of this job type. | 
**priority** | **Integer** | Default priority of this job type; lower numbers preempt higher numbers. | 
**schedule** | **String** | The schedule on which this job type is queued, if any. |  [optional]
**allowMultipleInstances** | **Boolean** | Whether multiple instances of this job type may run simultaneously. | 
**description** | **String** | Brief description of the job type. | 
**exclusionSet** | **String** | The set(s) of mutually-exclusive job types to which this job belongs.  No job in this set may run with any other job in this set.  Obsolete; this value will always be an empty string, as exclusion sets are no longer a job type property. | 
**hidden** | **Boolean** | Whether this job type is normally visible in the UI. | 
**id** | **String** | Job type ID. | 



