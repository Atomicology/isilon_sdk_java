# AuthGroupsApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGroupMember**](AuthGroupsApi.md#createGroupMember) | **POST** /platform/1/auth/groups/{Group}/members | 
[**deleteGroupMember**](AuthGroupsApi.md#deleteGroupMember) | **DELETE** /platform/1/auth/groups/{Group}/members/{GroupMemberId} | 
[**listGroupMembers**](AuthGroupsApi.md#listGroupMembers) | **GET** /platform/1/auth/groups/{Group}/members | 


<a name="createGroupMember"></a>
# **createGroupMember**
> CreateResponse createGroupMember(groupMember, group, zone, provider)



Add a member to the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthGroupsApi apiInstance = new AuthGroupsApi();
AuthAccessAccessItemFileGroup groupMember = new AuthAccessAccessItemFileGroup(); // AuthAccessAccessItemFileGroup | 
String group = "group_example"; // String | 
String zone = "zone_example"; // String | Filter group members by zone.
String provider = "provider_example"; // String | Filter group members by provider.
try {
    CreateResponse result = apiInstance.createGroupMember(groupMember, group, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthGroupsApi#createGroupMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupMember** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md)|  |
 **group** | **String**|  |
 **zone** | **String**| Filter group members by zone. | [optional]
 **provider** | **String**| Filter group members by provider. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteGroupMember"></a>
# **deleteGroupMember**
> deleteGroupMember(groupMemberId, group, zone, provider)



Remove the member from the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthGroupsApi apiInstance = new AuthGroupsApi();
String groupMemberId = "groupMemberId_example"; // String | Remove the member from the group.
String group = "group_example"; // String | 
String zone = "zone_example"; // String | Filter group members by zone.
String provider = "provider_example"; // String | Filter group members by provider.
try {
    apiInstance.deleteGroupMember(groupMemberId, group, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthGroupsApi#deleteGroupMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupMemberId** | **String**| Remove the member from the group. |
 **group** | **String**|  |
 **zone** | **String**| Filter group members by zone. | [optional]
 **provider** | **String**| Filter group members by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listGroupMembers"></a>
# **listGroupMembers**
> GroupMembers listGroupMembers(group, resolveNames, resume, limit, zone, provider)



List all the members of the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthGroupsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthGroupsApi apiInstance = new AuthGroupsApi();
String group = "group_example"; // String | 
Boolean resolveNames = true; // Boolean | Resolve names of personas.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String zone = "zone_example"; // String | Filter group members by zone.
String provider = "provider_example"; // String | Filter group members by provider.
try {
    GroupMembers result = apiInstance.listGroupMembers(group, resolveNames, resume, limit, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthGroupsApi#listGroupMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**|  |
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **zone** | **String**| Filter group members by zone. | [optional]
 **provider** | **String**| Filter group members by provider. | [optional]

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

