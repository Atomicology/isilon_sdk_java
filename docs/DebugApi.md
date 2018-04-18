# DebugApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteDebugStats**](DebugApi.md#deleteDebugStats) | **DELETE** /platform/1/debug/stats | 
[**getDebugStats**](DebugApi.md#getDebugStats) | **GET** /platform/1/debug/stats | 


<a name="deleteDebugStats"></a>
# **deleteDebugStats**
> deleteDebugStats()



Clear per-resource statistics counters.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebugApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DebugApi apiInstance = new DebugApi();
try {
    apiInstance.deleteDebugStats();
} catch (ApiException e) {
    System.err.println("Exception when calling DebugApi#deleteDebugStats");
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

<a name="getDebugStats"></a>
# **getDebugStats**
> DebugStats getDebugStats()



List cumulative call statistics for each resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.DebugApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

DebugApi apiInstance = new DebugApi();
try {
    DebugStats result = apiInstance.getDebugStats();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DebugApi#getDebugStats");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DebugStats**](DebugStats.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

