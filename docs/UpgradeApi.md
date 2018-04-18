# UpgradeApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createClusterAddRemainingNode**](UpgradeApi.md#createClusterAddRemainingNode) | **POST** /platform/3/upgrade/cluster/add_remaining_nodes | 
[**createClusterArchiveItem**](UpgradeApi.md#createClusterArchiveItem) | **POST** /platform/3/upgrade/cluster/archive | 
[**createClusterAssessItem**](UpgradeApi.md#createClusterAssessItem) | **POST** /platform/5/upgrade/cluster/assess | 
[**createClusterCommitItem**](UpgradeApi.md#createClusterCommitItem) | **POST** /platform/3/upgrade/cluster/commit | 
[**createClusterFirmwareAssessItem**](UpgradeApi.md#createClusterFirmwareAssessItem) | **POST** /platform/3/upgrade/cluster/firmware/assess | 
[**createClusterFirmwareUpgradeItem**](UpgradeApi.md#createClusterFirmwareUpgradeItem) | **POST** /platform/3/upgrade/cluster/firmware/upgrade | 
[**createClusterPatchAbortItem**](UpgradeApi.md#createClusterPatchAbortItem) | **POST** /platform/3/upgrade/cluster/patch/abort | 
[**createClusterPatchPatch**](UpgradeApi.md#createClusterPatchPatch) | **POST** /platform/3/upgrade/cluster/patch/patches | 
[**createClusterRetryLastActionItem**](UpgradeApi.md#createClusterRetryLastActionItem) | **POST** /platform/3/upgrade/cluster/retry_last_action | 
[**createClusterRollbackItem**](UpgradeApi.md#createClusterRollbackItem) | **POST** /platform/3/upgrade/cluster/rollback | 
[**createClusterUpgradeItem**](UpgradeApi.md#createClusterUpgradeItem) | **POST** /platform/5/upgrade/cluster/upgrade | 
[**createHardwareStartItem**](UpgradeApi.md#createHardwareStartItem) | **POST** /platform/5/upgrade/hardware/start | 
[**createHardwareStopItem**](UpgradeApi.md#createHardwareStopItem) | **POST** /platform/5/upgrade/hardware/stop | 
[**deleteClusterPatchPatch**](UpgradeApi.md#deleteClusterPatchPatch) | **DELETE** /platform/3/upgrade/cluster/patch/patches/{ClusterPatchPatchId} | 
[**getClusterFirmwareProgress**](UpgradeApi.md#getClusterFirmwareProgress) | **GET** /platform/3/upgrade/cluster/firmware/progress | 
[**getClusterFirmwareStatus**](UpgradeApi.md#getClusterFirmwareStatus) | **GET** /platform/3/upgrade/cluster/firmware/status | 
[**getClusterNode**](UpgradeApi.md#getClusterNode) | **GET** /platform/3/upgrade/cluster/nodes/{ClusterNodeId} | 
[**getClusterNodes**](UpgradeApi.md#getClusterNodes) | **GET** /platform/3/upgrade/cluster/nodes | 
[**getClusterPatchPatch**](UpgradeApi.md#getClusterPatchPatch) | **GET** /platform/3/upgrade/cluster/patch/patches/{ClusterPatchPatchId} | 
[**getHardwareStatus**](UpgradeApi.md#getHardwareStatus) | **GET** /platform/5/upgrade/hardware/status | 
[**getUpgradeCluster**](UpgradeApi.md#getUpgradeCluster) | **GET** /platform/4/upgrade/cluster | 
[**listClusterPatchPatches**](UpgradeApi.md#listClusterPatchPatches) | **GET** /platform/3/upgrade/cluster/patch/patches | 
[**updateClusterUpgrade**](UpgradeApi.md#updateClusterUpgrade) | **PUT** /platform/5/upgrade/cluster/upgrade | 


<a name="createClusterAddRemainingNode"></a>
# **createClusterAddRemainingNode**
> Empty createClusterAddRemainingNode(clusterAddRemainingNode)



Let system absorb any remaining or new nodes inside the existing upgrade.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Empty clusterAddRemainingNode = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createClusterAddRemainingNode(clusterAddRemainingNode);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterAddRemainingNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterAddRemainingNode** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterArchiveItem"></a>
# **createClusterArchiveItem**
> Empty createClusterArchiveItem(clusterArchiveItem)



Start an archive of an upgrade.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterArchiveItem clusterArchiveItem = new ClusterArchiveItem(); // ClusterArchiveItem | 
try {
    Empty result = apiInstance.createClusterArchiveItem(clusterArchiveItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterArchiveItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterArchiveItem** | [**ClusterArchiveItem**](ClusterArchiveItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterAssessItem"></a>
# **createClusterAssessItem**
> Empty createClusterAssessItem(clusterAssessItem)



Start upgrade assessment on cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterAssessItem clusterAssessItem = new ClusterAssessItem(); // ClusterAssessItem | 
try {
    Empty result = apiInstance.createClusterAssessItem(clusterAssessItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterAssessItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterAssessItem** | [**ClusterAssessItem**](ClusterAssessItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterCommitItem"></a>
# **createClusterCommitItem**
> Empty createClusterCommitItem(clusterCommitItem)



Commit the upgrade of a cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Empty clusterCommitItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createClusterCommitItem(clusterCommitItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterCommitItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterCommitItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterFirmwareAssessItem"></a>
# **createClusterFirmwareAssessItem**
> Empty createClusterFirmwareAssessItem(clusterFirmwareAssessItem)



Start firmware upgrade assessment on cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Empty clusterFirmwareAssessItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createClusterFirmwareAssessItem(clusterFirmwareAssessItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterFirmwareAssessItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterFirmwareAssessItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterFirmwareUpgradeItem"></a>
# **createClusterFirmwareUpgradeItem**
> Empty createClusterFirmwareUpgradeItem(clusterFirmwareUpgradeItem)



The settings necessary to start a firmware upgrade.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterFirmwareUpgradeItem clusterFirmwareUpgradeItem = new ClusterFirmwareUpgradeItem(); // ClusterFirmwareUpgradeItem | 
try {
    Empty result = apiInstance.createClusterFirmwareUpgradeItem(clusterFirmwareUpgradeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterFirmwareUpgradeItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterFirmwareUpgradeItem** | [**ClusterFirmwareUpgradeItem**](ClusterFirmwareUpgradeItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterPatchAbortItem"></a>
# **createClusterPatchAbortItem**
> Empty createClusterPatchAbortItem(clusterPatchAbortItem)



Abort the previous action performed by the patch system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Empty clusterPatchAbortItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createClusterPatchAbortItem(clusterPatchAbortItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterPatchAbortItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterPatchAbortItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterPatchPatch"></a>
# **createClusterPatchPatch**
> CreateResponse createClusterPatchPatch(clusterPatchPatch, override, rolling)



Install a patch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterPatchPatch clusterPatchPatch = new ClusterPatchPatch(); // ClusterPatchPatch | 
Boolean override = true; // Boolean | Whether to ignore patch system validation and force the installation.
Boolean rolling = true; // Boolean | Whether to install the patch on one node at a time. Defaults to true.
try {
    CreateResponse result = apiInstance.createClusterPatchPatch(clusterPatchPatch, override, rolling);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterPatchPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterPatchPatch** | [**ClusterPatchPatch**](ClusterPatchPatch.md)|  |
 **override** | **Boolean**| Whether to ignore patch system validation and force the installation. | [optional]
 **rolling** | **Boolean**| Whether to install the patch on one node at a time. Defaults to true. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterRetryLastActionItem"></a>
# **createClusterRetryLastActionItem**
> Empty createClusterRetryLastActionItem(clusterRetryLastActionItem)



Retry the last upgrade action, in-case the previous attempt failed.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterRetryLastActionItem clusterRetryLastActionItem = new ClusterRetryLastActionItem(); // ClusterRetryLastActionItem | 
try {
    Empty result = apiInstance.createClusterRetryLastActionItem(clusterRetryLastActionItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterRetryLastActionItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterRetryLastActionItem** | [**ClusterRetryLastActionItem**](ClusterRetryLastActionItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterRollbackItem"></a>
# **createClusterRollbackItem**
> Empty createClusterRollbackItem(clusterRollbackItem)



Rollback the upgrade of a cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Empty clusterRollbackItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createClusterRollbackItem(clusterRollbackItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterRollbackItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterRollbackItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createClusterUpgradeItem"></a>
# **createClusterUpgradeItem**
> Empty createClusterUpgradeItem(clusterUpgradeItem)



The settings necessary to start an upgrade.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterUpgradeItem clusterUpgradeItem = new ClusterUpgradeItem(); // ClusterUpgradeItem | 
try {
    Empty result = apiInstance.createClusterUpgradeItem(clusterUpgradeItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createClusterUpgradeItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterUpgradeItem** | [**ClusterUpgradeItem**](ClusterUpgradeItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHardwareStartItem"></a>
# **createHardwareStartItem**
> createHardwareStartItem(hardwareStartItem)



Start a hardware upgrade

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
HardwareStartItem hardwareStartItem = new HardwareStartItem(); // HardwareStartItem | 
try {
    apiInstance.createHardwareStartItem(hardwareStartItem);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createHardwareStartItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareStartItem** | [**HardwareStartItem**](HardwareStartItem.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createHardwareStopItem"></a>
# **createHardwareStopItem**
> createHardwareStopItem(hardwareStopItem)



Stop an in-progess hardware upgrade process

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
HardwareStopItem hardwareStopItem = new HardwareStopItem(); // HardwareStopItem | 
try {
    apiInstance.createHardwareStopItem(hardwareStopItem);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#createHardwareStopItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hardwareStopItem** | [**HardwareStopItem**](HardwareStopItem.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClusterPatchPatch"></a>
# **deleteClusterPatchPatch**
> deleteClusterPatchPatch(clusterPatchPatchId, override, rolling)



Uninstall a patch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
String clusterPatchPatchId = "clusterPatchPatchId_example"; // String | Uninstall a patch.
Boolean override = true; // Boolean | Whether to ignore patch system validation and force the uninstallation.
Boolean rolling = true; // Boolean | Whether to uninstall the patch on one node at a time. Defaults to true.
try {
    apiInstance.deleteClusterPatchPatch(clusterPatchPatchId, override, rolling);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#deleteClusterPatchPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterPatchPatchId** | **String**| Uninstall a patch. |
 **override** | **Boolean**| Whether to ignore patch system validation and force the uninstallation. | [optional]
 **rolling** | **Boolean**| Whether to uninstall the patch on one node at a time. Defaults to true. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterFirmwareProgress"></a>
# **getClusterFirmwareProgress**
> ClusterFirmwareProgress getClusterFirmwareProgress()



Cluster wide firmware upgrade status info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
try {
    ClusterFirmwareProgress result = apiInstance.getClusterFirmwareProgress();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getClusterFirmwareProgress");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterFirmwareProgress**](ClusterFirmwareProgress.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterFirmwareStatus"></a>
# **getClusterFirmwareStatus**
> ClusterFirmwareStatus getClusterFirmwareStatus(devices, _package)



The firmware status for the cluster.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Boolean devices = true; // Boolean | Show devices. If false, this returns an empty list. Default is false.
Boolean _package = true; // Boolean | Show package. If false, this returns an empty list.Default is false.
try {
    ClusterFirmwareStatus result = apiInstance.getClusterFirmwareStatus(devices, _package);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getClusterFirmwareStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **devices** | **Boolean**| Show devices. If false, this returns an empty list. Default is false. | [optional]
 **_package** | **Boolean**| Show package. If false, this returns an empty list.Default is false. | [optional]

### Return type

[**ClusterFirmwareStatus**](ClusterFirmwareStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterNode"></a>
# **getClusterNode**
> ClusterNodes getClusterNode(clusterNodeId)



The node details useful during an upgrade or assessment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
Integer clusterNodeId = 56; // Integer | The node details useful during an upgrade or assessment.
try {
    ClusterNodes result = apiInstance.getClusterNode(clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getClusterNode");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterNodeId** | **Integer**| The node details useful during an upgrade or assessment. |

### Return type

[**ClusterNodes**](ClusterNodes.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterNodes"></a>
# **getClusterNodes**
> ClusterNodesExtended getClusterNodes()



View information about nodes during an upgrade, rollback, or pre-upgrade assessment.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
try {
    ClusterNodesExtended result = apiInstance.getClusterNodes();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getClusterNodes");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterNodesExtended**](ClusterNodesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClusterPatchPatch"></a>
# **getClusterPatchPatch**
> ClusterPatchPatches getClusterPatchPatch(clusterPatchPatchId, local, location)



View a single patch.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
String clusterPatchPatchId = "clusterPatchPatchId_example"; // String | View a single patch.
Boolean local = true; // Boolean | Only view patch information on the local node.
String location = "location_example"; // String | Path location of patch file.
try {
    ClusterPatchPatches result = apiInstance.getClusterPatchPatch(clusterPatchPatchId, local, location);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getClusterPatchPatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterPatchPatchId** | **String**| View a single patch. |
 **local** | **Boolean**| Only view patch information on the local node. | [optional]
 **location** | **String**| Path location of patch file. | [optional]

### Return type

[**ClusterPatchPatches**](ClusterPatchPatches.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getHardwareStatus"></a>
# **getHardwareStatus**
> HardwareStatus getHardwareStatus()



View the status of hardware upgrades in progress

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
try {
    HardwareStatus result = apiInstance.getHardwareStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getHardwareStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**HardwareStatus**](HardwareStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getUpgradeCluster"></a>
# **getUpgradeCluster**
> UpgradeCluster getUpgradeCluster()



Cluster wide upgrade status info.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
try {
    UpgradeCluster result = apiInstance.getUpgradeCluster();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#getUpgradeCluster");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**UpgradeCluster**](UpgradeCluster.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClusterPatchPatches"></a>
# **listClusterPatchPatches**
> ClusterPatchPatchesExtended listClusterPatchPatches(sort, resume, limit, location, local, dir)



List all patches.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String location = "location_example"; // String | Path location of patch file.
Boolean local = true; // Boolean | Whether to view patches on the local node only.
String dir = "dir_example"; // String | The direction of the sort.
try {
    ClusterPatchPatchesExtended result = apiInstance.listClusterPatchPatches(sort, resume, limit, location, local, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#listClusterPatchPatches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **location** | **String**| Path location of patch file. | [optional]
 **local** | **Boolean**| Whether to view patches on the local node only. | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**ClusterPatchPatchesExtended**](ClusterPatchPatchesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateClusterUpgrade"></a>
# **updateClusterUpgrade**
> updateClusterUpgrade(clusterUpgrade)



Add nodes to a running upgrade.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeApi apiInstance = new UpgradeApi();
ClusterUpgrade clusterUpgrade = new ClusterUpgrade(); // ClusterUpgrade | 
try {
    apiInstance.updateClusterUpgrade(clusterUpgrade);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeApi#updateClusterUpgrade");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clusterUpgrade** | [**ClusterUpgrade**](ClusterUpgrade.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

