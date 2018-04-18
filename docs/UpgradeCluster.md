
# UpgradeCluster

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**clusterOverview** | [**UpgradeClusterClusterOverview**](UpgradeClusterClusterOverview.md) | The cluster overview of an upgrade process. |  [optional]
**clusterState** | **String** | The different states of an upgrade, rollback, or assessment. One of the following values: &#39;committed&#39;, &#39;upgraded&#39;, &#39;partially upgraded&#39;, &#39;upgrading&#39;, &#39;rolling back&#39;, &#39;assessing&#39;, &#39;error&#39; |  [optional]
**currentProcess** | **String** | The current upgrade activity. |  [optional]
**finishTime** | **String** | The time when a rollback, assessment or upgrade has finished completely. Use ISO 8601 standard. Null if the cluster_state is not &#39;upgraded&#39;. |  [optional]
**installImagePath** | **String** | The location (path) of the upgrade image which must be within /ifs. Null if the cluster_state is &#39;committed&#39; or &#39;upgraded.&#39; |  [optional]
**nodeMedianTime** | **Integer** | The median time (seconds) to complete each node so far during this upgrade. Before the first node in an upgrade has completed this key will have an associated null value. |  [optional]
**onefsVersionCurrent** | [**ClusterNodesOnefsVersion**](ClusterNodesOnefsVersion.md) | The current OneFS version before upgrade. |  [optional]
**onefsVersionUpgrade** | [**ClusterNodesOnefsVersion**](ClusterNodesOnefsVersion.md) | The OneFS version the user is attempting to upgrade to. Null if the cluster_state is &#39;committed&#39; or &#39;assessing.&#39; |  [optional]
**patchAction** | **String** | The most recent patch action performed. |  [optional]
**patchName** | **String** | The patch with the most recent patch action. |  [optional]
**startTime** | **String** | The time when an upgrade, rollback, or assessment was started. Use ISO 8601 standard. Null if the cluster_state is &#39;committed&#39; or &#39;partially upgraded.&#39; |  [optional]
**upgradeIsCommitted** | **Boolean** | True if upgrade is committed. |  [optional]
**upgradeSettings** | [**UpgradeClusterUpgradeSettings**](UpgradeClusterUpgradeSettings.md) | The settings necessary when starting an upgrade. Null if the cluster_state is not &#39;upgrading&#39; or &#39;partially upgraded.&#39; or &#39;error&#39;. |  [optional]
**upgradeTriggeredTime** | **String** | Time at which upgrade was originally requested. |  [optional]



