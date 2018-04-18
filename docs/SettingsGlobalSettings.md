
# SettingsGlobalSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auditedZones** | **List&lt;String&gt;** | Specifies zones that are audited when the protocol_auditing_enabled property is enabled. |  [optional]
**ceeLogTime** | **String** | Specifies that events past a certain date are forwarded by the audit CEE forwarder. Format these events as follows: &#39;Topic@YYYY-MM-DD HH:MM:SS&#39;. |  [optional]
**ceeServerUris** | **List&lt;String&gt;** | Specifies a list of Common Event Enabler (CEE) server URIs. Protocol audit logs are sent to these URIs for external processing. |  [optional]
**configAuditingEnabled** | **Boolean** | Specifies whether logging for API configuration changes are enabled. |  [optional]
**configSyslogEnabled** | **Boolean** | Specifies whether configuration audit syslog messages are forwarded. |  [optional]
**hostname** | **String** | Specifies the hostname that is reported in protocol events from this cluster. |  [optional]
**protocolAuditingEnabled** | **Boolean** | Specifies if logging for the I/O stream is enabled. |  [optional]
**syslogLogTime** | **String** | Specifies that events past a specified date are forwarded by the audit syslog forwarder. Format these events as follows: &#39;Topic@YYYY-MM-DD HH:MM:SS&#39; format |  [optional]



