# AuditApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuditTopic**](AuditApi.md#createAuditTopic) | **POST** /platform/1/audit/topics | 
[**deleteAuditTopic**](AuditApi.md#deleteAuditTopic) | **DELETE** /platform/1/audit/topics/{AuditTopicId} | 
[**getAuditProgress**](AuditApi.md#getAuditProgress) | **GET** /platform/4/audit/progress | 
[**getAuditSettings**](AuditApi.md#getAuditSettings) | **GET** /platform/3/audit/settings | 
[**getAuditTopic**](AuditApi.md#getAuditTopic) | **GET** /platform/1/audit/topics/{AuditTopicId} | 
[**getProgressGlobal**](AuditApi.md#getProgressGlobal) | **GET** /platform/4/audit/progress/global | 
[**getSettingsGlobal**](AuditApi.md#getSettingsGlobal) | **GET** /platform/3/audit/settings/global | 
[**listAuditTopics**](AuditApi.md#listAuditTopics) | **GET** /platform/1/audit/topics | 
[**updateAuditSettings**](AuditApi.md#updateAuditSettings) | **PUT** /platform/3/audit/settings | 
[**updateAuditTopic**](AuditApi.md#updateAuditTopic) | **PUT** /platform/1/audit/topics/{AuditTopicId} | 
[**updateSettingsGlobal**](AuditApi.md#updateSettingsGlobal) | **PUT** /platform/3/audit/settings/global | 


<a name="createAuditTopic"></a>
# **createAuditTopic**
> CreateResponse createAuditTopic(auditTopic)



Create a new audit topic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
AuditTopicCreateParams auditTopic = new AuditTopicCreateParams(); // AuditTopicCreateParams | 
try {
    CreateResponse result = apiInstance.createAuditTopic(auditTopic);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#createAuditTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTopic** | [**AuditTopicCreateParams**](AuditTopicCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuditTopic"></a>
# **deleteAuditTopic**
> deleteAuditTopic(auditTopicId)



Delete the audit topic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditTopicId = "auditTopicId_example"; // String | Delete the audit topic.
try {
    apiInstance.deleteAuditTopic(auditTopicId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#deleteAuditTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTopicId** | **String**| Delete the audit topic. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditProgress"></a>
# **getAuditProgress**
> AuditProgress getAuditProgress(lnn)



View current audit log time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
Integer lnn = 56; // Integer | lnn of the node.
try {
    AuditProgress result = apiInstance.getAuditProgress(lnn);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditProgress");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **lnn** | **Integer**| lnn of the node. | [optional]

### Return type

[**AuditProgress**](AuditProgress.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditSettings"></a>
# **getAuditSettings**
> AuditSettings getAuditSettings(zone)



View per-Access Zone Audit settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String zone = "zone_example"; // String | Access zone which contains audit settings.
try {
    AuditSettings result = apiInstance.getAuditSettings(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| Access zone which contains audit settings. | [optional]

### Return type

[**AuditSettings**](AuditSettings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuditTopic"></a>
# **getAuditTopic**
> AuditTopics getAuditTopic(auditTopicId)



Retrieve the audit topic information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
String auditTopicId = "auditTopicId_example"; // String | Retrieve the audit topic information.
try {
    AuditTopics result = apiInstance.getAuditTopic(auditTopicId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getAuditTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTopicId** | **String**| Retrieve the audit topic information. |

### Return type

[**AuditTopics**](AuditTopics.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProgressGlobal"></a>
# **getProgressGlobal**
> ProgressGlobal getProgressGlobal()



View the global audit log time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
try {
    ProgressGlobal result = apiInstance.getProgressGlobal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getProgressGlobal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ProgressGlobal**](ProgressGlobal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsGlobal"></a>
# **getSettingsGlobal**
> SettingsGlobalExtended getSettingsGlobal()



View Global Audit settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
try {
    SettingsGlobalExtended result = apiInstance.getSettingsGlobal();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#getSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsGlobalExtended**](SettingsGlobalExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAuditTopics"></a>
# **listAuditTopics**
> AuditTopicsExtended listAuditTopics()



Retrieve a list of audit topics.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
try {
    AuditTopicsExtended result = apiInstance.listAuditTopics();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#listAuditTopics");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuditTopicsExtended**](AuditTopicsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuditSettings"></a>
# **updateAuditSettings**
> updateAuditSettings(auditSettings, zone)



Modify per-Access Zone Audit settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
AuditSettingsSettings auditSettings = new AuditSettingsSettings(); // AuditSettingsSettings | 
String zone = "zone_example"; // String | Access zone which contains audit settings.
try {
    apiInstance.updateAuditSettings(auditSettings, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#updateAuditSettings");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditSettings** | [**AuditSettingsSettings**](AuditSettingsSettings.md)|  |
 **zone** | **String**| Access zone which contains audit settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuditTopic"></a>
# **updateAuditTopic**
> updateAuditTopic(auditTopic, auditTopicId)



Modify the audit topic.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
AuditTopic auditTopic = new AuditTopic(); // AuditTopic | 
String auditTopicId = "auditTopicId_example"; // String | Modify the audit topic.
try {
    apiInstance.updateAuditTopic(auditTopic, auditTopicId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#updateAuditTopic");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auditTopic** | [**AuditTopic**](AuditTopic.md)|  |
 **auditTopicId** | **String**| Modify the audit topic. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsGlobal"></a>
# **updateSettingsGlobal**
> updateSettingsGlobal(settingsGlobal)



Modify Global Audit settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuditApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuditApi apiInstance = new AuditApi();
SettingsGlobalSettings settingsGlobal = new SettingsGlobalSettings(); // SettingsGlobalSettings | 
try {
    apiInstance.updateSettingsGlobal(settingsGlobal);
} catch (ApiException e) {
    System.err.println("Exception when calling AuditApi#updateSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsGlobal** | [**SettingsGlobalSettings**](SettingsGlobalSettings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

