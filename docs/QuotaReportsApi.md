# QuotaReportsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getReportAbout**](QuotaReportsApi.md#getReportAbout) | **GET** /platform/1/quota/reports/{Rid}/about | 


<a name="getReportAbout"></a>
# **getReportAbout**
> ReportAbout getReportAbout(rid)



Retrieve report meta-data information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.QuotaReportsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

QuotaReportsApi apiInstance = new QuotaReportsApi();
String rid = "rid_example"; // String | 
try {
    ReportAbout result = apiInstance.getReportAbout(rid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling QuotaReportsApi#getReportAbout");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rid** | **String**|  |

### Return type

[**ReportAbout**](ReportAbout.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

