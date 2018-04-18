# RemotesupportApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRemotesupportConnectemc**](RemotesupportApi.md#getRemotesupportConnectemc) | **GET** /platform/1/remotesupport/connectemc | 
[**updateRemotesupportConnectemc**](RemotesupportApi.md#updateRemotesupportConnectemc) | **PUT** /platform/1/remotesupport/connectemc | 


<a name="getRemotesupportConnectemc"></a>
# **getRemotesupportConnectemc**
> RemotesupportConnectemc getRemotesupportConnectemc()



List all settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RemotesupportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RemotesupportApi apiInstance = new RemotesupportApi();
try {
    RemotesupportConnectemc result = apiInstance.getRemotesupportConnectemc();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling RemotesupportApi#getRemotesupportConnectemc");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RemotesupportConnectemc**](RemotesupportConnectemc.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRemotesupportConnectemc"></a>
# **updateRemotesupportConnectemc**
> updateRemotesupportConnectemc(remotesupportConnectemc)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.RemotesupportApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

RemotesupportApi apiInstance = new RemotesupportApi();
RemotesupportConnectemcConnectemc remotesupportConnectemc = new RemotesupportConnectemcConnectemc(); // RemotesupportConnectemcConnectemc | 
try {
    apiInstance.updateRemotesupportConnectemc(remotesupportConnectemc);
} catch (ApiException e) {
    System.err.println("Exception when calling RemotesupportApi#updateRemotesupportConnectemc");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **remotesupportConnectemc** | [**RemotesupportConnectemcConnectemc**](RemotesupportConnectemcConnectemc.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

