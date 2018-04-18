# FsaResultsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistogramStatBy**](FsaResultsApi.md#getHistogramStatBy) | **GET** /platform/3/fsa/results/{Id}/histogram/{Stat}/by | 
[**getHistogramStatByBreakout**](FsaResultsApi.md#getHistogramStatByBreakout) | **GET** /platform/3/fsa/results/{Id}/histogram/{Stat}/by/{HistogramStatByBreakout} | 
[**getResultDirectories**](FsaResultsApi.md#getResultDirectories) | **GET** /platform/3/fsa/results/{Id}/directories | 
[**getResultDirectory**](FsaResultsApi.md#getResultDirectory) | **GET** /platform/3/fsa/results/{Id}/directories/{ResultDirectoryId} | 
[**getResultHistogram**](FsaResultsApi.md#getResultHistogram) | **GET** /platform/3/fsa/results/{Id}/histogram | 
[**getResultHistogramStat**](FsaResultsApi.md#getResultHistogramStat) | **GET** /platform/3/fsa/results/{Id}/histogram/{ResultHistogramStat} | 
[**getResultTopDir**](FsaResultsApi.md#getResultTopDir) | **GET** /platform/3/fsa/results/{Id}/top-dirs/{ResultTopDirId} | 
[**getResultTopDirs**](FsaResultsApi.md#getResultTopDirs) | **GET** /platform/3/fsa/results/{Id}/top-dirs | 
[**getResultTopFile**](FsaResultsApi.md#getResultTopFile) | **GET** /platform/3/fsa/results/{Id}/top-files/{ResultTopFileId} | 
[**getResultTopFiles**](FsaResultsApi.md#getResultTopFiles) | **GET** /platform/3/fsa/results/{Id}/top-files | 


<a name="getHistogramStatBy"></a>
# **getHistogramStatBy**
> HistogramStatBy getHistogramStatBy(id, stat)



This resource retrieves a histogram breakout for an individual FSA result set. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String id = "id_example"; // String | 
String stat = "stat_example"; // String | 
try {
    HistogramStatBy result = apiInstance.getHistogramStatBy(id, stat);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getHistogramStatBy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **stat** | **String**|  |

### Return type

[**HistogramStatBy**](HistogramStatBy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHistogramStatByBreakout"></a>
# **getHistogramStatByBreakout**
> HistogramStatBy getHistogramStatByBreakout(histogramStatByBreakout, id, stat, directoryFilter, attributeFilter, nodePoolFilter, diskPoolFilter, tierFilter, compReport, logSizeFilter, physSizeFilter, limit, pathExtFilter, ctimeFilter, atimeFilter)



This resource retrieves a histogram breakout for an individual FSA result set. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String histogramStatByBreakout = "histogramStatByBreakout_example"; // String | This resource retrieves a histogram breakout for an individual FSA result set. ID in the resource path is the result set ID.
String id = "id_example"; // String | 
String stat = "stat_example"; // String | 
String directoryFilter = "directoryFilter_example"; // String | Filter according to a specific directory, which includes all of its subdirectories.
String attributeFilter = "attributeFilter_example"; // String | Filter according to the name of a file user attribute.
String nodePoolFilter = "nodePoolFilter_example"; // String | Filter according to the name of a node pool, which is a set of disk pools that belong to nodes of the same equivalence class.
String diskPoolFilter = "diskPoolFilter_example"; // String | Filter according to the name of a disk pool, which is a set of drives that represent an independent failure domain.
String tierFilter = "tierFilter_example"; // String | Filter according to the name of a storage tier, which is a user-created set of node pools.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
Integer logSizeFilter = 56; // Integer | Filter according to file logical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by logical size. The list of valid log_size filter values may be found by performing a histogram breakout by log_size and viewing the resulting key values.
Integer physSizeFilter = 56; // Integer | Filter according to file physical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by physical size. The list of valid phys_size filter values may be found by performing a histogram breakout by phys_size and viewing the resulting key values.
Integer limit = 56; // Integer | Limit the number of breakout results.
String pathExtFilter = "pathExtFilter_example"; // String | Filter according to the name of a single file extension.
Integer ctimeFilter = 56; // Integer | Filter according to file modified time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid ctime filter values may be found by performing a histogram breakout by ctime and viewing the resulting key values.
Integer atimeFilter = 56; // Integer | Filter according to file accessed time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid atime filter values may be found by performing a histogram breakout by atime and viewing the resulting key values.
try {
    HistogramStatBy result = apiInstance.getHistogramStatByBreakout(histogramStatByBreakout, id, stat, directoryFilter, attributeFilter, nodePoolFilter, diskPoolFilter, tierFilter, compReport, logSizeFilter, physSizeFilter, limit, pathExtFilter, ctimeFilter, atimeFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getHistogramStatByBreakout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **histogramStatByBreakout** | **String**| This resource retrieves a histogram breakout for an individual FSA result set. ID in the resource path is the result set ID. |
 **id** | **String**|  |
 **stat** | **String**|  |
 **directoryFilter** | **String**| Filter according to a specific directory, which includes all of its subdirectories. | [optional]
 **attributeFilter** | **String**| Filter according to the name of a file user attribute. | [optional]
 **nodePoolFilter** | **String**| Filter according to the name of a node pool, which is a set of disk pools that belong to nodes of the same equivalence class. | [optional]
 **diskPoolFilter** | **String**| Filter according to the name of a disk pool, which is a set of drives that represent an independent failure domain. | [optional]
 **tierFilter** | **String**| Filter according to the name of a storage tier, which is a user-created set of node pools. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **logSizeFilter** | **Integer**| Filter according to file logical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by logical size. The list of valid log_size filter values may be found by performing a histogram breakout by log_size and viewing the resulting key values. | [optional]
 **physSizeFilter** | **Integer**| Filter according to file physical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by physical size. The list of valid phys_size filter values may be found by performing a histogram breakout by phys_size and viewing the resulting key values. | [optional]
 **limit** | **Integer**| Limit the number of breakout results. | [optional]
 **pathExtFilter** | **String**| Filter according to the name of a single file extension. | [optional]
 **ctimeFilter** | **Integer**| Filter according to file modified time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid ctime filter values may be found by performing a histogram breakout by ctime and viewing the resulting key values. | [optional]
 **atimeFilter** | **Integer**| Filter according to file accessed time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid atime filter values may be found by performing a histogram breakout by atime and viewing the resulting key values. | [optional]

### Return type

[**HistogramStatBy**](HistogramStatBy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultDirectories"></a>
# **getResultDirectories**
> ResultDirectories getResultDirectories(id, sort, path, limit, compReport, dir)



This resource retrieves directory information. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String id = "id_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
String path = "path_example"; // String | Primary directory path to report usage information, which may be specified instead of a LIN.
Integer limit = 56; // Integer | Limit the number of reported subdirectories.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ResultDirectories result = apiInstance.getResultDirectories(id, sort, path, limit, compReport, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultDirectories");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **path** | **String**| Primary directory path to report usage information, which may be specified instead of a LIN. | [optional]
 **limit** | **Integer**| Limit the number of reported subdirectories. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ResultDirectories**](ResultDirectories.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultDirectory"></a>
# **getResultDirectory**
> ResultDirectories getResultDirectory(resultDirectoryId, id, sort, limit, compReport, dir)



This resource retrieves directory information. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
Integer resultDirectoryId = 56; // Integer | This resource retrieves directory information. ID in the resource path is the result set ID.
String id = "id_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Limit the number of reported subdirectories.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ResultDirectories result = apiInstance.getResultDirectory(resultDirectoryId, id, sort, limit, compReport, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultDirectory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultDirectoryId** | **Integer**| This resource retrieves directory information. ID in the resource path is the result set ID. |
 **id** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Limit the number of reported subdirectories. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ResultDirectories**](ResultDirectories.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultHistogram"></a>
# **getResultHistogram**
> ResultHistogram getResultHistogram(id)



This resource retrieves a histogram of file counts for an individual FSA result set. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String id = "id_example"; // String | 
try {
    ResultHistogram result = apiInstance.getResultHistogram(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultHistogram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ResultHistogram**](ResultHistogram.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultHistogramStat"></a>
# **getResultHistogramStat**
> ResultHistogram getResultHistogramStat(resultHistogramStat, id, directoryFilter, attributeFilter, nodePoolFilter, diskPoolFilter, tierFilter, compReport, logSizeFilter, physSizeFilter, pathExtFilter, ctimeFilter, atimeFilter)



This resource retrieves a histogram of file counts for an individual FSA result set. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String resultHistogramStat = "resultHistogramStat_example"; // String | This resource retrieves a histogram of file counts for an individual FSA result set. ID in the resource path is the result set ID.
String id = "id_example"; // String | 
String directoryFilter = "directoryFilter_example"; // String | Filter according to a specific directory, which includes all of its subdirectories.
String attributeFilter = "attributeFilter_example"; // String | Filter according to the name of a file user attribute.
String nodePoolFilter = "nodePoolFilter_example"; // String | Filter according to the name of a node pool, which is a set of disk pools that belong to nodes of the same equivalence class.
String diskPoolFilter = "diskPoolFilter_example"; // String | Filter according to the name of a disk pool, which is a set of drives that represent an independent failure domain.
String tierFilter = "tierFilter_example"; // String | Filter according to the name of a storage tier, which is a user-created set of node pools.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
Integer logSizeFilter = 56; // Integer | Filter according to file logical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by logical size. The list of valid log_size filter values may be found by performing a histogram breakout by log_size and viewing the resulting key values.
Integer physSizeFilter = 56; // Integer | Filter according to file physical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by physical size. The list of valid phys_size filter values may be found by performing a histogram breakout by phys_size and viewing the resulting key values.
String pathExtFilter = "pathExtFilter_example"; // String | Filter according to the name of a single file extension.
Integer ctimeFilter = 56; // Integer | Filter according to file modified time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid ctime filter values may be found by performing a histogram breakout by ctime and viewing the resulting key values.
Integer atimeFilter = 56; // Integer | Filter according to file accessed time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid atime filter values may be found by performing a histogram breakout by atime and viewing the resulting key values.
try {
    ResultHistogram result = apiInstance.getResultHistogramStat(resultHistogramStat, id, directoryFilter, attributeFilter, nodePoolFilter, diskPoolFilter, tierFilter, compReport, logSizeFilter, physSizeFilter, pathExtFilter, ctimeFilter, atimeFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultHistogramStat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultHistogramStat** | **String**| This resource retrieves a histogram of file counts for an individual FSA result set. ID in the resource path is the result set ID. |
 **id** | **String**|  |
 **directoryFilter** | **String**| Filter according to a specific directory, which includes all of its subdirectories. | [optional]
 **attributeFilter** | **String**| Filter according to the name of a file user attribute. | [optional]
 **nodePoolFilter** | **String**| Filter according to the name of a node pool, which is a set of disk pools that belong to nodes of the same equivalence class. | [optional]
 **diskPoolFilter** | **String**| Filter according to the name of a disk pool, which is a set of drives that represent an independent failure domain. | [optional]
 **tierFilter** | **String**| Filter according to the name of a storage tier, which is a user-created set of node pools. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **logSizeFilter** | **Integer**| Filter according to file logical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by logical size. The list of valid log_size filter values may be found by performing a histogram breakout by log_size and viewing the resulting key values. | [optional]
 **physSizeFilter** | **Integer**| Filter according to file physical size, where the filter value specifies the lower bound in bytes to a set of files that have been grouped by physical size. The list of valid phys_size filter values may be found by performing a histogram breakout by phys_size and viewing the resulting key values. | [optional]
 **pathExtFilter** | **String**| Filter according to the name of a single file extension. | [optional]
 **ctimeFilter** | **Integer**| Filter according to file modified time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid ctime filter values may be found by performing a histogram breakout by ctime and viewing the resulting key values. | [optional]
 **atimeFilter** | **Integer**| Filter according to file accessed time, where the filter value specifies a negative number of seconds representing a time before the begin time of the report. The list of valid atime filter values may be found by performing a histogram breakout by atime and viewing the resulting key values. | [optional]

### Return type

[**ResultHistogram**](ResultHistogram.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultTopDir"></a>
# **getResultTopDir**
> ResultTopDirs getResultTopDir(resultTopDirId, id, sort, start, limit, compReport, dir)



This resource retrieves the top directories. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String resultTopDirId = "resultTopDirId_example"; // String | This resource retrieves the top directories. ID in the resource path is the result set ID.
String id = "id_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer start = 56; // Integer | Starting index for results. Default value of 0.
Integer limit = 56; // Integer | Number of results from start index. Default value of 1000.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ResultTopDirs result = apiInstance.getResultTopDir(resultTopDirId, id, sort, start, limit, compReport, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultTopDir");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultTopDirId** | **String**| This resource retrieves the top directories. ID in the resource path is the result set ID. |
 **id** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **start** | **Integer**| Starting index for results. Default value of 0. | [optional]
 **limit** | **Integer**| Number of results from start index. Default value of 1000. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ResultTopDirs**](ResultTopDirs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultTopDirs"></a>
# **getResultTopDirs**
> ResultTopDirs getResultTopDirs(id)



This resource retrieves the top directories. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String id = "id_example"; // String | 
try {
    ResultTopDirs result = apiInstance.getResultTopDirs(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultTopDirs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ResultTopDirs**](ResultTopDirs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultTopFile"></a>
# **getResultTopFile**
> ResultTopFiles getResultTopFile(resultTopFileId, id, sort, start, limit, compReport, dir)



This resource retrieves the top files. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String resultTopFileId = "resultTopFileId_example"; // String | This resource retrieves the top files. ID in the resource path is the result set ID.
String id = "id_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer start = 56; // Integer | Starting index for results. Default value of 0.
Integer limit = 56; // Integer | Number of results from start index. Default value of 1000.
Integer compReport = 56; // Integer | Result set identifier for comparison of database results.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ResultTopFiles result = apiInstance.getResultTopFile(resultTopFileId, id, sort, start, limit, compReport, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultTopFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **resultTopFileId** | **String**| This resource retrieves the top files. ID in the resource path is the result set ID. |
 **id** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **start** | **Integer**| Starting index for results. Default value of 0. | [optional]
 **limit** | **Integer**| Number of results from start index. Default value of 1000. | [optional]
 **compReport** | **Integer**| Result set identifier for comparison of database results. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ResultTopFiles**](ResultTopFiles.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getResultTopFiles"></a>
# **getResultTopFiles**
> ResultTopFiles getResultTopFiles(id)



This resource retrieves the top files. ID in the resource path is the result set ID.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaResultsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaResultsApi apiInstance = new FsaResultsApi();
String id = "id_example"; // String | 
try {
    ResultTopFiles result = apiInstance.getResultTopFiles(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaResultsApi#getResultTopFiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |

### Return type

[**ResultTopFiles**](ResultTopFiles.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

