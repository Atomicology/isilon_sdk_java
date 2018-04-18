
# EventChannelParameters

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address** | **List&lt;String&gt;** | Email addresses to send to. |  [optional]
**batch** | [**BatchEnum**](#BatchEnum) | Batching criterion. |  [optional]
**batchPeriod** | **Integer** | Period over which batching is to be performed. |  [optional]
**customTemplate** | **String** | Path to custom notification template. |  [optional]
**sendAs** | **String** | Email address to use as from. |  [optional]
**smtpHost** | **String** | SMTP relay host. |  [optional]
**smtpPassword** | **String** | Password for SMTP authentication - only if smtp_use_auth true. |  [optional]
**smtpPort** | **Integer** | SMTP relay port - optional defaults to 25. |  [optional]
**smtpSecurity** | [**SmtpSecurityEnum**](#SmtpSecurityEnum) | Encryption protocol to use for SMTP. |  [optional]
**smtpUseAuth** | **Boolean** | Use SMTP authentication - optional defaulst to false. |  [optional]
**smtpUsername** | **String** | Username for SMTP authentication - only if smtp_use_auth true. |  [optional]
**subject** | **String** | Subject for emails. |  [optional]


<a name="BatchEnum"></a>
## Enum: BatchEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
ALL | &quot;ALL&quot;
CATEGORY | &quot;CATEGORY&quot;
SEVERITY | &quot;SEVERITY&quot;


<a name="SmtpSecurityEnum"></a>
## Enum: SmtpSecurityEnum
Name | Value
---- | -----
NONE | &quot;NONE&quot;
STARTTLS | &quot;STARTTLS&quot;



