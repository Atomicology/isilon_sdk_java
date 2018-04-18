
# RemotesupportConnectemcConnectemc

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailCustomerOnFailure** | **Boolean** | Email the customer if all transmission methods fail. |  [optional]
**enabled** | **Boolean** | Enable ConnectEMC. |  [optional]
**gatewayAccessPools** | **List&lt;String&gt;** | List of network pools that are able to connect to the ESRS gateway.  Necessary to enable ConnectEMC. |  [optional]
**primaryEsrsGateway** | **String** | Primary ESRS Gateway. Necessary to enable ConnectEMC. |  [optional]
**secondaryEsrsGateway** | **String** | Secondary ESRS Gateway. Used if Primary is unavailable. |  [optional]
**useSmtpFailover** | **Boolean** | Use SMPT if primary and secondary gateways are unavailable. |  [optional]



