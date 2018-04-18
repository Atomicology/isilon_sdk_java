# FsaApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteFsaResult**](FsaApi.md#deleteFsaResult) | **DELETE** /platform/3/fsa/results/{FsaResultId} | 
[**deleteFsaSettings**](FsaApi.md#deleteFsaSettings) | **DELETE** /platform/1/fsa/settings | 
[**getFsaResult**](FsaApi.md#getFsaResult) | **GET** /platform/3/fsa/results/{FsaResultId} | 
[**getFsaResults**](FsaApi.md#getFsaResults) | **GET** /platform/3/fsa/results | 
[**getFsaSettings**](FsaApi.md#getFsaSettings) | **GET** /platform/1/fsa/settings | 
[**updateFsaResult**](FsaApi.md#updateFsaResult) | **PUT** /platform/3/fsa/results/{FsaResultId} | 
[**updateFsaSettings**](FsaApi.md#updateFsaSettings) | **PUT** /platform/1/fsa/settings | 


<a name="deleteFsaResult"></a>
# **deleteFsaResult**
> deleteFsaResult(fsaResultId)



Delete the result set.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
String fsaResultId = "fsaResultId_example"; // String | Delete the result set.
try {
    apiInstance.deleteFsaResult(fsaResultId);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#deleteFsaResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsaResultId** | **String**| Delete the result set. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFsaSettings"></a>
# **deleteFsaSettings**
> deleteFsaSettings()



Revert all settings to their defaults.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
try {
    apiInstance.deleteFsaSettings();
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#deleteFsaSettings");
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

<a name="getFsaResult"></a>
# **getFsaResult**
> FsaResults getFsaResult(fsaResultId)



Retrieve result set information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
String fsaResultId = "fsaResultId_example"; // String | Retrieve result set information.
try {
    FsaResults result = apiInstance.getFsaResult(fsaResultId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#getFsaResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsaResultId** | **String**| Retrieve result set information. |

### Return type

[**FsaResults**](FsaResults.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFsaResults"></a>
# **getFsaResults**
> FsaResultsExtended getFsaResults()



List all results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
try {
    FsaResultsExtended result = apiInstance.getFsaResults();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#getFsaResults");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FsaResultsExtended**](FsaResultsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFsaSettings"></a>
# **getFsaSettings**
> FsaSettings getFsaSettings(scope)



List all settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
String scope = "scope_example"; // String | If specified as effective or not specified, all fields are returned.  If specified as user, only fields with non-default values are shown.  If specified as default, the original values are returned.
try {
    FsaSettings result = apiInstance.getFsaSettings(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#getFsaSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as effective or not specified, all fields are returned.  If specified as user, only fields with non-default values are shown.  If specified as default, the original values are returned. | [optional] [enum: effective, user, default]

### Return type

[**FsaSettings**](FsaSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFsaResult"></a>
# **updateFsaResult**
> updateFsaResult(fsaResult, fsaResultId)



Modify result set. Only the pinned property can be changed at this time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
FsaResult fsaResult = new FsaResult(); // FsaResult | 
String fsaResultId = "fsaResultId_example"; // String | Modify result set. Only the pinned property can be changed at this time.
try {
    apiInstance.updateFsaResult(fsaResult, fsaResultId);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#updateFsaResult");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsaResult** | [**FsaResult**](FsaResult.md)|  |
 **fsaResultId** | **String**| Modify result set. Only the pinned property can be changed at this time. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFsaSettings"></a>
# **updateFsaSettings**
> updateFsaSettings(fsaSettings)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FsaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FsaApi apiInstance = new FsaApi();
FsaSettingsSettings fsaSettings = new FsaSettingsSettings(); // FsaSettingsSettings | 
try {
    apiInstance.updateFsaSettings(fsaSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling FsaApi#updateFsaSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fsaSettings** | [**FsaSettingsSettings**](FsaSettingsSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

