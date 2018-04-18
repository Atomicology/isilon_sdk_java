# UpgradeClusterApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createNodesNodePatchSyncItem**](UpgradeClusterApi.md#createNodesNodePatchSyncItem) | **POST** /platform/4/upgrade/cluster/nodes/{Lnn}/patch/sync | 
[**getNodesNodeFirmwareStatus**](UpgradeClusterApi.md#getNodesNodeFirmwareStatus) | **GET** /platform/3/upgrade/cluster/nodes/{Lnn}/firmware/status | 


<a name="createNodesNodePatchSyncItem"></a>
# **createNodesNodePatchSyncItem**
> Empty createNodesNodePatchSyncItem(nodesNodePatchSyncItem, lnn)



Retry any pending patch sync operations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeClusterApi apiInstance = new UpgradeClusterApi();
Empty nodesNodePatchSyncItem = new Empty(); // Empty | 
Integer lnn = 56; // Integer | 
try {
    Empty result = apiInstance.createNodesNodePatchSyncItem(nodesNodePatchSyncItem, lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeClusterApi#createNodesNodePatchSyncItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nodesNodePatchSyncItem** | [**Empty**](Empty.md)|  |
 **lnn** | **Integer**|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNodesNodeFirmwareStatus"></a>
# **getNodesNodeFirmwareStatus**
> NodesNodeFirmwareStatus getNodesNodeFirmwareStatus(lnn, devices, _package)



The firmware status for the node.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UpgradeClusterApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

UpgradeClusterApi apiInstance = new UpgradeClusterApi();
Integer lnn = 56; // Integer | 
Boolean devices = true; // Boolean | Show devices. If false, this returns an empty list. Default is false.
Boolean _package = true; // Boolean | Show package. If false, this returns an empty list.Default is false.
try {
    NodesNodeFirmwareStatus result = apiInstance.getNodesNodeFirmwareStatus(lnn, devices, _package);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UpgradeClusterApi#getNodesNodeFirmwareStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**|  |
 **devices** | **Boolean**| Show devices. If false, this returns an empty list. Default is false. | [optional]
 **_package** | **Boolean**| Show package. If false, this returns an empty list.Default is false. | [optional]

### Return type

[**NodesNodeFirmwareStatus**](NodesNodeFirmwareStatus.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

