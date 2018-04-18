# ZonesApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createZone**](ZonesApi.md#createZone) | **POST** /platform/3/zones | 
[**deleteZone**](ZonesApi.md#deleteZone) | **DELETE** /platform/3/zones/{ZoneId} | 
[**getZone**](ZonesApi.md#getZone) | **GET** /platform/3/zones/{ZoneId} | 
[**listZones**](ZonesApi.md#listZones) | **GET** /platform/3/zones | 
[**updateZone**](ZonesApi.md#updateZone) | **PUT** /platform/3/zones/{ZoneId} | 


<a name="createZone"></a>
# **createZone**
> CreateResponse createZone(zone)



Create a new access zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
ZoneCreateParams zone = new ZoneCreateParams(); // ZoneCreateParams | 
try {
    CreateResponse result = apiInstance.createZone(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#createZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | [**ZoneCreateParams**](ZoneCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteZone"></a>
# **deleteZone**
> deleteZone(zoneId)



Delete the access zone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
Integer zoneId = 56; // Integer | Delete the access zone.
try {
    apiInstance.deleteZone(zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#deleteZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Delete the access zone. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getZone"></a>
# **getZone**
> Zones getZone(zoneId)



Retrieve the access zone information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
Integer zoneId = 56; // Integer | Retrieve the access zone information.
try {
    Zones result = apiInstance.getZone(zoneId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#getZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zoneId** | **Integer**| Retrieve the access zone information. |

### Return type

[**Zones**](Zones.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listZones"></a>
# **listZones**
> ZonesExtended listZones()



List all access zones.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
try {
    ZonesExtended result = apiInstance.listZones();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#listZones");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ZonesExtended**](ZonesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateZone"></a>
# **updateZone**
> updateZone(zone, zoneId)



Modify the access zone. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesApi apiInstance = new ZonesApi();
Zone zone = new Zone(); // Zone | 
Integer zoneId = 56; // Integer | Modify the access zone. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateZone(zone, zoneId);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesApi#updateZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | [**Zone**](Zone.md)|  |
 **zoneId** | **Integer**| Modify the access zone. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

