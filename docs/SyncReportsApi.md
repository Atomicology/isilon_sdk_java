# SyncReportsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportSubreport**](SyncReportsApi.md#getReportSubreport) | **GET** /platform/4/sync/reports/{Rid}/subreports/{ReportSubreportId} | 
[**getReportSubreports**](SyncReportsApi.md#getReportSubreports) | **GET** /platform/4/sync/reports/{Rid}/subreports | 


<a name="getReportSubreport"></a>
# **getReportSubreport**
> ReportSubreports getReportSubreport(reportSubreportId, rid)



View a single SyncIQ subreport.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncReportsApi apiInstance = new SyncReportsApi();
String reportSubreportId = "reportSubreportId_example"; // String | View a single SyncIQ subreport.
String rid = "rid_example"; // String | 
try {
    ReportSubreports result = apiInstance.getReportSubreport(reportSubreportId, rid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncReportsApi#getReportSubreport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportSubreportId** | **String**| View a single SyncIQ subreport. |
 **rid** | **String**|  |

### Return type

[**ReportSubreports**](ReportSubreports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReportSubreports"></a>
# **getReportSubreports**
> ReportSubreportsExtended getReportSubreports(rid, sort, resume, newerThan, state, limit, dir)



Get a list of SyncIQ subreports for a report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncReportsApi apiInstance = new SyncReportsApi();
String rid = "rid_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer newerThan = 56; // Integer | Filter the returned reports to include only those whose jobs started more recently than the specified number of days ago.
String state = "state_example"; // String | Filter the returned reports to include only those whose jobs are in this state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    ReportSubreportsExtended result = apiInstance.getReportSubreports(rid, sort, resume, newerThan, state, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncReportsApi#getReportSubreports");
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

[**ReportSubreportsExtended**](ReportSubreportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

