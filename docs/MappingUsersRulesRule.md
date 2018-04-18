
# MappingUsersRulesRule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operator** | [**OperatorEnum**](#OperatorEnum) | Specifies the operator to make rules on specified users or groups. |  [optional]
**options** | [**MappingUsersRulesRuleOptions**](MappingUsersRulesRuleOptions.md) | Specifies the properties for user mapping rules. |  [optional]
**user1** | [**MappingUsersRulesRuleUser2**](MappingUsersRulesRuleUser2.md) |  |  [optional]
**user2** | [**MappingUsersRulesRuleUser2**](MappingUsersRulesRuleUser2.md) |  |  [optional]


<a name="OperatorEnum"></a>
## Enum: OperatorEnum
Name | Value
---- | -----
APPEND | &quot;append&quot;
INSERT | &quot;insert&quot;
REPLACE | &quot;replace&quot;
TRIM | &quot;trim&quot;
UNION | &quot;union&quot;



