
# HardeningStateState

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**issuesFile** | **String** | Full path name of issues file, or null if no issues file is configured. This file contains all issues found when the cluster configuration is checked against expected configuration. |  [optional]
**message** | **String** | This contains more information and details about the operation state. |  [optional]
**state** | [**StateEnum**](#StateEnum) | The state of the hardening operation. In case there is no operation currently going on, this will display the last state of operation. |  [optional]


<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
DISABLED | &quot;Disabled&quot;
CHECKING_BEFORE_APPLY | &quot;Checking_Before_Apply&quot;
ISSUES_FOUND_BEFORE_APPLY | &quot;Issues_Found_Before_Apply&quot;
APPLYING | &quot;Applying&quot;
ENABLED | &quot;Enabled&quot;
CHECKING_BEFORE_REVERT | &quot;Checking_Before_Revert&quot;
ISSUES_FOUND_BEFORE_REVERT | &quot;Issues_Found_Before_Revert&quot;
REVERTING | &quot;Reverting&quot;
FAILED | &quot;Failed&quot;
RESOLVING | &quot;Resolving&quot;
ISSUES_RESOLVED | &quot;Issues_Resolved&quot;
NO_ISSUES_FOUND | &quot;No_Issues_Found&quot;
RESOLVED_FAILED | &quot;Resolved_failed&quot;
ISSUES_FOUND_IN_REPORT | &quot;Issues_Found_In_Report&quot;
NO_ISSUES_FOUND_IN_REPORT | &quot;No_Issues_Found_In_Report&quot;
OTHER | &quot;Other&quot;



