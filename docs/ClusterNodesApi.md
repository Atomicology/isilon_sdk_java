# ClusterNodesApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDrivesDriveAddItem**](ClusterNodesApi.md#createDrivesDriveAddItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/add | 
[**createDrivesDriveFirmwareUpdateItem**](ClusterNodesApi.md#createDrivesDriveFirmwareUpdateItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware/update | 
[**createDrivesDriveFormatItem**](ClusterNodesApi.md#createDrivesDriveFormatItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/format | 
[**createDrivesDrivePurposeItem**](ClusterNodesApi.md#createDrivesDrivePurposeItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/purpose | 
[**createDrivesDriveSmartfailItem**](ClusterNodesApi.md#createDrivesDriveSmartfailItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/smartfail | 
[**createDrivesDriveStopfailItem**](ClusterNodesApi.md#createDrivesDriveStopfailItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/stopfail | 
[**createDrivesDriveSuspendItem**](ClusterNodesApi.md#createDrivesDriveSuspendItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/suspend | 
[**createNodeRebootItem**](ClusterNodesApi.md#createNodeRebootItem) | **POST** /platform/5/cluster/nodes/{Lnn}/reboot | 
[**createNodeShutdownItem**](ClusterNodesApi.md#createNodeShutdownItem) | **POST** /platform/5/cluster/nodes/{Lnn}/shutdown | 
[**getDrivesDriveFirmware**](ClusterNodesApi.md#getDrivesDriveFirmware) | **GET** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware | 
[**getNodeDrive**](ClusterNodesApi.md#getNodeDrive) | **GET** /platform/5/cluster/nodes/{Lnn}/drives/{NodeDriveId} | 
[**getNodeDriveconfig**](ClusterNodesApi.md#getNodeDriveconfig) | **GET** /platform/5/cluster/nodes/{Lnn}/driveconfig | 
[**getNodeDrives**](ClusterNodesApi.md#getNodeDrives) | **GET** /platform/5/cluster/nodes/{Lnn}/drives | 
[**getNodeDrivesPurposelist**](ClusterNodesApi.md#getNodeDrivesPurposelist) | **GET** /platform/3/cluster/nodes/{Lnn}/drives-purposelist | 
[**getNodeHardware**](ClusterNodesApi.md#getNodeHardware) | **GET** /platform/5/cluster/nodes/{Lnn}/hardware | 
[**getNodeHardwareFast**](ClusterNodesApi.md#getNodeHardwareFast) | **GET** /platform/3/cluster/nodes/{Lnn}/hardware-fast | 
[**getNodePartitions**](ClusterNodesApi.md#getNodePartitions) | **GET** /platform/3/cluster/nodes/{Lnn}/partitions | 
[**getNodeSensors**](ClusterNodesApi.md#getNodeSensors) | **GET** /platform/3/cluster/nodes/{Lnn}/sensors | 
[**getNodeSled**](ClusterNodesApi.md#getNodeSled) | **GET** /platform/5/cluster/nodes/{Lnn}/sleds/{NodeSledId} | 
[**getNodeSleds**](ClusterNodesApi.md#getNodeSleds) | **GET** /platform/5/cluster/nodes/{Lnn}/sleds | 
[**getNodeState**](ClusterNodesApi.md#getNodeState) | **GET** /platform/3/cluster/nodes/{Lnn}/state | 
[**getNodeStateReadonly**](ClusterNodesApi.md#getNodeStateReadonly) | **GET** /platform/3/cluster/nodes/{Lnn}/state/readonly | 
[**getNodeStateServicelight**](ClusterNodesApi.md#getNodeStateServicelight) | **GET** /platform/3/cluster/nodes/{Lnn}/state/servicelight | 
[**getNodeStateSmartfail**](ClusterNodesApi.md#getNodeStateSmartfail) | **GET** /platform/3/cluster/nodes/{Lnn}/state/smartfail | 
[**getNodeStatus**](ClusterNodesApi.md#getNodeStatus) | **GET** /platform/3/cluster/nodes/{Lnn}/status | 
[**getNodeStatusBatterystatus**](ClusterNodesApi.md#getNodeStatusBatterystatus) | **GET** /platform/3/cluster/nodes/{Lnn}/status/batterystatus | 
[**listDrivesDriveFirmwareUpdate**](ClusterNodesApi.md#listDrivesDriveFirmwareUpdate) | **GET** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware/update | 
[**updateNodeDriveconfig**](ClusterNodesApi.md#updateNodeDriveconfig) | **PUT** /platform/5/cluster/nodes/{Lnn}/driveconfig | 
[**updateNodeStateReadonly**](ClusterNodesApi.md#updateNodeStateReadonly) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/readonly | 
[**updateNodeStateServicelight**](ClusterNodesApi.md#updateNodeStateServicelight) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/servicelight | 
[**updateNodeStateSmartfail**](ClusterNodesApi.md#updateNodeStateSmartfail) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/smartfail | 


<a name="createDrivesDriveAddItem"></a>
# **createDrivesDriveAddItem**
> Empty createDrivesDriveAddItem(drivesDriveAddItem, lnn, driveid)



Add a drive to a node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty drivesDriveAddItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveAddItem(drivesDriveAddItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveAddItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveAddItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDriveFirmwareUpdateItem"></a>
# **createDrivesDriveFirmwareUpdateItem**
> Empty createDrivesDriveFirmwareUpdateItem(drivesDriveFirmwareUpdateItem, lnn, driveid)



Start a drive firmware update.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
DrivesDriveFirmwareUpdateItem drivesDriveFirmwareUpdateItem = new DrivesDriveFirmwareUpdateItem(); // DrivesDriveFirmwareUpdateItem | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveFirmwareUpdateItem(drivesDriveFirmwareUpdateItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveFirmwareUpdateItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveFirmwareUpdateItem** | [**DrivesDriveFirmwareUpdateItem**](DrivesDriveFirmwareUpdateItem.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDriveFormatItem"></a>
# **createDrivesDriveFormatItem**
> Empty createDrivesDriveFormatItem(drivesDriveFormatItem, lnn, driveid)



Format a drive for use by OneFS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
DrivesDriveFormatItem drivesDriveFormatItem = new DrivesDriveFormatItem(); // DrivesDriveFormatItem | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveFormatItem(drivesDriveFormatItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveFormatItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveFormatItem** | [**DrivesDriveFormatItem**](DrivesDriveFormatItem.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDrivePurposeItem"></a>
# **createDrivesDrivePurposeItem**
> Empty createDrivesDrivePurposeItem(drivesDrivePurposeItem, lnn, driveid)



Assign a drive to a specific use case.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
DrivesDrivePurposeItem drivesDrivePurposeItem = new DrivesDrivePurposeItem(); // DrivesDrivePurposeItem | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDrivePurposeItem(drivesDrivePurposeItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDrivePurposeItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDrivePurposeItem** | [**DrivesDrivePurposeItem**](DrivesDrivePurposeItem.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDriveSmartfailItem"></a>
# **createDrivesDriveSmartfailItem**
> Empty createDrivesDriveSmartfailItem(drivesDriveSmartfailItem, lnn, driveid)



Remove a drive from use by OneFS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty drivesDriveSmartfailItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveSmartfailItem(drivesDriveSmartfailItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveSmartfailItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveSmartfailItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDriveStopfailItem"></a>
# **createDrivesDriveStopfailItem**
> Empty createDrivesDriveStopfailItem(drivesDriveStopfailItem, lnn, driveid)



Stop restriping from a smartfailing drive.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty drivesDriveStopfailItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveStopfailItem(drivesDriveStopfailItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveStopfailItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveStopfailItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createDrivesDriveSuspendItem"></a>
# **createDrivesDriveSuspendItem**
> Empty createDrivesDriveSuspendItem(drivesDriveSuspendItem, lnn, driveid)



Temporarily remove a drive from use by OneFS.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty drivesDriveSuspendItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    Empty result = apiInstance.createDrivesDriveSuspendItem(drivesDriveSuspendItem, lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createDrivesDriveSuspendItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **drivesDriveSuspendItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNodeRebootItem"></a>
# **createNodeRebootItem**
> Empty createNodeRebootItem(nodeRebootItem, lnn, force)



Reboot the node specified by &lt;LNN&gt;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty nodeRebootItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
Boolean force = true; // Boolean | Force reboot on Infinity platform even if a drive sled is not present.
try {
    Empty result = apiInstance.createNodeRebootItem(nodeRebootItem, lnn, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createNodeRebootItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeRebootItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **force** | **Boolean**| Force reboot on Infinity platform even if a drive sled is not present. | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createNodeShutdownItem"></a>
# **createNodeShutdownItem**
> Empty createNodeShutdownItem(nodeShutdownItem, lnn, force)



Shutdown the node specified by &lt;LNN&gt;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Empty nodeShutdownItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
Boolean force = true; // Boolean | Force shutdown on Infinity platform even if a drive sled is not present.
try {
    Empty result = apiInstance.createNodeShutdownItem(nodeShutdownItem, lnn, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#createNodeShutdownItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeShutdownItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |
 **force** | **Boolean**| Force shutdown on Infinity platform even if a drive sled is not present. | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getDrivesDriveFirmware"></a>
# **getDrivesDriveFirmware**
> DrivesDriveFirmware getDrivesDriveFirmware(lnn, driveid)



Retrieve drive firmware information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    DrivesDriveFirmware result = apiInstance.getDrivesDriveFirmware(lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getDrivesDriveFirmware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**DrivesDriveFirmware**](DrivesDriveFirmware.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeDrive"></a>
# **getNodeDrive**
> NodeDrives getNodeDrive(nodeDriveId, lnn, timeout)



Retrieve drive information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
String nodeDriveId = "nodeDriveId_example"; // String | Retrieve drive information.
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeDrives result = apiInstance.getNodeDrive(nodeDriveId, lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeDrive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeDriveId** | **String**| Retrieve drive information. |
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeDrives**](NodeDrives.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeDriveconfig"></a>
# **getNodeDriveconfig**
> NodeDriveconfig getNodeDriveconfig(lnn, timeout)



View a node&#39;s drive subsystem XML configuration file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeDriveconfig result = apiInstance.getNodeDriveconfig(lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeDriveconfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeDriveconfig**](NodeDriveconfig.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeDrives"></a>
# **getNodeDrives**
> NodeDrives getNodeDrives(lnn, timeout)



List the drives on this node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeDrives result = apiInstance.getNodeDrives(lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeDrives");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeDrives**](NodeDrives.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeDrivesPurposelist"></a>
# **getNodeDrivesPurposelist**
> NodeDrivesPurposelist getNodeDrivesPurposelist(lnn)



Lists the available purposes for drives in this node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeDrivesPurposelist result = apiInstance.getNodeDrivesPurposelist(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeDrivesPurposelist");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeDrivesPurposelist**](NodeDrivesPurposelist.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeHardware"></a>
# **getNodeHardware**
> NodeHardware getNodeHardware(lnn, timeout)



Retrieve node hardware identity information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeHardware result = apiInstance.getNodeHardware(lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeHardware");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeHardware**](NodeHardware.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeHardwareFast"></a>
# **getNodeHardwareFast**
> NodeHardwareFast getNodeHardwareFast(lnn)



Quickly retrieve a subset of node hardware identity information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeHardwareFast result = apiInstance.getNodeHardwareFast(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeHardwareFast");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeHardwareFast**](NodeHardwareFast.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodePartitions"></a>
# **getNodePartitions**
> NodePartitions getNodePartitions(lnn)



Retrieve node partition information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodePartitions result = apiInstance.getNodePartitions(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodePartitions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodePartitions**](NodePartitions.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeSensors"></a>
# **getNodeSensors**
> NodeSensors getNodeSensors(lnn)



Retrieve node sensor information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeSensors result = apiInstance.getNodeSensors(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeSensors");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeSensors**](NodeSensors.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeSled"></a>
# **getNodeSled**
> NodeSleds getNodeSled(nodeSledId, lnn, timeout)



Get detailed information for the sled specified by &lt;SLEDID&gt;, or all sleds in the case where &lt;SLEDID&gt; is &#39;all&#39;, in the node specified by &lt;LNN&gt;.  Accepts &lt;sledid&gt; in either &#39;sled&#39; or &#39;all&#39; formats.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
String nodeSledId = "nodeSledId_example"; // String | Get detailed information for the sled specified by <SLEDID>, or all sleds in the case where <SLEDID> is 'all', in the node specified by <LNN>.  Accepts <sledid> in either 'sled' or 'all' formats.
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeSleds result = apiInstance.getNodeSled(nodeSledId, lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeSled");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeSledId** | **String**| Get detailed information for the sled specified by &lt;SLEDID&gt;, or all sleds in the case where &lt;SLEDID&gt; is &#39;all&#39;, in the node specified by &lt;LNN&gt;.  Accepts &lt;sledid&gt; in either &#39;sled&#39; or &#39;all&#39; formats. |
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeSleds**](NodeSleds.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeSleds"></a>
# **getNodeSleds**
> NodeSleds getNodeSleds(lnn, timeout)



Get detailed information for all sleds in this node. Equivalent to /5/cluster/nodes/&lt;lnn&gt;/sleds/all.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
BigDecimal timeout = new BigDecimal(); // BigDecimal | Request timeout
try {
    NodeSleds result = apiInstance.getNodeSleds(lnn, timeout);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeSleds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **timeout** | **BigDecimal**| Request timeout | [optional]

### Return type

[**NodeSleds**](NodeSleds.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeState"></a>
# **getNodeState**
> NodeState getNodeState(lnn)



Retrieve node state information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeState result = apiInstance.getNodeState(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeState");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeState**](NodeState.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeStateReadonly"></a>
# **getNodeStateReadonly**
> NodeStateReadonly getNodeStateReadonly(lnn)



Retrieve node readonly state information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeStateReadonly result = apiInstance.getNodeStateReadonly(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeStateReadonly");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeStateReadonly**](NodeStateReadonly.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeStateServicelight"></a>
# **getNodeStateServicelight**
> NodeStateServicelight getNodeStateServicelight(lnn)



Retrieve node service light state information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeStateServicelight result = apiInstance.getNodeStateServicelight(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeStateServicelight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeStateServicelight**](NodeStateServicelight.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeStateSmartfail"></a>
# **getNodeStateSmartfail**
> NodeStateSmartfail getNodeStateSmartfail(lnn)



Retrieve node smartfail state information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeStateSmartfail result = apiInstance.getNodeStateSmartfail(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeStateSmartfail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeStateSmartfail**](NodeStateSmartfail.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeStatus"></a>
# **getNodeStatus**
> NodeStatus getNodeStatus(lnn)



Retrieve node status information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeStatus result = apiInstance.getNodeStatus(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeStatus**](NodeStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodeStatusBatterystatus"></a>
# **getNodeStatusBatterystatus**
> NodeStatusBatterystatus getNodeStatusBatterystatus(lnn)



Retrieve node battery status information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
try {
    NodeStatusBatterystatus result = apiInstance.getNodeStatusBatterystatus(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#getNodeStatusBatterystatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |

### Return type

[**NodeStatusBatterystatus**](NodeStatusBatterystatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listDrivesDriveFirmwareUpdate"></a>
# **listDrivesDriveFirmwareUpdate**
> DrivesDriveFirmwareUpdate listDrivesDriveFirmwareUpdate(lnn, driveid)



Retrieve firmware update information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
Integer lnn = 56; // Integer | 
String driveid = "driveid_example"; // String | 
try {
    DrivesDriveFirmwareUpdate result = apiInstance.listDrivesDriveFirmwareUpdate(lnn, driveid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#listDrivesDriveFirmwareUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **driveid** | **String**|  |

### Return type

[**DrivesDriveFirmwareUpdate**](DrivesDriveFirmwareUpdate.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeDriveconfig"></a>
# **updateNodeDriveconfig**
> updateNodeDriveconfig(nodeDriveconfig, lnn)



Modify a node&#39;s drive subsystem XML configuration file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
NodeDriveconfigExtended nodeDriveconfig = new NodeDriveconfigExtended(); // NodeDriveconfigExtended | 
Integer lnn = 56; // Integer | 
try {
    apiInstance.updateNodeDriveconfig(nodeDriveconfig, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#updateNodeDriveconfig");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeDriveconfig** | [**NodeDriveconfigExtended**](NodeDriveconfigExtended.md)|  |
 **lnn** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeStateReadonly"></a>
# **updateNodeStateReadonly**
> updateNodeStateReadonly(nodeStateReadonly, lnn)



Modify one or more node readonly state settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
NodeStateReadonlyExtended nodeStateReadonly = new NodeStateReadonlyExtended(); // NodeStateReadonlyExtended | 
Integer lnn = 56; // Integer | 
try {
    apiInstance.updateNodeStateReadonly(nodeStateReadonly, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#updateNodeStateReadonly");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeStateReadonly** | [**NodeStateReadonlyExtended**](NodeStateReadonlyExtended.md)|  |
 **lnn** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeStateServicelight"></a>
# **updateNodeStateServicelight**
> updateNodeStateServicelight(nodeStateServicelight, lnn)



Modify one or more node service light state settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
NodeStateServicelightExtended nodeStateServicelight = new NodeStateServicelightExtended(); // NodeStateServicelightExtended | 
Integer lnn = 56; // Integer | 
try {
    apiInstance.updateNodeStateServicelight(nodeStateServicelight, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#updateNodeStateServicelight");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeStateServicelight** | [**NodeStateServicelightExtended**](NodeStateServicelightExtended.md)|  |
 **lnn** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNodeStateSmartfail"></a>
# **updateNodeStateSmartfail**
> updateNodeStateSmartfail(nodeStateSmartfail, lnn)



Modify smartfail state of the node.  Only the &#39;smartfailed&#39; body member has any effect on node smartfail state.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClusterNodesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ClusterNodesApi apiInstance = new ClusterNodesApi();
NodeStateSmartfailExtended nodeStateSmartfail = new NodeStateSmartfailExtended(); // NodeStateSmartfailExtended | 
Integer lnn = 56; // Integer | 
try {
    apiInstance.updateNodeStateSmartfail(nodeStateSmartfail, lnn);
} catch (ApiException e) {
    System.err.println("Exception when calling ClusterNodesApi#updateNodeStateSmartfail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodeStateSmartfail** | [**NodeStateSmartfailExtended**](NodeStateSmartfailExtended.md)|  |
 **lnn** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

