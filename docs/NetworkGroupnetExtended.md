
# NetworkGroupnetExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the groupnet. |  [optional]
**dnsCacheEnabled** | **Boolean** | DNS caching is enabled or disabled. |  [optional]
**dnsOptions** | [**List&lt;DnsOptionsEnum&gt;**](#List&lt;DnsOptionsEnum&gt;) | List of DNS resolver options. |  [optional]
**dnsSearch** | **List&lt;String&gt;** | List of DNS search suffixes. |  [optional]
**dnsServers** | **List&lt;String&gt;** | List of Domain Name Server IP addresses. |  [optional]
**name** | **String** | The name of the groupnet. |  [optional]
**serverSideDnsSearch** | **Boolean** | Enable or disable appending nodes DNS search  list to client DNS inquiries directed at SmartConnect service IP. |  [optional]
**id** | **String** | Unique Interface ID. |  [optional]
**subnets** | **List&lt;String&gt;** | Name of the subnets in the groupnet. |  [optional]


<a name="List<DnsOptionsEnum>"></a>
## Enum: List&lt;DnsOptionsEnum&gt;
Name | Value
---- | -----
ROTATE | &quot;rotate&quot;



