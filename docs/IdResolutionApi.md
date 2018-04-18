# IdResolutionApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getIdResolutionPath**](IdResolutionApi.md#getIdResolutionPath) | **GET** /platform/4/id-resolution/paths/{IdResolutionPathId} | 
[**getIdResolutionPaths**](IdResolutionApi.md#getIdResolutionPaths) | **GET** /platform/4/id-resolution/paths | 


<a name="getIdResolutionPath"></a>
# **getIdResolutionPath**
> IdResolutionPaths getIdResolutionPath(idResolutionPathId)



List lin to path mappings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IdResolutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IdResolutionApi apiInstance = new IdResolutionApi();
Integer idResolutionPathId = 56; // Integer | List lin to path mappings.
try {
    IdResolutionPaths result = apiInstance.getIdResolutionPath(idResolutionPathId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdResolutionApi#getIdResolutionPath");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **idResolutionPathId** | **Integer**| List lin to path mappings. |

### Return type

[**IdResolutionPaths**](IdResolutionPaths.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIdResolutionPaths"></a>
# **getIdResolutionPaths**
> IdResolutionPathsExtended getIdResolutionPaths(sort, lins, limit, dir, resume)



List lin to path mappings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.IdResolutionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

IdResolutionApi apiInstance = new IdResolutionApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String lins = "lins_example"; // String | A comma separated list specifying the lins that will be mapped with a path. Only the lins specified in this list will be mapped.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    IdResolutionPathsExtended result = apiInstance.getIdResolutionPaths(sort, lins, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling IdResolutionApi#getIdResolutionPaths");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **lins** | **String**| A comma separated list specifying the lins that will be mapped with a path. Only the lins specified in this list will be mapped. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**IdResolutionPathsExtended**](IdResolutionPathsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

