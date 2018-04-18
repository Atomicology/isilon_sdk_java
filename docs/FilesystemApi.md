# FilesystemApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSettingsAccessTime**](FilesystemApi.md#getSettingsAccessTime) | **GET** /platform/1/filesystem/settings/access-time | 
[**getSettingsCharacterEncodings**](FilesystemApi.md#getSettingsCharacterEncodings) | **GET** /platform/1/filesystem/settings/character-encodings | 
[**updateSettingsAccessTime**](FilesystemApi.md#updateSettingsAccessTime) | **PUT** /platform/1/filesystem/settings/access-time | 
[**updateSettingsCharacterEncodings**](FilesystemApi.md#updateSettingsCharacterEncodings) | **PUT** /platform/1/filesystem/settings/character-encodings | 


<a name="getSettingsAccessTime"></a>
# **getSettingsAccessTime**
> SettingsAccessTime getSettingsAccessTime()



Retrieve settings for access time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesystemApi apiInstance = new FilesystemApi();
try {
    SettingsAccessTime result = apiInstance.getSettingsAccessTime();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemApi#getSettingsAccessTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsAccessTime**](SettingsAccessTime.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsCharacterEncodings"></a>
# **getSettingsCharacterEncodings**
> SettingsCharacterEncodings getSettingsCharacterEncodings()



Retrieve current cluster character encoding settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesystemApi apiInstance = new FilesystemApi();
try {
    SettingsCharacterEncodings result = apiInstance.getSettingsCharacterEncodings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemApi#getSettingsCharacterEncodings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsCharacterEncodings**](SettingsCharacterEncodings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsAccessTime"></a>
# **updateSettingsAccessTime**
> updateSettingsAccessTime(settingsAccessTime)



Set settings for access time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesystemApi apiInstance = new FilesystemApi();
SettingsAccessTimeExtended settingsAccessTime = new SettingsAccessTimeExtended(); // SettingsAccessTimeExtended | 
try {
    apiInstance.updateSettingsAccessTime(settingsAccessTime);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemApi#updateSettingsAccessTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsAccessTime** | [**SettingsAccessTimeExtended**](SettingsAccessTimeExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsCharacterEncodings"></a>
# **updateSettingsCharacterEncodings**
> updateSettingsCharacterEncodings(settingsCharacterEncodings)



Set current character encoding.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesystemApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilesystemApi apiInstance = new FilesystemApi();
SettingsCharacterEncodingsExtended settingsCharacterEncodings = new SettingsCharacterEncodingsExtended(); // SettingsCharacterEncodingsExtended | 
try {
    apiInstance.updateSettingsCharacterEncodings(settingsCharacterEncodings);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesystemApi#updateSettingsCharacterEncodings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsCharacterEncodings** | [**SettingsCharacterEncodingsExtended**](SettingsCharacterEncodingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

