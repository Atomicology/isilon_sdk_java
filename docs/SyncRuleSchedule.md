
# SyncRuleSchedule

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**begin** | **String** | Start time (inclusive) for this schedule, during its specified days.  Format is \&quot;hh:mm\&quot; (24h format hour, and minute).  A null value indicates the beginning of the day (\&quot;00:00\&quot;). |  [optional]
**end** | **String** | End time (inclusive) for this schedule, during its specified days.  Format is \&quot;hh:mm\&quot; (three-letter weekday name abbreviation, 24h format hour, and minute).  A null value indicates the end of the day (\&quot;23:59\&quot;). |  [optional]
**friday** | **Boolean** | If true, this rule is in effect on Friday.  If false, or unspecified, it is not. |  [optional]
**monday** | **Boolean** | If true, this rule is in effect on Monday.  If false, or unspecified, it is not. |  [optional]
**saturday** | **Boolean** | If true, this rule is in effect on Saturday.  If false, or unspecified, it is not. |  [optional]
**sunday** | **Boolean** | If true, this rule is in effect on Sunday.  If false, or unspecified, it is not. |  [optional]
**thursday** | **Boolean** | If true, this rule is in effect on Thursday.  If false, or unspecified, it is not. |  [optional]
**tuesday** | **Boolean** | If true, this rule is in effect on Tuesday.  If false, or unspecified, it is not. |  [optional]
**wednesday** | **Boolean** | If true, this rule is in effect on Wednesday.  If false, or unspecified, it is not. |  [optional]



