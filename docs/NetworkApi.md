# NetworkApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDnscacheFlushItem**](NetworkApi.md#createDnscacheFlushItem) | **POST** /platform/3/network/dnscache/flush | 
[**createNetworkGroupnet**](NetworkApi.md#createNetworkGroupnet) | **POST** /platform/3/network/groupnets | 
[**createNetworkScRebalanceAllItem**](NetworkApi.md#createNetworkScRebalanceAllItem) | **POST** /platform/3/network/sc-rebalance-all | 
[**deleteNetworkGroupnet**](NetworkApi.md#deleteNetworkGroupnet) | **DELETE** /platform/3/network/groupnets/{NetworkGroupnetId} | 
[**getNetworkDnscache**](NetworkApi.md#getNetworkDnscache) | **GET** /platform/3/network/dnscache | 
[**getNetworkExternal**](NetworkApi.md#getNetworkExternal) | **GET** /platform/3/network/external | 
[**getNetworkGroupnet**](NetworkApi.md#getNetworkGroupnet) | **GET** /platform/3/network/groupnets/{NetworkGroupnetId} | 
[**getNetworkInterfaces**](NetworkApi.md#getNetworkInterfaces) | **GET** /platform/4/network/interfaces | 
[**getNetworkPools**](NetworkApi.md#getNetworkPools) | **GET** /platform/3/network/pools | 
[**getNetworkRules**](NetworkApi.md#getNetworkRules) | **GET** /platform/3/network/rules | 
[**getNetworkSubnets**](NetworkApi.md#getNetworkSubnets) | **GET** /platform/4/network/subnets | 
[**listNetworkGroupnets**](NetworkApi.md#listNetworkGroupnets) | **GET** /platform/3/network/groupnets | 
[**updateNetworkDnscache**](NetworkApi.md#updateNetworkDnscache) | **PUT** /platform/3/network/dnscache | 
[**updateNetworkExternal**](NetworkApi.md#updateNetworkExternal) | **PUT** /platform/3/network/external | 
[**updateNetworkGroupnet**](NetworkApi.md#updateNetworkGroupnet) | **PUT** /platform/3/network/groupnets/{NetworkGroupnetId} | 


<a name="createDnscacheFlushItem"></a>
# **createDnscacheFlushItem**
> Empty createDnscacheFlushItem(dnscacheFlushItem)



Flush the DNSCache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
Empty dnscacheFlushItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createDnscacheFlushItem(dnscacheFlushItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#createDnscacheFlushItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dnscacheFlushItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNetworkGroupnet"></a>
# **createNetworkGroupnet**
> CreateResponse createNetworkGroupnet(networkGroupnet)



Create a new groupnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
NetworkGroupnetCreateParams networkGroupnet = new NetworkGroupnetCreateParams(); // NetworkGroupnetCreateParams | 
try {
    CreateResponse result = apiInstance.createNetworkGroupnet(networkGroupnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#createNetworkGroupnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkGroupnet** | [**NetworkGroupnetCreateParams**](NetworkGroupnetCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNetworkScRebalanceAllItem"></a>
# **createNetworkScRebalanceAllItem**
> Empty createNetworkScRebalanceAllItem(networkScRebalanceAllItem)



Rebalance IP addresses in all pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
Empty networkScRebalanceAllItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createNetworkScRebalanceAllItem(networkScRebalanceAllItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#createNetworkScRebalanceAllItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkScRebalanceAllItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNetworkGroupnet"></a>
# **deleteNetworkGroupnet**
> deleteNetworkGroupnet(networkGroupnetId)



Delete a network groupnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String networkGroupnetId = "networkGroupnetId_example"; // String | Delete a network groupnet.
try {
    apiInstance.deleteNetworkGroupnet(networkGroupnetId);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#deleteNetworkGroupnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkGroupnetId** | **String**| Delete a network groupnet. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkDnscache"></a>
# **getNetworkDnscache**
> NetworkDnscache getNetworkDnscache()



View network dns cache settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
try {
    NetworkDnscache result = apiInstance.getNetworkDnscache();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkDnscache");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NetworkDnscache**](NetworkDnscache.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkExternal"></a>
# **getNetworkExternal**
> NetworkExternal getNetworkExternal()



View external network settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
try {
    NetworkExternal result = apiInstance.getNetworkExternal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkExternal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**NetworkExternal**](NetworkExternal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkGroupnet"></a>
# **getNetworkGroupnet**
> NetworkGroupnets getNetworkGroupnet(networkGroupnetId)



View a network groupnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String networkGroupnetId = "networkGroupnetId_example"; // String | View a network groupnet.
try {
    NetworkGroupnets result = apiInstance.getNetworkGroupnet(networkGroupnetId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkGroupnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkGroupnetId** | **String**| View a network groupnet. |

### Return type

[**NetworkGroupnets**](NetworkGroupnets.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkInterfaces"></a>
# **getNetworkInterfaces**
> PoolsPoolInterfaces getNetworkInterfaces(sort, network, resume, lnns, allocMethod, limit, dir)



Get a list of interfaces.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String network = "network_example"; // String | Show interfaces associated with external and/or internal networks. Default is 'external'
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String lnns = "lnns_example"; // String | Get a list of interfaces for the specified lnn.
String allocMethod = "allocMethod_example"; // String | Filter addresses and owners by pool address allocation method.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    PoolsPoolInterfaces result = apiInstance.getNetworkInterfaces(sort, network, resume, lnns, allocMethod, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **network** | **String**| Show interfaces associated with external and/or internal networks. Default is &#39;external&#39; | [optional] [enum: all, external, internal]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **lnns** | **String**| Get a list of interfaces for the specified lnn. | [optional]
 **allocMethod** | **String**| Filter addresses and owners by pool address allocation method. | [optional] [enum: dynamic, static]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**PoolsPoolInterfaces**](PoolsPoolInterfaces.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkPools"></a>
# **getNetworkPools**
> NetworkPools getNetworkPools(sort, subnet, resume, accessZone, allocMethod, limit, groupnet, dir)



Get a list of flexnet pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String subnet = "subnet_example"; // String | If specified, only pools for this subnet will be returned.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String accessZone = "accessZone_example"; // String | If specified, only pools with this zone name will be returned.
String allocMethod = "allocMethod_example"; // String | If specified, only pools with this allocation type will be returned.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String groupnet = "groupnet_example"; // String | If specified, only pools for this groupnet will be returned.
String dir = "dir_example"; // String | The direction of the sort.
try {
    NetworkPools result = apiInstance.getNetworkPools(sort, subnet, resume, accessZone, allocMethod, limit, groupnet, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **subnet** | **String**| If specified, only pools for this subnet will be returned. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **accessZone** | **String**| If specified, only pools with this zone name will be returned. | [optional]
 **allocMethod** | **String**| If specified, only pools with this allocation type will be returned. | [optional] [enum: static, dynamic]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **groupnet** | **String**| If specified, only pools for this groupnet will be returned. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**NetworkPools**](NetworkPools.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkRules"></a>
# **getNetworkRules**
> PoolsPoolRulesExtended getNetworkRules(sort, subnet, resume, limit, dir, groupnet, pool)



Get a list of network rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String subnet = "subnet_example"; // String | Name of the subnet to list rules from.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String groupnet = "groupnet_example"; // String | Name of the groupnet to list rules from.
String pool = "pool_example"; // String | Name of the pool to list rules from.
try {
    PoolsPoolRulesExtended result = apiInstance.getNetworkRules(sort, subnet, resume, limit, dir, groupnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **subnet** | **String**| Name of the subnet to list rules from. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **groupnet** | **String**| Name of the groupnet to list rules from. | [optional]
 **pool** | **String**| Name of the pool to list rules from. | [optional]

### Return type

[**PoolsPoolRulesExtended**](PoolsPoolRulesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNetworkSubnets"></a>
# **getNetworkSubnets**
> GroupnetSubnetsExtended getNetworkSubnets(sort, groupnet, limit, dir, resume)



Get a list of subnets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String groupnet = "groupnet_example"; // String | If specified, only subnets for this groupnet will be returned.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    GroupnetSubnetsExtended result = apiInstance.getNetworkSubnets(sort, groupnet, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#getNetworkSubnets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **groupnet** | **String**| If specified, only subnets for this groupnet will be returned. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**GroupnetSubnetsExtended**](GroupnetSubnetsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNetworkGroupnets"></a>
# **listNetworkGroupnets**
> NetworkGroupnetsExtended listNetworkGroupnets(sort, limit, dir, resume)



Get a list of groupnets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    NetworkGroupnetsExtended result = apiInstance.listNetworkGroupnets(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#listNetworkGroupnets");
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

[**NetworkGroupnetsExtended**](NetworkGroupnetsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetworkDnscache"></a>
# **updateNetworkDnscache**
> updateNetworkDnscache(networkDnscache)



Modify network dns cache settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
NetworkDnscacheExtended networkDnscache = new NetworkDnscacheExtended(); // NetworkDnscacheExtended | 
try {
    apiInstance.updateNetworkDnscache(networkDnscache);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#updateNetworkDnscache");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkDnscache** | [**NetworkDnscacheExtended**](NetworkDnscacheExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetworkExternal"></a>
# **updateNetworkExternal**
> updateNetworkExternal(networkExternal)



Modify external network settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
NetworkExternalExtended networkExternal = new NetworkExternalExtended(); // NetworkExternalExtended | 
try {
    apiInstance.updateNetworkExternal(networkExternal);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#updateNetworkExternal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkExternal** | [**NetworkExternalExtended**](NetworkExternalExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNetworkGroupnet"></a>
# **updateNetworkGroupnet**
> updateNetworkGroupnet(networkGroupnet, networkGroupnetId)



Modify a network groupnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkApi apiInstance = new NetworkApi();
NetworkGroupnet networkGroupnet = new NetworkGroupnet(); // NetworkGroupnet | 
String networkGroupnetId = "networkGroupnetId_example"; // String | Modify a network groupnet.
try {
    apiInstance.updateNetworkGroupnet(networkGroupnet, networkGroupnetId);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkApi#updateNetworkGroupnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **networkGroupnet** | [**NetworkGroupnet**](NetworkGroupnet.md)|  |
 **networkGroupnetId** | **String**| Modify a network groupnet. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

