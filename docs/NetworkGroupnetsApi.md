# NetworkGroupnetsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupnetSubnet**](NetworkGroupnetsApi.md#createGroupnetSubnet) | **POST** /platform/4/network/groupnets/{Groupnet}/subnets | 
[**createSubnetsSubnetPool**](NetworkGroupnetsApi.md#createSubnetsSubnetPool) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools | 
[**deleteGroupnetSubnet**](NetworkGroupnetsApi.md#deleteGroupnetSubnet) | **DELETE** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} | 
[**deleteSubnetsSubnetPool**](NetworkGroupnetsApi.md#deleteSubnetsSubnetPool) | **DELETE** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} | 
[**getGroupnetSubnet**](NetworkGroupnetsApi.md#getGroupnetSubnet) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} | 
[**getSubnetsSubnetPool**](NetworkGroupnetsApi.md#getSubnetsSubnetPool) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} | 
[**listGroupnetSubnets**](NetworkGroupnetsApi.md#listGroupnetSubnets) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets | 
[**listSubnetsSubnetPools**](NetworkGroupnetsApi.md#listSubnetsSubnetPools) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools | 
[**updateGroupnetSubnet**](NetworkGroupnetsApi.md#updateGroupnetSubnet) | **PUT** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} | 
[**updateSubnetsSubnetPool**](NetworkGroupnetsApi.md#updateSubnetsSubnetPool) | **PUT** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} | 


<a name="createGroupnetSubnet"></a>
# **createGroupnetSubnet**
> CreateResponse createGroupnetSubnet(groupnetSubnet, groupnet)



Create a new subnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
GroupnetSubnetCreateParams groupnetSubnet = new GroupnetSubnetCreateParams(); // GroupnetSubnetCreateParams | 
String groupnet = "groupnet_example"; // String | 
try {
    CreateResponse result = apiInstance.createGroupnetSubnet(groupnetSubnet, groupnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#createGroupnetSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnetSubnet** | [**GroupnetSubnetCreateParams**](GroupnetSubnetCreateParams.md)|  |
 **groupnet** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSubnetsSubnetPool"></a>
# **createSubnetsSubnetPool**
> CreateResponse createSubnetsSubnetPool(subnetsSubnetPool, groupnet, subnet, force)



Create a new pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
SubnetsSubnetPoolCreateParams subnetsSubnetPool = new SubnetsSubnetPoolCreateParams(); // SubnetsSubnetPoolCreateParams | 
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
Boolean force = true; // Boolean | Force creating this pool even if it causes an MTU conflict.
try {
    CreateResponse result = apiInstance.createSubnetsSubnetPool(subnetsSubnetPool, groupnet, subnet, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#createSubnetsSubnetPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetsSubnetPool** | [**SubnetsSubnetPoolCreateParams**](SubnetsSubnetPoolCreateParams.md)|  |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **force** | **Boolean**| Force creating this pool even if it causes an MTU conflict. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupnetSubnet"></a>
# **deleteGroupnetSubnet**
> deleteGroupnetSubnet(groupnetSubnetId, groupnet, force)



Delete a network subnet..

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String groupnetSubnetId = "groupnetSubnetId_example"; // String | Delete a network subnet..
String groupnet = "groupnet_example"; // String | 
Boolean force = true; // Boolean | force deleting this subnet even if pools in other subnets rely on this subnet's SC VIP.
try {
    apiInstance.deleteGroupnetSubnet(groupnetSubnetId, groupnet, force);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#deleteGroupnetSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnetSubnetId** | **String**| Delete a network subnet.. |
 **groupnet** | **String**|  |
 **force** | **Boolean**| force deleting this subnet even if pools in other subnets rely on this subnet&#39;s SC VIP. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSubnetsSubnetPool"></a>
# **deleteSubnetsSubnetPool**
> deleteSubnetsSubnetPool(subnetsSubnetPoolId, groupnet, subnet)



Delete a network pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String subnetsSubnetPoolId = "subnetsSubnetPoolId_example"; // String | Delete a network pool.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
try {
    apiInstance.deleteSubnetsSubnetPool(subnetsSubnetPoolId, groupnet, subnet);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#deleteSubnetsSubnetPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetsSubnetPoolId** | **String**| Delete a network pool. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getGroupnetSubnet"></a>
# **getGroupnetSubnet**
> GroupnetSubnets getGroupnetSubnet(groupnetSubnetId, groupnet)



View a network subnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String groupnetSubnetId = "groupnetSubnetId_example"; // String | View a network subnet.
String groupnet = "groupnet_example"; // String | 
try {
    GroupnetSubnets result = apiInstance.getGroupnetSubnet(groupnetSubnetId, groupnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#getGroupnetSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnetSubnetId** | **String**| View a network subnet. |
 **groupnet** | **String**|  |

### Return type

[**GroupnetSubnets**](GroupnetSubnets.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSubnetsSubnetPool"></a>
# **getSubnetsSubnetPool**
> SubnetsSubnetPools getSubnetsSubnetPool(subnetsSubnetPoolId, groupnet, subnet)



View a single network pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String subnetsSubnetPoolId = "subnetsSubnetPoolId_example"; // String | View a single network pool.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
try {
    SubnetsSubnetPools result = apiInstance.getSubnetsSubnetPool(subnetsSubnetPoolId, groupnet, subnet);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#getSubnetsSubnetPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetsSubnetPoolId** | **String**| View a single network pool. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |

### Return type

[**SubnetsSubnetPools**](SubnetsSubnetPools.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listGroupnetSubnets"></a>
# **listGroupnetSubnets**
> GroupnetSubnetsExtended listGroupnetSubnets(groupnet, sort, limit, dir, resume)



Get a list of subnets.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String groupnet = "groupnet_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    GroupnetSubnetsExtended result = apiInstance.listGroupnetSubnets(groupnet, sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#listGroupnetSubnets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
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

<a name="listSubnetsSubnetPools"></a>
# **listSubnetsSubnetPools**
> SubnetsSubnetPoolsExtended listSubnetsSubnetPools(groupnet, subnet, sort, resume, accessZone, allocMethod, limit, dir)



Get a list of network pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String accessZone = "accessZone_example"; // String | If specified, only pools with this zone name will be returned.
String allocMethod = "allocMethod_example"; // String | If specified, only pools with this allocation type will be returned.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    SubnetsSubnetPoolsExtended result = apiInstance.listSubnetsSubnetPools(groupnet, subnet, sort, resume, accessZone, allocMethod, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#listSubnetsSubnetPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **accessZone** | **String**| If specified, only pools with this zone name will be returned. | [optional]
 **allocMethod** | **String**| If specified, only pools with this allocation type will be returned. | [optional] [enum: static, dynamic]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**SubnetsSubnetPoolsExtended**](SubnetsSubnetPoolsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateGroupnetSubnet"></a>
# **updateGroupnetSubnet**
> updateGroupnetSubnet(groupnetSubnet, groupnetSubnetId, groupnet, force)



Modify a network subnet.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
GroupnetSubnet groupnetSubnet = new GroupnetSubnet(); // GroupnetSubnet | 
String groupnetSubnetId = "groupnetSubnetId_example"; // String | Modify a network subnet.
String groupnet = "groupnet_example"; // String | 
Boolean force = true; // Boolean | force modifying this subnet even if it causes an MTU conflict.
try {
    apiInstance.updateGroupnetSubnet(groupnetSubnet, groupnetSubnetId, groupnet, force);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#updateGroupnetSubnet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnetSubnet** | [**GroupnetSubnet**](GroupnetSubnet.md)|  |
 **groupnetSubnetId** | **String**| Modify a network subnet. |
 **groupnet** | **String**|  |
 **force** | **Boolean**| force modifying this subnet even if it causes an MTU conflict. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSubnetsSubnetPool"></a>
# **updateSubnetsSubnetPool**
> updateSubnetsSubnetPool(subnetsSubnetPool, subnetsSubnetPoolId, groupnet, subnet, force)



Modify a network pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NetworkGroupnetsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

NetworkGroupnetsApi apiInstance = new NetworkGroupnetsApi();
SubnetsSubnetPool subnetsSubnetPool = new SubnetsSubnetPool(); // SubnetsSubnetPool | 
String subnetsSubnetPoolId = "subnetsSubnetPoolId_example"; // String | Modify a network pool.
String groupnet = "groupnet_example"; // String | 
String subnet = "subnet_example"; // String | 
Boolean force = true; // Boolean | force creating this pool even if it causes an MTU conflict.
try {
    apiInstance.updateSubnetsSubnetPool(subnetsSubnetPool, subnetsSubnetPoolId, groupnet, subnet, force);
} catch (ApiException e) {
    System.err.println("Exception when calling NetworkGroupnetsApi#updateSubnetsSubnetPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subnetsSubnetPool** | [**SubnetsSubnetPool**](SubnetsSubnetPool.md)|  |
 **subnetsSubnetPoolId** | **String**| Modify a network pool. |
 **groupnet** | **String**|  |
 **subnet** | **String**|  |
 **force** | **Boolean**| force creating this pool even if it causes an MTU conflict. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

