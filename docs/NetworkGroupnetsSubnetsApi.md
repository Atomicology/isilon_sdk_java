# NetworkGroupnetsSubnetsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPoolsPoolRebalanceIp**](NetworkGroupnetsSubnetsApi.md#createPoolsPoolRebalanceIp) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rebalance-ips | 
[**createPoolsPoolRule**](NetworkGroupnetsSubnetsApi.md#createPoolsPoolRule) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules | 
[**createPoolsPoolScResumeNode**](NetworkGroupnetsSubnetsApi.md#createPoolsPoolScResumeNode) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/sc-resume-nodes | 
[**createPoolsPoolScSuspendNode**](NetworkGroupnetsSubnetsApi.md#createPoolsPoolScSuspendNode) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/sc-suspend-nodes | 
[**deletePoolsPoolRule**](NetworkGroupnetsSubnetsApi.md#deletePoolsPoolRule) | **DELETE** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} | 
[**getPoolsPoolInterfaces**](NetworkGroupnetsSubnetsApi.md#getPoolsPoolInterfaces) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/interfaces | 
[**getPoolsPoolRule**](NetworkGroupnetsSubnetsApi.md#getPoolsPoolRule) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} | 
[**listPoolsPoolRules**](NetworkGroupnetsSubnetsApi.md#listPoolsPoolRules) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules | 
[**updatePoolsPoolRule**](NetworkGroupnetsSubnetsApi.md#updatePoolsPoolRule) | **PUT** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} | 


<a name="createPoolsPoolRebalanceIp"></a>
# **createPoolsPoolRebalanceIp**
> Empty createPoolsPoolRebalanceIp(poolsPoolRebalanceIp, groupnet, subnet, pool)



Rebalance IP addresses in specified pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
Empty poolsPoolRebalanceIp = new Empty(); // Empty | 
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    Empty result = apiInstance.createPoolsPoolRebalanceIp(poolsPoolRebalanceIp, groupnet, subnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#createPoolsPoolRebalanceIp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolRebalanceIp** | [**Empty**](Empty.md)|  |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPoolsPoolRule"></a>
# **createPoolsPoolRule**
> CreateResponse createPoolsPoolRule(poolsPoolRule, groupnet, subnet, pool)



Create a new rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
PoolsPoolRuleCreateParams poolsPoolRule = new PoolsPoolRuleCreateParams(); // PoolsPoolRuleCreateParams | 
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    CreateResponse result = apiInstance.createPoolsPoolRule(poolsPoolRule, groupnet, subnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#createPoolsPoolRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolRule** | [**PoolsPoolRuleCreateParams**](PoolsPoolRuleCreateParams.md)|  |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPoolsPoolScResumeNode"></a>
# **createPoolsPoolScResumeNode**
> Empty createPoolsPoolScResumeNode(poolsPoolScResumeNode, groupnet, subnet, pool)



Resume suspended nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
PoolsPoolScResumeNode poolsPoolScResumeNode = new PoolsPoolScResumeNode(); // PoolsPoolScResumeNode | 
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    Empty result = apiInstance.createPoolsPoolScResumeNode(poolsPoolScResumeNode, groupnet, subnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#createPoolsPoolScResumeNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolScResumeNode** | [**PoolsPoolScResumeNode**](PoolsPoolScResumeNode.md)|  |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createPoolsPoolScSuspendNode"></a>
# **createPoolsPoolScSuspendNode**
> Empty createPoolsPoolScSuspendNode(poolsPoolScSuspendNode, groupnet, subnet, pool)



Suspend nodes.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
PoolsPoolScResumeNode poolsPoolScSuspendNode = new PoolsPoolScResumeNode(); // PoolsPoolScResumeNode | 
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    Empty result = apiInstance.createPoolsPoolScSuspendNode(poolsPoolScSuspendNode, groupnet, subnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#createPoolsPoolScSuspendNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolScSuspendNode** | [**PoolsPoolScResumeNode**](PoolsPoolScResumeNode.md)|  |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePoolsPoolRule"></a>
# **deletePoolsPoolRule**
> deletePoolsPoolRule(poolsPoolRuleId, groupnet, subnet, pool)



Delete a network rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
String poolsPoolRuleId = "poolsPoolRuleId_example"; // String | Delete a network rule.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    apiInstance.deletePoolsPoolRule(poolsPoolRuleId, groupnet, subnet, pool);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#deletePoolsPoolRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolRuleId** | **String**| Delete a network rule. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPoolsPoolInterfaces"></a>
# **getPoolsPoolInterfaces**
> PoolsPoolInterfaces getPoolsPoolInterfaces(groupnet, subnet, pool, sort, resume, limit, dir, lnns)



Get a list of interfaces.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String lnns = "lnns_example"; // String | Get a list of interfaces for the specified lnn.
try {
    PoolsPoolInterfaces result = apiInstance.getPoolsPoolInterfaces(groupnet, subnet, pool, sort, resume, limit, dir, lnns);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#getPoolsPoolInterfaces");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **lnns** | **String**| Get a list of interfaces for the specified lnn. | [optional]

### Return type

[**PoolsPoolInterfaces**](PoolsPoolInterfaces.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPoolsPoolRule"></a>
# **getPoolsPoolRule**
> PoolsPoolRules getPoolsPoolRule(poolsPoolRuleId, groupnet, subnet, pool)



View a single network rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
String poolsPoolRuleId = "poolsPoolRuleId_example"; // String | View a single network rule.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    PoolsPoolRules result = apiInstance.getPoolsPoolRule(poolsPoolRuleId, groupnet, subnet, pool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#getPoolsPoolRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolRuleId** | **String**| View a single network rule. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

[**PoolsPoolRules**](PoolsPoolRules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPoolsPoolRules"></a>
# **listPoolsPoolRules**
> PoolsPoolRulesExtended listPoolsPoolRules(groupnet, subnet, pool, sort, limit, dir, resume)



Get a list of network rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    PoolsPoolRulesExtended result = apiInstance.listPoolsPoolRules(groupnet, subnet, pool, sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#listPoolsPoolRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**PoolsPoolRulesExtended**](PoolsPoolRulesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updatePoolsPoolRule"></a>
# **updatePoolsPoolRule**
> updatePoolsPoolRule(poolsPoolRule, poolsPoolRuleId, groupnet, subnet, pool)



Modify a network rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsSubnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsSubnetsApi apiInstance = new NetworkGroupnetsSubnetsApi();
PoolsPoolRule poolsPoolRule = new PoolsPoolRule(); // PoolsPoolRule | 
String poolsPoolRuleId = "poolsPoolRuleId_example"; // String | Modify a network rule.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String pool = "pool_example"; // String | 
try {
    apiInstance.updatePoolsPoolRule(poolsPoolRule, poolsPoolRuleId, groupnet, subnet, pool);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsSubnetsApi#updatePoolsPoolRule");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **poolsPoolRule** | [**PoolsPoolRule**](PoolsPoolRule.md)|  |
 **poolsPoolRuleId** | **String**| Modify a network rule. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **pool** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

