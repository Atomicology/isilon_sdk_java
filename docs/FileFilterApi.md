# FileFilterApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileFilterSettings**](FileFilterApi.md#getFileFilterSettings) | **GET** /platform/3/file-filter/settings | 
[**updateFileFilterSettings**](FileFilterApi.md#updateFileFilterSettings) | **PUT** /platform/3/file-filter/settings | 


<a name="getFileFilterSettings"></a>
# **getFileFilterSettings**
> FileFilterSettings getFileFilterSettings(zone)



View File Filtering settings of an access zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileFilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FileFilterApi apiInstance = new FileFilterApi();
String zone = "zone_example"; // String | Specifies the access zones in which these settings apply.
try {
    FileFilterSettings result = apiInstance.getFileFilterSettings(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FileFilterApi#getFileFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Specifies the access zones in which these settings apply. | [optional]

### Return type

[**FileFilterSettings**](FileFilterSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFileFilterSettings"></a>
# **updateFileFilterSettings**
> updateFileFilterSettings(fileFilterSettings, zone)



Modify one or more File Filtering settings for an access zone

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FileFilterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FileFilterApi apiInstance = new FileFilterApi();
FileFilterSettingsExtended fileFilterSettings = new FileFilterSettingsExtended(); // FileFilterSettingsExtended | 
String zone = "zone_example"; // String | Specifies the access zones in which these settings apply.
try {
    apiInstance.updateFileFilterSettings(fileFilterSettings, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling FileFilterApi#updateFileFilterSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fileFilterSettings** | [**FileFilterSettingsExtended**](FileFilterSettingsExtended.md)|  |
 **zone** | **String**| Specifies the access zones in which these settings apply. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

