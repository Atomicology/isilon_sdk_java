# JobApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createJobJob**](JobApi.md#createJobJob) | **POST** /platform/3/job/jobs | 
[**createJobPolicy**](JobApi.md#createJobPolicy) | **POST** /platform/1/job/policies | 
[**deleteJobPolicy**](JobApi.md#deleteJobPolicy) | **DELETE** /platform/1/job/policies/{JobPolicyId} | 
[**getJobEvents**](JobApi.md#getJobEvents) | **GET** /platform/3/job/events | 
[**getJobJob**](JobApi.md#getJobJob) | **GET** /platform/3/job/jobs/{JobJobId} | 
[**getJobJobSummary**](JobApi.md#getJobJobSummary) | **GET** /platform/1/job/job-summary | 
[**getJobPolicy**](JobApi.md#getJobPolicy) | **GET** /platform/1/job/policies/{JobPolicyId} | 
[**getJobRecent**](JobApi.md#getJobRecent) | **GET** /platform/3/job/recent | 
[**getJobReports**](JobApi.md#getJobReports) | **GET** /platform/3/job/reports | 
[**getJobStatistics**](JobApi.md#getJobStatistics) | **GET** /platform/1/job/statistics | 
[**getJobType**](JobApi.md#getJobType) | **GET** /platform/1/job/types/{JobTypeId} | 
[**getJobTypes**](JobApi.md#getJobTypes) | **GET** /platform/1/job/types | 
[**listJobJobs**](JobApi.md#listJobJobs) | **GET** /platform/3/job/jobs | 
[**listJobPolicies**](JobApi.md#listJobPolicies) | **GET** /platform/1/job/policies | 
[**updateJobJob**](JobApi.md#updateJobJob) | **PUT** /platform/3/job/jobs/{JobJobId} | 
[**updateJobPolicy**](JobApi.md#updateJobPolicy) | **PUT** /platform/1/job/policies/{JobPolicyId} | 
[**updateJobType**](JobApi.md#updateJobType) | **PUT** /platform/1/job/types/{JobTypeId} | 


<a name="createJobJob"></a>
# **createJobJob**
> CreateJobJobResponse createJobJob(jobJob)



Queue a new instance of a job type.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobJobCreateParams jobJob = new JobJobCreateParams(); // JobJobCreateParams | 
try {
    CreateJobJobResponse result = apiInstance.createJobJob(jobJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#createJobJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobJob** | [**JobJobCreateParams**](JobJobCreateParams.md)|  |

### Return type

[**CreateJobJobResponse**](CreateJobJobResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createJobPolicy"></a>
# **createJobPolicy**
> CreateResponse createJobPolicy(jobPolicy)



Create a new job impact policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobPolicyCreateParams jobPolicy = new JobPolicyCreateParams(); // JobPolicyCreateParams | 
try {
    CreateResponse result = apiInstance.createJobPolicy(jobPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#createJobPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobPolicy** | [**JobPolicyCreateParams**](JobPolicyCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobPolicy"></a>
# **deleteJobPolicy**
> deleteJobPolicy(jobPolicyId)



Delete a job impact policy.  System policies may not be deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String jobPolicyId = "jobPolicyId_example"; // String | Delete a job impact policy.  System policies may not be deleted.
try {
    apiInstance.deleteJobPolicy(jobPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#deleteJobPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobPolicyId** | **String**| Delete a job impact policy.  System policies may not be deleted. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobEvents"></a>
# **getJobEvents**
> JobEvents getJobEvents(begin, end, jobId, resume, jobType, timeoutMs, state, limit, key)



List job events.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Integer begin = 56; // Integer | Restrict the query to events at or after the given time, in seconds since the Epoch.
Integer end = 56; // Integer | Restrict the query to events before the given time, in seconds since the Epoch.
Integer jobId = 56; // Integer | Restrict the query to the given job ID.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String jobType = "jobType_example"; // String | Restrict the query to the given job type.
Integer timeoutMs = 56; // Integer | Query timeout in milliseconds. The default is 10000 ms.
String state = "state_example"; // String | Restrict the query to events containing the given state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String key = "key_example"; // String | Restrict the query to the given key name.
try {
    JobEvents result = apiInstance.getJobEvents(begin, end, jobId, resume, jobType, timeoutMs, state, limit, key);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Restrict the query to events at or after the given time, in seconds since the Epoch. | [optional]
 **end** | **Integer**| Restrict the query to events before the given time, in seconds since the Epoch. | [optional]
 **jobId** | **Integer**| Restrict the query to the given job ID. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **jobType** | **String**| Restrict the query to the given job type. | [optional]
 **timeoutMs** | **Integer**| Query timeout in milliseconds. The default is 10000 ms. | [optional]
 **state** | **String**| Restrict the query to events containing the given state. | [optional] [enum: running, paused_user, paused_system, paused_policy, paused_priority, cancelled_user, cancelled_system, failed, succeeded, unknown]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **key** | **String**| Restrict the query to the given key name. | [optional]

### Return type

[**JobEvents**](JobEvents.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobJob"></a>
# **getJobJob**
> JobJobs getJobJob(jobJobId)



View a single job instance.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String jobJobId = "jobJobId_example"; // String | View a single job instance.
try {
    JobJobs result = apiInstance.getJobJob(jobJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobJobId** | **String**| View a single job instance. |

### Return type

[**JobJobs**](JobJobs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobJobSummary"></a>
# **getJobJobSummary**
> JobJobSummary getJobJobSummary()



View job engine status.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
try {
    JobJobSummary result = apiInstance.getJobJobSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobJobSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**JobJobSummary**](JobJobSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobPolicy"></a>
# **getJobPolicy**
> JobPolicies getJobPolicy(jobPolicyId)



View a single job impact policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String jobPolicyId = "jobPolicyId_example"; // String | View a single job impact policy.
try {
    JobPolicies result = apiInstance.getJobPolicy(jobPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobPolicyId** | **String**| View a single job impact policy. |

### Return type

[**JobPolicies**](JobPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobRecent"></a>
# **getJobRecent**
> JobRecent getJobRecent(timeoutMs, limit)



List recently completed jobs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Integer timeoutMs = 56; // Integer | Query timeout in milliseconds. The default is 10000 ms.
Integer limit = 56; // Integer | Max number of recent jobs to return. The default is 8, the max is 100.
try {
    JobRecent result = apiInstance.getJobRecent(timeoutMs, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobRecent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeoutMs** | **Integer**| Query timeout in milliseconds. The default is 10000 ms. | [optional]
 **limit** | **Integer**| Max number of recent jobs to return. The default is 8, the max is 100. | [optional]

### Return type

[**JobRecent**](JobRecent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobReports"></a>
# **getJobReports**
> JobReports getJobReports(begin, end, jobId, resume, jobType, timeoutMs, limit, key, verbose)



List job reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Integer begin = 56; // Integer | Restrict the query to reports at or after the given time, in seconds since the Epoch.
Integer end = 56; // Integer | Restrict the query to reports before the given time, in seconds since the Epoch.
Integer jobId = 56; // Integer | Restrict the query to the given job ID.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String jobType = "jobType_example"; // String | Restrict the query to the given job type.
Integer timeoutMs = 56; // Integer | Query timeout in milliseconds. The default is 10000 ms.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String key = "key_example"; // String | Restrict the query to the given report key.
Boolean verbose = true; // Boolean | Display more detailed information, including job engine framework statistics.
try {
    JobReports result = apiInstance.getJobReports(begin, end, jobId, resume, jobType, timeoutMs, limit, key, verbose);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Restrict the query to reports at or after the given time, in seconds since the Epoch. | [optional]
 **end** | **Integer**| Restrict the query to reports before the given time, in seconds since the Epoch. | [optional]
 **jobId** | **Integer**| Restrict the query to the given job ID. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **jobType** | **String**| Restrict the query to the given job type. | [optional]
 **timeoutMs** | **Integer**| Query timeout in milliseconds. The default is 10000 ms. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **key** | **String**| Restrict the query to the given report key. | [optional]
 **verbose** | **Boolean**| Display more detailed information, including job engine framework statistics. | [optional]

### Return type

[**JobReports**](JobReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobStatistics"></a>
# **getJobStatistics**
> JobStatistics getJobStatistics(devid, jobId)



View job engine statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
Integer devid = 56; // Integer | Restrict the query to the given node.
Integer jobId = 56; // Integer | Restrict the query to the given job ID.
try {
    JobStatistics result = apiInstance.getJobStatistics(devid, jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **devid** | **Integer**| Restrict the query to the given node. | [optional]
 **jobId** | **Integer**| Restrict the query to the given job ID. | [optional]

### Return type

[**JobStatistics**](JobStatistics.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobType"></a>
# **getJobType**
> JobTypes getJobType(jobTypeId)



Retrieve job type information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String jobTypeId = "jobTypeId_example"; // String | Retrieve job type information.
try {
    JobTypes result = apiInstance.getJobType(jobTypeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobTypeId** | **String**| Retrieve job type information. |

### Return type

[**JobTypes**](JobTypes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobTypes"></a>
# **getJobTypes**
> JobTypesExtended getJobTypes(sort, showAll, dir)



List job types.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Boolean showAll = true; // Boolean | Whether to show all job types, including hidden ones.  Defaults to false.
String dir = "dir_example"; // String | The direction of the sort.
try {
    JobTypesExtended result = apiInstance.getJobTypes(sort, showAll, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#getJobTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **showAll** | **Boolean**| Whether to show all job types, including hidden ones.  Defaults to false. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**JobTypesExtended**](JobTypesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobJobs"></a>
# **listJobJobs**
> JobJobsExtended listJobJobs(sort, resume, batch, state, limit, dir)



List running and paused jobs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean batch = true; // Boolean | If true, other arguments are ignored, and the query will return all results, unsorted, as quickly as possible.
String state = "state_example"; // String | Limit the results to jobs in the specified state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    JobJobsExtended result = apiInstance.listJobJobs(sort, resume, batch, state, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#listJobJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **batch** | **Boolean**| If true, other arguments are ignored, and the query will return all results, unsorted, as quickly as possible. | [optional]
 **state** | **String**| Limit the results to jobs in the specified state. | [optional] [enum: running, paused_user, paused_system, paused_policy, paused_priority]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**JobJobsExtended**](JobJobsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobPolicies"></a>
# **listJobPolicies**
> JobPoliciesExtended listJobPolicies(sort, limit, dir, resume)



List job impact policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    JobPoliciesExtended result = apiInstance.listJobPolicies(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#listJobPolicies");
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

[**JobPoliciesExtended**](JobPoliciesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobJob"></a>
# **updateJobJob**
> updateJobJob(jobJob, jobJobId)



Modify a running or paused job instance.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobJob jobJob = new JobJob(); // JobJob | 
String jobJobId = "jobJobId_example"; // String | Modify a running or paused job instance.  All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateJobJob(jobJob, jobJobId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJobJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobJob** | [**JobJob**](JobJob.md)|  |
 **jobJobId** | **String**| Modify a running or paused job instance.  All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobPolicy"></a>
# **updateJobPolicy**
> updateJobPolicy(jobPolicy, jobPolicyId)



Modify a job impact policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobPolicy jobPolicy = new JobPolicy(); // JobPolicy | 
String jobPolicyId = "jobPolicyId_example"; // String | Modify a job impact policy.
try {
    apiInstance.updateJobPolicy(jobPolicy, jobPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJobPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobPolicy** | [**JobPolicy**](JobPolicy.md)|  |
 **jobPolicyId** | **String**| Modify a job impact policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobType"></a>
# **updateJobType**
> updateJobType(jobType, jobTypeId)



Modify the job type.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

JobApi apiInstance = new JobApi();
JobType jobType = new JobType(); // JobType | 
String jobTypeId = "jobTypeId_example"; // String | Modify the job type.  All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateJobType(jobType, jobTypeId);
} catch (ApiException e) {
    System.err.println("Exception when calling JobApi#updateJobType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobType** | [**JobType**](JobType.md)|  |
 **jobTypeId** | **String**| Modify the job type.  All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

