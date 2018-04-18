# SnapshotChangelistsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChangelistLin**](SnapshotChangelistsApi.md#getChangelistLin) | **GET** /platform/1/snapshot/changelists/{Changelist}/lins/{ChangelistLinId} | 
[**getChangelistLins**](SnapshotChangelistsApi.md#getChangelistLins) | **GET** /platform/1/snapshot/changelists/{Changelist}/lins | 


<a name="getChangelistLin"></a>
# **getChangelistLin**
> ChangelistLins getChangelistLin(changelistLinId, changelist, limit, resume)



Get a single entry from the changelist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotChangelistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotChangelistsApi apiInstance = new SnapshotChangelistsApi();
Integer changelistLinId = 56; // Integer | Get a single entry from the changelist.
String changelist = "changelist_example"; // String | 
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    ChangelistLins result = apiInstance.getChangelistLin(changelistLinId, changelist, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotChangelistsApi#getChangelistLin");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changelistLinId** | **Integer**| Get a single entry from the changelist. |
 **changelist** | **String**|  |
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**ChangelistLins**](ChangelistLins.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getChangelistLins"></a>
# **getChangelistLins**
> ChangelistLinsExtended getChangelistLins(changelist, limit, resume)



Get entries from a changelist.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SnapshotChangelistsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SnapshotChangelistsApi apiInstance = new SnapshotChangelistsApi();
String changelist = "changelist_example"; // String | 
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    ChangelistLinsExtended result = apiInstance.getChangelistLins(changelist, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SnapshotChangelistsApi#getChangelistLins");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **changelist** | **String**|  |
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**ChangelistLinsExtended**](ChangelistLinsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

