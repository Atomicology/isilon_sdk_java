# ZonesSummaryApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getZonesSummary**](ZonesSummaryApi.md#getZonesSummary) | **GET** /platform/1/zones-summary | 
[**getZonesSummaryZone**](ZonesSummaryApi.md#getZonesSummaryZone) | **GET** /platform/1/zones-summary/{ZonesSummaryZone} | 


<a name="getZonesSummary"></a>
# **getZonesSummary**
> ZonesSummaryExtended getZonesSummary(groupnet)



Retrieve access zone summary information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesSummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesSummaryApi apiInstance = new ZonesSummaryApi();
String groupnet = "groupnet_example"; // String | Name of groupnet in which to list zones.
try {
    ZonesSummaryExtended result = apiInstance.getZonesSummary(groupnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesSummaryApi#getZonesSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**| Name of groupnet in which to list zones. | [optional]

### Return type

[**ZonesSummaryExtended**](ZonesSummaryExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getZonesSummaryZone"></a>
# **getZonesSummaryZone**
> ZonesSummary getZonesSummaryZone(zonesSummaryZone)



Retrieve non-privileged access zone information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ZonesSummaryApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ZonesSummaryApi apiInstance = new ZonesSummaryApi();
Integer zonesSummaryZone = 56; // Integer | Retrieve non-privileged access zone information.
try {
    ZonesSummary result = apiInstance.getZonesSummaryZone(zonesSummaryZone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ZonesSummaryApi#getZonesSummaryZone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zonesSummaryZone** | **Integer**| Retrieve non-privileged access zone information. |

### Return type

[**ZonesSummary**](ZonesSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

