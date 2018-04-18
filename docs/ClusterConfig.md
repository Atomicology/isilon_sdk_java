
# ClusterConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Customer configurable description. | 
**devices** | [**List&lt;ClusterConfigDevice&gt;**](ClusterConfigDevice.md) |  | 
**encoding** | **String** | Default encoding. | 
**guid** | **String** | Cluster GUID. | 
**hasQuorum** | **Boolean** | If true, the local node is in a group with quorum: It is communicating, storing, and protecting data normally with other nodes in its group.  Under normal circumstances, every node in the cluster is part of one group. | 
**isCompliance** | **Boolean** | If true, the cluster is in compliance mode.  Compliance mode clusters do not allow root access and have stricter WORM (Write Once Read Many) features for retaining data in compliance with U.S. Securities and Exchange Commission rule 17a-4. | 
**isVirtual** | **Boolean** | true if the cluster is deployed on a desktop VMWorkstation | 
**isVonefs** | **Boolean** | true if this is a vOneFS cluster on an ESXi | 
**joinMode** | **String** | Node join mode: &#39;manual&#39; or &#39;secure&#39;. | 
**localDevid** | **Integer** | Device ID of the queried node. | 
**localLnn** | **Integer** | Device logical node number of the queried node. | 
**localSerial** | **String** | Device serial number of the queried node. | 
**name** | **String** | Cluster name. | 
**onefsVersion** | [**ClusterConfigOnefsVersion**](ClusterConfigOnefsVersion.md) |  |  [optional]
**timezone** | [**ClusterConfigTimezone**](ClusterConfigTimezone.md) | The cluster timezone settings. |  [optional]
**upgradeType** | **String** |  |  [optional]



