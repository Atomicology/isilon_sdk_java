
# SnmpSettingsExtended

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**readOnlyCommunity** | **String** | The read-only community name.  @DEFAULT reverts this field to its default value. |  [optional]
**service** | **Boolean** | Whether the SNMP service is enabled. |  [optional]
**snmpV1V2cAccess** | **Boolean** | Whether SNMP v1 and v2c protocols are enabled.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3Access** | **Boolean** | Whether SNMP v3 is enabled.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3AuthProtocol** | [**SnmpV3AuthProtocolEnum**](#SnmpV3AuthProtocolEnum) | SNMPv3 authentication protocol. May only be SHA or MD5.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3Password** | **String** | This field allows a client to change the SNMP v3 authentication password. There is always a password set.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3PrivPassword** | **String** | This field allows a client to change the SNMP v3 privacy password. There is always a password set.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3PrivProtocol** | [**SnmpV3PrivProtocolEnum**](#SnmpV3PrivProtocolEnum) | SNMPv3 privacy protocol. May only be AES or DES. @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3ReadOnlyUser** | **String** | The read-only user for SNMP v3 read requests.  @DEFAULT reverts this field to its default value. |  [optional]
**snmpV3SecurityLevel** | [**SnmpV3SecurityLevelEnum**](#SnmpV3SecurityLevelEnum) | SNMPv3 privacy protocol. May only be AES or DES. @DEFAULT reverts this field to its default value. |  [optional]
**systemContact** | **String** | Contact information for the system owner.  This must be a valid email address.  @DEFAULT reverts this field to its default value. |  [optional]
**systemLocation** | **String** | A location name for the SNMP system.  @DEFAULT reverts this field to its default value. |  [optional]


<a name="SnmpV3AuthProtocolEnum"></a>
## Enum: SnmpV3AuthProtocolEnum
Name | Value
---- | -----
SHA | &quot;SHA&quot;
MD5 | &quot;MD5&quot;


<a name="SnmpV3PrivProtocolEnum"></a>
## Enum: SnmpV3PrivProtocolEnum
Name | Value
---- | -----
AES | &quot;AES&quot;
DES | &quot;DES&quot;


<a name="SnmpV3SecurityLevelEnum"></a>
## Enum: SnmpV3SecurityLevelEnum
Name | Value
---- | -----
NOAUTHNOPRIV | &quot;noAuthNoPriv&quot;
AUTHNOPRIV | &quot;authNoPriv&quot;
AUTHPRIV | &quot;authPriv&quot;



