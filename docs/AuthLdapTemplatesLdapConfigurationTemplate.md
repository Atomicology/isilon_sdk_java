
# AuthLdapTemplatesLdapConfigurationTemplate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cnAttribute** | **String** | Specifies canonical name. |  [optional]
**cryptPasswordAttribute** | **String** | Sets hashed password value. |  [optional]
**emailAttribute** | **String** | Sets the LDAP Email attribute. |  [optional]
**gecosAttribute** | **String** | Sets the LDAP GECOS attribute. |  [optional]
**gidAttribute** | **String** | Sets the LDAP GID attribute. |  [optional]
**groupFilter** | **String** | Sets LDAP filter for group objects. |  [optional]
**groupMembersAttribute** | **String** | Sets the LDAP Group Members attribute. |  [optional]
**homedirAttribute** | **String** | Sets the LDAP Homedir attribute. |  [optional]
**id** | [**IdEnum**](#IdEnum) | Specifies the ID of the LDAP provider field template. |  [optional]
**nameAttribute** | **String** | Sets the LDAP UID attribute, which is used as the login name. |  [optional]
**netgroupFilter** | **String** | Sets LDAP filter for netgroup objects. |  [optional]
**netgroupMembersAttribute** | **String** | Sets the LDAP Netgroup Members attribute. |  [optional]
**netgroupTripleAttribute** | **String** | Sets the LDAP Netgroup Triple attribute. |  [optional]
**ntPasswordAttribute** | **String** | Sets the LDAP NT Password attribute. |  [optional]
**shadowExpireAttribute** | **String** | Sets the absolute date to expire the account. |  [optional]
**shadowFlagAttribute** | **String** | Sets the section of the shadow map that is used to store the flag value. |  [optional]
**shadowInactiveAttribute** | **String** | Sets the number of days of inactivity that is allowed for the user. |  [optional]
**shadowLastChangeAttribute** | **String** | Sets the last change of the shadow information. |  [optional]
**shadowMaxAttribute** | **String** | Sets the maximum number of days a password can be valid. |  [optional]
**shadowMinAttribute** | **String** | Sets the minimum number of days between shadow changes. |  [optional]
**shadowUserFilter** | **String** | Sets LDAP filter for shadow user objects. |  [optional]
**shadowWarningAttribute** | **String** | Sets the number of days before the password expires to warn the user. |  [optional]
**shellAttribute** | **String** | Sets the LDAP Shell attribute. |  [optional]
**uidAttribute** | **String** | Sets the LDAP UID Number attribute. |  [optional]
**uniqueGroupMembersAttribute** | **String** | Sets the LDAP Unique Group Members attribute. |  [optional]
**userFilter** | **String** | Sets LDAP filter for user objects. |  [optional]


<a name="IdEnum"></a>
## Enum: IdEnum
Name | Value
---- | -----
DEFAULT | &quot;default&quot;
LDAPSAM | &quot;ldapsam&quot;
RFC2307 | &quot;rfc2307&quot;
AD_IDMU | &quot;ad-idmu&quot;



