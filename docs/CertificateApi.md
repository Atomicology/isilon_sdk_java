# CertificateApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCertificateServerItem**](CertificateApi.md#createCertificateServerItem) | **POST** /platform/4/certificate/server | 
[**deleteCertificateServerById**](CertificateApi.md#deleteCertificateServerById) | **DELETE** /platform/4/certificate/server/{CertificateServerId} | 
[**getCertificateServerById**](CertificateApi.md#getCertificateServerById) | **GET** /platform/4/certificate/server/{CertificateServerId} | 
[**listCertificateServer**](CertificateApi.md#listCertificateServer) | **GET** /platform/4/certificate/server | 
[**updateCertificateServerById**](CertificateApi.md#updateCertificateServerById) | **PUT** /platform/4/certificate/server/{CertificateServerId} | 


<a name="createCertificateServerItem"></a>
# **createCertificateServerItem**
> CreateResponse createCertificateServerItem(certificateServerItem)



Import a TLS server certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CertificateApi apiInstance = new CertificateApi();
CertificateServerItem certificateServerItem = new CertificateServerItem(); // CertificateServerItem | 
try {
    CreateResponse result = apiInstance.createCertificateServerItem(certificateServerItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#createCertificateServerItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateServerItem** | [**CertificateServerItem**](CertificateServerItem.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteCertificateServerById"></a>
# **deleteCertificateServerById**
> deleteCertificateServerById(certificateServerId)



Delete a TLS server certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CertificateApi apiInstance = new CertificateApi();
String certificateServerId = "certificateServerId_example"; // String | Delete a TLS server certificate.
try {
    apiInstance.deleteCertificateServerById(certificateServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#deleteCertificateServerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateServerId** | **String**| Delete a TLS server certificate. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getCertificateServerById"></a>
# **getCertificateServerById**
> CertificateServer getCertificateServerById(certificateServerId)



Retrieve a single TLS server certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CertificateApi apiInstance = new CertificateApi();
String certificateServerId = "certificateServerId_example"; // String | Retrieve a single TLS server certificate.
try {
    CertificateServer result = apiInstance.getCertificateServerById(certificateServerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#getCertificateServerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateServerId** | **String**| Retrieve a single TLS server certificate. |

### Return type

[**CertificateServer**](CertificateServer.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCertificateServer"></a>
# **listCertificateServer**
> CertificateServerExtended listCertificateServer(sort, limit, dir, resume)



Retrieve a list of all configured TLS server certificates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CertificateApi apiInstance = new CertificateApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    CertificateServerExtended result = apiInstance.listCertificateServer(sort, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#listCertificateServer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**CertificateServerExtended**](CertificateServerExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateCertificateServerById"></a>
# **updateCertificateServerById**
> updateCertificateServerById(certificateServerIdParams, certificateServerId)



Modify a TLS server certificate.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CertificateApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

CertificateApi apiInstance = new CertificateApi();
CertificateServerIdParams certificateServerIdParams = new CertificateServerIdParams(); // CertificateServerIdParams | 
String certificateServerId = "certificateServerId_example"; // String | Modify a TLS server certificate.
try {
    apiInstance.updateCertificateServerById(certificateServerIdParams, certificateServerId);
} catch (ApiException e) {
    System.err.println("Exception when calling CertificateApi#updateCertificateServerById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **certificateServerIdParams** | [**CertificateServerIdParams**](CertificateServerIdParams.md)|  |
 **certificateServerId** | **String**| Modify a TLS server certificate. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

