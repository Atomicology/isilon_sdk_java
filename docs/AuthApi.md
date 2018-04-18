# AuthApi

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAuthCacheItem**](AuthApi.md#createAuthCacheItem) | **POST** /platform/4/auth/cache | 
[**createAuthGroup**](AuthApi.md#createAuthGroup) | **POST** /platform/1/auth/groups | 
[**createAuthRefreshItem**](AuthApi.md#createAuthRefreshItem) | **POST** /platform/3/auth/refresh | 
[**createAuthRole**](AuthApi.md#createAuthRole) | **POST** /platform/1/auth/roles | 
[**createAuthUser**](AuthApi.md#createAuthUser) | **POST** /platform/1/auth/users | 
[**createMappingIdentity**](AuthApi.md#createMappingIdentity) | **POST** /platform/1/auth/mapping/identities | 
[**createMappingIdentity_0**](AuthApi.md#createMappingIdentity_0) | **POST** /platform/1/auth/mapping/identities/{MappingIdentityId} | 
[**createProvidersAdsItem**](AuthApi.md#createProvidersAdsItem) | **POST** /platform/3/auth/providers/ads | 
[**createProvidersFileItem**](AuthApi.md#createProvidersFileItem) | **POST** /platform/1/auth/providers/file | 
[**createProvidersKrb5Item**](AuthApi.md#createProvidersKrb5Item) | **POST** /platform/3/auth/providers/krb5 | 
[**createProvidersLdapItem**](AuthApi.md#createProvidersLdapItem) | **POST** /platform/4/auth/providers/ldap | 
[**createProvidersNisItem**](AuthApi.md#createProvidersNisItem) | **POST** /platform/3/auth/providers/nis | 
[**createSettingsKrb5Domain**](AuthApi.md#createSettingsKrb5Domain) | **POST** /platform/1/auth/settings/krb5/domains | 
[**createSettingsKrb5Realm**](AuthApi.md#createSettingsKrb5Realm) | **POST** /platform/1/auth/settings/krb5/realms | 
[**deleteAuthGroup**](AuthApi.md#deleteAuthGroup) | **DELETE** /platform/1/auth/groups/{AuthGroupId} | 
[**deleteAuthGroups**](AuthApi.md#deleteAuthGroups) | **DELETE** /platform/1/auth/groups | 
[**deleteAuthRole**](AuthApi.md#deleteAuthRole) | **DELETE** /platform/1/auth/roles/{AuthRoleId} | 
[**deleteAuthUser**](AuthApi.md#deleteAuthUser) | **DELETE** /platform/1/auth/users/{AuthUserId} | 
[**deleteAuthUsers**](AuthApi.md#deleteAuthUsers) | **DELETE** /platform/1/auth/users | 
[**deleteMappingIdentities**](AuthApi.md#deleteMappingIdentities) | **DELETE** /platform/1/auth/mapping/identities | 
[**deleteMappingIdentity**](AuthApi.md#deleteMappingIdentity) | **DELETE** /platform/1/auth/mapping/identities/{MappingIdentityId} | 
[**deleteProvidersAdsById**](AuthApi.md#deleteProvidersAdsById) | **DELETE** /platform/3/auth/providers/ads/{ProvidersAdsId} | 
[**deleteProvidersFileById**](AuthApi.md#deleteProvidersFileById) | **DELETE** /platform/1/auth/providers/file/{ProvidersFileId} | 
[**deleteProvidersKrb5ById**](AuthApi.md#deleteProvidersKrb5ById) | **DELETE** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} | 
[**deleteProvidersLdapById**](AuthApi.md#deleteProvidersLdapById) | **DELETE** /platform/4/auth/providers/ldap/{ProvidersLdapId} | 
[**deleteProvidersLocalById**](AuthApi.md#deleteProvidersLocalById) | **DELETE** /platform/1/auth/providers/local/{ProvidersLocalId} | 
[**deleteProvidersNisById**](AuthApi.md#deleteProvidersNisById) | **DELETE** /platform/3/auth/providers/nis/{ProvidersNisId} | 
[**deleteSettingsKrb5Domain**](AuthApi.md#deleteSettingsKrb5Domain) | **DELETE** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} | 
[**deleteSettingsKrb5Realm**](AuthApi.md#deleteSettingsKrb5Realm) | **DELETE** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} | 
[**getAuthAccessUser**](AuthApi.md#getAuthAccessUser) | **GET** /platform/1/auth/access/{AuthAccessUser} | 
[**getAuthGroup**](AuthApi.md#getAuthGroup) | **GET** /platform/1/auth/groups/{AuthGroupId} | 
[**getAuthId**](AuthApi.md#getAuthId) | **GET** /platform/1/auth/id | 
[**getAuthLdapTemplate**](AuthApi.md#getAuthLdapTemplate) | **GET** /platform/4/auth/ldap-templates/{AuthLdapTemplateId} | 
[**getAuthLdapTemplates**](AuthApi.md#getAuthLdapTemplates) | **GET** /platform/4/auth/ldap-templates | 
[**getAuthLogLevel**](AuthApi.md#getAuthLogLevel) | **GET** /platform/3/auth/log-level | 
[**getAuthNetgroup**](AuthApi.md#getAuthNetgroup) | **GET** /platform/1/auth/netgroups/{AuthNetgroupId} | 
[**getAuthPrivileges**](AuthApi.md#getAuthPrivileges) | **GET** /platform/1/auth/privileges | 
[**getAuthRole**](AuthApi.md#getAuthRole) | **GET** /platform/1/auth/roles/{AuthRoleId} | 
[**getAuthShells**](AuthApi.md#getAuthShells) | **GET** /platform/1/auth/shells | 
[**getAuthUser**](AuthApi.md#getAuthUser) | **GET** /platform/1/auth/users/{AuthUserId} | 
[**getAuthWellknown**](AuthApi.md#getAuthWellknown) | **GET** /platform/1/auth/wellknowns/{AuthWellknownId} | 
[**getAuthWellknowns**](AuthApi.md#getAuthWellknowns) | **GET** /platform/1/auth/wellknowns | 
[**getMappingDump**](AuthApi.md#getMappingDump) | **GET** /platform/3/auth/mapping/dump | 
[**getMappingIdentity**](AuthApi.md#getMappingIdentity) | **GET** /platform/1/auth/mapping/identities/{MappingIdentityId} | 
[**getMappingUsersLookup**](AuthApi.md#getMappingUsersLookup) | **GET** /platform/1/auth/mapping/users/lookup | 
[**getMappingUsersRules**](AuthApi.md#getMappingUsersRules) | **GET** /platform/1/auth/mapping/users/rules | 
[**getProvidersAdsById**](AuthApi.md#getProvidersAdsById) | **GET** /platform/3/auth/providers/ads/{ProvidersAdsId} | 
[**getProvidersFileById**](AuthApi.md#getProvidersFileById) | **GET** /platform/1/auth/providers/file/{ProvidersFileId} | 
[**getProvidersKrb5ById**](AuthApi.md#getProvidersKrb5ById) | **GET** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} | 
[**getProvidersLdapById**](AuthApi.md#getProvidersLdapById) | **GET** /platform/4/auth/providers/ldap/{ProvidersLdapId} | 
[**getProvidersLocal**](AuthApi.md#getProvidersLocal) | **GET** /platform/1/auth/providers/local | 
[**getProvidersLocalById**](AuthApi.md#getProvidersLocalById) | **GET** /platform/1/auth/providers/local/{ProvidersLocalId} | 
[**getProvidersNisById**](AuthApi.md#getProvidersNisById) | **GET** /platform/3/auth/providers/nis/{ProvidersNisId} | 
[**getProvidersSummary**](AuthApi.md#getProvidersSummary) | **GET** /platform/3/auth/providers/summary | 
[**getSettingsAcls**](AuthApi.md#getSettingsAcls) | **GET** /platform/3/auth/settings/acls | 
[**getSettingsGlobal**](AuthApi.md#getSettingsGlobal) | **GET** /platform/1/auth/settings/global | 
[**getSettingsKrb5Defaults**](AuthApi.md#getSettingsKrb5Defaults) | **GET** /platform/1/auth/settings/krb5/defaults | 
[**getSettingsKrb5Domain**](AuthApi.md#getSettingsKrb5Domain) | **GET** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} | 
[**getSettingsKrb5Realm**](AuthApi.md#getSettingsKrb5Realm) | **GET** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} | 
[**getSettingsMapping**](AuthApi.md#getSettingsMapping) | **GET** /platform/1/auth/settings/mapping | 
[**listAuthGroups**](AuthApi.md#listAuthGroups) | **GET** /platform/1/auth/groups | 
[**listAuthRoles**](AuthApi.md#listAuthRoles) | **GET** /platform/1/auth/roles | 
[**listAuthUsers**](AuthApi.md#listAuthUsers) | **GET** /platform/1/auth/users | 
[**listProvidersAds**](AuthApi.md#listProvidersAds) | **GET** /platform/3/auth/providers/ads | 
[**listProvidersFile**](AuthApi.md#listProvidersFile) | **GET** /platform/1/auth/providers/file | 
[**listProvidersKrb5**](AuthApi.md#listProvidersKrb5) | **GET** /platform/3/auth/providers/krb5 | 
[**listProvidersLdap**](AuthApi.md#listProvidersLdap) | **GET** /platform/4/auth/providers/ldap | 
[**listProvidersNis**](AuthApi.md#listProvidersNis) | **GET** /platform/3/auth/providers/nis | 
[**listSettingsKrb5Domains**](AuthApi.md#listSettingsKrb5Domains) | **GET** /platform/1/auth/settings/krb5/domains | 
[**listSettingsKrb5Realms**](AuthApi.md#listSettingsKrb5Realms) | **GET** /platform/1/auth/settings/krb5/realms | 
[**updateAuthGroup**](AuthApi.md#updateAuthGroup) | **PUT** /platform/1/auth/groups/{AuthGroupId} | 
[**updateAuthLogLevel**](AuthApi.md#updateAuthLogLevel) | **PUT** /platform/3/auth/log-level | 
[**updateAuthRole**](AuthApi.md#updateAuthRole) | **PUT** /platform/1/auth/roles/{AuthRoleId} | 
[**updateAuthUser**](AuthApi.md#updateAuthUser) | **PUT** /platform/1/auth/users/{AuthUserId} | 
[**updateMappingImport**](AuthApi.md#updateMappingImport) | **PUT** /platform/3/auth/mapping/import | 
[**updateMappingUsersRules**](AuthApi.md#updateMappingUsersRules) | **PUT** /platform/1/auth/mapping/users/rules | 
[**updateProvidersAdsById**](AuthApi.md#updateProvidersAdsById) | **PUT** /platform/3/auth/providers/ads/{ProvidersAdsId} | 
[**updateProvidersFileById**](AuthApi.md#updateProvidersFileById) | **PUT** /platform/1/auth/providers/file/{ProvidersFileId} | 
[**updateProvidersKrb5ById**](AuthApi.md#updateProvidersKrb5ById) | **PUT** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} | 
[**updateProvidersLdapById**](AuthApi.md#updateProvidersLdapById) | **PUT** /platform/4/auth/providers/ldap/{ProvidersLdapId} | 
[**updateProvidersLocalById**](AuthApi.md#updateProvidersLocalById) | **PUT** /platform/1/auth/providers/local/{ProvidersLocalId} | 
[**updateProvidersNisById**](AuthApi.md#updateProvidersNisById) | **PUT** /platform/3/auth/providers/nis/{ProvidersNisId} | 
[**updateSettingsAcls**](AuthApi.md#updateSettingsAcls) | **PUT** /platform/3/auth/settings/acls | 
[**updateSettingsGlobal**](AuthApi.md#updateSettingsGlobal) | **PUT** /platform/1/auth/settings/global | 
[**updateSettingsKrb5Defaults**](AuthApi.md#updateSettingsKrb5Defaults) | **PUT** /platform/1/auth/settings/krb5/defaults | 
[**updateSettingsKrb5Domain**](AuthApi.md#updateSettingsKrb5Domain) | **PUT** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} | 
[**updateSettingsKrb5Realm**](AuthApi.md#updateSettingsKrb5Realm) | **PUT** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} | 
[**updateSettingsMapping**](AuthApi.md#updateSettingsMapping) | **PUT** /platform/1/auth/settings/mapping | 


<a name="createAuthCacheItem"></a>
# **createAuthCacheItem**
> CreateResponse createAuthCacheItem(authCacheItem, zone)



Flush the Security Objects Cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthCacheItem authCacheItem = new AuthCacheItem(); // AuthCacheItem | 
String zone = "zone_example"; // String | Specifies access zone from which to flush objects.
try {
    CreateResponse result = apiInstance.createAuthCacheItem(authCacheItem, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createAuthCacheItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authCacheItem** | [**AuthCacheItem**](AuthCacheItem.md)|  |
 **zone** | **String**| Specifies access zone from which to flush objects. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAuthGroup"></a>
# **createAuthGroup**
> CreateResponse createAuthGroup(authGroup, force, zone, provider)



Create a new group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthGroupCreateParams authGroup = new AuthGroupCreateParams(); // AuthGroupCreateParams | 
Boolean force = true; // Boolean | Skip validation checks when creating a group.
String zone = "zone_example"; // String | Optional zone.
String provider = "provider_example"; // String | Optional provider type.
try {
    CreateResponse result = apiInstance.createAuthGroup(authGroup, force, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createAuthGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authGroup** | [**AuthGroupCreateParams**](AuthGroupCreateParams.md)|  |
 **force** | **Boolean**| Skip validation checks when creating a group. | [optional]
 **zone** | **String**| Optional zone. | [optional]
 **provider** | **String**| Optional provider type. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAuthRefreshItem"></a>
# **createAuthRefreshItem**
> CreateAuthRefreshItemResponse createAuthRefreshItem(authRefreshItem)



Refresh the authentication service configuration.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Empty authRefreshItem = new Empty(); // Empty | 
try {
    CreateAuthRefreshItemResponse result = apiInstance.createAuthRefreshItem(authRefreshItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createAuthRefreshItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRefreshItem** | [**Empty**](Empty.md)|  |

### Return type

[**CreateAuthRefreshItemResponse**](CreateAuthRefreshItemResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAuthRole"></a>
# **createAuthRole**
> CreateResponse createAuthRole(authRole)



Create a new role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthRoleCreateParams authRole = new AuthRoleCreateParams(); // AuthRoleCreateParams | 
try {
    CreateResponse result = apiInstance.createAuthRole(authRole);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createAuthRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRole** | [**AuthRoleCreateParams**](AuthRoleCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createAuthUser"></a>
# **createAuthUser**
> CreateResponse createAuthUser(authUser, force, zone, provider)



Create a new user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthUserCreateParams authUser = new AuthUserCreateParams(); // AuthUserCreateParams | 
Boolean force = true; // Boolean | Skip validation checks when creating user.
String zone = "zone_example"; // String | Optional zone.
String provider = "provider_example"; // String | Optional provider type.
try {
    CreateResponse result = apiInstance.createAuthUser(authUser, force, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createAuthUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**AuthUserCreateParams**](AuthUserCreateParams.md)|  |
 **force** | **Boolean**| Skip validation checks when creating user. | [optional]
 **zone** | **String**| Optional zone. | [optional]
 **provider** | **String**| Optional provider type. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMappingIdentity"></a>
# **createMappingIdentity**
> Empty createMappingIdentity(mappingIdentity, _2way, zone, replace)



Manually set or modify a mapping between two personae.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
MappingIdentityCreateParams mappingIdentity = new MappingIdentityCreateParams(); // MappingIdentityCreateParams | 
Boolean _2way = true; // Boolean | Create a bi-directional mapping from source to target and target to source.
String zone = "zone_example"; // String | Optional zone.
Boolean replace = true; // Boolean | Replace existing mappings.
try {
    Empty result = apiInstance.createMappingIdentity(mappingIdentity, _2way, zone, replace);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createMappingIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingIdentity** | [**MappingIdentityCreateParams**](MappingIdentityCreateParams.md)|  |
 **_2way** | **Boolean**| Create a bi-directional mapping from source to target and target to source. | [optional]
 **zone** | **String**| Optional zone. | [optional]
 **replace** | **Boolean**| Replace existing mappings. | [optional]

### Return type

[**Empty**](Empty.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createMappingIdentity_0"></a>
# **createMappingIdentity_0**
> MappingIdentities createMappingIdentity_0(mappingIdentity, mappingIdentityId, type, zone)



Manually set or modify a mapping between two personae.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Empty mappingIdentity = new Empty(); // Empty | 
String mappingIdentityId = "mappingIdentityId_example"; // String | Manually set or modify a mapping between two personae.
String type = "type_example"; // String | Desired mapping target to fetch/generate.
String zone = "zone_example"; // String | Optional zone.
try {
    MappingIdentities result = apiInstance.createMappingIdentity_0(mappingIdentity, mappingIdentityId, type, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createMappingIdentity_0");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingIdentity** | [**Empty**](Empty.md)|  |
 **mappingIdentityId** | **String**| Manually set or modify a mapping between two personae. |
 **type** | **String**| Desired mapping target to fetch/generate. | [optional] [enum: uid, gid, sid]
 **zone** | **String**| Optional zone. | [optional]

### Return type

[**MappingIdentities**](MappingIdentities.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProvidersAdsItem"></a>
# **createProvidersAdsItem**
> CreateResponse createProvidersAdsItem(providersAdsItem)



Create a new ADS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersAdsItem providersAdsItem = new ProvidersAdsItem(); // ProvidersAdsItem | 
try {
    CreateResponse result = apiInstance.createProvidersAdsItem(providersAdsItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createProvidersAdsItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersAdsItem** | [**ProvidersAdsItem**](ProvidersAdsItem.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProvidersFileItem"></a>
# **createProvidersFileItem**
> CreateResponse createProvidersFileItem(providersFileItem)



Create a new file provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersFileItem providersFileItem = new ProvidersFileItem(); // ProvidersFileItem | 
try {
    CreateResponse result = apiInstance.createProvidersFileItem(providersFileItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createProvidersFileItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersFileItem** | [**ProvidersFileItem**](ProvidersFileItem.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProvidersKrb5Item"></a>
# **createProvidersKrb5Item**
> CreateResponse createProvidersKrb5Item(providersKrb5Item)



Create a new KRB5 provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersKrb5Item providersKrb5Item = new ProvidersKrb5Item(); // ProvidersKrb5Item | 
try {
    CreateResponse result = apiInstance.createProvidersKrb5Item(providersKrb5Item);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createProvidersKrb5Item");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersKrb5Item** | [**ProvidersKrb5Item**](ProvidersKrb5Item.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProvidersLdapItem"></a>
# **createProvidersLdapItem**
> CreateResponse createProvidersLdapItem(providersLdapItem, force)



Create a new LDAP provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersLdapItem providersLdapItem = new ProvidersLdapItem(); // ProvidersLdapItem | 
Boolean force = true; // Boolean | Ignore unresolvable server URIs.
try {
    CreateResponse result = apiInstance.createProvidersLdapItem(providersLdapItem, force);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createProvidersLdapItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLdapItem** | [**ProvidersLdapItem**](ProvidersLdapItem.md)|  |
 **force** | **Boolean**| Ignore unresolvable server URIs. | [optional]

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createProvidersNisItem"></a>
# **createProvidersNisItem**
> CreateResponse createProvidersNisItem(providersNisItem)



Create a new NIS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersNisItem providersNisItem = new ProvidersNisItem(); // ProvidersNisItem | 
try {
    CreateResponse result = apiInstance.createProvidersNisItem(providersNisItem);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createProvidersNisItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersNisItem** | [**ProvidersNisItem**](ProvidersNisItem.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsKrb5Domain"></a>
# **createSettingsKrb5Domain**
> CreateResponse createSettingsKrb5Domain(settingsKrb5Domain)



Create a new krb5 domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsKrb5DomainCreateParams settingsKrb5Domain = new SettingsKrb5DomainCreateParams(); // SettingsKrb5DomainCreateParams | 
try {
    CreateResponse result = apiInstance.createSettingsKrb5Domain(settingsKrb5Domain);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createSettingsKrb5Domain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5Domain** | [**SettingsKrb5DomainCreateParams**](SettingsKrb5DomainCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSettingsKrb5Realm"></a>
# **createSettingsKrb5Realm**
> CreateResponse createSettingsKrb5Realm(settingsKrb5Realm)



Create a new krb5 realm.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsKrb5RealmCreateParams settingsKrb5Realm = new SettingsKrb5RealmCreateParams(); // SettingsKrb5RealmCreateParams | 
try {
    CreateResponse result = apiInstance.createSettingsKrb5Realm(settingsKrb5Realm);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#createSettingsKrb5Realm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5Realm** | [**SettingsKrb5RealmCreateParams**](SettingsKrb5RealmCreateParams.md)|  |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthGroup"></a>
# **deleteAuthGroup**
> deleteAuthGroup(authGroupId, cached, zone, provider)



Delete the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authGroupId = "authGroupId_example"; // String | Delete the group.
Boolean cached = true; // Boolean | If true, flush the group from the cache.
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    apiInstance.deleteAuthGroup(authGroupId, cached, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteAuthGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authGroupId** | **String**| Delete the group. |
 **cached** | **Boolean**| If true, flush the group from the cache. | [optional]
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthGroups"></a>
# **deleteAuthGroups**
> deleteAuthGroups(cached, zone, provider)



Flush the groups cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Boolean cached = true; // Boolean | If true, only flush cached objects.
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    apiInstance.deleteAuthGroups(cached, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteAuthGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **Boolean**| If true, only flush cached objects. | [optional]
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthRole"></a>
# **deleteAuthRole**
> deleteAuthRole(authRoleId)



Delete the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authRoleId = "authRoleId_example"; // String | Delete the role.
try {
    apiInstance.deleteAuthRole(authRoleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteAuthRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRoleId** | **String**| Delete the role. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthUser"></a>
# **deleteAuthUser**
> deleteAuthUser(authUserId, cached, zone, provider)



Delete the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authUserId = "authUserId_example"; // String | Delete the user.
Boolean cached = true; // Boolean | If true, flush the user from the cache.
String zone = "zone_example"; // String | Filter users by zone.
String provider = "provider_example"; // String | Filter users by provider.
try {
    apiInstance.deleteAuthUser(authUserId, cached, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteAuthUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUserId** | **String**| Delete the user. |
 **cached** | **Boolean**| If true, flush the user from the cache. | [optional]
 **zone** | **String**| Filter users by zone. | [optional]
 **provider** | **String**| Filter users by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAuthUsers"></a>
# **deleteAuthUsers**
> deleteAuthUsers(cached, zone, provider)



Flush the users cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Boolean cached = true; // Boolean | If true, only flush cached objects.
String zone = "zone_example"; // String | Filter users by zone.
String provider = "provider_example"; // String | Filter users by provider.
try {
    apiInstance.deleteAuthUsers(cached, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteAuthUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cached** | **Boolean**| If true, only flush cached objects. | [optional]
 **zone** | **String**| Filter users by zone. | [optional]
 **provider** | **String**| Filter users by provider. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMappingIdentities"></a>
# **deleteMappingIdentities**
> deleteMappingIdentities(filter, zone, remove)



Flush the entire idmap cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String filter = "filter_example"; // String | Filter to apply when deleting identity mappings.
String zone = "zone_example"; // String | Optional zone.
Boolean remove = true; // Boolean | Delete mapping instead of flush mapping cache.
try {
    apiInstance.deleteMappingIdentities(filter, zone, remove);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteMappingIdentities");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| Filter to apply when deleting identity mappings. | [optional] [enum: auto, external]
 **zone** | **String**| Optional zone. | [optional]
 **remove** | **Boolean**| Delete mapping instead of flush mapping cache. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMappingIdentity"></a>
# **deleteMappingIdentity**
> deleteMappingIdentity(mappingIdentityId, zone, _2way, target, remove)



Flush the entire idmap cache.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String mappingIdentityId = "mappingIdentityId_example"; // String | Flush the entire idmap cache.
String zone = "zone_example"; // String | Optional zone.
Boolean _2way = true; // Boolean | Delete the bi-directional mapping from source to target and target to source.
String target = "target_example"; // String | Target identity persona.
Boolean remove = true; // Boolean | Delete mapping instead of flush mapping from cache.
try {
    apiInstance.deleteMappingIdentity(mappingIdentityId, zone, _2way, target, remove);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteMappingIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingIdentityId** | **String**| Flush the entire idmap cache. |
 **zone** | **String**| Optional zone. | [optional]
 **_2way** | **Boolean**| Delete the bi-directional mapping from source to target and target to source. | [optional]
 **target** | **String**| Target identity persona. | [optional]
 **remove** | **Boolean**| Delete mapping instead of flush mapping from cache. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersAdsById"></a>
# **deleteProvidersAdsById**
> deleteProvidersAdsById(providersAdsId)



Delete the ADS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersAdsId = "providersAdsId_example"; // String | Delete the ADS provider.
try {
    apiInstance.deleteProvidersAdsById(providersAdsId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersAdsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersAdsId** | **String**| Delete the ADS provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersFileById"></a>
# **deleteProvidersFileById**
> deleteProvidersFileById(providersFileId)



Delete the file provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersFileId = "providersFileId_example"; // String | Delete the file provider.
try {
    apiInstance.deleteProvidersFileById(providersFileId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersFileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersFileId** | **String**| Delete the file provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersKrb5ById"></a>
# **deleteProvidersKrb5ById**
> deleteProvidersKrb5ById(providersKrb5Id)



Delete the KRB5 provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersKrb5Id = "providersKrb5Id_example"; // String | Delete the KRB5 provider.
try {
    apiInstance.deleteProvidersKrb5ById(providersKrb5Id);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersKrb5ById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersKrb5Id** | **String**| Delete the KRB5 provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersLdapById"></a>
# **deleteProvidersLdapById**
> deleteProvidersLdapById(providersLdapId)



Delete the LDAP provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersLdapId = "providersLdapId_example"; // String | Delete the LDAP provider.
try {
    apiInstance.deleteProvidersLdapById(providersLdapId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersLdapById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLdapId** | **String**| Delete the LDAP provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersLocalById"></a>
# **deleteProvidersLocalById**
> deleteProvidersLocalById(providersLocalId)



Delete the local provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersLocalId = "providersLocalId_example"; // String | Delete the local provider.
try {
    apiInstance.deleteProvidersLocalById(providersLocalId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersLocalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLocalId** | **String**| Delete the local provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProvidersNisById"></a>
# **deleteProvidersNisById**
> deleteProvidersNisById(providersNisId)



Delete the NIS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersNisId = "providersNisId_example"; // String | Delete the NIS provider.
try {
    apiInstance.deleteProvidersNisById(providersNisId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteProvidersNisById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersNisId** | **String**| Delete the NIS provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsKrb5Domain"></a>
# **deleteSettingsKrb5Domain**
> deleteSettingsKrb5Domain(settingsKrb5DomainId)



Remove a krb5 domain.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String settingsKrb5DomainId = "settingsKrb5DomainId_example"; // String | Remove a krb5 domain.
try {
    apiInstance.deleteSettingsKrb5Domain(settingsKrb5DomainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteSettingsKrb5Domain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5DomainId** | **String**| Remove a krb5 domain. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSettingsKrb5Realm"></a>
# **deleteSettingsKrb5Realm**
> deleteSettingsKrb5Realm(settingsKrb5RealmId)



Remove a realm.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String settingsKrb5RealmId = "settingsKrb5RealmId_example"; // String | Remove a realm.
try {
    apiInstance.deleteSettingsKrb5Realm(settingsKrb5RealmId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#deleteSettingsKrb5Realm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5RealmId** | **String**| Remove a realm. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthAccessUser"></a>
# **getAuthAccessUser**
> AuthAccess getAuthAccessUser(authAccessUser, path, share, zone, numeric)



Determine user&#39;s access rights to a file

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authAccessUser = "authAccessUser_example"; // String | Determine user's access rights to a file
String path = "path_example"; // String | Path to the file. Must be within /ifs.
String share = "share_example"; // String | SMB share name
String zone = "zone_example"; // String | Access zone the user is in.
Boolean numeric = true; // Boolean | Show the user's numeric identifier.
try {
    AuthAccess result = apiInstance.getAuthAccessUser(authAccessUser, path, share, zone, numeric);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthAccessUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authAccessUser** | **String**| Determine user&#39;s access rights to a file |
 **path** | **String**| Path to the file. Must be within /ifs. | [optional]
 **share** | **String**| SMB share name | [optional]
 **zone** | **String**| Access zone the user is in. | [optional]
 **numeric** | **Boolean**| Show the user&#39;s numeric identifier. | [optional]

### Return type

[**AuthAccess**](AuthAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthGroup"></a>
# **getAuthGroup**
> AuthGroups getAuthGroup(authGroupId, cached, resolveNames, queryMemberOf, zone, provider)



Retrieve the group information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authGroupId = "authGroupId_example"; // String | Retrieve the group information.
Boolean cached = true; // Boolean | If true, only return cached objects.
Boolean resolveNames = true; // Boolean | Resolve names of personas.
Boolean queryMemberOf = true; // Boolean | Enumerate all groups that a group is a member of.
String zone = "zone_example"; // String | Filter groups by zone.
String provider = "provider_example"; // String | Filter groups by provider.
try {
    AuthGroups result = apiInstance.getAuthGroup(authGroupId, cached, resolveNames, queryMemberOf, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authGroupId** | **String**| Retrieve the group information. |
 **cached** | **Boolean**| If true, only return cached objects. | [optional]
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **queryMemberOf** | **Boolean**| Enumerate all groups that a group is a member of. | [optional]
 **zone** | **String**| Filter groups by zone. | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]

### Return type

[**AuthGroups**](AuthGroups.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthId"></a>
# **getAuthId**
> AuthId getAuthId()



Retrieve the current security token.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthId result = apiInstance.getAuthId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthId**](AuthId.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthLdapTemplate"></a>
# **getAuthLdapTemplate**
> AuthLdapTemplates getAuthLdapTemplate(authLdapTemplateId)



Retrieve the LDAP provider template.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authLdapTemplateId = "authLdapTemplateId_example"; // String | Retrieve the LDAP provider template.
try {
    AuthLdapTemplates result = apiInstance.getAuthLdapTemplate(authLdapTemplateId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthLdapTemplate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authLdapTemplateId** | **String**| Retrieve the LDAP provider template. |

### Return type

[**AuthLdapTemplates**](AuthLdapTemplates.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthLdapTemplates"></a>
# **getAuthLdapTemplates**
> AuthLdapTemplatesExtended getAuthLdapTemplates()



List all LDAP provider templates.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthLdapTemplatesExtended result = apiInstance.getAuthLdapTemplates();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthLdapTemplates");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthLdapTemplatesExtended**](AuthLdapTemplatesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthLogLevel"></a>
# **getAuthLogLevel**
> AuthLogLevel getAuthLogLevel()



Get the current authentications service and netlogon logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthLogLevel result = apiInstance.getAuthLogLevel();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthLogLevel");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthLogLevel**](AuthLogLevel.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthNetgroup"></a>
# **getAuthNetgroup**
> AuthNetgroups getAuthNetgroup(authNetgroupId, ignoreErrors, recursive, zone, provider)



Retrieve the user information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authNetgroupId = "authNetgroupId_example"; // String | Retrieve the user information.
Boolean ignoreErrors = true; // Boolean | Ignore netgroup errors.
Boolean recursive = true; // Boolean | Perform recursive search.
String zone = "zone_example"; // String | Filter users by zone.
String provider = "provider_example"; // String | Filter users by provider.
try {
    AuthNetgroups result = apiInstance.getAuthNetgroup(authNetgroupId, ignoreErrors, recursive, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthNetgroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authNetgroupId** | **String**| Retrieve the user information. |
 **ignoreErrors** | **Boolean**| Ignore netgroup errors. | [optional]
 **recursive** | **Boolean**| Perform recursive search. | [optional]
 **zone** | **String**| Filter users by zone. | [optional]
 **provider** | **String**| Filter users by provider. | [optional]

### Return type

[**AuthNetgroups**](AuthNetgroups.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthPrivileges"></a>
# **getAuthPrivileges**
> AuthPrivileges getAuthPrivileges()



List all privileges.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthPrivileges result = apiInstance.getAuthPrivileges();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthPrivileges");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthPrivileges**](AuthPrivileges.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthRole"></a>
# **getAuthRole**
> AuthRoles getAuthRole(authRoleId, resolveNames)



Retrieve the role information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authRoleId = "authRoleId_example"; // String | Retrieve the role information.
Boolean resolveNames = true; // Boolean | Resolve names of personas.
try {
    AuthRoles result = apiInstance.getAuthRole(authRoleId, resolveNames);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRoleId** | **String**| Retrieve the role information. |
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]

### Return type

[**AuthRoles**](AuthRoles.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthShells"></a>
# **getAuthShells**
> AuthShells getAuthShells()



List all shells.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthShells result = apiInstance.getAuthShells();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthShells");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthShells**](AuthShells.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthUser"></a>
# **getAuthUser**
> AuthUsers getAuthUser(authUserId, cached, resolveNames, queryMemberOf, zone, provider)



Retrieve the user information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authUserId = "authUserId_example"; // String | Retrieve the user information.
Boolean cached = true; // Boolean | If true, only return cached objects.
Boolean resolveNames = true; // Boolean | Resolve names of personas.
Boolean queryMemberOf = true; // Boolean | Enumerate all users that a group is a member of.
String zone = "zone_example"; // String | Filter users by zone.
String provider = "provider_example"; // String | Filter users by provider.
try {
    AuthUsers result = apiInstance.getAuthUser(authUserId, cached, resolveNames, queryMemberOf, zone, provider);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUserId** | **String**| Retrieve the user information. |
 **cached** | **Boolean**| If true, only return cached objects. | [optional]
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **queryMemberOf** | **Boolean**| Enumerate all users that a group is a member of. | [optional]
 **zone** | **String**| Filter users by zone. | [optional]
 **provider** | **String**| Filter users by provider. | [optional]

### Return type

[**AuthUsers**](AuthUsers.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthWellknown"></a>
# **getAuthWellknown**
> AuthWellknowns getAuthWellknown(authWellknownId, scope)



Retrieve the wellknown persona.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String authWellknownId = "authWellknownId_example"; // String | Retrieve the wellknown persona.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    AuthWellknowns result = apiInstance.getAuthWellknown(authWellknownId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthWellknown");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authWellknownId** | **String**| Retrieve the wellknown persona. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**AuthWellknowns**](AuthWellknowns.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAuthWellknowns"></a>
# **getAuthWellknowns**
> AuthWellknowns getAuthWellknowns()



List all wellknown personas.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    AuthWellknowns result = apiInstance.getAuthWellknowns();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getAuthWellknowns");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthWellknowns**](AuthWellknowns.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMappingDump"></a>
# **getMappingDump**
> MappingDump getMappingDump(nocreate, zone)



Retrieve all identity mappings (uid, gid, sid, and on-disk) for the supplied source persona.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Boolean nocreate = true; // Boolean | Idmap should attempt to create missing identity mappings.
String zone = "zone_example"; // String | Optional zone.
try {
    MappingDump result = apiInstance.getMappingDump(nocreate, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getMappingDump");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nocreate** | **Boolean**| Idmap should attempt to create missing identity mappings. | [optional]
 **zone** | **String**| Optional zone. | [optional]

### Return type

[**MappingDump**](MappingDump.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMappingIdentity"></a>
# **getMappingIdentity**
> MappingIdentities getMappingIdentity(mappingIdentityId, nocreate, zone)



Retrieve all identity mappings (uid, gid, sid, and on-disk) for the supplied source persona.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String mappingIdentityId = "mappingIdentityId_example"; // String | Retrieve all identity mappings (uid, gid, sid, and on-disk) for the supplied source persona.
Boolean nocreate = true; // Boolean | Idmap should attempt to create missing identity mappings.
String zone = "zone_example"; // String | Optional zone.
try {
    MappingIdentities result = apiInstance.getMappingIdentity(mappingIdentityId, nocreate, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getMappingIdentity");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingIdentityId** | **String**| Retrieve all identity mappings (uid, gid, sid, and on-disk) for the supplied source persona. |
 **nocreate** | **Boolean**| Idmap should attempt to create missing identity mappings. | [optional]
 **zone** | **String**| Optional zone. | [optional]

### Return type

[**MappingIdentities**](MappingIdentities.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMappingUsersLookup"></a>
# **getMappingUsersLookup**
> MappingUsersLookup getMappingUsersLookup(primaryGid, uid, zone, gid, user, kerberosPrincipal)



Retrieve the user information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
Integer primaryGid = 56; // Integer | The user's primary group ID.
Integer uid = 56; // Integer | The user ID.
String zone = "zone_example"; // String | The zone the user belongs to.
List<Integer> gid = Arrays.asList(56); // List<Integer> | The IDs of the groups that the user belongs to.
String user = "user_example"; // String | The user name.
String kerberosPrincipal = "kerberosPrincipal_example"; // String | The Kerberos principal name, of the form user@realm.
try {
    MappingUsersLookup result = apiInstance.getMappingUsersLookup(primaryGid, uid, zone, gid, user, kerberosPrincipal);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getMappingUsersLookup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **primaryGid** | **Integer**| The user&#39;s primary group ID. | [optional]
 **uid** | **Integer**| The user ID. | [optional]
 **zone** | **String**| The zone the user belongs to. | [optional]
 **gid** | [**List&lt;Integer&gt;**](Integer.md)| The IDs of the groups that the user belongs to. | [optional]
 **user** | **String**| The user name. | [optional]
 **kerberosPrincipal** | **String**| The Kerberos principal name, of the form user@realm. | [optional]

### Return type

[**MappingUsersLookup**](MappingUsersLookup.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMappingUsersRules"></a>
# **getMappingUsersRules**
> MappingUsersRules getMappingUsersRules(zone)



Retrieve the user mapping rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String zone = "zone_example"; // String | The zone to which the user mapping applies.
try {
    MappingUsersRules result = apiInstance.getMappingUsersRules(zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getMappingUsersRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **zone** | **String**| The zone to which the user mapping applies. | [optional]

### Return type

[**MappingUsersRules**](MappingUsersRules.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersAdsById"></a>
# **getProvidersAdsById**
> ProvidersAds getProvidersAdsById(providersAdsId, scope)



Retrieve the ADS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersAdsId = "providersAdsId_example"; // String | Retrieve the ADS provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersAds result = apiInstance.getProvidersAdsById(providersAdsId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersAdsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersAdsId** | **String**| Retrieve the ADS provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersAds**](ProvidersAds.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersFileById"></a>
# **getProvidersFileById**
> ProvidersFile getProvidersFileById(providersFileId, scope)



Retrieve the file provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersFileId = "providersFileId_example"; // String | Retrieve the file provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersFile result = apiInstance.getProvidersFileById(providersFileId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersFileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersFileId** | **String**| Retrieve the file provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersFile**](ProvidersFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersKrb5ById"></a>
# **getProvidersKrb5ById**
> ProvidersKrb5 getProvidersKrb5ById(providersKrb5Id, scope)



Retrieve the KRB5 provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersKrb5Id = "providersKrb5Id_example"; // String | Retrieve the KRB5 provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersKrb5 result = apiInstance.getProvidersKrb5ById(providersKrb5Id, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersKrb5ById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersKrb5Id** | **String**| Retrieve the KRB5 provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersKrb5**](ProvidersKrb5.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersLdapById"></a>
# **getProvidersLdapById**
> ProvidersLdap getProvidersLdapById(providersLdapId, scope)



Retrieve the LDAP provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersLdapId = "providersLdapId_example"; // String | Retrieve the LDAP provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersLdap result = apiInstance.getProvidersLdapById(providersLdapId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersLdapById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLdapId** | **String**| Retrieve the LDAP provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersLdap**](ProvidersLdap.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersLocal"></a>
# **getProvidersLocal**
> ProvidersLocal getProvidersLocal(scope)



List all local providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersLocal result = apiInstance.getProvidersLocal(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersLocal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersLocal**](ProvidersLocal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersLocalById"></a>
# **getProvidersLocalById**
> ProvidersLocal getProvidersLocalById(providersLocalId, scope)



Retrieve the local provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersLocalId = "providersLocalId_example"; // String | Retrieve the local provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersLocal result = apiInstance.getProvidersLocalById(providersLocalId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersLocalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLocalId** | **String**| Retrieve the local provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersLocal**](ProvidersLocal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersNisById"></a>
# **getProvidersNisById**
> ProvidersNis getProvidersNisById(providersNisId, scope)



Retrieve the NIS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String providersNisId = "providersNisId_example"; // String | Retrieve the NIS provider.
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersNis result = apiInstance.getProvidersNisById(providersNisId, scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersNisById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersNisId** | **String**| Retrieve the NIS provider. |
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersNis**](ProvidersNis.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProvidersSummary"></a>
# **getProvidersSummary**
> ProvidersSummary getProvidersSummary(groupnet, zone)



Retrieve the summary information.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String groupnet = "groupnet_example"; // String | Filter providers by groupnet.
String zone = "zone_example"; // String | Filter providers by zone.
try {
    ProvidersSummary result = apiInstance.getProvidersSummary(groupnet, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getProvidersSummary");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **groupnet** | **String**| Filter providers by groupnet. | [optional]
 **zone** | **String**| Filter providers by zone. | [optional]

### Return type

[**ProvidersSummary**](ProvidersSummary.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsAcls"></a>
# **getSettingsAcls**
> SettingsAcls getSettingsAcls(preset)



Retrieve the ACL policy settings and preset configurations.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String preset = "preset_example"; // String | If specified the preset configuration values for all applicable ACL policies are returned.
try {
    SettingsAcls result = apiInstance.getSettingsAcls(preset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsAcls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **preset** | **String**| If specified the preset configuration values for all applicable ACL policies are returned. | [optional] [enum: balanced, unix, windows]

### Return type

[**SettingsAcls**](SettingsAcls.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsGlobal"></a>
# **getSettingsGlobal**
> SettingsGlobal getSettingsGlobal(scope, zone)



Retrieve the global settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String zone = "zone_example"; // String | Zone which contains any per-zone settings.
try {
    SettingsGlobal result = apiInstance.getSettingsGlobal(scope, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **zone** | **String**| Zone which contains any per-zone settings. | [optional]

### Return type

[**SettingsGlobal**](SettingsGlobal.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsKrb5Defaults"></a>
# **getSettingsKrb5Defaults**
> SettingsKrb5Defaults getSettingsKrb5Defaults()



Retrieve the krb5 settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    SettingsKrb5Defaults result = apiInstance.getSettingsKrb5Defaults();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsKrb5Defaults");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsKrb5Defaults**](SettingsKrb5Defaults.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsKrb5Domain"></a>
# **getSettingsKrb5Domain**
> SettingsKrb5Domains getSettingsKrb5Domain(settingsKrb5DomainId)



View the krb5 domain settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String settingsKrb5DomainId = "settingsKrb5DomainId_example"; // String | View the krb5 domain settings.
try {
    SettingsKrb5Domains result = apiInstance.getSettingsKrb5Domain(settingsKrb5DomainId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsKrb5Domain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5DomainId** | **String**| View the krb5 domain settings. |

### Return type

[**SettingsKrb5Domains**](SettingsKrb5Domains.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsKrb5Realm"></a>
# **getSettingsKrb5Realm**
> SettingsKrb5Realms getSettingsKrb5Realm(settingsKrb5RealmId)



Retrieve the krb5 settings for realms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String settingsKrb5RealmId = "settingsKrb5RealmId_example"; // String | Retrieve the krb5 settings for realms.
try {
    SettingsKrb5Realms result = apiInstance.getSettingsKrb5Realm(settingsKrb5RealmId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsKrb5Realm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5RealmId** | **String**| Retrieve the krb5 settings for realms. |

### Return type

[**SettingsKrb5Realms**](SettingsKrb5Realms.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSettingsMapping"></a>
# **getSettingsMapping**
> SettingsMapping getSettingsMapping(scope, zone)



Retrieve the mapping settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
String zone = "zone_example"; // String | Access zone which contains mapping settings.
try {
    SettingsMapping result = apiInstance.getSettingsMapping(scope, zone);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#getSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]
 **zone** | **String**| Access zone which contains mapping settings. | [optional]

### Return type

[**SettingsMapping**](SettingsMapping.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAuthGroups"></a>
# **listAuthGroups**
> AuthGroupsExtended listAuthGroups(domain, zone, resume, cached, resolveNames, filter, limit, provider, queryMemberOf)



List all groups.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String domain = "domain_example"; // String | Filter groups by domain.
String zone = "zone_example"; // String | Filter groups by zone.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean cached = true; // Boolean | If true, only return cached objects.
Boolean resolveNames = true; // Boolean | Resolve names of personas.
String filter = "filter_example"; // String | Filter groups by name prefix.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String provider = "provider_example"; // String | Filter groups by provider.
Boolean queryMemberOf = true; // Boolean | Enumerate all groups that a group is a member of.
try {
    AuthGroupsExtended result = apiInstance.listAuthGroups(domain, zone, resume, cached, resolveNames, filter, limit, provider, queryMemberOf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listAuthGroups");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Filter groups by domain. | [optional]
 **zone** | **String**| Filter groups by zone. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **cached** | **Boolean**| If true, only return cached objects. | [optional]
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **filter** | **String**| Filter groups by name prefix. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **provider** | **String**| Filter groups by provider. | [optional]
 **queryMemberOf** | **Boolean**| Enumerate all groups that a group is a member of. | [optional]

### Return type

[**AuthGroupsExtended**](AuthGroupsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAuthRoles"></a>
# **listAuthRoles**
> AuthRolesExtended listAuthRoles(sort, resolveNames, limit, dir, resume)



List all roles.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String sort = "sort_example"; // String | The field that will be used for sorting.
Boolean resolveNames = true; // Boolean | Filter users by zone.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String dir = "dir_example"; // String | The direction of the sort.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
try {
    AuthRolesExtended result = apiInstance.listAuthRoles(sort, resolveNames, limit, dir, resume);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listAuthRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sort** | **String**| The field that will be used for sorting. | [optional]
 **resolveNames** | **Boolean**| Filter users by zone. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **dir** | **String**| The direction of the sort. | [optional] [enum: ASC, DESC]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]

### Return type

[**AuthRolesExtended**](AuthRolesExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAuthUsers"></a>
# **listAuthUsers**
> AuthUsersExtended listAuthUsers(domain, zone, resume, cached, resolveNames, filter, limit, provider, queryMemberOf)



List all users.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String domain = "domain_example"; // String | Filter users by domain.
String zone = "zone_example"; // String | Filter users by zone.
String resume = "resume_example"; // String | Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options).
Boolean cached = true; // Boolean | If true, only return cached objects.
Boolean resolveNames = true; // Boolean | Resolve names of personas.
String filter = "filter_example"; // String | Filter users by name prefix.
Integer limit = 56; // Integer | Return no more than this many results at once (see resume).
String provider = "provider_example"; // String | Filter users by provider.
Boolean queryMemberOf = true; // Boolean | Enumerate all users that a group is a member of.
try {
    AuthUsersExtended result = apiInstance.listAuthUsers(domain, zone, resume, cached, resolveNames, filter, limit, provider, queryMemberOf);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listAuthUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **domain** | **String**| Filter users by domain. | [optional]
 **zone** | **String**| Filter users by zone. | [optional]
 **resume** | **String**| Continue returning results from previous call using this token (token should come from the previous call, resume cannot be used with other options). | [optional]
 **cached** | **Boolean**| If true, only return cached objects. | [optional]
 **resolveNames** | **Boolean**| Resolve names of personas. | [optional]
 **filter** | **String**| Filter users by name prefix. | [optional]
 **limit** | **Integer**| Return no more than this many results at once (see resume). | [optional]
 **provider** | **String**| Filter users by provider. | [optional]
 **queryMemberOf** | **Boolean**| Enumerate all users that a group is a member of. | [optional]

### Return type

[**AuthUsersExtended**](AuthUsersExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProvidersAds"></a>
# **listProvidersAds**
> ProvidersAdsExtended listProvidersAds(scope)



List all ADS providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersAdsExtended result = apiInstance.listProvidersAds(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listProvidersAds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersAdsExtended**](ProvidersAdsExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProvidersFile"></a>
# **listProvidersFile**
> ProvidersFile listProvidersFile(scope)



List all file providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersFile result = apiInstance.listProvidersFile(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listProvidersFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersFile**](ProvidersFile.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProvidersKrb5"></a>
# **listProvidersKrb5**
> ProvidersKrb5Extended listProvidersKrb5(scope)



List all KRB5 providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersKrb5Extended result = apiInstance.listProvidersKrb5(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listProvidersKrb5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersKrb5Extended**](ProvidersKrb5Extended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProvidersLdap"></a>
# **listProvidersLdap**
> ProvidersLdap listProvidersLdap(scope)



List all LDAP providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersLdap result = apiInstance.listProvidersLdap(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listProvidersLdap");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersLdap**](ProvidersLdap.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProvidersNis"></a>
# **listProvidersNis**
> ProvidersNisExtended listProvidersNis(scope)



List all NIS providers.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
String scope = "scope_example"; // String | If specified as \"effective\" or not specified, all fields are returned.  If specified as \"user\", only fields with non-default values are shown.  If specified as \"default\", the original values are returned.
try {
    ProvidersNisExtended result = apiInstance.listProvidersNis(scope);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listProvidersNis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scope** | **String**| If specified as \&quot;effective\&quot; or not specified, all fields are returned.  If specified as \&quot;user\&quot;, only fields with non-default values are shown.  If specified as \&quot;default\&quot;, the original values are returned. | [optional] [enum: user, default, effective]

### Return type

[**ProvidersNisExtended**](ProvidersNisExtended.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSettingsKrb5Domains"></a>
# **listSettingsKrb5Domains**
> SettingsKrb5Domains listSettingsKrb5Domains()



Retrieve the krb5 settings for domains.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    SettingsKrb5Domains result = apiInstance.listSettingsKrb5Domains();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listSettingsKrb5Domains");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsKrb5Domains**](SettingsKrb5Domains.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSettingsKrb5Realms"></a>
# **listSettingsKrb5Realms**
> SettingsKrb5Realms listSettingsKrb5Realms()



Retrieve the krb5 settings for realms.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
try {
    SettingsKrb5Realms result = apiInstance.listSettingsKrb5Realms();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#listSettingsKrb5Realms");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**SettingsKrb5Realms**](SettingsKrb5Realms.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthGroup"></a>
# **updateAuthGroup**
> updateAuthGroup(authGroup, authGroupId, force, zone, provider)



Modify the group.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthGroup authGroup = new AuthGroup(); // AuthGroup | 
String authGroupId = "authGroupId_example"; // String | Modify the group.
Boolean force = true; // Boolean | Changes to the group ID can result in loss of access to the file system. To mitigate this risk of lost access, the force option is required for group ID changes.
String zone = "zone_example"; // String | Optional zone.
String provider = "provider_example"; // String | Optional provider type.
try {
    apiInstance.updateAuthGroup(authGroup, authGroupId, force, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateAuthGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authGroup** | [**AuthGroup**](AuthGroup.md)|  |
 **authGroupId** | **String**| Modify the group. |
 **force** | **Boolean**| Changes to the group ID can result in loss of access to the file system. To mitigate this risk of lost access, the force option is required for group ID changes. | [optional]
 **zone** | **String**| Optional zone. | [optional]
 **provider** | **String**| Optional provider type. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthLogLevel"></a>
# **updateAuthLogLevel**
> updateAuthLogLevel(authLogLevel)



Set the current authentication service and netlogon logging level.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthLogLevelExtended authLogLevel = new AuthLogLevelExtended(); // AuthLogLevelExtended | 
try {
    apiInstance.updateAuthLogLevel(authLogLevel);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateAuthLogLevel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authLogLevel** | [**AuthLogLevelExtended**](AuthLogLevelExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthRole"></a>
# **updateAuthRole**
> updateAuthRole(authRole, authRoleId)



Modify the role.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthRole authRole = new AuthRole(); // AuthRole | 
String authRoleId = "authRoleId_example"; // String | Modify the role.
try {
    apiInstance.updateAuthRole(authRole, authRoleId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateAuthRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRole** | [**AuthRole**](AuthRole.md)|  |
 **authRoleId** | **String**| Modify the role. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAuthUser"></a>
# **updateAuthUser**
> updateAuthUser(authUser, authUserId, force, zone, provider)



Modify the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
AuthUser authUser = new AuthUser(); // AuthUser | 
String authUserId = "authUserId_example"; // String | Modify the user.
Boolean force = true; // Boolean | Changes to the user ID can result in loss of access to the file system. To mitigate this risk of lost access, the force option is required for user ID changes.
String zone = "zone_example"; // String | Optional zone.
String provider = "provider_example"; // String | Optional provider type.
try {
    apiInstance.updateAuthUser(authUser, authUserId, force, zone, provider);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateAuthUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authUser** | [**AuthUser**](AuthUser.md)|  |
 **authUserId** | **String**| Modify the user. |
 **force** | **Boolean**| Changes to the user ID can result in loss of access to the file system. To mitigate this risk of lost access, the force option is required for user ID changes. | [optional]
 **zone** | **String**| Optional zone. | [optional]
 **provider** | **String**| Optional provider type. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMappingImport"></a>
# **updateMappingImport**
> updateMappingImport(mappingImport, zone, replace)



Set or update a list of mappings between two personae.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
MappingImport mappingImport = new MappingImport(); // MappingImport | 
String zone = "zone_example"; // String | Optional zone.
Boolean replace = true; // Boolean | Specify whether existing mappings should be replaced. The default behavior is to leave existing mappings intact and return an error.
try {
    apiInstance.updateMappingImport(mappingImport, zone, replace);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateMappingImport");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingImport** | [**MappingImport**](MappingImport.md)|  |
 **zone** | **String**| Optional zone. | [optional]
 **replace** | **Boolean**| Specify whether existing mappings should be replaced. The default behavior is to leave existing mappings intact and return an error. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMappingUsersRules"></a>
# **updateMappingUsersRules**
> updateMappingUsersRules(mappingUsersRules, zone)



Modify the user mapping rules.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
MappingUsersRulesExtended mappingUsersRules = new MappingUsersRulesExtended(); // MappingUsersRulesExtended | 
String zone = "zone_example"; // String | The zone to which the user mapping applies.
try {
    apiInstance.updateMappingUsersRules(mappingUsersRules, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateMappingUsersRules");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **mappingUsersRules** | [**MappingUsersRulesExtended**](MappingUsersRulesExtended.md)|  |
 **zone** | **String**| The zone to which the user mapping applies. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersAdsById"></a>
# **updateProvidersAdsById**
> updateProvidersAdsById(providersAdsIdParams, providersAdsId)



Modify the ADS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersAdsIdParams providersAdsIdParams = new ProvidersAdsIdParams(); // ProvidersAdsIdParams | 
String providersAdsId = "providersAdsId_example"; // String | Modify the ADS provider.
try {
    apiInstance.updateProvidersAdsById(providersAdsIdParams, providersAdsId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersAdsById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersAdsIdParams** | [**ProvidersAdsIdParams**](ProvidersAdsIdParams.md)|  |
 **providersAdsId** | **String**| Modify the ADS provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersFileById"></a>
# **updateProvidersFileById**
> updateProvidersFileById(providersFileIdParams, providersFileId)



Modify the file provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersFileIdParams providersFileIdParams = new ProvidersFileIdParams(); // ProvidersFileIdParams | 
String providersFileId = "providersFileId_example"; // String | Modify the file provider.
try {
    apiInstance.updateProvidersFileById(providersFileIdParams, providersFileId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersFileById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersFileIdParams** | [**ProvidersFileIdParams**](ProvidersFileIdParams.md)|  |
 **providersFileId** | **String**| Modify the file provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersKrb5ById"></a>
# **updateProvidersKrb5ById**
> updateProvidersKrb5ById(providersKrb5IdParams, providersKrb5Id)



Modify the KRB5 provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersKrb5IdParams providersKrb5IdParams = new ProvidersKrb5IdParams(); // ProvidersKrb5IdParams | 
String providersKrb5Id = "providersKrb5Id_example"; // String | Modify the KRB5 provider.
try {
    apiInstance.updateProvidersKrb5ById(providersKrb5IdParams, providersKrb5Id);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersKrb5ById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersKrb5IdParams** | [**ProvidersKrb5IdParams**](ProvidersKrb5IdParams.md)|  |
 **providersKrb5Id** | **String**| Modify the KRB5 provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersLdapById"></a>
# **updateProvidersLdapById**
> updateProvidersLdapById(providersLdapIdParams, providersLdapId, force)



Modify the LDAP provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersLdapIdParams providersLdapIdParams = new ProvidersLdapIdParams(); // ProvidersLdapIdParams | 
String providersLdapId = "providersLdapId_example"; // String | Modify the LDAP provider.
Boolean force = true; // Boolean | Ignore unresolvable server URIs.
try {
    apiInstance.updateProvidersLdapById(providersLdapIdParams, providersLdapId, force);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersLdapById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLdapIdParams** | [**ProvidersLdapIdParams**](ProvidersLdapIdParams.md)|  |
 **providersLdapId** | **String**| Modify the LDAP provider. |
 **force** | **Boolean**| Ignore unresolvable server URIs. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersLocalById"></a>
# **updateProvidersLocalById**
> updateProvidersLocalById(providersLocalIdParams, providersLocalId)



Modify the local provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersLocalIdParams providersLocalIdParams = new ProvidersLocalIdParams(); // ProvidersLocalIdParams | 
String providersLocalId = "providersLocalId_example"; // String | Modify the local provider.
try {
    apiInstance.updateProvidersLocalById(providersLocalIdParams, providersLocalId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersLocalById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersLocalIdParams** | [**ProvidersLocalIdParams**](ProvidersLocalIdParams.md)|  |
 **providersLocalId** | **String**| Modify the local provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProvidersNisById"></a>
# **updateProvidersNisById**
> updateProvidersNisById(providersNisIdParams, providersNisId)



Modify the NIS provider.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
ProvidersNisIdParams providersNisIdParams = new ProvidersNisIdParams(); // ProvidersNisIdParams | 
String providersNisId = "providersNisId_example"; // String | Modify the NIS provider.
try {
    apiInstance.updateProvidersNisById(providersNisIdParams, providersNisId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateProvidersNisById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providersNisIdParams** | [**ProvidersNisIdParams**](ProvidersNisIdParams.md)|  |
 **providersNisId** | **String**| Modify the NIS provider. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsAcls"></a>
# **updateSettingsAcls**
> updateSettingsAcls(settingsAcls)



Modify cluster ACL policy settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsAclsExtended settingsAcls = new SettingsAclsExtended(); // SettingsAclsExtended | 
try {
    apiInstance.updateSettingsAcls(settingsAcls);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsAcls");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsAcls** | [**SettingsAclsExtended**](SettingsAclsExtended.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsGlobal"></a>
# **updateSettingsGlobal**
> updateSettingsGlobal(settingsGlobal, zone)



Modify the global settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsGlobalGlobalSettings settingsGlobal = new SettingsGlobalGlobalSettings(); // SettingsGlobalGlobalSettings | 
String zone = "zone_example"; // String | Zone which contains any per-zone settings.
try {
    apiInstance.updateSettingsGlobal(settingsGlobal, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsGlobal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsGlobal** | [**SettingsGlobalGlobalSettings**](SettingsGlobalGlobalSettings.md)|  |
 **zone** | **String**| Zone which contains any per-zone settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsKrb5Defaults"></a>
# **updateSettingsKrb5Defaults**
> updateSettingsKrb5Defaults(settingsKrb5Defaults)



Modify the krb5 settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsKrb5DefaultsKrb5Settings settingsKrb5Defaults = new SettingsKrb5DefaultsKrb5Settings(); // SettingsKrb5DefaultsKrb5Settings | 
try {
    apiInstance.updateSettingsKrb5Defaults(settingsKrb5Defaults);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsKrb5Defaults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5Defaults** | [**SettingsKrb5DefaultsKrb5Settings**](SettingsKrb5DefaultsKrb5Settings.md)|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsKrb5Domain"></a>
# **updateSettingsKrb5Domain**
> updateSettingsKrb5Domain(settingsKrb5Domain, settingsKrb5DomainId)



Modify the krb5 domain settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsKrb5Domain settingsKrb5Domain = new SettingsKrb5Domain(); // SettingsKrb5Domain | 
String settingsKrb5DomainId = "settingsKrb5DomainId_example"; // String | Modify the krb5 domain settings.
try {
    apiInstance.updateSettingsKrb5Domain(settingsKrb5Domain, settingsKrb5DomainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsKrb5Domain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5Domain** | [**SettingsKrb5Domain**](SettingsKrb5Domain.md)|  |
 **settingsKrb5DomainId** | **String**| Modify the krb5 domain settings. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsKrb5Realm"></a>
# **updateSettingsKrb5Realm**
> updateSettingsKrb5Realm(settingsKrb5Realm, settingsKrb5RealmId)



Modify the krb5 realm settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsKrb5Realm settingsKrb5Realm = new SettingsKrb5Realm(); // SettingsKrb5Realm | 
String settingsKrb5RealmId = "settingsKrb5RealmId_example"; // String | Modify the krb5 realm settings.
try {
    apiInstance.updateSettingsKrb5Realm(settingsKrb5Realm, settingsKrb5RealmId);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsKrb5Realm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsKrb5Realm** | [**SettingsKrb5Realm**](SettingsKrb5Realm.md)|  |
 **settingsKrb5RealmId** | **String**| Modify the krb5 realm settings. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSettingsMapping"></a>
# **updateSettingsMapping**
> updateSettingsMapping(settingsMapping, zone)



Modify the mapping settings.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AuthApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

AuthApi apiInstance = new AuthApi();
SettingsMappingMappingSettings settingsMapping = new SettingsMappingMappingSettings(); // SettingsMappingMappingSettings | 
String zone = "zone_example"; // String | Access zone which contains mapping settings.
try {
    apiInstance.updateSettingsMapping(settingsMapping, zone);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#updateSettingsMapping");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **settingsMapping** | [**SettingsMappingMappingSettings**](SettingsMappingMappingSettings.md)|  |
 **zone** | **String**| Access zone which contains mapping settings. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

