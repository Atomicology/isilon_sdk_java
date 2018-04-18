# HardeningApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHardeningApplyItem**](HardeningApi.md#createHardeningApplyItem) | **POST** /platform/3/hardening/apply | 
[**createHardeningResolveItem**](HardeningApi.md#createHardeningResolveItem) | **POST** /platform/3/hardening/resolve | 
[**createHardeningRevertItem**](HardeningApi.md#createHardeningRevertItem) | **POST** /platform/3/hardening/revert | 
[**getHardeningState**](HardeningApi.md#getHardeningState) | **GET** /platform/3/hardening/state | 
[**getHardeningStatus**](HardeningApi.md#getHardeningStatus) | **GET** /platform/3/hardening/status | 


<a name="createHardeningApplyItem"></a>
# **createHardeningApplyItem**
> CreateHardeningApplyItemResponse createHardeningApplyItem(hardeningApplyItem)



Apply hardening on the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardeningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardeningApi apiInstance = new HardeningApi();
HardeningApplyItem hardeningApplyItem = new HardeningApplyItem(); // HardeningApplyItem | 
try {
    CreateHardeningApplyItemResponse result = apiInstance.createHardeningApplyItem(hardeningApplyItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardeningApi#createHardeningApplyItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardeningApplyItem** | [**HardeningApplyItem**](HardeningApplyItem.md)|  |

### Return type

[**CreateHardeningApplyItemResponse**](CreateHardeningApplyItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHardeningResolveItem"></a>
# **createHardeningResolveItem**
> CreateHardeningResolveItemResponse createHardeningResolveItem(hardeningResolveItem, accept)



Resolve issues related to hardening, found in current cluster configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardeningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardeningApi apiInstance = new HardeningApi();
HardeningResolveItem hardeningResolveItem = new HardeningResolveItem(); // HardeningResolveItem | 
Boolean accept = true; // Boolean | If true, execution proceeds to resolve all issues. If false, executrion aborts. This is a required argument.
try {
    CreateHardeningResolveItemResponse result = apiInstance.createHardeningResolveItem(hardeningResolveItem, accept);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardeningApi#createHardeningResolveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardeningResolveItem** | [**HardeningResolveItem**](HardeningResolveItem.md)|  |
 **accept** | **Boolean**| If true, execution proceeds to resolve all issues. If false, executrion aborts. This is a required argument. | [optional]

### Return type

[**CreateHardeningResolveItemResponse**](CreateHardeningResolveItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHardeningRevertItem"></a>
# **createHardeningRevertItem**
> CreateHardeningRevertItemResponse createHardeningRevertItem(hardeningRevertItem, force)



Revert hardening on the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardeningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardeningApi apiInstance = new HardeningApi();
Empty hardeningRevertItem = new Empty(); // Empty | 
Boolean force = true; // Boolean | If specified, revert operation continues even in case of a failure. Default is false in which case revert stops at the first failure.
try {
    CreateHardeningRevertItemResponse result = apiInstance.createHardeningRevertItem(hardeningRevertItem, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardeningApi#createHardeningRevertItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardeningRevertItem** | [**Empty**](Empty.md)|  |
 **force** | **Boolean**| If specified, revert operation continues even in case of a failure. Default is false in which case revert stops at the first failure. | [optional]

### Return type

[**CreateHardeningRevertItemResponse**](CreateHardeningRevertItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardeningState"></a>
# **getHardeningState**
> HardeningState getHardeningState()



Get the state of the current hardening operation, if one is happening.  Note that this is different from the /status resource, which returns the overall hardening status of the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardeningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardeningApi apiInstance = new HardeningApi();
try {
    HardeningState result = apiInstance.getHardeningState();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardeningApi#getHardeningState");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HardeningState**](HardeningState.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardeningStatus"></a>
# **getHardeningStatus**
> HardeningStatus getHardeningStatus()



Get a message indicating whether or not the cluster is hardened. Note that this is different from the /state resource, which returns the state of a specific hardening operation (apply or revert).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardeningApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardeningApi apiInstance = new HardeningApi();
try {
    HardeningStatus result = apiInstance.getHardeningStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardeningApi#getHardeningStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HardeningStatus**](HardeningStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

