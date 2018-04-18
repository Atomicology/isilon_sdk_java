
# LicenseLicenseTierEntitlementsExceededAlert

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**current** | **Integer** | Current usage. |  [optional]
**issueType** | [**IssueTypeEnum**](#IssueTypeEnum) | Alert type. The unit of measure for the current and licensed fields for capacity is terabytes. For nodes_with_seds_count, it is the number of nodes that have one or more self-encrypting drives. | 
**licensed** | **Integer** | Licensed amount. |  [optional]


<a name="IssueTypeEnum"></a>
## Enum: IssueTypeEnum
Name | Value
---- | -----
CAPACITY | &quot;capacity&quot;
NODE_COUNT | &quot;node_count&quot;
NODES_WITH_SEDS_COUNT | &quot;nodes_with_seds_count&quot;



