# ProtocolsHdfsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createProxyusersNameMember**](ProtocolsHdfsApi.md#createProxyusersNameMember) | **POST** /platform/1/protocols/hdfs/proxyusers/{Name}/members | 
[**deleteProxyusersNameMember**](ProtocolsHdfsApi.md#deleteProxyusersNameMember) | **DELETE** /platform/1/protocols/hdfs/proxyusers/{Name}/members/{ProxyusersNameMemberId} | 
[**listProxyusersNameMembers**](ProtocolsHdfsApi.md#listProxyusersNameMembers) | **GET** /platform/1/protocols/hdfs/proxyusers/{Name}/members | 
[**updateProxyusersNameMember**](ProtocolsHdfsApi.md#updateProxyusersNameMember) | **PUT** /platform/1/protocols/hdfs/proxyusers/{Name}/members/{ProxyusersNameMemberId} | 


<a name="createProxyusersNameMember"></a>
# **createProxyusersNameMember**
> CreateResponse createProxyusersNameMember(proxyusersNameMember, name, zone)



Add a member to the HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsHdfsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsHdfsApi apiInstance = new ProtocolsHdfsApi();
AuthAccessAccessItemFileGroup proxyusersNameMember = new AuthAccessAccessItemFileGroup(); // AuthAccessAccessItemFileGroup | 
String name = "name_example"; // String | 
String zone = "zone_example"; // String | Specifies which access zone or zones to use.
try {
    CreateResponse result = apiInstance.createProxyusersNameMember(proxyusersNameMember, name, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsHdfsApi#createProxyusersNameMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyusersNameMember** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md)|  |
 **name** | **String**|  |
 **zone** | **String**| Specifies which access zone or zones to use. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProxyusersNameMember"></a>
# **deleteProxyusersNameMember**
> deleteProxyusersNameMember(proxyusersNameMemberId, name, zone)



Remove a member from the HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsHdfsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsHdfsApi apiInstance = new ProtocolsHdfsApi();
String proxyusersNameMemberId = "proxyusersNameMemberId_example"; // String | Remove a member from the HDFS proxyuser.
String name = "name_example"; // String | 
String zone = "zone_example"; // String | Specifies which access zone or zones to use.
try {
    apiInstance.deleteProxyusersNameMember(proxyusersNameMemberId, name, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsHdfsApi#deleteProxyusersNameMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyusersNameMemberId** | **String**| Remove a member from the HDFS proxyuser. |
 **name** | **String**|  |
 **zone** | **String**| Specifies which access zone or zones to use. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProxyusersNameMembers"></a>
# **listProxyusersNameMembers**
> GroupMembers listProxyusersNameMembers(name, zone)



List all the members of the HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsHdfsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsHdfsApi apiInstance = new ProtocolsHdfsApi();
String name = "name_example"; // String | 
String zone = "zone_example"; // String | Specifies which access zone or zones to use.
try {
    GroupMembers result = apiInstance.listProxyusersNameMembers(name, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsHdfsApi#listProxyusersNameMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**|  |
 **zone** | **String**| Specifies which access zone or zones to use. | [optional]

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProxyusersNameMember"></a>
# **updateProxyusersNameMember**
> updateProxyusersNameMember(proxyusersNameMember, proxyusersNameMemberId, name, zone)



Create a new HDFS proxyuser.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProtocolsHdfsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ProtocolsHdfsApi apiInstance = new ProtocolsHdfsApi();
Empty proxyusersNameMember = new Empty(); // Empty | 
String proxyusersNameMemberId = "proxyusersNameMemberId_example"; // String | Create a new HDFS proxyuser.
String name = "name_example"; // String | 
String zone = "zone_example"; // String | Specifies which access zone or zones to use.
try {
    apiInstance.updateProxyusersNameMember(proxyusersNameMember, proxyusersNameMemberId, name, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtocolsHdfsApi#updateProxyusersNameMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **proxyusersNameMember** | [**Empty**](Empty.md)|  |
 **proxyusersNameMemberId** | **String**| Create a new HDFS proxyuser. |
 **name** | **String**|  |
 **zone** | **String**| Specifies which access zone or zones to use. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

