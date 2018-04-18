# SyncApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSyncJob**](SyncApi.md#createSyncJob) | **POST** /platform/3/sync/jobs | 
[**createSyncPolicy**](SyncApi.md#createSyncPolicy) | **POST** /platform/3/sync/policies | 
[**createSyncReportsRotateItem**](SyncApi.md#createSyncReportsRotateItem) | **POST** /platform/1/sync/reports-rotate | 
[**createSyncRule**](SyncApi.md#createSyncRule) | **POST** /platform/3/sync/rules | 
[**deleteSyncPolicies**](SyncApi.md#deleteSyncPolicies) | **DELETE** /platform/3/sync/policies | 
[**deleteSyncPolicy**](SyncApi.md#deleteSyncPolicy) | **DELETE** /platform/3/sync/policies/{SyncPolicyId} | 
[**deleteSyncRule**](SyncApi.md#deleteSyncRule) | **DELETE** /platform/3/sync/rules/{SyncRuleId} | 
[**deleteSyncRules**](SyncApi.md#deleteSyncRules) | **DELETE** /platform/3/sync/rules | 
[**deleteTargetPolicy**](SyncApi.md#deleteTargetPolicy) | **DELETE** /platform/1/sync/target/policies/{TargetPolicyId} | 
[**getHistoryCpu**](SyncApi.md#getHistoryCpu) | **GET** /platform/3/sync/history/cpu | 
[**getHistoryFile**](SyncApi.md#getHistoryFile) | **GET** /platform/1/sync/history/file | 
[**getHistoryNetwork**](SyncApi.md#getHistoryNetwork) | **GET** /platform/1/sync/history/network | 
[**getHistoryWorker**](SyncApi.md#getHistoryWorker) | **GET** /platform/3/sync/history/worker | 
[**getSyncJob**](SyncApi.md#getSyncJob) | **GET** /platform/3/sync/jobs/{SyncJobId} | 
[**getSyncLicense**](SyncApi.md#getSyncLicense) | **GET** /platform/5/sync/license | 
[**getSyncPolicy**](SyncApi.md#getSyncPolicy) | **GET** /platform/3/sync/policies/{SyncPolicyId} | 
[**getSyncReport**](SyncApi.md#getSyncReport) | **GET** /platform/4/sync/reports/{SyncReportId} | 
[**getSyncReports**](SyncApi.md#getSyncReports) | **GET** /platform/4/sync/reports | 
[**getSyncRule**](SyncApi.md#getSyncRule) | **GET** /platform/3/sync/rules/{SyncRuleId} | 
[**getSyncSettings**](SyncApi.md#getSyncSettings) | **GET** /platform/3/sync/settings | 
[**getTargetPolicies**](SyncApi.md#getTargetPolicies) | **GET** /platform/1/sync/target/policies | 
[**getTargetPolicy**](SyncApi.md#getTargetPolicy) | **GET** /platform/1/sync/target/policies/{TargetPolicyId} | 
[**getTargetReport**](SyncApi.md#getTargetReport) | **GET** /platform/4/sync/target/reports/{TargetReportId} | 
[**getTargetReports**](SyncApi.md#getTargetReports) | **GET** /platform/4/sync/target/reports | 
[**listSyncJobs**](SyncApi.md#listSyncJobs) | **GET** /platform/3/sync/jobs | 
[**listSyncPolicies**](SyncApi.md#listSyncPolicies) | **GET** /platform/3/sync/policies | 
[**listSyncReportsRotate**](SyncApi.md#listSyncReportsRotate) | **GET** /platform/1/sync/reports-rotate | 
[**listSyncRules**](SyncApi.md#listSyncRules) | **GET** /platform/3/sync/rules | 
[**updateSyncJob**](SyncApi.md#updateSyncJob) | **PUT** /platform/3/sync/jobs/{SyncJobId} | 
[**updateSyncPolicy**](SyncApi.md#updateSyncPolicy) | **PUT** /platform/3/sync/policies/{SyncPolicyId} | 
[**updateSyncRule**](SyncApi.md#updateSyncRule) | **PUT** /platform/3/sync/rules/{SyncRuleId} | 
[**updateSyncSettings**](SyncApi.md#updateSyncSettings) | **PUT** /platform/3/sync/settings | 


<a name="createSyncJob"></a>
# **createSyncJob**
> CreateResponse createSyncJob(syncJob)



Start a SyncIQ job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncJobCreateParams syncJob = new SyncJobCreateParams(); // SyncJobCreateParams | 
try {
    CreateResponse result = apiInstance.createSyncJob(syncJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#createSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncJob** | [**SyncJobCreateParams**](SyncJobCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSyncPolicy"></a>
# **createSyncPolicy**
> CreateResponse createSyncPolicy(syncPolicy)



Create a SyncIQ policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncPolicyCreateParams syncPolicy = new SyncPolicyCreateParams(); // SyncPolicyCreateParams | 
try {
    CreateResponse result = apiInstance.createSyncPolicy(syncPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#createSyncPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncPolicy** | [**SyncPolicyCreateParams**](SyncPolicyCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSyncReportsRotateItem"></a>
# **createSyncReportsRotateItem**
> CreateSyncReportsRotateItemResponse createSyncReportsRotateItem(syncReportsRotateItem)



Rotate the records in the database(s).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Empty syncReportsRotateItem = new Empty(); // Empty | 
try {
    CreateSyncReportsRotateItemResponse result = apiInstance.createSyncReportsRotateItem(syncReportsRotateItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#createSyncReportsRotateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncReportsRotateItem** | [**Empty**](Empty.md)|  |

### Return type

[**CreateSyncReportsRotateItemResponse**](CreateSyncReportsRotateItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSyncRule"></a>
# **createSyncRule**
> CreateResponse createSyncRule(syncRule)



Create a new SyncIQ performance rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncRuleCreateParams syncRule = new SyncRuleCreateParams(); // SyncRuleCreateParams | 
try {
    CreateResponse result = apiInstance.createSyncRule(syncRule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#createSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncRule** | [**SyncRuleCreateParams**](SyncRuleCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSyncPolicies"></a>
# **deleteSyncPolicies**
> deleteSyncPolicies(localOnly, force)



Delete all SyncIQ policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Boolean localOnly = true; // Boolean | Skip deleting the policy association on the target.
Boolean force = true; // Boolean | Ignore any running jobs when preparing to delete a policy.
try {
    apiInstance.deleteSyncPolicies(localOnly, force);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#deleteSyncPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **localOnly** | **Boolean**| Skip deleting the policy association on the target. | [optional]
 **force** | **Boolean**| Ignore any running jobs when preparing to delete a policy. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSyncPolicy"></a>
# **deleteSyncPolicy**
> deleteSyncPolicy(syncPolicyId, localOnly, force)



Delete a single SyncIQ policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncPolicyId = "syncPolicyId_example"; // String | Delete a single SyncIQ policy.
Boolean localOnly = true; // Boolean | Skip deleting the policy association on the target.
Boolean force = true; // Boolean | Ignore any running jobs when preparing to delete a policy.
try {
    apiInstance.deleteSyncPolicy(syncPolicyId, localOnly, force);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#deleteSyncPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncPolicyId** | **String**| Delete a single SyncIQ policy. |
 **localOnly** | **Boolean**| Skip deleting the policy association on the target. | [optional]
 **force** | **Boolean**| Ignore any running jobs when preparing to delete a policy. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSyncRule"></a>
# **deleteSyncRule**
> deleteSyncRule(syncRuleId)



Delete a single SyncIQ performance rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncRuleId = "syncRuleId_example"; // String | Delete a single SyncIQ performance rule.
try {
    apiInstance.deleteSyncRule(syncRuleId);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#deleteSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncRuleId** | **String**| Delete a single SyncIQ performance rule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSyncRules"></a>
# **deleteSyncRules**
> deleteSyncRules(type)



Delete all SyncIQ performance rules or all rules of a specified type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String type = "type_example"; // String | Delete all rules of the specified rule type only.
try {
    apiInstance.deleteSyncRules(type);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#deleteSyncRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Delete all rules of the specified rule type only. | [optional] [enum: bandwidth, file_count, cpu, worker]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTargetPolicy"></a>
# **deleteTargetPolicy**
> deleteTargetPolicy(targetPolicyId, force)



Break the target association with this cluster for this policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String targetPolicyId = "targetPolicyId_example"; // String | Break the target association with this cluster for this policy.
Boolean force = true; // Boolean | Ignore any running jobs when preparing to delete the policy target association.
try {
    apiInstance.deleteTargetPolicy(targetPolicyId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#deleteTargetPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetPolicyId** | **String**| Break the target association with this cluster for this policy. |
 **force** | **Boolean**| Ignore any running jobs when preparing to delete the policy target association. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoryCpu"></a>
# **getHistoryCpu**
> HistoryFile getHistoryCpu(begin, end)



List cpu performance data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Integer begin = 56; // Integer | Begin timestamp for time-series report.
Integer end = 56; // Integer | End timestamp for time-series report.
try {
    HistoryFile result = apiInstance.getHistoryCpu(begin, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getHistoryCpu");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Begin timestamp for time-series report. | [optional]
 **end** | **Integer**| End timestamp for time-series report. | [optional]

### Return type

[**HistoryFile**](HistoryFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoryFile"></a>
# **getHistoryFile**
> HistoryFile getHistoryFile(begin, end)



List file operations performance data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Integer begin = 56; // Integer | Begin timestamp for time-series report.
Integer end = 56; // Integer | End timestamp for time-series report.
try {
    HistoryFile result = apiInstance.getHistoryFile(begin, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getHistoryFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Begin timestamp for time-series report. | [optional]
 **end** | **Integer**| End timestamp for time-series report. | [optional]

### Return type

[**HistoryFile**](HistoryFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoryNetwork"></a>
# **getHistoryNetwork**
> HistoryFile getHistoryNetwork(begin, end)



List network operations performance data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Integer begin = 56; // Integer | Begin timestamp for time-series report.
Integer end = 56; // Integer | End timestamp for time-series report.
try {
    HistoryFile result = apiInstance.getHistoryNetwork(begin, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getHistoryNetwork");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Begin timestamp for time-series report. | [optional]
 **end** | **Integer**| End timestamp for time-series report. | [optional]

### Return type

[**HistoryFile**](HistoryFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistoryWorker"></a>
# **getHistoryWorker**
> HistoryFile getHistoryWorker(begin, end)



List worker performance data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
Integer begin = 56; // Integer | Begin timestamp for time-series report.
Integer end = 56; // Integer | End timestamp for time-series report.
try {
    HistoryFile result = apiInstance.getHistoryWorker(begin, end);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getHistoryWorker");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Begin timestamp for time-series report. | [optional]
 **end** | **Integer**| End timestamp for time-series report. | [optional]

### Return type

[**HistoryFile**](HistoryFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncJob"></a>
# **getSyncJob**
> SyncJobs getSyncJob(syncJobId)



View a single SyncIQ job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncJobId = "syncJobId_example"; // String | View a single SyncIQ job.
try {
    SyncJobs result = apiInstance.getSyncJob(syncJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncJobId** | **String**| View a single SyncIQ job. |

### Return type

[**SyncJobs**](SyncJobs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncLicense"></a>
# **getSyncLicense**
> LicenseLicense getSyncLicense()



Retrieve license information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
try {
    LicenseLicense result = apiInstance.getSyncLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseLicense**](LicenseLicense.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncPolicy"></a>
# **getSyncPolicy**
> SyncPolicies getSyncPolicy(syncPolicyId)



View a single SyncIQ policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncPolicyId = "syncPolicyId_example"; // String | View a single SyncIQ policy.
try {
    SyncPolicies result = apiInstance.getSyncPolicy(syncPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncPolicyId** | **String**| View a single SyncIQ policy. |

### Return type

[**SyncPolicies**](SyncPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncReport"></a>
# **getSyncReport**
> SyncReports getSyncReport(syncReportId)



View a single SyncIQ report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncReportId = "syncReportId_example"; // String | View a single SyncIQ report.
try {
    SyncReports result = apiInstance.getSyncReport(syncReportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncReportId** | **String**| View a single SyncIQ report. |

### Return type

[**SyncReports**](SyncReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncReports"></a>
# **getSyncReports**
> SyncReportsExtended getSyncReports(sort, resume, newerThan, policyName, state, limit, reportsPerPolicy, dir)



Get a list of SyncIQ reports.  By default 10 reports are returned per policy, unless otherwise specified by &#39;reports_per_policy&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer newerThan = 56; // Integer | Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago.
String policyName = "policyName_example"; // String | Filter the returned reports to include only those with this policy name.
String state = "state_example"; // String | Filter the returned reports to include only those whose jobs are in this state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Integer reportsPerPolicy = 56; // Integer | If specified, only the N most recent reports will be returned per policy.  If no other query args are present this argument defaults to 10. 
String dir = "dir_example"; // String | The direction of the sort.
try {
    SyncReportsExtended result = apiInstance.getSyncReports(sort, resume, newerThan, policyName, state, limit, reportsPerPolicy, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **newerThan** | **Integer**| Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago. | [optional]
 **policyName** | **String**| Filter the returned reports to include only those with this policy name. | [optional]
 **state** | **String**| Filter the returned reports to include only those whose jobs are in this state. | [optional] [enum: scheduled, running, paused, finished, failed, canceled, needs_attention, skipped, pending, unknown]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **reportsPerPolicy** | **Integer**| If specified, only the N most recent reports will be returned per policy.  If no other query args are present this argument defaults to 10.  | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**SyncReportsExtended**](SyncReportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncRule"></a>
# **getSyncRule**
> SyncRules getSyncRule(syncRuleId)



View a single SyncIQ performance rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String syncRuleId = "syncRuleId_example"; // String | View a single SyncIQ performance rule.
try {
    SyncRules result = apiInstance.getSyncRule(syncRuleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncRuleId** | **String**| View a single SyncIQ performance rule. |

### Return type

[**SyncRules**](SyncRules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSyncSettings"></a>
# **getSyncSettings**
> SyncSettings getSyncSettings()



Retrieve the global SyncIQ settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
try {
    SyncSettings result = apiInstance.getSyncSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getSyncSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SyncSettings**](SyncSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTargetPolicies"></a>
# **getTargetPolicies**
> TargetPoliciesExtended getTargetPolicies(sort, targetPath, limit, dir, resume)



List all SyncIQ target policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String targetPath = "targetPath_example"; // String | Filter the returned policies to include only those with this target path.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    TargetPoliciesExtended result = apiInstance.getTargetPolicies(sort, targetPath, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getTargetPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **targetPath** | **String**| Filter the returned policies to include only those with this target path. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**TargetPoliciesExtended**](TargetPoliciesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTargetPolicy"></a>
# **getTargetPolicy**
> TargetPolicies getTargetPolicy(targetPolicyId)



View a single SyncIQ target policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String targetPolicyId = "targetPolicyId_example"; // String | View a single SyncIQ target policy.
try {
    TargetPolicies result = apiInstance.getTargetPolicy(targetPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getTargetPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetPolicyId** | **String**| View a single SyncIQ target policy. |

### Return type

[**TargetPolicies**](TargetPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTargetReport"></a>
# **getTargetReport**
> TargetReports getTargetReport(targetReportId)



View a single SyncIQ target report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String targetReportId = "targetReportId_example"; // String | View a single SyncIQ target report.
try {
    TargetReports result = apiInstance.getTargetReport(targetReportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getTargetReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **targetReportId** | **String**| View a single SyncIQ target report. |

### Return type

[**TargetReports**](TargetReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTargetReports"></a>
# **getTargetReports**
> TargetReportsExtended getTargetReports(sort, resume, newerThan, policyName, state, limit, reportsPerPolicy, dir)



Get a list of SyncIQ target reports.  By default 10 reports are returned per policy, unless otherwise specified by &#39;reports_per_policy&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer newerThan = 56; // Integer | Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago.
String policyName = "policyName_example"; // String | Filter the returned reports to include only those with this policy name.
String state = "state_example"; // String | Filter the returned reports to include only those whose jobs are in this state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Integer reportsPerPolicy = 56; // Integer | If specified, only the N most recent reports will be returned per policy.  If no other query args are present this argument defaults to 10. 
String dir = "dir_example"; // String | The direction of the sort.
try {
    TargetReportsExtended result = apiInstance.getTargetReports(sort, resume, newerThan, policyName, state, limit, reportsPerPolicy, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#getTargetReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **newerThan** | **Integer**| Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago. | [optional]
 **policyName** | **String**| Filter the returned reports to include only those with this policy name. | [optional]
 **state** | **String**| Filter the returned reports to include only those whose jobs are in this state. | [optional] [enum: scheduled, running, paused, finished, failed, canceled, needs_attention, skipped, pending, unknown]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **reportsPerPolicy** | **Integer**| If specified, only the N most recent reports will be returned per policy.  If no other query args are present this argument defaults to 10.  | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**TargetReportsExtended**](TargetReportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSyncJobs"></a>
# **listSyncJobs**
> SyncJobsExtended listSyncJobs(sort, state, limit, dir, resume)



Get a list of SyncIQ jobs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String state = "state_example"; // String | The state of the job.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SyncJobsExtended result = apiInstance.listSyncJobs(sort, state, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#listSyncJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **state** | **String**| The state of the job. | [optional] [enum: scheduled, running, paused, finished, failed, canceled, needs_attention, skipped, pending, unknown]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SyncJobsExtended**](SyncJobsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSyncPolicies"></a>
# **listSyncPolicies**
> SyncPoliciesExtended listSyncPolicies(sort, resume, summary, limit, scope, dir)



List all SyncIQ policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean summary = true; // Boolean | Show only summary properties
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String dir = "dir_example"; // String | The direction of the sort.
try {
    SyncPoliciesExtended result = apiInstance.listSyncPolicies(sort, resume, summary, limit, scope, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#listSyncPolicies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **summary** | **Boolean**| Show only summary properties | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**SyncPoliciesExtended**](SyncPoliciesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSyncReportsRotate"></a>
# **listSyncReportsRotate**
> SyncReportsRotate listSyncReportsRotate()



Whether the rotation is still running or not.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
try {
    SyncReportsRotate result = apiInstance.listSyncReportsRotate();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#listSyncReportsRotate");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SyncReportsRotate**](SyncReportsRotate.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSyncRules"></a>
# **listSyncRules**
> SyncRulesExtended listSyncRules(sort, type, limit, dir, resume)



List all SyncIQ performance rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String type = "type_example"; // String | Filter the returned rules to include only those with this rule type.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SyncRulesExtended result = apiInstance.listSyncRules(sort, type, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#listSyncRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **type** | **String**| Filter the returned rules to include only those with this rule type. | [optional] [enum: bandwidth, file_count, cpu, worker]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SyncRulesExtended**](SyncRulesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSyncJob"></a>
# **updateSyncJob**
> updateSyncJob(syncJob, syncJobId)



Perform an action (pause, cancel, etc...) on a single job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncJob syncJob = new SyncJob(); // SyncJob | 
String syncJobId = "syncJobId_example"; // String | Perform an action (pause, cancel, etc...) on a single job.
try {
    apiInstance.updateSyncJob(syncJob, syncJobId);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#updateSyncJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncJob** | [**SyncJob**](SyncJob.md)|  |
 **syncJobId** | **String**| Perform an action (pause, cancel, etc...) on a single job. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSyncPolicy"></a>
# **updateSyncPolicy**
> updateSyncPolicy(syncPolicy, syncPolicyId)



Modify a single SyncIQ policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncPolicy syncPolicy = new SyncPolicy(); // SyncPolicy | 
String syncPolicyId = "syncPolicyId_example"; // String | Modify a single SyncIQ policy.
try {
    apiInstance.updateSyncPolicy(syncPolicy, syncPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#updateSyncPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncPolicy** | [**SyncPolicy**](SyncPolicy.md)|  |
 **syncPolicyId** | **String**| Modify a single SyncIQ policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSyncRule"></a>
# **updateSyncRule**
> updateSyncRule(syncRule, syncRuleId)



Modify a single SyncIQ performance rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncRule syncRule = new SyncRule(); // SyncRule | 
String syncRuleId = "syncRuleId_example"; // String | Modify a single SyncIQ performance rule.
try {
    apiInstance.updateSyncRule(syncRule, syncRuleId);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#updateSyncRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncRule** | [**SyncRule**](SyncRule.md)|  |
 **syncRuleId** | **String**| Modify a single SyncIQ performance rule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSyncSettings"></a>
# **updateSyncSettings**
> updateSyncSettings(syncSettings)



Modify the global SyncIQ settings.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncApi apiInstance = new SyncApi();
SyncSettingsExtended syncSettings = new SyncSettingsExtended(); // SyncSettingsExtended | 
try {
    apiInstance.updateSyncSettings(syncSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncApi#updateSyncSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **syncSettings** | [**SyncSettingsExtended**](SyncSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

