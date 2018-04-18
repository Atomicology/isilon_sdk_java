# StoragepoolApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCompatibilitiesClassActiveItem**](StoragepoolApi.md#createCompatibilitiesClassActiveItem) | **POST** /platform/1/storagepool/compatibilities/class/active | 
[**createCompatibilitiesSsdActiveItem**](StoragepoolApi.md#createCompatibilitiesSsdActiveItem) | **POST** /platform/3/storagepool/compatibilities/ssd/active | 
[**createStoragepoolNodepool**](StoragepoolApi.md#createStoragepoolNodepool) | **POST** /platform/3/storagepool/nodepools | 
[**createStoragepoolTier**](StoragepoolApi.md#createStoragepoolTier) | **POST** /platform/1/storagepool/tiers | 
[**deleteCompatibilitiesClassActiveById**](StoragepoolApi.md#deleteCompatibilitiesClassActiveById) | **DELETE** /platform/1/storagepool/compatibilities/class/active/{CompatibilitiesClassActiveId} | 
[**deleteCompatibilitiesSsdActiveById**](StoragepoolApi.md#deleteCompatibilitiesSsdActiveById) | **DELETE** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} | 
[**deleteStoragepoolNodepool**](StoragepoolApi.md#deleteStoragepoolNodepool) | **DELETE** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} | 
[**deleteStoragepoolNodepools**](StoragepoolApi.md#deleteStoragepoolNodepools) | **DELETE** /platform/3/storagepool/nodepools | 
[**deleteStoragepoolTier**](StoragepoolApi.md#deleteStoragepoolTier) | **DELETE** /platform/1/storagepool/tiers/{StoragepoolTierId} | 
[**deleteStoragepoolTiers**](StoragepoolApi.md#deleteStoragepoolTiers) | **DELETE** /platform/1/storagepool/tiers | 
[**getCompatibilitiesClassActiveById**](StoragepoolApi.md#getCompatibilitiesClassActiveById) | **GET** /platform/1/storagepool/compatibilities/class/active/{CompatibilitiesClassActiveId} | 
[**getCompatibilitiesClassAvailable**](StoragepoolApi.md#getCompatibilitiesClassAvailable) | **GET** /platform/1/storagepool/compatibilities/class/available | 
[**getCompatibilitiesSsdActiveById**](StoragepoolApi.md#getCompatibilitiesSsdActiveById) | **GET** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} | 
[**getCompatibilitiesSsdAvailable**](StoragepoolApi.md#getCompatibilitiesSsdAvailable) | **GET** /platform/1/storagepool/compatibilities/ssd/available | 
[**getStoragepoolNodepool**](StoragepoolApi.md#getStoragepoolNodepool) | **GET** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} | 
[**getStoragepoolSettings**](StoragepoolApi.md#getStoragepoolSettings) | **GET** /platform/5/storagepool/settings | 
[**getStoragepoolStatus**](StoragepoolApi.md#getStoragepoolStatus) | **GET** /platform/1/storagepool/status | 
[**getStoragepoolStoragepools**](StoragepoolApi.md#getStoragepoolStoragepools) | **GET** /platform/3/storagepool/storagepools | 
[**getStoragepoolSuggestedProtectionNid**](StoragepoolApi.md#getStoragepoolSuggestedProtectionNid) | **GET** /platform/3/storagepool/suggested-protection/{StoragepoolSuggestedProtectionNid} | 
[**getStoragepoolTier**](StoragepoolApi.md#getStoragepoolTier) | **GET** /platform/1/storagepool/tiers/{StoragepoolTierId} | 
[**getStoragepoolUnprovisioned**](StoragepoolApi.md#getStoragepoolUnprovisioned) | **GET** /platform/1/storagepool/unprovisioned | 
[**listCompatibilitiesClassActive**](StoragepoolApi.md#listCompatibilitiesClassActive) | **GET** /platform/1/storagepool/compatibilities/class/active | 
[**listCompatibilitiesSsdActive**](StoragepoolApi.md#listCompatibilitiesSsdActive) | **GET** /platform/3/storagepool/compatibilities/ssd/active | 
[**listStoragepoolNodepools**](StoragepoolApi.md#listStoragepoolNodepools) | **GET** /platform/3/storagepool/nodepools | 
[**listStoragepoolTiers**](StoragepoolApi.md#listStoragepoolTiers) | **GET** /platform/1/storagepool/tiers | 
[**updateCompatibilitiesSsdActiveById**](StoragepoolApi.md#updateCompatibilitiesSsdActiveById) | **PUT** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} | 
[**updateStoragepoolNodepool**](StoragepoolApi.md#updateStoragepoolNodepool) | **PUT** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} | 
[**updateStoragepoolSettings**](StoragepoolApi.md#updateStoragepoolSettings) | **PUT** /platform/5/storagepool/settings | 
[**updateStoragepoolTier**](StoragepoolApi.md#updateStoragepoolTier) | **PUT** /platform/1/storagepool/tiers/{StoragepoolTierId} | 


<a name="createCompatibilitiesClassActiveItem"></a>
# **createCompatibilitiesClassActiveItem**
> CreateCompatibilitiesClassActiveItemResponse createCompatibilitiesClassActiveItem(compatibilitiesClassActiveItem, assess)



Create a new compatibility

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
CompatibilitiesClassActiveItem compatibilitiesClassActiveItem = new CompatibilitiesClassActiveItem(); // CompatibilitiesClassActiveItem | 
Boolean assess = true; // Boolean | Do not perform action, only test that it is possible.
try {
    CreateCompatibilitiesClassActiveItemResponse result = apiInstance.createCompatibilitiesClassActiveItem(compatibilitiesClassActiveItem, assess);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#createCompatibilitiesClassActiveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesClassActiveItem** | [**CompatibilitiesClassActiveItem**](CompatibilitiesClassActiveItem.md)|  |
 **assess** | **Boolean**| Do not perform action, only test that it is possible. | [optional]

### Return type

[**CreateCompatibilitiesClassActiveItemResponse**](CreateCompatibilitiesClassActiveItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCompatibilitiesSsdActiveItem"></a>
# **createCompatibilitiesSsdActiveItem**
> CreateCompatibilitiesClassActiveItemResponse createCompatibilitiesSsdActiveItem(compatibilitiesSsdActiveItem, assess)



Create a new ssd compatibility

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
CompatibilitiesSsdActiveItem compatibilitiesSsdActiveItem = new CompatibilitiesSsdActiveItem(); // CompatibilitiesSsdActiveItem | 
Boolean assess = true; // Boolean | Do not perform action, only test that it is possible.
try {
    CreateCompatibilitiesClassActiveItemResponse result = apiInstance.createCompatibilitiesSsdActiveItem(compatibilitiesSsdActiveItem, assess);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#createCompatibilitiesSsdActiveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesSsdActiveItem** | [**CompatibilitiesSsdActiveItem**](CompatibilitiesSsdActiveItem.md)|  |
 **assess** | **Boolean**| Do not perform action, only test that it is possible. | [optional]

### Return type

[**CreateCompatibilitiesClassActiveItemResponse**](CreateCompatibilitiesClassActiveItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStoragepoolNodepool"></a>
# **createStoragepoolNodepool**
> CreateStoragepoolTierResponse createStoragepoolNodepool(storagepoolNodepool)



Create a new node pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
StoragepoolNodepoolCreateParams storagepoolNodepool = new StoragepoolNodepoolCreateParams(); // StoragepoolNodepoolCreateParams | 
try {
    CreateStoragepoolTierResponse result = apiInstance.createStoragepoolNodepool(storagepoolNodepool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#createStoragepoolNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolNodepool** | [**StoragepoolNodepoolCreateParams**](StoragepoolNodepoolCreateParams.md)|  |

### Return type

[**CreateStoragepoolTierResponse**](CreateStoragepoolTierResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createStoragepoolTier"></a>
# **createStoragepoolTier**
> CreateStoragepoolTierResponse createStoragepoolTier(storagepoolTier)



Create a new tier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
StoragepoolTierCreateParams storagepoolTier = new StoragepoolTierCreateParams(); // StoragepoolTierCreateParams | 
try {
    CreateStoragepoolTierResponse result = apiInstance.createStoragepoolTier(storagepoolTier);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#createStoragepoolTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolTier** | [**StoragepoolTierCreateParams**](StoragepoolTierCreateParams.md)|  |

### Return type

[**CreateStoragepoolTierResponse**](CreateStoragepoolTierResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompatibilitiesClassActiveById"></a>
# **deleteCompatibilitiesClassActiveById**
> deleteCompatibilitiesClassActiveById(compatibilitiesClassActiveId, assess)



Delete an active compatibility by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String compatibilitiesClassActiveId = "compatibilitiesClassActiveId_example"; // String | Delete an active compatibility by id
Boolean assess = true; // Boolean | Do not perform action, only test that it is possible.
try {
    apiInstance.deleteCompatibilitiesClassActiveById(compatibilitiesClassActiveId, assess);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteCompatibilitiesClassActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesClassActiveId** | **String**| Delete an active compatibility by id |
 **assess** | **Boolean**| Do not perform action, only test that it is possible. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCompatibilitiesSsdActiveById"></a>
# **deleteCompatibilitiesSsdActiveById**
> deleteCompatibilitiesSsdActiveById(compatibilitiesSsdActiveId, assess)



Delete an active ssd compatibility by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String compatibilitiesSsdActiveId = "compatibilitiesSsdActiveId_example"; // String | Delete an active ssd compatibility by id
Boolean assess = true; // Boolean | Do not perform action, only test that it is possible.
try {
    apiInstance.deleteCompatibilitiesSsdActiveById(compatibilitiesSsdActiveId, assess);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteCompatibilitiesSsdActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesSsdActiveId** | **String**| Delete an active ssd compatibility by id |
 **assess** | **Boolean**| Do not perform action, only test that it is possible. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoragepoolNodepool"></a>
# **deleteStoragepoolNodepool**
> deleteStoragepoolNodepool(storagepoolNodepoolId)



Delete node pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String storagepoolNodepoolId = "storagepoolNodepoolId_example"; // String | Delete node pool.
try {
    apiInstance.deleteStoragepoolNodepool(storagepoolNodepoolId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteStoragepoolNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolNodepoolId** | **String**| Delete node pool. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoragepoolNodepools"></a>
# **deleteStoragepoolNodepools**
> deleteStoragepoolNodepools()



Delete all node pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    apiInstance.deleteStoragepoolNodepools();
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteStoragepoolNodepools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoragepoolTier"></a>
# **deleteStoragepoolTier**
> deleteStoragepoolTier(storagepoolTierId)



Delete tier.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String storagepoolTierId = "storagepoolTierId_example"; // String | Delete tier.
try {
    apiInstance.deleteStoragepoolTier(storagepoolTierId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteStoragepoolTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolTierId** | **String**| Delete tier. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteStoragepoolTiers"></a>
# **deleteStoragepoolTiers**
> deleteStoragepoolTiers()



Delete all tiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    apiInstance.deleteStoragepoolTiers();
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#deleteStoragepoolTiers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompatibilitiesClassActiveById"></a>
# **getCompatibilitiesClassActiveById**
> CompatibilitiesClassActive getCompatibilitiesClassActiveById(compatibilitiesClassActiveId)



Get an active compatibilities by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String compatibilitiesClassActiveId = "compatibilitiesClassActiveId_example"; // String | Get an active compatibilities by id
try {
    CompatibilitiesClassActive result = apiInstance.getCompatibilitiesClassActiveById(compatibilitiesClassActiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getCompatibilitiesClassActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesClassActiveId** | **String**| Get an active compatibilities by id |

### Return type

[**CompatibilitiesClassActive**](CompatibilitiesClassActive.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompatibilitiesClassAvailable"></a>
# **getCompatibilitiesClassAvailable**
> CompatibilitiesClassAvailable getCompatibilitiesClassAvailable()



Get a list of available compatibilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    CompatibilitiesClassAvailable result = apiInstance.getCompatibilitiesClassAvailable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getCompatibilitiesClassAvailable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompatibilitiesClassAvailable**](CompatibilitiesClassAvailable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompatibilitiesSsdActiveById"></a>
# **getCompatibilitiesSsdActiveById**
> CompatibilitiesSsdActive getCompatibilitiesSsdActiveById(compatibilitiesSsdActiveId)



Get a active ssd compatibilities by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String compatibilitiesSsdActiveId = "compatibilitiesSsdActiveId_example"; // String | Get a active ssd compatibilities by id
try {
    CompatibilitiesSsdActive result = apiInstance.getCompatibilitiesSsdActiveById(compatibilitiesSsdActiveId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getCompatibilitiesSsdActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesSsdActiveId** | **String**| Get a active ssd compatibilities by id |

### Return type

[**CompatibilitiesSsdActive**](CompatibilitiesSsdActive.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCompatibilitiesSsdAvailable"></a>
# **getCompatibilitiesSsdAvailable**
> CompatibilitiesSsdAvailable getCompatibilitiesSsdAvailable()



Get a list of available ssd compatibilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    CompatibilitiesSsdAvailable result = apiInstance.getCompatibilitiesSsdAvailable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getCompatibilitiesSsdAvailable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompatibilitiesSsdAvailable**](CompatibilitiesSsdAvailable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolNodepool"></a>
# **getStoragepoolNodepool**
> StoragepoolNodepools getStoragepoolNodepool(storagepoolNodepoolId)



Retrieve node pool information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String storagepoolNodepoolId = "storagepoolNodepoolId_example"; // String | Retrieve node pool information.
try {
    StoragepoolNodepools result = apiInstance.getStoragepoolNodepool(storagepoolNodepoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolNodepoolId** | **String**| Retrieve node pool information. |

### Return type

[**StoragepoolNodepools**](StoragepoolNodepools.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolSettings"></a>
# **getStoragepoolSettings**
> StoragepoolSettings getStoragepoolSettings()



List all storagepool settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    StoragepoolSettings result = apiInstance.getStoragepoolSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StoragepoolSettings**](StoragepoolSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolStatus"></a>
# **getStoragepoolStatus**
> StoragepoolStatus getStoragepoolStatus()



List any health conditions detected.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    StoragepoolStatus result = apiInstance.getStoragepoolStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StoragepoolStatus**](StoragepoolStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolStoragepools"></a>
# **getStoragepoolStoragepools**
> StoragepoolStoragepools getStoragepoolStoragepools(sort, toplevels, dir)



List all storage pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String toplevels = "toplevels_example"; // String | If true, node pools contained within tiers will be filtered out of results.
String dir = "dir_example"; // String | The direction of the sort.
try {
    StoragepoolStoragepools result = apiInstance.getStoragepoolStoragepools(sort, toplevels, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolStoragepools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **toplevels** | **String**| If true, node pools contained within tiers will be filtered out of results. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**StoragepoolStoragepools**](StoragepoolStoragepools.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolSuggestedProtectionNid"></a>
# **getStoragepoolSuggestedProtectionNid**
> StoragepoolSuggestedProtection getStoragepoolSuggestedProtectionNid(storagepoolSuggestedProtectionNid)



Retrieve the suggested protection policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String storagepoolSuggestedProtectionNid = "storagepoolSuggestedProtectionNid_example"; // String | Retrieve the suggested protection policy.
try {
    StoragepoolSuggestedProtection result = apiInstance.getStoragepoolSuggestedProtectionNid(storagepoolSuggestedProtectionNid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolSuggestedProtectionNid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolSuggestedProtectionNid** | **String**| Retrieve the suggested protection policy. |

### Return type

[**StoragepoolSuggestedProtection**](StoragepoolSuggestedProtection.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolTier"></a>
# **getStoragepoolTier**
> StoragepoolTiers getStoragepoolTier(storagepoolTierId)



Retrieve tier information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
String storagepoolTierId = "storagepoolTierId_example"; // String | Retrieve tier information.
try {
    StoragepoolTiers result = apiInstance.getStoragepoolTier(storagepoolTierId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolTierId** | **String**| Retrieve tier information. |

### Return type

[**StoragepoolTiers**](StoragepoolTiers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStoragepoolUnprovisioned"></a>
# **getStoragepoolUnprovisioned**
> StoragepoolUnprovisioned getStoragepoolUnprovisioned()



Get the unprovisioned nodes and drives

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    StoragepoolUnprovisioned result = apiInstance.getStoragepoolUnprovisioned();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#getStoragepoolUnprovisioned");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StoragepoolUnprovisioned**](StoragepoolUnprovisioned.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCompatibilitiesClassActive"></a>
# **listCompatibilitiesClassActive**
> CompatibilitiesClassActiveExtended listCompatibilitiesClassActive()



Get a list of active compatibilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    CompatibilitiesClassActiveExtended result = apiInstance.listCompatibilitiesClassActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#listCompatibilitiesClassActive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompatibilitiesClassActiveExtended**](CompatibilitiesClassActiveExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCompatibilitiesSsdActive"></a>
# **listCompatibilitiesSsdActive**
> CompatibilitiesSsdActiveExtended listCompatibilitiesSsdActive()



Get a list of active ssd compatibilities

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    CompatibilitiesSsdActiveExtended result = apiInstance.listCompatibilitiesSsdActive();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#listCompatibilitiesSsdActive");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CompatibilitiesSsdActiveExtended**](CompatibilitiesSsdActiveExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStoragepoolNodepools"></a>
# **listStoragepoolNodepools**
> StoragepoolNodepoolsExtended listStoragepoolNodepools()



List all node pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    StoragepoolNodepoolsExtended result = apiInstance.listStoragepoolNodepools();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#listStoragepoolNodepools");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StoragepoolNodepoolsExtended**](StoragepoolNodepoolsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listStoragepoolTiers"></a>
# **listStoragepoolTiers**
> StoragepoolTiersExtended listStoragepoolTiers()



List all tiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
try {
    StoragepoolTiersExtended result = apiInstance.listStoragepoolTiers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#listStoragepoolTiers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StoragepoolTiersExtended**](StoragepoolTiersExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCompatibilitiesSsdActiveById"></a>
# **updateCompatibilitiesSsdActiveById**
> updateCompatibilitiesSsdActiveById(compatibilitiesSsdActiveIdParams, compatibilitiesSsdActiveId, assess)



Modify an ssd compatibility by id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
CompatibilitiesSsdActiveIdParams compatibilitiesSsdActiveIdParams = new CompatibilitiesSsdActiveIdParams(); // CompatibilitiesSsdActiveIdParams | 
String compatibilitiesSsdActiveId = "compatibilitiesSsdActiveId_example"; // String | Modify an ssd compatibility by id
Boolean assess = true; // Boolean | Do not perform action, only test that it is possible.
try {
    apiInstance.updateCompatibilitiesSsdActiveById(compatibilitiesSsdActiveIdParams, compatibilitiesSsdActiveId, assess);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#updateCompatibilitiesSsdActiveById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **compatibilitiesSsdActiveIdParams** | [**CompatibilitiesSsdActiveIdParams**](CompatibilitiesSsdActiveIdParams.md)|  |
 **compatibilitiesSsdActiveId** | **String**| Modify an ssd compatibility by id |
 **assess** | **Boolean**| Do not perform action, only test that it is possible. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoragepoolNodepool"></a>
# **updateStoragepoolNodepool**
> updateStoragepoolNodepool(storagepoolNodepool, storagepoolNodepoolId)



Modify node pool. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
StoragepoolNodepool storagepoolNodepool = new StoragepoolNodepool(); // StoragepoolNodepool | 
String storagepoolNodepoolId = "storagepoolNodepoolId_example"; // String | Modify node pool. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateStoragepoolNodepool(storagepoolNodepool, storagepoolNodepoolId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#updateStoragepoolNodepool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolNodepool** | [**StoragepoolNodepool**](StoragepoolNodepool.md)|  |
 **storagepoolNodepoolId** | **String**| Modify node pool. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoragepoolSettings"></a>
# **updateStoragepoolSettings**
> updateStoragepoolSettings(storagepoolSettings)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
StoragepoolSettingsExtended storagepoolSettings = new StoragepoolSettingsExtended(); // StoragepoolSettingsExtended | 
try {
    apiInstance.updateStoragepoolSettings(storagepoolSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#updateStoragepoolSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolSettings** | [**StoragepoolSettingsExtended**](StoragepoolSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateStoragepoolTier"></a>
# **updateStoragepoolTier**
> updateStoragepoolTier(storagepoolTier, storagepoolTierId)



Modify tier. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StoragepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

StoragepoolApi apiInstance = new StoragepoolApi();
StoragepoolTier storagepoolTier = new StoragepoolTier(); // StoragepoolTier | 
String storagepoolTierId = "storagepoolTierId_example"; // String | Modify tier. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateStoragepoolTier(storagepoolTier, storagepoolTierId);
} catch (ApiException e) {
    System.err.println("Exception when calling StoragepoolApi#updateStoragepoolTier");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storagepoolTier** | [**StoragepoolTier**](StoragepoolTier.md)|  |
 **storagepoolTierId** | **String**| Modify tier. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

