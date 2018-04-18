# LocalApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getClusterTime**](LocalApi.md#getClusterTime) | **GET** /platform/3/local/cluster/time | 


<a name="getClusterTime"></a>
# **getClusterTime**
> ClusterTimeExtendedExtended getClusterTime()



Get the current time on the local node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LocalApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LocalApi apiInstance = new LocalApi();
try {
    ClusterTimeExtendedExtended result = apiInstance.getClusterTime();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LocalApi#getClusterTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterTimeExtendedExtended**](ClusterTimeExtendedExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

