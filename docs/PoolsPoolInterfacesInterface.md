
# PoolsPoolInterfacesInterface

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique interface ID. | 
**ipAddrs** | **List&lt;String&gt;** | List of IP addresses | 
**lnn** | **Integer** | Logical Node Number | 
**name** | **String** | The name of the interface. | 
**nicName** | **String** | NIC name | 
**owners** | [**List&lt;PoolsPoolInterfacesInterfaceOwner&gt;**](PoolsPoolInterfacesInterfaceOwner.md) | List of owners (membership) | 
**status** | **String** | Status of the interface | 
**type** | [**TypeEnum**](#TypeEnum) | Interface type.  The &#39;*gige&#39; types stand for &#39;gigabit ethernet&#39;.  &#39;gige&#39; itself is occasionally also referred to in other places as &#39;ext&#39; for &#39;external&#39;.  &#39;ib&#39; and &#39;ib_qdr&#39; are internal Infiniband interface types.  &#39;vlan&#39; and &#39;vmxnet3&#39; are virtual interface types that appear on virtual nodes.  &#39;loopback&#39; is an interface for failover addresses and should only appear if failover is configured. | 


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ANY | &quot;any&quot;
GIGE | &quot;gige&quot;
FASTGIGE | &quot;fastgige&quot;
_10GIGE | &quot;10gige&quot;
_40GIGE | &quot;40gige&quot;
MGMT | &quot;mgmt&quot;
IB | &quot;ib&quot;
IB_QDR | &quot;ib_qdr&quot;
IB_FDR | &quot;ib_fdr&quot;
AGGREGATED | &quot;aggregated&quot;
VLAN | &quot;vlan&quot;
VMXNET3 | &quot;vmxnet3&quot;
LOOPBACK | &quot;loopback&quot;



