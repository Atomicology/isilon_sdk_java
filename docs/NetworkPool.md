
# NetworkPool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessZone** | **String** | Name of a valid access zone to map IP address pool to the zone. |  [optional]
**addrFamily** | [**AddrFamilyEnum**](#AddrFamilyEnum) | IP address format. |  [optional]
**aggregationMode** | [**AggregationModeEnum**](#AggregationModeEnum) | OneFS supports the following NIC aggregation modes. |  [optional]
**allocMethod** | [**AllocMethodEnum**](#AllocMethodEnum) | Specifies how IP address allocation is done among pool members. |  [optional]
**description** | **String** | A description of the pool. |  [optional]
**groupnet** | **String** | Name of the groupnet this pool belongs to. |  [optional]
**id** | **String** | Unique Pool ID. |  [optional]
**ifaces** | [**List&lt;SubnetsSubnetPoolIface&gt;**](SubnetsSubnetPoolIface.md) | List of interface members in this pool. |  [optional]
**name** | **String** | The name of the pool. It must be unique throughout the given subnet.It&#39;s a required field with POST method. |  [optional]
**ranges** | [**List&lt;SubnetsSubnetPoolRange&gt;**](SubnetsSubnetPoolRange.md) | List of IP address ranges in this pool. |  [optional]
**rebalancePolicy** | [**RebalancePolicyEnum**](#RebalancePolicyEnum) | Rebalance policy.. |  [optional]
**rules** | **List&lt;String&gt;** | Names of the rules in this pool. |  [optional]
**scAutoUnsuspendDelay** | **Integer** | Time delay in seconds before a node which has been                 automatically unsuspended becomes usable in SmartConnect                responses for pool zones. |  [optional]
**scConnectPolicy** | [**ScConnectPolicyEnum**](#ScConnectPolicyEnum) | SmartConnect client connection balancing policy. |  [optional]
**scDnsZone** | **String** | SmartConnect zone name for the pool. |  [optional]
**scDnsZoneAliases** | **List&lt;String&gt;** | List of SmartConnect zone aliases (DNS names) to the pool. |  [optional]
**scFailoverPolicy** | [**ScFailoverPolicyEnum**](#ScFailoverPolicyEnum) | SmartConnect IP failover policy. |  [optional]
**scSubnet** | **String** | Name of SmartConnect service subnet for this pool. |  [optional]
**scSuspendedNodes** | **List&lt;Integer&gt;** | List of LNNs showing currently suspended nodes in SmartConnect. |  [optional]
**scTtl** | **Integer** | Time to live value for SmartConnect DNS query responses in seconds. |  [optional]
**staticRoutes** | [**List&lt;SubnetsSubnetPoolStaticRoute&gt;**](SubnetsSubnetPoolStaticRoute.md) | List of interface members in this pool. |  [optional]
**subnet** | **String** | The name of the subnet. |  [optional]


<a name="AddrFamilyEnum"></a>
## Enum: AddrFamilyEnum
Name | Value
---- | -----
IPV4 | &quot;ipv4&quot;
IPV6 | &quot;ipv6&quot;


<a name="AggregationModeEnum"></a>
## Enum: AggregationModeEnum
Name | Value
---- | -----
ROUNDROBIN | &quot;roundrobin&quot;
FAILOVER | &quot;failover&quot;
LACP | &quot;lacp&quot;
FEC | &quot;fec&quot;


<a name="AllocMethodEnum"></a>
## Enum: AllocMethodEnum
Name | Value
---- | -----
DYNAMIC | &quot;dynamic&quot;
STATIC | &quot;static&quot;


<a name="RebalancePolicyEnum"></a>
## Enum: RebalancePolicyEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
MANUAL | &quot;manual&quot;


<a name="ScConnectPolicyEnum"></a>
## Enum: ScConnectPolicyEnum
Name | Value
---- | -----
ROUND_ROBIN | &quot;round_robin&quot;
CONN_COUNT | &quot;conn_count&quot;
THROUGHPUT | &quot;throughput&quot;
CPU_USAGE | &quot;cpu_usage&quot;


<a name="ScFailoverPolicyEnum"></a>
## Enum: ScFailoverPolicyEnum
Name | Value
---- | -----
ROUND_ROBIN | &quot;round_robin&quot;
CONN_COUNT | &quot;conn_count&quot;
THROUGHPUT | &quot;throughput&quot;
CPU_USAGE | &quot;cpu_usage&quot;



