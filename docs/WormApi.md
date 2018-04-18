# WormApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWormDomain**](WormApi.md#createWormDomain) | **POST** /platform/1/worm/domains | 
[**getWormDomain**](WormApi.md#getWormDomain) | **GET** /platform/1/worm/domains/{WormDomainId} | 
[**getWormSettings**](WormApi.md#getWormSettings) | **GET** /platform/1/worm/settings | 
[**listWormDomains**](WormApi.md#listWormDomains) | **GET** /platform/1/worm/domains | 
[**updateWormDomain**](WormApi.md#updateWormDomain) | **PUT** /platform/1/worm/domains/{WormDomainId} | 
[**updateWormSettings**](WormApi.md#updateWormSettings) | **PUT** /platform/1/worm/settings | 


<a name="createWormDomain"></a>
# **createWormDomain**
> WormDomainExtended createWormDomain(wormDomain)



Create a WORM domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
WormDomainCreateParams wormDomain = new WormDomainCreateParams(); // WormDomainCreateParams | 
try {
    WormDomainExtended result = apiInstance.createWormDomain(wormDomain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#createWormDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wormDomain** | [**WormDomainCreateParams**](WormDomainCreateParams.md)|  |

### Return type

[**WormDomainExtended**](WormDomainExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWormDomain"></a>
# **getWormDomain**
> WormDomains getWormDomain(wormDomainId)



View a single WORM domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
String wormDomainId = "wormDomainId_example"; // String | View a single WORM domain.
try {
    WormDomains result = apiInstance.getWormDomain(wormDomainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#getWormDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wormDomainId** | **String**| View a single WORM domain. |

### Return type

[**WormDomains**](WormDomains.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getWormSettings"></a>
# **getWormSettings**
> WormSettings getWormSettings()



Get the global WORM settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
try {
    WormSettings result = apiInstance.getWormSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#getWormSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**WormSettings**](WormSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listWormDomains"></a>
# **listWormDomains**
> WormDomainsExtended listWormDomains(sort, limit, dir, resume)



List all WORM domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    WormDomainsExtended result = apiInstance.listWormDomains(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#listWormDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**WormDomainsExtended**](WormDomainsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWormDomain"></a>
# **updateWormDomain**
> updateWormDomain(wormDomain, wormDomainId)



Modify a single WORM domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
WormDomain wormDomain = new WormDomain(); // WormDomain | 
String wormDomainId = "wormDomainId_example"; // String | Modify a single WORM domain.
try {
    apiInstance.updateWormDomain(wormDomain, wormDomainId);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#updateWormDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wormDomain** | [**WormDomain**](WormDomain.md)|  |
 **wormDomainId** | **String**| Modify a single WORM domain. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateWormSettings"></a>
# **updateWormSettings**
> updateWormSettings(wormSettings)



Modify the global WORM settings.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.WormApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

WormApi apiInstance = new WormApi();
WormSettingsExtended wormSettings = new WormSettingsExtended(); // WormSettingsExtended | 
try {
    apiInstance.updateWormSettings(wormSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling WormApi#updateWormSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **wormSettings** | [**WormSettingsExtended**](WormSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

