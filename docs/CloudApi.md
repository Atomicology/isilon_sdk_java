# CloudApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCloudAccessItem**](CloudApi.md#createCloudAccessItem) | **POST** /platform/3/cloud/access | 
[**createCloudAccount**](CloudApi.md#createCloudAccount) | **POST** /platform/4/cloud/accounts | 
[**createCloudJob**](CloudApi.md#createCloudJob) | **POST** /platform/3/cloud/jobs | 
[**createCloudPool**](CloudApi.md#createCloudPool) | **POST** /platform/3/cloud/pools | 
[**createCloudProxy**](CloudApi.md#createCloudProxy) | **POST** /platform/4/cloud/proxies | 
[**createSettingsEncryptionKeyItem**](CloudApi.md#createSettingsEncryptionKeyItem) | **POST** /platform/3/cloud/settings/encryption-key | 
[**createSettingsReportingEulaItem**](CloudApi.md#createSettingsReportingEulaItem) | **POST** /platform/3/cloud/settings/reporting-eula | 
[**deleteCloudAccessGuid**](CloudApi.md#deleteCloudAccessGuid) | **DELETE** /platform/3/cloud/access/{CloudAccessGuid} | 
[**deleteCloudAccount**](CloudApi.md#deleteCloudAccount) | **DELETE** /platform/4/cloud/accounts/{CloudAccountId} | 
[**deleteCloudPool**](CloudApi.md#deleteCloudPool) | **DELETE** /platform/3/cloud/pools/{CloudPoolId} | 
[**deleteCloudProxy**](CloudApi.md#deleteCloudProxy) | **DELETE** /platform/4/cloud/proxies/{CloudProxyId} | 
[**deleteSettingsReportingEula**](CloudApi.md#deleteSettingsReportingEula) | **DELETE** /platform/3/cloud/settings/reporting-eula | 
[**getCloudAccessGuid**](CloudApi.md#getCloudAccessGuid) | **GET** /platform/3/cloud/access/{CloudAccessGuid} | 
[**getCloudAccount**](CloudApi.md#getCloudAccount) | **GET** /platform/4/cloud/accounts/{CloudAccountId} | 
[**getCloudJob**](CloudApi.md#getCloudJob) | **GET** /platform/3/cloud/jobs/{CloudJobId} | 
[**getCloudJobsFile**](CloudApi.md#getCloudJobsFile) | **GET** /platform/3/cloud/jobs-files/{CloudJobsFileId} | 
[**getCloudPool**](CloudApi.md#getCloudPool) | **GET** /platform/3/cloud/pools/{CloudPoolId} | 
[**getCloudProxy**](CloudApi.md#getCloudProxy) | **GET** /platform/4/cloud/proxies/{CloudProxyId} | 
[**getCloudSettings**](CloudApi.md#getCloudSettings) | **GET** /platform/3/cloud/settings | 
[**listCloudAccess**](CloudApi.md#listCloudAccess) | **GET** /platform/3/cloud/access | 
[**listCloudAccounts**](CloudApi.md#listCloudAccounts) | **GET** /platform/4/cloud/accounts | 
[**listCloudJobs**](CloudApi.md#listCloudJobs) | **GET** /platform/3/cloud/jobs | 
[**listCloudPools**](CloudApi.md#listCloudPools) | **GET** /platform/3/cloud/pools | 
[**listCloudProxies**](CloudApi.md#listCloudProxies) | **GET** /platform/4/cloud/proxies | 
[**listSettingsReportingEula**](CloudApi.md#listSettingsReportingEula) | **GET** /platform/3/cloud/settings/reporting-eula | 
[**updateCloudAccount**](CloudApi.md#updateCloudAccount) | **PUT** /platform/4/cloud/accounts/{CloudAccountId} | 
[**updateCloudJob**](CloudApi.md#updateCloudJob) | **PUT** /platform/3/cloud/jobs/{CloudJobId} | 
[**updateCloudPool**](CloudApi.md#updateCloudPool) | **PUT** /platform/3/cloud/pools/{CloudPoolId} | 
[**updateCloudProxy**](CloudApi.md#updateCloudProxy) | **PUT** /platform/4/cloud/proxies/{CloudProxyId} | 
[**updateCloudSettings**](CloudApi.md#updateCloudSettings) | **PUT** /platform/3/cloud/settings | 


<a name="createCloudAccessItem"></a>
# **createCloudAccessItem**
> Empty createCloudAccessItem(cloudAccessItem)



Add a cluster identifier to access list.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudAccessItem cloudAccessItem = new CloudAccessItem(); // CloudAccessItem | 
try {
    Empty result = apiInstance.createCloudAccessItem(cloudAccessItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createCloudAccessItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccessItem** | [**CloudAccessItem**](CloudAccessItem.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCloudAccount"></a>
# **createCloudAccount**
> CreateCloudAccountResponse createCloudAccount(cloudAccount)



Create a new account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudAccountCreateParams cloudAccount = new CloudAccountCreateParams(); // CloudAccountCreateParams | 
try {
    CreateCloudAccountResponse result = apiInstance.createCloudAccount(cloudAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createCloudAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccount** | [**CloudAccountCreateParams**](CloudAccountCreateParams.md)|  |

### Return type

[**CreateCloudAccountResponse**](CreateCloudAccountResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCloudJob"></a>
# **createCloudJob**
> CreateCloudJobResponse createCloudJob(cloudJob)



Create a new job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudJobCreateParams cloudJob = new CloudJobCreateParams(); // CloudJobCreateParams | 
try {
    CreateCloudJobResponse result = apiInstance.createCloudJob(cloudJob);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudJob** | [**CloudJobCreateParams**](CloudJobCreateParams.md)|  |

### Return type

[**CreateCloudJobResponse**](CreateCloudJobResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCloudPool"></a>
# **createCloudPool**
> CreateCloudPoolResponse createCloudPool(cloudPool)



Create a new pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudPoolCreateParams cloudPool = new CloudPoolCreateParams(); // CloudPoolCreateParams | 
try {
    CreateCloudPoolResponse result = apiInstance.createCloudPool(cloudPool);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPool** | [**CloudPoolCreateParams**](CloudPoolCreateParams.md)|  |

### Return type

[**CreateCloudPoolResponse**](CreateCloudPoolResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createCloudProxy"></a>
# **createCloudProxy**
> CreateCloudProxyResponse createCloudProxy(cloudProxy)



Create a new proxy.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudProxyCreateParams cloudProxy = new CloudProxyCreateParams(); // CloudProxyCreateParams | 
try {
    CreateCloudProxyResponse result = apiInstance.createCloudProxy(cloudProxy);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createCloudProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProxy** | [**CloudProxyCreateParams**](CloudProxyCreateParams.md)|  |

### Return type

[**CreateCloudProxyResponse**](CreateCloudProxyResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsEncryptionKeyItem"></a>
# **createSettingsEncryptionKeyItem**
> Empty createSettingsEncryptionKeyItem(settingsEncryptionKeyItem)



Regenerate master encryption key.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
Empty settingsEncryptionKeyItem = new Empty(); // Empty | 
try {
    Empty result = apiInstance.createSettingsEncryptionKeyItem(settingsEncryptionKeyItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createSettingsEncryptionKeyItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsEncryptionKeyItem** | [**Empty**](Empty.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsReportingEulaItem"></a>
# **createSettingsReportingEulaItem**
> SettingsReportingEulaItem createSettingsReportingEulaItem(settingsReportingEulaItem)



Accept telemetry collection EULA.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
SettingsReportingEulaItem settingsReportingEulaItem = new SettingsReportingEulaItem(); // SettingsReportingEulaItem | 
try {
    SettingsReportingEulaItem result = apiInstance.createSettingsReportingEulaItem(settingsReportingEulaItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#createSettingsReportingEulaItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsReportingEulaItem** | [**SettingsReportingEulaItem**](SettingsReportingEulaItem.md)|  |

### Return type

[**SettingsReportingEulaItem**](SettingsReportingEulaItem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudAccessGuid"></a>
# **deleteCloudAccessGuid**
> deleteCloudAccessGuid(cloudAccessGuid)



Delete cloud access.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudAccessGuid = "cloudAccessGuid_example"; // String | Delete cloud access.
try {
    apiInstance.deleteCloudAccessGuid(cloudAccessGuid);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteCloudAccessGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccessGuid** | **String**| Delete cloud access. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudAccount"></a>
# **deleteCloudAccount**
> deleteCloudAccount(cloudAccountId, acknowledgeForceDelete)



Delete cloud account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudAccountId = "cloudAccountId_example"; // String | Delete cloud account.
String acknowledgeForceDelete = "acknowledgeForceDelete_example"; // String | A value of 1 acknowledges that the user is deleting data.
try {
    apiInstance.deleteCloudAccount(cloudAccountId, acknowledgeForceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteCloudAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccountId** | **String**| Delete cloud account. |
 **acknowledgeForceDelete** | **String**| A value of 1 acknowledges that the user is deleting data. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudPool"></a>
# **deleteCloudPool**
> deleteCloudPool(cloudPoolId, acknowledgeForceDelete)



Delete a cloud pool.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudPoolId = "cloudPoolId_example"; // String | Delete a cloud pool.
String acknowledgeForceDelete = "acknowledgeForceDelete_example"; // String | A value of 1 acknowledges that the user is deleting data.
try {
    apiInstance.deleteCloudPool(cloudPoolId, acknowledgeForceDelete);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPoolId** | **String**| Delete a cloud pool. |
 **acknowledgeForceDelete** | **String**| A value of 1 acknowledges that the user is deleting data. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCloudProxy"></a>
# **deleteCloudProxy**
> deleteCloudProxy(cloudProxyId)



Delete cloud account.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudProxyId = "cloudProxyId_example"; // String | Delete cloud account.
try {
    apiInstance.deleteCloudProxy(cloudProxyId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteCloudProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProxyId** | **String**| Delete cloud account. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsReportingEula"></a>
# **deleteSettingsReportingEula**
> deleteSettingsReportingEula()



Revoke acceptance of telemetry collection EULA.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
try {
    apiInstance.deleteSettingsReportingEula();
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#deleteSettingsReportingEula");
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

<a name="getCloudAccessGuid"></a>
# **getCloudAccessGuid**
> CloudAccess getCloudAccessGuid(cloudAccessGuid)



Retrieve cloud access information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudAccessGuid = "cloudAccessGuid_example"; // String | Retrieve cloud access information.
try {
    CloudAccess result = apiInstance.getCloudAccessGuid(cloudAccessGuid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudAccessGuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccessGuid** | **String**| Retrieve cloud access information. |

### Return type

[**CloudAccess**](CloudAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudAccount"></a>
# **getCloudAccount**
> CloudAccounts getCloudAccount(cloudAccountId)



Retrieve cloud account information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudAccountId = "cloudAccountId_example"; // String | Retrieve cloud account information.
try {
    CloudAccounts result = apiInstance.getCloudAccount(cloudAccountId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccountId** | **String**| Retrieve cloud account information. |

### Return type

[**CloudAccounts**](CloudAccounts.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudJob"></a>
# **getCloudJob**
> CloudJobs getCloudJob(cloudJobId)



Retrieve cloudpool job information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudJobId = "cloudJobId_example"; // String | Retrieve cloudpool job information.
try {
    CloudJobs result = apiInstance.getCloudJob(cloudJobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudJobId** | **String**| Retrieve cloudpool job information. |

### Return type

[**CloudJobs**](CloudJobs.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudJobsFile"></a>
# **getCloudJobsFile**
> CloudJobsFiles getCloudJobsFile(cloudJobsFileId, sort, resume, batch, limit, page, dir)



Retrieve files associated with a cloudpool job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudJobsFileId = "cloudJobsFileId_example"; // String | Retrieve files associated with a cloudpool job.
String sort = "sort_example"; // String | The field that will be used for sorting.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean batch = true; // Boolean | If true, only \"limit\" and \"page\" arguments are honored.  Query will return all results, unsorted, as quickly as possible.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Integer page = 56; // Integer | Works only when \"batch\" parameter and \"limit\" parameters are specified.  Indicates which the page index of results to be returned
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudJobsFiles result = apiInstance.getCloudJobsFile(cloudJobsFileId, sort, resume, batch, limit, page, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudJobsFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudJobsFileId** | **String**| Retrieve files associated with a cloudpool job. |
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **batch** | **Boolean**| If true, only \&quot;limit\&quot; and \&quot;page\&quot; arguments are honored.  Query will return all results, unsorted, as quickly as possible. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **page** | **Integer**| Works only when \&quot;batch\&quot; parameter and \&quot;limit\&quot; parameters are specified.  Indicates which the page index of results to be returned | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudJobsFiles**](CloudJobsFiles.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudPool"></a>
# **getCloudPool**
> CloudPools getCloudPool(cloudPoolId)



Retrieve cloud pool information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudPoolId = "cloudPoolId_example"; // String | Retrieve cloud pool information
try {
    CloudPools result = apiInstance.getCloudPool(cloudPoolId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPoolId** | **String**| Retrieve cloud pool information |

### Return type

[**CloudPools**](CloudPools.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudProxy"></a>
# **getCloudProxy**
> CloudProxies getCloudProxy(cloudProxyId)



Retrieve cloud account information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String cloudProxyId = "cloudProxyId_example"; // String | Retrieve cloud account information.
try {
    CloudProxies result = apiInstance.getCloudProxy(cloudProxyId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProxyId** | **String**| Retrieve cloud account information. |

### Return type

[**CloudProxies**](CloudProxies.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCloudSettings"></a>
# **getCloudSettings**
> CloudSettings getCloudSettings()



List all cloud settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
try {
    CloudSettings result = apiInstance.getCloudSettings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#getCloudSettings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CloudSettings**](CloudSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudAccess"></a>
# **listCloudAccess**
> CloudAccessExtended listCloudAccess(sort, limit, dir)



List all accessible cluster identifiers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudAccessExtended result = apiInstance.listCloudAccess(sort, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listCloudAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudAccessExtended**](CloudAccessExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudAccounts"></a>
# **listCloudAccounts**
> CloudAccountsExtended listCloudAccounts(sort, limit, dir)



List all accounts.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudAccountsExtended result = apiInstance.listCloudAccounts(sort, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listCloudAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudAccountsExtended**](CloudAccountsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudJobs"></a>
# **listCloudJobs**
> CloudJobsExtended listCloudJobs(sort, limit, dir)



List all cloudpools jobs.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudJobsExtended result = apiInstance.listCloudJobs(sort, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listCloudJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudJobsExtended**](CloudJobsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudPools"></a>
# **listCloudPools**
> CloudPoolsExtended listCloudPools(sort, limit, dir)



List all pools.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudPoolsExtended result = apiInstance.listCloudPools(sort, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listCloudPools");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudPoolsExtended**](CloudPoolsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCloudProxies"></a>
# **listCloudProxies**
> CloudProxiesExtended listCloudProxies(sort, limit, dir)



List all proxies.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
try {
    CloudProxiesExtended result = apiInstance.listCloudProxies(sort, limit, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listCloudProxies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**CloudProxiesExtended**](CloudProxiesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSettingsReportingEula"></a>
# **listSettingsReportingEula**
> SettingsReportingEulaItem listSettingsReportingEula()



View telemetry collection EULA acceptance and content URI.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
try {
    SettingsReportingEulaItem result = apiInstance.listSettingsReportingEula();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#listSettingsReportingEula");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsReportingEulaItem**](SettingsReportingEulaItem.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudAccount"></a>
# **updateCloudAccount**
> updateCloudAccount(cloudAccount, cloudAccountId)



Modify cloud account.  All fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudAccount cloudAccount = new CloudAccount(); // CloudAccount | 
String cloudAccountId = "cloudAccountId_example"; // String | Modify cloud account.  All fields are optional, but one or more must be supplied.
try {
    apiInstance.updateCloudAccount(cloudAccount, cloudAccountId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#updateCloudAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudAccount** | [**CloudAccount**](CloudAccount.md)|  |
 **cloudAccountId** | **String**| Modify cloud account.  All fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudJob"></a>
# **updateCloudJob**
> updateCloudJob(cloudJob, cloudJobId)



Modify a cloud job or operation.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudJob cloudJob = new CloudJob(); // CloudJob | 
String cloudJobId = "cloudJobId_example"; // String | Modify a cloud job or operation.
try {
    apiInstance.updateCloudJob(cloudJob, cloudJobId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#updateCloudJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudJob** | [**CloudJob**](CloudJob.md)|  |
 **cloudJobId** | **String**| Modify a cloud job or operation. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudPool"></a>
# **updateCloudPool**
> updateCloudPool(cloudPool, cloudPoolId)



Modify a cloud pool.  All fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudPool cloudPool = new CloudPool(); // CloudPool | 
String cloudPoolId = "cloudPoolId_example"; // String | Modify a cloud pool.  All fields are optional, but one or more must be supplied.
try {
    apiInstance.updateCloudPool(cloudPool, cloudPoolId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#updateCloudPool");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudPool** | [**CloudPool**](CloudPool.md)|  |
 **cloudPoolId** | **String**| Modify a cloud pool.  All fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudProxy"></a>
# **updateCloudProxy**
> updateCloudProxy(cloudProxy, cloudProxyId)



Modify cloud account.  All fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudProxy cloudProxy = new CloudProxy(); // CloudProxy | 
String cloudProxyId = "cloudProxyId_example"; // String | Modify cloud account.  All fields are optional, but one or more must be supplied.
try {
    apiInstance.updateCloudProxy(cloudProxy, cloudProxyId);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#updateCloudProxy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudProxy** | [**CloudProxy**](CloudProxy.md)|  |
 **cloudProxyId** | **String**| Modify cloud account.  All fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCloudSettings"></a>
# **updateCloudSettings**
> updateCloudSettings(cloudSettings)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CloudApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CloudApi apiInstance = new CloudApi();
CloudSettingsSettings cloudSettings = new CloudSettingsSettings(); // CloudSettingsSettings | 
try {
    apiInstance.updateCloudSettings(cloudSettings);
} catch (ApiException e) {
    System.err.println("Exception when calling CloudApi#updateCloudSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudSettings** | [**CloudSettingsSettings**](CloudSettingsSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

