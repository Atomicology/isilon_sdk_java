# SyncPoliciesApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPolicyResetItem**](SyncPoliciesApi.md#createPolicyResetItem) | **POST** /platform/1/sync/policies/{Policy}/reset | 


<a name="createPolicyResetItem"></a>
# **createPolicyResetItem**
> CreateResponse createPolicyResetItem(policyResetItem, policy)



Reset a SyncIQ policy incremental state and force a full sync/copy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SyncPoliciesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

SyncPoliciesApi apiInstance = new SyncPoliciesApi();
Empty policyResetItem = new Empty(); // Empty | 
String policy = "policy_example"; // String | 
try {
    CreateResponse result = apiInstance.createPolicyResetItem(policyResetItem, policy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SyncPoliciesApi#createPolicyResetItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **policyResetItem** | [**Empty**](Empty.md)|  |
 **policy** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

