
# ProvidersKrb5IdParams

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**keytabEntries** | [**List&lt;ProvidersKrb5IdParamsKeytabEntry&gt;**](ProvidersKrb5IdParamsKeytabEntry.md) | Specifies the key information for the Kerberos SPNs. |  [optional]
**keytabFile** | **String** | Specifies the path to a keytab file to import. |  [optional]
**manualKeying** | **Boolean** | If true, keys are managed manually. If false, keys are managed through kadmin. |  [optional]
**name** | **String** | Specifies the Kerberos provider name. |  [optional]
**password** | **String** | Specifies the Kerberos provider password. |  [optional]
**realm** | **String** | Specifies the name of realm. |  [optional]
**status** | **String** | Specifies the status of the provider. |  [optional]
**user** | **String** | Specifies the name of the user that performs kadmin tasks. |  [optional]



