# LicenseApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createLicenseLicense**](LicenseApi.md#createLicenseLicense) | **POST** /platform/5/license/licenses | 
[**getLicenseGenerate**](LicenseApi.md#getLicenseGenerate) | **GET** /platform/5/license/generate | 
[**getLicenseLicense**](LicenseApi.md#getLicenseLicense) | **GET** /platform/5/license/licenses/{LicenseLicenseId} | 
[**listLicenseLicenses**](LicenseApi.md#listLicenseLicenses) | **GET** /platform/5/license/licenses | 


<a name="createLicenseLicense"></a>
# **createLicenseLicense**
> Empty createLicenseLicense(licenseLicense)



Install a new license file and/or activate evaluation licenses.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LicenseApi apiInstance = new LicenseApi();
LicenseLicenseCreateParams licenseLicense = new LicenseLicenseCreateParams(); // LicenseLicenseCreateParams | 
try {
    Empty result = apiInstance.createLicenseLicense(licenseLicense);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#createLicenseLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseLicense** | [**LicenseLicenseCreateParams**](LicenseLicenseCreateParams.md)|  |

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLicenseGenerate"></a>
# **getLicenseGenerate**
> LicenseGenerate getLicenseGenerate(action, licensesToInclude, licensesToExclude, onlyTheseLicenses)



Generate license activation file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LicenseApi apiInstance = new LicenseApi();
String action = "license_list_only"; // String | enum: license_list_only (default), generate_activation, download_activation. Generate an activation file or return a list of activated licenses. If generating an activation file and no licenses are specified, the default configuration is to generate an activation file with the current set of licensed features. download_activation returns HTTP headers and the same XML content as seen in the response activation.
String licensesToInclude = "licensesToInclude_example"; // String | Licenses to include in activation file.
String licensesToExclude = "licensesToExclude_example"; // String | Licenses to omit from activation file.
String onlyTheseLicenses = "onlyTheseLicenses_example"; // String | Activate only the defined licenses. This setting overrides all other license activation settings.
try {
    LicenseGenerate result = apiInstance.getLicenseGenerate(action, licensesToInclude, licensesToExclude, onlyTheseLicenses);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseGenerate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **action** | **String**| enum: license_list_only (default), generate_activation, download_activation. Generate an activation file or return a list of activated licenses. If generating an activation file and no licenses are specified, the default configuration is to generate an activation file with the current set of licensed features. download_activation returns HTTP headers and the same XML content as seen in the response activation. | [optional] [default to license_list_only] [enum: generate_activation, license_list_only, download_activation]
 **licensesToInclude** | **String**| Licenses to include in activation file. | [optional]
 **licensesToExclude** | **String**| Licenses to omit from activation file. | [optional]
 **onlyTheseLicenses** | **String**| Activate only the defined licenses. This setting overrides all other license activation settings. | [optional]

### Return type

[**LicenseGenerate**](LicenseGenerate.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getLicenseLicense"></a>
# **getLicenseLicense**
> LicenseLicenses getLicenseLicense(licenseLicenseId)



Retrieve license information for the feature.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LicenseApi apiInstance = new LicenseApi();
String licenseLicenseId = "licenseLicenseId_example"; // String | Retrieve license information for the feature.
try {
    LicenseLicenses result = apiInstance.getLicenseLicense(licenseLicenseId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#getLicenseLicense");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **licenseLicenseId** | **String**| Retrieve license information for the feature. |

### Return type

[**LicenseLicenses**](LicenseLicenses.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listLicenseLicenses"></a>
# **listLicenseLicenses**
> LicenseLicensesExtended listLicenseLicenses()



Retrieve license information for all licensable products.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.LicenseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

LicenseApi apiInstance = new LicenseApi();
try {
    LicenseLicensesExtended result = apiInstance.listLicenseLicenses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling LicenseApi#listLicenseLicenses");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**LicenseLicensesExtended**](LicenseLicensesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

