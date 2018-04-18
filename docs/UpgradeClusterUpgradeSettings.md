
# UpgradeClusterUpgradeSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nodesToRollingUpgrade** | **List&lt;Integer&gt;** | The nodes (to be) scheduled for upgrade ordered by queue position number. Null if the cluster_state is &#39;partially upgraded&#39; or upgrade_type is &#39;simultaneous&#39;. One of the following values: [&lt;lnn-1&gt;, &lt;lnn-2&gt;, ... ], &#39;All&#39;, null |  [optional]
**upgradeType** | **String** | The type of upgrade to perform. One of the following values: &#39;rolling&#39;, &#39;simultaneous&#39; |  [optional]



