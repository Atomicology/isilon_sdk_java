
# ClusterEmailExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**batchMode** | [**BatchModeEnum**](#BatchModeEnum) | This setting determines how notifications will be batched together to be sent by email.  &#39;none&#39; means each notification will be sent separately.  &#39;severity&#39; means notifications of the same severity will be sent together.  &#39;category&#39; means notifications of the same category will be sent together.  &#39;all&#39; means all notifications will be batched together and sent in a single email. |  [optional]
**mailRelay** | **String** | The address of the SMTP server to be used for relaying the notification messages.  An SMTP server is required in order to send notifications.  If this string is empty, no emails will be sent. |  [optional]
**mailSender** | **String** | The full email address that will appear as the sender of notification messages. |  [optional]
**mailSubject** | **String** | The subject line for notification messages from this cluster. |  [optional]
**smtpAuthPasswd** | **String** | Password to authenticate with if SMTP authentication is being used. |  [optional]
**smtpAuthSecurity** | [**SmtpAuthSecurityEnum**](#SmtpAuthSecurityEnum) | The type of secure communication protocol to use if SMTP is being used.  If &#39;none&#39;, plain text will be used, if &#39;starttls&#39;, the encrypted STARTTLS protocol will be used. |  [optional]
**smtpAuthUsername** | **String** | Username to authenticate with if SMTP authentication is being used. |  [optional]
**smtpPort** | **Integer** | The port on the SMTP server to be used for relaying the notification messages.   |  [optional]
**useSmtpAuth** | **Boolean** | If true, this cluster will send SMTP authentication credentials to the SMTP relay server in order to send its notification emails.  If false, the cluster will attempt to send its notification emails without authentication. |  [optional]
**userTemplate** | **String** | Location of a custom template file that can be used to specify the layout of the notification emails. |  [optional]


<a name="BatchModeEnum"></a>
## Enum: BatchModeEnum
Name | Value
---- | -----
ALL | &quot;all&quot;
SEVERITY | &quot;severity&quot;
CATEGORY | &quot;category&quot;
NONE | &quot;none&quot;


<a name="SmtpAuthSecurityEnum"></a>
## Enum: SmtpAuthSecurityEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
STARTTLS | &quot;starttls&quot;



