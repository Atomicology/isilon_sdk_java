# FilepoolApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFilepoolPolicy**](FilepoolApi.md#createFilepoolPolicy) | **POST** /platform/4/filepool/policies | 
[**deleteFilepoolPolicy**](FilepoolApi.md#deleteFilepoolPolicy) | **DELETE** /platform/4/filepool/policies/{FilepoolPolicyId} | 
[**getFilepoolDefaultPolicy**](FilepoolApi.md#getFilepoolDefaultPolicy) | **GET** /platform/4/filepool/default-policy | 
[**getFilepoolPolicy**](FilepoolApi.md#getFilepoolPolicy) | **GET** /platform/4/filepool/policies/{FilepoolPolicyId} | 
[**getFilepoolTemplate**](FilepoolApi.md#getFilepoolTemplate) | **GET** /platform/4/filepool/templates/{FilepoolTemplateId} | 
[**getFilepoolTemplates**](FilepoolApi.md#getFilepoolTemplates) | **GET** /platform/4/filepool/templates | 
[**listFilepoolPolicies**](FilepoolApi.md#listFilepoolPolicies) | **GET** /platform/4/filepool/policies | 
[**updateFilepoolDefaultPolicy**](FilepoolApi.md#updateFilepoolDefaultPolicy) | **PUT** /platform/4/filepool/default-policy | 
[**updateFilepoolPolicy**](FilepoolApi.md#updateFilepoolPolicy) | **PUT** /platform/4/filepool/policies/{FilepoolPolicyId} | 


<a name="createFilepoolPolicy"></a>
# **createFilepoolPolicy**
> CreateFilepoolPolicyResponse createFilepoolPolicy(filepoolPolicy)



Create a new policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
FilepoolPolicyCreateParams filepoolPolicy = new FilepoolPolicyCreateParams(); // FilepoolPolicyCreateParams | 
try {
    CreateFilepoolPolicyResponse result = apiInstance.createFilepoolPolicy(filepoolPolicy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#createFilepoolPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolPolicy** | [**FilepoolPolicyCreateParams**](FilepoolPolicyCreateParams.md)|  |

### Return type

[**CreateFilepoolPolicyResponse**](CreateFilepoolPolicyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFilepoolPolicy"></a>
# **deleteFilepoolPolicy**
> deleteFilepoolPolicy(filepoolPolicyId)



Delete file pool policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
String filepoolPolicyId = "filepoolPolicyId_example"; // String | Delete file pool policy.
try {
    apiInstance.deleteFilepoolPolicy(filepoolPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#deleteFilepoolPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolPolicyId** | **String**| Delete file pool policy. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilepoolDefaultPolicy"></a>
# **getFilepoolDefaultPolicy**
> FilepoolDefaultPolicy getFilepoolDefaultPolicy()



List default file pool policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
try {
    FilepoolDefaultPolicy result = apiInstance.getFilepoolDefaultPolicy();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#getFilepoolDefaultPolicy");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilepoolDefaultPolicy**](FilepoolDefaultPolicy.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilepoolPolicy"></a>
# **getFilepoolPolicy**
> FilepoolPolicies getFilepoolPolicy(filepoolPolicyId)



Retrieve file pool policy information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
String filepoolPolicyId = "filepoolPolicyId_example"; // String | Retrieve file pool policy information.
try {
    FilepoolPolicies result = apiInstance.getFilepoolPolicy(filepoolPolicyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#getFilepoolPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolPolicyId** | **String**| Retrieve file pool policy information. |

### Return type

[**FilepoolPolicies**](FilepoolPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilepoolTemplate"></a>
# **getFilepoolTemplate**
> FilepoolTemplates getFilepoolTemplate(filepoolTemplateId)



List all templates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
String filepoolTemplateId = "filepoolTemplateId_example"; // String | List all templates.
try {
    FilepoolTemplates result = apiInstance.getFilepoolTemplate(filepoolTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#getFilepoolTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolTemplateId** | **String**| List all templates. |

### Return type

[**FilepoolTemplates**](FilepoolTemplates.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilepoolTemplates"></a>
# **getFilepoolTemplates**
> FilepoolTemplates getFilepoolTemplates()



List all templates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
try {
    FilepoolTemplates result = apiInstance.getFilepoolTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#getFilepoolTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilepoolTemplates**](FilepoolTemplates.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFilepoolPolicies"></a>
# **listFilepoolPolicies**
> FilepoolPolicies listFilepoolPolicies()



List all policies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
try {
    FilepoolPolicies result = apiInstance.listFilepoolPolicies();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#listFilepoolPolicies");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FilepoolPolicies**](FilepoolPolicies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFilepoolDefaultPolicy"></a>
# **updateFilepoolDefaultPolicy**
> updateFilepoolDefaultPolicy(filepoolDefaultPolicy)



Set default file pool policy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
FilepoolDefaultPolicyExtended filepoolDefaultPolicy = new FilepoolDefaultPolicyExtended(); // FilepoolDefaultPolicyExtended | 
try {
    apiInstance.updateFilepoolDefaultPolicy(filepoolDefaultPolicy);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#updateFilepoolDefaultPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolDefaultPolicy** | [**FilepoolDefaultPolicyExtended**](FilepoolDefaultPolicyExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFilepoolPolicy"></a>
# **updateFilepoolPolicy**
> updateFilepoolPolicy(filepoolPolicy, filepoolPolicyId)



Modify file pool policy. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilepoolApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

FilepoolApi apiInstance = new FilepoolApi();
FilepoolPolicy filepoolPolicy = new FilepoolPolicy(); // FilepoolPolicy | 
String filepoolPolicyId = "filepoolPolicyId_example"; // String | Modify file pool policy. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateFilepoolPolicy(filepoolPolicy, filepoolPolicyId);
} catch (ApiException e) {
    System.err.println("Exception when calling FilepoolApi#updateFilepoolPolicy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepoolPolicy** | [**FilepoolPolicy**](FilepoolPolicy.md)|  |
 **filepoolPolicyId** | **String**| Modify file pool policy. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

