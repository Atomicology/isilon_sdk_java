
# JobJobSummarySummary

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterIsDegraded** | **Boolean** | Whether the cluster is in a degraded state.  Note this is from the perspective of the node handling the query, which might be different from another node. | 
**connected** | **Boolean** | Whether isi_job_d instances on all up nodes in the cluster are connected to the coordinator. | 
**coordinator** | **Integer** | The devid of the job engine coordinator. | 
**disconnectedNodes** | **List&lt;Integer&gt;** | If connected&#x3D;false, this is the set of devids that are not connected to the coordinator. | 
**downOrReadOnlyNodes** | **Boolean** | Whether the cluster has any down or read-only nodes.  These nodes are not considered in the connected property. | 
**nextJid** | **Integer** | The job ID to be assigned to the next job. | 
**runDegraded** | **Boolean** | Whether the job engine would allow most jobs to run even when the cluster is in a degraded state. | 
**statsReady** | **Boolean** | Whether the coordinator has recently gathered statistics for all nodes in the cluster. | 



