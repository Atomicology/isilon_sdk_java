# ClusterApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterAddNodeItem**](ClusterApi.md#createClusterAddNodeItem) | **POST** /platform/3/cluster/add-node | 
[**createDiagnosticsGatherStartItem**](ClusterApi.md#createDiagnosticsGatherStartItem) | **POST** /platform/3/cluster/diagnostics/gather/start | 
[**createDiagnosticsGatherStopItem**](ClusterApi.md#createDiagnosticsGatherStopItem) | **POST** /platform/3/cluster/diagnostics/gather/stop | 
[**createDiagnosticsNetloggerStartItem**](ClusterApi.md#createDiagnosticsNetloggerStartItem) | **POST** /platform/3/cluster/diagnostics/netlogger/start | 
[**createDiagnosticsNetloggerStopItem**](ClusterApi.md#createDiagnosticsNetloggerStopItem) | **POST** /platform/3/cluster/diagnostics/netlogger/stop | 
[**getClusterConfig**](ClusterApi.md#getClusterConfig) | **GET** /platform/3/cluster/config | 
[**getClusterEmail**](ClusterApi.md#getClusterEmail) | **GET** /platform/1/cluster/email | 
[**getClusterExternalIps**](ClusterApi.md#getClusterExternalIps) | **GET** /platform/2/cluster/external-ips | 
[**getClusterIdentity**](ClusterApi.md#getClusterIdentity) | **GET** /platform/5/cluster/identity | 
[**getClusterNode**](ClusterApi.md#getClusterNode) | **GET** /platform/5/cluster/nodes/{ClusterNodeId} | 
[**getClusterNodes**](ClusterApi.md#getClusterNodes) | **GET** /platform/5/cluster/nodes | 
[**getClusterNodesAvailable**](ClusterApi.md#getClusterNodesAvailable) | **GET** /platform/3/cluster/nodes-available | 
[**getClusterOwner**](ClusterApi.md#getClusterOwner) | **GET** /platform/1/cluster/owner | 
[**getClusterStatfs**](ClusterApi.md#getClusterStatfs) | **GET** /platform/1/cluster/statfs | 
[**getClusterTime**](ClusterApi.md#getClusterTime) | **GET** /platform/3/cluster/time | 
[**getClusterTimezone**](ClusterApi.md#getClusterTimezone) | **GET** /platform/3/cluster/timezone | 
[**getClusterVersion**](ClusterApi.md#getClusterVersion) | **GET** /platform/3/cluster/version | 
[**getDiagnosticsGather**](ClusterApi.md#getDiagnosticsGather) | **GET** /platform/3/cluster/diagnostics/gather | 
[**getDiagnosticsGatherSettings**](ClusterApi.md#getDiagnosticsGatherSettings) | **GET** /platform/3/cluster/diagnostics/gather/settings | 
[**getDiagnosticsGatherStatus**](ClusterApi.md#getDiagnosticsGatherStatus) | **GET** /platform/3/cluster/diagnostics/gather/status | 
[**getDiagnosticsNetlogger**](ClusterApi.md#getDiagnosticsNetlogger) | **GET** /platform/3/cluster/diagnostics/netlogger | 
[**getDiagnosticsNetloggerSettings**](ClusterApi.md#getDiagnosticsNetloggerSettings) | **GET** /platform/3/cluster/diagnostics/netlogger/settings | 
[**getDiagnosticsNetloggerStatus**](ClusterApi.md#getDiagnosticsNetloggerStatus) | **GET** /platform/3/cluster/diagnostics/netlogger/status | 
[**getTimezoneRegion**](ClusterApi.md#getTimezoneRegion) | **GET** /platform/3/cluster/timezone/regions/{TimezoneRegionId} | 
[**getTimezoneSettings**](ClusterApi.md#getTimezoneSettings) | **GET** /platform/3/cluster/timezone/settings | 
[**updateClusterEmail**](ClusterApi.md#updateClusterEmail) | **PUT** /platform/1/cluster/email | 
[**updateClusterNode**](ClusterApi.md#updateClusterNode) | **PUT** /platform/5/cluster/nodes/{ClusterNodeId} | 
[**updateClusterOwner**](ClusterApi.md#updateClusterOwner) | **PUT** /platform/1/cluster/owner | 
[**updateClusterTime**](ClusterApi.md#updateClusterTime) | **PUT** /platform/3/cluster/time | 
[**updateClusterTimezone**](ClusterApi.md#updateClusterTimezone) | **PUT** /platform/3/cluster/timezone | 
[**updateDiagnosticsGatherSettings**](ClusterApi.md#updateDiagnosticsGatherSettings) | **PUT** /platform/3/cluster/diagnostics/gather/settings | 
[**updateDiagnosticsNetloggerSettings**](ClusterApi.md#updateDiagnosticsNetloggerSettings) | **PUT** /platform/3/cluster/diagnostics/netlogger/settings | 
[**updateTimezoneSettings**](ClusterApi.md#updateTimezoneSettings) | **PUT** /platform/3/cluster/timezone/settings | 


<a name="createClusterAddNodeItem"></a>
# **createClusterAddNodeItem**
> Empty createClusterAddNodeItem(clusterAddNodeItem)



Serial number and arguments of node to add.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterAddNodeItem clusterAddNodeItem = new ClusterAddNodeItem(); // ClusterAddNodeItem | 
try {
    Empty result = apiInstance.createClusterAddNodeItem(clusterAddNodeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createClusterAddNodeItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterAddNodeItem** | [**ClusterAddNodeItem**](ClusterAddNodeItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDiagnosticsGatherStartItem"></a>
# **createDiagnosticsGatherStartItem**
> Empty createDiagnosticsGatherStartItem(diagnosticsGatherStartItem)



Start a new gather

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
DiagnosticsGatherSettingsExtended diagnosticsGatherStartItem = new DiagnosticsGatherSettingsExtended(); // DiagnosticsGatherSettingsExtended | 
try {
    Empty result = apiInstance.createDiagnosticsGatherStartItem(diagnosticsGatherStartItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createDiagnosticsGatherStartItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsGatherStartItem** | [**DiagnosticsGatherSettingsExtended**](DiagnosticsGatherSettingsExtended.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDiagnosticsGatherStopItem"></a>
# **createDiagnosticsGatherStopItem**
> Empty createDiagnosticsGatherStopItem(diagnosticsGatherStopItem)



Stop a running gather

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
Empty diagnosticsGatherStopItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createDiagnosticsGatherStopItem(diagnosticsGatherStopItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createDiagnosticsGatherStopItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsGatherStopItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDiagnosticsNetloggerStartItem"></a>
# **createDiagnosticsNetloggerStartItem**
> Empty createDiagnosticsNetloggerStartItem(diagnosticsNetloggerStartItem)



Start a new packet caputre

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
DiagnosticsNetloggerSettings diagnosticsNetloggerStartItem = new DiagnosticsNetloggerSettings(); // DiagnosticsNetloggerSettings | 
try {
    Empty result = apiInstance.createDiagnosticsNetloggerStartItem(diagnosticsNetloggerStartItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createDiagnosticsNetloggerStartItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsNetloggerStartItem** | [**DiagnosticsNetloggerSettings**](DiagnosticsNetloggerSettings.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDiagnosticsNetloggerStopItem"></a>
# **createDiagnosticsNetloggerStopItem**
> Empty createDiagnosticsNetloggerStopItem(diagnosticsNetloggerStopItem)



Stop a running packet capture

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
Empty diagnosticsNetloggerStopItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createDiagnosticsNetloggerStopItem(diagnosticsNetloggerStopItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#createDiagnosticsNetloggerStopItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsNetloggerStopItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterConfig"></a>
# **getClusterConfig**
> ClusterConfig getClusterConfig()



Retrieve the cluster information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterConfig result = apiInstance.getClusterConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterConfig**](ClusterConfig.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterEmail"></a>
# **getClusterEmail**
> ClusterEmail getClusterEmail()



Get the cluster email notification settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterEmail result = apiInstance.getClusterEmail();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterEmail");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterEmail**](ClusterEmail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterExternalIps"></a>
# **getClusterExternalIps**
> List&lt;String&gt; getClusterExternalIps()



Retrieve the cluster IP addresses including IPV4 and IPV6.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    List<String> result = apiInstance.getClusterExternalIps();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterExternalIps");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterIdentity"></a>
# **getClusterIdentity**
> ClusterIdentity getClusterIdentity()



Retrieve the login information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterIdentity result = apiInstance.getClusterIdentity();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterIdentity");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterIdentity**](ClusterIdentity.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterNode"></a>
# **getClusterNode**
> ClusterNodesExtendedExtended getClusterNode(clusterNodeId, timeout)



Retrieve node information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
Integer clusterNodeId = 56; // Integer | Retrieve node information.
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    ClusterNodesExtendedExtended result = apiInstance.getClusterNode(clusterNodeId, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterNodeId** | **Integer**| Retrieve node information. |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**ClusterNodesExtendedExtended**](ClusterNodesExtendedExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterNodes"></a>
# **getClusterNodes**
> ClusterNodesExtendedExtendedExtended getClusterNodes(timeout)



List the nodes on this cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    ClusterNodesExtendedExtendedExtended result = apiInstance.getClusterNodes(timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterNodes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**ClusterNodesExtendedExtendedExtended**](ClusterNodesExtendedExtendedExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterNodesAvailable"></a>
# **getClusterNodesAvailable**
> ClusterNodesAvailable getClusterNodesAvailable()



List all nodes that are available to add to this cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterNodesAvailable result = apiInstance.getClusterNodesAvailable();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterNodesAvailable");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterNodesAvailable**](ClusterNodesAvailable.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterOwner"></a>
# **getClusterOwner**
> ClusterOwner getClusterOwner()



Get the cluster contact info settings

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterOwner result = apiInstance.getClusterOwner();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterOwner");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterOwner**](ClusterOwner.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterStatfs"></a>
# **getClusterStatfs**
> ClusterStatfs getClusterStatfs()



Retrieve the filesystem statistics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterStatfs result = apiInstance.getClusterStatfs();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterStatfs");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterStatfs**](ClusterStatfs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterTime"></a>
# **getClusterTime**
> ClusterTime getClusterTime()



Retrieve the current time as reported by each node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterTime result = apiInstance.getClusterTime();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterTime");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterTime**](ClusterTime.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterTimezone"></a>
# **getClusterTimezone**
> ClusterTimezone getClusterTimezone()



Get the cluster timezone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterTimezone result = apiInstance.getClusterTimezone();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterTimezone");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterTimezone**](ClusterTimezone.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterVersion"></a>
# **getClusterVersion**
> ClusterVersion getClusterVersion()



Retrieve the OneFS version as reported by each node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    ClusterVersion result = apiInstance.getClusterVersion();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getClusterVersion");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterVersion**](ClusterVersion.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsGather"></a>
# **getDiagnosticsGather**
> DiagnosticsGatherStatus getDiagnosticsGather()



Get the status of isi_gather_info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsGatherStatus result = apiInstance.getDiagnosticsGather();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsGather");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsGatherStatus**](DiagnosticsGatherStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsGatherSettings"></a>
# **getDiagnosticsGatherSettings**
> DiagnosticsGatherSettings getDiagnosticsGatherSettings()



Get the default options for isi_gather_info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsGatherSettings result = apiInstance.getDiagnosticsGatherSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsGatherSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsGatherSettings**](DiagnosticsGatherSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsGatherStatus"></a>
# **getDiagnosticsGatherStatus**
> DiagnosticsGatherStatus getDiagnosticsGatherStatus()



Get the status of isi_gather_info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsGatherStatus result = apiInstance.getDiagnosticsGatherStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsGatherStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsGatherStatus**](DiagnosticsGatherStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsNetlogger"></a>
# **getDiagnosticsNetlogger**
> DiagnosticsNetloggerStatus getDiagnosticsNetlogger()



Get the status of isi_netlogger.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsNetloggerStatus result = apiInstance.getDiagnosticsNetlogger();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsNetlogger");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsNetloggerStatus**](DiagnosticsNetloggerStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsNetloggerSettings"></a>
# **getDiagnosticsNetloggerSettings**
> DiagnosticsNetloggerSettings getDiagnosticsNetloggerSettings()



Get the default options for isi_netlogger.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsNetloggerSettings result = apiInstance.getDiagnosticsNetloggerSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsNetloggerSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsNetloggerSettings**](DiagnosticsNetloggerSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDiagnosticsNetloggerStatus"></a>
# **getDiagnosticsNetloggerStatus**
> DiagnosticsNetloggerStatus getDiagnosticsNetloggerStatus()



Get the status of isi_netlogger.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    DiagnosticsNetloggerStatus result = apiInstance.getDiagnosticsNetloggerStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getDiagnosticsNetloggerStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**DiagnosticsNetloggerStatus**](DiagnosticsNetloggerStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimezoneRegion"></a>
# **getTimezoneRegion**
> TimezoneRegions getTimezoneRegion(timezoneRegionId, sort, resume, showAll, dstReset, limit, dir)



List timezone regions.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
String timezoneRegionId = "timezoneRegionId_example"; // String | List timezone regions.
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean showAll = true; // Boolean | Show all timezones within the region specified in the URI.
Boolean dstReset = true; // Boolean | This query arg is not needed in normal use cases.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    TimezoneRegions result = apiInstance.getTimezoneRegion(timezoneRegionId, sort, resume, showAll, dstReset, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getTimezoneRegion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timezoneRegionId** | **String**| List timezone regions. |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **showAll** | **Boolean**| Show all timezones within the region specified in the URI. | [optional]
 **dstReset** | **Boolean**| This query arg is not needed in normal use cases. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**TimezoneRegions**](TimezoneRegions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTimezoneSettings"></a>
# **getTimezoneSettings**
> TimezoneSettings getTimezoneSettings()



Retrieve the cluster timezone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
try {
    TimezoneSettings result = apiInstance.getTimezoneSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#getTimezoneSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TimezoneSettings**](TimezoneSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterEmail"></a>
# **updateClusterEmail**
> updateClusterEmail(clusterEmail)



Modify the cluster email notification settings.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterEmailExtended clusterEmail = new ClusterEmailExtended(); // ClusterEmailExtended | 
try {
    apiInstance.updateClusterEmail(clusterEmail);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterEmail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterEmail** | [**ClusterEmailExtended**](ClusterEmailExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterNode"></a>
# **updateClusterNode**
> updateClusterNode(clusterNode, clusterNodeId)



Modify one or more node settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterNode clusterNode = new ClusterNode(); // ClusterNode | 
Integer clusterNodeId = 56; // Integer | Modify one or more node settings.
try {
    apiInstance.updateClusterNode(clusterNode, clusterNodeId);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterNode** | [**ClusterNode**](ClusterNode.md)|  |
 **clusterNodeId** | **Integer**| Modify one or more node settings. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterOwner"></a>
# **updateClusterOwner**
> updateClusterOwner(clusterOwner)



Modify the cluster contact info settings.  All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterOwner clusterOwner = new ClusterOwner(); // ClusterOwner | 
try {
    apiInstance.updateClusterOwner(clusterOwner);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterOwner");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterOwner** | [**ClusterOwner**](ClusterOwner.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterTime"></a>
# **updateClusterTime**
> updateClusterTime(clusterTime)



Set cluster time.  Time will mostly be synchronized across nodes, but there may be slight drift.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterTimeExtended clusterTime = new ClusterTimeExtended(); // ClusterTimeExtended | 
try {
    apiInstance.updateClusterTime(clusterTime);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterTime");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterTime** | [**ClusterTimeExtended**](ClusterTimeExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterTimezone"></a>
# **updateClusterTimezone**
> updateClusterTimezone(clusterTimezone)



Set a new timezone for the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
ClusterTimezoneExtended clusterTimezone = new ClusterTimezoneExtended(); // ClusterTimezoneExtended | 
try {
    apiInstance.updateClusterTimezone(clusterTimezone);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateClusterTimezone");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterTimezone** | [**ClusterTimezoneExtended**](ClusterTimezoneExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDiagnosticsGatherSettings"></a>
# **updateDiagnosticsGatherSettings**
> updateDiagnosticsGatherSettings(diagnosticsGatherSettings)



Set the default options for isi_gather_info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
DiagnosticsGatherSettingsExtended diagnosticsGatherSettings = new DiagnosticsGatherSettingsExtended(); // DiagnosticsGatherSettingsExtended | 
try {
    apiInstance.updateDiagnosticsGatherSettings(diagnosticsGatherSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateDiagnosticsGatherSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsGatherSettings** | [**DiagnosticsGatherSettingsExtended**](DiagnosticsGatherSettingsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateDiagnosticsNetloggerSettings"></a>
# **updateDiagnosticsNetloggerSettings**
> updateDiagnosticsNetloggerSettings(diagnosticsNetloggerSettings)



Set the default options for isi_netlogger.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
DiagnosticsNetloggerSettings diagnosticsNetloggerSettings = new DiagnosticsNetloggerSettings(); // DiagnosticsNetloggerSettings | 
try {
    apiInstance.updateDiagnosticsNetloggerSettings(diagnosticsNetloggerSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateDiagnosticsNetloggerSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diagnosticsNetloggerSettings** | [**DiagnosticsNetloggerSettings**](DiagnosticsNetloggerSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTimezoneSettings"></a>
# **updateTimezoneSettings**
> updateTimezoneSettings(timezoneSettings)



Modify the cluster timezone.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterApi apiInstance = new ClusterApi();
TimezoneRegionTimezone timezoneSettings = new TimezoneRegionTimezone(); // TimezoneRegionTimezone | 
try {
    apiInstance.updateTimezoneSettings(timezoneSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterApi#updateTimezoneSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **timezoneSettings** | [**TimezoneRegionTimezone**](TimezoneRegionTimezone.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

