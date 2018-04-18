# SnapshotApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSnapshotAlias**](SnapshotApi.md#createSnapshotAlias) | **POST** /platform/1/snapshot/aliases | 
[**createSnapshotChangelist**](SnapshotApi.md#createSnapshotChangelist) | **POST** /platform/1/snapshot/changelists | 
[**createSnapshotRepstate**](SnapshotApi.md#createSnapshotRepstate) | **POST** /platform/1/snapshot/repstates | 
[**createSnapshotSchedule**](SnapshotApi.md#createSnapshotSchedule) | **POST** /platform/3/snapshot/schedules | 
[**createSnapshotSnapshot**](SnapshotApi.md#createSnapshotSnapshot) | **POST** /platform/1/snapshot/snapshots | 
[**deleteSnapshotAlias**](SnapshotApi.md#deleteSnapshotAlias) | **DELETE** /platform/1/snapshot/aliases/{SnapshotAliasId} | 
[**deleteSnapshotAliases**](SnapshotApi.md#deleteSnapshotAliases) | **DELETE** /platform/1/snapshot/aliases | 
[**deleteSnapshotChangelist**](SnapshotApi.md#deleteSnapshotChangelist) | **DELETE** /platform/1/snapshot/changelists/{SnapshotChangelistId} | 
[**deleteSnapshotRepstate**](SnapshotApi.md#deleteSnapshotRepstate) | **DELETE** /platform/1/snapshot/repstates/{SnapshotRepstateId} | 
[**deleteSnapshotSchedule**](SnapshotApi.md#deleteSnapshotSchedule) | **DELETE** /platform/3/snapshot/schedules/{SnapshotScheduleId} | 
[**deleteSnapshotSchedules**](SnapshotApi.md#deleteSnapshotSchedules) | **DELETE** /platform/3/snapshot/schedules | 
[**deleteSnapshotSnapshot**](SnapshotApi.md#deleteSnapshotSnapshot) | **DELETE** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} | 
[**deleteSnapshotSnapshots**](SnapshotApi.md#deleteSnapshotSnapshots) | **DELETE** /platform/1/snapshot/snapshots | 
[**getSnapshotAlias**](SnapshotApi.md#getSnapshotAlias) | **GET** /platform/1/snapshot/aliases/{SnapshotAliasId} | 
[**getSnapshotChangelist**](SnapshotApi.md#getSnapshotChangelist) | **GET** /platform/1/snapshot/changelists/{SnapshotChangelistId} | 
[**getSnapshotLicense**](SnapshotApi.md#getSnapshotLicense) | **GET** /platform/5/snapshot/license | 
[**getSnapshotPending**](SnapshotApi.md#getSnapshotPending) | **GET** /platform/1/snapshot/pending | 
[**getSnapshotRepstate**](SnapshotApi.md#getSnapshotRepstate) | **GET** /platform/1/snapshot/repstates/{SnapshotRepstateId} | 
[**getSnapshotSchedule**](SnapshotApi.md#getSnapshotSchedule) | **GET** /platform/3/snapshot/schedules/{SnapshotScheduleId} | 
[**getSnapshotSettings**](SnapshotApi.md#getSnapshotSettings) | **GET** /platform/1/snapshot/settings | 
[**getSnapshotSnapshot**](SnapshotApi.md#getSnapshotSnapshot) | **GET** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} | 
[**getSnapshotSnapshotsSummary**](SnapshotApi.md#getSnapshotSnapshotsSummary) | **GET** /platform/1/snapshot/snapshots-summary | 
[**listSnapshotAliases**](SnapshotApi.md#listSnapshotAliases) | **GET** /platform/1/snapshot/aliases | 
[**listSnapshotChangelists**](SnapshotApi.md#listSnapshotChangelists) | **GET** /platform/1/snapshot/changelists | 
[**listSnapshotRepstates**](SnapshotApi.md#listSnapshotRepstates) | **GET** /platform/1/snapshot/repstates | 
[**listSnapshotSchedules**](SnapshotApi.md#listSnapshotSchedules) | **GET** /platform/3/snapshot/schedules | 
[**listSnapshotSnapshots**](SnapshotApi.md#listSnapshotSnapshots) | **GET** /platform/1/snapshot/snapshots | 
[**updateSnapshotAlias**](SnapshotApi.md#updateSnapshotAlias) | **PUT** /platform/1/snapshot/aliases/{SnapshotAliasId} | 
[**updateSnapshotSchedule**](SnapshotApi.md#updateSnapshotSchedule) | **PUT** /platform/3/snapshot/schedules/{SnapshotScheduleId} | 
[**updateSnapshotSettings**](SnapshotApi.md#updateSnapshotSettings) | **PUT** /platform/1/snapshot/settings | 
[**updateSnapshotSnapshot**](SnapshotApi.md#updateSnapshotSnapshot) | **PUT** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} | 


<a name="createSnapshotAlias"></a>
# **createSnapshotAlias**
> CreateSnapshotAliasResponse createSnapshotAlias(snapshotAlias)



Create a new snapshot alias.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotAliasCreateParams snapshotAlias = new SnapshotAliasCreateParams(); // SnapshotAliasCreateParams | 
try {
    CreateSnapshotAliasResponse result = apiInstance.createSnapshotAlias(snapshotAlias);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshotAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotAlias** | [**SnapshotAliasCreateParams**](SnapshotAliasCreateParams.md)|  |

### Return type

[**CreateSnapshotAliasResponse**](CreateSnapshotAliasResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSnapshotChangelist"></a>
# **createSnapshotChangelist**
> CreateSnapshotChangelistResponse createSnapshotChangelist(snapshotChangelist)



Create a new changelist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotChangelists snapshotChangelist = new SnapshotChangelists(); // SnapshotChangelists | 
try {
    CreateSnapshotChangelistResponse result = apiInstance.createSnapshotChangelist(snapshotChangelist);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshotChangelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotChangelist** | [**SnapshotChangelists**](SnapshotChangelists.md)|  |

### Return type

[**CreateSnapshotChangelistResponse**](CreateSnapshotChangelistResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSnapshotRepstate"></a>
# **createSnapshotRepstate**
> CreateSnapshotRepstateResponse createSnapshotRepstate(snapshotRepstate)



Create a new repstates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotRepstates snapshotRepstate = new SnapshotRepstates(); // SnapshotRepstates | 
try {
    CreateSnapshotRepstateResponse result = apiInstance.createSnapshotRepstate(snapshotRepstate);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshotRepstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotRepstate** | [**SnapshotRepstates**](SnapshotRepstates.md)|  |

### Return type

[**CreateSnapshotRepstateResponse**](CreateSnapshotRepstateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSnapshotSchedule"></a>
# **createSnapshotSchedule**
> CreateSnapshotScheduleResponse createSnapshotSchedule(snapshotSchedule)



Create a new schedule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotScheduleCreateParams snapshotSchedule = new SnapshotScheduleCreateParams(); // SnapshotScheduleCreateParams | 
try {
    CreateSnapshotScheduleResponse result = apiInstance.createSnapshotSchedule(snapshotSchedule);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshotSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSchedule** | [**SnapshotScheduleCreateParams**](SnapshotScheduleCreateParams.md)|  |

### Return type

[**CreateSnapshotScheduleResponse**](CreateSnapshotScheduleResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSnapshotSnapshot"></a>
# **createSnapshotSnapshot**
> SnapshotSnapshotExtended createSnapshotSnapshot(snapshotSnapshot)



Create a new snapshot.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotSnapshotCreateParams snapshotSnapshot = new SnapshotSnapshotCreateParams(); // SnapshotSnapshotCreateParams | 
try {
    SnapshotSnapshotExtended result = apiInstance.createSnapshotSnapshot(snapshotSnapshot);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#createSnapshotSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSnapshot** | [**SnapshotSnapshotCreateParams**](SnapshotSnapshotCreateParams.md)|  |

### Return type

[**SnapshotSnapshotExtended**](SnapshotSnapshotExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotAlias"></a>
# **deleteSnapshotAlias**
> deleteSnapshotAlias(snapshotAliasId)



Delete the snapshot alias

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotAliasId = "snapshotAliasId_example"; // String | Delete the snapshot alias
try {
    apiInstance.deleteSnapshotAlias(snapshotAliasId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotAliasId** | **String**| Delete the snapshot alias |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotAliases"></a>
# **deleteSnapshotAliases**
> deleteSnapshotAliases()



Delete all or matching snapshot aliases.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
try {
    apiInstance.deleteSnapshotAliases();
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotAliases");
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

<a name="deleteSnapshotChangelist"></a>
# **deleteSnapshotChangelist**
> deleteSnapshotChangelist(snapshotChangelistId)



Delete the specified changelist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotChangelistId = "snapshotChangelistId_example"; // String | Delete the specified changelist.
try {
    apiInstance.deleteSnapshotChangelist(snapshotChangelistId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotChangelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotChangelistId** | **String**| Delete the specified changelist. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotRepstate"></a>
# **deleteSnapshotRepstate**
> deleteSnapshotRepstate(snapshotRepstateId)



Delete the specified repstate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotRepstateId = "snapshotRepstateId_example"; // String | Delete the specified repstate.
try {
    apiInstance.deleteSnapshotRepstate(snapshotRepstateId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotRepstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotRepstateId** | **String**| Delete the specified repstate. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotSchedule"></a>
# **deleteSnapshotSchedule**
> deleteSnapshotSchedule(snapshotScheduleId)



Delete the schedule. This does not affect already created snapshots.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotScheduleId = "snapshotScheduleId_example"; // String | Delete the schedule. This does not affect already created snapshots.
try {
    apiInstance.deleteSnapshotSchedule(snapshotScheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotScheduleId** | **String**| Delete the schedule. This does not affect already created snapshots. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotSchedules"></a>
# **deleteSnapshotSchedules**
> deleteSnapshotSchedules()



Delete all snapshot schedules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
try {
    apiInstance.deleteSnapshotSchedules();
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotSchedules");
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

<a name="deleteSnapshotSnapshot"></a>
# **deleteSnapshotSnapshot**
> deleteSnapshotSnapshot(snapshotSnapshotId)



Delete the snapshot. Deleted snapshots will be placed into a deleting state until the system can reclaim the space used by the snapshot.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotSnapshotId = "snapshotSnapshotId_example"; // String | Delete the snapshot. Deleted snapshots will be placed into a deleting state until the system can reclaim the space used by the snapshot.
try {
    apiInstance.deleteSnapshotSnapshot(snapshotSnapshotId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSnapshotId** | **String**| Delete the snapshot. Deleted snapshots will be placed into a deleting state until the system can reclaim the space used by the snapshot. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSnapshotSnapshots"></a>
# **deleteSnapshotSnapshots**
> deleteSnapshotSnapshots(type, schedule)



Delete all or matching snapshots.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String type = "type_example"; // String | Only list snapshots matching this type.
String schedule = "schedule_example"; // String | Only list snapshots created by this schedule.
try {
    apiInstance.deleteSnapshotSnapshots(type, schedule);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#deleteSnapshotSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | **String**| Only list snapshots matching this type. | [optional] [enum: all, alias, real]
 **schedule** | **String**| Only list snapshots created by this schedule. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotAlias"></a>
# **getSnapshotAlias**
> SnapshotAliases getSnapshotAlias(snapshotAliasId)



Retrieve snapshot alias information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotAliasId = "snapshotAliasId_example"; // String | Retrieve snapshot alias information.
try {
    SnapshotAliases result = apiInstance.getSnapshotAlias(snapshotAliasId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotAliasId** | **String**| Retrieve snapshot alias information. |

### Return type

[**SnapshotAliases**](SnapshotAliases.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotChangelist"></a>
# **getSnapshotChangelist**
> SnapshotChangelists getSnapshotChangelist(snapshotChangelistId, limit, resume)



Retrieve basic information on a changelist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotChangelistId = "snapshotChangelistId_example"; // String | Retrieve basic information on a changelist.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotChangelists result = apiInstance.getSnapshotChangelist(snapshotChangelistId, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotChangelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotChangelistId** | **String**| Retrieve basic information on a changelist. |
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotChangelists**](SnapshotChangelists.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotLicense"></a>
# **getSnapshotLicense**
> LicenseLicense getSnapshotLicense()



Retrieve license information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
try {
    LicenseLicense result = apiInstance.getSnapshotLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotLicense");
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

<a name="getSnapshotPending"></a>
# **getSnapshotPending**
> SnapshotPending getSnapshotPending(limit, begin, schedule, end, resume)



Return list of snapshots to be taken.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
Integer limit = 56; // Integer | Return no more than this many result at once (see resume).
Integer begin = 56; // Integer | Unix Epoch time to start generating matches. Default is now.
String schedule = "schedule_example"; // String | Limit output only to the named schedule.
Integer end = 56; // Integer | Unix Epoch time to end generating matches. Default is forever.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotPending result = apiInstance.getSnapshotPending(limit, begin, schedule, end, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotPending");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many result at once (see resume). | [optional]
 **begin** | **Integer**| Unix Epoch time to start generating matches. Default is now. | [optional]
 **schedule** | **String**| Limit output only to the named schedule. | [optional]
 **end** | **Integer**| Unix Epoch time to end generating matches. Default is forever. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotPending**](SnapshotPending.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotRepstate"></a>
# **getSnapshotRepstate**
> SnapshotRepstates getSnapshotRepstate(snapshotRepstateId, limit, resume)



Retrieve basic information on a repstate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotRepstateId = "snapshotRepstateId_example"; // String | Retrieve basic information on a repstate.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotRepstates result = apiInstance.getSnapshotRepstate(snapshotRepstateId, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotRepstate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotRepstateId** | **String**| Retrieve basic information on a repstate. |
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotRepstates**](SnapshotRepstates.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotSchedule"></a>
# **getSnapshotSchedule**
> SnapshotSchedules getSnapshotSchedule(snapshotScheduleId)



Retrieve the schedule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotScheduleId = "snapshotScheduleId_example"; // String | Retrieve the schedule.
try {
    SnapshotSchedules result = apiInstance.getSnapshotSchedule(snapshotScheduleId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotScheduleId** | **String**| Retrieve the schedule. |

### Return type

[**SnapshotSchedules**](SnapshotSchedules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotSettings"></a>
# **getSnapshotSettings**
> SnapshotSettings getSnapshotSettings()



List all settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
try {
    SnapshotSettings result = apiInstance.getSnapshotSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SnapshotSettings**](SnapshotSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotSnapshot"></a>
# **getSnapshotSnapshot**
> SnapshotSnapshots getSnapshotSnapshot(snapshotSnapshotId)



Retrieve snapshot information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String snapshotSnapshotId = "snapshotSnapshotId_example"; // String | Retrieve snapshot information.
try {
    SnapshotSnapshots result = apiInstance.getSnapshotSnapshot(snapshotSnapshotId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSnapshotId** | **String**| Retrieve snapshot information. |

### Return type

[**SnapshotSnapshots**](SnapshotSnapshots.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSnapshotSnapshotsSummary"></a>
# **getSnapshotSnapshotsSummary**
> SnapshotSnapshotsSummary getSnapshotSnapshotsSummary()



Return summary information about snapshots.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
try {
    SnapshotSnapshotsSummary result = apiInstance.getSnapshotSnapshotsSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#getSnapshotSnapshotsSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SnapshotSnapshotsSummary**](SnapshotSnapshotsSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotAliases"></a>
# **listSnapshotAliases**
> SnapshotAliasesExtended listSnapshotAliases(sort, limit, dir, resume)



List all or matching snapshot aliases.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String sort = "sort_example"; // String | The field that will be used for sorting.  Choices are id, name, snapshot, and created.  Default is id.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotAliasesExtended result = apiInstance.listSnapshotAliases(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshotAliases");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting.  Choices are id, name, snapshot, and created.  Default is id. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotAliasesExtended**](SnapshotAliasesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotChangelists"></a>
# **listSnapshotChangelists**
> SnapshotChangelistsExtended listSnapshotChangelists(limit, resume)



List all changelists.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotChangelistsExtended result = apiInstance.listSnapshotChangelists(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshotChangelists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotChangelistsExtended**](SnapshotChangelistsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotRepstates"></a>
# **listSnapshotRepstates**
> SnapshotRepstatesExtended listSnapshotRepstates(limit, resume)



List all repstates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotRepstatesExtended result = apiInstance.listSnapshotRepstates(limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshotRepstates");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotRepstatesExtended**](SnapshotRepstatesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotSchedules"></a>
# **listSnapshotSchedules**
> SnapshotSchedulesExtended listSnapshotSchedules(sort, limit, dir, resume)



List all or matching schedules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String sort = "sort_example"; // String | The field that will be used for sorting.  Choices are id, name, path, pattern, schedule, duration, alias, next_run, and next_snapshot.  Default is id.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    SnapshotSchedulesExtended result = apiInstance.listSnapshotSchedules(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshotSchedules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting.  Choices are id, name, path, pattern, schedule, duration, alias, next_run, and next_snapshot.  Default is id. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**SnapshotSchedulesExtended**](SnapshotSchedulesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSnapshotSnapshots"></a>
# **listSnapshotSnapshots**
> SnapshotSnapshotsExtended listSnapshotSnapshots(sort, schedule, resume, state, limit, type, dir)



List all or matching snapshots.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
String sort = "sort_example"; // String | The field that will be used for sorting.  Choices are id, name, path, created, expires, size, has_locks, schedule, alias_target, alias_target_name, pct_filesystem, pct_reserve, and state.  Default is id.
String schedule = "schedule_example"; // String | Only list snapshots created by this schedule.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String state = "state_example"; // String | Only list snapshots matching this state.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String type = "type_example"; // String | Only list snapshots matching this type.
String dir = "dir_example"; // String | The direction of the sort.
try {
    SnapshotSnapshotsExtended result = apiInstance.listSnapshotSnapshots(sort, schedule, resume, state, limit, type, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#listSnapshotSnapshots");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting.  Choices are id, name, path, created, expires, size, has_locks, schedule, alias_target, alias_target_name, pct_filesystem, pct_reserve, and state.  Default is id. | [optional]
 **schedule** | **String**| Only list snapshots created by this schedule. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **state** | **String**| Only list snapshots matching this state. | [optional] [enum: all, active, deleting]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **type** | **String**| Only list snapshots matching this type. | [optional] [enum: all, alias, real]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**SnapshotSnapshotsExtended**](SnapshotSnapshotsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnapshotAlias"></a>
# **updateSnapshotAlias**
> updateSnapshotAlias(snapshotAlias, snapshotAliasId)



Modify snapshot alias. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotAlias snapshotAlias = new SnapshotAlias(); // SnapshotAlias | 
String snapshotAliasId = "snapshotAliasId_example"; // String | Modify snapshot alias. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateSnapshotAlias(snapshotAlias, snapshotAliasId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#updateSnapshotAlias");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotAlias** | [**SnapshotAlias**](SnapshotAlias.md)|  |
 **snapshotAliasId** | **String**| Modify snapshot alias. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnapshotSchedule"></a>
# **updateSnapshotSchedule**
> updateSnapshotSchedule(snapshotSchedule, snapshotScheduleId)



Modify the schedule. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotSchedule snapshotSchedule = new SnapshotSchedule(); // SnapshotSchedule | 
String snapshotScheduleId = "snapshotScheduleId_example"; // String | Modify the schedule. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateSnapshotSchedule(snapshotSchedule, snapshotScheduleId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#updateSnapshotSchedule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSchedule** | [**SnapshotSchedule**](SnapshotSchedule.md)|  |
 **snapshotScheduleId** | **String**| Modify the schedule. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnapshotSettings"></a>
# **updateSnapshotSettings**
> updateSnapshotSettings(snapshotSettings)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotSettingsExtended snapshotSettings = new SnapshotSettingsExtended(); // SnapshotSettingsExtended | 
try {
    apiInstance.updateSnapshotSettings(snapshotSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#updateSnapshotSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSettings** | [**SnapshotSettingsExtended**](SnapshotSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSnapshotSnapshot"></a>
# **updateSnapshotSnapshot**
> updateSnapshotSnapshot(snapshotSnapshot, snapshotSnapshotId)



Modify snapshot. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotApi apiInstance = new SnapshotApi();
SnapshotSnapshot snapshotSnapshot = new SnapshotSnapshot(); // SnapshotSnapshot | 
String snapshotSnapshotId = "snapshotSnapshotId_example"; // String | Modify snapshot. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateSnapshotSnapshot(snapshotSnapshot, snapshotSnapshotId);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotApi#updateSnapshotSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshotSnapshot** | [**SnapshotSnapshot**](SnapshotSnapshot.md)|  |
 **snapshotSnapshotId** | **String**| Modify snapshot. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

