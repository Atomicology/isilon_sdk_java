
# UpgradeClusterClusterOverview

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodesCurrent** | **Integer** | Number of nodes running the current OneFS version. |  [optional]
**nodesTotal** | **Integer** | Total number of nodes on the cluster. |  [optional]
**nodesTransitioning** | **Integer** | Number of nodes transitioning between OneFS versions. Null if the cluster_state is &#39;committed&#39; or &#39;assessing.&#39; |  [optional]
**nodesUpgraded** | **Integer** | Number of nodes running the upgraded OneFS version. Null if the cluster_state is &#39;committed&#39; or &#39;assessing.&#39; |  [optional]



