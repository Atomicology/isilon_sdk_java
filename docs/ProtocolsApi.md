# ProtocolsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHdfsProxyuser**](ProtocolsApi.md#createHdfsProxyuser) | **POST** /platform/1/protocols/hdfs/proxyusers | 
[**createHdfsRack**](ProtocolsApi.md#createHdfsRack) | **POST** /platform/1/protocols/hdfs/racks | 
[**createNdmpSettingsPreferredIp**](ProtocolsApi.md#createNdmpSettingsPreferredIp) | **POST** /platform/4/protocols/ndmp/settings/preferred-ips | 
[**createNdmpSettingsVariable**](ProtocolsApi.md#createNdmpSettingsVariable) | **POST** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} | 
[**createNdmpUser**](ProtocolsApi.md#createNdmpUser) | **POST** /platform/3/protocols/ndmp/users | 
[**createNfsAlias**](ProtocolsApi.md#createNfsAlias) | **POST** /platform/2/protocols/nfs/aliases | 
[**createNfsExport**](ProtocolsApi.md#createNfsExport) | **POST** /platform/4/protocols/nfs/exports | 
[**createNfsNetgroupCheckItem**](ProtocolsApi.md#createNfsNetgroupCheckItem) | **POST** /platform/3/protocols/nfs/netgroup/check | 
[**createNfsNetgroupFlushItem**](ProtocolsApi.md#createNfsNetgroupFlushItem) | **POST** /platform/3/protocols/nfs/netgroup/flush | 
[**createNfsNlmSessionsCheckItem**](ProtocolsApi.md#createNfsNlmSessionsCheckItem) | **POST** /platform/3/protocols/nfs/nlm/sessions-check | 
[**createNfsReloadItem**](ProtocolsApi.md#createNfsReloadItem) | **POST** /platform/3/protocols/nfs/reload | 
[**createNtpServer**](ProtocolsApi.md#createNtpServer) | **POST** /platform/3/protocols/ntp/servers | 
[**createSmbLogLevelFilter**](ProtocolsApi.md#createSmbLogLevelFilter) | **POST** /platform/3/protocols/smb/log-level/filters | 
[**createSmbShare**](ProtocolsApi.md#createSmbShare) | **POST** /platform/4/protocols/smb/shares | 
[**createSwiftAccount**](ProtocolsApi.md#createSwiftAccount) | **POST** /platform/3/protocols/swift/accounts | 
[**deleteHdfsProxyuser**](ProtocolsApi.md#deleteHdfsProxyuser) | **DELETE** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} | 
[**deleteHdfsRack**](ProtocolsApi.md#deleteHdfsRack) | **DELETE** /platform/1/protocols/hdfs/racks/{HdfsRackId} | 
[**deleteNdmpContextsBackupById**](ProtocolsApi.md#deleteNdmpContextsBackupById) | **DELETE** /platform/3/protocols/ndmp/contexts/backup/{NdmpContextsBackupId} | 
[**deleteNdmpContextsBreById**](ProtocolsApi.md#deleteNdmpContextsBreById) | **DELETE** /platform/3/protocols/ndmp/contexts/bre/{NdmpContextsBreId} | 
[**deleteNdmpContextsRestoreById**](ProtocolsApi.md#deleteNdmpContextsRestoreById) | **DELETE** /platform/3/protocols/ndmp/contexts/restore/{NdmpContextsRestoreId} | 
[**deleteNdmpDumpdate**](ProtocolsApi.md#deleteNdmpDumpdate) | **DELETE** /platform/3/protocols/ndmp/dumpdates/{NdmpDumpdateId} | 
[**deleteNdmpSession**](ProtocolsApi.md#deleteNdmpSession) | **DELETE** /platform/3/protocols/ndmp/sessions/{NdmpSessionId} | 
[**deleteNdmpSettingsPreferredIp**](ProtocolsApi.md#deleteNdmpSettingsPreferredIp) | **DELETE** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} | 
[**deleteNdmpSettingsVariable**](ProtocolsApi.md#deleteNdmpSettingsVariable) | **DELETE** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} | 
[**deleteNdmpUser**](ProtocolsApi.md#deleteNdmpUser) | **DELETE** /platform/3/protocols/ndmp/users/{NdmpUserId} | 
[**deleteNfsAlias**](ProtocolsApi.md#deleteNfsAlias) | **DELETE** /platform/2/protocols/nfs/aliases/{NfsAliasId} | 
[**deleteNfsExport**](ProtocolsApi.md#deleteNfsExport) | **DELETE** /platform/4/protocols/nfs/exports/{NfsExportId} | 
[**deleteNfsNlmSession**](ProtocolsApi.md#deleteNfsNlmSession) | **DELETE** /platform/3/protocols/nfs/nlm/sessions/{NfsNlmSessionId} | 
[**deleteNtpServer**](ProtocolsApi.md#deleteNtpServer) | **DELETE** /platform/3/protocols/ntp/servers/{NtpServerId} | 
[**deleteNtpServers**](ProtocolsApi.md#deleteNtpServers) | **DELETE** /platform/3/protocols/ntp/servers | 
[**deleteSmbLogLevelFilter**](ProtocolsApi.md#deleteSmbLogLevelFilter) | **DELETE** /platform/3/protocols/smb/log-level/filters/{SmbLogLevelFilterId} | 
[**deleteSmbLogLevelFilters**](ProtocolsApi.md#deleteSmbLogLevelFilters) | **DELETE** /platform/3/protocols/smb/log-level/filters | 
[**deleteSmbOpenfile**](ProtocolsApi.md#deleteSmbOpenfile) | **DELETE** /platform/1/protocols/smb/openfiles/{SmbOpenfileId} | 
[**deleteSmbSession**](ProtocolsApi.md#deleteSmbSession) | **DELETE** /platform/1/protocols/smb/sessions/{SmbSessionId} | 
[**deleteSmbSessionsComputerUser**](ProtocolsApi.md#deleteSmbSessionsComputerUser) | **DELETE** /platform/1/protocols/smb/sessions/{Computer}/{SmbSessionsComputerUser} | 
[**deleteSmbShare**](ProtocolsApi.md#deleteSmbShare) | **DELETE** /platform/4/protocols/smb/shares/{SmbShareId} | 
[**deleteSmbShares**](ProtocolsApi.md#deleteSmbShares) | **DELETE** /platform/4/protocols/smb/shares | 
[**deleteSwiftAccount**](ProtocolsApi.md#deleteSwiftAccount) | **DELETE** /platform/3/protocols/swift/accounts/{SwiftAccountId} | 
[**getFtpSettings**](ProtocolsApi.md#getFtpSettings) | **GET** /platform/3/protocols/ftp/settings | 
[**getHdfsLogLevel**](ProtocolsApi.md#getHdfsLogLevel) | **GET** /platform/3/protocols/hdfs/log-level | 
[**getHdfsProxyuser**](ProtocolsApi.md#getHdfsProxyuser) | **GET** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} | 
[**getHdfsRack**](ProtocolsApi.md#getHdfsRack) | **GET** /platform/1/protocols/hdfs/racks/{HdfsRackId} | 
[**getHdfsRangerPluginSettings**](ProtocolsApi.md#getHdfsRangerPluginSettings) | **GET** /platform/4/protocols/hdfs/ranger-plugin/settings | 
[**getHdfsSettings**](ProtocolsApi.md#getHdfsSettings) | **GET** /platform/4/protocols/hdfs/settings | 
[**getHttpSettings**](ProtocolsApi.md#getHttpSettings) | **GET** /platform/3/protocols/http/settings | 
[**getNdmpContextsBackup**](ProtocolsApi.md#getNdmpContextsBackup) | **GET** /platform/3/protocols/ndmp/contexts/backup | 
[**getNdmpContextsBackupById**](ProtocolsApi.md#getNdmpContextsBackupById) | **GET** /platform/3/protocols/ndmp/contexts/backup/{NdmpContextsBackupId} | 
[**getNdmpContextsBre**](ProtocolsApi.md#getNdmpContextsBre) | **GET** /platform/3/protocols/ndmp/contexts/bre | 
[**getNdmpContextsBreById**](ProtocolsApi.md#getNdmpContextsBreById) | **GET** /platform/3/protocols/ndmp/contexts/bre/{NdmpContextsBreId} | 
[**getNdmpContextsRestore**](ProtocolsApi.md#getNdmpContextsRestore) | **GET** /platform/3/protocols/ndmp/contexts/restore | 
[**getNdmpContextsRestoreById**](ProtocolsApi.md#getNdmpContextsRestoreById) | **GET** /platform/3/protocols/ndmp/contexts/restore/{NdmpContextsRestoreId} | 
[**getNdmpDiagnostics**](ProtocolsApi.md#getNdmpDiagnostics) | **GET** /platform/3/protocols/ndmp/diagnostics | 
[**getNdmpDumpdate**](ProtocolsApi.md#getNdmpDumpdate) | **GET** /platform/3/protocols/ndmp/dumpdates/{NdmpDumpdateId} | 
[**getNdmpLogs**](ProtocolsApi.md#getNdmpLogs) | **GET** /platform/3/protocols/ndmp/logs | 
[**getNdmpSession**](ProtocolsApi.md#getNdmpSession) | **GET** /platform/3/protocols/ndmp/sessions/{NdmpSessionId} | 
[**getNdmpSessions**](ProtocolsApi.md#getNdmpSessions) | **GET** /platform/3/protocols/ndmp/sessions | 
[**getNdmpSettingsDmas**](ProtocolsApi.md#getNdmpSettingsDmas) | **GET** /platform/3/protocols/ndmp/settings/dmas | 
[**getNdmpSettingsGlobal**](ProtocolsApi.md#getNdmpSettingsGlobal) | **GET** /platform/3/protocols/ndmp/settings/global | 
[**getNdmpSettingsPreferredIp**](ProtocolsApi.md#getNdmpSettingsPreferredIp) | **GET** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} | 
[**getNdmpSettingsVariable**](ProtocolsApi.md#getNdmpSettingsVariable) | **GET** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} | 
[**getNdmpUser**](ProtocolsApi.md#getNdmpUser) | **GET** /platform/3/protocols/ndmp/users/{NdmpUserId} | 
[**getNfsAlias**](ProtocolsApi.md#getNfsAlias) | **GET** /platform/2/protocols/nfs/aliases/{NfsAliasId} | 
[**getNfsCheck**](ProtocolsApi.md#getNfsCheck) | **GET** /platform/2/protocols/nfs/check | 
[**getNfsExport**](ProtocolsApi.md#getNfsExport) | **GET** /platform/4/protocols/nfs/exports/{NfsExportId} | 
[**getNfsExportsSummary**](ProtocolsApi.md#getNfsExportsSummary) | **GET** /platform/2/protocols/nfs/exports-summary | 
[**getNfsLogLevel**](ProtocolsApi.md#getNfsLogLevel) | **GET** /platform/3/protocols/nfs/log-level | 
[**getNfsNetgroup**](ProtocolsApi.md#getNfsNetgroup) | **GET** /platform/3/protocols/nfs/netgroup | 
[**getNfsNlmLocks**](ProtocolsApi.md#getNfsNlmLocks) | **GET** /platform/2/protocols/nfs/nlm/locks | 
[**getNfsNlmSession**](ProtocolsApi.md#getNfsNlmSession) | **GET** /platform/3/protocols/nfs/nlm/sessions/{NfsNlmSessionId} | 
[**getNfsNlmSessions**](ProtocolsApi.md#getNfsNlmSessions) | **GET** /platform/3/protocols/nfs/nlm/sessions | 
[**getNfsNlmWaiters**](ProtocolsApi.md#getNfsNlmWaiters) | **GET** /platform/2/protocols/nfs/nlm/waiters | 
[**getNfsSettingsExport**](ProtocolsApi.md#getNfsSettingsExport) | **GET** /platform/2/protocols/nfs/settings/export | 
[**getNfsSettingsGlobal**](ProtocolsApi.md#getNfsSettingsGlobal) | **GET** /platform/3/protocols/nfs/settings/global | 
[**getNfsSettingsZone**](ProtocolsApi.md#getNfsSettingsZone) | **GET** /platform/2/protocols/nfs/settings/zone | 
[**getNtpServer**](ProtocolsApi.md#getNtpServer) | **GET** /platform/3/protocols/ntp/servers/{NtpServerId} | 
[**getNtpSettings**](ProtocolsApi.md#getNtpSettings) | **GET** /platform/3/protocols/ntp/settings | 
[**getSmbLogLevel**](ProtocolsApi.md#getSmbLogLevel) | **GET** /platform/3/protocols/smb/log-level | 
[**getSmbLogLevelFilter**](ProtocolsApi.md#getSmbLogLevelFilter) | **GET** /platform/3/protocols/smb/log-level/filters/{SmbLogLevelFilterId} | 
[**getSmbOpenfiles**](ProtocolsApi.md#getSmbOpenfiles) | **GET** /platform/1/protocols/smb/openfiles | 
[**getSmbSessions**](ProtocolsApi.md#getSmbSessions) | **GET** /platform/1/protocols/smb/sessions | 
[**getSmbSettingsGlobal**](ProtocolsApi.md#getSmbSettingsGlobal) | **GET** /platform/3/protocols/smb/settings/global | 
[**getSmbSettingsShare**](ProtocolsApi.md#getSmbSettingsShare) | **GET** /platform/3/protocols/smb/settings/share | 
[**getSmbShare**](ProtocolsApi.md#getSmbShare) | **GET** /platform/4/protocols/smb/shares/{SmbShareId} | 
[**getSmbSharesSummary**](ProtocolsApi.md#getSmbSharesSummary) | **GET** /platform/1/protocols/smb/shares-summary | 
[**getSnmpSettings**](ProtocolsApi.md#getSnmpSettings) | **GET** /platform/5/protocols/snmp/settings | 
[**getSwiftAccount**](ProtocolsApi.md#getSwiftAccount) | **GET** /platform/3/protocols/swift/accounts/{SwiftAccountId} | 
[**listHdfsProxyusers**](ProtocolsApi.md#listHdfsProxyusers) | **GET** /platform/1/protocols/hdfs/proxyusers | 
[**listHdfsRacks**](ProtocolsApi.md#listHdfsRacks) | **GET** /platform/1/protocols/hdfs/racks | 
[**listNdmpSettingsPreferredIps**](ProtocolsApi.md#listNdmpSettingsPreferredIps) | **GET** /platform/4/protocols/ndmp/settings/preferred-ips | 
[**listNdmpUsers**](ProtocolsApi.md#listNdmpUsers) | **GET** /platform/3/protocols/ndmp/users | 
[**listNfsAliases**](ProtocolsApi.md#listNfsAliases) | **GET** /platform/2/protocols/nfs/aliases | 
[**listNfsExports**](ProtocolsApi.md#listNfsExports) | **GET** /platform/4/protocols/nfs/exports | 
[**listNtpServers**](ProtocolsApi.md#listNtpServers) | **GET** /platform/3/protocols/ntp/servers | 
[**listSmbLogLevelFilters**](ProtocolsApi.md#listSmbLogLevelFilters) | **GET** /platform/3/protocols/smb/log-level/filters | 
[**listSmbShares**](ProtocolsApi.md#listSmbShares) | **GET** /platform/4/protocols/smb/shares | 
[**listSwiftAccounts**](ProtocolsApi.md#listSwiftAccounts) | **GET** /platform/3/protocols/swift/accounts | 
[**updateFtpSettings**](ProtocolsApi.md#updateFtpSettings) | **PUT** /platform/3/protocols/ftp/settings | 
[**updateHdfsLogLevel**](ProtocolsApi.md#updateHdfsLogLevel) | **PUT** /platform/3/protocols/hdfs/log-level | 
[**updateHdfsProxyuser**](ProtocolsApi.md#updateHdfsProxyuser) | **PUT** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} | 
[**updateHdfsRack**](ProtocolsApi.md#updateHdfsRack) | **PUT** /platform/1/protocols/hdfs/racks/{HdfsRackId} | 
[**updateHdfsRangerPluginSettings**](ProtocolsApi.md#updateHdfsRangerPluginSettings) | **PUT** /platform/4/protocols/hdfs/ranger-plugin/settings | 
[**updateHdfsSettings**](ProtocolsApi.md#updateHdfsSettings) | **PUT** /platform/4/protocols/hdfs/settings | 
[**updateHttpSettings**](ProtocolsApi.md#updateHttpSettings) | **PUT** /platform/3/protocols/http/settings | 
[**updateNdmpDiagnostics**](ProtocolsApi.md#updateNdmpDiagnostics) | **PUT** /platform/3/protocols/ndmp/diagnostics | 
[**updateNdmpSettingsGlobal**](ProtocolsApi.md#updateNdmpSettingsGlobal) | **PUT** /platform/3/protocols/ndmp/settings/global | 
[**updateNdmpSettingsPreferredIp**](ProtocolsApi.md#updateNdmpSettingsPreferredIp) | **PUT** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} | 
[**updateNdmpSettingsVariable**](ProtocolsApi.md#updateNdmpSettingsVariable) | **PUT** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} | 
[**updateNdmpUser**](ProtocolsApi.md#updateNdmpUser) | **PUT** /platform/3/protocols/ndmp/users/{NdmpUserId} | 
[**updateNfsAlias**](ProtocolsApi.md#updateNfsAlias) | **PUT** /platform/2/protocols/nfs/aliases/{NfsAliasId} | 
[**updateNfsExport**](ProtocolsApi.md#updateNfsExport) | **PUT** /platform/4/protocols/nfs/exports/{NfsExportId} | 
[**updateNfsLogLevel**](ProtocolsApi.md#updateNfsLogLevel) | **PUT** /platform/3/protocols/nfs/log-level | 
[**updateNfsNetgroup**](ProtocolsApi.md#updateNfsNetgroup) | **PUT** /platform/3/protocols/nfs/netgroup | 
[**updateNfsSettingsExport**](ProtocolsApi.md#updateNfsSettingsExport) | **PUT** /platform/2/protocols/nfs/settings/export | 
[**updateNfsSettingsGlobal**](ProtocolsApi.md#updateNfsSettingsGlobal) | **PUT** /platform/3/protocols/nfs/settings/global | 
[**updateNfsSettingsZone**](ProtocolsApi.md#updateNfsSettingsZone) | **PUT** /platform/2/protocols/nfs/settings/zone | 
[**updateNtpServer**](ProtocolsApi.md#updateNtpServer) | **PUT** /platform/3/protocols/ntp/servers/{NtpServerId} | 
[**updateNtpSettings**](ProtocolsApi.md#updateNtpSettings) | **PUT** /platform/3/protocols/ntp/settings | 
[**updateSmbLogLevel**](ProtocolsApi.md#updateSmbLogLevel) | **PUT** /platform/3/protocols/smb/log-level | 
[**updateSmbSettingsGlobal**](ProtocolsApi.md#updateSmbSettingsGlobal) | **PUT** /platform/3/protocols/smb/settings/global | 
[**updateSmbSettingsShare**](ProtocolsApi.md#updateSmbSettingsShare) | **PUT** /platform/3/protocols/smb/settings/share | 
[**updateSmbShare**](ProtocolsApi.md#updateSmbShare) | **PUT** /platform/4/protocols/smb/shares/{SmbShareId} | 
[**updateSnmpSettings**](ProtocolsApi.md#updateSnmpSettings) | **PUT** /platform/5/protocols/snmp/settings | 
[**updateSwiftAccount**](ProtocolsApi.md#updateSwiftAccount) | **PUT** /platform/3/protocols/swift/accounts/{SwiftAccountId} | 


<a name="createHdfsProxyuser"></a>
# **createHdfsProxyuser**
> CreateResponse createHdfsProxyuser(hdfsProxyuser, zone)



Create a new HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsProxyuserCreateParams hdfsProxyuser = new HdfsProxyuserCreateParams(); // HdfsProxyuserCreateParams | 
String zone = "zone_example"; // String | Access zone which contains HDFS proxyuser.
try {
    CreateResponse result = apiInstance.createHdfsProxyuser(hdfsProxyuser, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createHdfsProxyuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsProxyuser** | [**HdfsProxyuserCreateParams**](HdfsProxyuserCreateParams.md)|  |
 **zone** | **String**| Access zone which contains HDFS proxyuser. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHdfsRack"></a>
# **createHdfsRack**
> CreateResponse createHdfsRack(hdfsRack, zone)



Create a new HDFS rack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsRackCreateParams hdfsRack = new HdfsRackCreateParams(); // HdfsRackCreateParams | 
String zone = "zone_example"; // String | Access zone which contains HDFS rack.
try {
    CreateResponse result = apiInstance.createHdfsRack(hdfsRack, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createHdfsRack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsRack** | [**HdfsRackCreateParams**](HdfsRackCreateParams.md)|  |
 **zone** | **String**| Access zone which contains HDFS rack. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNdmpSettingsPreferredIp"></a>
# **createNdmpSettingsPreferredIp**
> Empty createNdmpSettingsPreferredIp(ndmpSettingsPreferredIp)



Create a preferred ip preference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpSettingsPreferredIpCreateParams ndmpSettingsPreferredIp = new NdmpSettingsPreferredIpCreateParams(); // NdmpSettingsPreferredIpCreateParams | 
try {
    Empty result = apiInstance.createNdmpSettingsPreferredIp(ndmpSettingsPreferredIp);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNdmpSettingsPreferredIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsPreferredIp** | [**NdmpSettingsPreferredIpCreateParams**](NdmpSettingsPreferredIpCreateParams.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNdmpSettingsVariable"></a>
# **createNdmpSettingsVariable**
> Empty createNdmpSettingsVariable(ndmpSettingsVariable, ndmpSettingsVariableId)



Create a preferred NDMP environment variable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpSettingsVariableCreateParams ndmpSettingsVariable = new NdmpSettingsVariableCreateParams(); // NdmpSettingsVariableCreateParams | 
String ndmpSettingsVariableId = "ndmpSettingsVariableId_example"; // String | Create a preferred NDMP environment variable.
try {
    Empty result = apiInstance.createNdmpSettingsVariable(ndmpSettingsVariable, ndmpSettingsVariableId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNdmpSettingsVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsVariable** | [**NdmpSettingsVariableCreateParams**](NdmpSettingsVariableCreateParams.md)|  |
 **ndmpSettingsVariableId** | **String**| Create a preferred NDMP environment variable. |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNdmpUser"></a>
# **createNdmpUser**
> Empty createNdmpUser(ndmpUser)



Created a new user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpUserCreateParams ndmpUser = new NdmpUserCreateParams(); // NdmpUserCreateParams | 
try {
    Empty result = apiInstance.createNdmpUser(ndmpUser);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNdmpUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpUser** | [**NdmpUserCreateParams**](NdmpUserCreateParams.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsAlias"></a>
# **createNfsAlias**
> CreateNfsAliasResponse createNfsAlias(nfsAlias, zone)



Create a new NFS alias.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsAliasCreateParams nfsAlias = new NfsAliasCreateParams(); // NfsAliasCreateParams | 
String zone = "zone_example"; // String | Access zone
try {
    CreateNfsAliasResponse result = apiInstance.createNfsAlias(nfsAlias, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsAlias** | [**NfsAliasCreateParams**](NfsAliasCreateParams.md)|  |
 **zone** | **String**| Access zone | [optional]

### Return type

[**CreateNfsAliasResponse**](CreateNfsAliasResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsExport"></a>
# **createNfsExport**
> CreateQuotaReportResponse createNfsExport(nfsExport, force, ignoreUnresolvableHosts, zone, ignoreConflicts, ignoreBadPaths, ignoreBadAuth)



Create a new NFS export.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsExportCreateParams nfsExport = new NfsExportCreateParams(); // NfsExportCreateParams | 
Boolean force = true; // Boolean | If true, the export will be created even if it conflicts with another export.
Boolean ignoreUnresolvableHosts = true; // Boolean | Ignore unresolvable hosts.
String zone = "zone_example"; // String | Access zone
Boolean ignoreConflicts = true; // Boolean | Ignore conflicts with existing exports.
Boolean ignoreBadPaths = true; // Boolean | Ignore nonexistent or otherwise bad paths.
Boolean ignoreBadAuth = true; // Boolean | Ignore invalid users.
try {
    CreateQuotaReportResponse result = apiInstance.createNfsExport(nfsExport, force, ignoreUnresolvableHosts, zone, ignoreConflicts, ignoreBadPaths, ignoreBadAuth);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsExport** | [**NfsExportCreateParams**](NfsExportCreateParams.md)|  |
 **force** | **Boolean**| If true, the export will be created even if it conflicts with another export. | [optional]
 **ignoreUnresolvableHosts** | **Boolean**| Ignore unresolvable hosts. | [optional]
 **zone** | **String**| Access zone | [optional]
 **ignoreConflicts** | **Boolean**| Ignore conflicts with existing exports. | [optional]
 **ignoreBadPaths** | **Boolean**| Ignore nonexistent or otherwise bad paths. | [optional]
 **ignoreBadAuth** | **Boolean**| Ignore invalid users. | [optional]

### Return type

[**CreateQuotaReportResponse**](CreateQuotaReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsNetgroupCheckItem"></a>
# **createNfsNetgroupCheckItem**
> Empty createNfsNetgroupCheckItem(nfsNetgroupCheckItem, host)



Update the NFS netgroups in the cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Empty nfsNetgroupCheckItem = new Empty(); // Empty | 
String host = "host_example"; // String | IP address of node to update. If unspecified, the local nodes cache is updated.
try {
    Empty result = apiInstance.createNfsNetgroupCheckItem(nfsNetgroupCheckItem, host);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsNetgroupCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNetgroupCheckItem** | [**Empty**](Empty.md)|  |
 **host** | **String**| IP address of node to update. If unspecified, the local nodes cache is updated. | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsNetgroupFlushItem"></a>
# **createNfsNetgroupFlushItem**
> Empty createNfsNetgroupFlushItem(nfsNetgroupFlushItem, host)



Flush the NFS netgroups in the cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Empty nfsNetgroupFlushItem = new Empty(); // Empty | 
String host = "host_example"; // String | IP address of node to flush. If unspecified, all nodes on the cluster are flushed.
try {
    Empty result = apiInstance.createNfsNetgroupFlushItem(nfsNetgroupFlushItem, host);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsNetgroupFlushItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNetgroupFlushItem** | [**Empty**](Empty.md)|  |
 **host** | **String**| IP address of node to flush. If unspecified, all nodes on the cluster are flushed. | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsNlmSessionsCheckItem"></a>
# **createNfsNlmSessionsCheckItem**
> CreateNfsNlmSessionsCheckItemResponse createNfsNlmSessionsCheckItem(nfsNlmSessionsCheckItem, clusterIp, zone)



Perform an active scan for lost NFSv3 locks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Empty nfsNlmSessionsCheckItem = new Empty(); // Empty | 
String clusterIp = "clusterIp_example"; // String | An IP address for which NSM has client records
String zone = "zone_example"; // String | Represents an extant auth zone
try {
    CreateNfsNlmSessionsCheckItemResponse result = apiInstance.createNfsNlmSessionsCheckItem(nfsNlmSessionsCheckItem, clusterIp, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsNlmSessionsCheckItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNlmSessionsCheckItem** | [**Empty**](Empty.md)|  |
 **clusterIp** | **String**| An IP address for which NSM has client records | [optional]
 **zone** | **String**| Represents an extant auth zone | [optional]

### Return type

[**CreateNfsNlmSessionsCheckItemResponse**](CreateNfsNlmSessionsCheckItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNfsReloadItem"></a>
# **createNfsReloadItem**
> Empty createNfsReloadItem(nfsReloadItem, zone)



Reload default NFS export configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Empty nfsReloadItem = new Empty(); // Empty | 
String zone = "zone_example"; // String | Access zone
try {
    Empty result = apiInstance.createNfsReloadItem(nfsReloadItem, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNfsReloadItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsReloadItem** | [**Empty**](Empty.md)|  |
 **zone** | **String**| Access zone | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNtpServer"></a>
# **createNtpServer**
> CreateResponse createNtpServer(ntpServer)



Create an NTP server entry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NtpServerCreateParams ntpServer = new NtpServerCreateParams(); // NtpServerCreateParams | 
try {
    CreateResponse result = apiInstance.createNtpServer(ntpServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createNtpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ntpServer** | [**NtpServerCreateParams**](NtpServerCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSmbLogLevelFilter"></a>
# **createSmbLogLevelFilter**
> CreateAuthRefreshItemResponse createSmbLogLevelFilter(smbLogLevelFilter)



Add an SMB log filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbLogLevelFilter smbLogLevelFilter = new SmbLogLevelFilter(); // SmbLogLevelFilter | 
try {
    CreateAuthRefreshItemResponse result = apiInstance.createSmbLogLevelFilter(smbLogLevelFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createSmbLogLevelFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbLogLevelFilter** | [**SmbLogLevelFilter**](SmbLogLevelFilter.md)|  |

### Return type

[**CreateAuthRefreshItemResponse**](CreateAuthRefreshItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSmbShare"></a>
# **createSmbShare**
> CreateResponse createSmbShare(smbShare, zone)



Create a new share.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbShareCreateParams smbShare = new SmbShareCreateParams(); // SmbShareCreateParams | 
String zone = "zone_example"; // String | Zone which contains this share.
try {
    CreateResponse result = apiInstance.createSmbShare(smbShare, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createSmbShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbShare** | [**SmbShareCreateParams**](SmbShareCreateParams.md)|  |
 **zone** | **String**| Zone which contains this share. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSwiftAccount"></a>
# **createSwiftAccount**
> CreateResponse createSwiftAccount(swiftAccount, zone)



Create a new Swift account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SwiftAccount swiftAccount = new SwiftAccount(); // SwiftAccount | 
String zone = "zone_example"; // String | Access zone which contains Swift account.
try {
    CreateResponse result = apiInstance.createSwiftAccount(swiftAccount, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#createSwiftAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **swiftAccount** | [**SwiftAccount**](SwiftAccount.md)|  |
 **zone** | **String**| Access zone which contains Swift account. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHdfsProxyuser"></a>
# **deleteHdfsProxyuser**
> deleteHdfsProxyuser(hdfsProxyuserId, zone)



Delete an HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String hdfsProxyuserId = "hdfsProxyuserId_example"; // String | Delete an HDFS proxyuser.
String zone = "zone_example"; // String | Access zone which contains HDFS proxyuser.
try {
    apiInstance.deleteHdfsProxyuser(hdfsProxyuserId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteHdfsProxyuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsProxyuserId** | **String**| Delete an HDFS proxyuser. |
 **zone** | **String**| Access zone which contains HDFS proxyuser. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHdfsRack"></a>
# **deleteHdfsRack**
> deleteHdfsRack(hdfsRackId, zone)



Delete the HDFS rack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String hdfsRackId = "hdfsRackId_example"; // String | Delete the HDFS rack.
String zone = "zone_example"; // String | Access zone which contains HDFS rack.
try {
    apiInstance.deleteHdfsRack(hdfsRackId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteHdfsRack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsRackId** | **String**| Delete the HDFS rack. |
 **zone** | **String**| Access zone which contains HDFS rack. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpContextsBackupById"></a>
# **deleteNdmpContextsBackupById**
> deleteNdmpContextsBackupById(ndmpContextsBackupId)



Delete a backup context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsBackupId = "ndmpContextsBackupId_example"; // String | Delete a backup context
try {
    apiInstance.deleteNdmpContextsBackupById(ndmpContextsBackupId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpContextsBackupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsBackupId** | **String**| Delete a backup context |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpContextsBreById"></a>
# **deleteNdmpContextsBreById**
> deleteNdmpContextsBreById(ndmpContextsBreId)



Delete a NDMP BRE context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsBreId = "ndmpContextsBreId_example"; // String | Delete a NDMP BRE context
try {
    apiInstance.deleteNdmpContextsBreById(ndmpContextsBreId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpContextsBreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsBreId** | **String**| Delete a NDMP BRE context |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpContextsRestoreById"></a>
# **deleteNdmpContextsRestoreById**
> deleteNdmpContextsRestoreById(ndmpContextsRestoreId)



Delete a restore context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsRestoreId = "ndmpContextsRestoreId_example"; // String | Delete a restore context
try {
    apiInstance.deleteNdmpContextsRestoreById(ndmpContextsRestoreId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpContextsRestoreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsRestoreId** | **String**| Delete a restore context |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpDumpdate"></a>
# **deleteNdmpDumpdate**
> deleteNdmpDumpdate(ndmpDumpdateId, level)



Delete dumpdates entries of a specified path.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpDumpdateId = "ndmpDumpdateId_example"; // String | Delete dumpdates entries of a specified path.
Integer level = 56; // Integer | Level is an input from 0 to 10.
try {
    apiInstance.deleteNdmpDumpdate(ndmpDumpdateId, level);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpDumpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpDumpdateId** | **String**| Delete dumpdates entries of a specified path. |
 **level** | **Integer**| Level is an input from 0 to 10. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpSession"></a>
# **deleteNdmpSession**
> deleteNdmpSession(ndmpSessionId, lnn)



Delete the ndmp session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSessionId = "ndmpSessionId_example"; // String | Delete the ndmp session.
String lnn = "lnn_example"; // String | Logical node number.
try {
    apiInstance.deleteNdmpSession(ndmpSessionId, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSessionId** | **String**| Delete the ndmp session. |
 **lnn** | **String**| Logical node number. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpSettingsPreferredIp"></a>
# **deleteNdmpSettingsPreferredIp**
> deleteNdmpSettingsPreferredIp(ndmpSettingsPreferredIpId)



Delete a preferred ip preference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSettingsPreferredIpId = "ndmpSettingsPreferredIpId_example"; // String | Delete a preferred ip preference.
try {
    apiInstance.deleteNdmpSettingsPreferredIp(ndmpSettingsPreferredIpId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpSettingsPreferredIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsPreferredIpId** | **String**| Delete a preferred ip preference. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpSettingsVariable"></a>
# **deleteNdmpSettingsVariable**
> deleteNdmpSettingsVariable(ndmpSettingsVariableId, name)



Delete preferred environment variable entries

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSettingsVariableId = "ndmpSettingsVariableId_example"; // String | Delete preferred environment variable entries
String name = "name_example"; // String | Name of the variable to delete.
try {
    apiInstance.deleteNdmpSettingsVariable(ndmpSettingsVariableId, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpSettingsVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsVariableId** | **String**| Delete preferred environment variable entries |
 **name** | **String**| Name of the variable to delete. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNdmpUser"></a>
# **deleteNdmpUser**
> deleteNdmpUser(ndmpUserId)



Delete the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpUserId = "ndmpUserId_example"; // String | Delete the user.
try {
    apiInstance.deleteNdmpUser(ndmpUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNdmpUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpUserId** | **String**| Delete the user. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNfsAlias"></a>
# **deleteNfsAlias**
> deleteNfsAlias(nfsAliasId, zone)



Delete the export.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsAliasId = "nfsAliasId_example"; // String | Delete the export.
String zone = "zone_example"; // String | Access zone
try {
    apiInstance.deleteNfsAlias(nfsAliasId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNfsAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsAliasId** | **String**| Delete the export. |
 **zone** | **String**| Access zone | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNfsExport"></a>
# **deleteNfsExport**
> deleteNfsExport(nfsExportId, zone)



Delete the export.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsExportId = "nfsExportId_example"; // String | Delete the export.
String zone = "zone_example"; // String | Access zone
try {
    apiInstance.deleteNfsExport(nfsExportId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNfsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsExportId** | **String**| Delete the export. |
 **zone** | **String**| Access zone | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNfsNlmSession"></a>
# **deleteNfsNlmSession**
> deleteNfsNlmSession(nfsNlmSessionId, clusterIp, zone, refresh)



Delete all lock state for this host.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsNlmSessionId = "nfsNlmSessionId_example"; // String | Delete all lock state for this host.
String clusterIp = "clusterIp_example"; // String | An IP address for which NSM has client records
String zone = "zone_example"; // String | Represents an extant auth zone
Boolean refresh = true; // Boolean | if set to true, the client will be given a chance to reclaim its locks before they are destroyed
try {
    apiInstance.deleteNfsNlmSession(nfsNlmSessionId, clusterIp, zone, refresh);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNfsNlmSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNlmSessionId** | **String**| Delete all lock state for this host. |
 **clusterIp** | **String**| An IP address for which NSM has client records | [optional]
 **zone** | **String**| Represents an extant auth zone | [optional]
 **refresh** | **Boolean**| if set to true, the client will be given a chance to reclaim its locks before they are destroyed | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNtpServer"></a>
# **deleteNtpServer**
> deleteNtpServer(ntpServerId)



Delete an NTP server entry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ntpServerId = "ntpServerId_example"; // String | Delete an NTP server entry.
try {
    apiInstance.deleteNtpServer(ntpServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNtpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ntpServerId** | **String**| Delete an NTP server entry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNtpServers"></a>
# **deleteNtpServers**
> deleteNtpServers()



Delete all NTP server entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    apiInstance.deleteNtpServers();
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteNtpServers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbLogLevelFilter"></a>
# **deleteSmbLogLevelFilter**
> deleteSmbLogLevelFilter(smbLogLevelFilterId)



Delete log filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbLogLevelFilterId = "smbLogLevelFilterId_example"; // String | Delete log filter.
try {
    apiInstance.deleteSmbLogLevelFilter(smbLogLevelFilterId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbLogLevelFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbLogLevelFilterId** | **String**| Delete log filter. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbLogLevelFilters"></a>
# **deleteSmbLogLevelFilters**
> deleteSmbLogLevelFilters(level)



Delete existing SMB log filters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String level = "level_example"; // String | Valid SMB logging levels
try {
    apiInstance.deleteSmbLogLevelFilters(level);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbLogLevelFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level** | **String**| Valid SMB logging levels | [optional] [enum: always, error, warning, info, verbose, debug, trace]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbOpenfile"></a>
# **deleteSmbOpenfile**
> deleteSmbOpenfile(smbOpenfileId)



Close the file in the SMB server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbOpenfileId = "smbOpenfileId_example"; // String | Close the file in the SMB server.
try {
    apiInstance.deleteSmbOpenfile(smbOpenfileId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbOpenfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbOpenfileId** | **String**| Close the file in the SMB server. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbSession"></a>
# **deleteSmbSession**
> deleteSmbSession(smbSessionId)



Close the SMB session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbSessionId = "smbSessionId_example"; // String | Close the SMB session.
try {
    apiInstance.deleteSmbSession(smbSessionId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbSessionId** | **String**| Close the SMB session. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbSessionsComputerUser"></a>
# **deleteSmbSessionsComputerUser**
> deleteSmbSessionsComputerUser(smbSessionsComputerUser, computer)



Close the SMB session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbSessionsComputerUser = "smbSessionsComputerUser_example"; // String | Close the SMB session.
String computer = "computer_example"; // String | 
try {
    apiInstance.deleteSmbSessionsComputerUser(smbSessionsComputerUser, computer);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbSessionsComputerUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbSessionsComputerUser** | **String**| Close the SMB session. |
 **computer** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbShare"></a>
# **deleteSmbShare**
> deleteSmbShare(smbShareId, zone)



Delete the share.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbShareId = "smbShareId_example"; // String | Delete the share.
String zone = "zone_example"; // String | Zone which contains this share.
try {
    apiInstance.deleteSmbShare(smbShareId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbShareId** | **String**| Delete the share. |
 **zone** | **String**| Zone which contains this share. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSmbShares"></a>
# **deleteSmbShares**
> deleteSmbShares()



Delete multiple smb shares.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    apiInstance.deleteSmbShares();
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSmbShares");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSwiftAccount"></a>
# **deleteSwiftAccount**
> deleteSwiftAccount(swiftAccountId, zone)



Delete a Swift account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String swiftAccountId = "swiftAccountId_example"; // String | Delete a Swift account.
String zone = "zone_example"; // String | Access zone which contains Swift account.
try {
    apiInstance.deleteSwiftAccount(swiftAccountId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#deleteSwiftAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **swiftAccountId** | **String**| Delete a Swift account. |
 **zone** | **String**| Access zone which contains Swift account. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFtpSettings"></a>
# **getFtpSettings**
> FtpSettings getFtpSettings()



Retrieve the FTP settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    FtpSettings result = apiInstance.getFtpSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getFtpSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FtpSettings**](FtpSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHdfsLogLevel"></a>
# **getHdfsLogLevel**
> HdfsLogLevel getHdfsLogLevel()



Retrieve the HDFS service log-level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    HdfsLogLevel result = apiInstance.getHdfsLogLevel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHdfsLogLevel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HdfsLogLevel**](HdfsLogLevel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHdfsProxyuser"></a>
# **getHdfsProxyuser**
> HdfsProxyusers getHdfsProxyuser(hdfsProxyuserId, zone)



View the proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String hdfsProxyuserId = "hdfsProxyuserId_example"; // String | View the proxyuser.
String zone = "zone_example"; // String | Access zone which contains HDFS proxyuser.
try {
    HdfsProxyusers result = apiInstance.getHdfsProxyuser(hdfsProxyuserId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHdfsProxyuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsProxyuserId** | **String**| View the proxyuser. |
 **zone** | **String**| Access zone which contains HDFS proxyuser. | [optional]

### Return type

[**HdfsProxyusers**](HdfsProxyusers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHdfsRack"></a>
# **getHdfsRack**
> HdfsRacks getHdfsRack(hdfsRackId, zone)



Retrieve the HDFS rack.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String hdfsRackId = "hdfsRackId_example"; // String | Retrieve the HDFS rack.
String zone = "zone_example"; // String | Access zone which contains HDFS rack.
try {
    HdfsRacks result = apiInstance.getHdfsRack(hdfsRackId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHdfsRack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsRackId** | **String**| Retrieve the HDFS rack. |
 **zone** | **String**| Access zone which contains HDFS rack. | [optional]

### Return type

[**HdfsRacks**](HdfsRacks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHdfsRangerPluginSettings"></a>
# **getHdfsRangerPluginSettings**
> HdfsRangerPluginSettings getHdfsRangerPluginSettings(zone)



Retrieve HDFS ranger-plugin properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone which contains HDFS ranger-plugin settings.
try {
    HdfsRangerPluginSettings result = apiInstance.getHdfsRangerPluginSettings(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHdfsRangerPluginSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains HDFS ranger-plugin settings. | [optional]

### Return type

[**HdfsRangerPluginSettings**](HdfsRangerPluginSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHdfsSettings"></a>
# **getHdfsSettings**
> HdfsSettings getHdfsSettings(zone)



Retrieve HDFS properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone which contains HDFS settings.
try {
    HdfsSettings result = apiInstance.getHdfsSettings(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHdfsSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains HDFS settings. | [optional]

### Return type

[**HdfsSettings**](HdfsSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHttpSettings"></a>
# **getHttpSettings**
> HttpSettings getHttpSettings()



Retrieve HTTP properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    HttpSettings result = apiInstance.getHttpSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getHttpSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HttpSettings**](HttpSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsBackup"></a>
# **getNdmpContextsBackup**
> NdmpContextsBackupExtended getNdmpContextsBackup(limit, resume)



Get List of NDMP Backup Contexts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpContextsBackupExtended result = apiInstance.getNdmpContextsBackup(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsBackup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpContextsBackupExtended**](NdmpContextsBackupExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsBackupById"></a>
# **getNdmpContextsBackupById**
> NdmpContextsBackup getNdmpContextsBackupById(ndmpContextsBackupId)



View a NDMP backup context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsBackupId = "ndmpContextsBackupId_example"; // String | View a NDMP backup context
try {
    NdmpContextsBackup result = apiInstance.getNdmpContextsBackupById(ndmpContextsBackupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsBackupById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsBackupId** | **String**| View a NDMP backup context |

### Return type

[**NdmpContextsBackup**](NdmpContextsBackup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsBre"></a>
# **getNdmpContextsBre**
> NdmpContextsBreExtended getNdmpContextsBre(limit, resume)



Get list of NDMP BRE Contexts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpContextsBreExtended result = apiInstance.getNdmpContextsBre(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsBre");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpContextsBreExtended**](NdmpContextsBreExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsBreById"></a>
# **getNdmpContextsBreById**
> NdmpContextsBre getNdmpContextsBreById(ndmpContextsBreId)



View a NDMP BRE context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsBreId = "ndmpContextsBreId_example"; // String | View a NDMP BRE context
try {
    NdmpContextsBre result = apiInstance.getNdmpContextsBreById(ndmpContextsBreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsBreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsBreId** | **String**| View a NDMP BRE context |

### Return type

[**NdmpContextsBre**](NdmpContextsBre.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsRestore"></a>
# **getNdmpContextsRestore**
> NdmpContextsBackupExtended getNdmpContextsRestore(limit, resume)



Get List of NDMP Restore Contexts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpContextsBackupExtended result = apiInstance.getNdmpContextsRestore(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsRestore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpContextsBackupExtended**](NdmpContextsBackupExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpContextsRestoreById"></a>
# **getNdmpContextsRestoreById**
> NdmpContextsBackup getNdmpContextsRestoreById(ndmpContextsRestoreId)



View a NDMP restore context

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpContextsRestoreId = "ndmpContextsRestoreId_example"; // String | View a NDMP restore context
try {
    NdmpContextsBackup result = apiInstance.getNdmpContextsRestoreById(ndmpContextsRestoreId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpContextsRestoreById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpContextsRestoreId** | **String**| View a NDMP restore context |

### Return type

[**NdmpContextsBackup**](NdmpContextsBackup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpDiagnostics"></a>
# **getNdmpDiagnostics**
> NdmpDiagnostics getNdmpDiagnostics()



List ndmp diagnostics settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NdmpDiagnostics result = apiInstance.getNdmpDiagnostics();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpDiagnostics");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NdmpDiagnostics**](NdmpDiagnostics.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpDumpdate"></a>
# **getNdmpDumpdate**
> NdmpDumpdates getNdmpDumpdate(ndmpDumpdateId, sort, resume, level, limit, path, dir)



List of dumpdates entries.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpDumpdateId = "ndmpDumpdateId_example"; // String | List of dumpdates entries.
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer level = 56; // Integer | Filter by dumpdate level.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String path = "path_example"; // String | Filter by file path.
String dir = "dir_example"; // String | The direction of the sort.
try {
    NdmpDumpdates result = apiInstance.getNdmpDumpdate(ndmpDumpdateId, sort, resume, level, limit, path, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpDumpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpDumpdateId** | **String**| List of dumpdates entries. |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **level** | **Integer**| Filter by dumpdate level. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **path** | **String**| Filter by file path. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NdmpDumpdates**](NdmpDumpdates.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpLogs"></a>
# **getNdmpLogs**
> NdmpLogs getNdmpLogs(lnn, page, pagesize)



Get NDMP logs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String lnn = "lnn_example"; // String | Logical node number.
Integer page = 56; // Integer | The page number of the NDMP logs file.
Integer pagesize = 56; // Integer | The page size of each page of the NDMP log file.
try {
    NdmpLogs result = apiInstance.getNdmpLogs(lnn, page, pagesize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpLogs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **String**| Logical node number. | [optional]
 **page** | **Integer**| The page number of the NDMP logs file. | [optional]
 **pagesize** | **Integer**| The page size of each page of the NDMP log file. | [optional]

### Return type

[**NdmpLogs**](NdmpLogs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSession"></a>
# **getNdmpSession**
> NdmpSessions getNdmpSession(ndmpSessionId, lnn)



Retrieve the ndmp session.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSessionId = "ndmpSessionId_example"; // String | Retrieve the ndmp session.
String lnn = "lnn_example"; // String | Logical node number.
try {
    NdmpSessions result = apiInstance.getNdmpSession(ndmpSessionId, lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSessionId** | **String**| Retrieve the ndmp session. |
 **lnn** | **String**| Logical node number. | [optional]

### Return type

[**NdmpSessions**](NdmpSessions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSessions"></a>
# **getNdmpSessions**
> NdmpSessionsExtended getNdmpSessions(consolidate, node, session, limit, resume)



List all ndmp sessions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Boolean consolidate = true; // Boolean | Combine sessions in the same context.
String node = "node_example"; // String | Only return sessions of the node.
String session = "session_example"; // String | Only return the specified session.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpSessionsExtended result = apiInstance.getNdmpSessions(consolidate, node, session, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **consolidate** | **Boolean**| Combine sessions in the same context. | [optional]
 **node** | **String**| Only return sessions of the node. | [optional]
 **session** | **String**| Only return the specified session. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpSessionsExtended**](NdmpSessionsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSettingsDmas"></a>
# **getNdmpSettingsDmas**
> NdmpSettingsDmas getNdmpSettingsDmas()



List of supported dma vendors.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NdmpSettingsDmas result = apiInstance.getNdmpSettingsDmas();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSettingsDmas");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NdmpSettingsDmas**](NdmpSettingsDmas.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSettingsGlobal"></a>
# **getNdmpSettingsGlobal**
> NdmpSettingsGlobal getNdmpSettingsGlobal()



List global ndmp settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NdmpSettingsGlobal result = apiInstance.getNdmpSettingsGlobal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NdmpSettingsGlobal**](NdmpSettingsGlobal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSettingsPreferredIp"></a>
# **getNdmpSettingsPreferredIp**
> NdmpSettingsPreferredIps getNdmpSettingsPreferredIp(ndmpSettingsPreferredIpId)



Get one preference by id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSettingsPreferredIpId = "ndmpSettingsPreferredIpId_example"; // String | Get one preference by id.
try {
    NdmpSettingsPreferredIps result = apiInstance.getNdmpSettingsPreferredIp(ndmpSettingsPreferredIpId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSettingsPreferredIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsPreferredIpId** | **String**| Get one preference by id. |

### Return type

[**NdmpSettingsPreferredIps**](NdmpSettingsPreferredIps.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpSettingsVariable"></a>
# **getNdmpSettingsVariable**
> NdmpSettingsVariables getNdmpSettingsVariable(ndmpSettingsVariableId, path, limit, resume)



List of preferred environment variables.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpSettingsVariableId = "ndmpSettingsVariableId_example"; // String | List of preferred environment variables.
String path = "path_example"; // String | Return variables of the path.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpSettingsVariables result = apiInstance.getNdmpSettingsVariable(ndmpSettingsVariableId, path, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpSettingsVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsVariableId** | **String**| List of preferred environment variables. |
 **path** | **String**| Return variables of the path. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpSettingsVariables**](NdmpSettingsVariables.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNdmpUser"></a>
# **getNdmpUser**
> NdmpUsers getNdmpUser(ndmpUserId)



Retrieve the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ndmpUserId = "ndmpUserId_example"; // String | Retrieve the user.
try {
    NdmpUsers result = apiInstance.getNdmpUser(ndmpUserId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNdmpUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpUserId** | **String**| Retrieve the user. |

### Return type

[**NdmpUsers**](NdmpUsers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsAlias"></a>
# **getNfsAlias**
> NfsAliases getNfsAlias(nfsAliasId, scope, check, zone)



Retrieve export information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsAliasId = "nfsAliasId_example"; // String | Retrieve export information.
String scope = "scope_example"; // String | When specified as 'effective', or not specified, all fields are returned. When specified as 'user', only fields with non-default values are shown. When specified as 'default', the original values are returned.
Boolean check = true; // Boolean | Check for conflicts when viewing alias.
String zone = "zone_example"; // String | Access zone
try {
    NfsAliases result = apiInstance.getNfsAlias(nfsAliasId, scope, check, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsAliasId** | **String**| Retrieve export information. |
 **scope** | **String**| When specified as &#39;effective&#39;, or not specified, all fields are returned. When specified as &#39;user&#39;, only fields with non-default values are shown. When specified as &#39;default&#39;, the original values are returned. | [optional] [enum: effective, user]
 **check** | **Boolean**| Check for conflicts when viewing alias. | [optional]
 **zone** | **String**| Access zone | [optional]

### Return type

[**NfsAliases**](NfsAliases.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsCheck"></a>
# **getNfsCheck**
> NfsCheckExtended getNfsCheck(ignoreBadPaths, ignoreBadAuth, zone, ignoreUnresolvableHosts)



Retrieve NFS export validation information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Boolean ignoreBadPaths = true; // Boolean | Ignore nonexistent or otherwise bad paths.
Boolean ignoreBadAuth = true; // Boolean | Ignore invalid users.
String zone = "zone_example"; // String | Access zone
Boolean ignoreUnresolvableHosts = true; // Boolean | Ignore unresolvable hosts.
try {
    NfsCheckExtended result = apiInstance.getNfsCheck(ignoreBadPaths, ignoreBadAuth, zone, ignoreUnresolvableHosts);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ignoreBadPaths** | **Boolean**| Ignore nonexistent or otherwise bad paths. | [optional]
 **ignoreBadAuth** | **Boolean**| Ignore invalid users. | [optional]
 **zone** | **String**| Access zone | [optional]
 **ignoreUnresolvableHosts** | **Boolean**| Ignore unresolvable hosts. | [optional]

### Return type

[**NfsCheckExtended**](NfsCheckExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsExport"></a>
# **getNfsExport**
> NfsExports getNfsExport(nfsExportId, scope, zone)



Retrieve export information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsExportId = "nfsExportId_example"; // String | Retrieve export information.
String scope = "scope_example"; // String | When specified as 'effective', or not specified, all fields are returned. When specified as 'user', only fields with non-default values are shown. When specified as 'default', the original values are returned.
String zone = "zone_example"; // String | Access zone
try {
    NfsExports result = apiInstance.getNfsExport(nfsExportId, scope, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsExportId** | **String**| Retrieve export information. |
 **scope** | **String**| When specified as &#39;effective&#39;, or not specified, all fields are returned. When specified as &#39;user&#39;, only fields with non-default values are shown. When specified as &#39;default&#39;, the original values are returned. | [optional] [enum: effective, user]
 **zone** | **String**| Access zone | [optional]

### Return type

[**NfsExports**](NfsExports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsExportsSummary"></a>
# **getNfsExportsSummary**
> NfsExportsSummary getNfsExportsSummary(zone)



Retrieve NFS export summary information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone
try {
    NfsExportsSummary result = apiInstance.getNfsExportsSummary(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsExportsSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone | [optional]

### Return type

[**NfsExportsSummary**](NfsExportsSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsLogLevel"></a>
# **getNfsLogLevel**
> NfsLogLevel getNfsLogLevel()



Get the current NFS service logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NfsLogLevel result = apiInstance.getNfsLogLevel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsLogLevel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NfsLogLevel**](NfsLogLevel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsNetgroup"></a>
# **getNfsNetgroup**
> NfsNetgroup getNfsNetgroup(host)



Get the current NFS netgroup cache settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String host = "host_example"; // String | Host to retrieve netgroup cache settings from.
try {
    NfsNetgroup result = apiInstance.getNfsNetgroup(host);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsNetgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **host** | **String**| Host to retrieve netgroup cache settings from. | [optional]

### Return type

[**NfsNetgroup**](NfsNetgroup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsNlmLocks"></a>
# **getNfsNlmLocks**
> NfsNlmLocks getNfsNlmLocks(sort, created, lin, resume, client, limit, clientId, path, dir)



List all NLM locks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String created = "created_example"; // String | Return locks created after the specified unix epoch time.
String lin = "lin_example"; // String | Filter locks by the specified LIN in /ifs that is locked.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String client = "client_example"; // String | Filter locks by the specified client host name and IP address.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String clientId = "clientId_example"; // String | Filter locks by the specified client ID.
String path = "path_example"; // String | Filter locks by the specified path under /ifs.
String dir = "dir_example"; // String | The direction of the sort.
try {
    NfsNlmLocks result = apiInstance.getNfsNlmLocks(sort, created, lin, resume, client, limit, clientId, path, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsNlmLocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **created** | **String**| Return locks created after the specified unix epoch time. | [optional]
 **lin** | **String**| Filter locks by the specified LIN in /ifs that is locked. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **client** | **String**| Filter locks by the specified client host name and IP address. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **clientId** | **String**| Filter locks by the specified client ID. | [optional]
 **path** | **String**| Filter locks by the specified path under /ifs. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NfsNlmLocks**](NfsNlmLocks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsNlmSession"></a>
# **getNfsNlmSession**
> NfsNlmSessions getNfsNlmSession(nfsNlmSessionId, clusterIp, zone)



Retrieve all lock state for a single client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String nfsNlmSessionId = "nfsNlmSessionId_example"; // String | Retrieve all lock state for a single client.
String clusterIp = "clusterIp_example"; // String | An IP address for which NSM has client records
String zone = "zone_example"; // String | Represents an extant auth zone
try {
    NfsNlmSessions result = apiInstance.getNfsNlmSession(nfsNlmSessionId, clusterIp, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsNlmSession");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNlmSessionId** | **String**| Retrieve all lock state for a single client. |
 **clusterIp** | **String**| An IP address for which NSM has client records | [optional]
 **zone** | **String**| Represents an extant auth zone | [optional]

### Return type

[**NfsNlmSessions**](NfsNlmSessions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsNlmSessions"></a>
# **getNfsNlmSessions**
> NfsNlmSessionsExtended getNfsNlmSessions(sort, ip, limit, zone, dir)



List all NSM clients (optionally filtered by either zone or IP)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String ip = "ip_example"; // String | An IP address for which NSM has client records
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String zone = "zone_example"; // String | Represents an extant auth zone
String dir = "dir_example"; // String | The direction of the sort.
try {
    NfsNlmSessionsExtended result = apiInstance.getNfsNlmSessions(sort, ip, limit, zone, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsNlmSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **ip** | **String**| An IP address for which NSM has client records | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **zone** | **String**| Represents an extant auth zone | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NfsNlmSessionsExtended**](NfsNlmSessionsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsNlmWaiters"></a>
# **getNfsNlmWaiters**
> NfsNlmWaiters getNfsNlmWaiters(sort, limit, dir, resume)



List all NLM lock waiters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NfsNlmWaiters result = apiInstance.getNfsNlmWaiters(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsNlmWaiters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NfsNlmWaiters**](NfsNlmWaiters.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsSettingsExport"></a>
# **getNfsSettingsExport**
> NfsSettingsExport getNfsSettingsExport(scope, zone)



Retrieve export information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String zone = "zone_example"; // String | Access zone
try {
    NfsSettingsExport result = apiInstance.getNfsSettingsExport(scope, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsSettingsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **zone** | **String**| Access zone | [optional]

### Return type

[**NfsSettingsExport**](NfsSettingsExport.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsSettingsGlobal"></a>
# **getNfsSettingsGlobal**
> NfsSettingsGlobal getNfsSettingsGlobal(scope)



Retrieve the NFS configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String scope = "scope_example"; // String | When specified as 'effective', or not specified, all fields are returned. When specified as 'user', only fields with non-default values are shown. When specified as 'default', the original values are returned.
try {
    NfsSettingsGlobal result = apiInstance.getNfsSettingsGlobal(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| When specified as &#39;effective&#39;, or not specified, all fields are returned. When specified as &#39;user&#39;, only fields with non-default values are shown. When specified as &#39;default&#39;, the original values are returned. | [optional] [enum: effective, user]

### Return type

[**NfsSettingsGlobal**](NfsSettingsGlobal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNfsSettingsZone"></a>
# **getNfsSettingsZone**
> NfsSettingsZone getNfsSettingsZone(zone)



Retrieve the NFS server settings for this zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone
try {
    NfsSettingsZone result = apiInstance.getNfsSettingsZone(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNfsSettingsZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone | [optional]

### Return type

[**NfsSettingsZone**](NfsSettingsZone.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNtpServer"></a>
# **getNtpServer**
> NtpServers getNtpServer(ntpServerId)



Retrieve one NTP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String ntpServerId = "ntpServerId_example"; // String | Retrieve one NTP server.
try {
    NtpServers result = apiInstance.getNtpServer(ntpServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNtpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ntpServerId** | **String**| Retrieve one NTP server. |

### Return type

[**NtpServers**](NtpServers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNtpSettings"></a>
# **getNtpSettings**
> NtpSettings getNtpSettings()



Retrieve the NTP settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NtpSettings result = apiInstance.getNtpSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getNtpSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NtpSettings**](NtpSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbLogLevel"></a>
# **getSmbLogLevel**
> SmbLogLevel getSmbLogLevel()



Get the current SMB logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    SmbLogLevel result = apiInstance.getSmbLogLevel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbLogLevel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SmbLogLevel**](SmbLogLevel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbLogLevelFilter"></a>
# **getSmbLogLevelFilter**
> SmbLogLevelFilters getSmbLogLevelFilter(smbLogLevelFilterId)



View log filter.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbLogLevelFilterId = "smbLogLevelFilterId_example"; // String | View log filter.
try {
    SmbLogLevelFilters result = apiInstance.getSmbLogLevelFilter(smbLogLevelFilterId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbLogLevelFilter");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbLogLevelFilterId** | **String**| View log filter. |

### Return type

[**SmbLogLevelFilters**](SmbLogLevelFilters.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbOpenfiles"></a>
# **getSmbOpenfiles**
> SmbOpenfiles getSmbOpenfiles(sort, limit, dir, resume)



List open files.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | Order results by this field. Default is id.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SmbOpenfiles result = apiInstance.getSmbOpenfiles(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbOpenfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Order results by this field. Default is id. | [optional] [enum: id, file, user, locks]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SmbOpenfiles**](SmbOpenfiles.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbSessions"></a>
# **getSmbSessions**
> SmbSessions getSmbSessions(sort, limit, dir, resume)



List open sessions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | Order results by this field.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SmbSessions result = apiInstance.getSmbSessions(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbSessions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Order results by this field. | [optional] [enum: computer, user, client_type, openfiles, active_time, idle_time, guest_login, encryption]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SmbSessions**](SmbSessions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbSettingsGlobal"></a>
# **getSmbSettingsGlobal**
> SmbSettingsGlobal getSmbSettingsGlobal(scope)



List all settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    SmbSettingsGlobal result = apiInstance.getSmbSettingsGlobal(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**SmbSettingsGlobal**](SmbSettingsGlobal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbSettingsShare"></a>
# **getSmbSettingsShare**
> SmbSettingsShare getSmbSettingsShare(scope, zone)



List all settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String zone = "zone_example"; // String | Zone which contains these share settings.
try {
    SmbSettingsShare result = apiInstance.getSmbSettingsShare(scope, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbSettingsShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **zone** | **String**| Zone which contains these share settings. | [optional]

### Return type

[**SmbSettingsShare**](SmbSettingsShare.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbShare"></a>
# **getSmbShare**
> SmbShares getSmbShare(smbShareId, scope, resolveNames, zone)



Retrieve share.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String smbShareId = "smbShareId_example"; // String | Retrieve share.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
Boolean resolveNames = true; // Boolean | If true, resolve group and user names in personas.
String zone = "zone_example"; // String | Zone which contains this share.
try {
    SmbShares result = apiInstance.getSmbShare(smbShareId, scope, resolveNames, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbShareId** | **String**| Retrieve share. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **resolveNames** | **Boolean**| If true, resolve group and user names in personas. | [optional]
 **zone** | **String**| Zone which contains this share. | [optional]

### Return type

[**SmbShares**](SmbShares.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSmbSharesSummary"></a>
# **getSmbSharesSummary**
> SmbSharesSummary getSmbSharesSummary(zone)



Return summary information about shares.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Specifies which access zone or zones to use.
try {
    SmbSharesSummary result = apiInstance.getSmbSharesSummary(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSmbSharesSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Specifies which access zone or zones to use. | [optional]

### Return type

[**SmbSharesSummary**](SmbSharesSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnmpSettings"></a>
# **getSnmpSettings**
> SnmpSettings getSnmpSettings()



Retrieve the SNMP settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    SnmpSettings result = apiInstance.getSnmpSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSnmpSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SnmpSettings**](SnmpSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSwiftAccount"></a>
# **getSwiftAccount**
> SwiftAccounts getSwiftAccount(swiftAccountId, zone)



List a swift account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String swiftAccountId = "swiftAccountId_example"; // String | List a swift account.
String zone = "zone_example"; // String | Access zone which contains Swift account.
try {
    SwiftAccounts result = apiInstance.getSwiftAccount(swiftAccountId, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#getSwiftAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **swiftAccountId** | **String**| List a swift account. |
 **zone** | **String**| Access zone which contains Swift account. | [optional]

### Return type

[**SwiftAccounts**](SwiftAccounts.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHdfsProxyusers"></a>
# **listHdfsProxyusers**
> HdfsProxyusers listHdfsProxyusers(zone)



List all proxyusers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone which contains HDFS proxyusers.
try {
    HdfsProxyusers result = apiInstance.listHdfsProxyusers(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listHdfsProxyusers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains HDFS proxyusers. | [optional]

### Return type

[**HdfsProxyusers**](HdfsProxyusers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHdfsRacks"></a>
# **listHdfsRacks**
> HdfsRacksExtended listHdfsRacks(zone)



List all racks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone which contains HDFS racks.
try {
    HdfsRacksExtended result = apiInstance.listHdfsRacks(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listHdfsRacks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains HDFS racks. | [optional]

### Return type

[**HdfsRacksExtended**](HdfsRacksExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNdmpSettingsPreferredIps"></a>
# **listNdmpSettingsPreferredIps**
> NdmpSettingsPreferredIps listNdmpSettingsPreferredIps(limit, resume)



Get list of preferences.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NdmpSettingsPreferredIps result = apiInstance.listNdmpSettingsPreferredIps(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listNdmpSettingsPreferredIps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NdmpSettingsPreferredIps**](NdmpSettingsPreferredIps.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNdmpUsers"></a>
# **listNdmpUsers**
> NdmpUsersExtended listNdmpUsers()



List all ndmp administrators.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
try {
    NdmpUsersExtended result = apiInstance.listNdmpUsers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listNdmpUsers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NdmpUsersExtended**](NdmpUsersExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNfsAliases"></a>
# **listNfsAliases**
> NfsAliasesExtended listNfsAliases(sort, zone, resume, limit, check, dir)



List all NFS aliases.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String zone = "zone_example"; // String | Access zone
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Boolean check = true; // Boolean | Check for conflicts when listing aliases.
String dir = "dir_example"; // String | The direction of the sort.
try {
    NfsAliasesExtended result = apiInstance.listNfsAliases(sort, zone, resume, limit, check, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listNfsAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **zone** | **String**| Access zone | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **check** | **Boolean**| Check for conflicts when listing aliases. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NfsAliasesExtended**](NfsAliasesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNfsExports"></a>
# **listNfsExports**
> NfsExportsExtended listNfsExports(sort, zone, resume, scope, limit, offset, path, check, dir)



List all NFS exports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting. Default is id.
String zone = "zone_example"; // String | Access zone
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String scope = "scope_example"; // String | When specified as 'effective', or not specified, all fields are returned. When specified as 'user', only fields with non-default values are shown. When specified as 'default', the original values are returned.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Integer offset = 56; // Integer | The position of the first item returned for a paginated query within the full result set.
String path = "path_example"; // String | If specified, only exports that explicitly reference at least one of the given paths will be returned.
Boolean check = true; // Boolean | Check for conflicts when listing exports.
String dir = "dir_example"; // String | The direction of the sort.
try {
    NfsExportsExtended result = apiInstance.listNfsExports(sort, zone, resume, scope, limit, offset, path, check, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listNfsExports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. Default is id. | [optional] [enum: id, paths, description]
 **zone** | **String**| Access zone | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **scope** | **String**| When specified as &#39;effective&#39;, or not specified, all fields are returned. When specified as &#39;user&#39;, only fields with non-default values are shown. When specified as &#39;default&#39;, the original values are returned. | [optional] [enum: effective, user]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **offset** | **Integer**| The position of the first item returned for a paginated query within the full result set. | [optional]
 **path** | **String**| If specified, only exports that explicitly reference at least one of the given paths will be returned. | [optional]
 **check** | **Boolean**| Check for conflicts when listing exports. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NfsExportsExtended**](NfsExportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNtpServers"></a>
# **listNtpServers**
> NtpServersExtended listNtpServers(sort, limit, dir, resume)



List all NTP servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NtpServersExtended result = apiInstance.listNtpServers(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listNtpServers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**NtpServersExtended**](NtpServersExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSmbLogLevelFilters"></a>
# **listSmbLogLevelFilters**
> SmbLogLevelFilters listSmbLogLevelFilters(sort, dir, level)



Get the current SMB log filters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String dir = "dir_example"; // String | The direction of the sort.
String level = "level_example"; // String | Valid SMB logging levels
try {
    SmbLogLevelFilters result = apiInstance.listSmbLogLevelFilters(sort, dir, level);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listSmbLogLevelFilters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **level** | **String**| Valid SMB logging levels | [optional] [enum: always, error, warning, info, verbose, debug, trace]

### Return type

[**SmbLogLevelFilters**](SmbLogLevelFilters.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSmbShares"></a>
# **listSmbShares**
> SmbSharesExtended listSmbShares(sort, zone, resume, resolveNames, limit, offset, scope, dir)



List all shares.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String sort = "sort_example"; // String | Order results by this field. Default is id.
String zone = "zone_example"; // String | Zone which contains this share.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean resolveNames = true; // Boolean | If true, resolve group and user names in personas.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Integer offset = 56; // Integer | The position of the first item returned for a paginated query within the full result set.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String dir = "dir_example"; // String | The direction of the sort.
try {
    SmbSharesExtended result = apiInstance.listSmbShares(sort, zone, resume, resolveNames, limit, offset, scope, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listSmbShares");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Order results by this field. Default is id. | [optional] [enum: id, name, path, description]
 **zone** | **String**| Zone which contains this share. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **resolveNames** | **Boolean**| If true, resolve group and user names in personas. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **offset** | **Integer**| The position of the first item returned for a paginated query within the full result set. | [optional]
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**SmbSharesExtended**](SmbSharesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSwiftAccounts"></a>
# **listSwiftAccounts**
> SwiftAccountsExtended listSwiftAccounts(zone)



List all swift accounts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
String zone = "zone_example"; // String | Access zone which contains Swift accounts.
try {
    SwiftAccountsExtended result = apiInstance.listSwiftAccounts(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#listSwiftAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains Swift accounts. | [optional]

### Return type

[**SwiftAccountsExtended**](SwiftAccountsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFtpSettings"></a>
# **updateFtpSettings**
> updateFtpSettings(ftpSettings)



Modify the FTP settings. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
FtpSettingsExtended ftpSettings = new FtpSettingsExtended(); // FtpSettingsExtended | 
try {
    apiInstance.updateFtpSettings(ftpSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateFtpSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ftpSettings** | [**FtpSettingsExtended**](FtpSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHdfsLogLevel"></a>
# **updateHdfsLogLevel**
> updateHdfsLogLevel(hdfsLogLevel)



Modify the HDFS service log-level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsLogLevel hdfsLogLevel = new HdfsLogLevel(); // HdfsLogLevel | 
try {
    apiInstance.updateHdfsLogLevel(hdfsLogLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHdfsLogLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsLogLevel** | [**HdfsLogLevel**](HdfsLogLevel.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHdfsProxyuser"></a>
# **updateHdfsProxyuser**
> updateHdfsProxyuser(hdfsProxyuser, hdfsProxyuserId, zone)



Modify an HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
Empty hdfsProxyuser = new Empty(); // Empty | 
String hdfsProxyuserId = "hdfsProxyuserId_example"; // String | Modify an HDFS proxyuser.
String zone = "zone_example"; // String | Access zone which contains HDFS proxyuser.
try {
    apiInstance.updateHdfsProxyuser(hdfsProxyuser, hdfsProxyuserId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHdfsProxyuser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsProxyuser** | [**Empty**](Empty.md)|  |
 **hdfsProxyuserId** | **String**| Modify an HDFS proxyuser. |
 **zone** | **String**| Access zone which contains HDFS proxyuser. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHdfsRack"></a>
# **updateHdfsRack**
> updateHdfsRack(hdfsRack, hdfsRackId, zone)



Modify the HDFS rack

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsRack hdfsRack = new HdfsRack(); // HdfsRack | 
String hdfsRackId = "hdfsRackId_example"; // String | Modify the HDFS rack
String zone = "zone_example"; // String | Access zone which contains HDFS rack.
try {
    apiInstance.updateHdfsRack(hdfsRack, hdfsRackId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHdfsRack");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsRack** | [**HdfsRack**](HdfsRack.md)|  |
 **hdfsRackId** | **String**| Modify the HDFS rack |
 **zone** | **String**| Access zone which contains HDFS rack. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHdfsRangerPluginSettings"></a>
# **updateHdfsRangerPluginSettings**
> updateHdfsRangerPluginSettings(hdfsRangerPluginSettings, zone)



Modify HDFS ranger-plugin properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsRangerPluginSettingsSettings hdfsRangerPluginSettings = new HdfsRangerPluginSettingsSettings(); // HdfsRangerPluginSettingsSettings | 
String zone = "zone_example"; // String | Access zone which contains HDFS ranger-plugin settings.
try {
    apiInstance.updateHdfsRangerPluginSettings(hdfsRangerPluginSettings, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHdfsRangerPluginSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsRangerPluginSettings** | [**HdfsRangerPluginSettingsSettings**](HdfsRangerPluginSettingsSettings.md)|  |
 **zone** | **String**| Access zone which contains HDFS ranger-plugin settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHdfsSettings"></a>
# **updateHdfsSettings**
> updateHdfsSettings(hdfsSettings, zone)



Modify HDFS properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HdfsSettingsSettings hdfsSettings = new HdfsSettingsSettings(); // HdfsSettingsSettings | 
String zone = "zone_example"; // String | Access zone which contains HDFS settings.
try {
    apiInstance.updateHdfsSettings(hdfsSettings, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHdfsSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hdfsSettings** | [**HdfsSettingsSettings**](HdfsSettingsSettings.md)|  |
 **zone** | **String**| Access zone which contains HDFS settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHttpSettings"></a>
# **updateHttpSettings**
> updateHttpSettings(httpSettings)



Modify HTTP properties.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
HttpSettingsSettings httpSettings = new HttpSettingsSettings(); // HttpSettingsSettings | 
try {
    apiInstance.updateHttpSettings(httpSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateHttpSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **httpSettings** | [**HttpSettingsSettings**](HttpSettingsSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNdmpDiagnostics"></a>
# **updateNdmpDiagnostics**
> updateNdmpDiagnostics(ndmpDiagnostics)



Modify ndmp diagnostics settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpDiagnosticsDiagnostics ndmpDiagnostics = new NdmpDiagnosticsDiagnostics(); // NdmpDiagnosticsDiagnostics | 
try {
    apiInstance.updateNdmpDiagnostics(ndmpDiagnostics);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNdmpDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpDiagnostics** | [**NdmpDiagnosticsDiagnostics**](NdmpDiagnosticsDiagnostics.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNdmpSettingsGlobal"></a>
# **updateNdmpSettingsGlobal**
> updateNdmpSettingsGlobal(ndmpSettingsGlobal)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpSettingsGlobalGlobal ndmpSettingsGlobal = new NdmpSettingsGlobalGlobal(); // NdmpSettingsGlobalGlobal | 
try {
    apiInstance.updateNdmpSettingsGlobal(ndmpSettingsGlobal);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNdmpSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsGlobal** | [**NdmpSettingsGlobalGlobal**](NdmpSettingsGlobalGlobal.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNdmpSettingsPreferredIp"></a>
# **updateNdmpSettingsPreferredIp**
> updateNdmpSettingsPreferredIp(ndmpSettingsPreferredIp, ndmpSettingsPreferredIpId)



Modify a preferred ip preference.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpSettingsPreferredIp ndmpSettingsPreferredIp = new NdmpSettingsPreferredIp(); // NdmpSettingsPreferredIp | 
String ndmpSettingsPreferredIpId = "ndmpSettingsPreferredIpId_example"; // String | Modify a preferred ip preference.
try {
    apiInstance.updateNdmpSettingsPreferredIp(ndmpSettingsPreferredIp, ndmpSettingsPreferredIpId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNdmpSettingsPreferredIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsPreferredIp** | [**NdmpSettingsPreferredIp**](NdmpSettingsPreferredIp.md)|  |
 **ndmpSettingsPreferredIpId** | **String**| Modify a preferred ip preference. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNdmpSettingsVariable"></a>
# **updateNdmpSettingsVariable**
> updateNdmpSettingsVariable(ndmpSettingsVariable, ndmpSettingsVariableId, name)



Modify or create a NDMP preferred environment variable.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpSettingsVariable ndmpSettingsVariable = new NdmpSettingsVariable(); // NdmpSettingsVariable | 
String ndmpSettingsVariableId = "ndmpSettingsVariableId_example"; // String | Modify or create a NDMP preferred environment variable.
String name = "name_example"; // String | Name of the variable to modify.
try {
    apiInstance.updateNdmpSettingsVariable(ndmpSettingsVariable, ndmpSettingsVariableId, name);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNdmpSettingsVariable");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpSettingsVariable** | [**NdmpSettingsVariable**](NdmpSettingsVariable.md)|  |
 **ndmpSettingsVariableId** | **String**| Modify or create a NDMP preferred environment variable. |
 **name** | **String**| Name of the variable to modify. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNdmpUser"></a>
# **updateNdmpUser**
> updateNdmpUser(ndmpUser, ndmpUserId)



Modify the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NdmpUser ndmpUser = new NdmpUser(); // NdmpUser | 
String ndmpUserId = "ndmpUserId_example"; // String | Modify the user
try {
    apiInstance.updateNdmpUser(ndmpUser, ndmpUserId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNdmpUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ndmpUser** | [**NdmpUser**](NdmpUser.md)|  |
 **ndmpUserId** | **String**| Modify the user |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsAlias"></a>
# **updateNfsAlias**
> updateNfsAlias(nfsAlias, nfsAliasId, zone)



Modify the alias. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsAlias nfsAlias = new NfsAlias(); // NfsAlias | 
String nfsAliasId = "nfsAliasId_example"; // String | Modify the alias. All input fields are optional, but one or more must be supplied.
String zone = "zone_example"; // String | Access zone
try {
    apiInstance.updateNfsAlias(nfsAlias, nfsAliasId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsAlias** | [**NfsAlias**](NfsAlias.md)|  |
 **nfsAliasId** | **String**| Modify the alias. All input fields are optional, but one or more must be supplied. |
 **zone** | **String**| Access zone | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsExport"></a>
# **updateNfsExport**
> updateNfsExport(nfsExport, nfsExportId, force, ignoreUnresolvableHosts, zone, ignoreConflicts, ignoreBadPaths, ignoreBadAuth)



Modify the export. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsExport nfsExport = new NfsExport(); // NfsExport | 
String nfsExportId = "nfsExportId_example"; // String | Modify the export. All input fields are optional, but one or more must be supplied.
Boolean force = true; // Boolean | If true, the export will be updated even if that change conflicts with another export.
Boolean ignoreUnresolvableHosts = true; // Boolean | Ignore unresolvable hosts.
String zone = "zone_example"; // String | Access zone
Boolean ignoreConflicts = true; // Boolean | Ignore conflicts with existing exports.
Boolean ignoreBadPaths = true; // Boolean | Ignore nonexistent or otherwise bad paths.
Boolean ignoreBadAuth = true; // Boolean | Ignore invalid users.
try {
    apiInstance.updateNfsExport(nfsExport, nfsExportId, force, ignoreUnresolvableHosts, zone, ignoreConflicts, ignoreBadPaths, ignoreBadAuth);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsExport** | [**NfsExport**](NfsExport.md)|  |
 **nfsExportId** | **String**| Modify the export. All input fields are optional, but one or more must be supplied. |
 **force** | **Boolean**| If true, the export will be updated even if that change conflicts with another export. | [optional]
 **ignoreUnresolvableHosts** | **Boolean**| Ignore unresolvable hosts. | [optional]
 **zone** | **String**| Access zone | [optional]
 **ignoreConflicts** | **Boolean**| Ignore conflicts with existing exports. | [optional]
 **ignoreBadPaths** | **Boolean**| Ignore nonexistent or otherwise bad paths. | [optional]
 **ignoreBadAuth** | **Boolean**| Ignore invalid users. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsLogLevel"></a>
# **updateNfsLogLevel**
> updateNfsLogLevel(nfsLogLevel)



Set the current NFS service logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsLogLevel nfsLogLevel = new NfsLogLevel(); // NfsLogLevel | 
try {
    apiInstance.updateNfsLogLevel(nfsLogLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsLogLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsLogLevel** | [**NfsLogLevel**](NfsLogLevel.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsNetgroup"></a>
# **updateNfsNetgroup**
> updateNfsNetgroup(nfsNetgroup, host)



Modify the current NFS netgroup settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsNetgroup nfsNetgroup = new NfsNetgroup(); // NfsNetgroup | 
String host = "host_example"; // String | Host to retrieve netgroup cache settings for.
try {
    apiInstance.updateNfsNetgroup(nfsNetgroup, host);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsNetgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsNetgroup** | [**NfsNetgroup**](NfsNetgroup.md)|  |
 **host** | **String**| Host to retrieve netgroup cache settings for. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsSettingsExport"></a>
# **updateNfsSettingsExport**
> updateNfsSettingsExport(nfsSettingsExport, zone)



Modify the default values for NFS exports. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsSettingsExportSettings nfsSettingsExport = new NfsSettingsExportSettings(); // NfsSettingsExportSettings | 
String zone = "zone_example"; // String | Access zone
try {
    apiInstance.updateNfsSettingsExport(nfsSettingsExport, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsSettingsExport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsSettingsExport** | [**NfsSettingsExportSettings**](NfsSettingsExportSettings.md)|  |
 **zone** | **String**| Access zone | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsSettingsGlobal"></a>
# **updateNfsSettingsGlobal**
> updateNfsSettingsGlobal(nfsSettingsGlobal, scope)



Modify the default values for NFS exports. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsSettingsGlobalSettings nfsSettingsGlobal = new NfsSettingsGlobalSettings(); // NfsSettingsGlobalSettings | 
String scope = "scope_example"; // String | When specified as 'effective', or not specified, all fields are returned. When specified as 'user', only fields with non-default values are shown. When specified as 'default', the original values are returned.
try {
    apiInstance.updateNfsSettingsGlobal(nfsSettingsGlobal, scope);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsSettingsGlobal** | [**NfsSettingsGlobalSettings**](NfsSettingsGlobalSettings.md)|  |
 **scope** | **String**| When specified as &#39;effective&#39;, or not specified, all fields are returned. When specified as &#39;user&#39;, only fields with non-default values are shown. When specified as &#39;default&#39;, the original values are returned. | [optional] [enum: effective, user]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNfsSettingsZone"></a>
# **updateNfsSettingsZone**
> updateNfsSettingsZone(nfsSettingsZone, zone)



Modify the NFS server settings for this zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NfsSettingsZoneSettings nfsSettingsZone = new NfsSettingsZoneSettings(); // NfsSettingsZoneSettings | 
String zone = "zone_example"; // String | Access zone
try {
    apiInstance.updateNfsSettingsZone(nfsSettingsZone, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNfsSettingsZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nfsSettingsZone** | [**NfsSettingsZoneSettings**](NfsSettingsZoneSettings.md)|  |
 **zone** | **String**| Access zone | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNtpServer"></a>
# **updateNtpServer**
> updateNtpServer(ntpServer, ntpServerId)



Modify the key value for an NTP server.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NtpServer ntpServer = new NtpServer(); // NtpServer | 
String ntpServerId = "ntpServerId_example"; // String | Modify the key value for an NTP server.
try {
    apiInstance.updateNtpServer(ntpServer, ntpServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNtpServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ntpServer** | [**NtpServer**](NtpServer.md)|  |
 **ntpServerId** | **String**| Modify the key value for an NTP server. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNtpSettings"></a>
# **updateNtpSettings**
> updateNtpSettings(ntpSettings)



Modify the NTP settings. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
NtpSettingsSettings ntpSettings = new NtpSettingsSettings(); // NtpSettingsSettings | 
try {
    apiInstance.updateNtpSettings(ntpSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateNtpSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ntpSettings** | [**NtpSettingsSettings**](NtpSettingsSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmbLogLevel"></a>
# **updateSmbLogLevel**
> updateSmbLogLevel(smbLogLevel)



Set the current SMB logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbLogLevel smbLogLevel = new SmbLogLevel(); // SmbLogLevel | 
try {
    apiInstance.updateSmbLogLevel(smbLogLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSmbLogLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbLogLevel** | [**SmbLogLevel**](SmbLogLevel.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmbSettingsGlobal"></a>
# **updateSmbSettingsGlobal**
> updateSmbSettingsGlobal(smbSettingsGlobal)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbSettingsGlobalExtended smbSettingsGlobal = new SmbSettingsGlobalExtended(); // SmbSettingsGlobalExtended | 
try {
    apiInstance.updateSmbSettingsGlobal(smbSettingsGlobal);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSmbSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbSettingsGlobal** | [**SmbSettingsGlobalExtended**](SmbSettingsGlobalExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmbSettingsShare"></a>
# **updateSmbSettingsShare**
> updateSmbSettingsShare(smbSettingsShare, zone)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbSettingsShareExtended smbSettingsShare = new SmbSettingsShareExtended(); // SmbSettingsShareExtended | 
String zone = "zone_example"; // String | Zone which contains these share settings.
try {
    apiInstance.updateSmbSettingsShare(smbSettingsShare, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSmbSettingsShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbSettingsShare** | [**SmbSettingsShareExtended**](SmbSettingsShareExtended.md)|  |
 **zone** | **String**| Zone which contains these share settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSmbShare"></a>
# **updateSmbShare**
> updateSmbShare(smbShare, smbShareId, zone)



Modify share. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SmbShare smbShare = new SmbShare(); // SmbShare | 
String smbShareId = "smbShareId_example"; // String | Modify share. All input fields are optional, but one or more must be supplied.
String zone = "zone_example"; // String | Zone which contains this share.
try {
    apiInstance.updateSmbShare(smbShare, smbShareId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSmbShare");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smbShare** | [**SmbShare**](SmbShare.md)|  |
 **smbShareId** | **String**| Modify share. All input fields are optional, but one or more must be supplied. |
 **zone** | **String**| Zone which contains this share. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnmpSettings"></a>
# **updateSnmpSettings**
> updateSnmpSettings(snmpSettings)



Modify the SNMP settings. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SnmpSettingsExtended snmpSettings = new SnmpSettingsExtended(); // SnmpSettingsExtended | 
try {
    apiInstance.updateSnmpSettings(snmpSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSnmpSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snmpSettings** | [**SnmpSettingsExtended**](SnmpSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSwiftAccount"></a>
# **updateSwiftAccount**
> updateSwiftAccount(swiftAccount, swiftAccountId, zone)



Modify a Swift account

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsApi apiInstance = new ProtocolsApi();
SwiftAccount swiftAccount = new SwiftAccount(); // SwiftAccount | 
String swiftAccountId = "swiftAccountId_example"; // String | Modify a Swift account
String zone = "zone_example"; // String | Access zone which contains Swift account.
try {
    apiInstance.updateSwiftAccount(swiftAccount, swiftAccountId, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsApi#updateSwiftAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **swiftAccount** | [**SwiftAccount**](SwiftAccount.md)|  |
 **swiftAccountId** | **String**| Modify a Swift account |
 **zone** | **String**| Access zone which contains Swift account. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

