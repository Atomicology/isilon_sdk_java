# QuotaQuotasApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuotaNotification**](QuotaQuotasApi.md#createQuotaNotification) | **POST** /platform/1/quota/quotas/{Qid}/notifications | 
[**deleteQuotaNotification**](QuotaQuotasApi.md#deleteQuotaNotification) | **DELETE** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} | 
[**deleteQuotaNotifications**](QuotaQuotasApi.md#deleteQuotaNotifications) | **DELETE** /platform/1/quota/quotas/{Qid}/notifications | 
[**getQuotaNotification**](QuotaQuotasApi.md#getQuotaNotification) | **GET** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} | 
[**listQuotaNotifications**](QuotaQuotasApi.md#listQuotaNotifications) | **GET** /platform/1/quota/quotas/{Qid}/notifications | 
[**updateQuotaNotification**](QuotaQuotasApi.md#updateQuotaNotification) | **PUT** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} | 
[**updateQuotaNotifications**](QuotaQuotasApi.md#updateQuotaNotifications) | **PUT** /platform/1/quota/quotas/{Qid}/notifications | 


<a name="createQuotaNotification"></a>
# **createQuotaNotification**
> CreateResponse createQuotaNotification(quotaNotification, qid)



Create a new notification rule specific to this quota.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
QuotaNotificationCreateParams quotaNotification = new QuotaNotificationCreateParams(); // QuotaNotificationCreateParams | 
String qid = "qid_example"; // String | 
try {
    CreateResponse result = apiInstance.createQuotaNotification(quotaNotification, qid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#createQuotaNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaNotification** | [**QuotaNotificationCreateParams**](QuotaNotificationCreateParams.md)|  |
 **qid** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuotaNotification"></a>
# **deleteQuotaNotification**
> deleteQuotaNotification(quotaNotificationId, qid)



Delete the notification rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
String quotaNotificationId = "quotaNotificationId_example"; // String | Delete the notification rule.
String qid = "qid_example"; // String | 
try {
    apiInstance.deleteQuotaNotification(quotaNotificationId, qid);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#deleteQuotaNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaNotificationId** | **String**| Delete the notification rule. |
 **qid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuotaNotifications"></a>
# **deleteQuotaNotifications**
> deleteQuotaNotifications(qid)



Delete all quota specific rules. The quota will then use the global rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
String qid = "qid_example"; // String | 
try {
    apiInstance.deleteQuotaNotifications(qid);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#deleteQuotaNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuotaNotification"></a>
# **getQuotaNotification**
> QuotaNotifications getQuotaNotification(quotaNotificationId, qid)



Retrieve notification rule information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
String quotaNotificationId = "quotaNotificationId_example"; // String | Retrieve notification rule information.
String qid = "qid_example"; // String | 
try {
    QuotaNotifications result = apiInstance.getQuotaNotification(quotaNotificationId, qid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#getQuotaNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaNotificationId** | **String**| Retrieve notification rule information. |
 **qid** | **String**|  |

### Return type

[**QuotaNotifications**](QuotaNotifications.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listQuotaNotifications"></a>
# **listQuotaNotifications**
> QuotaNotificationsExtended listQuotaNotifications(qid)



List all rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
String qid = "qid_example"; // String | 
try {
    QuotaNotificationsExtended result = apiInstance.listQuotaNotifications(qid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#listQuotaNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **qid** | **String**|  |

### Return type

[**QuotaNotificationsExtended**](QuotaNotificationsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuotaNotification"></a>
# **updateQuotaNotification**
> updateQuotaNotification(quotaNotification, quotaNotificationId, qid)



Modify notification rule. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
QuotaNotification quotaNotification = new QuotaNotification(); // QuotaNotification | 
String quotaNotificationId = "quotaNotificationId_example"; // String | Modify notification rule. All input fields are optional, but one or more must be supplied.
String qid = "qid_example"; // String | 
try {
    apiInstance.updateQuotaNotification(quotaNotification, quotaNotificationId, qid);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#updateQuotaNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaNotification** | [**QuotaNotification**](QuotaNotification.md)|  |
 **quotaNotificationId** | **String**| Modify notification rule. All input fields are optional, but one or more must be supplied. |
 **qid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuotaNotifications"></a>
# **updateQuotaNotifications**
> updateQuotaNotifications(quotaNotifications, qid)



This method creates an empty set of rules so that the global rules are not used. The input must be an empty JSON object.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaQuotasApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaQuotasApi apiInstance = new QuotaQuotasApi();
Empty quotaNotifications = new Empty(); // Empty | 
String qid = "qid_example"; // String | 
try {
    apiInstance.updateQuotaNotifications(quotaNotifications, qid);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaQuotasApi#updateQuotaNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaNotifications** | [**Empty**](Empty.md)|  |
 **qid** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

