
# GroupnetSubnetCreateParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the subnet. |  [optional]
**dsrAddrs** | **List&lt;String&gt;** | List of Direct Server Return addresses. |  [optional]
**gateway** | **String** | Gateway IP address. |  [optional]
**gatewayPriority** | **Integer** | Gateway priority. |  [optional]
**mtu** | **Integer** | MTU of the subnet. |  [optional]
**name** | **String** | The name of the subnet. | 
**prefixlen** | **Integer** | Subnet Prefix Length. | 
**scServiceAddr** | **String** | The address that SmartConnect listens for DNS requests. |  [optional]
**scServiceName** | **String** | Domain Name corresponding to the SmartConnect Service Address. |  [optional]
**vlanEnabled** | **Boolean** | VLAN tagging enabled or disabled. |  [optional]
**vlanId** | **Integer** | VLAN ID for all interfaces in the subnet. |  [optional]
**addrFamily** | [**AddrFamilyEnum**](#AddrFamilyEnum) | IP address format. | 


<a name="AddrFamilyEnum"></a>
## Enum: AddrFamilyEnum
Name | Value
---- | -----
IPV4 | &quot;ipv4&quot;
IPV6 | &quot;ipv6&quot;



