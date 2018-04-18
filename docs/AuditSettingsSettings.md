
# AuditSettingsSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditFailure** | [**List&lt;AuditFailureEnum&gt;**](#List&lt;AuditFailureEnum&gt;) | Filter of protocol operations to Audit when they fail. |  [optional]
**auditSuccess** | [**List&lt;AuditSuccessEnum&gt;**](#List&lt;AuditSuccessEnum&gt;) | Filter of protocol operations to Audit when they succeed. |  [optional]
**syslogAuditEvents** | [**List&lt;SyslogAuditEventsEnum&gt;**](#List&lt;SyslogAuditEventsEnum&gt;) | Filter of Audit operations to forward to syslog. |  [optional]
**syslogForwardingEnabled** | **Boolean** | Enables forwarding of events to syslog. |  [optional]


<a name="List<AuditFailureEnum>"></a>
## Enum: List&lt;AuditFailureEnum&gt;
Name | Value
---- | -----
CLOSE | &quot;close&quot;
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
GET_SECURITY | &quot;get_security&quot;
LOGOFF | &quot;logoff&quot;
LOGON | &quot;logon&quot;
READ | &quot;read&quot;
RENAME | &quot;rename&quot;
SET_SECURITY | &quot;set_security&quot;
TREE_CONNECT | &quot;tree_connect&quot;
WRITE | &quot;write&quot;


<a name="List<AuditSuccessEnum>"></a>
## Enum: List&lt;AuditSuccessEnum&gt;
Name | Value
---- | -----
CLOSE | &quot;close&quot;
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
GET_SECURITY | &quot;get_security&quot;
LOGOFF | &quot;logoff&quot;
LOGON | &quot;logon&quot;
READ | &quot;read&quot;
RENAME | &quot;rename&quot;
SET_SECURITY | &quot;set_security&quot;
TREE_CONNECT | &quot;tree_connect&quot;
WRITE | &quot;write&quot;


<a name="List<SyslogAuditEventsEnum>"></a>
## Enum: List&lt;SyslogAuditEventsEnum&gt;
Name | Value
---- | -----
CLOSE | &quot;close&quot;
CREATE | &quot;create&quot;
DELETE | &quot;delete&quot;
GET_SECURITY | &quot;get_security&quot;
LOGOFF | &quot;logoff&quot;
LOGON | &quot;logon&quot;
READ | &quot;read&quot;
RENAME | &quot;rename&quot;
SET_SECURITY | &quot;set_security&quot;
TREE_CONNECT | &quot;tree_connect&quot;
WRITE | &quot;write&quot;



