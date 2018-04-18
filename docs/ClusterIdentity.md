
# ClusterIdentity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | A description of the cluster. | 
**logon** | [**ClusterIdentityLogon**](ClusterIdentityLogon.md) | The information displayed when a user logs in to the cluster. | 
**mttdlLevelMsg** | [**MttdlLevelMsgEnum**](#MttdlLevelMsgEnum) | Enum to control the display message about the MTTDL of the cluster. This does NOT change the MTTDL of a cluster in anyway, and is purely a value for displaying messages. | 
**name** | **String** | The name of the cluster. | 


<a name="MttdlLevelMsgEnum"></a>
## Enum: MttdlLevelMsgEnum
Name | Value
---- | -----
WARN | &quot;warn&quot;
NONE | &quot;none&quot;



