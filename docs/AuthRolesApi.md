# AuthRolesApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRoleMember**](AuthRolesApi.md#createRoleMember) | **POST** /platform/1/auth/roles/{Role}/members | 
[**createRolePrivilege**](AuthRolesApi.md#createRolePrivilege) | **POST** /platform/1/auth/roles/{Role}/privileges | 
[**deleteRoleMember**](AuthRolesApi.md#deleteRoleMember) | **DELETE** /platform/1/auth/roles/{Role}/members/{RoleMemberId} | 
[**deleteRolePrivilege**](AuthRolesApi.md#deleteRolePrivilege) | **DELETE** /platform/1/auth/roles/{Role}/privileges/{RolePrivilegeId} | 
[**listRoleMembers**](AuthRolesApi.md#listRoleMembers) | **GET** /platform/1/auth/roles/{Role}/members | 
[**listRolePrivileges**](AuthRolesApi.md#listRolePrivileges) | **GET** /platform/1/auth/roles/{Role}/privileges | 


<a name="createRoleMember"></a>
# **createRoleMember**
> CreateResponse createRoleMember(roleMember, role)



Add a member to the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
AuthAccessAccessItemFileGroup roleMember = new AuthAccessAccessItemFileGroup(); // AuthAccessAccessItemFileGroup | 
String role = "role_example"; // String | 
try {
    CreateResponse result = apiInstance.createRoleMember(roleMember, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#createRoleMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleMember** | [**AuthAccessAccessItemFileGroup**](AuthAccessAccessItemFileGroup.md)|  |
 **role** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createRolePrivilege"></a>
# **createRolePrivilege**
> CreateResponse createRolePrivilege(rolePrivilege, role)



Add a privilege to the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
AuthIdNtokenPrivilegeItem rolePrivilege = new AuthIdNtokenPrivilegeItem(); // AuthIdNtokenPrivilegeItem | 
String role = "role_example"; // String | 
try {
    CreateResponse result = apiInstance.createRolePrivilege(rolePrivilege, role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#createRolePrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rolePrivilege** | [**AuthIdNtokenPrivilegeItem**](AuthIdNtokenPrivilegeItem.md)|  |
 **role** | **String**|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRoleMember"></a>
# **deleteRoleMember**
> deleteRoleMember(roleMemberId, role)



Remove a member from the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
String roleMemberId = "roleMemberId_example"; // String | Remove a member from the role.
String role = "role_example"; // String | 
try {
    apiInstance.deleteRoleMember(roleMemberId, role);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#deleteRoleMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **roleMemberId** | **String**| Remove a member from the role. |
 **role** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteRolePrivilege"></a>
# **deleteRolePrivilege**
> deleteRolePrivilege(rolePrivilegeId, role)



Remove a privilege from a role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
String rolePrivilegeId = "rolePrivilegeId_example"; // String | Remove a privilege from a role.
String role = "role_example"; // String | 
try {
    apiInstance.deleteRolePrivilege(rolePrivilegeId, role);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#deleteRolePrivilege");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rolePrivilegeId** | **String**| Remove a privilege from a role. |
 **role** | **String**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRoleMembers"></a>
# **listRoleMembers**
> GroupMembers listRoleMembers(role, resolveNames)



List all the members of the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | 
Boolean resolveNames = true; // Boolean | Resolve names of personas.
try {
    GroupMembers result = apiInstance.listRoleMembers(role, resolveNames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#listRoleMembers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**|  |
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]

### Return type

[**GroupMembers**](GroupMembers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listRolePrivileges"></a>
# **listRolePrivileges**
> RolePrivileges listRolePrivileges(role)



List all privileges in the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthRolesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthRolesApi apiInstance = new AuthRolesApi();
String role = "role_example"; // String | 
try {
    RolePrivileges result = apiInstance.listRolePrivileges(role);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthRolesApi#listRolePrivileges");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **role** | **String**|  |

### Return type

[**RolePrivileges**](RolePrivileges.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

