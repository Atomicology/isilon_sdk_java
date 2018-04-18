
# SubnetsSubnetPoolsPool

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessZone** | **String** | Name of a valid access zone to map IP address pool to the zone. | 
**addrFamily** | [**AddrFamilyEnum**](#AddrFamilyEnum) | IP address format. | 
**aggregationMode** | [**AggregationModeEnum**](#AggregationModeEnum) | OneFS supports the following NIC aggregation modes. | 
**allocMethod** | [**AllocMethodEnum**](#AllocMethodEnum) | Specifies how IP address allocation is done among pool members. | 
**description** | **String** | A description of the pool. | 
**groupnet** | **String** | Name of the groupnet this pool belongs to. | 
**id** | **String** | Unique Pool ID. | 
**ifaces** | [**List&lt;SubnetsSubnetPoolIface&gt;**](SubnetsSubnetPoolIface.md) | List of interface members in this pool. | 
**name** | **String** | The name of the pool. It must be unique throughout the given subnet.It&#39;s a required field with POST method. | 
**ranges** | [**List&lt;SubnetsSubnetPoolRange&gt;**](SubnetsSubnetPoolRange.md) | List of IP address ranges in this pool. | 
**rebalancePolicy** | [**RebalancePolicyEnum**](#RebalancePolicyEnum) | Rebalance policy.. | 
**rules** | **List&lt;String&gt;** | Names of the rules in this pool. | 
**scAutoUnsuspendDelay** | **Integer** | Time delay in seconds before a node which has been                 automatically unsuspended becomes usable in SmartConnect                responses for pool zones. | 
**scConnectPolicy** | [**ScConnectPolicyEnum**](#ScConnectPolicyEnum) | SmartConnect client connection balancing policy. | 
**scDnsZone** | **String** | SmartConnect zone name for the pool. | 
**scDnsZoneAliases** | **List&lt;String&gt;** | List of SmartConnect zone aliases (DNS names) to the pool. | 
**scFailoverPolicy** | [**ScFailoverPolicyEnum**](#ScFailoverPolicyEnum) | SmartConnect IP failover policy. | 
**scSubnet** | **String** | Name of SmartConnect service subnet for this pool. | 
**scSuspendedNodes** | **List&lt;Integer&gt;** | List of LNNs showing currently suspended nodes in SmartConnect. | 
**scTtl** | **Integer** | Time to live value for SmartConnect DNS query responses in seconds. | 
**staticRoutes** | [**List&lt;SubnetsSubnetPoolStaticRoute&gt;**](SubnetsSubnetPoolStaticRoute.md) | List of interface members in this pool. | 
**subnet** | **String** | The name of the subnet. | 


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



