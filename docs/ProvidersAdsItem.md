
# ProvidersAdsItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account** | **String** | Specifies the machine account name when creating a SAM account with Active Directory. The default cluster name is called &#39;default&#39;. |  [optional]
**allocateGids** | **Boolean** | Allocates an ID for an unmapped Active Directory (ADS) group. ADS groups without GIDs can be proactively assigned a GID by the ID mapper. If the ID mapper option is disabled, GIDs are not proactively assigned, and when a primary group for a user does not include a GID, the system may allocate one.  |  [optional]
**allocateUids** | **Boolean** | Allocates a user ID for an unmapped Active Directory (ADS) user. ADS users without UIDs can be proactively assigned a UID by the ID mapper. IF the ID mapper option is disabled, UIDs are not proactively assigned, and when an identify for a user does not include a UID, the system may allocate one. |  [optional]
**assumeDefaultDomain** | **Boolean** | Enables lookup of unqualified user names in the primary domain. |  [optional]
**authentication** | **Boolean** | Enables authentication and identity management through the authentication provider. |  [optional]
**checkOnlineInterval** | **Integer** | Specifies the time in seconds between provider online checks. |  [optional]
**controllerTime** | **Integer** | Specifies the current time for the domain controllers. |  [optional]
**createHomeDirectory** | **Boolean** | Automatically creates a home directory on the first login. |  [optional]
**dnsDomain** | **String** | Specifies the DNS search domain. Set this parameter if the DNS search domain has a unique name or address. |  [optional]
**domainOfflineAlerts** | **Boolean** | Sends an alert if the domain goes offline. |  [optional]
**findableGroups** | **List&lt;String&gt;** | Sets list of groups that can be resolved. |  [optional]
**findableUsers** | **List&lt;String&gt;** | Sets list of users that can be resolved. |  [optional]
**groupnet** | **String** | Groupnet identifier. |  [optional]
**homeDirectoryTemplate** | **String** | Specifies the path to the home directory template. |  [optional]
**ignoreAllTrusts** | **Boolean** | If set to true, ignores all trusted domains. |  [optional]
**ignoredTrustedDomains** | **List&lt;String&gt;** | Includes trusted domains when &#39;ignore_all_trusts&#39; is set to false. |  [optional]
**includeTrustedDomains** | **List&lt;String&gt;** | Includes trusted domains when &#39;ignore_all_trusts&#39; is set to true. |  [optional]
**instance** | **String** | Specifies Active Directory provider instance. |  [optional]
**kerberosHdfsSpn** | **Boolean** | Determines if connecting through HDFS with Kerberos. |  [optional]
**kerberosNfsSpn** | **Boolean** | Determines if connecting through NFS with Kerberos. |  [optional]
**ldapSignAndSeal** | **Boolean** | Enables encryption and signing on LDAP requests. |  [optional]
**loginShell** | **String** | Specifies the login shell path. |  [optional]
**lookupDomains** | **List&lt;String&gt;** | Limits user and group lookups to the specified domains. |  [optional]
**lookupGroups** | **Boolean** | Looks up AD groups in other providers before allocating a group ID. |  [optional]
**lookupNormalizeGroups** | **Boolean** | Normalizes AD group names to lowercase before look up. |  [optional]
**lookupNormalizeUsers** | **Boolean** | Normalize AD user names to lowercase before look up. |  [optional]
**lookupUsers** | **Boolean** | Looks up AD users in other providers before allocating a user ID. |  [optional]
**machineName** | **String** | Specifies name to join AD as. |  [optional]
**machinePasswordChanges** | **Boolean** | Enables periodic changes of the machine password for security. |  [optional]
**machinePasswordLifespan** | **Integer** | Sets maximum age of a password in seconds. |  [optional]
**name** | **String** | Specifies the Active Directory provider name. | 
**nodeDcAffinity** | **String** | Specifies the domain controller for which the node has affinity. |  [optional]
**nodeDcAffinityTimeout** | **Integer** | Specifies the timeout for the domain controller for which the local node has affinity. |  [optional]
**nssEnumeration** | **Boolean** | Enables the Active Directory provider to respond to &#39;getpwent&#39; and &#39;getgrent&#39; requests. |  [optional]
**organizationalUnit** | **String** | Specifies the organizational unit. |  [optional]
**password** | **String** | Specifies the password used during domain join. | 
**restrictFindable** | **Boolean** | Check the provider for filtered lists of findable and unfindable users and groups. |  [optional]
**sfuSupport** | [**SfuSupportEnum**](#SfuSupportEnum) | Specifies whether to support RFC 2307 attributes on ADS domain controllers. |  [optional]
**storeSfuMappings** | **Boolean** | Stores SFU mappings permanently in the ID mapper. |  [optional]
**unfindableGroups** | **List&lt;String&gt;** | Specifies groups that cannot be resolved by the provider. |  [optional]
**unfindableUsers** | **List&lt;String&gt;** | Specifies users that cannot be resolved by the provider. |  [optional]
**user** | **String** | Specifies the user name that has permission to join a machine to the given domain. | 


<a name="SfuSupportEnum"></a>
## Enum: SfuSupportEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
RFC2307 | &quot;rfc2307&quot;



