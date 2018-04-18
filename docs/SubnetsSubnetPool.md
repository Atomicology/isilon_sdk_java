
# SubnetsSubnetPool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessZone** | **String** | Name of a valid access zone to map IP address pool to the zone. |  [optional]
**aggregationMode** | **String** | OneFS supports the following NIC aggregation modes. |  [optional]
**allocMethod** | **String** | Specifies how IP address allocation is done among pool members. |  [optional]
**description** | **String** | A description of the pool. |  [optional]
**ifaces** | [**List&lt;SubnetsSubnetPoolIface&gt;**](SubnetsSubnetPoolIface.md) | List of interface members in this pool. |  [optional]
**name** | **String** | The name of the pool. It must be unique throughout the given subnet.It&#39;s a required field with POST method. |  [optional]
**ranges** | [**List&lt;SubnetsSubnetPoolRange&gt;**](SubnetsSubnetPoolRange.md) | List of IP address ranges in this pool. |  [optional]
**rebalancePolicy** | **String** | Rebalance policy.. |  [optional]
**scAutoUnsuspendDelay** | **Integer** | Time delay in seconds before a node which has been                 automatically unsuspended becomes usable in SmartConnect                responses for pool zones. |  [optional]
**scConnectPolicy** | **String** | SmartConnect client connection balancing policy. |  [optional]
**scDnsZone** | **String** | SmartConnect zone name for the pool. |  [optional]
**scDnsZoneAliases** | **List&lt;String&gt;** | List of SmartConnect zone aliases (DNS names) to the pool. |  [optional]
**scFailoverPolicy** | **String** | SmartConnect IP failover policy. |  [optional]
**scSubnet** | **String** | Name of SmartConnect service subnet for this pool. |  [optional]
**scTtl** | **Integer** | Time to live value for SmartConnect DNS query responses in seconds. |  [optional]
**staticRoutes** | [**List&lt;SubnetsSubnetPoolStaticRoute&gt;**](SubnetsSubnetPoolStaticRoute.md) | List of interface members in this pool. |  [optional]



