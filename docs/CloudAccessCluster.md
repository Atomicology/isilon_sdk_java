
# CloudAccessCluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | **List&lt;String&gt;** | A list of accounts created on the cluster with this guid |  [optional]
**current** | **Boolean** | Whether the guid is that of the current (local) cluster |  [optional]
**guid** | **String** | A cluster guid indicating the birth place of one or more accounts or policies on this cluster |  [optional]
**id** | **String** | A cluster guid indicating the birth place of one or more accounts or policies on this cluster |  [optional]
**name** | **String** | The name of the cluster from which the above guid originated |  [optional]
**policies** | **List&lt;String&gt;** | A list of policies created on the cluster with this guid |  [optional]
**state** | [**StateEnum**](#StateEnum) | Whether the guid has access to the cloud |  [optional]
**syncedFrom** | **String** | The name of the cluster from which the above guid was synced |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
PERMITTED | &quot;permitted&quot;
PENDING_ENABLE | &quot;pending enable&quot;
PENDING_DISABLE | &quot;pending disable&quot;
NOT_PERMITTED | &quot;not permitted&quot;



