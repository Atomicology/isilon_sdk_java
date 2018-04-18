
# ProvidersKrb5Krb5ItemExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**groupnet** | **String** | Groupnet identifier. |  [optional]
**id** | **String** | Specifies the Kerberos provider ID. |  [optional]
**keytabEntries** | [**List&lt;ProvidersKrb5IdParamsKeytabEntry&gt;**](ProvidersKrb5IdParamsKeytabEntry.md) | Specifies the key information for the Kerberos SPNs. |  [optional]
**keytabFile** | **String** | Specifies the path to a keytab file to import. |  [optional]
**manualKeying** | **Boolean** | If true, keys are managed manually. If false, keys are managed through kadmin. |  [optional]
**name** | **String** | Specifies the Kerberos provider name. |  [optional]
**realm** | **String** | Specifies the name of realm. |  [optional]
**recommendedSpns** | **List&lt;String&gt;** | Specifies the recommended SPNs. |  [optional]
**status** | **String** | Specifies the status of the provider. |  [optional]
**system** | **Boolean** | If true, indicates that this provider instance was created by OneFS and cannot be removed |  [optional]
**user** | **String** | Specifies the name of the user that performs kadmin tasks. |  [optional]
**password** | **String** | Specifies the Kerberos provider password. |  [optional]



