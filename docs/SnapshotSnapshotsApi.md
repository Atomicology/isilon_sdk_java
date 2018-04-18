# SnapshotSnapshotsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnapshotLock**](SnapshotSnapshotsApi.md#createSnapshotLock) | **POST** /platform/1/snapshot/snapshots/{Sid}/locks | 
[**deleteSnapshotLock**](SnapshotSnapshotsApi.md#deleteSnapshotLock) | **DELETE** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} | 
[**deleteSnapshotLocks**](SnapshotSnapshotsApi.md#deleteSnapshotLocks) | **DELETE** /platform/1/snapshot/snapshots/{Sid}/locks | 
[**getSnapshotLock**](SnapshotSnapshotsApi.md#getSnapshotLock) | **GET** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} | 
[**listSnapshotLocks**](SnapshotSnapshotsApi.md#listSnapshotLocks) | **GET** /platform/1/snapshot/snapshots/{Sid}/locks | 
[**updateSnapshotLock**](SnapshotSnapshotsApi.md#updateSnapshotLock) | **PUT** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} | 


<a name="createSnapshotLock"></a>
# **createSnapshotLock**
> CreateSnapshotLockResponse createSnapshotLock(snapshotLock, sid)



Create a new lock on this snapshot.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
SnapshotLockCreateParams snapshotLock = new SnapshotLockCreateParams(); // SnapshotLockCreateParams | 
String sid = "sid_example"; // String | 
try {
    CreateSnapshotLockResponse result = apiInstance.createSnapshotLock(snapshotLock, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#createSnapshotLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotLock** | [**SnapshotLockCreateParams**](SnapshotLockCreateParams.md)|  |
 **sid** | **String**|  |

### Return type

[**CreateSnapshotLockResponse**](CreateSnapshotLockResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotLock"></a>
# **deleteSnapshotLock**
> deleteSnapshotLock(snapshotLockId, sid)



Delete the snapshot lock.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
String snapshotLockId = "snapshotLockId_example"; // String | Delete the snapshot lock.
String sid = "sid_example"; // String | 
try {
    apiInstance.deleteSnapshotLock(snapshotLockId, sid);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#deleteSnapshotLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotLockId** | **String**| Delete the snapshot lock. |
 **sid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotLocks"></a>
# **deleteSnapshotLocks**
> deleteSnapshotLocks(sid)



Delete all locks. Will try to drain count of recursively held locks so that the snapshot can be deleted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
String sid = "sid_example"; // String | 
try {
    apiInstance.deleteSnapshotLocks(sid);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#deleteSnapshotLocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotLock"></a>
# **getSnapshotLock**
> SnapshotLocks getSnapshotLock(snapshotLockId, sid)



Retrieve lock information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
String snapshotLockId = "snapshotLockId_example"; // String | Retrieve lock information.
String sid = "sid_example"; // String | 
try {
    SnapshotLocks result = apiInstance.getSnapshotLock(snapshotLockId, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#getSnapshotLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotLockId** | **String**| Retrieve lock information. |
 **sid** | **String**|  |

### Return type

[**SnapshotLocks**](SnapshotLocks.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotLocks"></a>
# **listSnapshotLocks**
> SnapshotLocksExtended listSnapshotLocks(sid, sort, limit, dir, resume)



List all locks.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
String sid = "sid_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.  Choices are id, expires, and comment.  Default is id.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotLocksExtended result = apiInstance.listSnapshotLocks(sid, sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#listSnapshotLocks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sid** | **String**|  |
 **sort** | **String**| The field that will be used for sorting.  Choices are id, expires, and comment.  Default is id. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotLocksExtended**](SnapshotLocksExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnapshotLock"></a>
# **updateSnapshotLock**
> updateSnapshotLock(snapshotLock, snapshotLockId, sid)



Modify lock. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotSnapshotsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotSnapshotsApi apiInstance = new SnapshotSnapshotsApi();
SnapshotLock snapshotLock = new SnapshotLock(); // SnapshotLock | 
String snapshotLockId = "snapshotLockId_example"; // String | Modify lock. All input fields are optional, but one or more must be supplied.
String sid = "sid_example"; // String | 
try {
    apiInstance.updateSnapshotLock(snapshotLock, snapshotLockId, sid);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotSnapshotsApi#updateSnapshotLock");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotLock** | [**SnapshotLock**](SnapshotLock.md)|  |
 **snapshotLockId** | **String**| Modify lock. All input fields are optional, but one or more must be supplied. |
 **sid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

