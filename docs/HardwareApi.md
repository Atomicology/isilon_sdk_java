# HardwareApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHardwareTapeName**](HardwareApi.md#createHardwareTapeName) | **POST** /platform/3/hardware/tape/{HardwareTapeName} | 
[**deleteHardwareTapeName**](HardwareApi.md#deleteHardwareTapeName) | **DELETE** /platform/3/hardware/tape/{HardwareTapeName} | 
[**getHardwareFcport**](HardwareApi.md#getHardwareFcport) | **GET** /platform/3/hardware/fcports/{HardwareFcportId} | 
[**getHardwareFcports**](HardwareApi.md#getHardwareFcports) | **GET** /platform/3/hardware/fcports | 
[**getHardwareTapes**](HardwareApi.md#getHardwareTapes) | **GET** /platform/3/hardware/tapes | 
[**updateHardwareFcport**](HardwareApi.md#updateHardwareFcport) | **PUT** /platform/3/hardware/fcports/{HardwareFcportId} | 
[**updateHardwareTapeName**](HardwareApi.md#updateHardwareTapeName) | **PUT** /platform/3/hardware/tape/{HardwareTapeName} | 


<a name="createHardwareTapeName"></a>
# **createHardwareTapeName**
> CreateHardwareTapeNameResponse createHardwareTapeName(hardwareTapeName, hardwareTapeName2, lnn, port, timeout, reconcile)



Tape/Changer devices rescan

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
Empty hardwareTapeName = new Empty(); // Empty | 
String hardwareTapeName2 = "hardwareTapeName_example"; // String | Tape/Changer devices rescan
String lnn = "lnn_example"; // String | Logical node number.
Integer port = 56; // Integer | Scan only specified port.
BigDecimal timeout = new BigDecimal(); // BigDecimal | Timeout for request.
Boolean reconcile = true; // Boolean | Remove entries for devices or paths that have become inaccessible.
try {
    CreateHardwareTapeNameResponse result = apiInstance.createHardwareTapeName(hardwareTapeName, hardwareTapeName2, lnn, port, timeout, reconcile);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#createHardwareTapeName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareTapeName** | [**Empty**](Empty.md)|  |
 **hardwareTapeName2** | **String**| Tape/Changer devices rescan |
 **lnn** | **String**| Logical node number. | [optional]
 **port** | **Integer**| Scan only specified port. | [optional]
 **timeout** | **BigDecimal**| Timeout for request. | [optional]
 **reconcile** | **Boolean**| Remove entries for devices or paths that have become inaccessible. | [optional]

### Return type

[**CreateHardwareTapeNameResponse**](CreateHardwareTapeNameResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHardwareTapeName"></a>
# **deleteHardwareTapeName**
> deleteHardwareTapeName(hardwareTapeName)



Tape/Changer devices remove

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
String hardwareTapeName = "hardwareTapeName_example"; // String | Tape/Changer devices remove
try {
    apiInstance.deleteHardwareTapeName(hardwareTapeName);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#deleteHardwareTapeName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareTapeName** | **String**| Tape/Changer devices remove |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardwareFcport"></a>
# **getHardwareFcport**
> HardwareFcports getHardwareFcport(hardwareFcportId, lnn)



Get one fibre-channel port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
Integer hardwareFcportId = 56; // Integer | Get one fibre-channel port
String lnn = "lnn_example"; // String | Logical node number.
try {
    HardwareFcports result = apiInstance.getHardwareFcport(hardwareFcportId, lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#getHardwareFcport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareFcportId** | **Integer**| Get one fibre-channel port |
 **lnn** | **String**| Logical node number. | [optional]

### Return type

[**HardwareFcports**](HardwareFcports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardwareFcports"></a>
# **getHardwareFcports**
> HardwareFcports getHardwareFcports(lnn, limit, resume)



Get list of fibre-channel ports

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
String lnn = "lnn_example"; // String | Logical node number.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    HardwareFcports result = apiInstance.getHardwareFcports(lnn, limit, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#getHardwareFcports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **String**| Logical node number. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**HardwareFcports**](HardwareFcports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardwareTapes"></a>
# **getHardwareTapes**
> HardwareTapes getHardwareTapes(node, resume, devname, limit, activepath, type)



Get list Tape and Changer devices

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
String node = "node_example"; // String | List only devices on the specified node.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String devname = "devname_example"; // String | List only the named device.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String activepath = "activepath_example"; // String | List devices with only active paths.
String type = "type_example"; // String | Restrict to list on tape or mc device.
try {
    HardwareTapes result = apiInstance.getHardwareTapes(node, resume, devname, limit, activepath, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#getHardwareTapes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **node** | **String**| List only devices on the specified node. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **devname** | **String**| List only the named device. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **activepath** | **String**| List devices with only active paths. | [optional]
 **type** | **String**| Restrict to list on tape or mc device. | [optional]

### Return type

[**HardwareTapes**](HardwareTapes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHardwareFcport"></a>
# **updateHardwareFcport**
> updateHardwareFcport(hardwareFcport, hardwareFcportId, lnn)



Change wwnn, wwpn, state, topology, or rate of a FC port

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
HardwareFcport hardwareFcport = new HardwareFcport(); // HardwareFcport | 
Integer hardwareFcportId = 56; // Integer | Change wwnn, wwpn, state, topology, or rate of a FC port
String lnn = "lnn_example"; // String | Logical node number.
try {
    apiInstance.updateHardwareFcport(hardwareFcport, hardwareFcportId, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#updateHardwareFcport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareFcport** | [**HardwareFcport**](HardwareFcport.md)|  |
 **hardwareFcportId** | **Integer**| Change wwnn, wwpn, state, topology, or rate of a FC port |
 **lnn** | **String**| Logical node number. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateHardwareTapeName"></a>
# **updateHardwareTapeName**
> updateHardwareTapeName(hardwareTapeNameParams, hardwareTapeName)



Tape/Changer device modify

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.HardwareApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

HardwareApi apiInstance = new HardwareApi();
HardwareTapeNameParams hardwareTapeNameParams = new HardwareTapeNameParams(); // HardwareTapeNameParams | 
String hardwareTapeName = "hardwareTapeName_example"; // String | Tape/Changer device modify
try {
    apiInstance.updateHardwareTapeName(hardwareTapeNameParams, hardwareTapeName);
} catch (ApiException e) {
    System.err.println("Exception when calling HardwareApi#updateHardwareTapeName");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareTapeNameParams** | [**HardwareTapeNameParams**](HardwareTapeNameParams.md)|  |
 **hardwareTapeName** | **String**| Tape/Changer device modify |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

