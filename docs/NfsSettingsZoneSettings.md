
# NfsSettingsZoneSettings

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nfsv4AllowNumericIds** | **Boolean** | If true, sends owners and groups as UIDs and GIDs when look up fails or if the &#39;nfsv4_no_name&#39; property is set to 1. |  [optional]
**nfsv4Domain** | **String** | Specifies the domain or realm through which users and groups are associated. |  [optional]
**nfsv4NoDomain** | **Boolean** | If true, sends owners and groups without a domain name. |  [optional]
**nfsv4NoDomainUids** | **Boolean** | If true, sends UIDs and GIDs without a domain name. |  [optional]
**nfsv4NoNames** | **Boolean** | If true, sends owners and groups as UIDs and GIDs. |  [optional]
**nfsv4ReplaceDomain** | **Boolean** | If true, replaces the owner or group domain with an NFS domain name. |  [optional]
**zone** | **String** | Specifies the access zones in which these settings apply. |  [optional]



