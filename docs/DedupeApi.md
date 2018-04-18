# DedupeApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDedupeDedupeSummary**](DedupeApi.md#getDedupeDedupeSummary) | **GET** /platform/1/dedupe/dedupe-summary | 
[**getDedupeReport**](DedupeApi.md#getDedupeReport) | **GET** /platform/1/dedupe/reports/{DedupeReportId} | 
[**getDedupeReports**](DedupeApi.md#getDedupeReports) | **GET** /platform/1/dedupe/reports | 
[**getDedupeSettings**](DedupeApi.md#getDedupeSettings) | **GET** /platform/1/dedupe/settings | 
[**updateDedupeSettings**](DedupeApi.md#updateDedupeSettings) | **PUT** /platform/1/dedupe/settings | 


<a name="getDedupeDedupeSummary"></a>
# **getDedupeDedupeSummary**
> DedupeDedupeSummary getDedupeDedupeSummary()



Return summary information about dedupe.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DedupeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DedupeApi apiInstance = new DedupeApi();
try {
    DedupeDedupeSummary result = apiInstance.getDedupeDedupeSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DedupeApi#getDedupeDedupeSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DedupeDedupeSummary**](DedupeDedupeSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDedupeReport"></a>
# **getDedupeReport**
> DedupeReports getDedupeReport(dedupeReportId, scope)



Retrieve a report for a single dedupe job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DedupeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DedupeApi apiInstance = new DedupeApi();
String dedupeReportId = "dedupeReportId_example"; // String | Retrieve a report for a single dedupe job.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    DedupeReports result = apiInstance.getDedupeReport(dedupeReportId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DedupeApi#getDedupeReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dedupeReportId** | **String**| Retrieve a report for a single dedupe job. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**DedupeReports**](DedupeReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDedupeReports"></a>
# **getDedupeReports**
> DedupeReportsExtended getDedupeReports(sort, begin, end, jobId, resume, jobType, limit, dir)



List dedupe reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DedupeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DedupeApi apiInstance = new DedupeApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer begin = 56; // Integer | Restrict the query to reports at or after the given time, in seconds since the Epoch.
Integer end = 56; // Integer | Restrict the query to reports at or before the given time, in seconds since the Epoch.
Integer jobId = 56; // Integer | Restrict the query to the given job ID.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String jobType = "jobType_example"; // String | Restrict the query to the given job type.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    DedupeReportsExtended result = apiInstance.getDedupeReports(sort, begin, end, jobId, resume, jobType, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DedupeApi#getDedupeReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional] [enum: id, start_time, end_time]
 **begin** | **Integer**| Restrict the query to reports at or after the given time, in seconds since the Epoch. | [optional]
 **end** | **Integer**| Restrict the query to reports at or before the given time, in seconds since the Epoch. | [optional]
 **jobId** | **Integer**| Restrict the query to the given job ID. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **jobType** | **String**| Restrict the query to the given job type. | [optional] [enum: Dedupe, DedupeAssessment]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**DedupeReportsExtended**](DedupeReportsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDedupeSettings"></a>
# **getDedupeSettings**
> DedupeSettings getDedupeSettings()



Retrieve the dedupe settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DedupeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DedupeApi apiInstance = new DedupeApi();
try {
    DedupeSettings result = apiInstance.getDedupeSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DedupeApi#getDedupeSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DedupeSettings**](DedupeSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDedupeSettings"></a>
# **updateDedupeSettings**
> updateDedupeSettings(dedupeSettings)



Modify the dedupe settings. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DedupeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DedupeApi apiInstance = new DedupeApi();
DedupeSettingsExtended dedupeSettings = new DedupeSettingsExtended(); // DedupeSettingsExtended | 
try {
    apiInstance.updateDedupeSettings(dedupeSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling DedupeApi#updateDedupeSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dedupeSettings** | [**DedupeSettingsExtended**](DedupeSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

