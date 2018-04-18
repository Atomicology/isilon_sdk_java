# AntivirusApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAntivirusPolicy**](AntivirusApi.md#createAntivirusPolicy) | **POST** /platform/3/antivirus/policies | 
[**createAntivirusScanItem**](AntivirusApi.md#createAntivirusScanItem) | **POST** /platform/3/antivirus/scan | 
[**createAntivirusServer**](AntivirusApi.md#createAntivirusServer) | **POST** /platform/3/antivirus/servers | 
[**deleteAntivirusPolicies**](AntivirusApi.md#deleteAntivirusPolicies) | **DELETE** /platform/3/antivirus/policies | 
[**deleteAntivirusPolicy**](AntivirusApi.md#deleteAntivirusPolicy) | **DELETE** /platform/3/antivirus/policies/{AntivirusPolicyId} | 
[**deleteAntivirusServer**](AntivirusApi.md#deleteAntivirusServer) | **DELETE** /platform/3/antivirus/servers/{AntivirusServerId} | 
[**deleteAntivirusServers**](AntivirusApi.md#deleteAntivirusServers) | **DELETE** /platform/3/antivirus/servers | 
[**deleteReportsScan**](AntivirusApi.md#deleteReportsScan) | **DELETE** /platform/3/antivirus/reports/scans/{ReportsScanId} | 
[**deleteReportsScans**](AntivirusApi.md#deleteReportsScans) | **DELETE** /platform/3/antivirus/reports/scans | 
[**getAntivirusPolicy**](AntivirusApi.md#getAntivirusPolicy) | **GET** /platform/3/antivirus/policies/{AntivirusPolicyId} | 
[**getAntivirusQuarantinePath**](AntivirusApi.md#getAntivirusQuarantinePath) | **GET** /platform/3/antivirus/quarantine/{AntivirusQuarantinePath} | 
[**getAntivirusServer**](AntivirusApi.md#getAntivirusServer) | **GET** /platform/3/antivirus/servers/{AntivirusServerId} | 
[**getAntivirusSettings**](AntivirusApi.md#getAntivirusSettings) | **GET** /platform/3/antivirus/settings | 
[**getReportsScan**](AntivirusApi.md#getReportsScan) | **GET** /platform/3/antivirus/reports/scans/{ReportsScanId} | 
[**getReportsScans**](AntivirusApi.md#getReportsScans) | **GET** /platform/3/antivirus/reports/scans | 
[**getReportsThreat**](AntivirusApi.md#getReportsThreat) | **GET** /platform/3/antivirus/reports/threats/{ReportsThreatId} | 
[**getReportsThreats**](AntivirusApi.md#getReportsThreats) | **GET** /platform/3/antivirus/reports/threats | 
[**listAntivirusPolicies**](AntivirusApi.md#listAntivirusPolicies) | **GET** /platform/3/antivirus/policies | 
[**listAntivirusServers**](AntivirusApi.md#listAntivirusServers) | **GET** /platform/3/antivirus/servers | 
[**updateAntivirusPolicy**](AntivirusApi.md#updateAntivirusPolicy) | **PUT** /platform/3/antivirus/policies/{AntivirusPolicyId} | 
[**updateAntivirusQuarantinePath**](AntivirusApi.md#updateAntivirusQuarantinePath) | **PUT** /platform/3/antivirus/quarantine/{AntivirusQuarantinePath} | 
[**updateAntivirusServer**](AntivirusApi.md#updateAntivirusServer) | **PUT** /platform/3/antivirus/servers/{AntivirusServerId} | 
[**updateAntivirusSettings**](AntivirusApi.md#updateAntivirusSettings) | **PUT** /platform/3/antivirus/settings | 


<a name="createAntivirusPolicy"></a>
# **createAntivirusPolicy**
> CreateResponse createAntivirusPolicy(antivirusPolicy)



Create new antivirus scan policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusPolicyCreateParams antivirusPolicy = new AntivirusPolicyCreateParams(); // AntivirusPolicyCreateParams | 
try {
    CreateResponse result = apiInstance.createAntivirusPolicy(antivirusPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#createAntivirusPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusPolicy** | [**AntivirusPolicyCreateParams**](AntivirusPolicyCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAntivirusScanItem"></a>
# **createAntivirusScanItem**
> CreateAntivirusScanItemResponse createAntivirusScanItem(antivirusScanItem)



Manually scan a file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusScanItem antivirusScanItem = new AntivirusScanItem(); // AntivirusScanItem | 
try {
    CreateAntivirusScanItemResponse result = apiInstance.createAntivirusScanItem(antivirusScanItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#createAntivirusScanItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusScanItem** | [**AntivirusScanItem**](AntivirusScanItem.md)|  |

### Return type

[**CreateAntivirusScanItemResponse**](CreateAntivirusScanItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAntivirusServer"></a>
# **createAntivirusServer**
> CreateResponse createAntivirusServer(antivirusServer)



Create new antivirus servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusServerCreateParams antivirusServer = new AntivirusServerCreateParams(); // AntivirusServerCreateParams | 
try {
    CreateResponse result = apiInstance.createAntivirusServer(antivirusServer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#createAntivirusServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusServer** | [**AntivirusServerCreateParams**](AntivirusServerCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAntivirusPolicies"></a>
# **deleteAntivirusPolicies**
> deleteAntivirusPolicies()



Delete all antivirus scan policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
try {
    apiInstance.deleteAntivirusPolicies();
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteAntivirusPolicies");
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

<a name="deleteAntivirusPolicy"></a>
# **deleteAntivirusPolicy**
> deleteAntivirusPolicy(antivirusPolicyId)



Delete an antivirus scan policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String antivirusPolicyId = "antivirusPolicyId_example"; // String | Delete an antivirus scan policy.
try {
    apiInstance.deleteAntivirusPolicy(antivirusPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteAntivirusPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusPolicyId** | **String**| Delete an antivirus scan policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAntivirusServer"></a>
# **deleteAntivirusServer**
> deleteAntivirusServer(antivirusServerId)



Delete an antivirus server entry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String antivirusServerId = "antivirusServerId_example"; // String | Delete an antivirus server entry.
try {
    apiInstance.deleteAntivirusServer(antivirusServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteAntivirusServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusServerId** | **String**| Delete an antivirus server entry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAntivirusServers"></a>
# **deleteAntivirusServers**
> deleteAntivirusServers()



Delete all antivirus servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
try {
    apiInstance.deleteAntivirusServers();
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteAntivirusServers");
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

<a name="deleteReportsScan"></a>
# **deleteReportsScan**
> deleteReportsScan(reportsScanId)



Delete one antivirus scan report, and all of its associated threat reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String reportsScanId = "reportsScanId_example"; // String | Delete one antivirus scan report, and all of its associated threat reports.
try {
    apiInstance.deleteReportsScan(reportsScanId);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteReportsScan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsScanId** | **String**| Delete one antivirus scan report, and all of its associated threat reports. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteReportsScans"></a>
# **deleteReportsScans**
> deleteReportsScans(age)



Delete antivirus scan reports, and any threat reports associated with those scans.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
Integer age = 56; // Integer | An amount of time in seconds. If present, only reports older than this age are deleted.
try {
    apiInstance.deleteReportsScans(age);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#deleteReportsScans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **age** | **Integer**| An amount of time in seconds. If present, only reports older than this age are deleted. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAntivirusPolicy"></a>
# **getAntivirusPolicy**
> AntivirusPolicies getAntivirusPolicy(antivirusPolicyId)



Retrieve one antivirus scan policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String antivirusPolicyId = "antivirusPolicyId_example"; // String | Retrieve one antivirus scan policy.
try {
    AntivirusPolicies result = apiInstance.getAntivirusPolicy(antivirusPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getAntivirusPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusPolicyId** | **String**| Retrieve one antivirus scan policy. |

### Return type

[**AntivirusPolicies**](AntivirusPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAntivirusQuarantinePath"></a>
# **getAntivirusQuarantinePath**
> AntivirusQuarantine getAntivirusQuarantinePath(antivirusQuarantinePath)



Retrieve the quarantine status of the file at the specified path.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String antivirusQuarantinePath = "antivirusQuarantinePath_example"; // String | Retrieve the quarantine status of the file at the specified path.
try {
    AntivirusQuarantine result = apiInstance.getAntivirusQuarantinePath(antivirusQuarantinePath);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getAntivirusQuarantinePath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusQuarantinePath** | **String**| Retrieve the quarantine status of the file at the specified path. |

### Return type

[**AntivirusQuarantine**](AntivirusQuarantine.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAntivirusServer"></a>
# **getAntivirusServer**
> AntivirusServers getAntivirusServer(antivirusServerId)



Retrieve one antivirus server entry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String antivirusServerId = "antivirusServerId_example"; // String | Retrieve one antivirus server entry.
try {
    AntivirusServers result = apiInstance.getAntivirusServer(antivirusServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getAntivirusServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusServerId** | **String**| Retrieve one antivirus server entry. |

### Return type

[**AntivirusServers**](AntivirusServers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAntivirusSettings"></a>
# **getAntivirusSettings**
> AntivirusSettings getAntivirusSettings()



Retrieve the Antivirus settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
try {
    AntivirusSettings result = apiInstance.getAntivirusSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getAntivirusSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AntivirusSettings**](AntivirusSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsScan"></a>
# **getReportsScan**
> ReportsScans getReportsScan(reportsScanId)



Retrieve one antivirus scan report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String reportsScanId = "reportsScanId_example"; // String | Retrieve one antivirus scan report.
try {
    ReportsScans result = apiInstance.getReportsScan(reportsScanId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getReportsScan");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsScanId** | **String**| Retrieve one antivirus scan report. |

### Return type

[**ReportsScans**](ReportsScans.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsScans"></a>
# **getReportsScans**
> ReportsScansExtended getReportsScans(sort, status, resume, limit, dir, policyId)



List antivirus scan reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String status = "status_example"; // String | If present, only scan reports with this status will be returned.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String policyId = "policyId_example"; // String | If present, only reports for scans associated with this policy will be returned.
try {
    ReportsScansExtended result = apiInstance.getReportsScans(sort, status, resume, limit, dir, policyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getReportsScans");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **status** | **String**| If present, only scan reports with this status will be returned. | [optional] [enum: Finish, Succeeded, Failed, Cancelled, Started, Paused, Resumed, Pending]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **policyId** | **String**| If present, only reports for scans associated with this policy will be returned. | [optional]

### Return type

[**ReportsScansExtended**](ReportsScansExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsThreat"></a>
# **getReportsThreat**
> ReportsThreats getReportsThreat(reportsThreatId)



Retrieve one antivirus threat report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String reportsThreatId = "reportsThreatId_example"; // String | Retrieve one antivirus threat report.
try {
    ReportsThreats result = apiInstance.getReportsThreat(reportsThreatId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getReportsThreat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsThreatId** | **String**| Retrieve one antivirus threat report. |

### Return type

[**ReportsThreats**](ReportsThreats.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsThreats"></a>
# **getReportsThreats**
> ReportsThreatsExtended getReportsThreats(sort, scanId, resume, limit, file, remediation, dir)



List antivirus threat reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String scanId = "scanId_example"; // String | If present, only returns threat reports associated with the given scan report.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String file = "file_example"; // String | If present, only returns threat reports for the given file.
String remediation = "remediation_example"; // String | If present, only returns threat reports with the given remediation.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ReportsThreatsExtended result = apiInstance.getReportsThreats(sort, scanId, resume, limit, file, remediation, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#getReportsThreats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **scanId** | **String**| If present, only returns threat reports associated with the given scan report. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **file** | **String**| If present, only returns threat reports for the given file. | [optional]
 **remediation** | **String**| If present, only returns threat reports with the given remediation. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ReportsThreatsExtended**](ReportsThreatsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAntivirusPolicies"></a>
# **listAntivirusPolicies**
> AntivirusPoliciesExtended listAntivirusPolicies(sort, limit, dir, resume)



List antivirus scan policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    AntivirusPoliciesExtended result = apiInstance.listAntivirusPolicies(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#listAntivirusPolicies");
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

[**AntivirusPoliciesExtended**](AntivirusPoliciesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAntivirusServers"></a>
# **listAntivirusServers**
> AntivirusServersExtended listAntivirusServers(sort, limit, dir, resume)



List antivirus servers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    AntivirusServersExtended result = apiInstance.listAntivirusServers(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#listAntivirusServers");
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

[**AntivirusServersExtended**](AntivirusServersExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAntivirusPolicy"></a>
# **updateAntivirusPolicy**
> updateAntivirusPolicy(antivirusPolicy, antivirusPolicyId)



Modify an antivirus scan policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusPolicy antivirusPolicy = new AntivirusPolicy(); // AntivirusPolicy | 
String antivirusPolicyId = "antivirusPolicyId_example"; // String | Modify an antivirus scan policy.
try {
    apiInstance.updateAntivirusPolicy(antivirusPolicy, antivirusPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#updateAntivirusPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusPolicy** | [**AntivirusPolicy**](AntivirusPolicy.md)|  |
 **antivirusPolicyId** | **String**| Modify an antivirus scan policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAntivirusQuarantinePath"></a>
# **updateAntivirusQuarantinePath**
> updateAntivirusQuarantinePath(antivirusQuarantinePathParams, antivirusQuarantinePath)



Set the quarantine status of the file at the specified path.  Use either an empty object {} in the request body or {\&quot;quarantined\&quot;:true} to quarantine the file, and {\&quot;quarantined\&quot;:false} to unquarantine the file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusQuarantinePathParams antivirusQuarantinePathParams = new AntivirusQuarantinePathParams(); // AntivirusQuarantinePathParams | 
String antivirusQuarantinePath = "antivirusQuarantinePath_example"; // String | Set the quarantine status of the file at the specified path.  Use either an empty object {} in the request body or {\"quarantined\":true} to quarantine the file, and {\"quarantined\":false} to unquarantine the file.
try {
    apiInstance.updateAntivirusQuarantinePath(antivirusQuarantinePathParams, antivirusQuarantinePath);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#updateAntivirusQuarantinePath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusQuarantinePathParams** | [**AntivirusQuarantinePathParams**](AntivirusQuarantinePathParams.md)|  |
 **antivirusQuarantinePath** | **String**| Set the quarantine status of the file at the specified path.  Use either an empty object {} in the request body or {\&quot;quarantined\&quot;:true} to quarantine the file, and {\&quot;quarantined\&quot;:false} to unquarantine the file. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAntivirusServer"></a>
# **updateAntivirusServer**
> updateAntivirusServer(antivirusServer, antivirusServerId)



Modify an antivirus server entry.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusServer antivirusServer = new AntivirusServer(); // AntivirusServer | 
String antivirusServerId = "antivirusServerId_example"; // String | Modify an antivirus server entry.
try {
    apiInstance.updateAntivirusServer(antivirusServer, antivirusServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#updateAntivirusServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusServer** | [**AntivirusServer**](AntivirusServer.md)|  |
 **antivirusServerId** | **String**| Modify an antivirus server entry. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAntivirusSettings"></a>
# **updateAntivirusSettings**
> updateAntivirusSettings(antivirusSettings)



Modify the Antivirus settings. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AntivirusApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AntivirusApi apiInstance = new AntivirusApi();
AntivirusSettingsSettings antivirusSettings = new AntivirusSettingsSettings(); // AntivirusSettingsSettings | 
try {
    apiInstance.updateAntivirusSettings(antivirusSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling AntivirusApi#updateAntivirusSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **antivirusSettings** | [**AntivirusSettingsSettings**](AntivirusSettingsSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

