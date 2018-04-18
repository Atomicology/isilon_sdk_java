
# FilepoolPolicyExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actions** | [**List&lt;FilepoolDefaultPolicyDefaultPolicyAction&gt;**](FilepoolDefaultPolicyDefaultPolicyAction.md) | A list of actions to be taken for matching files |  [optional]
**applyOrder** | **Integer** | The order in which this policy should be applied (relative to other policies) |  [optional]
**birthClusterId** | **String** | The guid assigned to the cluster on which the account was created |  [optional]
**description** | **String** | A description for this policy |  [optional]
**fileMatchingPattern** | [**FilepoolPolicyFileMatchingPattern**](FilepoolPolicyFileMatchingPattern.md) | The file matching rules for this policy |  [optional]
**id** | **Integer** | A unique identifier for this policy |  [optional]
**name** | **String** | A unique name for this policy |  [optional]
**state** | [**StateEnum**](#StateEnum) | Indicates whether this policy is in a good state (\&quot;OK\&quot;) or disabled (\&quot;disabled\&quot;) |  [optional]
**stateDetails** | **String** | Gives further information to describe the state of this policy |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OK | &quot;OK&quot;
DISABLED | &quot;disabled&quot;



