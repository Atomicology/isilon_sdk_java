# AuthProvidersApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdsProviderControllers**](AuthProvidersApi.md#getAdsProviderControllers) | **GET** /platform/3/auth/providers/ads/{Id}/controllers | 
[**getAdsProviderDomain**](AuthProvidersApi.md#getAdsProviderDomain) | **GET** /platform/3/auth/providers/ads/{Id}/domains/{AdsProviderDomainId} | 
[**getAdsProviderDomains**](AuthProvidersApi.md#getAdsProviderDomains) | **GET** /platform/3/auth/providers/ads/{Id}/domains | 
[**getAdsProviderSearch**](AuthProvidersApi.md#getAdsProviderSearch) | **GET** /platform/1/auth/providers/ads/{Id}/search | 


<a name="getAdsProviderControllers"></a>
# **getAdsProviderControllers**
> AdsProviderControllers getAdsProviderControllers(id, groupnet)



List all ADS controllers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String id = "id_example"; // String | 
String groupnet = "groupnet_example"; // String | Groupnet identifier
try {
    AdsProviderControllers result = apiInstance.getAdsProviderControllers(id, groupnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getAdsProviderControllers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **groupnet** | **String**| Groupnet identifier | [optional]

### Return type

[**AdsProviderControllers**](AdsProviderControllers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdsProviderDomain"></a>
# **getAdsProviderDomain**
> AdsProviderDomains getAdsProviderDomain(adsProviderDomainId, id)



Retrieve the ADS domain information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String adsProviderDomainId = "adsProviderDomainId_example"; // String | Retrieve the ADS domain information.
String id = "id_example"; // String | 
try {
    AdsProviderDomains result = apiInstance.getAdsProviderDomain(adsProviderDomainId, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getAdsProviderDomain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **adsProviderDomainId** | **String**| Retrieve the ADS domain information. |
 **id** | **String**|  |

### Return type

[**AdsProviderDomains**](AdsProviderDomains.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdsProviderDomains"></a>
# **getAdsProviderDomains**
> AdsProviderDomains getAdsProviderDomains(id, scope)



List all ADS domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String id = "id_example"; // String | 
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    AdsProviderDomains result = apiInstance.getAdsProviderDomains(id, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getAdsProviderDomains");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**AdsProviderDomains**](AdsProviderDomains.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAdsProviderSearch"></a>
# **getAdsProviderSearch**
> AdsProviderSearch getAdsProviderSearch(id, domain, description, resume, searchUsers, filter, limit, user, password, searchGroups)



Retrieve search results.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthProvidersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthProvidersApi apiInstance = new AuthProvidersApi();
String id = "id_example"; // String | 
String domain = "domain_example"; // String | The domain to search in.
String description = "description_example"; // String | The user or group description to search for.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean searchUsers = true; // Boolean | If true, search for users.
String filter = "filter_example"; // String | The LDAP filter to apply to the search.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String user = "user_example"; // String | The user name for the domain if untrusted.
String password = "password_example"; // String | The password for the domain if untrusted.
Boolean searchGroups = true; // Boolean | If true, search for groups.
try {
    AdsProviderSearch result = apiInstance.getAdsProviderSearch(id, domain, description, resume, searchUsers, filter, limit, user, password, searchGroups);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthProvidersApi#getAdsProviderSearch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  |
 **domain** | **String**| The domain to search in. | [optional]
 **description** | **String**| The user or group description to search for. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **searchUsers** | **Boolean**| If true, search for users. | [optional]
 **filter** | **String**| The LDAP filter to apply to the search. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **user** | **String**| The user name for the domain if untrusted. | [optional]
 **password** | **String**| The password for the domain if untrusted. | [optional]
 **searchGroups** | **Boolean**| If true, search for groups. | [optional]

### Return type

[**AdsProviderSearch**](AdsProviderSearch.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

