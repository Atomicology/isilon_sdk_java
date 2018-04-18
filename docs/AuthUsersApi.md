# AuthUsersApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserMemberOfItem**](AuthUsersApi.md#createUserMemberOfItem) | **POST** /platform/3/auth/users/{User}/member-of | 
[**deleteUserMemberOfMemberOf**](AuthUsersApi.md#deleteUserMemberOfMemberOf) | **DELETE** /platform/3/auth/users/{User}/member-of/{UserMemberOfMemberOf} | 
[**listUserMemberOf**](AuthUsersApi.md#listUserMemberOf) | **GET** /platform/3/auth/users/{User}/member-of | 
[**updateUserChangePassword**](AuthUsersApi.md#updateUserChangePassword) | **PUT** /platform/3/auth/users/{User}/change-password | 


<a name="createUserMemberOfItem"></a>
# **createUserMemberOfItem**
> CreateResponse createUserMemberOfItem(userMemberOfItem, user, zone, provider)



Add the user to a group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthUsersApi apiInstance = new AuthUsersApi();
AuthAccessAccessItemFileGroup userMemberOfItem = new AuthAccessAccessItemFileGroup(); // AuthAccessAccessItemFileGroup | 
String user = "user_example"; // String | 
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    CreateResponse result = apiInstance.createUserMemberOfItem(userMemberOfItem, user, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#createUserMemberOfItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userMemberOfItem** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md)|  |
 **user** | **String**|  |
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteUserMemberOfMemberOf"></a>
# **deleteUserMemberOfMemberOf**
> deleteUserMemberOfMemberOf(userMemberOfMemberOf, user, zone, provider)



Remove the user from the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthUsersApi apiInstance = new AuthUsersApi();
String userMemberOfMemberOf = "userMemberOfMemberOf_example"; // String | Remove the user from the group.
String user = "user_example"; // String | 
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    apiInstance.deleteUserMemberOfMemberOf(userMemberOfMemberOf, user, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#deleteUserMemberOfMemberOf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userMemberOfMemberOf** | **String**| Remove the user from the group. |
 **user** | **String**|  |
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listUserMemberOf"></a>
# **listUserMemberOf**
> UserMemberOf listUserMemberOf(user, resolveNames, zone, provider)



List all groups the user is a member of.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthUsersApi apiInstance = new AuthUsersApi();
String user = "user_example"; // String | 
Boolean resolveNames = true; // Boolean | Resolve names of personas.
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    UserMemberOf result = apiInstance.listUserMemberOf(user, resolveNames, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#listUserMemberOf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user** | **String**|  |
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

[**UserMemberOf**](UserMemberOf.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateUserChangePassword"></a>
# **updateUserChangePassword**
> updateUserChangePassword(userChangePassword, user, zone)



Change the user&#39;s password.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthUsersApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthUsersApi apiInstance = new AuthUsersApi();
UserChangePassword userChangePassword = new UserChangePassword(); // UserChangePassword | 
String user = "user_example"; // String | 
String zone = "zone_example"; // String | Specifies access zone containing user.
try {
    apiInstance.updateUserChangePassword(userChangePassword, user, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthUsersApi#updateUserChangePassword");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userChangePassword** | [**UserChangePassword**](UserChangePassword.md)|  |
 **user** | **String**|  |
 **zone** | **String**| Specifies access zone containing user. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

