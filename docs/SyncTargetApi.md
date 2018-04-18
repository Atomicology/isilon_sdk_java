# SyncTargetApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPoliciesPolicyCancelItem**](SyncTargetApi.md#createPoliciesPolicyCancelItem) | **POST** /platform/1/sync/target/policies/{Policy}/cancel | 
[**getReportsReportSubreport**](SyncTargetApi.md#getReportsReportSubreport) | **GET** /platform/4/sync/target/reports/{Rid}/subreports/{ReportsReportSubreportId} | 
[**getReportsReportSubreports**](SyncTargetApi.md#getReportsReportSubreports) | **GET** /platform/4/sync/target/reports/{Rid}/subreports | 


<a name="createPoliciesPolicyCancelItem"></a>
# **createPoliciesPolicyCancelItem**
> CreateResponse createPoliciesPolicyCancelItem(policiesPolicyCancelItem, policy)



Cancel the most recent SyncIQ job for this policy from the target side.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncTargetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncTargetApi apiInstance = new SyncTargetApi();
Empty policiesPolicyCancelItem = new Empty(); // Empty | 
String policy = "policy_example"; // String | 
try {
    CreateResponse result = apiInstance.createPoliciesPolicyCancelItem(policiesPolicyCancelItem, policy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncTargetApi#createPoliciesPolicyCancelItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policiesPolicyCancelItem** | [**Empty**](Empty.md)|  |
 **policy** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsReportSubreport"></a>
# **getReportsReportSubreport**
> ReportsReportSubreports getReportsReportSubreport(reportsReportSubreportId, rid)



View a single SyncIQ target subreport.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncTargetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncTargetApi apiInstance = new SyncTargetApi();
String reportsReportSubreportId = "reportsReportSubreportId_example"; // String | View a single SyncIQ target subreport.
String rid = "rid_example"; // String | 
try {
    ReportsReportSubreports result = apiInstance.getReportsReportSubreport(reportsReportSubreportId, rid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncTargetApi#getReportsReportSubreport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportsReportSubreportId** | **String**| View a single SyncIQ target subreport. |
 **rid** | **String**|  |

### Return type

[**ReportsReportSubreports**](ReportsReportSubreports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportsReportSubreports"></a>
# **getReportsReportSubreports**
> ReportsReportSubreportsExtended getReportsReportSubreports(rid, sort, resume, newerThan, state, limit, dir)



Get a list of SyncIQ target subreports for a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncTargetApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncTargetApi apiInstance = new SyncTargetApi();
String rid = "rid_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer newerThan = 56; // Integer | Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago.
String state = "state_example"; // String | Filter the returned reports to include only those whose jobs are in this state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    ReportsReportSubreportsExtended result = apiInstance.getReportsReportSubreports(rid, sort, resume, newerThan, state, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncTargetApi#getReportsReportSubreports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rid** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **newerThan** | **Integer**| Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago. | [optional]
 **state** | **String**| Filter the returned reports to include only those whose jobs are in this state. | [optional] [enum: scheduled, running, paused, finished, failed, canceled, needs_attention, skipped, pending, unknown]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ReportsReportSubreportsExtended**](ReportsReportSubreportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

