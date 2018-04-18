
# NfsNlmSessionsSession

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**delegates** | **List&lt;Integer&gt;** |  |  [optional]
**hostType** | [**HostTypeEnum**](#HostTypeEnum) | The sort of host that this entry represents |  [optional]
**hostname** | **String** | The host being monitored |  [optional]
**isActive** | **Boolean** | Whether or not the client is actively being monitored |  [optional]
**lastModified** | **Integer** | Unix time in seconds that the client was last modified (monitored or unmonitored) |  [optional]
**nodeIp** | **String** | An IP address for which NSM has client records |  [optional]
**notifyAttemptsRemaining** | **Integer** | Number of times we will attempt to notify this client before giving up |  [optional]
**notifyError** | **String** | Last error recieved attempting to notify this client |  [optional]
**notifyLastAttempt** | **Integer** | Unix time in seconds when we last attempted to notify this clients |  [optional]


<a name="HostTypeEnum"></a>
## Enum: HostTypeEnum
Name | Value
---- | -----
CLIENT | &quot;client&quot;
SERVER | &quot;server&quot;
REVERSE | &quot;reverse&quot;
EXPIRED | &quot;expired&quot;



