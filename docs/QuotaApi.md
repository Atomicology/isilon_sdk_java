# QuotaApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createQuotaQuota**](QuotaApi.md#createQuotaQuota) | **POST** /platform/1/quota/quotas | 
[**createQuotaReport**](QuotaApi.md#createQuotaReport) | **POST** /platform/1/quota/reports | 
[**createSettingsMapping**](QuotaApi.md#createSettingsMapping) | **POST** /platform/1/quota/settings/mappings | 
[**createSettingsNotification**](QuotaApi.md#createSettingsNotification) | **POST** /platform/1/quota/settings/notifications | 
[**deleteQuotaQuota**](QuotaApi.md#deleteQuotaQuota) | **DELETE** /platform/1/quota/quotas/{QuotaQuotaId} | 
[**deleteQuotaQuotas**](QuotaApi.md#deleteQuotaQuotas) | **DELETE** /platform/1/quota/quotas | 
[**deleteQuotaReport**](QuotaApi.md#deleteQuotaReport) | **DELETE** /platform/1/quota/reports/{QuotaReportId} | 
[**deleteSettingsMapping**](QuotaApi.md#deleteSettingsMapping) | **DELETE** /platform/1/quota/settings/mappings/{SettingsMappingId} | 
[**deleteSettingsMappings**](QuotaApi.md#deleteSettingsMappings) | **DELETE** /platform/1/quota/settings/mappings | 
[**deleteSettingsNotification**](QuotaApi.md#deleteSettingsNotification) | **DELETE** /platform/1/quota/settings/notifications/{SettingsNotificationId} | 
[**deleteSettingsNotifications**](QuotaApi.md#deleteSettingsNotifications) | **DELETE** /platform/1/quota/settings/notifications | 
[**getQuotaLicense**](QuotaApi.md#getQuotaLicense) | **GET** /platform/5/quota/license | 
[**getQuotaQuota**](QuotaApi.md#getQuotaQuota) | **GET** /platform/1/quota/quotas/{QuotaQuotaId} | 
[**getQuotaQuotasSummary**](QuotaApi.md#getQuotaQuotasSummary) | **GET** /platform/1/quota/quotas-summary | 
[**getQuotaReport**](QuotaApi.md#getQuotaReport) | **GET** /platform/1/quota/reports/{QuotaReportId} | 
[**getSettingsMapping**](QuotaApi.md#getSettingsMapping) | **GET** /platform/1/quota/settings/mappings/{SettingsMappingId} | 
[**getSettingsNotification**](QuotaApi.md#getSettingsNotification) | **GET** /platform/1/quota/settings/notifications/{SettingsNotificationId} | 
[**getSettingsReports**](QuotaApi.md#getSettingsReports) | **GET** /platform/1/quota/settings/reports | 
[**listQuotaQuotas**](QuotaApi.md#listQuotaQuotas) | **GET** /platform/1/quota/quotas | 
[**listQuotaReports**](QuotaApi.md#listQuotaReports) | **GET** /platform/1/quota/reports | 
[**listSettingsMappings**](QuotaApi.md#listSettingsMappings) | **GET** /platform/1/quota/settings/mappings | 
[**listSettingsNotifications**](QuotaApi.md#listSettingsNotifications) | **GET** /platform/1/quota/settings/notifications | 
[**updateQuotaQuota**](QuotaApi.md#updateQuotaQuota) | **PUT** /platform/1/quota/quotas/{QuotaQuotaId} | 
[**updateSettingsMapping**](QuotaApi.md#updateSettingsMapping) | **PUT** /platform/1/quota/settings/mappings/{SettingsMappingId} | 
[**updateSettingsNotification**](QuotaApi.md#updateSettingsNotification) | **PUT** /platform/1/quota/settings/notifications/{SettingsNotificationId} | 
[**updateSettingsReports**](QuotaApi.md#updateSettingsReports) | **PUT** /platform/1/quota/settings/reports | 


<a name="createQuotaQuota"></a>
# **createQuotaQuota**
> CreateResponse createQuotaQuota(quotaQuota, zone)



Create a new quota.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
QuotaQuotaCreateParams quotaQuota = new QuotaQuotaCreateParams(); // QuotaQuotaCreateParams | 
String zone = "zone_example"; // String | Optional named zone to use for user and group resolution.
try {
    CreateResponse result = apiInstance.createQuotaQuota(quotaQuota, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#createQuotaQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaQuota** | [**QuotaQuotaCreateParams**](QuotaQuotaCreateParams.md)|  |
 **zone** | **String**| Optional named zone to use for user and group resolution. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createQuotaReport"></a>
# **createQuotaReport**
> CreateQuotaReportResponse createQuotaReport(quotaReport)



Create a new report. The type of this report is &#39;manual&#39;; it is also sometimes called &#39;live&#39; or &#39;ad-hoc&#39;.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
Empty quotaReport = new Empty(); // Empty | 
try {
    CreateQuotaReportResponse result = apiInstance.createQuotaReport(quotaReport);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#createQuotaReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaReport** | [**Empty**](Empty.md)|  |

### Return type

[**CreateQuotaReportResponse**](CreateQuotaReportResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsMapping"></a>
# **createSettingsMapping**
> CreateResponse createSettingsMapping(settingsMapping)



Create a new rule. The new rule must not conflict with an existing rule (e.g. match both the type and domain fields).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
SettingsMappingExtendedExtended settingsMapping = new SettingsMappingExtendedExtended(); // SettingsMappingExtendedExtended | 
try {
    CreateResponse result = apiInstance.createSettingsMapping(settingsMapping);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#createSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsMapping** | [**SettingsMappingExtendedExtended**](SettingsMappingExtendedExtended.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsNotification"></a>
# **createSettingsNotification**
> CreateResponse createSettingsNotification(settingsNotification)



Create a new global notification rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
QuotaNotificationCreateParams settingsNotification = new QuotaNotificationCreateParams(); // QuotaNotificationCreateParams | 
try {
    CreateResponse result = apiInstance.createSettingsNotification(settingsNotification);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#createSettingsNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsNotification** | [**QuotaNotificationCreateParams**](QuotaNotificationCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuotaQuota"></a>
# **deleteQuotaQuota**
> deleteQuotaQuota(quotaQuotaId)



Delete the quota.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String quotaQuotaId = "quotaQuotaId_example"; // String | Delete the quota.
try {
    apiInstance.deleteQuotaQuota(quotaQuotaId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteQuotaQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaQuotaId** | **String**| Delete the quota. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuotaQuotas"></a>
# **deleteQuotaQuotas**
> deleteQuotaQuotas(enforced, includeSnapshots, zone, recursePathChildren, recursePathParents, persona, path, type)



Delete all or matching quotas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
Boolean enforced = true; // Boolean | Only delete quotas with this enforcement (non-accounting).
Boolean includeSnapshots = true; // Boolean | Only delete quotas with this setting for include_snapshots.
String zone = "zone_example"; // String | Optional named zone to use for user and group resolution.
Boolean recursePathChildren = true; // Boolean | If used with the path argument, delete all quotas at that path or any descendent sub-directory.
Boolean recursePathParents = true; // Boolean | If used with the path argument, delete all quotas at that path or any parent directory.
String persona = "persona_example"; // String | Only delete user or group quotas matching this persona (must be used with the corresponding type argument).  Format is <PERSONA_TYPE>:<string/integer>, where PERSONA_TYPE is one of USER, GROUP, SID, ID, or GID.
String path = "path_example"; // String | Only delete quotas matching this path (see also recurse_path_*).
String type = "type_example"; // String | Only delete quotas matching this type.
try {
    apiInstance.deleteQuotaQuotas(enforced, includeSnapshots, zone, recursePathChildren, recursePathParents, persona, path, type);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteQuotaQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enforced** | **Boolean**| Only delete quotas with this enforcement (non-accounting). | [optional]
 **includeSnapshots** | **Boolean**| Only delete quotas with this setting for include_snapshots. | [optional]
 **zone** | **String**| Optional named zone to use for user and group resolution. | [optional]
 **recursePathChildren** | **Boolean**| If used with the path argument, delete all quotas at that path or any descendent sub-directory. | [optional]
 **recursePathParents** | **Boolean**| If used with the path argument, delete all quotas at that path or any parent directory. | [optional]
 **persona** | **String**| Only delete user or group quotas matching this persona (must be used with the corresponding type argument).  Format is &lt;PERSONA_TYPE&gt;:&lt;string/integer&gt;, where PERSONA_TYPE is one of USER, GROUP, SID, ID, or GID. | [optional]
 **path** | **String**| Only delete quotas matching this path (see also recurse_path_*). | [optional]
 **type** | **String**| Only delete quotas matching this type. | [optional] [enum: directory, user, group, default-user, default-group]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteQuotaReport"></a>
# **deleteQuotaReport**
> deleteQuotaReport(quotaReportId)



Delete the report.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String quotaReportId = "quotaReportId_example"; // String | Delete the report.
try {
    apiInstance.deleteQuotaReport(quotaReportId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteQuotaReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaReportId** | **String**| Delete the report. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsMapping"></a>
# **deleteSettingsMapping**
> deleteSettingsMapping(settingsMappingId)



Delete the mapping.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String settingsMappingId = "settingsMappingId_example"; // String | Delete the mapping.
try {
    apiInstance.deleteSettingsMapping(settingsMappingId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsMappingId** | **String**| Delete the mapping. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsMappings"></a>
# **deleteSettingsMappings**
> deleteSettingsMappings()



Delete all rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    apiInstance.deleteSettingsMappings();
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteSettingsMappings");
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

<a name="deleteSettingsNotification"></a>
# **deleteSettingsNotification**
> deleteSettingsNotification(settingsNotificationId)



Delete the notification rule.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String settingsNotificationId = "settingsNotificationId_example"; // String | Delete the notification rule.
try {
    apiInstance.deleteSettingsNotification(settingsNotificationId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteSettingsNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsNotificationId** | **String**| Delete the notification rule. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsNotifications"></a>
# **deleteSettingsNotifications**
> deleteSettingsNotifications()



Delete all rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    apiInstance.deleteSettingsNotifications();
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#deleteSettingsNotifications");
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

<a name="getQuotaLicense"></a>
# **getQuotaLicense**
> LicenseLicense getQuotaLicense()



Retrieve license information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    LicenseLicense result = apiInstance.getQuotaLicense();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getQuotaLicense");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseLicense**](LicenseLicense.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuotaQuota"></a>
# **getQuotaQuota**
> QuotaQuotas getQuotaQuota(quotaQuotaId, resolveNames, zone)



Retrieve quota information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String quotaQuotaId = "quotaQuotaId_example"; // String | Retrieve quota information.
Boolean resolveNames = true; // Boolean | If true, resolve group and user names in personas.
String zone = "zone_example"; // String | Optional named zone to use for user and group resolution.
try {
    QuotaQuotas result = apiInstance.getQuotaQuota(quotaQuotaId, resolveNames, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getQuotaQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaQuotaId** | **String**| Retrieve quota information. |
 **resolveNames** | **Boolean**| If true, resolve group and user names in personas. | [optional]
 **zone** | **String**| Optional named zone to use for user and group resolution. | [optional]

### Return type

[**QuotaQuotas**](QuotaQuotas.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuotaQuotasSummary"></a>
# **getQuotaQuotasSummary**
> QuotaQuotasSummary getQuotaQuotasSummary()



Return summary information about quotas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    QuotaQuotasSummary result = apiInstance.getQuotaQuotasSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getQuotaQuotasSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuotaQuotasSummary**](QuotaQuotasSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getQuotaReport"></a>
# **getQuotaReport**
> ReportAbout getQuotaReport(quotaReportId, contents)



Retrieve report data (XML) or contents (meta-data).

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String quotaReportId = "quotaReportId_example"; // String | Retrieve report data (XML) or contents (meta-data).
Boolean contents = true; // Boolean | Display JSON meta-data contents instead of report data.
try {
    ReportAbout result = apiInstance.getQuotaReport(quotaReportId, contents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getQuotaReport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaReportId** | **String**| Retrieve report data (XML) or contents (meta-data). |
 **contents** | **Boolean**| Display JSON meta-data contents instead of report data. | [optional]

### Return type

[**ReportAbout**](ReportAbout.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsMapping"></a>
# **getSettingsMapping**
> SettingsMappings getSettingsMapping(settingsMappingId)



Retrieve the mapping information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String settingsMappingId = "settingsMappingId_example"; // String | Retrieve the mapping information.
try {
    SettingsMappings result = apiInstance.getSettingsMapping(settingsMappingId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsMappingId** | **String**| Retrieve the mapping information. |

### Return type

[**SettingsMappings**](SettingsMappings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsNotification"></a>
# **getSettingsNotification**
> QuotaNotifications getSettingsNotification(settingsNotificationId)



Retrieve notification rule information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String settingsNotificationId = "settingsNotificationId_example"; // String | Retrieve notification rule information.
try {
    QuotaNotifications result = apiInstance.getSettingsNotification(settingsNotificationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getSettingsNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsNotificationId** | **String**| Retrieve notification rule information. |

### Return type

[**QuotaNotifications**](QuotaNotifications.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsReports"></a>
# **getSettingsReports**
> SettingsReports getSettingsReports()



List all settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    SettingsReports result = apiInstance.getSettingsReports();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#getSettingsReports");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsReports**](SettingsReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listQuotaQuotas"></a>
# **listQuotaQuotas**
> QuotaQuotasExtended listQuotaQuotas(enforced, includeSnapshots, zone, resume, recursePathChildren, resolveNames, recursePathParents, persona, limit, exceeded, path, type, reportId)



List all or matching quotas. Can also be used to retrieve quota state from existing reports. For any query argument not supplied, the default behavior is return all.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
Boolean enforced = true; // Boolean | Only list quotas with this enforcement (non-accounting).
Boolean includeSnapshots = true; // Boolean | Only list quotas with this setting for include_snapshots.
String zone = "zone_example"; // String | Optional named zone to use for user and group resolution.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean recursePathChildren = true; // Boolean | If used with the path argument, match all quotas at that path or any descendent sub-directory.
Boolean resolveNames = true; // Boolean | If true, resolve group and user names in personas.
Boolean recursePathParents = true; // Boolean | If used with the path argument, match all quotas at that path or any parent directory.
String persona = "persona_example"; // String | Only list user or group quotas matching this persona (must be used with the corresponding type argument).  Format is <PERSONA_TYPE>:<string/integer>, where PERSONA_TYPE is one of USER, GROUP, SID, ID, or GID.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
Boolean exceeded = true; // Boolean | Set to true to only list quotas which have exceeded one or more of their thresholds.
String path = "path_example"; // String | Only list quotas matching this path (see also recurse_path_*).
String type = "type_example"; // String | Only list quotas matching this type.
String reportId = "reportId_example"; // String | Use the named report as a source rather than the live quotas. See the /q/quota/reports resource for a list of valid reports.
try {
    QuotaQuotasExtended result = apiInstance.listQuotaQuotas(enforced, includeSnapshots, zone, resume, recursePathChildren, resolveNames, recursePathParents, persona, limit, exceeded, path, type, reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#listQuotaQuotas");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **enforced** | **Boolean**| Only list quotas with this enforcement (non-accounting). | [optional]
 **includeSnapshots** | **Boolean**| Only list quotas with this setting for include_snapshots. | [optional]
 **zone** | **String**| Optional named zone to use for user and group resolution. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **recursePathChildren** | **Boolean**| If used with the path argument, match all quotas at that path or any descendent sub-directory. | [optional]
 **resolveNames** | **Boolean**| If true, resolve group and user names in personas. | [optional]
 **recursePathParents** | **Boolean**| If used with the path argument, match all quotas at that path or any parent directory. | [optional]
 **persona** | **String**| Only list user or group quotas matching this persona (must be used with the corresponding type argument).  Format is &lt;PERSONA_TYPE&gt;:&lt;string/integer&gt;, where PERSONA_TYPE is one of USER, GROUP, SID, ID, or GID. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **exceeded** | **Boolean**| Set to true to only list quotas which have exceeded one or more of their thresholds. | [optional]
 **path** | **String**| Only list quotas matching this path (see also recurse_path_*). | [optional]
 **type** | **String**| Only list quotas matching this type. | [optional] [enum: directory, user, group, default-user, default-group]
 **reportId** | **String**| Use the named report as a source rather than the live quotas. See the /q/quota/reports resource for a list of valid reports. | [optional]

### Return type

[**QuotaQuotasExtended**](QuotaQuotasExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listQuotaReports"></a>
# **listQuotaReports**
> QuotaReports listQuotaReports(sort, resume, generated, limit, type, dir)



List all or matching reports.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
String sort = "sort_example"; // String | Order results by this field.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
String generated = "generated_example"; // String | Only list reports matching this source.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String type = "type_example"; // String | Only list reports matching this type.
String dir = "dir_example"; // String | The direction of the sort.
try {
    QuotaReports result = apiInstance.listQuotaReports(sort, resume, generated, limit, type, dir);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#listQuotaReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| Order results by this field. | [optional] [enum: time, generated, type]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **generated** | **String**| Only list reports matching this source. | [optional] [enum: manual, scheduled, all]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **type** | **String**| Only list reports matching this type. | [optional] [enum: summary, detail, all]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]

### Return type

[**QuotaReports**](QuotaReports.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSettingsMappings"></a>
# **listSettingsMappings**
> SettingsMappings listSettingsMappings()



List all rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    SettingsMappings result = apiInstance.listSettingsMappings();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#listSettingsMappings");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsMappings**](SettingsMappings.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSettingsNotifications"></a>
# **listSettingsNotifications**
> QuotaNotificationsExtended listSettingsNotifications()



List all rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
try {
    QuotaNotificationsExtended result = apiInstance.listSettingsNotifications();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#listSettingsNotifications");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**QuotaNotificationsExtended**](QuotaNotificationsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateQuotaQuota"></a>
# **updateQuotaQuota**
> updateQuotaQuota(quotaQuota, quotaQuotaId)



Modify quota. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
QuotaQuota quotaQuota = new QuotaQuota(); // QuotaQuota | 
String quotaQuotaId = "quotaQuotaId_example"; // String | Modify quota. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateQuotaQuota(quotaQuota, quotaQuotaId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#updateQuotaQuota");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **quotaQuota** | [**QuotaQuota**](QuotaQuota.md)|  |
 **quotaQuotaId** | **String**| Modify quota. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsMapping"></a>
# **updateSettingsMapping**
> updateSettingsMapping(settingsMapping, settingsMappingId)



Modify the mapping.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
SettingsMappingExtended settingsMapping = new SettingsMappingExtended(); // SettingsMappingExtended | 
String settingsMappingId = "settingsMappingId_example"; // String | Modify the mapping.
try {
    apiInstance.updateSettingsMapping(settingsMapping, settingsMappingId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#updateSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsMapping** | [**SettingsMappingExtended**](SettingsMappingExtended.md)|  |
 **settingsMappingId** | **String**| Modify the mapping. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsNotification"></a>
# **updateSettingsNotification**
> updateSettingsNotification(settingsNotification, settingsNotificationId)



Modify notification rule. All input fields are optional, but one or more must be supplied.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
QuotaNotification settingsNotification = new QuotaNotification(); // QuotaNotification | 
String settingsNotificationId = "settingsNotificationId_example"; // String | Modify notification rule. All input fields are optional, but one or more must be supplied.
try {
    apiInstance.updateSettingsNotification(settingsNotification, settingsNotificationId);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#updateSettingsNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsNotification** | [**QuotaNotification**](QuotaNotification.md)|  |
 **settingsNotificationId** | **String**| Modify notification rule. All input fields are optional, but one or more must be supplied. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsReports"></a>
# **updateSettingsReports**
> updateSettingsReports(settingsReports)



Modify one or more settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaApi apiInstance = new QuotaApi();
SettingsReportsExtended settingsReports = new SettingsReportsExtended(); // SettingsReportsExtended | 
try {
    apiInstance.updateSettingsReports(settingsReports);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaApi#updateSettingsReports");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsReports** | [**SettingsReportsExtended**](SettingsReportsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

