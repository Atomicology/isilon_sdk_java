# StatisticsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatisticsCurrent**](StatisticsApi.md#getStatisticsCurrent) | **GET** /platform/1/statistics/current | 
[**getStatisticsHistory**](StatisticsApi.md#getStatisticsHistory) | **GET** /platform/1/statistics/history | 
[**getStatisticsKey**](StatisticsApi.md#getStatisticsKey) | **GET** /platform/1/statistics/keys/{StatisticsKeyId} | 
[**getStatisticsKeys**](StatisticsApi.md#getStatisticsKeys) | **GET** /platform/1/statistics/keys | 
[**getStatisticsOperations**](StatisticsApi.md#getStatisticsOperations) | **GET** /platform/3/statistics/operations | 
[**getStatisticsProtocols**](StatisticsApi.md#getStatisticsProtocols) | **GET** /platform/1/statistics/protocols | 
[**getSummaryClient**](StatisticsApi.md#getSummaryClient) | **GET** /platform/3/statistics/summary/client | 
[**getSummaryDrive**](StatisticsApi.md#getSummaryDrive) | **GET** /platform/3/statistics/summary/drive | 
[**getSummaryHeat**](StatisticsApi.md#getSummaryHeat) | **GET** /platform/3/statistics/summary/heat | 
[**getSummaryProtocol**](StatisticsApi.md#getSummaryProtocol) | **GET** /platform/3/statistics/summary/protocol | 
[**getSummaryProtocolStats**](StatisticsApi.md#getSummaryProtocolStats) | **GET** /platform/3/statistics/summary/protocol-stats | 
[**getSummarySystem**](StatisticsApi.md#getSummarySystem) | **GET** /platform/3/statistics/summary/system | 
[**getSummaryWorkload**](StatisticsApi.md#getSummaryWorkload) | **GET** /platform/4/statistics/summary/workload | 


<a name="getStatisticsCurrent"></a>
# **getStatisticsCurrent**
> StatisticsCurrent getStatisticsCurrent(timeout, showNodes, keys, devid, substr, stale, typeInfo, raw, key, degraded, nodes)



Retrieve stats.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
Integer timeout = 56; // Integer | Time in seconds to wait for results from remote nodes.
Boolean showNodes = true; // Boolean | Shows the logical node number or LNN in addition to the devid.
List<String> keys = Arrays.asList("keys_example"); // List<String> | Multiple key names. May request matching keys or request 'all' keys. Can be comma separated list or can be used more than one time to make queries for multiple keys. May be used in conjunction with 'substr'. Also works with 'key' arguments.
List<String> devid = Arrays.asList("devid_example"); // List<String> | Node devid to query. Either an <integer> or \"all\". Can be used more than one time to query multiple nodes. \"all\" queries all up nodes. 0 means query the local node. For \"cluster\" scoped keys, in any devid including 0 can be used.
Boolean substr = true; // Boolean | Used in conjunction with the 'keys' argument, alters the behavior of keys. Makes the 'keys' arg perform a partial match. Defaults to false.
Boolean stale = true; // Boolean | For internal use only, please do not use this.
Boolean typeInfo = true; // Boolean | The type ID is used by internal services. For internal use only, please do not use this.
Boolean raw = true; // Boolean | Causes the output to be in hex format. For internal use only, please do not use this.
List<String> key = Arrays.asList("key_example"); // List<String> | One key name. Can be used more than one time to query multiple keys. Also works with 'keys' arguments.
Boolean degraded = true; // Boolean | If true, try to continue even if some stats are unavailable. In this case, errors will be present in the per-key returned data.
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Specify node(s) for which statistics should be reported. One or more comma separated <integer(s)> specifying which node(s) to query, or \"all\". Specifying more than one node may have unspecified results for keys that begin with \"cluster\".
try {
    StatisticsCurrent result = apiInstance.getStatisticsCurrent(timeout, showNodes, keys, devid, substr, stale, typeInfo, raw, key, degraded, nodes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsCurrent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **Integer**| Time in seconds to wait for results from remote nodes. | [optional]
 **showNodes** | **Boolean**| Shows the logical node number or LNN in addition to the devid. | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)| Multiple key names. May request matching keys or request &#39;all&#39; keys. Can be comma separated list or can be used more than one time to make queries for multiple keys. May be used in conjunction with &#39;substr&#39;. Also works with &#39;key&#39; arguments. | [optional]
 **devid** | [**List&lt;String&gt;**](String.md)| Node devid to query. Either an &lt;integer&gt; or \&quot;all\&quot;. Can be used more than one time to query multiple nodes. \&quot;all\&quot; queries all up nodes. 0 means query the local node. For \&quot;cluster\&quot; scoped keys, in any devid including 0 can be used. | [optional]
 **substr** | **Boolean**| Used in conjunction with the &#39;keys&#39; argument, alters the behavior of keys. Makes the &#39;keys&#39; arg perform a partial match. Defaults to false. | [optional]
 **stale** | **Boolean**| For internal use only, please do not use this. | [optional]
 **typeInfo** | **Boolean**| The type ID is used by internal services. For internal use only, please do not use this. | [optional]
 **raw** | **Boolean**| Causes the output to be in hex format. For internal use only, please do not use this. | [optional]
 **key** | [**List&lt;String&gt;**](String.md)| One key name. Can be used more than one time to query multiple keys. Also works with &#39;keys&#39; arguments. | [optional]
 **degraded** | **Boolean**| If true, try to continue even if some stats are unavailable. In this case, errors will be present in the per-key returned data. | [optional]
 **nodes** | [**List&lt;String&gt;**](String.md)| Specify node(s) for which statistics should be reported. One or more comma separated &lt;integer(s)&gt; specifying which node(s) to query, or \&quot;all\&quot;. Specifying more than one node may have unspecified results for keys that begin with \&quot;cluster\&quot;. | [optional]

### Return type

[**StatisticsCurrent**](StatisticsCurrent.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatisticsHistory"></a>
# **getStatisticsHistory**
> StatisticsHistory getStatisticsHistory(begin, interval, end, timeout, raw, keys, devid, substr, stale, typeInfo, memoryOnly, key, degraded, showNodes, resolution, nodes)



Retrieve stats.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
Integer begin = 56; // Integer | Earliest time (Unix epoch seconds) of interest. Negative times are interpreted as relative (before) now.
Integer interval = 56; // Integer | Minimum sampling interval time in seconds. If native statistics are higher resolution, data will be down-sampled.
Integer end = 56; // Integer | Latest time (Unix epoch seconds) of interest. Negative times are interpreted as relative (before) now. If not supplied, use now as the end time.
Integer timeout = 56; // Integer | Time in seconds to wait for results from remote nodes.
Boolean raw = true; // Boolean | Causes the output to be in hex format. For internal use only, please do not use this.
List<String> keys = Arrays.asList("keys_example"); // List<String> | Multiple key names. May request matching keys or request 'all' keys. Can be comma separated list or can be used more than one time to make queries for multiple keys. May be used in conjunction with 'substr'. Also works with 'key' arguments.
List<String> devid = Arrays.asList("devid_example"); // List<String> | Node devid to query. Either an <integer> or \"all\". Can be used more than one time to query multiple nodes. \"all\" queries all up nodes. 0 means query the local node. For \"cluster\" scoped keys, in any devid including 0 can be used.
Boolean substr = true; // Boolean | Used in conjunction with the 'keys' argument, alters the behavior of keys. Makes the 'keys' arg perform a partial match. Defaults to false.
Boolean stale = true; // Boolean | For internal use only, please do not use this.
Boolean typeInfo = true; // Boolean | The type ID is used by internal services. For internal use only, please do not use this.
Boolean memoryOnly = true; // Boolean | Only use statistics sources that reside in memory (faster, but with less retention).
List<String> key = Arrays.asList("key_example"); // List<String> | One key name. Can be used more than one time to query multiple keys. Also works with 'keys' arguments.
Boolean degraded = true; // Boolean | If true, try to continue even if some stats are unavailable. In this case, errors will be present in the per-key returned data.
Boolean showNodes = true; // Boolean | Shows the logical node number or LNN in addition to the devid.
Integer resolution = 56; // Integer | Synonymous with 'interval', if supplied supersedes interval.
List<String> nodes = Arrays.asList("nodes_example"); // List<String> | Specify node(s) for which statistics should be reported. One or more comma separated <integer(s)> specifying which node(s) to query, or \"all\". Specifying more than one node may have unspecified results for keys that begin with \"cluster\".
try {
    StatisticsHistory result = apiInstance.getStatisticsHistory(begin, interval, end, timeout, raw, keys, devid, substr, stale, typeInfo, memoryOnly, key, degraded, showNodes, resolution, nodes);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **begin** | **Integer**| Earliest time (Unix epoch seconds) of interest. Negative times are interpreted as relative (before) now. | [optional]
 **interval** | **Integer**| Minimum sampling interval time in seconds. If native statistics are higher resolution, data will be down-sampled. | [optional]
 **end** | **Integer**| Latest time (Unix epoch seconds) of interest. Negative times are interpreted as relative (before) now. If not supplied, use now as the end time. | [optional]
 **timeout** | **Integer**| Time in seconds to wait for results from remote nodes. | [optional]
 **raw** | **Boolean**| Causes the output to be in hex format. For internal use only, please do not use this. | [optional]
 **keys** | [**List&lt;String&gt;**](String.md)| Multiple key names. May request matching keys or request &#39;all&#39; keys. Can be comma separated list or can be used more than one time to make queries for multiple keys. May be used in conjunction with &#39;substr&#39;. Also works with &#39;key&#39; arguments. | [optional]
 **devid** | [**List&lt;String&gt;**](String.md)| Node devid to query. Either an &lt;integer&gt; or \&quot;all\&quot;. Can be used more than one time to query multiple nodes. \&quot;all\&quot; queries all up nodes. 0 means query the local node. For \&quot;cluster\&quot; scoped keys, in any devid including 0 can be used. | [optional]
 **substr** | **Boolean**| Used in conjunction with the &#39;keys&#39; argument, alters the behavior of keys. Makes the &#39;keys&#39; arg perform a partial match. Defaults to false. | [optional]
 **stale** | **Boolean**| For internal use only, please do not use this. | [optional]
 **typeInfo** | **Boolean**| The type ID is used by internal services. For internal use only, please do not use this. | [optional]
 **memoryOnly** | **Boolean**| Only use statistics sources that reside in memory (faster, but with less retention). | [optional]
 **key** | [**List&lt;String&gt;**](String.md)| One key name. Can be used more than one time to query multiple keys. Also works with &#39;keys&#39; arguments. | [optional]
 **degraded** | **Boolean**| If true, try to continue even if some stats are unavailable. In this case, errors will be present in the per-key returned data. | [optional]
 **showNodes** | **Boolean**| Shows the logical node number or LNN in addition to the devid. | [optional]
 **resolution** | **Integer**| Synonymous with &#39;interval&#39;, if supplied supersedes interval. | [optional]
 **nodes** | [**List&lt;String&gt;**](String.md)| Specify node(s) for which statistics should be reported. One or more comma separated &lt;integer(s)&gt; specifying which node(s) to query, or \&quot;all\&quot;. Specifying more than one node may have unspecified results for keys that begin with \&quot;cluster\&quot;. | [optional]

### Return type

[**StatisticsHistory**](StatisticsHistory.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatisticsKey"></a>
# **getStatisticsKey**
> StatisticsKeys getStatisticsKey(statisticsKeyId)



List key meta-data.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String statisticsKeyId = "statisticsKeyId_example"; // String | List key meta-data.
try {
    StatisticsKeys result = apiInstance.getStatisticsKey(statisticsKeyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsKey");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statisticsKeyId** | **String**| List key meta-data. |

### Return type

[**StatisticsKeys**](StatisticsKeys.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatisticsKeys"></a>
# **getStatisticsKeys**
> StatisticsKeysExtended getStatisticsKeys(count, limit, queryable, resume)



List meta-data for matching keys.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
Boolean count = true; // Boolean | Only count matching keys, do not return meta-data.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Boolean queryable = true; // Boolean | Only list keys that can/cannot be queries. Default is true.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    StatisticsKeysExtended result = apiInstance.getStatisticsKeys(count, limit, queryable, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsKeys");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **Boolean**| Only count matching keys, do not return meta-data. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **queryable** | **Boolean**| Only list keys that can/cannot be queries. Default is true. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**StatisticsKeysExtended**](StatisticsKeysExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatisticsOperations"></a>
# **getStatisticsOperations**
> StatisticsOperations getStatisticsOperations(protocols)



Retrieve operations list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
List<String> protocols = Arrays.asList("protocols_example"); // List<String> | A comma separated list. Only report operations for specified protocol(s). Default is all. 
try {
    StatisticsOperations result = apiInstance.getStatisticsOperations(protocols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsOperations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **protocols** | [**List&lt;String&gt;**](String.md)| A comma separated list. Only report operations for specified protocol(s). Default is all.  | [optional]

### Return type

[**StatisticsOperations**](StatisticsOperations.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStatisticsProtocols"></a>
# **getStatisticsProtocols**
> StatisticsProtocols getStatisticsProtocols(type)



Retrieve protocol list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String type = "type_example"; // String | Specifies whether internal, external, or all protocols should be returned.
try {
    StatisticsProtocols result = apiInstance.getStatisticsProtocols(type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getStatisticsProtocols");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Specifies whether internal, external, or all protocols should be returned. | [optional] [enum: internal, external, all]

### Return type

[**StatisticsProtocols**](StatisticsProtocols.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryClient"></a>
# **getSummaryClient**
> SummaryClient getSummaryClient(sort, totalby, userNames, remoteAddresses, numeric, localNames, userIds, classes, timeout, localAddresses, degraded, remoteNames, nodes, protocols)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (num_operations | operation_rate | in_max | in_min | in | in_avg | out_max | out_min | out | out_avg | time_max | time_min | time_avg | node | protocol | class | user_id | user_name | local_addr | local_name | remote_addr | remote_name) Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
String totalby = "totalby_example"; // String | A comma separated list specifying what should be unique. (node | protocol | class | local_addr | local_name | remote_addr | remote_name | user_id | user_name | devid). Aggregation is performed over all the fields not specified in the list.
String userNames = "userNames_example"; // String | A comma separated list. Only report statistics for operations requested by users with resolved names enumerated. 
String remoteAddresses = "remoteAddresses_example"; // String | A comma separated list. Only report statistics for operations requested by the remote clients with dotted-quad IP addresses enumerated. 
Boolean numeric = true; // Boolean | Do not resolve hostnames and usernames to their human readable form(s). Default is false. 
String localNames = "localNames_example"; // String | A comma separated list. Only report statistics for operations handled by the local hosts with resolved names enumerated. 
String userIds = "userIds_example"; // String | A comma separated list. Only report statistics for operations requested by users with numeric UIDs enumerated. 
String classes = "classes_example"; // String | A comma separated list. Default is all. (other | write | read | namespace_read | namespace_write)
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
String localAddresses = "localAddresses_example"; // String | A comma separated list. Only report statistics for operations handled by the local hosts with dotted-quad IP addresses enumerated. 
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String remoteNames = "remoteNames_example"; // String | A comma separated list. Only report statistics for operations requested by the remote clients with resolved names enumerated. 
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
String protocols = "protocols_example"; // String | A comma separated list. Default is all. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs | internal | external)
try {
    SummaryClient result = apiInstance.getSummaryClient(sort, totalby, userNames, remoteAddresses, numeric, localNames, userIds, classes, timeout, localAddresses, degraded, remoteNames, nodes, protocols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort data by the specified comma-separated field(s). (num_operations | operation_rate | in_max | in_min | in | in_avg | out_max | out_min | out | out_avg | time_max | time_min | time_avg | node | protocol | class | user_id | user_name | local_addr | local_name | remote_addr | remote_name) Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **totalby** | **String**| A comma separated list specifying what should be unique. (node | protocol | class | local_addr | local_name | remote_addr | remote_name | user_id | user_name | devid). Aggregation is performed over all the fields not specified in the list. | [optional]
 **userNames** | **String**| A comma separated list. Only report statistics for operations requested by users with resolved names enumerated.  | [optional]
 **remoteAddresses** | **String**| A comma separated list. Only report statistics for operations requested by the remote clients with dotted-quad IP addresses enumerated.  | [optional]
 **numeric** | **Boolean**| Do not resolve hostnames and usernames to their human readable form(s). Default is false.  | [optional]
 **localNames** | **String**| A comma separated list. Only report statistics for operations handled by the local hosts with resolved names enumerated.  | [optional]
 **userIds** | **String**| A comma separated list. Only report statistics for operations requested by users with numeric UIDs enumerated.  | [optional]
 **classes** | **String**| A comma separated list. Default is all. (other | write | read | namespace_read | namespace_write) | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]
 **localAddresses** | **String**| A comma separated list. Only report statistics for operations handled by the local hosts with dotted-quad IP addresses enumerated.  | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **remoteNames** | **String**| A comma separated list. Only report statistics for operations requested by the remote clients with resolved names enumerated.  | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **protocols** | **String**| A comma separated list. Default is all. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs | internal | external) | [optional]

### Return type

[**SummaryClient**](SummaryClient.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryDrive"></a>
# **getSummaryDrive**
> SummaryDrive getSummaryDrive(sort, degraded, type, nodes, timeout)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (drive_id | type | xfers_in | bytes_in | xfer_size_in | xfers_out | bytes_out | xfer_size_out | access_latency | access_slow | iosched_latency | iosched_queue | busy | used_bytes_percent | used_inodes). Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String type = "type_example"; // String | Specify drive type(s) for which statistics should be reported.
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
try {
    SummaryDrive result = apiInstance.getSummaryDrive(sort, degraded, type, nodes, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryDrive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort data by the specified comma-separated field(s). (drive_id | type | xfers_in | bytes_in | xfer_size_in | xfers_out | bytes_out | xfer_size_out | access_latency | access_slow | iosched_latency | iosched_queue | busy | used_bytes_percent | used_inodes). Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **type** | **String**| Specify drive type(s) for which statistics should be reported. | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]

### Return type

[**SummaryDrive**](SummaryDrive.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryHeat"></a>
# **getSummaryHeat**
> SummaryHeat getSummaryHeat(sort, convertlin, totalby, pathdepth, numeric, events, maxpath, classes, timeout, nodes, degraded)



File heat map, i.e. rate of file operations, and the type of operation listed by path/lin(s).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (operation_rate | node | event_name | class_name | lin | path). Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
Boolean convertlin = true; // Boolean | Convert lin to hex. Default is true. 
String totalby = "totalby_example"; // String | A comma separated list specifying what should be unique. (node | event_name | event_class | operation_rate | path | lin). Aggregation is performed over all the fields not specified in the list.
Integer pathdepth = 56; // Integer | Squash paths to this directory depth. Defaults to none, ie. the paths are not limited (Subject to the system limits.)
Boolean numeric = true; // Boolean | Do not resolve LINs into filenames. Default is false. 
String events = "events_example"; // String | A comma separated list. Default is all. Only report specified event types(s). (blocked | contended | deadlocked | getattr | link | lock | lookup | read | rename | setattr | unlink | write).
Integer maxpath = 56; // Integer | Maximum bytes allocated for looking up a path. An ASCII character is 1 byte (It may be more for other types of encoding). The default is 1024 bytes. Zero (0) means unlimited (Subject to the system limits.)
String classes = "classes_example"; // String | A comma separated list. Default is all. (other | write | read | namespace_read | namespace_write).
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
try {
    SummaryHeat result = apiInstance.getSummaryHeat(sort, convertlin, totalby, pathdepth, numeric, events, maxpath, classes, timeout, nodes, degraded);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryHeat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort data by the specified comma-separated field(s). (operation_rate | node | event_name | class_name | lin | path). Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **convertlin** | **Boolean**| Convert lin to hex. Default is true.  | [optional]
 **totalby** | **String**| A comma separated list specifying what should be unique. (node | event_name | event_class | operation_rate | path | lin). Aggregation is performed over all the fields not specified in the list. | [optional]
 **pathdepth** | **Integer**| Squash paths to this directory depth. Defaults to none, ie. the paths are not limited (Subject to the system limits.) | [optional]
 **numeric** | **Boolean**| Do not resolve LINs into filenames. Default is false.  | [optional]
 **events** | **String**| A comma separated list. Default is all. Only report specified event types(s). (blocked | contended | deadlocked | getattr | link | lock | lookup | read | rename | setattr | unlink | write). | [optional]
 **maxpath** | **Integer**| Maximum bytes allocated for looking up a path. An ASCII character is 1 byte (It may be more for other types of encoding). The default is 1024 bytes. Zero (0) means unlimited (Subject to the system limits.) | [optional]
 **classes** | **String**| A comma separated list. Default is all. (other | write | read | namespace_read | namespace_write). | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]

### Return type

[**SummaryHeat**](SummaryHeat.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryProtocol"></a>
# **getSummaryProtocol**
> SummaryProtocol getSummaryProtocol(operations, sort, totalby, zero, classes, timeout, degraded, nodes, protocols)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String operations = "operations_example"; // String | Specify operation(s) for which statistics should be reported (See the cli command: 'isi statistics list operations', for a total list). Default is all. 
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (time | operation_count | operation_rate | in_max | in_min | in | in_avg | in_standard_dev | out_max | out_min | out | out_avg | out_standard_dev | time_max | time_min | time_avg | time_standard_dev | node | protocol | class | operation). Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
String totalby = "totalby_example"; // String | A comma separated list specifying what should be unique. (node | protocol | class | operation). Aggregation is performed over all the fields not specified in the list.
Boolean zero = true; // Boolean | Show table entries with no values.
String classes = "classes_example"; // String | A comma separated list. Default is all. (other | write | read | create | delete | namespace_read | namespace_write | file_state | session_state).
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
String protocols = "protocols_example"; // String | A comma separated list. Default is all external protocols. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs | all | internal | external)
try {
    SummaryProtocol result = apiInstance.getSummaryProtocol(operations, sort, totalby, zero, classes, timeout, degraded, nodes, protocols);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryProtocol");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **operations** | **String**| Specify operation(s) for which statistics should be reported (See the cli command: &#39;isi statistics list operations&#39;, for a total list). Default is all.  | [optional]
 **sort** | **String**| Sort data by the specified comma-separated field(s). (time | operation_count | operation_rate | in_max | in_min | in | in_avg | in_standard_dev | out_max | out_min | out | out_avg | out_standard_dev | time_max | time_min | time_avg | time_standard_dev | node | protocol | class | operation). Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **totalby** | **String**| A comma separated list specifying what should be unique. (node | protocol | class | operation). Aggregation is performed over all the fields not specified in the list. | [optional]
 **zero** | **Boolean**| Show table entries with no values. | [optional]
 **classes** | **String**| A comma separated list. Default is all. (other | write | read | create | delete | namespace_read | namespace_write | file_state | session_state). | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **protocols** | **String**| A comma separated list. Default is all external protocols. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs | all | internal | external) | [optional]

### Return type

[**SummaryProtocol**](SummaryProtocol.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryProtocolStats"></a>
# **getSummaryProtocolStats**
> SummaryProtocolStats getSummaryProtocolStats(degraded, protocol, nodes, timeout)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String protocol = "protocol_example"; // String | A single protocol. Default is nfs3. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs)
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
try {
    SummaryProtocolStats result = apiInstance.getSummaryProtocolStats(degraded, protocol, nodes, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryProtocolStats");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **protocol** | **String**| A single protocol. Default is nfs3. (nfs3 | smb1 | nlm | ftp | http | siq | smb2 | nfs4 | papi | jobd | irp | lsass_in | lsass_out | hdfs) | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]

### Return type

[**SummaryProtocolStats**](SummaryProtocolStats.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummarySystem"></a>
# **getSummarySystem**
> SummarySystem getSummarySystem(sort, oprates, degraded, nodes, timeout)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (time | node | cpu | smb | ftp | http | nfs | hdfs | total | net_in | net_out | disk_in). Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
Boolean oprates = true; // Boolean | Display protocol operation rate statistics rather than the default throughput statistics.
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
try {
    SummarySystem result = apiInstance.getSummarySystem(sort, oprates, degraded, nodes, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummarySystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort data by the specified comma-separated field(s). (time | node | cpu | smb | ftp | http | nfs | hdfs | total | net_in | net_out | disk_in). Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **oprates** | **Boolean**| Display protocol operation rate statistics rather than the default throughput statistics. | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]

### Return type

[**SummarySystem**](SummarySystem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSummaryWorkload"></a>
# **getSummaryWorkload**
> SummaryWorkload getSummaryWorkload(sort, jobTypes, totalby, timeout, degraded, nodes, systemNames)





### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StatisticsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StatisticsApi apiInstance = new StatisticsApi();
String sort = "sort_example"; // String | Sort data by the specified comma-separated field(s). (node | system_name | job_type | cpu | reads | writes | l2 | l3). Prepend 'asc:' or 'desc:' to a field to change the sort direction. 
List<String> jobTypes = Arrays.asList("jobTypes_example"); // List<String> | A comma separated list. Only report statistics for job(s) specified by type, if configured. 
String totalby = "totalby_example"; // String | A comma separated list specifying what should be unique. (node | system_name | job_type). Aggregation is performed over all the fields not specified in the list.
Integer timeout = 56; // Integer | Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument.
Boolean degraded = true; // Boolean | Continue to report if some nodes do not respond.
String nodes = "nodes_example"; // String | A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local.
String systemNames = "systemNames_example"; // String | A comma separated list. Only report statistics for workloads specified by system names.
try {
    SummaryWorkload result = apiInstance.getSummaryWorkload(sort, jobTypes, totalby, timeout, degraded, nodes, systemNames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StatisticsApi#getSummaryWorkload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Sort data by the specified comma-separated field(s). (node | system_name | job_type | cpu | reads | writes | l2 | l3). Prepend &#39;asc:&#39; or &#39;desc:&#39; to a field to change the sort direction.  | [optional]
 **jobTypes** | [**List&lt;String&gt;**](String.md)| A comma separated list. Only report statistics for job(s) specified by type, if configured.  | [optional]
 **totalby** | **String**| A comma separated list specifying what should be unique. (node | system_name | job_type). Aggregation is performed over all the fields not specified in the list. | [optional]
 **timeout** | **Integer**| Timeout remote commands after NUM seconds, where NUM is the integer passed to the argument. | [optional]
 **degraded** | **Boolean**| Continue to report if some nodes do not respond. | [optional]
 **nodes** | **String**| A comma separated list. Specify node(s) for which statistics should be reported. Default is all. Zero (0) should be passed in as the sole argument to indicate local. | [optional]
 **systemNames** | **String**| A comma separated list. Only report statistics for workloads specified by system names. | [optional]

### Return type

[**SummaryWorkload**](SummaryWorkload.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

