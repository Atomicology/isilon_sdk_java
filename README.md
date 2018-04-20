# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.*;
import io.swagger.client.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AntivirusApi;

import java.io.File;
import java.util.*;

public class AntivirusApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        defaultClient.setBasePath("https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080");
        defaultClient.setVerifyingSsl(false);

        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AntivirusApi apiInstance = new AntivirusApi();
        AntivirusPolicyCreateParams antivirusPolicy = new AntivirusPolicyCreateParams(); // AntivirusPolicyCreateParams |
        try {
            CreateResponse result = apiInstance.createAntivirusPolicy(antivirusPolicy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AntivirusApi#createAntivirusPolicy");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://YOUR_CLUSTER_HOSTNAME_OR_NODE_IP:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AntivirusApi* | [**createAntivirusPolicy**](docs/AntivirusApi.md#createAntivirusPolicy) | **POST** /platform/3/antivirus/policies |
*AntivirusApi* | [**createAntivirusScanItem**](docs/AntivirusApi.md#createAntivirusScanItem) | **POST** /platform/3/antivirus/scan |
*AntivirusApi* | [**createAntivirusServer**](docs/AntivirusApi.md#createAntivirusServer) | **POST** /platform/3/antivirus/servers |
*AntivirusApi* | [**deleteAntivirusPolicies**](docs/AntivirusApi.md#deleteAntivirusPolicies) | **DELETE** /platform/3/antivirus/policies |
*AntivirusApi* | [**deleteAntivirusPolicy**](docs/AntivirusApi.md#deleteAntivirusPolicy) | **DELETE** /platform/3/antivirus/policies/{AntivirusPolicyId} |
*AntivirusApi* | [**deleteAntivirusServer**](docs/AntivirusApi.md#deleteAntivirusServer) | **DELETE** /platform/3/antivirus/servers/{AntivirusServerId} |
*AntivirusApi* | [**deleteAntivirusServers**](docs/AntivirusApi.md#deleteAntivirusServers) | **DELETE** /platform/3/antivirus/servers |
*AntivirusApi* | [**deleteReportsScan**](docs/AntivirusApi.md#deleteReportsScan) | **DELETE** /platform/3/antivirus/reports/scans/{ReportsScanId} |
*AntivirusApi* | [**deleteReportsScans**](docs/AntivirusApi.md#deleteReportsScans) | **DELETE** /platform/3/antivirus/reports/scans |
*AntivirusApi* | [**getAntivirusPolicy**](docs/AntivirusApi.md#getAntivirusPolicy) | **GET** /platform/3/antivirus/policies/{AntivirusPolicyId} |
*AntivirusApi* | [**getAntivirusQuarantinePath**](docs/AntivirusApi.md#getAntivirusQuarantinePath) | **GET** /platform/3/antivirus/quarantine/{AntivirusQuarantinePath} |
*AntivirusApi* | [**getAntivirusServer**](docs/AntivirusApi.md#getAntivirusServer) | **GET** /platform/3/antivirus/servers/{AntivirusServerId} |
*AntivirusApi* | [**getAntivirusSettings**](docs/AntivirusApi.md#getAntivirusSettings) | **GET** /platform/3/antivirus/settings |
*AntivirusApi* | [**getReportsScan**](docs/AntivirusApi.md#getReportsScan) | **GET** /platform/3/antivirus/reports/scans/{ReportsScanId} |
*AntivirusApi* | [**getReportsScans**](docs/AntivirusApi.md#getReportsScans) | **GET** /platform/3/antivirus/reports/scans |
*AntivirusApi* | [**getReportsThreat**](docs/AntivirusApi.md#getReportsThreat) | **GET** /platform/3/antivirus/reports/threats/{ReportsThreatId} |
*AntivirusApi* | [**getReportsThreats**](docs/AntivirusApi.md#getReportsThreats) | **GET** /platform/3/antivirus/reports/threats |
*AntivirusApi* | [**listAntivirusPolicies**](docs/AntivirusApi.md#listAntivirusPolicies) | **GET** /platform/3/antivirus/policies |
*AntivirusApi* | [**listAntivirusServers**](docs/AntivirusApi.md#listAntivirusServers) | **GET** /platform/3/antivirus/servers |
*AntivirusApi* | [**updateAntivirusPolicy**](docs/AntivirusApi.md#updateAntivirusPolicy) | **PUT** /platform/3/antivirus/policies/{AntivirusPolicyId} |
*AntivirusApi* | [**updateAntivirusQuarantinePath**](docs/AntivirusApi.md#updateAntivirusQuarantinePath) | **PUT** /platform/3/antivirus/quarantine/{AntivirusQuarantinePath} |
*AntivirusApi* | [**updateAntivirusServer**](docs/AntivirusApi.md#updateAntivirusServer) | **PUT** /platform/3/antivirus/servers/{AntivirusServerId} |
*AntivirusApi* | [**updateAntivirusSettings**](docs/AntivirusApi.md#updateAntivirusSettings) | **PUT** /platform/3/antivirus/settings |
*AuditApi* | [**createAuditTopic**](docs/AuditApi.md#createAuditTopic) | **POST** /platform/1/audit/topics |
*AuditApi* | [**deleteAuditTopic**](docs/AuditApi.md#deleteAuditTopic) | **DELETE** /platform/1/audit/topics/{AuditTopicId} |
*AuditApi* | [**getAuditProgress**](docs/AuditApi.md#getAuditProgress) | **GET** /platform/4/audit/progress |
*AuditApi* | [**getAuditSettings**](docs/AuditApi.md#getAuditSettings) | **GET** /platform/3/audit/settings |
*AuditApi* | [**getAuditTopic**](docs/AuditApi.md#getAuditTopic) | **GET** /platform/1/audit/topics/{AuditTopicId} |
*AuditApi* | [**getProgressGlobal**](docs/AuditApi.md#getProgressGlobal) | **GET** /platform/4/audit/progress/global |
*AuditApi* | [**getSettingsGlobal**](docs/AuditApi.md#getSettingsGlobal) | **GET** /platform/3/audit/settings/global |
*AuditApi* | [**listAuditTopics**](docs/AuditApi.md#listAuditTopics) | **GET** /platform/1/audit/topics |
*AuditApi* | [**updateAuditSettings**](docs/AuditApi.md#updateAuditSettings) | **PUT** /platform/3/audit/settings |
*AuditApi* | [**updateAuditTopic**](docs/AuditApi.md#updateAuditTopic) | **PUT** /platform/1/audit/topics/{AuditTopicId} |
*AuditApi* | [**updateSettingsGlobal**](docs/AuditApi.md#updateSettingsGlobal) | **PUT** /platform/3/audit/settings/global |
*AuthApi* | [**createAuthCacheItem**](docs/AuthApi.md#createAuthCacheItem) | **POST** /platform/4/auth/cache |
*AuthApi* | [**createAuthGroup**](docs/AuthApi.md#createAuthGroup) | **POST** /platform/1/auth/groups |
*AuthApi* | [**createAuthRefreshItem**](docs/AuthApi.md#createAuthRefreshItem) | **POST** /platform/3/auth/refresh |
*AuthApi* | [**createAuthRole**](docs/AuthApi.md#createAuthRole) | **POST** /platform/1/auth/roles |
*AuthApi* | [**createAuthUser**](docs/AuthApi.md#createAuthUser) | **POST** /platform/1/auth/users |
*AuthApi* | [**createMappingIdentity**](docs/AuthApi.md#createMappingIdentity) | **POST** /platform/1/auth/mapping/identities |
*AuthApi* | [**createMappingIdentity_0**](docs/AuthApi.md#createMappingIdentity_0) | **POST** /platform/1/auth/mapping/identities/{MappingIdentityId} |
*AuthApi* | [**createProvidersAdsItem**](docs/AuthApi.md#createProvidersAdsItem) | **POST** /platform/3/auth/providers/ads |
*AuthApi* | [**createProvidersFileItem**](docs/AuthApi.md#createProvidersFileItem) | **POST** /platform/1/auth/providers/file |
*AuthApi* | [**createProvidersKrb5Item**](docs/AuthApi.md#createProvidersKrb5Item) | **POST** /platform/3/auth/providers/krb5 |
*AuthApi* | [**createProvidersLdapItem**](docs/AuthApi.md#createProvidersLdapItem) | **POST** /platform/4/auth/providers/ldap |
*AuthApi* | [**createProvidersNisItem**](docs/AuthApi.md#createProvidersNisItem) | **POST** /platform/3/auth/providers/nis |
*AuthApi* | [**createSettingsKrb5Domain**](docs/AuthApi.md#createSettingsKrb5Domain) | **POST** /platform/1/auth/settings/krb5/domains |
*AuthApi* | [**createSettingsKrb5Realm**](docs/AuthApi.md#createSettingsKrb5Realm) | **POST** /platform/1/auth/settings/krb5/realms |
*AuthApi* | [**deleteAuthGroup**](docs/AuthApi.md#deleteAuthGroup) | **DELETE** /platform/1/auth/groups/{AuthGroupId} |
*AuthApi* | [**deleteAuthGroups**](docs/AuthApi.md#deleteAuthGroups) | **DELETE** /platform/1/auth/groups |
*AuthApi* | [**deleteAuthRole**](docs/AuthApi.md#deleteAuthRole) | **DELETE** /platform/1/auth/roles/{AuthRoleId} |
*AuthApi* | [**deleteAuthUser**](docs/AuthApi.md#deleteAuthUser) | **DELETE** /platform/1/auth/users/{AuthUserId} |
*AuthApi* | [**deleteAuthUsers**](docs/AuthApi.md#deleteAuthUsers) | **DELETE** /platform/1/auth/users |
*AuthApi* | [**deleteMappingIdentities**](docs/AuthApi.md#deleteMappingIdentities) | **DELETE** /platform/1/auth/mapping/identities |
*AuthApi* | [**deleteMappingIdentity**](docs/AuthApi.md#deleteMappingIdentity) | **DELETE** /platform/1/auth/mapping/identities/{MappingIdentityId} |
*AuthApi* | [**deleteProvidersAdsById**](docs/AuthApi.md#deleteProvidersAdsById) | **DELETE** /platform/3/auth/providers/ads/{ProvidersAdsId} |
*AuthApi* | [**deleteProvidersFileById**](docs/AuthApi.md#deleteProvidersFileById) | **DELETE** /platform/1/auth/providers/file/{ProvidersFileId} |
*AuthApi* | [**deleteProvidersKrb5ById**](docs/AuthApi.md#deleteProvidersKrb5ById) | **DELETE** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} |
*AuthApi* | [**deleteProvidersLdapById**](docs/AuthApi.md#deleteProvidersLdapById) | **DELETE** /platform/4/auth/providers/ldap/{ProvidersLdapId} |
*AuthApi* | [**deleteProvidersLocalById**](docs/AuthApi.md#deleteProvidersLocalById) | **DELETE** /platform/1/auth/providers/local/{ProvidersLocalId} |
*AuthApi* | [**deleteProvidersNisById**](docs/AuthApi.md#deleteProvidersNisById) | **DELETE** /platform/3/auth/providers/nis/{ProvidersNisId} |
*AuthApi* | [**deleteSettingsKrb5Domain**](docs/AuthApi.md#deleteSettingsKrb5Domain) | **DELETE** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} |
*AuthApi* | [**deleteSettingsKrb5Realm**](docs/AuthApi.md#deleteSettingsKrb5Realm) | **DELETE** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} |
*AuthApi* | [**getAuthAccessUser**](docs/AuthApi.md#getAuthAccessUser) | **GET** /platform/1/auth/access/{AuthAccessUser} |
*AuthApi* | [**getAuthGroup**](docs/AuthApi.md#getAuthGroup) | **GET** /platform/1/auth/groups/{AuthGroupId} |
*AuthApi* | [**getAuthId**](docs/AuthApi.md#getAuthId) | **GET** /platform/1/auth/id |
*AuthApi* | [**getAuthLdapTemplate**](docs/AuthApi.md#getAuthLdapTemplate) | **GET** /platform/4/auth/ldap-templates/{AuthLdapTemplateId} |
*AuthApi* | [**getAuthLdapTemplates**](docs/AuthApi.md#getAuthLdapTemplates) | **GET** /platform/4/auth/ldap-templates |
*AuthApi* | [**getAuthLogLevel**](docs/AuthApi.md#getAuthLogLevel) | **GET** /platform/3/auth/log-level |
*AuthApi* | [**getAuthNetgroup**](docs/AuthApi.md#getAuthNetgroup) | **GET** /platform/1/auth/netgroups/{AuthNetgroupId} |
*AuthApi* | [**getAuthPrivileges**](docs/AuthApi.md#getAuthPrivileges) | **GET** /platform/1/auth/privileges |
*AuthApi* | [**getAuthRole**](docs/AuthApi.md#getAuthRole) | **GET** /platform/1/auth/roles/{AuthRoleId} |
*AuthApi* | [**getAuthShells**](docs/AuthApi.md#getAuthShells) | **GET** /platform/1/auth/shells |
*AuthApi* | [**getAuthUser**](docs/AuthApi.md#getAuthUser) | **GET** /platform/1/auth/users/{AuthUserId} |
*AuthApi* | [**getAuthWellknown**](docs/AuthApi.md#getAuthWellknown) | **GET** /platform/1/auth/wellknowns/{AuthWellknownId} |
*AuthApi* | [**getAuthWellknowns**](docs/AuthApi.md#getAuthWellknowns) | **GET** /platform/1/auth/wellknowns |
*AuthApi* | [**getMappingDump**](docs/AuthApi.md#getMappingDump) | **GET** /platform/3/auth/mapping/dump |
*AuthApi* | [**getMappingIdentity**](docs/AuthApi.md#getMappingIdentity) | **GET** /platform/1/auth/mapping/identities/{MappingIdentityId} |
*AuthApi* | [**getMappingUsersLookup**](docs/AuthApi.md#getMappingUsersLookup) | **GET** /platform/1/auth/mapping/users/lookup |
*AuthApi* | [**getMappingUsersRules**](docs/AuthApi.md#getMappingUsersRules) | **GET** /platform/1/auth/mapping/users/rules |
*AuthApi* | [**getProvidersAdsById**](docs/AuthApi.md#getProvidersAdsById) | **GET** /platform/3/auth/providers/ads/{ProvidersAdsId} |
*AuthApi* | [**getProvidersFileById**](docs/AuthApi.md#getProvidersFileById) | **GET** /platform/1/auth/providers/file/{ProvidersFileId} |
*AuthApi* | [**getProvidersKrb5ById**](docs/AuthApi.md#getProvidersKrb5ById) | **GET** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} |
*AuthApi* | [**getProvidersLdapById**](docs/AuthApi.md#getProvidersLdapById) | **GET** /platform/4/auth/providers/ldap/{ProvidersLdapId} |
*AuthApi* | [**getProvidersLocal**](docs/AuthApi.md#getProvidersLocal) | **GET** /platform/1/auth/providers/local |
*AuthApi* | [**getProvidersLocalById**](docs/AuthApi.md#getProvidersLocalById) | **GET** /platform/1/auth/providers/local/{ProvidersLocalId} |
*AuthApi* | [**getProvidersNisById**](docs/AuthApi.md#getProvidersNisById) | **GET** /platform/3/auth/providers/nis/{ProvidersNisId} |
*AuthApi* | [**getProvidersSummary**](docs/AuthApi.md#getProvidersSummary) | **GET** /platform/3/auth/providers/summary |
*AuthApi* | [**getSettingsAcls**](docs/AuthApi.md#getSettingsAcls) | **GET** /platform/3/auth/settings/acls |
*AuthApi* | [**getSettingsGlobal**](docs/AuthApi.md#getSettingsGlobal) | **GET** /platform/1/auth/settings/global |
*AuthApi* | [**getSettingsKrb5Defaults**](docs/AuthApi.md#getSettingsKrb5Defaults) | **GET** /platform/1/auth/settings/krb5/defaults |
*AuthApi* | [**getSettingsKrb5Domain**](docs/AuthApi.md#getSettingsKrb5Domain) | **GET** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} |
*AuthApi* | [**getSettingsKrb5Realm**](docs/AuthApi.md#getSettingsKrb5Realm) | **GET** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} |
*AuthApi* | [**getSettingsMapping**](docs/AuthApi.md#getSettingsMapping) | **GET** /platform/1/auth/settings/mapping |
*AuthApi* | [**listAuthGroups**](docs/AuthApi.md#listAuthGroups) | **GET** /platform/1/auth/groups |
*AuthApi* | [**listAuthRoles**](docs/AuthApi.md#listAuthRoles) | **GET** /platform/1/auth/roles |
*AuthApi* | [**listAuthUsers**](docs/AuthApi.md#listAuthUsers) | **GET** /platform/1/auth/users |
*AuthApi* | [**listProvidersAds**](docs/AuthApi.md#listProvidersAds) | **GET** /platform/3/auth/providers/ads |
*AuthApi* | [**listProvidersFile**](docs/AuthApi.md#listProvidersFile) | **GET** /platform/1/auth/providers/file |
*AuthApi* | [**listProvidersKrb5**](docs/AuthApi.md#listProvidersKrb5) | **GET** /platform/3/auth/providers/krb5 |
*AuthApi* | [**listProvidersLdap**](docs/AuthApi.md#listProvidersLdap) | **GET** /platform/4/auth/providers/ldap |
*AuthApi* | [**listProvidersNis**](docs/AuthApi.md#listProvidersNis) | **GET** /platform/3/auth/providers/nis |
*AuthApi* | [**listSettingsKrb5Domains**](docs/AuthApi.md#listSettingsKrb5Domains) | **GET** /platform/1/auth/settings/krb5/domains |
*AuthApi* | [**listSettingsKrb5Realms**](docs/AuthApi.md#listSettingsKrb5Realms) | **GET** /platform/1/auth/settings/krb5/realms |
*AuthApi* | [**updateAuthGroup**](docs/AuthApi.md#updateAuthGroup) | **PUT** /platform/1/auth/groups/{AuthGroupId} |
*AuthApi* | [**updateAuthLogLevel**](docs/AuthApi.md#updateAuthLogLevel) | **PUT** /platform/3/auth/log-level |
*AuthApi* | [**updateAuthRole**](docs/AuthApi.md#updateAuthRole) | **PUT** /platform/1/auth/roles/{AuthRoleId} |
*AuthApi* | [**updateAuthUser**](docs/AuthApi.md#updateAuthUser) | **PUT** /platform/1/auth/users/{AuthUserId} |
*AuthApi* | [**updateMappingImport**](docs/AuthApi.md#updateMappingImport) | **PUT** /platform/3/auth/mapping/import |
*AuthApi* | [**updateMappingUsersRules**](docs/AuthApi.md#updateMappingUsersRules) | **PUT** /platform/1/auth/mapping/users/rules |
*AuthApi* | [**updateProvidersAdsById**](docs/AuthApi.md#updateProvidersAdsById) | **PUT** /platform/3/auth/providers/ads/{ProvidersAdsId} |
*AuthApi* | [**updateProvidersFileById**](docs/AuthApi.md#updateProvidersFileById) | **PUT** /platform/1/auth/providers/file/{ProvidersFileId} |
*AuthApi* | [**updateProvidersKrb5ById**](docs/AuthApi.md#updateProvidersKrb5ById) | **PUT** /platform/3/auth/providers/krb5/{ProvidersKrb5Id} |
*AuthApi* | [**updateProvidersLdapById**](docs/AuthApi.md#updateProvidersLdapById) | **PUT** /platform/4/auth/providers/ldap/{ProvidersLdapId} |
*AuthApi* | [**updateProvidersLocalById**](docs/AuthApi.md#updateProvidersLocalById) | **PUT** /platform/1/auth/providers/local/{ProvidersLocalId} |
*AuthApi* | [**updateProvidersNisById**](docs/AuthApi.md#updateProvidersNisById) | **PUT** /platform/3/auth/providers/nis/{ProvidersNisId} |
*AuthApi* | [**updateSettingsAcls**](docs/AuthApi.md#updateSettingsAcls) | **PUT** /platform/3/auth/settings/acls |
*AuthApi* | [**updateSettingsGlobal**](docs/AuthApi.md#updateSettingsGlobal) | **PUT** /platform/1/auth/settings/global |
*AuthApi* | [**updateSettingsKrb5Defaults**](docs/AuthApi.md#updateSettingsKrb5Defaults) | **PUT** /platform/1/auth/settings/krb5/defaults |
*AuthApi* | [**updateSettingsKrb5Domain**](docs/AuthApi.md#updateSettingsKrb5Domain) | **PUT** /platform/1/auth/settings/krb5/domains/{SettingsKrb5DomainId} |
*AuthApi* | [**updateSettingsKrb5Realm**](docs/AuthApi.md#updateSettingsKrb5Realm) | **PUT** /platform/1/auth/settings/krb5/realms/{SettingsKrb5RealmId} |
*AuthApi* | [**updateSettingsMapping**](docs/AuthApi.md#updateSettingsMapping) | **PUT** /platform/1/auth/settings/mapping |
*AuthGroupsApi* | [**createGroupMember**](docs/AuthGroupsApi.md#createGroupMember) | **POST** /platform/1/auth/groups/{Group}/members |
*AuthGroupsApi* | [**deleteGroupMember**](docs/AuthGroupsApi.md#deleteGroupMember) | **DELETE** /platform/1/auth/groups/{Group}/members/{GroupMemberId} |
*AuthGroupsApi* | [**listGroupMembers**](docs/AuthGroupsApi.md#listGroupMembers) | **GET** /platform/1/auth/groups/{Group}/members |
*AuthProvidersApi* | [**getAdsProviderControllers**](docs/AuthProvidersApi.md#getAdsProviderControllers) | **GET** /platform/3/auth/providers/ads/{Id}/controllers |
*AuthProvidersApi* | [**getAdsProviderDomain**](docs/AuthProvidersApi.md#getAdsProviderDomain) | **GET** /platform/3/auth/providers/ads/{Id}/domains/{AdsProviderDomainId} |
*AuthProvidersApi* | [**getAdsProviderDomains**](docs/AuthProvidersApi.md#getAdsProviderDomains) | **GET** /platform/3/auth/providers/ads/{Id}/domains |
*AuthProvidersApi* | [**getAdsProviderSearch**](docs/AuthProvidersApi.md#getAdsProviderSearch) | **GET** /platform/1/auth/providers/ads/{Id}/search |
*AuthRolesApi* | [**createRoleMember**](docs/AuthRolesApi.md#createRoleMember) | **POST** /platform/1/auth/roles/{Role}/members |
*AuthRolesApi* | [**createRolePrivilege**](docs/AuthRolesApi.md#createRolePrivilege) | **POST** /platform/1/auth/roles/{Role}/privileges |
*AuthRolesApi* | [**deleteRoleMember**](docs/AuthRolesApi.md#deleteRoleMember) | **DELETE** /platform/1/auth/roles/{Role}/members/{RoleMemberId} |
*AuthRolesApi* | [**deleteRolePrivilege**](docs/AuthRolesApi.md#deleteRolePrivilege) | **DELETE** /platform/1/auth/roles/{Role}/privileges/{RolePrivilegeId} |
*AuthRolesApi* | [**listRoleMembers**](docs/AuthRolesApi.md#listRoleMembers) | **GET** /platform/1/auth/roles/{Role}/members |
*AuthRolesApi* | [**listRolePrivileges**](docs/AuthRolesApi.md#listRolePrivileges) | **GET** /platform/1/auth/roles/{Role}/privileges |
*AuthUsersApi* | [**createUserMemberOfItem**](docs/AuthUsersApi.md#createUserMemberOfItem) | **POST** /platform/3/auth/users/{User}/member-of |
*AuthUsersApi* | [**deleteUserMemberOfMemberOf**](docs/AuthUsersApi.md#deleteUserMemberOfMemberOf) | **DELETE** /platform/3/auth/users/{User}/member-of/{UserMemberOfMemberOf} |
*AuthUsersApi* | [**listUserMemberOf**](docs/AuthUsersApi.md#listUserMemberOf) | **GET** /platform/3/auth/users/{User}/member-of |
*AuthUsersApi* | [**updateUserChangePassword**](docs/AuthUsersApi.md#updateUserChangePassword) | **PUT** /platform/3/auth/users/{User}/change-password |
*CertificateApi* | [**createCertificateServerItem**](docs/CertificateApi.md#createCertificateServerItem) | **POST** /platform/4/certificate/server |
*CertificateApi* | [**deleteCertificateServerById**](docs/CertificateApi.md#deleteCertificateServerById) | **DELETE** /platform/4/certificate/server/{CertificateServerId} |
*CertificateApi* | [**getCertificateServerById**](docs/CertificateApi.md#getCertificateServerById) | **GET** /platform/4/certificate/server/{CertificateServerId} |
*CertificateApi* | [**listCertificateServer**](docs/CertificateApi.md#listCertificateServer) | **GET** /platform/4/certificate/server |
*CertificateApi* | [**updateCertificateServerById**](docs/CertificateApi.md#updateCertificateServerById) | **PUT** /platform/4/certificate/server/{CertificateServerId} |
*CloudApi* | [**createCloudAccessItem**](docs/CloudApi.md#createCloudAccessItem) | **POST** /platform/3/cloud/access |
*CloudApi* | [**createCloudAccount**](docs/CloudApi.md#createCloudAccount) | **POST** /platform/4/cloud/accounts |
*CloudApi* | [**createCloudJob**](docs/CloudApi.md#createCloudJob) | **POST** /platform/3/cloud/jobs |
*CloudApi* | [**createCloudPool**](docs/CloudApi.md#createCloudPool) | **POST** /platform/3/cloud/pools |
*CloudApi* | [**createCloudProxy**](docs/CloudApi.md#createCloudProxy) | **POST** /platform/4/cloud/proxies |
*CloudApi* | [**createSettingsEncryptionKeyItem**](docs/CloudApi.md#createSettingsEncryptionKeyItem) | **POST** /platform/3/cloud/settings/encryption-key |
*CloudApi* | [**createSettingsReportingEulaItem**](docs/CloudApi.md#createSettingsReportingEulaItem) | **POST** /platform/3/cloud/settings/reporting-eula |
*CloudApi* | [**deleteCloudAccessGuid**](docs/CloudApi.md#deleteCloudAccessGuid) | **DELETE** /platform/3/cloud/access/{CloudAccessGuid} |
*CloudApi* | [**deleteCloudAccount**](docs/CloudApi.md#deleteCloudAccount) | **DELETE** /platform/4/cloud/accounts/{CloudAccountId} |
*CloudApi* | [**deleteCloudPool**](docs/CloudApi.md#deleteCloudPool) | **DELETE** /platform/3/cloud/pools/{CloudPoolId} |
*CloudApi* | [**deleteCloudProxy**](docs/CloudApi.md#deleteCloudProxy) | **DELETE** /platform/4/cloud/proxies/{CloudProxyId} |
*CloudApi* | [**deleteSettingsReportingEula**](docs/CloudApi.md#deleteSettingsReportingEula) | **DELETE** /platform/3/cloud/settings/reporting-eula |
*CloudApi* | [**getCloudAccessGuid**](docs/CloudApi.md#getCloudAccessGuid) | **GET** /platform/3/cloud/access/{CloudAccessGuid} |
*CloudApi* | [**getCloudAccount**](docs/CloudApi.md#getCloudAccount) | **GET** /platform/4/cloud/accounts/{CloudAccountId} |
*CloudApi* | [**getCloudJob**](docs/CloudApi.md#getCloudJob) | **GET** /platform/3/cloud/jobs/{CloudJobId} |
*CloudApi* | [**getCloudJobsFile**](docs/CloudApi.md#getCloudJobsFile) | **GET** /platform/3/cloud/jobs-files/{CloudJobsFileId} |
*CloudApi* | [**getCloudPool**](docs/CloudApi.md#getCloudPool) | **GET** /platform/3/cloud/pools/{CloudPoolId} |
*CloudApi* | [**getCloudProxy**](docs/CloudApi.md#getCloudProxy) | **GET** /platform/4/cloud/proxies/{CloudProxyId} |
*CloudApi* | [**getCloudSettings**](docs/CloudApi.md#getCloudSettings) | **GET** /platform/3/cloud/settings |
*CloudApi* | [**listCloudAccess**](docs/CloudApi.md#listCloudAccess) | **GET** /platform/3/cloud/access |
*CloudApi* | [**listCloudAccounts**](docs/CloudApi.md#listCloudAccounts) | **GET** /platform/4/cloud/accounts |
*CloudApi* | [**listCloudJobs**](docs/CloudApi.md#listCloudJobs) | **GET** /platform/3/cloud/jobs |
*CloudApi* | [**listCloudPools**](docs/CloudApi.md#listCloudPools) | **GET** /platform/3/cloud/pools |
*CloudApi* | [**listCloudProxies**](docs/CloudApi.md#listCloudProxies) | **GET** /platform/4/cloud/proxies |
*CloudApi* | [**listSettingsReportingEula**](docs/CloudApi.md#listSettingsReportingEula) | **GET** /platform/3/cloud/settings/reporting-eula |
*CloudApi* | [**updateCloudAccount**](docs/CloudApi.md#updateCloudAccount) | **PUT** /platform/4/cloud/accounts/{CloudAccountId} |
*CloudApi* | [**updateCloudJob**](docs/CloudApi.md#updateCloudJob) | **PUT** /platform/3/cloud/jobs/{CloudJobId} |
*CloudApi* | [**updateCloudPool**](docs/CloudApi.md#updateCloudPool) | **PUT** /platform/3/cloud/pools/{CloudPoolId} |
*CloudApi* | [**updateCloudProxy**](docs/CloudApi.md#updateCloudProxy) | **PUT** /platform/4/cloud/proxies/{CloudProxyId} |
*CloudApi* | [**updateCloudSettings**](docs/CloudApi.md#updateCloudSettings) | **PUT** /platform/3/cloud/settings |
*ClusterApi* | [**createClusterAddNodeItem**](docs/ClusterApi.md#createClusterAddNodeItem) | **POST** /platform/3/cluster/add-node |
*ClusterApi* | [**createDiagnosticsGatherStartItem**](docs/ClusterApi.md#createDiagnosticsGatherStartItem) | **POST** /platform/3/cluster/diagnostics/gather/start |
*ClusterApi* | [**createDiagnosticsGatherStopItem**](docs/ClusterApi.md#createDiagnosticsGatherStopItem) | **POST** /platform/3/cluster/diagnostics/gather/stop |
*ClusterApi* | [**createDiagnosticsNetloggerStartItem**](docs/ClusterApi.md#createDiagnosticsNetloggerStartItem) | **POST** /platform/3/cluster/diagnostics/netlogger/start |
*ClusterApi* | [**createDiagnosticsNetloggerStopItem**](docs/ClusterApi.md#createDiagnosticsNetloggerStopItem) | **POST** /platform/3/cluster/diagnostics/netlogger/stop |
*ClusterApi* | [**getClusterConfig**](docs/ClusterApi.md#getClusterConfig) | **GET** /platform/3/cluster/config |
*ClusterApi* | [**getClusterEmail**](docs/ClusterApi.md#getClusterEmail) | **GET** /platform/1/cluster/email |
*ClusterApi* | [**getClusterExternalIps**](docs/ClusterApi.md#getClusterExternalIps) | **GET** /platform/2/cluster/external-ips |
*ClusterApi* | [**getClusterIdentity**](docs/ClusterApi.md#getClusterIdentity) | **GET** /platform/5/cluster/identity |
*ClusterApi* | [**getClusterNode**](docs/ClusterApi.md#getClusterNode) | **GET** /platform/5/cluster/nodes/{ClusterNodeId} |
*ClusterApi* | [**getClusterNodes**](docs/ClusterApi.md#getClusterNodes) | **GET** /platform/5/cluster/nodes |
*ClusterApi* | [**getClusterNodesAvailable**](docs/ClusterApi.md#getClusterNodesAvailable) | **GET** /platform/3/cluster/nodes-available |
*ClusterApi* | [**getClusterOwner**](docs/ClusterApi.md#getClusterOwner) | **GET** /platform/1/cluster/owner |
*ClusterApi* | [**getClusterStatfs**](docs/ClusterApi.md#getClusterStatfs) | **GET** /platform/1/cluster/statfs |
*ClusterApi* | [**getClusterTime**](docs/ClusterApi.md#getClusterTime) | **GET** /platform/3/cluster/time |
*ClusterApi* | [**getClusterTimezone**](docs/ClusterApi.md#getClusterTimezone) | **GET** /platform/3/cluster/timezone |
*ClusterApi* | [**getClusterVersion**](docs/ClusterApi.md#getClusterVersion) | **GET** /platform/3/cluster/version |
*ClusterApi* | [**getDiagnosticsGather**](docs/ClusterApi.md#getDiagnosticsGather) | **GET** /platform/3/cluster/diagnostics/gather |
*ClusterApi* | [**getDiagnosticsGatherSettings**](docs/ClusterApi.md#getDiagnosticsGatherSettings) | **GET** /platform/3/cluster/diagnostics/gather/settings |
*ClusterApi* | [**getDiagnosticsGatherStatus**](docs/ClusterApi.md#getDiagnosticsGatherStatus) | **GET** /platform/3/cluster/diagnostics/gather/status |
*ClusterApi* | [**getDiagnosticsNetlogger**](docs/ClusterApi.md#getDiagnosticsNetlogger) | **GET** /platform/3/cluster/diagnostics/netlogger |
*ClusterApi* | [**getDiagnosticsNetloggerSettings**](docs/ClusterApi.md#getDiagnosticsNetloggerSettings) | **GET** /platform/3/cluster/diagnostics/netlogger/settings |
*ClusterApi* | [**getDiagnosticsNetloggerStatus**](docs/ClusterApi.md#getDiagnosticsNetloggerStatus) | **GET** /platform/3/cluster/diagnostics/netlogger/status |
*ClusterApi* | [**getTimezoneRegion**](docs/ClusterApi.md#getTimezoneRegion) | **GET** /platform/3/cluster/timezone/regions/{TimezoneRegionId} |
*ClusterApi* | [**getTimezoneSettings**](docs/ClusterApi.md#getTimezoneSettings) | **GET** /platform/3/cluster/timezone/settings |
*ClusterApi* | [**updateClusterEmail**](docs/ClusterApi.md#updateClusterEmail) | **PUT** /platform/1/cluster/email |
*ClusterApi* | [**updateClusterNode**](docs/ClusterApi.md#updateClusterNode) | **PUT** /platform/5/cluster/nodes/{ClusterNodeId} |
*ClusterApi* | [**updateClusterOwner**](docs/ClusterApi.md#updateClusterOwner) | **PUT** /platform/1/cluster/owner |
*ClusterApi* | [**updateClusterTime**](docs/ClusterApi.md#updateClusterTime) | **PUT** /platform/3/cluster/time |
*ClusterApi* | [**updateClusterTimezone**](docs/ClusterApi.md#updateClusterTimezone) | **PUT** /platform/3/cluster/timezone |
*ClusterApi* | [**updateDiagnosticsGatherSettings**](docs/ClusterApi.md#updateDiagnosticsGatherSettings) | **PUT** /platform/3/cluster/diagnostics/gather/settings |
*ClusterApi* | [**updateDiagnosticsNetloggerSettings**](docs/ClusterApi.md#updateDiagnosticsNetloggerSettings) | **PUT** /platform/3/cluster/diagnostics/netlogger/settings |
*ClusterApi* | [**updateTimezoneSettings**](docs/ClusterApi.md#updateTimezoneSettings) | **PUT** /platform/3/cluster/timezone/settings |
*ClusterNodesApi* | [**createDrivesDriveAddItem**](docs/ClusterNodesApi.md#createDrivesDriveAddItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/add |
*ClusterNodesApi* | [**createDrivesDriveFirmwareUpdateItem**](docs/ClusterNodesApi.md#createDrivesDriveFirmwareUpdateItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware/update |
*ClusterNodesApi* | [**createDrivesDriveFormatItem**](docs/ClusterNodesApi.md#createDrivesDriveFormatItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/format |
*ClusterNodesApi* | [**createDrivesDrivePurposeItem**](docs/ClusterNodesApi.md#createDrivesDrivePurposeItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/purpose |
*ClusterNodesApi* | [**createDrivesDriveSmartfailItem**](docs/ClusterNodesApi.md#createDrivesDriveSmartfailItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/smartfail |
*ClusterNodesApi* | [**createDrivesDriveStopfailItem**](docs/ClusterNodesApi.md#createDrivesDriveStopfailItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/stopfail |
*ClusterNodesApi* | [**createDrivesDriveSuspendItem**](docs/ClusterNodesApi.md#createDrivesDriveSuspendItem) | **POST** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/suspend |
*ClusterNodesApi* | [**createNodeRebootItem**](docs/ClusterNodesApi.md#createNodeRebootItem) | **POST** /platform/5/cluster/nodes/{Lnn}/reboot |
*ClusterNodesApi* | [**createNodeShutdownItem**](docs/ClusterNodesApi.md#createNodeShutdownItem) | **POST** /platform/5/cluster/nodes/{Lnn}/shutdown |
*ClusterNodesApi* | [**getDrivesDriveFirmware**](docs/ClusterNodesApi.md#getDrivesDriveFirmware) | **GET** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware |
*ClusterNodesApi* | [**getNodeDrive**](docs/ClusterNodesApi.md#getNodeDrive) | **GET** /platform/5/cluster/nodes/{Lnn}/drives/{NodeDriveId} |
*ClusterNodesApi* | [**getNodeDriveconfig**](docs/ClusterNodesApi.md#getNodeDriveconfig) | **GET** /platform/5/cluster/nodes/{Lnn}/driveconfig |
*ClusterNodesApi* | [**getNodeDrives**](docs/ClusterNodesApi.md#getNodeDrives) | **GET** /platform/5/cluster/nodes/{Lnn}/drives |
*ClusterNodesApi* | [**getNodeDrivesPurposelist**](docs/ClusterNodesApi.md#getNodeDrivesPurposelist) | **GET** /platform/3/cluster/nodes/{Lnn}/drives-purposelist |
*ClusterNodesApi* | [**getNodeHardware**](docs/ClusterNodesApi.md#getNodeHardware) | **GET** /platform/5/cluster/nodes/{Lnn}/hardware |
*ClusterNodesApi* | [**getNodeHardwareFast**](docs/ClusterNodesApi.md#getNodeHardwareFast) | **GET** /platform/3/cluster/nodes/{Lnn}/hardware-fast |
*ClusterNodesApi* | [**getNodePartitions**](docs/ClusterNodesApi.md#getNodePartitions) | **GET** /platform/3/cluster/nodes/{Lnn}/partitions |
*ClusterNodesApi* | [**getNodeSensors**](docs/ClusterNodesApi.md#getNodeSensors) | **GET** /platform/3/cluster/nodes/{Lnn}/sensors |
*ClusterNodesApi* | [**getNodeSled**](docs/ClusterNodesApi.md#getNodeSled) | **GET** /platform/5/cluster/nodes/{Lnn}/sleds/{NodeSledId} |
*ClusterNodesApi* | [**getNodeSleds**](docs/ClusterNodesApi.md#getNodeSleds) | **GET** /platform/5/cluster/nodes/{Lnn}/sleds |
*ClusterNodesApi* | [**getNodeState**](docs/ClusterNodesApi.md#getNodeState) | **GET** /platform/3/cluster/nodes/{Lnn}/state |
*ClusterNodesApi* | [**getNodeStateReadonly**](docs/ClusterNodesApi.md#getNodeStateReadonly) | **GET** /platform/3/cluster/nodes/{Lnn}/state/readonly |
*ClusterNodesApi* | [**getNodeStateServicelight**](docs/ClusterNodesApi.md#getNodeStateServicelight) | **GET** /platform/3/cluster/nodes/{Lnn}/state/servicelight |
*ClusterNodesApi* | [**getNodeStateSmartfail**](docs/ClusterNodesApi.md#getNodeStateSmartfail) | **GET** /platform/3/cluster/nodes/{Lnn}/state/smartfail |
*ClusterNodesApi* | [**getNodeStatus**](docs/ClusterNodesApi.md#getNodeStatus) | **GET** /platform/3/cluster/nodes/{Lnn}/status |
*ClusterNodesApi* | [**getNodeStatusBatterystatus**](docs/ClusterNodesApi.md#getNodeStatusBatterystatus) | **GET** /platform/3/cluster/nodes/{Lnn}/status/batterystatus |
*ClusterNodesApi* | [**listDrivesDriveFirmwareUpdate**](docs/ClusterNodesApi.md#listDrivesDriveFirmwareUpdate) | **GET** /platform/3/cluster/nodes/{Lnn}/drives/{Driveid}/firmware/update |
*ClusterNodesApi* | [**updateNodeDriveconfig**](docs/ClusterNodesApi.md#updateNodeDriveconfig) | **PUT** /platform/5/cluster/nodes/{Lnn}/driveconfig |
*ClusterNodesApi* | [**updateNodeStateReadonly**](docs/ClusterNodesApi.md#updateNodeStateReadonly) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/readonly |
*ClusterNodesApi* | [**updateNodeStateServicelight**](docs/ClusterNodesApi.md#updateNodeStateServicelight) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/servicelight |
*ClusterNodesApi* | [**updateNodeStateSmartfail**](docs/ClusterNodesApi.md#updateNodeStateSmartfail) | **PUT** /platform/3/cluster/nodes/{Lnn}/state/smartfail |
*DebugApi* | [**deleteDebugStats**](docs/DebugApi.md#deleteDebugStats) | **DELETE** /platform/1/debug/stats |
*DebugApi* | [**getDebugStats**](docs/DebugApi.md#getDebugStats) | **GET** /platform/1/debug/stats |
*DedupeApi* | [**getDedupeDedupeSummary**](docs/DedupeApi.md#getDedupeDedupeSummary) | **GET** /platform/1/dedupe/dedupe-summary |
*DedupeApi* | [**getDedupeReport**](docs/DedupeApi.md#getDedupeReport) | **GET** /platform/1/dedupe/reports/{DedupeReportId} |
*DedupeApi* | [**getDedupeReports**](docs/DedupeApi.md#getDedupeReports) | **GET** /platform/1/dedupe/reports |
*DedupeApi* | [**getDedupeSettings**](docs/DedupeApi.md#getDedupeSettings) | **GET** /platform/1/dedupe/settings |
*DedupeApi* | [**updateDedupeSettings**](docs/DedupeApi.md#updateDedupeSettings) | **PUT** /platform/1/dedupe/settings |
*EventApi* | [**createEventAlertCondition**](docs/EventApi.md#createEventAlertCondition) | **POST** /platform/4/event/alert-conditions |
*EventApi* | [**createEventChannel**](docs/EventApi.md#createEventChannel) | **POST** /platform/3/event/channels |
*EventApi* | [**createEventEvent**](docs/EventApi.md#createEventEvent) | **POST** /platform/3/event/events |
*EventApi* | [**deleteEventAlertCondition**](docs/EventApi.md#deleteEventAlertCondition) | **DELETE** /platform/4/event/alert-conditions/{EventAlertConditionId} |
*EventApi* | [**deleteEventAlertConditions**](docs/EventApi.md#deleteEventAlertConditions) | **DELETE** /platform/4/event/alert-conditions |
*EventApi* | [**deleteEventChannel**](docs/EventApi.md#deleteEventChannel) | **DELETE** /platform/3/event/channels/{EventChannelId} |
*EventApi* | [**getEventAlertCondition**](docs/EventApi.md#getEventAlertCondition) | **GET** /platform/4/event/alert-conditions/{EventAlertConditionId} |
*EventApi* | [**getEventCategories**](docs/EventApi.md#getEventCategories) | **GET** /platform/3/event/categories |
*EventApi* | [**getEventCategory**](docs/EventApi.md#getEventCategory) | **GET** /platform/3/event/categories/{EventCategoryId} |
*EventApi* | [**getEventChannel**](docs/EventApi.md#getEventChannel) | **GET** /platform/3/event/channels/{EventChannelId} |
*EventApi* | [**getEventEventgroupDefinition**](docs/EventApi.md#getEventEventgroupDefinition) | **GET** /platform/4/event/eventgroup-definitions/{EventEventgroupDefinitionId} |
*EventApi* | [**getEventEventgroupDefinitions**](docs/EventApi.md#getEventEventgroupDefinitions) | **GET** /platform/4/event/eventgroup-definitions |
*EventApi* | [**getEventEventgroupOccurrence**](docs/EventApi.md#getEventEventgroupOccurrence) | **GET** /platform/3/event/eventgroup-occurrences/{EventEventgroupOccurrenceId} |
*EventApi* | [**getEventEventgroupOccurrences**](docs/EventApi.md#getEventEventgroupOccurrences) | **GET** /platform/3/event/eventgroup-occurrences |
*EventApi* | [**getEventEventlist**](docs/EventApi.md#getEventEventlist) | **GET** /platform/3/event/eventlists/{EventEventlistId} |
*EventApi* | [**getEventEventlists**](docs/EventApi.md#getEventEventlists) | **GET** /platform/3/event/eventlists |
*EventApi* | [**getEventSettings**](docs/EventApi.md#getEventSettings) | **GET** /platform/3/event/settings |
*EventApi* | [**listEventAlertConditions**](docs/EventApi.md#listEventAlertConditions) | **GET** /platform/4/event/alert-conditions |
*EventApi* | [**listEventChannels**](docs/EventApi.md#listEventChannels) | **GET** /platform/3/event/channels |
*EventApi* | [**updateEventAlertCondition**](docs/EventApi.md#updateEventAlertCondition) | **PUT** /platform/4/event/alert-conditions/{EventAlertConditionId} |
*EventApi* | [**updateEventChannel**](docs/EventApi.md#updateEventChannel) | **PUT** /platform/3/event/channels/{EventChannelId} |
*EventApi* | [**updateEventEventgroupOccurrence**](docs/EventApi.md#updateEventEventgroupOccurrence) | **PUT** /platform/3/event/eventgroup-occurrences/{EventEventgroupOccurrenceId} |
*EventApi* | [**updateEventEventgroupOccurrences**](docs/EventApi.md#updateEventEventgroupOccurrences) | **PUT** /platform/3/event/eventgroup-occurrences |
*EventApi* | [**updateEventSettings**](docs/EventApi.md#updateEventSettings) | **PUT** /platform/3/event/settings |
*FileFilterApi* | [**getFileFilterSettings**](docs/FileFilterApi.md#getFileFilterSettings) | **GET** /platform/3/file-filter/settings |
*FileFilterApi* | [**updateFileFilterSettings**](docs/FileFilterApi.md#updateFileFilterSettings) | **PUT** /platform/3/file-filter/settings |
*FilepoolApi* | [**createFilepoolPolicy**](docs/FilepoolApi.md#createFilepoolPolicy) | **POST** /platform/4/filepool/policies |
*FilepoolApi* | [**deleteFilepoolPolicy**](docs/FilepoolApi.md#deleteFilepoolPolicy) | **DELETE** /platform/4/filepool/policies/{FilepoolPolicyId} |
*FilepoolApi* | [**getFilepoolDefaultPolicy**](docs/FilepoolApi.md#getFilepoolDefaultPolicy) | **GET** /platform/4/filepool/default-policy |
*FilepoolApi* | [**getFilepoolPolicy**](docs/FilepoolApi.md#getFilepoolPolicy) | **GET** /platform/4/filepool/policies/{FilepoolPolicyId} |
*FilepoolApi* | [**getFilepoolTemplate**](docs/FilepoolApi.md#getFilepoolTemplate) | **GET** /platform/4/filepool/templates/{FilepoolTemplateId} |
*FilepoolApi* | [**getFilepoolTemplates**](docs/FilepoolApi.md#getFilepoolTemplates) | **GET** /platform/4/filepool/templates |
*FilepoolApi* | [**listFilepoolPolicies**](docs/FilepoolApi.md#listFilepoolPolicies) | **GET** /platform/4/filepool/policies |
*FilepoolApi* | [**updateFilepoolDefaultPolicy**](docs/FilepoolApi.md#updateFilepoolDefaultPolicy) | **PUT** /platform/4/filepool/default-policy |
*FilepoolApi* | [**updateFilepoolPolicy**](docs/FilepoolApi.md#updateFilepoolPolicy) | **PUT** /platform/4/filepool/policies/{FilepoolPolicyId} |
*FilesystemApi* | [**getSettingsAccessTime**](docs/FilesystemApi.md#getSettingsAccessTime) | **GET** /platform/1/filesystem/settings/access-time |
*FilesystemApi* | [**getSettingsCharacterEncodings**](docs/FilesystemApi.md#getSettingsCharacterEncodings) | **GET** /platform/1/filesystem/settings/character-encodings |
*FilesystemApi* | [**updateSettingsAccessTime**](docs/FilesystemApi.md#updateSettingsAccessTime) | **PUT** /platform/1/filesystem/settings/access-time |
*FilesystemApi* | [**updateSettingsCharacterEncodings**](docs/FilesystemApi.md#updateSettingsCharacterEncodings) | **PUT** /platform/1/filesystem/settings/character-encodings |
*FsaApi* | [**deleteFsaResult**](docs/FsaApi.md#deleteFsaResult) | **DELETE** /platform/3/fsa/results/{FsaResultId} |
*FsaApi* | [**deleteFsaSettings**](docs/FsaApi.md#deleteFsaSettings) | **DELETE** /platform/1/fsa/settings |
*FsaApi* | [**getFsaResult**](docs/FsaApi.md#getFsaResult) | **GET** /platform/3/fsa/results/{FsaResultId} |
*FsaApi* | [**getFsaResults**](docs/FsaApi.md#getFsaResults) | **GET** /platform/3/fsa/results |
*FsaApi* | [**getFsaSettings**](docs/FsaApi.md#getFsaSettings) | **GET** /platform/1/fsa/settings |
*FsaApi* | [**updateFsaResult**](docs/FsaApi.md#updateFsaResult) | **PUT** /platform/3/fsa/results/{FsaResultId} |
*FsaApi* | [**updateFsaSettings**](docs/FsaApi.md#updateFsaSettings) | **PUT** /platform/1/fsa/settings |
*FsaResultsApi* | [**getHistogramStatBy**](docs/FsaResultsApi.md#getHistogramStatBy) | **GET** /platform/3/fsa/results/{Id}/histogram/{Stat}/by |
*FsaResultsApi* | [**getHistogramStatByBreakout**](docs/FsaResultsApi.md#getHistogramStatByBreakout) | **GET** /platform/3/fsa/results/{Id}/histogram/{Stat}/by/{HistogramStatByBreakout} |
*FsaResultsApi* | [**getResultDirectories**](docs/FsaResultsApi.md#getResultDirectories) | **GET** /platform/3/fsa/results/{Id}/directories |
*FsaResultsApi* | [**getResultDirectory**](docs/FsaResultsApi.md#getResultDirectory) | **GET** /platform/3/fsa/results/{Id}/directories/{ResultDirectoryId} |
*FsaResultsApi* | [**getResultHistogram**](docs/FsaResultsApi.md#getResultHistogram) | **GET** /platform/3/fsa/results/{Id}/histogram |
*FsaResultsApi* | [**getResultHistogramStat**](docs/FsaResultsApi.md#getResultHistogramStat) | **GET** /platform/3/fsa/results/{Id}/histogram/{ResultHistogramStat} |
*FsaResultsApi* | [**getResultTopDir**](docs/FsaResultsApi.md#getResultTopDir) | **GET** /platform/3/fsa/results/{Id}/top-dirs/{ResultTopDirId} |
*FsaResultsApi* | [**getResultTopDirs**](docs/FsaResultsApi.md#getResultTopDirs) | **GET** /platform/3/fsa/results/{Id}/top-dirs |
*FsaResultsApi* | [**getResultTopFile**](docs/FsaResultsApi.md#getResultTopFile) | **GET** /platform/3/fsa/results/{Id}/top-files/{ResultTopFileId} |
*FsaResultsApi* | [**getResultTopFiles**](docs/FsaResultsApi.md#getResultTopFiles) | **GET** /platform/3/fsa/results/{Id}/top-files |
*HardeningApi* | [**createHardeningApplyItem**](docs/HardeningApi.md#createHardeningApplyItem) | **POST** /platform/3/hardening/apply |
*HardeningApi* | [**createHardeningResolveItem**](docs/HardeningApi.md#createHardeningResolveItem) | **POST** /platform/3/hardening/resolve |
*HardeningApi* | [**createHardeningRevertItem**](docs/HardeningApi.md#createHardeningRevertItem) | **POST** /platform/3/hardening/revert |
*HardeningApi* | [**getHardeningState**](docs/HardeningApi.md#getHardeningState) | **GET** /platform/3/hardening/state |
*HardeningApi* | [**getHardeningStatus**](docs/HardeningApi.md#getHardeningStatus) | **GET** /platform/3/hardening/status |
*HardwareApi* | [**createHardwareTapeName**](docs/HardwareApi.md#createHardwareTapeName) | **POST** /platform/3/hardware/tape/{HardwareTapeName} |
*HardwareApi* | [**deleteHardwareTapeName**](docs/HardwareApi.md#deleteHardwareTapeName) | **DELETE** /platform/3/hardware/tape/{HardwareTapeName} |
*HardwareApi* | [**getHardwareFcport**](docs/HardwareApi.md#getHardwareFcport) | **GET** /platform/3/hardware/fcports/{HardwareFcportId} |
*HardwareApi* | [**getHardwareFcports**](docs/HardwareApi.md#getHardwareFcports) | **GET** /platform/3/hardware/fcports |
*HardwareApi* | [**getHardwareTapes**](docs/HardwareApi.md#getHardwareTapes) | **GET** /platform/3/hardware/tapes |
*HardwareApi* | [**updateHardwareFcport**](docs/HardwareApi.md#updateHardwareFcport) | **PUT** /platform/3/hardware/fcports/{HardwareFcportId} |
*HardwareApi* | [**updateHardwareTapeName**](docs/HardwareApi.md#updateHardwareTapeName) | **PUT** /platform/3/hardware/tape/{HardwareTapeName} |
*IdResolutionApi* | [**getIdResolutionPath**](docs/IdResolutionApi.md#getIdResolutionPath) | **GET** /platform/4/id-resolution/paths/{IdResolutionPathId} |
*IdResolutionApi* | [**getIdResolutionPaths**](docs/IdResolutionApi.md#getIdResolutionPaths) | **GET** /platform/4/id-resolution/paths |
*JobApi* | [**createJobJob**](docs/JobApi.md#createJobJob) | **POST** /platform/3/job/jobs |
*JobApi* | [**createJobPolicy**](docs/JobApi.md#createJobPolicy) | **POST** /platform/1/job/policies |
*JobApi* | [**deleteJobPolicy**](docs/JobApi.md#deleteJobPolicy) | **DELETE** /platform/1/job/policies/{JobPolicyId} |
*JobApi* | [**getJobEvents**](docs/JobApi.md#getJobEvents) | **GET** /platform/3/job/events |
*JobApi* | [**getJobJob**](docs/JobApi.md#getJobJob) | **GET** /platform/3/job/jobs/{JobJobId} |
*JobApi* | [**getJobJobSummary**](docs/JobApi.md#getJobJobSummary) | **GET** /platform/1/job/job-summary |
*JobApi* | [**getJobPolicy**](docs/JobApi.md#getJobPolicy) | **GET** /platform/1/job/policies/{JobPolicyId} |
*JobApi* | [**getJobRecent**](docs/JobApi.md#getJobRecent) | **GET** /platform/3/job/recent |
*JobApi* | [**getJobReports**](docs/JobApi.md#getJobReports) | **GET** /platform/3/job/reports |
*JobApi* | [**getJobStatistics**](docs/JobApi.md#getJobStatistics) | **GET** /platform/1/job/statistics |
*JobApi* | [**getJobType**](docs/JobApi.md#getJobType) | **GET** /platform/1/job/types/{JobTypeId} |
*JobApi* | [**getJobTypes**](docs/JobApi.md#getJobTypes) | **GET** /platform/1/job/types |
*JobApi* | [**listJobJobs**](docs/JobApi.md#listJobJobs) | **GET** /platform/3/job/jobs |
*JobApi* | [**listJobPolicies**](docs/JobApi.md#listJobPolicies) | **GET** /platform/1/job/policies |
*JobApi* | [**updateJobJob**](docs/JobApi.md#updateJobJob) | **PUT** /platform/3/job/jobs/{JobJobId} |
*JobApi* | [**updateJobPolicy**](docs/JobApi.md#updateJobPolicy) | **PUT** /platform/1/job/policies/{JobPolicyId} |
*JobApi* | [**updateJobType**](docs/JobApi.md#updateJobType) | **PUT** /platform/1/job/types/{JobTypeId} |
*LicenseApi* | [**createLicenseLicense**](docs/LicenseApi.md#createLicenseLicense) | **POST** /platform/5/license/licenses |
*LicenseApi* | [**getLicenseGenerate**](docs/LicenseApi.md#getLicenseGenerate) | **GET** /platform/5/license/generate |
*LicenseApi* | [**getLicenseLicense**](docs/LicenseApi.md#getLicenseLicense) | **GET** /platform/5/license/licenses/{LicenseLicenseId} |
*LicenseApi* | [**listLicenseLicenses**](docs/LicenseApi.md#listLicenseLicenses) | **GET** /platform/5/license/licenses |
*LocalApi* | [**getClusterTime**](docs/LocalApi.md#getClusterTime) | **GET** /platform/3/local/cluster/time |
*NetworkApi* | [**createDnscacheFlushItem**](docs/NetworkApi.md#createDnscacheFlushItem) | **POST** /platform/3/network/dnscache/flush |
*NetworkApi* | [**createNetworkGroupnet**](docs/NetworkApi.md#createNetworkGroupnet) | **POST** /platform/3/network/groupnets |
*NetworkApi* | [**createNetworkScRebalanceAllItem**](docs/NetworkApi.md#createNetworkScRebalanceAllItem) | **POST** /platform/3/network/sc-rebalance-all |
*NetworkApi* | [**deleteNetworkGroupnet**](docs/NetworkApi.md#deleteNetworkGroupnet) | **DELETE** /platform/3/network/groupnets/{NetworkGroupnetId} |
*NetworkApi* | [**getNetworkDnscache**](docs/NetworkApi.md#getNetworkDnscache) | **GET** /platform/3/network/dnscache |
*NetworkApi* | [**getNetworkExternal**](docs/NetworkApi.md#getNetworkExternal) | **GET** /platform/3/network/external |
*NetworkApi* | [**getNetworkGroupnet**](docs/NetworkApi.md#getNetworkGroupnet) | **GET** /platform/3/network/groupnets/{NetworkGroupnetId} |
*NetworkApi* | [**getNetworkInterfaces**](docs/NetworkApi.md#getNetworkInterfaces) | **GET** /platform/4/network/interfaces |
*NetworkApi* | [**getNetworkPools**](docs/NetworkApi.md#getNetworkPools) | **GET** /platform/3/network/pools |
*NetworkApi* | [**getNetworkRules**](docs/NetworkApi.md#getNetworkRules) | **GET** /platform/3/network/rules |
*NetworkApi* | [**getNetworkSubnets**](docs/NetworkApi.md#getNetworkSubnets) | **GET** /platform/4/network/subnets |
*NetworkApi* | [**listNetworkGroupnets**](docs/NetworkApi.md#listNetworkGroupnets) | **GET** /platform/3/network/groupnets |
*NetworkApi* | [**updateNetworkDnscache**](docs/NetworkApi.md#updateNetworkDnscache) | **PUT** /platform/3/network/dnscache |
*NetworkApi* | [**updateNetworkExternal**](docs/NetworkApi.md#updateNetworkExternal) | **PUT** /platform/3/network/external |
*NetworkApi* | [**updateNetworkGroupnet**](docs/NetworkApi.md#updateNetworkGroupnet) | **PUT** /platform/3/network/groupnets/{NetworkGroupnetId} |
*NetworkGroupnetsApi* | [**createGroupnetSubnet**](docs/NetworkGroupnetsApi.md#createGroupnetSubnet) | **POST** /platform/4/network/groupnets/{Groupnet}/subnets |
*NetworkGroupnetsApi* | [**createSubnetsSubnetPool**](docs/NetworkGroupnetsApi.md#createSubnetsSubnetPool) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools |
*NetworkGroupnetsApi* | [**deleteGroupnetSubnet**](docs/NetworkGroupnetsApi.md#deleteGroupnetSubnet) | **DELETE** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} |
*NetworkGroupnetsApi* | [**deleteSubnetsSubnetPool**](docs/NetworkGroupnetsApi.md#deleteSubnetsSubnetPool) | **DELETE** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} |
*NetworkGroupnetsApi* | [**getGroupnetSubnet**](docs/NetworkGroupnetsApi.md#getGroupnetSubnet) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} |
*NetworkGroupnetsApi* | [**getSubnetsSubnetPool**](docs/NetworkGroupnetsApi.md#getSubnetsSubnetPool) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} |
*NetworkGroupnetsApi* | [**listGroupnetSubnets**](docs/NetworkGroupnetsApi.md#listGroupnetSubnets) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets |
*NetworkGroupnetsApi* | [**listSubnetsSubnetPools**](docs/NetworkGroupnetsApi.md#listSubnetsSubnetPools) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools |
*NetworkGroupnetsApi* | [**updateGroupnetSubnet**](docs/NetworkGroupnetsApi.md#updateGroupnetSubnet) | **PUT** /platform/4/network/groupnets/{Groupnet}/subnets/{GroupnetSubnetId} |
*NetworkGroupnetsApi* | [**updateSubnetsSubnetPool**](docs/NetworkGroupnetsApi.md#updateSubnetsSubnetPool) | **PUT** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{SubnetsSubnetPoolId} |
*NetworkGroupnetsSubnetsApi* | [**createPoolsPoolRebalanceIp**](docs/NetworkGroupnetsSubnetsApi.md#createPoolsPoolRebalanceIp) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rebalance-ips |
*NetworkGroupnetsSubnetsApi* | [**createPoolsPoolRule**](docs/NetworkGroupnetsSubnetsApi.md#createPoolsPoolRule) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules |
*NetworkGroupnetsSubnetsApi* | [**createPoolsPoolScResumeNode**](docs/NetworkGroupnetsSubnetsApi.md#createPoolsPoolScResumeNode) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/sc-resume-nodes |
*NetworkGroupnetsSubnetsApi* | [**createPoolsPoolScSuspendNode**](docs/NetworkGroupnetsSubnetsApi.md#createPoolsPoolScSuspendNode) | **POST** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/sc-suspend-nodes |
*NetworkGroupnetsSubnetsApi* | [**deletePoolsPoolRule**](docs/NetworkGroupnetsSubnetsApi.md#deletePoolsPoolRule) | **DELETE** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} |
*NetworkGroupnetsSubnetsApi* | [**getPoolsPoolInterfaces**](docs/NetworkGroupnetsSubnetsApi.md#getPoolsPoolInterfaces) | **GET** /platform/4/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/interfaces |
*NetworkGroupnetsSubnetsApi* | [**getPoolsPoolRule**](docs/NetworkGroupnetsSubnetsApi.md#getPoolsPoolRule) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} |
*NetworkGroupnetsSubnetsApi* | [**listPoolsPoolRules**](docs/NetworkGroupnetsSubnetsApi.md#listPoolsPoolRules) | **GET** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules |
*NetworkGroupnetsSubnetsApi* | [**updatePoolsPoolRule**](docs/NetworkGroupnetsSubnetsApi.md#updatePoolsPoolRule) | **PUT** /platform/3/network/groupnets/{Groupnet}/subnets/{Subnet}/pools/{Pool}/rules/{PoolsPoolRuleId} |
*ProtocolsApi* | [**createHdfsProxyuser**](docs/ProtocolsApi.md#createHdfsProxyuser) | **POST** /platform/1/protocols/hdfs/proxyusers |
*ProtocolsApi* | [**createHdfsRack**](docs/ProtocolsApi.md#createHdfsRack) | **POST** /platform/1/protocols/hdfs/racks |
*ProtocolsApi* | [**createNdmpSettingsPreferredIp**](docs/ProtocolsApi.md#createNdmpSettingsPreferredIp) | **POST** /platform/4/protocols/ndmp/settings/preferred-ips |
*ProtocolsApi* | [**createNdmpSettingsVariable**](docs/ProtocolsApi.md#createNdmpSettingsVariable) | **POST** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} |
*ProtocolsApi* | [**createNdmpUser**](docs/ProtocolsApi.md#createNdmpUser) | **POST** /platform/3/protocols/ndmp/users |
*ProtocolsApi* | [**createNfsAlias**](docs/ProtocolsApi.md#createNfsAlias) | **POST** /platform/2/protocols/nfs/aliases |
*ProtocolsApi* | [**createNfsExport**](docs/ProtocolsApi.md#createNfsExport) | **POST** /platform/4/protocols/nfs/exports |
*ProtocolsApi* | [**createNfsNetgroupCheckItem**](docs/ProtocolsApi.md#createNfsNetgroupCheckItem) | **POST** /platform/3/protocols/nfs/netgroup/check |
*ProtocolsApi* | [**createNfsNetgroupFlushItem**](docs/ProtocolsApi.md#createNfsNetgroupFlushItem) | **POST** /platform/3/protocols/nfs/netgroup/flush |
*ProtocolsApi* | [**createNfsNlmSessionsCheckItem**](docs/ProtocolsApi.md#createNfsNlmSessionsCheckItem) | **POST** /platform/3/protocols/nfs/nlm/sessions-check |
*ProtocolsApi* | [**createNfsReloadItem**](docs/ProtocolsApi.md#createNfsReloadItem) | **POST** /platform/3/protocols/nfs/reload |
*ProtocolsApi* | [**createNtpServer**](docs/ProtocolsApi.md#createNtpServer) | **POST** /platform/3/protocols/ntp/servers |
*ProtocolsApi* | [**createSmbLogLevelFilter**](docs/ProtocolsApi.md#createSmbLogLevelFilter) | **POST** /platform/3/protocols/smb/log-level/filters |
*ProtocolsApi* | [**createSmbShare**](docs/ProtocolsApi.md#createSmbShare) | **POST** /platform/4/protocols/smb/shares |
*ProtocolsApi* | [**createSwiftAccount**](docs/ProtocolsApi.md#createSwiftAccount) | **POST** /platform/3/protocols/swift/accounts |
*ProtocolsApi* | [**deleteHdfsProxyuser**](docs/ProtocolsApi.md#deleteHdfsProxyuser) | **DELETE** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} |
*ProtocolsApi* | [**deleteHdfsRack**](docs/ProtocolsApi.md#deleteHdfsRack) | **DELETE** /platform/1/protocols/hdfs/racks/{HdfsRackId} |
*ProtocolsApi* | [**deleteNdmpContextsBackupById**](docs/ProtocolsApi.md#deleteNdmpContextsBackupById) | **DELETE** /platform/3/protocols/ndmp/contexts/backup/{NdmpContextsBackupId} |
*ProtocolsApi* | [**deleteNdmpContextsBreById**](docs/ProtocolsApi.md#deleteNdmpContextsBreById) | **DELETE** /platform/3/protocols/ndmp/contexts/bre/{NdmpContextsBreId} |
*ProtocolsApi* | [**deleteNdmpContextsRestoreById**](docs/ProtocolsApi.md#deleteNdmpContextsRestoreById) | **DELETE** /platform/3/protocols/ndmp/contexts/restore/{NdmpContextsRestoreId} |
*ProtocolsApi* | [**deleteNdmpDumpdate**](docs/ProtocolsApi.md#deleteNdmpDumpdate) | **DELETE** /platform/3/protocols/ndmp/dumpdates/{NdmpDumpdateId} |
*ProtocolsApi* | [**deleteNdmpSession**](docs/ProtocolsApi.md#deleteNdmpSession) | **DELETE** /platform/3/protocols/ndmp/sessions/{NdmpSessionId} |
*ProtocolsApi* | [**deleteNdmpSettingsPreferredIp**](docs/ProtocolsApi.md#deleteNdmpSettingsPreferredIp) | **DELETE** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} |
*ProtocolsApi* | [**deleteNdmpSettingsVariable**](docs/ProtocolsApi.md#deleteNdmpSettingsVariable) | **DELETE** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} |
*ProtocolsApi* | [**deleteNdmpUser**](docs/ProtocolsApi.md#deleteNdmpUser) | **DELETE** /platform/3/protocols/ndmp/users/{NdmpUserId} |
*ProtocolsApi* | [**deleteNfsAlias**](docs/ProtocolsApi.md#deleteNfsAlias) | **DELETE** /platform/2/protocols/nfs/aliases/{NfsAliasId} |
*ProtocolsApi* | [**deleteNfsExport**](docs/ProtocolsApi.md#deleteNfsExport) | **DELETE** /platform/4/protocols/nfs/exports/{NfsExportId} |
*ProtocolsApi* | [**deleteNfsNlmSession**](docs/ProtocolsApi.md#deleteNfsNlmSession) | **DELETE** /platform/3/protocols/nfs/nlm/sessions/{NfsNlmSessionId} |
*ProtocolsApi* | [**deleteNtpServer**](docs/ProtocolsApi.md#deleteNtpServer) | **DELETE** /platform/3/protocols/ntp/servers/{NtpServerId} |
*ProtocolsApi* | [**deleteNtpServers**](docs/ProtocolsApi.md#deleteNtpServers) | **DELETE** /platform/3/protocols/ntp/servers |
*ProtocolsApi* | [**deleteSmbLogLevelFilter**](docs/ProtocolsApi.md#deleteSmbLogLevelFilter) | **DELETE** /platform/3/protocols/smb/log-level/filters/{SmbLogLevelFilterId} |
*ProtocolsApi* | [**deleteSmbLogLevelFilters**](docs/ProtocolsApi.md#deleteSmbLogLevelFilters) | **DELETE** /platform/3/protocols/smb/log-level/filters |
*ProtocolsApi* | [**deleteSmbOpenfile**](docs/ProtocolsApi.md#deleteSmbOpenfile) | **DELETE** /platform/1/protocols/smb/openfiles/{SmbOpenfileId} |
*ProtocolsApi* | [**deleteSmbSession**](docs/ProtocolsApi.md#deleteSmbSession) | **DELETE** /platform/1/protocols/smb/sessions/{SmbSessionId} |
*ProtocolsApi* | [**deleteSmbSessionsComputerUser**](docs/ProtocolsApi.md#deleteSmbSessionsComputerUser) | **DELETE** /platform/1/protocols/smb/sessions/{Computer}/{SmbSessionsComputerUser} |
*ProtocolsApi* | [**deleteSmbShare**](docs/ProtocolsApi.md#deleteSmbShare) | **DELETE** /platform/4/protocols/smb/shares/{SmbShareId} |
*ProtocolsApi* | [**deleteSmbShares**](docs/ProtocolsApi.md#deleteSmbShares) | **DELETE** /platform/4/protocols/smb/shares |
*ProtocolsApi* | [**deleteSwiftAccount**](docs/ProtocolsApi.md#deleteSwiftAccount) | **DELETE** /platform/3/protocols/swift/accounts/{SwiftAccountId} |
*ProtocolsApi* | [**getFtpSettings**](docs/ProtocolsApi.md#getFtpSettings) | **GET** /platform/3/protocols/ftp/settings |
*ProtocolsApi* | [**getHdfsLogLevel**](docs/ProtocolsApi.md#getHdfsLogLevel) | **GET** /platform/3/protocols/hdfs/log-level |
*ProtocolsApi* | [**getHdfsProxyuser**](docs/ProtocolsApi.md#getHdfsProxyuser) | **GET** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} |
*ProtocolsApi* | [**getHdfsRack**](docs/ProtocolsApi.md#getHdfsRack) | **GET** /platform/1/protocols/hdfs/racks/{HdfsRackId} |
*ProtocolsApi* | [**getHdfsRangerPluginSettings**](docs/ProtocolsApi.md#getHdfsRangerPluginSettings) | **GET** /platform/4/protocols/hdfs/ranger-plugin/settings |
*ProtocolsApi* | [**getHdfsSettings**](docs/ProtocolsApi.md#getHdfsSettings) | **GET** /platform/4/protocols/hdfs/settings |
*ProtocolsApi* | [**getHttpSettings**](docs/ProtocolsApi.md#getHttpSettings) | **GET** /platform/3/protocols/http/settings |
*ProtocolsApi* | [**getNdmpContextsBackup**](docs/ProtocolsApi.md#getNdmpContextsBackup) | **GET** /platform/3/protocols/ndmp/contexts/backup |
*ProtocolsApi* | [**getNdmpContextsBackupById**](docs/ProtocolsApi.md#getNdmpContextsBackupById) | **GET** /platform/3/protocols/ndmp/contexts/backup/{NdmpContextsBackupId} |
*ProtocolsApi* | [**getNdmpContextsBre**](docs/ProtocolsApi.md#getNdmpContextsBre) | **GET** /platform/3/protocols/ndmp/contexts/bre |
*ProtocolsApi* | [**getNdmpContextsBreById**](docs/ProtocolsApi.md#getNdmpContextsBreById) | **GET** /platform/3/protocols/ndmp/contexts/bre/{NdmpContextsBreId} |
*ProtocolsApi* | [**getNdmpContextsRestore**](docs/ProtocolsApi.md#getNdmpContextsRestore) | **GET** /platform/3/protocols/ndmp/contexts/restore |
*ProtocolsApi* | [**getNdmpContextsRestoreById**](docs/ProtocolsApi.md#getNdmpContextsRestoreById) | **GET** /platform/3/protocols/ndmp/contexts/restore/{NdmpContextsRestoreId} |
*ProtocolsApi* | [**getNdmpDiagnostics**](docs/ProtocolsApi.md#getNdmpDiagnostics) | **GET** /platform/3/protocols/ndmp/diagnostics |
*ProtocolsApi* | [**getNdmpDumpdate**](docs/ProtocolsApi.md#getNdmpDumpdate) | **GET** /platform/3/protocols/ndmp/dumpdates/{NdmpDumpdateId} |
*ProtocolsApi* | [**getNdmpLogs**](docs/ProtocolsApi.md#getNdmpLogs) | **GET** /platform/3/protocols/ndmp/logs |
*ProtocolsApi* | [**getNdmpSession**](docs/ProtocolsApi.md#getNdmpSession) | **GET** /platform/3/protocols/ndmp/sessions/{NdmpSessionId} |
*ProtocolsApi* | [**getNdmpSessions**](docs/ProtocolsApi.md#getNdmpSessions) | **GET** /platform/3/protocols/ndmp/sessions |
*ProtocolsApi* | [**getNdmpSettingsDmas**](docs/ProtocolsApi.md#getNdmpSettingsDmas) | **GET** /platform/3/protocols/ndmp/settings/dmas |
*ProtocolsApi* | [**getNdmpSettingsGlobal**](docs/ProtocolsApi.md#getNdmpSettingsGlobal) | **GET** /platform/3/protocols/ndmp/settings/global |
*ProtocolsApi* | [**getNdmpSettingsPreferredIp**](docs/ProtocolsApi.md#getNdmpSettingsPreferredIp) | **GET** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} |
*ProtocolsApi* | [**getNdmpSettingsVariable**](docs/ProtocolsApi.md#getNdmpSettingsVariable) | **GET** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} |
*ProtocolsApi* | [**getNdmpUser**](docs/ProtocolsApi.md#getNdmpUser) | **GET** /platform/3/protocols/ndmp/users/{NdmpUserId} |
*ProtocolsApi* | [**getNfsAlias**](docs/ProtocolsApi.md#getNfsAlias) | **GET** /platform/2/protocols/nfs/aliases/{NfsAliasId} |
*ProtocolsApi* | [**getNfsCheck**](docs/ProtocolsApi.md#getNfsCheck) | **GET** /platform/2/protocols/nfs/check |
*ProtocolsApi* | [**getNfsExport**](docs/ProtocolsApi.md#getNfsExport) | **GET** /platform/4/protocols/nfs/exports/{NfsExportId} |
*ProtocolsApi* | [**getNfsExportsSummary**](docs/ProtocolsApi.md#getNfsExportsSummary) | **GET** /platform/2/protocols/nfs/exports-summary |
*ProtocolsApi* | [**getNfsLogLevel**](docs/ProtocolsApi.md#getNfsLogLevel) | **GET** /platform/3/protocols/nfs/log-level |
*ProtocolsApi* | [**getNfsNetgroup**](docs/ProtocolsApi.md#getNfsNetgroup) | **GET** /platform/3/protocols/nfs/netgroup |
*ProtocolsApi* | [**getNfsNlmLocks**](docs/ProtocolsApi.md#getNfsNlmLocks) | **GET** /platform/2/protocols/nfs/nlm/locks |
*ProtocolsApi* | [**getNfsNlmSession**](docs/ProtocolsApi.md#getNfsNlmSession) | **GET** /platform/3/protocols/nfs/nlm/sessions/{NfsNlmSessionId} |
*ProtocolsApi* | [**getNfsNlmSessions**](docs/ProtocolsApi.md#getNfsNlmSessions) | **GET** /platform/3/protocols/nfs/nlm/sessions |
*ProtocolsApi* | [**getNfsNlmWaiters**](docs/ProtocolsApi.md#getNfsNlmWaiters) | **GET** /platform/2/protocols/nfs/nlm/waiters |
*ProtocolsApi* | [**getNfsSettingsExport**](docs/ProtocolsApi.md#getNfsSettingsExport) | **GET** /platform/2/protocols/nfs/settings/export |
*ProtocolsApi* | [**getNfsSettingsGlobal**](docs/ProtocolsApi.md#getNfsSettingsGlobal) | **GET** /platform/3/protocols/nfs/settings/global |
*ProtocolsApi* | [**getNfsSettingsZone**](docs/ProtocolsApi.md#getNfsSettingsZone) | **GET** /platform/2/protocols/nfs/settings/zone |
*ProtocolsApi* | [**getNtpServer**](docs/ProtocolsApi.md#getNtpServer) | **GET** /platform/3/protocols/ntp/servers/{NtpServerId} |
*ProtocolsApi* | [**getNtpSettings**](docs/ProtocolsApi.md#getNtpSettings) | **GET** /platform/3/protocols/ntp/settings |
*ProtocolsApi* | [**getSmbLogLevel**](docs/ProtocolsApi.md#getSmbLogLevel) | **GET** /platform/3/protocols/smb/log-level |
*ProtocolsApi* | [**getSmbLogLevelFilter**](docs/ProtocolsApi.md#getSmbLogLevelFilter) | **GET** /platform/3/protocols/smb/log-level/filters/{SmbLogLevelFilterId} |
*ProtocolsApi* | [**getSmbOpenfiles**](docs/ProtocolsApi.md#getSmbOpenfiles) | **GET** /platform/1/protocols/smb/openfiles |
*ProtocolsApi* | [**getSmbSessions**](docs/ProtocolsApi.md#getSmbSessions) | **GET** /platform/1/protocols/smb/sessions |
*ProtocolsApi* | [**getSmbSettingsGlobal**](docs/ProtocolsApi.md#getSmbSettingsGlobal) | **GET** /platform/3/protocols/smb/settings/global |
*ProtocolsApi* | [**getSmbSettingsShare**](docs/ProtocolsApi.md#getSmbSettingsShare) | **GET** /platform/3/protocols/smb/settings/share |
*ProtocolsApi* | [**getSmbShare**](docs/ProtocolsApi.md#getSmbShare) | **GET** /platform/4/protocols/smb/shares/{SmbShareId} |
*ProtocolsApi* | [**getSmbSharesSummary**](docs/ProtocolsApi.md#getSmbSharesSummary) | **GET** /platform/1/protocols/smb/shares-summary |
*ProtocolsApi* | [**getSnmpSettings**](docs/ProtocolsApi.md#getSnmpSettings) | **GET** /platform/5/protocols/snmp/settings |
*ProtocolsApi* | [**getSwiftAccount**](docs/ProtocolsApi.md#getSwiftAccount) | **GET** /platform/3/protocols/swift/accounts/{SwiftAccountId} |
*ProtocolsApi* | [**listHdfsProxyusers**](docs/ProtocolsApi.md#listHdfsProxyusers) | **GET** /platform/1/protocols/hdfs/proxyusers |
*ProtocolsApi* | [**listHdfsRacks**](docs/ProtocolsApi.md#listHdfsRacks) | **GET** /platform/1/protocols/hdfs/racks |
*ProtocolsApi* | [**listNdmpSettingsPreferredIps**](docs/ProtocolsApi.md#listNdmpSettingsPreferredIps) | **GET** /platform/4/protocols/ndmp/settings/preferred-ips |
*ProtocolsApi* | [**listNdmpUsers**](docs/ProtocolsApi.md#listNdmpUsers) | **GET** /platform/3/protocols/ndmp/users |
*ProtocolsApi* | [**listNfsAliases**](docs/ProtocolsApi.md#listNfsAliases) | **GET** /platform/2/protocols/nfs/aliases |
*ProtocolsApi* | [**listNfsExports**](docs/ProtocolsApi.md#listNfsExports) | **GET** /platform/4/protocols/nfs/exports |
*ProtocolsApi* | [**listNtpServers**](docs/ProtocolsApi.md#listNtpServers) | **GET** /platform/3/protocols/ntp/servers |
*ProtocolsApi* | [**listSmbLogLevelFilters**](docs/ProtocolsApi.md#listSmbLogLevelFilters) | **GET** /platform/3/protocols/smb/log-level/filters |
*ProtocolsApi* | [**listSmbShares**](docs/ProtocolsApi.md#listSmbShares) | **GET** /platform/4/protocols/smb/shares |
*ProtocolsApi* | [**listSwiftAccounts**](docs/ProtocolsApi.md#listSwiftAccounts) | **GET** /platform/3/protocols/swift/accounts |
*ProtocolsApi* | [**updateFtpSettings**](docs/ProtocolsApi.md#updateFtpSettings) | **PUT** /platform/3/protocols/ftp/settings |
*ProtocolsApi* | [**updateHdfsLogLevel**](docs/ProtocolsApi.md#updateHdfsLogLevel) | **PUT** /platform/3/protocols/hdfs/log-level |
*ProtocolsApi* | [**updateHdfsProxyuser**](docs/ProtocolsApi.md#updateHdfsProxyuser) | **PUT** /platform/1/protocols/hdfs/proxyusers/{HdfsProxyuserId} |
*ProtocolsApi* | [**updateHdfsRack**](docs/ProtocolsApi.md#updateHdfsRack) | **PUT** /platform/1/protocols/hdfs/racks/{HdfsRackId} |
*ProtocolsApi* | [**updateHdfsRangerPluginSettings**](docs/ProtocolsApi.md#updateHdfsRangerPluginSettings) | **PUT** /platform/4/protocols/hdfs/ranger-plugin/settings |
*ProtocolsApi* | [**updateHdfsSettings**](docs/ProtocolsApi.md#updateHdfsSettings) | **PUT** /platform/4/protocols/hdfs/settings |
*ProtocolsApi* | [**updateHttpSettings**](docs/ProtocolsApi.md#updateHttpSettings) | **PUT** /platform/3/protocols/http/settings |
*ProtocolsApi* | [**updateNdmpDiagnostics**](docs/ProtocolsApi.md#updateNdmpDiagnostics) | **PUT** /platform/3/protocols/ndmp/diagnostics |
*ProtocolsApi* | [**updateNdmpSettingsGlobal**](docs/ProtocolsApi.md#updateNdmpSettingsGlobal) | **PUT** /platform/3/protocols/ndmp/settings/global |
*ProtocolsApi* | [**updateNdmpSettingsPreferredIp**](docs/ProtocolsApi.md#updateNdmpSettingsPreferredIp) | **PUT** /platform/4/protocols/ndmp/settings/preferred-ips/{NdmpSettingsPreferredIpId} |
*ProtocolsApi* | [**updateNdmpSettingsVariable**](docs/ProtocolsApi.md#updateNdmpSettingsVariable) | **PUT** /platform/3/protocols/ndmp/settings/variables/{NdmpSettingsVariableId} |
*ProtocolsApi* | [**updateNdmpUser**](docs/ProtocolsApi.md#updateNdmpUser) | **PUT** /platform/3/protocols/ndmp/users/{NdmpUserId} |
*ProtocolsApi* | [**updateNfsAlias**](docs/ProtocolsApi.md#updateNfsAlias) | **PUT** /platform/2/protocols/nfs/aliases/{NfsAliasId} |
*ProtocolsApi* | [**updateNfsExport**](docs/ProtocolsApi.md#updateNfsExport) | **PUT** /platform/4/protocols/nfs/exports/{NfsExportId} |
*ProtocolsApi* | [**updateNfsLogLevel**](docs/ProtocolsApi.md#updateNfsLogLevel) | **PUT** /platform/3/protocols/nfs/log-level |
*ProtocolsApi* | [**updateNfsNetgroup**](docs/ProtocolsApi.md#updateNfsNetgroup) | **PUT** /platform/3/protocols/nfs/netgroup |
*ProtocolsApi* | [**updateNfsSettingsExport**](docs/ProtocolsApi.md#updateNfsSettingsExport) | **PUT** /platform/2/protocols/nfs/settings/export |
*ProtocolsApi* | [**updateNfsSettingsGlobal**](docs/ProtocolsApi.md#updateNfsSettingsGlobal) | **PUT** /platform/3/protocols/nfs/settings/global |
*ProtocolsApi* | [**updateNfsSettingsZone**](docs/ProtocolsApi.md#updateNfsSettingsZone) | **PUT** /platform/2/protocols/nfs/settings/zone |
*ProtocolsApi* | [**updateNtpServer**](docs/ProtocolsApi.md#updateNtpServer) | **PUT** /platform/3/protocols/ntp/servers/{NtpServerId} |
*ProtocolsApi* | [**updateNtpSettings**](docs/ProtocolsApi.md#updateNtpSettings) | **PUT** /platform/3/protocols/ntp/settings |
*ProtocolsApi* | [**updateSmbLogLevel**](docs/ProtocolsApi.md#updateSmbLogLevel) | **PUT** /platform/3/protocols/smb/log-level |
*ProtocolsApi* | [**updateSmbSettingsGlobal**](docs/ProtocolsApi.md#updateSmbSettingsGlobal) | **PUT** /platform/3/protocols/smb/settings/global |
*ProtocolsApi* | [**updateSmbSettingsShare**](docs/ProtocolsApi.md#updateSmbSettingsShare) | **PUT** /platform/3/protocols/smb/settings/share |
*ProtocolsApi* | [**updateSmbShare**](docs/ProtocolsApi.md#updateSmbShare) | **PUT** /platform/4/protocols/smb/shares/{SmbShareId} |
*ProtocolsApi* | [**updateSnmpSettings**](docs/ProtocolsApi.md#updateSnmpSettings) | **PUT** /platform/5/protocols/snmp/settings |
*ProtocolsApi* | [**updateSwiftAccount**](docs/ProtocolsApi.md#updateSwiftAccount) | **PUT** /platform/3/protocols/swift/accounts/{SwiftAccountId} |
*ProtocolsHdfsApi* | [**createProxyusersNameMember**](docs/ProtocolsHdfsApi.md#createProxyusersNameMember) | **POST** /platform/1/protocols/hdfs/proxyusers/{Name}/members |
*ProtocolsHdfsApi* | [**deleteProxyusersNameMember**](docs/ProtocolsHdfsApi.md#deleteProxyusersNameMember) | **DELETE** /platform/1/protocols/hdfs/proxyusers/{Name}/members/{ProxyusersNameMemberId} |
*ProtocolsHdfsApi* | [**listProxyusersNameMembers**](docs/ProtocolsHdfsApi.md#listProxyusersNameMembers) | **GET** /platform/1/protocols/hdfs/proxyusers/{Name}/members |
*ProtocolsHdfsApi* | [**updateProxyusersNameMember**](docs/ProtocolsHdfsApi.md#updateProxyusersNameMember) | **PUT** /platform/1/protocols/hdfs/proxyusers/{Name}/members/{ProxyusersNameMemberId} |
*QuotaApi* | [**createQuotaQuota**](docs/QuotaApi.md#createQuotaQuota) | **POST** /platform/1/quota/quotas |
*QuotaApi* | [**createQuotaReport**](docs/QuotaApi.md#createQuotaReport) | **POST** /platform/1/quota/reports |
*QuotaApi* | [**createSettingsMapping**](docs/QuotaApi.md#createSettingsMapping) | **POST** /platform/1/quota/settings/mappings |
*QuotaApi* | [**createSettingsNotification**](docs/QuotaApi.md#createSettingsNotification) | **POST** /platform/1/quota/settings/notifications |
*QuotaApi* | [**deleteQuotaQuota**](docs/QuotaApi.md#deleteQuotaQuota) | **DELETE** /platform/1/quota/quotas/{QuotaQuotaId} |
*QuotaApi* | [**deleteQuotaQuotas**](docs/QuotaApi.md#deleteQuotaQuotas) | **DELETE** /platform/1/quota/quotas |
*QuotaApi* | [**deleteQuotaReport**](docs/QuotaApi.md#deleteQuotaReport) | **DELETE** /platform/1/quota/reports/{QuotaReportId} |
*QuotaApi* | [**deleteSettingsMapping**](docs/QuotaApi.md#deleteSettingsMapping) | **DELETE** /platform/1/quota/settings/mappings/{SettingsMappingId} |
*QuotaApi* | [**deleteSettingsMappings**](docs/QuotaApi.md#deleteSettingsMappings) | **DELETE** /platform/1/quota/settings/mappings |
*QuotaApi* | [**deleteSettingsNotification**](docs/QuotaApi.md#deleteSettingsNotification) | **DELETE** /platform/1/quota/settings/notifications/{SettingsNotificationId} |
*QuotaApi* | [**deleteSettingsNotifications**](docs/QuotaApi.md#deleteSettingsNotifications) | **DELETE** /platform/1/quota/settings/notifications |
*QuotaApi* | [**getQuotaLicense**](docs/QuotaApi.md#getQuotaLicense) | **GET** /platform/5/quota/license |
*QuotaApi* | [**getQuotaQuota**](docs/QuotaApi.md#getQuotaQuota) | **GET** /platform/1/quota/quotas/{QuotaQuotaId} |
*QuotaApi* | [**getQuotaQuotasSummary**](docs/QuotaApi.md#getQuotaQuotasSummary) | **GET** /platform/1/quota/quotas-summary |
*QuotaApi* | [**getQuotaReport**](docs/QuotaApi.md#getQuotaReport) | **GET** /platform/1/quota/reports/{QuotaReportId} |
*QuotaApi* | [**getSettingsMapping**](docs/QuotaApi.md#getSettingsMapping) | **GET** /platform/1/quota/settings/mappings/{SettingsMappingId} |
*QuotaApi* | [**getSettingsNotification**](docs/QuotaApi.md#getSettingsNotification) | **GET** /platform/1/quota/settings/notifications/{SettingsNotificationId} |
*QuotaApi* | [**getSettingsReports**](docs/QuotaApi.md#getSettingsReports) | **GET** /platform/1/quota/settings/reports |
*QuotaApi* | [**listQuotaQuotas**](docs/QuotaApi.md#listQuotaQuotas) | **GET** /platform/1/quota/quotas |
*QuotaApi* | [**listQuotaReports**](docs/QuotaApi.md#listQuotaReports) | **GET** /platform/1/quota/reports |
*QuotaApi* | [**listSettingsMappings**](docs/QuotaApi.md#listSettingsMappings) | **GET** /platform/1/quota/settings/mappings |
*QuotaApi* | [**listSettingsNotifications**](docs/QuotaApi.md#listSettingsNotifications) | **GET** /platform/1/quota/settings/notifications |
*QuotaApi* | [**updateQuotaQuota**](docs/QuotaApi.md#updateQuotaQuota) | **PUT** /platform/1/quota/quotas/{QuotaQuotaId} |
*QuotaApi* | [**updateSettingsMapping**](docs/QuotaApi.md#updateSettingsMapping) | **PUT** /platform/1/quota/settings/mappings/{SettingsMappingId} |
*QuotaApi* | [**updateSettingsNotification**](docs/QuotaApi.md#updateSettingsNotification) | **PUT** /platform/1/quota/settings/notifications/{SettingsNotificationId} |
*QuotaApi* | [**updateSettingsReports**](docs/QuotaApi.md#updateSettingsReports) | **PUT** /platform/1/quota/settings/reports |
*QuotaQuotasApi* | [**createQuotaNotification**](docs/QuotaQuotasApi.md#createQuotaNotification) | **POST** /platform/1/quota/quotas/{Qid}/notifications |
*QuotaQuotasApi* | [**deleteQuotaNotification**](docs/QuotaQuotasApi.md#deleteQuotaNotification) | **DELETE** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} |
*QuotaQuotasApi* | [**deleteQuotaNotifications**](docs/QuotaQuotasApi.md#deleteQuotaNotifications) | **DELETE** /platform/1/quota/quotas/{Qid}/notifications |
*QuotaQuotasApi* | [**getQuotaNotification**](docs/QuotaQuotasApi.md#getQuotaNotification) | **GET** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} |
*QuotaQuotasApi* | [**listQuotaNotifications**](docs/QuotaQuotasApi.md#listQuotaNotifications) | **GET** /platform/1/quota/quotas/{Qid}/notifications |
*QuotaQuotasApi* | [**updateQuotaNotification**](docs/QuotaQuotasApi.md#updateQuotaNotification) | **PUT** /platform/1/quota/quotas/{Qid}/notifications/{QuotaNotificationId} |
*QuotaQuotasApi* | [**updateQuotaNotifications**](docs/QuotaQuotasApi.md#updateQuotaNotifications) | **PUT** /platform/1/quota/quotas/{Qid}/notifications |
*QuotaReportsApi* | [**getReportAbout**](docs/QuotaReportsApi.md#getReportAbout) | **GET** /platform/1/quota/reports/{Rid}/about |
*RemotesupportApi* | [**getRemotesupportConnectemc**](docs/RemotesupportApi.md#getRemotesupportConnectemc) | **GET** /platform/1/remotesupport/connectemc |
*RemotesupportApi* | [**updateRemotesupportConnectemc**](docs/RemotesupportApi.md#updateRemotesupportConnectemc) | **PUT** /platform/1/remotesupport/connectemc |
*SnapshotApi* | [**createSnapshotAlias**](docs/SnapshotApi.md#createSnapshotAlias) | **POST** /platform/1/snapshot/aliases |
*SnapshotApi* | [**createSnapshotChangelist**](docs/SnapshotApi.md#createSnapshotChangelist) | **POST** /platform/1/snapshot/changelists |
*SnapshotApi* | [**createSnapshotRepstate**](docs/SnapshotApi.md#createSnapshotRepstate) | **POST** /platform/1/snapshot/repstates |
*SnapshotApi* | [**createSnapshotSchedule**](docs/SnapshotApi.md#createSnapshotSchedule) | **POST** /platform/3/snapshot/schedules |
*SnapshotApi* | [**createSnapshotSnapshot**](docs/SnapshotApi.md#createSnapshotSnapshot) | **POST** /platform/1/snapshot/snapshots |
*SnapshotApi* | [**deleteSnapshotAlias**](docs/SnapshotApi.md#deleteSnapshotAlias) | **DELETE** /platform/1/snapshot/aliases/{SnapshotAliasId} |
*SnapshotApi* | [**deleteSnapshotAliases**](docs/SnapshotApi.md#deleteSnapshotAliases) | **DELETE** /platform/1/snapshot/aliases |
*SnapshotApi* | [**deleteSnapshotChangelist**](docs/SnapshotApi.md#deleteSnapshotChangelist) | **DELETE** /platform/1/snapshot/changelists/{SnapshotChangelistId} |
*SnapshotApi* | [**deleteSnapshotRepstate**](docs/SnapshotApi.md#deleteSnapshotRepstate) | **DELETE** /platform/1/snapshot/repstates/{SnapshotRepstateId} |
*SnapshotApi* | [**deleteSnapshotSchedule**](docs/SnapshotApi.md#deleteSnapshotSchedule) | **DELETE** /platform/3/snapshot/schedules/{SnapshotScheduleId} |
*SnapshotApi* | [**deleteSnapshotSchedules**](docs/SnapshotApi.md#deleteSnapshotSchedules) | **DELETE** /platform/3/snapshot/schedules |
*SnapshotApi* | [**deleteSnapshotSnapshot**](docs/SnapshotApi.md#deleteSnapshotSnapshot) | **DELETE** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} |
*SnapshotApi* | [**deleteSnapshotSnapshots**](docs/SnapshotApi.md#deleteSnapshotSnapshots) | **DELETE** /platform/1/snapshot/snapshots |
*SnapshotApi* | [**getSnapshotAlias**](docs/SnapshotApi.md#getSnapshotAlias) | **GET** /platform/1/snapshot/aliases/{SnapshotAliasId} |
*SnapshotApi* | [**getSnapshotChangelist**](docs/SnapshotApi.md#getSnapshotChangelist) | **GET** /platform/1/snapshot/changelists/{SnapshotChangelistId} |
*SnapshotApi* | [**getSnapshotLicense**](docs/SnapshotApi.md#getSnapshotLicense) | **GET** /platform/5/snapshot/license |
*SnapshotApi* | [**getSnapshotPending**](docs/SnapshotApi.md#getSnapshotPending) | **GET** /platform/1/snapshot/pending |
*SnapshotApi* | [**getSnapshotRepstate**](docs/SnapshotApi.md#getSnapshotRepstate) | **GET** /platform/1/snapshot/repstates/{SnapshotRepstateId} |
*SnapshotApi* | [**getSnapshotSchedule**](docs/SnapshotApi.md#getSnapshotSchedule) | **GET** /platform/3/snapshot/schedules/{SnapshotScheduleId} |
*SnapshotApi* | [**getSnapshotSettings**](docs/SnapshotApi.md#getSnapshotSettings) | **GET** /platform/1/snapshot/settings |
*SnapshotApi* | [**getSnapshotSnapshot**](docs/SnapshotApi.md#getSnapshotSnapshot) | **GET** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} |
*SnapshotApi* | [**getSnapshotSnapshotsSummary**](docs/SnapshotApi.md#getSnapshotSnapshotsSummary) | **GET** /platform/1/snapshot/snapshots-summary |
*SnapshotApi* | [**listSnapshotAliases**](docs/SnapshotApi.md#listSnapshotAliases) | **GET** /platform/1/snapshot/aliases |
*SnapshotApi* | [**listSnapshotChangelists**](docs/SnapshotApi.md#listSnapshotChangelists) | **GET** /platform/1/snapshot/changelists |
*SnapshotApi* | [**listSnapshotRepstates**](docs/SnapshotApi.md#listSnapshotRepstates) | **GET** /platform/1/snapshot/repstates |
*SnapshotApi* | [**listSnapshotSchedules**](docs/SnapshotApi.md#listSnapshotSchedules) | **GET** /platform/3/snapshot/schedules |
*SnapshotApi* | [**listSnapshotSnapshots**](docs/SnapshotApi.md#listSnapshotSnapshots) | **GET** /platform/1/snapshot/snapshots |
*SnapshotApi* | [**updateSnapshotAlias**](docs/SnapshotApi.md#updateSnapshotAlias) | **PUT** /platform/1/snapshot/aliases/{SnapshotAliasId} |
*SnapshotApi* | [**updateSnapshotSchedule**](docs/SnapshotApi.md#updateSnapshotSchedule) | **PUT** /platform/3/snapshot/schedules/{SnapshotScheduleId} |
*SnapshotApi* | [**updateSnapshotSettings**](docs/SnapshotApi.md#updateSnapshotSettings) | **PUT** /platform/1/snapshot/settings |
*SnapshotApi* | [**updateSnapshotSnapshot**](docs/SnapshotApi.md#updateSnapshotSnapshot) | **PUT** /platform/1/snapshot/snapshots/{SnapshotSnapshotId} |
*SnapshotChangelistsApi* | [**getChangelistLin**](docs/SnapshotChangelistsApi.md#getChangelistLin) | **GET** /platform/1/snapshot/changelists/{Changelist}/lins/{ChangelistLinId} |
*SnapshotChangelistsApi* | [**getChangelistLins**](docs/SnapshotChangelistsApi.md#getChangelistLins) | **GET** /platform/1/snapshot/changelists/{Changelist}/lins |
*SnapshotSnapshotsApi* | [**createSnapshotLock**](docs/SnapshotSnapshotsApi.md#createSnapshotLock) | **POST** /platform/1/snapshot/snapshots/{Sid}/locks |
*SnapshotSnapshotsApi* | [**deleteSnapshotLock**](docs/SnapshotSnapshotsApi.md#deleteSnapshotLock) | **DELETE** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} |
*SnapshotSnapshotsApi* | [**deleteSnapshotLocks**](docs/SnapshotSnapshotsApi.md#deleteSnapshotLocks) | **DELETE** /platform/1/snapshot/snapshots/{Sid}/locks |
*SnapshotSnapshotsApi* | [**getSnapshotLock**](docs/SnapshotSnapshotsApi.md#getSnapshotLock) | **GET** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} |
*SnapshotSnapshotsApi* | [**listSnapshotLocks**](docs/SnapshotSnapshotsApi.md#listSnapshotLocks) | **GET** /platform/1/snapshot/snapshots/{Sid}/locks |
*SnapshotSnapshotsApi* | [**updateSnapshotLock**](docs/SnapshotSnapshotsApi.md#updateSnapshotLock) | **PUT** /platform/1/snapshot/snapshots/{Sid}/locks/{SnapshotLockId} |
*StatisticsApi* | [**getStatisticsCurrent**](docs/StatisticsApi.md#getStatisticsCurrent) | **GET** /platform/1/statistics/current |
*StatisticsApi* | [**getStatisticsHistory**](docs/StatisticsApi.md#getStatisticsHistory) | **GET** /platform/1/statistics/history |
*StatisticsApi* | [**getStatisticsKey**](docs/StatisticsApi.md#getStatisticsKey) | **GET** /platform/1/statistics/keys/{StatisticsKeyId} |
*StatisticsApi* | [**getStatisticsKeys**](docs/StatisticsApi.md#getStatisticsKeys) | **GET** /platform/1/statistics/keys |
*StatisticsApi* | [**getStatisticsOperations**](docs/StatisticsApi.md#getStatisticsOperations) | **GET** /platform/3/statistics/operations |
*StatisticsApi* | [**getStatisticsProtocols**](docs/StatisticsApi.md#getStatisticsProtocols) | **GET** /platform/1/statistics/protocols |
*StatisticsApi* | [**getSummaryClient**](docs/StatisticsApi.md#getSummaryClient) | **GET** /platform/3/statistics/summary/client |
*StatisticsApi* | [**getSummaryDrive**](docs/StatisticsApi.md#getSummaryDrive) | **GET** /platform/3/statistics/summary/drive |
*StatisticsApi* | [**getSummaryHeat**](docs/StatisticsApi.md#getSummaryHeat) | **GET** /platform/3/statistics/summary/heat |
*StatisticsApi* | [**getSummaryProtocol**](docs/StatisticsApi.md#getSummaryProtocol) | **GET** /platform/3/statistics/summary/protocol |
*StatisticsApi* | [**getSummaryProtocolStats**](docs/StatisticsApi.md#getSummaryProtocolStats) | **GET** /platform/3/statistics/summary/protocol-stats |
*StatisticsApi* | [**getSummarySystem**](docs/StatisticsApi.md#getSummarySystem) | **GET** /platform/3/statistics/summary/system |
*StatisticsApi* | [**getSummaryWorkload**](docs/StatisticsApi.md#getSummaryWorkload) | **GET** /platform/4/statistics/summary/workload |
*StoragepoolApi* | [**createCompatibilitiesClassActiveItem**](docs/StoragepoolApi.md#createCompatibilitiesClassActiveItem) | **POST** /platform/1/storagepool/compatibilities/class/active |
*StoragepoolApi* | [**createCompatibilitiesSsdActiveItem**](docs/StoragepoolApi.md#createCompatibilitiesSsdActiveItem) | **POST** /platform/3/storagepool/compatibilities/ssd/active |
*StoragepoolApi* | [**createStoragepoolNodepool**](docs/StoragepoolApi.md#createStoragepoolNodepool) | **POST** /platform/3/storagepool/nodepools |
*StoragepoolApi* | [**createStoragepoolTier**](docs/StoragepoolApi.md#createStoragepoolTier) | **POST** /platform/1/storagepool/tiers |
*StoragepoolApi* | [**deleteCompatibilitiesClassActiveById**](docs/StoragepoolApi.md#deleteCompatibilitiesClassActiveById) | **DELETE** /platform/1/storagepool/compatibilities/class/active/{CompatibilitiesClassActiveId} |
*StoragepoolApi* | [**deleteCompatibilitiesSsdActiveById**](docs/StoragepoolApi.md#deleteCompatibilitiesSsdActiveById) | **DELETE** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} |
*StoragepoolApi* | [**deleteStoragepoolNodepool**](docs/StoragepoolApi.md#deleteStoragepoolNodepool) | **DELETE** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} |
*StoragepoolApi* | [**deleteStoragepoolNodepools**](docs/StoragepoolApi.md#deleteStoragepoolNodepools) | **DELETE** /platform/3/storagepool/nodepools |
*StoragepoolApi* | [**deleteStoragepoolTier**](docs/StoragepoolApi.md#deleteStoragepoolTier) | **DELETE** /platform/1/storagepool/tiers/{StoragepoolTierId} |
*StoragepoolApi* | [**deleteStoragepoolTiers**](docs/StoragepoolApi.md#deleteStoragepoolTiers) | **DELETE** /platform/1/storagepool/tiers |
*StoragepoolApi* | [**getCompatibilitiesClassActiveById**](docs/StoragepoolApi.md#getCompatibilitiesClassActiveById) | **GET** /platform/1/storagepool/compatibilities/class/active/{CompatibilitiesClassActiveId} |
*StoragepoolApi* | [**getCompatibilitiesClassAvailable**](docs/StoragepoolApi.md#getCompatibilitiesClassAvailable) | **GET** /platform/1/storagepool/compatibilities/class/available |
*StoragepoolApi* | [**getCompatibilitiesSsdActiveById**](docs/StoragepoolApi.md#getCompatibilitiesSsdActiveById) | **GET** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} |
*StoragepoolApi* | [**getCompatibilitiesSsdAvailable**](docs/StoragepoolApi.md#getCompatibilitiesSsdAvailable) | **GET** /platform/1/storagepool/compatibilities/ssd/available |
*StoragepoolApi* | [**getStoragepoolNodepool**](docs/StoragepoolApi.md#getStoragepoolNodepool) | **GET** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} |
*StoragepoolApi* | [**getStoragepoolSettings**](docs/StoragepoolApi.md#getStoragepoolSettings) | **GET** /platform/5/storagepool/settings |
*StoragepoolApi* | [**getStoragepoolStatus**](docs/StoragepoolApi.md#getStoragepoolStatus) | **GET** /platform/1/storagepool/status |
*StoragepoolApi* | [**getStoragepoolStoragepools**](docs/StoragepoolApi.md#getStoragepoolStoragepools) | **GET** /platform/3/storagepool/storagepools |
*StoragepoolApi* | [**getStoragepoolSuggestedProtectionNid**](docs/StoragepoolApi.md#getStoragepoolSuggestedProtectionNid) | **GET** /platform/3/storagepool/suggested-protection/{StoragepoolSuggestedProtectionNid} |
*StoragepoolApi* | [**getStoragepoolTier**](docs/StoragepoolApi.md#getStoragepoolTier) | **GET** /platform/1/storagepool/tiers/{StoragepoolTierId} |
*StoragepoolApi* | [**getStoragepoolUnprovisioned**](docs/StoragepoolApi.md#getStoragepoolUnprovisioned) | **GET** /platform/1/storagepool/unprovisioned |
*StoragepoolApi* | [**listCompatibilitiesClassActive**](docs/StoragepoolApi.md#listCompatibilitiesClassActive) | **GET** /platform/1/storagepool/compatibilities/class/active |
*StoragepoolApi* | [**listCompatibilitiesSsdActive**](docs/StoragepoolApi.md#listCompatibilitiesSsdActive) | **GET** /platform/3/storagepool/compatibilities/ssd/active |
*StoragepoolApi* | [**listStoragepoolNodepools**](docs/StoragepoolApi.md#listStoragepoolNodepools) | **GET** /platform/3/storagepool/nodepools |
*StoragepoolApi* | [**listStoragepoolTiers**](docs/StoragepoolApi.md#listStoragepoolTiers) | **GET** /platform/1/storagepool/tiers |
*StoragepoolApi* | [**updateCompatibilitiesSsdActiveById**](docs/StoragepoolApi.md#updateCompatibilitiesSsdActiveById) | **PUT** /platform/3/storagepool/compatibilities/ssd/active/{CompatibilitiesSsdActiveId} |
*StoragepoolApi* | [**updateStoragepoolNodepool**](docs/StoragepoolApi.md#updateStoragepoolNodepool) | **PUT** /platform/3/storagepool/nodepools/{StoragepoolNodepoolId} |
*StoragepoolApi* | [**updateStoragepoolSettings**](docs/StoragepoolApi.md#updateStoragepoolSettings) | **PUT** /platform/5/storagepool/settings |
*StoragepoolApi* | [**updateStoragepoolTier**](docs/StoragepoolApi.md#updateStoragepoolTier) | **PUT** /platform/1/storagepool/tiers/{StoragepoolTierId} |
*SyncApi* | [**createSyncJob**](docs/SyncApi.md#createSyncJob) | **POST** /platform/3/sync/jobs |
*SyncApi* | [**createSyncPolicy**](docs/SyncApi.md#createSyncPolicy) | **POST** /platform/3/sync/policies |
*SyncApi* | [**createSyncReportsRotateItem**](docs/SyncApi.md#createSyncReportsRotateItem) | **POST** /platform/1/sync/reports-rotate |
*SyncApi* | [**createSyncRule**](docs/SyncApi.md#createSyncRule) | **POST** /platform/3/sync/rules |
*SyncApi* | [**deleteSyncPolicies**](docs/SyncApi.md#deleteSyncPolicies) | **DELETE** /platform/3/sync/policies |
*SyncApi* | [**deleteSyncPolicy**](docs/SyncApi.md#deleteSyncPolicy) | **DELETE** /platform/3/sync/policies/{SyncPolicyId} |
*SyncApi* | [**deleteSyncRule**](docs/SyncApi.md#deleteSyncRule) | **DELETE** /platform/3/sync/rules/{SyncRuleId} |
*SyncApi* | [**deleteSyncRules**](docs/SyncApi.md#deleteSyncRules) | **DELETE** /platform/3/sync/rules |
*SyncApi* | [**deleteTargetPolicy**](docs/SyncApi.md#deleteTargetPolicy) | **DELETE** /platform/1/sync/target/policies/{TargetPolicyId} |
*SyncApi* | [**getHistoryCpu**](docs/SyncApi.md#getHistoryCpu) | **GET** /platform/3/sync/history/cpu |
*SyncApi* | [**getHistoryFile**](docs/SyncApi.md#getHistoryFile) | **GET** /platform/1/sync/history/file |
*SyncApi* | [**getHistoryNetwork**](docs/SyncApi.md#getHistoryNetwork) | **GET** /platform/1/sync/history/network |
*SyncApi* | [**getHistoryWorker**](docs/SyncApi.md#getHistoryWorker) | **GET** /platform/3/sync/history/worker |
*SyncApi* | [**getSyncJob**](docs/SyncApi.md#getSyncJob) | **GET** /platform/3/sync/jobs/{SyncJobId} |
*SyncApi* | [**getSyncLicense**](docs/SyncApi.md#getSyncLicense) | **GET** /platform/5/sync/license |
*SyncApi* | [**getSyncPolicy**](docs/SyncApi.md#getSyncPolicy) | **GET** /platform/3/sync/policies/{SyncPolicyId} |
*SyncApi* | [**getSyncReport**](docs/SyncApi.md#getSyncReport) | **GET** /platform/4/sync/reports/{SyncReportId} |
*SyncApi* | [**getSyncReports**](docs/SyncApi.md#getSyncReports) | **GET** /platform/4/sync/reports |
*SyncApi* | [**getSyncRule**](docs/SyncApi.md#getSyncRule) | **GET** /platform/3/sync/rules/{SyncRuleId} |
*SyncApi* | [**getSyncSettings**](docs/SyncApi.md#getSyncSettings) | **GET** /platform/3/sync/settings |
*SyncApi* | [**getTargetPolicies**](docs/SyncApi.md#getTargetPolicies) | **GET** /platform/1/sync/target/policies |
*SyncApi* | [**getTargetPolicy**](docs/SyncApi.md#getTargetPolicy) | **GET** /platform/1/sync/target/policies/{TargetPolicyId} |
*SyncApi* | [**getTargetReport**](docs/SyncApi.md#getTargetReport) | **GET** /platform/4/sync/target/reports/{TargetReportId} |
*SyncApi* | [**getTargetReports**](docs/SyncApi.md#getTargetReports) | **GET** /platform/4/sync/target/reports |
*SyncApi* | [**listSyncJobs**](docs/SyncApi.md#listSyncJobs) | **GET** /platform/3/sync/jobs |
*SyncApi* | [**listSyncPolicies**](docs/SyncApi.md#listSyncPolicies) | **GET** /platform/3/sync/policies |
*SyncApi* | [**listSyncReportsRotate**](docs/SyncApi.md#listSyncReportsRotate) | **GET** /platform/1/sync/reports-rotate |
*SyncApi* | [**listSyncRules**](docs/SyncApi.md#listSyncRules) | **GET** /platform/3/sync/rules |
*SyncApi* | [**updateSyncJob**](docs/SyncApi.md#updateSyncJob) | **PUT** /platform/3/sync/jobs/{SyncJobId} |
*SyncApi* | [**updateSyncPolicy**](docs/SyncApi.md#updateSyncPolicy) | **PUT** /platform/3/sync/policies/{SyncPolicyId} |
*SyncApi* | [**updateSyncRule**](docs/SyncApi.md#updateSyncRule) | **PUT** /platform/3/sync/rules/{SyncRuleId} |
*SyncApi* | [**updateSyncSettings**](docs/SyncApi.md#updateSyncSettings) | **PUT** /platform/3/sync/settings |
*SyncPoliciesApi* | [**createPolicyResetItem**](docs/SyncPoliciesApi.md#createPolicyResetItem) | **POST** /platform/1/sync/policies/{Policy}/reset |
*SyncReportsApi* | [**getReportSubreport**](docs/SyncReportsApi.md#getReportSubreport) | **GET** /platform/4/sync/reports/{Rid}/subreports/{ReportSubreportId} |
*SyncReportsApi* | [**getReportSubreports**](docs/SyncReportsApi.md#getReportSubreports) | **GET** /platform/4/sync/reports/{Rid}/subreports |
*SyncTargetApi* | [**createPoliciesPolicyCancelItem**](docs/SyncTargetApi.md#createPoliciesPolicyCancelItem) | **POST** /platform/1/sync/target/policies/{Policy}/cancel |
*SyncTargetApi* | [**getReportsReportSubreport**](docs/SyncTargetApi.md#getReportsReportSubreport) | **GET** /platform/4/sync/target/reports/{Rid}/subreports/{ReportsReportSubreportId} |
*SyncTargetApi* | [**getReportsReportSubreports**](docs/SyncTargetApi.md#getReportsReportSubreports) | **GET** /platform/4/sync/target/reports/{Rid}/subreports |
*UpgradeApi* | [**createClusterAddRemainingNode**](docs/UpgradeApi.md#createClusterAddRemainingNode) | **POST** /platform/3/upgrade/cluster/add_remaining_nodes |
*UpgradeApi* | [**createClusterArchiveItem**](docs/UpgradeApi.md#createClusterArchiveItem) | **POST** /platform/3/upgrade/cluster/archive |
*UpgradeApi* | [**createClusterAssessItem**](docs/UpgradeApi.md#createClusterAssessItem) | **POST** /platform/5/upgrade/cluster/assess |
*UpgradeApi* | [**createClusterCommitItem**](docs/UpgradeApi.md#createClusterCommitItem) | **POST** /platform/3/upgrade/cluster/commit |
*UpgradeApi* | [**createClusterFirmwareAssessItem**](docs/UpgradeApi.md#createClusterFirmwareAssessItem) | **POST** /platform/3/upgrade/cluster/firmware/assess |
*UpgradeApi* | [**createClusterFirmwareUpgradeItem**](docs/UpgradeApi.md#createClusterFirmwareUpgradeItem) | **POST** /platform/3/upgrade/cluster/firmware/upgrade |
*UpgradeApi* | [**createClusterPatchAbortItem**](docs/UpgradeApi.md#createClusterPatchAbortItem) | **POST** /platform/3/upgrade/cluster/patch/abort |
*UpgradeApi* | [**createClusterPatchPatch**](docs/UpgradeApi.md#createClusterPatchPatch) | **POST** /platform/3/upgrade/cluster/patch/patches |
*UpgradeApi* | [**createClusterRetryLastActionItem**](docs/UpgradeApi.md#createClusterRetryLastActionItem) | **POST** /platform/3/upgrade/cluster/retry_last_action |
*UpgradeApi* | [**createClusterRollbackItem**](docs/UpgradeApi.md#createClusterRollbackItem) | **POST** /platform/3/upgrade/cluster/rollback |
*UpgradeApi* | [**createClusterUpgradeItem**](docs/UpgradeApi.md#createClusterUpgradeItem) | **POST** /platform/5/upgrade/cluster/upgrade |
*UpgradeApi* | [**createHardwareStartItem**](docs/UpgradeApi.md#createHardwareStartItem) | **POST** /platform/5/upgrade/hardware/start |
*UpgradeApi* | [**createHardwareStopItem**](docs/UpgradeApi.md#createHardwareStopItem) | **POST** /platform/5/upgrade/hardware/stop |
*UpgradeApi* | [**deleteClusterPatchPatch**](docs/UpgradeApi.md#deleteClusterPatchPatch) | **DELETE** /platform/3/upgrade/cluster/patch/patches/{ClusterPatchPatchId} |
*UpgradeApi* | [**getClusterFirmwareProgress**](docs/UpgradeApi.md#getClusterFirmwareProgress) | **GET** /platform/3/upgrade/cluster/firmware/progress |
*UpgradeApi* | [**getClusterFirmwareStatus**](docs/UpgradeApi.md#getClusterFirmwareStatus) | **GET** /platform/3/upgrade/cluster/firmware/status |
*UpgradeApi* | [**getClusterNode**](docs/UpgradeApi.md#getClusterNode) | **GET** /platform/3/upgrade/cluster/nodes/{ClusterNodeId} |
*UpgradeApi* | [**getClusterNodes**](docs/UpgradeApi.md#getClusterNodes) | **GET** /platform/3/upgrade/cluster/nodes |
*UpgradeApi* | [**getClusterPatchPatch**](docs/UpgradeApi.md#getClusterPatchPatch) | **GET** /platform/3/upgrade/cluster/patch/patches/{ClusterPatchPatchId} |
*UpgradeApi* | [**getHardwareStatus**](docs/UpgradeApi.md#getHardwareStatus) | **GET** /platform/5/upgrade/hardware/status |
*UpgradeApi* | [**getUpgradeCluster**](docs/UpgradeApi.md#getUpgradeCluster) | **GET** /platform/4/upgrade/cluster |
*UpgradeApi* | [**listClusterPatchPatches**](docs/UpgradeApi.md#listClusterPatchPatches) | **GET** /platform/3/upgrade/cluster/patch/patches |
*UpgradeApi* | [**updateClusterUpgrade**](docs/UpgradeApi.md#updateClusterUpgrade) | **PUT** /platform/5/upgrade/cluster/upgrade |
*UpgradeClusterApi* | [**createNodesNodePatchSyncItem**](docs/UpgradeClusterApi.md#createNodesNodePatchSyncItem) | **POST** /platform/4/upgrade/cluster/nodes/{Lnn}/patch/sync |
*UpgradeClusterApi* | [**getNodesNodeFirmwareStatus**](docs/UpgradeClusterApi.md#getNodesNodeFirmwareStatus) | **GET** /platform/3/upgrade/cluster/nodes/{Lnn}/firmware/status |
*WormApi* | [**createWormDomain**](docs/WormApi.md#createWormDomain) | **POST** /platform/1/worm/domains |
*WormApi* | [**getWormDomain**](docs/WormApi.md#getWormDomain) | **GET** /platform/1/worm/domains/{WormDomainId} |
*WormApi* | [**getWormSettings**](docs/WormApi.md#getWormSettings) | **GET** /platform/1/worm/settings |
*WormApi* | [**listWormDomains**](docs/WormApi.md#listWormDomains) | **GET** /platform/1/worm/domains |
*WormApi* | [**updateWormDomain**](docs/WormApi.md#updateWormDomain) | **PUT** /platform/1/worm/domains/{WormDomainId} |
*WormApi* | [**updateWormSettings**](docs/WormApi.md#updateWormSettings) | **PUT** /platform/1/worm/settings |
*ZonesApi* | [**createZone**](docs/ZonesApi.md#createZone) | **POST** /platform/3/zones |
*ZonesApi* | [**deleteZone**](docs/ZonesApi.md#deleteZone) | **DELETE** /platform/3/zones/{ZoneId} |
*ZonesApi* | [**getZone**](docs/ZonesApi.md#getZone) | **GET** /platform/3/zones/{ZoneId} |
*ZonesApi* | [**listZones**](docs/ZonesApi.md#listZones) | **GET** /platform/3/zones |
*ZonesApi* | [**updateZone**](docs/ZonesApi.md#updateZone) | **PUT** /platform/3/zones/{ZoneId} |
*ZonesSummaryApi* | [**getZonesSummary**](docs/ZonesSummaryApi.md#getZonesSummary) | **GET** /platform/1/zones-summary |
*ZonesSummaryApi* | [**getZonesSummaryZone**](docs/ZonesSummaryApi.md#getZonesSummaryZone) | **GET** /platform/1/zones-summary/{ZonesSummaryZone} |


## Documentation for Models

 - [AdsProviderControllers](docs/AdsProviderControllers.md)
 - [AdsProviderControllersController](docs/AdsProviderControllersController.md)
 - [AdsProviderDomains](docs/AdsProviderDomains.md)
 - [AdsProviderDomainsDomain](docs/AdsProviderDomainsDomain.md)
 - [AdsProviderSearch](docs/AdsProviderSearch.md)
 - [AdsProviderSearchObject](docs/AdsProviderSearchObject.md)
 - [AntivirusPolicies](docs/AntivirusPolicies.md)
 - [AntivirusPolicy](docs/AntivirusPolicy.md)
 - [AntivirusQuarantine](docs/AntivirusQuarantine.md)
 - [AntivirusQuarantinePathParams](docs/AntivirusQuarantinePathParams.md)
 - [AntivirusScanItem](docs/AntivirusScanItem.md)
 - [AntivirusServer](docs/AntivirusServer.md)
 - [AntivirusServers](docs/AntivirusServers.md)
 - [AntivirusSettings](docs/AntivirusSettings.md)
 - [AntivirusSettingsSettings](docs/AntivirusSettingsSettings.md)
 - [AuditProgress](docs/AuditProgress.md)
 - [AuditProgressProgress](docs/AuditProgressProgress.md)
 - [AuditSettings](docs/AuditSettings.md)
 - [AuditSettingsSettings](docs/AuditSettingsSettings.md)
 - [AuditTopic](docs/AuditTopic.md)
 - [AuditTopicCreateParams](docs/AuditTopicCreateParams.md)
 - [AuditTopics](docs/AuditTopics.md)
 - [AuthAccess](docs/AuthAccess.md)
 - [AuthAccessAccessItem](docs/AuthAccessAccessItem.md)
 - [AuthAccessAccessItemFile](docs/AuthAccessAccessItemFile.md)
 - [AuthAccessAccessItemFileFilePermissions](docs/AuthAccessAccessItemFileFilePermissions.md)
 - [AuthAccessAccessItemFileGroup](docs/AuthAccessAccessItemFileGroup.md)
 - [AuthAccessAccessItemShare](docs/AuthAccessAccessItemShare.md)
 - [AuthAccessAccessItemShareEffectiveUser](docs/AuthAccessAccessItemShareEffectiveUser.md)
 - [AuthAccessAccessItemShareSharePermissions](docs/AuthAccessAccessItemShareSharePermissions.md)
 - [AuthAccessAccessItemShareSharePermissionsShareRelevantAce](docs/AuthAccessAccessItemShareSharePermissionsShareRelevantAce.md)
 - [AuthCacheItem](docs/AuthCacheItem.md)
 - [AuthGroup](docs/AuthGroup.md)
 - [AuthGroupExtended](docs/AuthGroupExtended.md)
 - [AuthGroupObjectHistoryItem](docs/AuthGroupObjectHistoryItem.md)
 - [AuthGroups](docs/AuthGroups.md)
 - [AuthId](docs/AuthId.md)
 - [AuthIdNtoken](docs/AuthIdNtoken.md)
 - [AuthIdNtokenPrivilegeItem](docs/AuthIdNtokenPrivilegeItem.md)
 - [AuthLdapTemplates](docs/AuthLdapTemplates.md)
 - [AuthLdapTemplatesExtended](docs/AuthLdapTemplatesExtended.md)
 - [AuthLdapTemplatesLdapConfigurationTemplate](docs/AuthLdapTemplatesLdapConfigurationTemplate.md)
 - [AuthLdapTemplatesLdapFieldTemplateItem](docs/AuthLdapTemplatesLdapFieldTemplateItem.md)
 - [AuthLogLevel](docs/AuthLogLevel.md)
 - [AuthLogLevelExtended](docs/AuthLogLevelExtended.md)
 - [AuthLogLevelLevel](docs/AuthLogLevelLevel.md)
 - [AuthNetgroup](docs/AuthNetgroup.md)
 - [AuthNetgroups](docs/AuthNetgroups.md)
 - [AuthPrivilege](docs/AuthPrivilege.md)
 - [AuthPrivileges](docs/AuthPrivileges.md)
 - [AuthRole](docs/AuthRole.md)
 - [AuthRoles](docs/AuthRoles.md)
 - [AuthShells](docs/AuthShells.md)
 - [AuthUser](docs/AuthUser.md)
 - [AuthUsers](docs/AuthUsers.md)
 - [AuthWellknowns](docs/AuthWellknowns.md)
 - [CertificateServer](docs/CertificateServer.md)
 - [CertificateServerCertificate](docs/CertificateServerCertificate.md)
 - [CertificateServerCertificateFingerprint](docs/CertificateServerCertificateFingerprint.md)
 - [CertificateServerIdParams](docs/CertificateServerIdParams.md)
 - [CertificateServerItem](docs/CertificateServerItem.md)
 - [ChangelistLins](docs/ChangelistLins.md)
 - [ChangelistLinsCtime](docs/ChangelistLinsCtime.md)
 - [ChangelistLinsExtended](docs/ChangelistLinsExtended.md)
 - [CloudAccess](docs/CloudAccess.md)
 - [CloudAccessCluster](docs/CloudAccessCluster.md)
 - [CloudAccessItem](docs/CloudAccessItem.md)
 - [CloudAccount](docs/CloudAccount.md)
 - [CloudAccountCreateParams](docs/CloudAccountCreateParams.md)
 - [CloudAccounts](docs/CloudAccounts.md)
 - [CloudJob](docs/CloudJob.md)
 - [CloudJobCreateParams](docs/CloudJobCreateParams.md)
 - [CloudJobExtended](docs/CloudJobExtended.md)
 - [CloudJobFiles](docs/CloudJobFiles.md)
 - [CloudJobFilesName](docs/CloudJobFilesName.md)
 - [CloudJobJobEngineJob](docs/CloudJobJobEngineJob.md)
 - [CloudJobs](docs/CloudJobs.md)
 - [CloudJobsFiles](docs/CloudJobsFiles.md)
 - [CloudPool](docs/CloudPool.md)
 - [CloudPools](docs/CloudPools.md)
 - [CloudProxies](docs/CloudProxies.md)
 - [CloudProxy](docs/CloudProxy.md)
 - [CloudSettings](docs/CloudSettings.md)
 - [CloudSettingsSettings](docs/CloudSettingsSettings.md)
 - [CloudSettingsSettingsCloudPolicyDefaults](docs/CloudSettingsSettingsCloudPolicyDefaults.md)
 - [CloudSettingsSettingsCloudPolicyDefaultsCache](docs/CloudSettingsSettingsCloudPolicyDefaultsCache.md)
 - [CloudSettingsSettingsSleepTimeoutCloudGarbageCollection](docs/CloudSettingsSettingsSleepTimeoutCloudGarbageCollection.md)
 - [ClusterAddNodeItem](docs/ClusterAddNodeItem.md)
 - [ClusterArchiveItem](docs/ClusterArchiveItem.md)
 - [ClusterAssessItem](docs/ClusterAssessItem.md)
 - [ClusterConfig](docs/ClusterConfig.md)
 - [ClusterConfigDevice](docs/ClusterConfigDevice.md)
 - [ClusterConfigOnefsVersion](docs/ClusterConfigOnefsVersion.md)
 - [ClusterConfigTimezone](docs/ClusterConfigTimezone.md)
 - [ClusterEmail](docs/ClusterEmail.md)
 - [ClusterEmailExtended](docs/ClusterEmailExtended.md)
 - [ClusterEmailSettings](docs/ClusterEmailSettings.md)
 - [ClusterFirmwareProgress](docs/ClusterFirmwareProgress.md)
 - [ClusterFirmwareStatus](docs/ClusterFirmwareStatus.md)
 - [ClusterFirmwareStatusNode](docs/ClusterFirmwareStatusNode.md)
 - [ClusterFirmwareStatusNodeDevice](docs/ClusterFirmwareStatusNodeDevice.md)
 - [ClusterFirmwareStatusNodePackageItem](docs/ClusterFirmwareStatusNodePackageItem.md)
 - [ClusterFirmwareUpgradeItem](docs/ClusterFirmwareUpgradeItem.md)
 - [ClusterIdentity](docs/ClusterIdentity.md)
 - [ClusterIdentityLogon](docs/ClusterIdentityLogon.md)
 - [ClusterNode](docs/ClusterNode.md)
 - [ClusterNodeDrive](docs/ClusterNodeDrive.md)
 - [ClusterNodeDriveDConfig](docs/ClusterNodeDriveDConfig.md)
 - [ClusterNodeExtended](docs/ClusterNodeExtended.md)
 - [ClusterNodeExtendedExtended](docs/ClusterNodeExtendedExtended.md)
 - [ClusterNodeHardware](docs/ClusterNodeHardware.md)
 - [ClusterNodePartitions](docs/ClusterNodePartitions.md)
 - [ClusterNodeSensors](docs/ClusterNodeSensors.md)
 - [ClusterNodeState](docs/ClusterNodeState.md)
 - [ClusterNodeStateExtended](docs/ClusterNodeStateExtended.md)
 - [ClusterNodeStateExtendedExtended](docs/ClusterNodeStateExtendedExtended.md)
 - [ClusterNodeStateServicelight](docs/ClusterNodeStateServicelight.md)
 - [ClusterNodeStateSmartfail](docs/ClusterNodeStateSmartfail.md)
 - [ClusterNodeStatus](docs/ClusterNodeStatus.md)
 - [ClusterNodes](docs/ClusterNodes.md)
 - [ClusterNodesAvailable](docs/ClusterNodesAvailable.md)
 - [ClusterNodesAvailableNode](docs/ClusterNodesAvailableNode.md)
 - [ClusterNodesError](docs/ClusterNodesError.md)
 - [ClusterNodesExtended](docs/ClusterNodesExtended.md)
 - [ClusterNodesExtendedExtended](docs/ClusterNodesExtendedExtended.md)
 - [ClusterNodesExtendedExtendedExtended](docs/ClusterNodesExtendedExtendedExtended.md)
 - [ClusterNodesOnefsVersion](docs/ClusterNodesOnefsVersion.md)
 - [ClusterOwner](docs/ClusterOwner.md)
 - [ClusterPatchPatch](docs/ClusterPatchPatch.md)
 - [ClusterPatchPatches](docs/ClusterPatchPatches.md)
 - [ClusterPatchPatchesPatch](docs/ClusterPatchPatchesPatch.md)
 - [ClusterPatchPatchesPatchFile](docs/ClusterPatchPatchesPatchFile.md)
 - [ClusterPatchPatchesPatchService](docs/ClusterPatchPatchesPatchService.md)
 - [ClusterRetryLastActionItem](docs/ClusterRetryLastActionItem.md)
 - [ClusterStatfs](docs/ClusterStatfs.md)
 - [ClusterTime](docs/ClusterTime.md)
 - [ClusterTimeExtended](docs/ClusterTimeExtended.md)
 - [ClusterTimeExtendedExtended](docs/ClusterTimeExtendedExtended.md)
 - [ClusterTimeNode](docs/ClusterTimeNode.md)
 - [ClusterTimezone](docs/ClusterTimezone.md)
 - [ClusterTimezoneExtended](docs/ClusterTimezoneExtended.md)
 - [ClusterTimezoneSettings](docs/ClusterTimezoneSettings.md)
 - [ClusterTimezoneSettingsExtended](docs/ClusterTimezoneSettingsExtended.md)
 - [ClusterUpgrade](docs/ClusterUpgrade.md)
 - [ClusterUpgradeItem](docs/ClusterUpgradeItem.md)
 - [ClusterVersion](docs/ClusterVersion.md)
 - [ClusterVersionNode](docs/ClusterVersionNode.md)
 - [CompatibilitiesClassActive](docs/CompatibilitiesClassActive.md)
 - [CompatibilitiesClassActiveActiveItem](docs/CompatibilitiesClassActiveActiveItem.md)
 - [CompatibilitiesClassActiveItem](docs/CompatibilitiesClassActiveItem.md)
 - [CompatibilitiesClassAvailable](docs/CompatibilitiesClassAvailable.md)
 - [CompatibilitiesClassAvailableAvailableItem](docs/CompatibilitiesClassAvailableAvailableItem.md)
 - [CompatibilitiesSsdActive](docs/CompatibilitiesSsdActive.md)
 - [CompatibilitiesSsdActiveActiveItem](docs/CompatibilitiesSsdActiveActiveItem.md)
 - [CompatibilitiesSsdActiveIdParams](docs/CompatibilitiesSsdActiveIdParams.md)
 - [CompatibilitiesSsdActiveItem](docs/CompatibilitiesSsdActiveItem.md)
 - [CompatibilitiesSsdAvailable](docs/CompatibilitiesSsdAvailable.md)
 - [CompatibilitiesSsdAvailableAvailableItem](docs/CompatibilitiesSsdAvailableAvailableItem.md)
 - [CreateAntivirusScanItemResponse](docs/CreateAntivirusScanItemResponse.md)
 - [CreateAuthRefreshItemResponse](docs/CreateAuthRefreshItemResponse.md)
 - [CreateCloudAccountResponse](docs/CreateCloudAccountResponse.md)
 - [CreateCloudJobResponse](docs/CreateCloudJobResponse.md)
 - [CreateCloudPoolResponse](docs/CreateCloudPoolResponse.md)
 - [CreateCloudProxyResponse](docs/CreateCloudProxyResponse.md)
 - [CreateCompatibilitiesClassActiveItemResponse](docs/CreateCompatibilitiesClassActiveItemResponse.md)
 - [CreateCompatibilitiesClassActiveItemResponseMerge](docs/CreateCompatibilitiesClassActiveItemResponseMerge.md)
 - [CreateCompatibilitiesClassActiveItemResponseSplit](docs/CreateCompatibilitiesClassActiveItemResponseSplit.md)
 - [CreateFilepoolPolicyResponse](docs/CreateFilepoolPolicyResponse.md)
 - [CreateHardeningApplyItemResponse](docs/CreateHardeningApplyItemResponse.md)
 - [CreateHardeningResolveItemResponse](docs/CreateHardeningResolveItemResponse.md)
 - [CreateHardeningRevertItemResponse](docs/CreateHardeningRevertItemResponse.md)
 - [CreateHardwareTapeNameResponse](docs/CreateHardwareTapeNameResponse.md)
 - [CreateHardwareTapeNameResponseNode](docs/CreateHardwareTapeNameResponseNode.md)
 - [CreateHardwareTapeNameResponseNodeRescanReportItem](docs/CreateHardwareTapeNameResponseNodeRescanReportItem.md)
 - [CreateJobJobResponse](docs/CreateJobJobResponse.md)
 - [CreateNfsAliasResponse](docs/CreateNfsAliasResponse.md)
 - [CreateNfsNlmSessionsCheckItemResponse](docs/CreateNfsNlmSessionsCheckItemResponse.md)
 - [CreateQuotaReportResponse](docs/CreateQuotaReportResponse.md)
 - [CreateResponse](docs/CreateResponse.md)
 - [CreateSnapshotAliasResponse](docs/CreateSnapshotAliasResponse.md)
 - [CreateSnapshotChangelistResponse](docs/CreateSnapshotChangelistResponse.md)
 - [CreateSnapshotLockResponse](docs/CreateSnapshotLockResponse.md)
 - [CreateSnapshotRepstateResponse](docs/CreateSnapshotRepstateResponse.md)
 - [CreateSnapshotScheduleResponse](docs/CreateSnapshotScheduleResponse.md)
 - [CreateStoragepoolTierResponse](docs/CreateStoragepoolTierResponse.md)
 - [CreateSyncReportsRotateItemResponse](docs/CreateSyncReportsRotateItemResponse.md)
 - [DebugStats](docs/DebugStats.md)
 - [DebugStatsHandler](docs/DebugStatsHandler.md)
 - [DebugStatsUnknown](docs/DebugStatsUnknown.md)
 - [DedupeDedupeSummary](docs/DedupeDedupeSummary.md)
 - [DedupeDedupeSummarySummary](docs/DedupeDedupeSummarySummary.md)
 - [DedupeReport](docs/DedupeReport.md)
 - [DedupeReportExtended](docs/DedupeReportExtended.md)
 - [DedupeReports](docs/DedupeReports.md)
 - [DedupeSettings](docs/DedupeSettings.md)
 - [DedupeSettingsExtended](docs/DedupeSettingsExtended.md)
 - [DedupeSettingsSettings](docs/DedupeSettingsSettings.md)
 - [DiagnosticsGatherSettings](docs/DiagnosticsGatherSettings.md)
 - [DiagnosticsGatherStatus](docs/DiagnosticsGatherStatus.md)
 - [DiagnosticsGatherStatusGather](docs/DiagnosticsGatherStatusGather.md)
 - [DiagnosticsGatherStatusGatherStatus](docs/DiagnosticsGatherStatusGatherStatus.md)
 - [DiagnosticsNetloggerSettings](docs/DiagnosticsNetloggerSettings.md)
 - [DiagnosticsNetloggerStatus](docs/DiagnosticsNetloggerStatus.md)
 - [DrivesDriveFirmware](docs/DrivesDriveFirmware.md)
 - [DrivesDriveFirmwareNode](docs/DrivesDriveFirmwareNode.md)
 - [DrivesDriveFirmwareNodeDrive](docs/DrivesDriveFirmwareNodeDrive.md)
 - [DrivesDriveFirmwareUpdate](docs/DrivesDriveFirmwareUpdate.md)
 - [DrivesDriveFirmwareUpdateItem](docs/DrivesDriveFirmwareUpdateItem.md)
 - [DrivesDriveFirmwareUpdateNode](docs/DrivesDriveFirmwareUpdateNode.md)
 - [DrivesDriveFirmwareUpdateNodeStatus](docs/DrivesDriveFirmwareUpdateNodeStatus.md)
 - [DrivesDriveFormatItem](docs/DrivesDriveFormatItem.md)
 - [DrivesDrivePurposeItem](docs/DrivesDrivePurposeItem.md)
 - [Empty](docs/Empty.md)
 - [Error](docs/Error.md)
 - [EventAlertCondition](docs/EventAlertCondition.md)
 - [EventAlertConditions](docs/EventAlertConditions.md)
 - [EventAlertConditionsAlertCondition](docs/EventAlertConditionsAlertCondition.md)
 - [EventCategories](docs/EventCategories.md)
 - [EventCategory](docs/EventCategory.md)
 - [EventChannel](docs/EventChannel.md)
 - [EventChannelParameters](docs/EventChannelParameters.md)
 - [EventChannels](docs/EventChannels.md)
 - [EventEvent](docs/EventEvent.md)
 - [EventEventgroupDefinitions](docs/EventEventgroupDefinitions.md)
 - [EventEventgroupDefinitionsEventgroupDefinition](docs/EventEventgroupDefinitionsEventgroupDefinition.md)
 - [EventEventgroupOccurrence](docs/EventEventgroupOccurrence.md)
 - [EventEventgroupOccurrences](docs/EventEventgroupOccurrences.md)
 - [EventEventgroupOccurrencesEventgroup](docs/EventEventgroupOccurrencesEventgroup.md)
 - [EventEventlist](docs/EventEventlist.md)
 - [EventEventlistEvent](docs/EventEventlistEvent.md)
 - [EventEventlists](docs/EventEventlists.md)
 - [EventSettings](docs/EventSettings.md)
 - [EventSettingsSettings](docs/EventSettingsSettings.md)
 - [EventSettingsSettingsMaintenance](docs/EventSettingsSettingsMaintenance.md)
 - [FileFilterSettings](docs/FileFilterSettings.md)
 - [FileFilterSettingsExtended](docs/FileFilterSettingsExtended.md)
 - [FileFilterSettingsSettings](docs/FileFilterSettingsSettings.md)
 - [FilepoolDefaultPolicy](docs/FilepoolDefaultPolicy.md)
 - [FilepoolDefaultPolicyDefaultPolicy](docs/FilepoolDefaultPolicyDefaultPolicy.md)
 - [FilepoolDefaultPolicyDefaultPolicyAction](docs/FilepoolDefaultPolicyDefaultPolicyAction.md)
 - [FilepoolDefaultPolicyExtended](docs/FilepoolDefaultPolicyExtended.md)
 - [FilepoolPolicies](docs/FilepoolPolicies.md)
 - [FilepoolPolicy](docs/FilepoolPolicy.md)
 - [FilepoolPolicyCreateParams](docs/FilepoolPolicyCreateParams.md)
 - [FilepoolPolicyExtended](docs/FilepoolPolicyExtended.md)
 - [FilepoolPolicyFileMatchingPattern](docs/FilepoolPolicyFileMatchingPattern.md)
 - [FilepoolPolicyFileMatchingPatternOrCriteriaItem](docs/FilepoolPolicyFileMatchingPatternOrCriteriaItem.md)
 - [FilepoolPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem](docs/FilepoolPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem.md)
 - [FilepoolTemplates](docs/FilepoolTemplates.md)
 - [FsaResult](docs/FsaResult.md)
 - [FsaResults](docs/FsaResults.md)
 - [FsaSettings](docs/FsaSettings.md)
 - [FsaSettingsSettings](docs/FsaSettingsSettings.md)
 - [FtpSettings](docs/FtpSettings.md)
 - [FtpSettingsExtended](docs/FtpSettingsExtended.md)
 - [FtpSettingsSettings](docs/FtpSettingsSettings.md)
 - [GroupMembers](docs/GroupMembers.md)
 - [GroupnetSubnet](docs/GroupnetSubnet.md)
 - [GroupnetSubnets](docs/GroupnetSubnets.md)
 - [HardeningApplyItem](docs/HardeningApplyItem.md)
 - [HardeningResolveItem](docs/HardeningResolveItem.md)
 - [HardeningState](docs/HardeningState.md)
 - [HardeningStateState](docs/HardeningStateState.md)
 - [HardeningStatus](docs/HardeningStatus.md)
 - [HardeningStatusStatus](docs/HardeningStatusStatus.md)
 - [HardwareFcport](docs/HardwareFcport.md)
 - [HardwareFcports](docs/HardwareFcports.md)
 - [HardwareFcportsNode](docs/HardwareFcportsNode.md)
 - [HardwareFcportsNodeFcport](docs/HardwareFcportsNodeFcport.md)
 - [HardwareStartItem](docs/HardwareStartItem.md)
 - [HardwareStatus](docs/HardwareStatus.md)
 - [HardwareStatusStatusItem](docs/HardwareStatusStatusItem.md)
 - [HardwareStopItem](docs/HardwareStopItem.md)
 - [HardwareTapeNameParams](docs/HardwareTapeNameParams.md)
 - [HardwareTapes](docs/HardwareTapes.md)
 - [HardwareTapesDevices](docs/HardwareTapesDevices.md)
 - [HdfsLogLevel](docs/HdfsLogLevel.md)
 - [HdfsProxyuser](docs/HdfsProxyuser.md)
 - [HdfsProxyuserCreateParams](docs/HdfsProxyuserCreateParams.md)
 - [HdfsProxyusers](docs/HdfsProxyusers.md)
 - [HdfsRack](docs/HdfsRack.md)
 - [HdfsRacks](docs/HdfsRacks.md)
 - [HdfsRangerPluginSettings](docs/HdfsRangerPluginSettings.md)
 - [HdfsRangerPluginSettingsSettings](docs/HdfsRangerPluginSettingsSettings.md)
 - [HdfsSettings](docs/HdfsSettings.md)
 - [HdfsSettingsSettings](docs/HdfsSettingsSettings.md)
 - [HistogramStatBy](docs/HistogramStatBy.md)
 - [HistogramStatByBreakout](docs/HistogramStatByBreakout.md)
 - [HistoryFile](docs/HistoryFile.md)
 - [HistoryFileStatistic](docs/HistoryFileStatistic.md)
 - [HttpSettings](docs/HttpSettings.md)
 - [HttpSettingsSettings](docs/HttpSettingsSettings.md)
 - [IdResolutionPath](docs/IdResolutionPath.md)
 - [IdResolutionPaths](docs/IdResolutionPaths.md)
 - [IdResolutionPathsError](docs/IdResolutionPathsError.md)
 - [JobEvent](docs/JobEvent.md)
 - [JobEvents](docs/JobEvents.md)
 - [JobJob](docs/JobJob.md)
 - [JobJobAvscanParams](docs/JobJobAvscanParams.md)
 - [JobJobChangelistcreateParams](docs/JobJobChangelistcreateParams.md)
 - [JobJobCreateParams](docs/JobJobCreateParams.md)
 - [JobJobDomainmarkParams](docs/JobJobDomainmarkParams.md)
 - [JobJobExtended](docs/JobJobExtended.md)
 - [JobJobPrepairParams](docs/JobJobPrepairParams.md)
 - [JobJobSmartpoolstreeParams](docs/JobJobSmartpoolstreeParams.md)
 - [JobJobSnaprevertParams](docs/JobJobSnaprevertParams.md)
 - [JobJobSummary](docs/JobJobSummary.md)
 - [JobJobSummarySummary](docs/JobJobSummarySummary.md)
 - [JobJobs](docs/JobJobs.md)
 - [JobPolicies](docs/JobPolicies.md)
 - [JobPolicy](docs/JobPolicy.md)
 - [JobPolicyInterval](docs/JobPolicyInterval.md)
 - [JobRecent](docs/JobRecent.md)
 - [JobReports](docs/JobReports.md)
 - [JobStatistics](docs/JobStatistics.md)
 - [JobStatisticsJob](docs/JobStatisticsJob.md)
 - [JobStatisticsJobNode](docs/JobStatisticsJobNode.md)
 - [JobStatisticsJobNodeCpu](docs/JobStatisticsJobNodeCpu.md)
 - [JobStatisticsJobNodeIo](docs/JobStatisticsJobNodeIo.md)
 - [JobStatisticsJobNodeIoRead](docs/JobStatisticsJobNodeIoRead.md)
 - [JobStatisticsJobNodeIoWrite](docs/JobStatisticsJobNodeIoWrite.md)
 - [JobStatisticsJobNodeMemory](docs/JobStatisticsJobNodeMemory.md)
 - [JobStatisticsJobNodeMemoryPhysical](docs/JobStatisticsJobNodeMemoryPhysical.md)
 - [JobStatisticsJobNodeMemoryVirtual](docs/JobStatisticsJobNodeMemoryVirtual.md)
 - [JobStatisticsJobNodeWorker](docs/JobStatisticsJobNodeWorker.md)
 - [JobType](docs/JobType.md)
 - [JobTypes](docs/JobTypes.md)
 - [LicenseGenerate](docs/LicenseGenerate.md)
 - [LicenseGenerateHardwareItem](docs/LicenseGenerateHardwareItem.md)
 - [LicenseLicense](docs/LicenseLicense.md)
 - [LicenseLicenseCreateParams](docs/LicenseLicenseCreateParams.md)
 - [LicenseLicenseTier](docs/LicenseLicenseTier.md)
 - [LicenseLicenseTierEntitlementsExceededAlert](docs/LicenseLicenseTierEntitlementsExceededAlert.md)
 - [LicenseLicenses](docs/LicenseLicenses.md)
 - [MappingDump](docs/MappingDump.md)
 - [MappingIdentities](docs/MappingIdentities.md)
 - [MappingIdentity](docs/MappingIdentity.md)
 - [MappingIdentityCreateParams](docs/MappingIdentityCreateParams.md)
 - [MappingIdentityTarget](docs/MappingIdentityTarget.md)
 - [MappingIdentityTargetCreateParams](docs/MappingIdentityTargetCreateParams.md)
 - [MappingImport](docs/MappingImport.md)
 - [MappingUsersLookup](docs/MappingUsersLookup.md)
 - [MappingUsersLookupMappingItem](docs/MappingUsersLookupMappingItem.md)
 - [MappingUsersLookupMappingItemGroup](docs/MappingUsersLookupMappingItemGroup.md)
 - [MappingUsersLookupMappingItemUser](docs/MappingUsersLookupMappingItemUser.md)
 - [MappingUsersRules](docs/MappingUsersRules.md)
 - [MappingUsersRulesExtended](docs/MappingUsersRulesExtended.md)
 - [MappingUsersRulesParameters](docs/MappingUsersRulesParameters.md)
 - [MappingUsersRulesRule](docs/MappingUsersRulesRule.md)
 - [MappingUsersRulesRuleExtended](docs/MappingUsersRulesRuleExtended.md)
 - [MappingUsersRulesRuleOptions](docs/MappingUsersRulesRuleOptions.md)
 - [MappingUsersRulesRuleOptionsExtended](docs/MappingUsersRulesRuleOptionsExtended.md)
 - [MappingUsersRulesRuleUser2](docs/MappingUsersRulesRuleUser2.md)
 - [MappingUsersRulesRules](docs/MappingUsersRulesRules.md)
 - [MappingUsersRulesRulesParameters](docs/MappingUsersRulesRulesParameters.md)
 - [NdmpContextsBackup](docs/NdmpContextsBackup.md)
 - [NdmpContextsBackupContext](docs/NdmpContextsBackupContext.md)
 - [NdmpContextsBackupExtended](docs/NdmpContextsBackupExtended.md)
 - [NdmpContextsBackupSession](docs/NdmpContextsBackupSession.md)
 - [NdmpContextsBre](docs/NdmpContextsBre.md)
 - [NdmpContextsBreContext](docs/NdmpContextsBreContext.md)
 - [NdmpContextsBreEnvVariable](docs/NdmpContextsBreEnvVariable.md)
 - [NdmpContextsBreExtended](docs/NdmpContextsBreExtended.md)
 - [NdmpDiagnostics](docs/NdmpDiagnostics.md)
 - [NdmpDiagnosticsDiagnostics](docs/NdmpDiagnosticsDiagnostics.md)
 - [NdmpDumpdate](docs/NdmpDumpdate.md)
 - [NdmpDumpdates](docs/NdmpDumpdates.md)
 - [NdmpLogs](docs/NdmpLogs.md)
 - [NdmpLogsNode](docs/NdmpLogsNode.md)
 - [NdmpSession](docs/NdmpSession.md)
 - [NdmpSessionExtended](docs/NdmpSessionExtended.md)
 - [NdmpSessions](docs/NdmpSessions.md)
 - [NdmpSessionsExtended](docs/NdmpSessionsExtended.md)
 - [NdmpSettingsDmas](docs/NdmpSettingsDmas.md)
 - [NdmpSettingsDmasDmavendor](docs/NdmpSettingsDmasDmavendor.md)
 - [NdmpSettingsGlobal](docs/NdmpSettingsGlobal.md)
 - [NdmpSettingsGlobalGlobal](docs/NdmpSettingsGlobalGlobal.md)
 - [NdmpSettingsPreferredIp](docs/NdmpSettingsPreferredIp.md)
 - [NdmpSettingsPreferredIpDataSubnet](docs/NdmpSettingsPreferredIpDataSubnet.md)
 - [NdmpSettingsPreferredIps](docs/NdmpSettingsPreferredIps.md)
 - [NdmpSettingsPreferredIpsPreference](docs/NdmpSettingsPreferredIpsPreference.md)
 - [NdmpSettingsVariable](docs/NdmpSettingsVariable.md)
 - [NdmpSettingsVariables](docs/NdmpSettingsVariables.md)
 - [NdmpSettingsVariablesVariable](docs/NdmpSettingsVariablesVariable.md)
 - [NdmpSettingsVariablesVariablePathVariable](docs/NdmpSettingsVariablesVariablePathVariable.md)
 - [NdmpUser](docs/NdmpUser.md)
 - [NdmpUsers](docs/NdmpUsers.md)
 - [NdmpUsersExtended](docs/NdmpUsersExtended.md)
 - [NetworkDnscache](docs/NetworkDnscache.md)
 - [NetworkDnscacheExtended](docs/NetworkDnscacheExtended.md)
 - [NetworkDnscacheSettings](docs/NetworkDnscacheSettings.md)
 - [NetworkExternal](docs/NetworkExternal.md)
 - [NetworkExternalExtended](docs/NetworkExternalExtended.md)
 - [NetworkExternalSettings](docs/NetworkExternalSettings.md)
 - [NetworkGroupnet](docs/NetworkGroupnet.md)
 - [NetworkGroupnets](docs/NetworkGroupnets.md)
 - [NetworkPool](docs/NetworkPool.md)
 - [NetworkPools](docs/NetworkPools.md)
 - [NfsAlias](docs/NfsAlias.md)
 - [NfsAliases](docs/NfsAliases.md)
 - [NfsCheck](docs/NfsCheck.md)
 - [NfsCheckExtended](docs/NfsCheckExtended.md)
 - [NfsExport](docs/NfsExport.md)
 - [NfsExports](docs/NfsExports.md)
 - [NfsExportsSummary](docs/NfsExportsSummary.md)
 - [NfsExportsSummarySummary](docs/NfsExportsSummarySummary.md)
 - [NfsLogLevel](docs/NfsLogLevel.md)
 - [NfsNetgroup](docs/NfsNetgroup.md)
 - [NfsNetgroupSettings](docs/NfsNetgroupSettings.md)
 - [NfsNlmLocks](docs/NfsNlmLocks.md)
 - [NfsNlmLocksLock](docs/NfsNlmLocksLock.md)
 - [NfsNlmSessions](docs/NfsNlmSessions.md)
 - [NfsNlmSessionsExtended](docs/NfsNlmSessionsExtended.md)
 - [NfsNlmSessionsSession](docs/NfsNlmSessionsSession.md)
 - [NfsNlmWaiters](docs/NfsNlmWaiters.md)
 - [NfsSettingsExport](docs/NfsSettingsExport.md)
 - [NfsSettingsExportSettings](docs/NfsSettingsExportSettings.md)
 - [NfsSettingsExportSettingsMapAll](docs/NfsSettingsExportSettingsMapAll.md)
 - [NfsSettingsExportSettingsMapAllSecondaryGroups](docs/NfsSettingsExportSettingsMapAllSecondaryGroups.md)
 - [NfsSettingsGlobal](docs/NfsSettingsGlobal.md)
 - [NfsSettingsGlobalSettings](docs/NfsSettingsGlobalSettings.md)
 - [NfsSettingsZone](docs/NfsSettingsZone.md)
 - [NfsSettingsZoneSettings](docs/NfsSettingsZoneSettings.md)
 - [NodeDriveconfig](docs/NodeDriveconfig.md)
 - [NodeDriveconfigExtended](docs/NodeDriveconfigExtended.md)
 - [NodeDriveconfigNode](docs/NodeDriveconfigNode.md)
 - [NodeDriveconfigNodeAlert](docs/NodeDriveconfigNodeAlert.md)
 - [NodeDriveconfigNodeAllow](docs/NodeDriveconfigNodeAllow.md)
 - [NodeDriveconfigNodeAutomaticReplacementRecognition](docs/NodeDriveconfigNodeAutomaticReplacementRecognition.md)
 - [NodeDriveconfigNodeLog](docs/NodeDriveconfigNodeLog.md)
 - [NodeDriveconfigNodeReboot](docs/NodeDriveconfigNodeReboot.md)
 - [NodeDriveconfigNodeSpinWait](docs/NodeDriveconfigNodeSpinWait.md)
 - [NodeDriveconfigNodeStall](docs/NodeDriveconfigNodeStall.md)
 - [NodeDrives](docs/NodeDrives.md)
 - [NodeDrivesNode](docs/NodeDrivesNode.md)
 - [NodeDrivesNodeDrive](docs/NodeDrivesNodeDrive.md)
 - [NodeDrivesNodeDriveFirmware](docs/NodeDrivesNodeDriveFirmware.md)
 - [NodeDrivesPurposelist](docs/NodeDrivesPurposelist.md)
 - [NodeDrivesPurposelistError](docs/NodeDrivesPurposelistError.md)
 - [NodeDrivesPurposelistNode](docs/NodeDrivesPurposelistNode.md)
 - [NodeDrivesPurposelistNodePurpose](docs/NodeDrivesPurposelistNodePurpose.md)
 - [NodeHardware](docs/NodeHardware.md)
 - [NodeHardwareFast](docs/NodeHardwareFast.md)
 - [NodeHardwareFastNode](docs/NodeHardwareFastNode.md)
 - [NodeHardwareNode](docs/NodeHardwareNode.md)
 - [NodePartitions](docs/NodePartitions.md)
 - [NodePartitionsNode](docs/NodePartitionsNode.md)
 - [NodePartitionsNodePartition](docs/NodePartitionsNodePartition.md)
 - [NodePartitionsNodePartitionStatfs](docs/NodePartitionsNodePartitionStatfs.md)
 - [NodeSensors](docs/NodeSensors.md)
 - [NodeSensorsNode](docs/NodeSensorsNode.md)
 - [NodeSensorsNodeSensor](docs/NodeSensorsNodeSensor.md)
 - [NodeSensorsNodeSensorValue](docs/NodeSensorsNodeSensorValue.md)
 - [NodeSleds](docs/NodeSleds.md)
 - [NodeSledsNode](docs/NodeSledsNode.md)
 - [NodeSledsNodeSled](docs/NodeSledsNodeSled.md)
 - [NodeState](docs/NodeState.md)
 - [NodeStateNode](docs/NodeStateNode.md)
 - [NodeStateReadonly](docs/NodeStateReadonly.md)
 - [NodeStateReadonlyExtended](docs/NodeStateReadonlyExtended.md)
 - [NodeStateReadonlyNode](docs/NodeStateReadonlyNode.md)
 - [NodeStateServicelight](docs/NodeStateServicelight.md)
 - [NodeStateServicelightExtended](docs/NodeStateServicelightExtended.md)
 - [NodeStateServicelightNode](docs/NodeStateServicelightNode.md)
 - [NodeStateSmartfail](docs/NodeStateSmartfail.md)
 - [NodeStateSmartfailExtended](docs/NodeStateSmartfailExtended.md)
 - [NodeStateSmartfailNode](docs/NodeStateSmartfailNode.md)
 - [NodeStatus](docs/NodeStatus.md)
 - [NodeStatusBatterystatus](docs/NodeStatusBatterystatus.md)
 - [NodeStatusBatterystatusNode](docs/NodeStatusBatterystatusNode.md)
 - [NodeStatusNode](docs/NodeStatusNode.md)
 - [NodeStatusNodeBatterystatus](docs/NodeStatusNodeBatterystatus.md)
 - [NodeStatusNodeCapacityItem](docs/NodeStatusNodeCapacityItem.md)
 - [NodeStatusNodeCpu](docs/NodeStatusNodeCpu.md)
 - [NodeStatusNodeNvram](docs/NodeStatusNodeNvram.md)
 - [NodeStatusNodeNvramBattery](docs/NodeStatusNodeNvramBattery.md)
 - [NodeStatusNodePowersupplies](docs/NodeStatusNodePowersupplies.md)
 - [NodeStatusNodePowersuppliesSupply](docs/NodeStatusNodePowersuppliesSupply.md)
 - [NodesNodeFirmwareStatus](docs/NodesNodeFirmwareStatus.md)
 - [NtpServer](docs/NtpServer.md)
 - [NtpServerCreateParams](docs/NtpServerCreateParams.md)
 - [NtpServerExtended](docs/NtpServerExtended.md)
 - [NtpServers](docs/NtpServers.md)
 - [NtpSettings](docs/NtpSettings.md)
 - [NtpSettingsSettings](docs/NtpSettingsSettings.md)
 - [PoolsPoolInterfaces](docs/PoolsPoolInterfaces.md)
 - [PoolsPoolInterfacesInterface](docs/PoolsPoolInterfacesInterface.md)
 - [PoolsPoolInterfacesInterfaceOwner](docs/PoolsPoolInterfacesInterfaceOwner.md)
 - [PoolsPoolRule](docs/PoolsPoolRule.md)
 - [PoolsPoolRuleCreateParams](docs/PoolsPoolRuleCreateParams.md)
 - [PoolsPoolRules](docs/PoolsPoolRules.md)
 - [PoolsPoolRulesRule](docs/PoolsPoolRulesRule.md)
 - [PoolsPoolScResumeNode](docs/PoolsPoolScResumeNode.md)
 - [ProgressGlobal](docs/ProgressGlobal.md)
 - [ProgressGlobalProgress](docs/ProgressGlobalProgress.md)
 - [ProvidersAds](docs/ProvidersAds.md)
 - [ProvidersAdsAdsItem](docs/ProvidersAdsAdsItem.md)
 - [ProvidersAdsAdsItemExtended](docs/ProvidersAdsAdsItemExtended.md)
 - [ProvidersAdsExtended](docs/ProvidersAdsExtended.md)
 - [ProvidersAdsIdParams](docs/ProvidersAdsIdParams.md)
 - [ProvidersAdsItem](docs/ProvidersAdsItem.md)
 - [ProvidersFile](docs/ProvidersFile.md)
 - [ProvidersFileFileItem](docs/ProvidersFileFileItem.md)
 - [ProvidersFileIdParams](docs/ProvidersFileIdParams.md)
 - [ProvidersFileItem](docs/ProvidersFileItem.md)
 - [ProvidersKrb5](docs/ProvidersKrb5.md)
 - [ProvidersKrb5Extended](docs/ProvidersKrb5Extended.md)
 - [ProvidersKrb5IdParams](docs/ProvidersKrb5IdParams.md)
 - [ProvidersKrb5IdParamsKeytabEntry](docs/ProvidersKrb5IdParamsKeytabEntry.md)
 - [ProvidersKrb5Item](docs/ProvidersKrb5Item.md)
 - [ProvidersKrb5Krb5Item](docs/ProvidersKrb5Krb5Item.md)
 - [ProvidersLdap](docs/ProvidersLdap.md)
 - [ProvidersLdapIdParams](docs/ProvidersLdapIdParams.md)
 - [ProvidersLdapItem](docs/ProvidersLdapItem.md)
 - [ProvidersLdapLdapItem](docs/ProvidersLdapLdapItem.md)
 - [ProvidersLocal](docs/ProvidersLocal.md)
 - [ProvidersLocalIdParams](docs/ProvidersLocalIdParams.md)
 - [ProvidersLocalLocalItem](docs/ProvidersLocalLocalItem.md)
 - [ProvidersNis](docs/ProvidersNis.md)
 - [ProvidersNisExtended](docs/ProvidersNisExtended.md)
 - [ProvidersNisIdParams](docs/ProvidersNisIdParams.md)
 - [ProvidersNisItem](docs/ProvidersNisItem.md)
 - [ProvidersNisNisItem](docs/ProvidersNisNisItem.md)
 - [ProvidersSummary](docs/ProvidersSummary.md)
 - [ProvidersSummaryProviderInstance](docs/ProvidersSummaryProviderInstance.md)
 - [ProvidersSummaryProviderInstanceConnection](docs/ProvidersSummaryProviderInstanceConnection.md)
 - [QuotaNotification](docs/QuotaNotification.md)
 - [QuotaNotifications](docs/QuotaNotifications.md)
 - [QuotaQuota](docs/QuotaQuota.md)
 - [QuotaQuotaCreateParams](docs/QuotaQuotaCreateParams.md)
 - [QuotaQuotaExtended](docs/QuotaQuotaExtended.md)
 - [QuotaQuotaThresholds](docs/QuotaQuotaThresholds.md)
 - [QuotaQuotaUsage](docs/QuotaQuotaUsage.md)
 - [QuotaQuotas](docs/QuotaQuotas.md)
 - [QuotaQuotasSummary](docs/QuotaQuotasSummary.md)
 - [QuotaQuotasSummarySummary](docs/QuotaQuotasSummarySummary.md)
 - [QuotaReports](docs/QuotaReports.md)
 - [RemotesupportConnectemc](docs/RemotesupportConnectemc.md)
 - [RemotesupportConnectemcConnectemc](docs/RemotesupportConnectemcConnectemc.md)
 - [ReportAbout](docs/ReportAbout.md)
 - [ReportAboutReport](docs/ReportAboutReport.md)
 - [ReportSubreport](docs/ReportSubreport.md)
 - [ReportSubreports](docs/ReportSubreports.md)
 - [ReportsReportSubreports](docs/ReportsReportSubreports.md)
 - [ReportsReportSubreportsSubreport](docs/ReportsReportSubreportsSubreport.md)
 - [ReportsScans](docs/ReportsScans.md)
 - [ReportsScansReport](docs/ReportsScansReport.md)
 - [ReportsThreats](docs/ReportsThreats.md)
 - [ReportsThreatsReport](docs/ReportsThreatsReport.md)
 - [ResultDirectories](docs/ResultDirectories.md)
 - [ResultDirectoriesTotalUsage](docs/ResultDirectoriesTotalUsage.md)
 - [ResultDirectoriesUsageDataItem](docs/ResultDirectoriesUsageDataItem.md)
 - [ResultHistogram](docs/ResultHistogram.md)
 - [ResultHistogramHistogramItem](docs/ResultHistogramHistogramItem.md)
 - [ResultTopDirs](docs/ResultTopDirs.md)
 - [ResultTopDirsDir](docs/ResultTopDirsDir.md)
 - [ResultTopFiles](docs/ResultTopFiles.md)
 - [ResultTopFilesFile](docs/ResultTopFilesFile.md)
 - [RolePrivileges](docs/RolePrivileges.md)
 - [SettingsAccessTime](docs/SettingsAccessTime.md)
 - [SettingsAccessTimeExtended](docs/SettingsAccessTimeExtended.md)
 - [SettingsAccessTimeSettings](docs/SettingsAccessTimeSettings.md)
 - [SettingsAcls](docs/SettingsAcls.md)
 - [SettingsAclsAclPolicySettings](docs/SettingsAclsAclPolicySettings.md)
 - [SettingsAclsExtended](docs/SettingsAclsExtended.md)
 - [SettingsCharacterEncodings](docs/SettingsCharacterEncodings.md)
 - [SettingsCharacterEncodingsExtended](docs/SettingsCharacterEncodingsExtended.md)
 - [SettingsCharacterEncodingsSettings](docs/SettingsCharacterEncodingsSettings.md)
 - [SettingsGlobal](docs/SettingsGlobal.md)
 - [SettingsGlobalExtended](docs/SettingsGlobalExtended.md)
 - [SettingsGlobalGlobalSettings](docs/SettingsGlobalGlobalSettings.md)
 - [SettingsGlobalSettings](docs/SettingsGlobalSettings.md)
 - [SettingsKrb5Defaults](docs/SettingsKrb5Defaults.md)
 - [SettingsKrb5DefaultsKrb5Settings](docs/SettingsKrb5DefaultsKrb5Settings.md)
 - [SettingsKrb5Domain](docs/SettingsKrb5Domain.md)
 - [SettingsKrb5Domains](docs/SettingsKrb5Domains.md)
 - [SettingsKrb5DomainsDomainItem](docs/SettingsKrb5DomainsDomainItem.md)
 - [SettingsKrb5Realm](docs/SettingsKrb5Realm.md)
 - [SettingsKrb5Realms](docs/SettingsKrb5Realms.md)
 - [SettingsKrb5RealmsRealmItem](docs/SettingsKrb5RealmsRealmItem.md)
 - [SettingsMapping](docs/SettingsMapping.md)
 - [SettingsMappingExtended](docs/SettingsMappingExtended.md)
 - [SettingsMappingExtendedExtended](docs/SettingsMappingExtendedExtended.md)
 - [SettingsMappingMappingSettings](docs/SettingsMappingMappingSettings.md)
 - [SettingsMappings](docs/SettingsMappings.md)
 - [SettingsReportingEulaItem](docs/SettingsReportingEulaItem.md)
 - [SettingsReports](docs/SettingsReports.md)
 - [SettingsReportsExtended](docs/SettingsReportsExtended.md)
 - [SettingsReportsSettings](docs/SettingsReportsSettings.md)
 - [SmbLogLevel](docs/SmbLogLevel.md)
 - [SmbLogLevelFilter](docs/SmbLogLevelFilter.md)
 - [SmbLogLevelFilters](docs/SmbLogLevelFilters.md)
 - [SmbLogLevelFiltersFilter](docs/SmbLogLevelFiltersFilter.md)
 - [SmbOpenfile](docs/SmbOpenfile.md)
 - [SmbOpenfiles](docs/SmbOpenfiles.md)
 - [SmbSession](docs/SmbSession.md)
 - [SmbSessions](docs/SmbSessions.md)
 - [SmbSettingsGlobal](docs/SmbSettingsGlobal.md)
 - [SmbSettingsGlobalExtended](docs/SmbSettingsGlobalExtended.md)
 - [SmbSettingsGlobalSettings](docs/SmbSettingsGlobalSettings.md)
 - [SmbSettingsGlobalSettingsAuditGlobalSaclItem](docs/SmbSettingsGlobalSettingsAuditGlobalSaclItem.md)
 - [SmbSettingsShare](docs/SmbSettingsShare.md)
 - [SmbSettingsShareExtended](docs/SmbSettingsShareExtended.md)
 - [SmbSettingsShareSettings](docs/SmbSettingsShareSettings.md)
 - [SmbShare](docs/SmbShare.md)
 - [SmbShareCreateParams](docs/SmbShareCreateParams.md)
 - [SmbShareExtended](docs/SmbShareExtended.md)
 - [SmbSharePermission](docs/SmbSharePermission.md)
 - [SmbShares](docs/SmbShares.md)
 - [SmbSharesSummary](docs/SmbSharesSummary.md)
 - [SmbSharesSummarySummary](docs/SmbSharesSummarySummary.md)
 - [SnapshotAlias](docs/SnapshotAlias.md)
 - [SnapshotAliasCreateParams](docs/SnapshotAliasCreateParams.md)
 - [SnapshotAliasExtended](docs/SnapshotAliasExtended.md)
 - [SnapshotAliases](docs/SnapshotAliases.md)
 - [SnapshotChangelists](docs/SnapshotChangelists.md)
 - [SnapshotChangelistsExtended](docs/SnapshotChangelistsExtended.md)
 - [SnapshotLock](docs/SnapshotLock.md)
 - [SnapshotLockExtended](docs/SnapshotLockExtended.md)
 - [SnapshotLocks](docs/SnapshotLocks.md)
 - [SnapshotPending](docs/SnapshotPending.md)
 - [SnapshotPendingPendingItem](docs/SnapshotPendingPendingItem.md)
 - [SnapshotRepstates](docs/SnapshotRepstates.md)
 - [SnapshotRepstatesExtended](docs/SnapshotRepstatesExtended.md)
 - [SnapshotSchedule](docs/SnapshotSchedule.md)
 - [SnapshotScheduleExtended](docs/SnapshotScheduleExtended.md)
 - [SnapshotScheduleExtendedExtended](docs/SnapshotScheduleExtendedExtended.md)
 - [SnapshotSchedules](docs/SnapshotSchedules.md)
 - [SnapshotSchedulesExtended](docs/SnapshotSchedulesExtended.md)
 - [SnapshotSettings](docs/SnapshotSettings.md)
 - [SnapshotSettingsExtended](docs/SnapshotSettingsExtended.md)
 - [SnapshotSettingsSettings](docs/SnapshotSettingsSettings.md)
 - [SnapshotSnapshot](docs/SnapshotSnapshot.md)
 - [SnapshotSnapshots](docs/SnapshotSnapshots.md)
 - [SnapshotSnapshotsSummary](docs/SnapshotSnapshotsSummary.md)
 - [SnapshotSnapshotsSummarySummary](docs/SnapshotSnapshotsSummarySummary.md)
 - [SnmpSettings](docs/SnmpSettings.md)
 - [SnmpSettingsExtended](docs/SnmpSettingsExtended.md)
 - [SnmpSettingsSettings](docs/SnmpSettingsSettings.md)
 - [StatisticsCurrent](docs/StatisticsCurrent.md)
 - [StatisticsCurrentStat](docs/StatisticsCurrentStat.md)
 - [StatisticsHistory](docs/StatisticsHistory.md)
 - [StatisticsHistoryStat](docs/StatisticsHistoryStat.md)
 - [StatisticsHistoryStatValue](docs/StatisticsHistoryStatValue.md)
 - [StatisticsKey](docs/StatisticsKey.md)
 - [StatisticsKeyPolicy](docs/StatisticsKeyPolicy.md)
 - [StatisticsKeys](docs/StatisticsKeys.md)
 - [StatisticsOperation](docs/StatisticsOperation.md)
 - [StatisticsOperations](docs/StatisticsOperations.md)
 - [StatisticsProtocol](docs/StatisticsProtocol.md)
 - [StatisticsProtocols](docs/StatisticsProtocols.md)
 - [StoragepoolNodepool](docs/StoragepoolNodepool.md)
 - [StoragepoolNodepoolExtended](docs/StoragepoolNodepoolExtended.md)
 - [StoragepoolNodepools](docs/StoragepoolNodepools.md)
 - [StoragepoolSettings](docs/StoragepoolSettings.md)
 - [StoragepoolSettingsExtended](docs/StoragepoolSettingsExtended.md)
 - [StoragepoolSettingsSettings](docs/StoragepoolSettingsSettings.md)
 - [StoragepoolSettingsSettingsSpilloverTarget](docs/StoragepoolSettingsSettingsSpilloverTarget.md)
 - [StoragepoolSettingsSpilloverTarget](docs/StoragepoolSettingsSpilloverTarget.md)
 - [StoragepoolStatus](docs/StoragepoolStatus.md)
 - [StoragepoolStatusUnhealthyItem](docs/StoragepoolStatusUnhealthyItem.md)
 - [StoragepoolStatusUnhealthyItemAffectedItem](docs/StoragepoolStatusUnhealthyItemAffectedItem.md)
 - [StoragepoolStatusUnhealthyItemDiskpool](docs/StoragepoolStatusUnhealthyItemDiskpool.md)
 - [StoragepoolStatusUnprovisionedItem](docs/StoragepoolStatusUnprovisionedItem.md)
 - [StoragepoolStoragepool](docs/StoragepoolStoragepool.md)
 - [StoragepoolStoragepools](docs/StoragepoolStoragepools.md)
 - [StoragepoolSuggestedProtection](docs/StoragepoolSuggestedProtection.md)
 - [StoragepoolSuggestedProtectionSuggestedProtectionItem](docs/StoragepoolSuggestedProtectionSuggestedProtectionItem.md)
 - [StoragepoolTier](docs/StoragepoolTier.md)
 - [StoragepoolTierUsage](docs/StoragepoolTierUsage.md)
 - [StoragepoolTiers](docs/StoragepoolTiers.md)
 - [StoragepoolUnprovisioned](docs/StoragepoolUnprovisioned.md)
 - [StoragepoolUnprovisionedUnprovisioned](docs/StoragepoolUnprovisionedUnprovisioned.md)
 - [SubnetsSubnetPool](docs/SubnetsSubnetPool.md)
 - [SubnetsSubnetPoolCreateParams](docs/SubnetsSubnetPoolCreateParams.md)
 - [SubnetsSubnetPoolIface](docs/SubnetsSubnetPoolIface.md)
 - [SubnetsSubnetPoolRange](docs/SubnetsSubnetPoolRange.md)
 - [SubnetsSubnetPoolStaticRoute](docs/SubnetsSubnetPoolStaticRoute.md)
 - [SubnetsSubnetPools](docs/SubnetsSubnetPools.md)
 - [SubnetsSubnetPoolsPool](docs/SubnetsSubnetPoolsPool.md)
 - [SummaryClient](docs/SummaryClient.md)
 - [SummaryClientClientItem](docs/SummaryClientClientItem.md)
 - [SummaryDrive](docs/SummaryDrive.md)
 - [SummaryDriveDriveItem](docs/SummaryDriveDriveItem.md)
 - [SummaryHeat](docs/SummaryHeat.md)
 - [SummaryHeatHeatItem](docs/SummaryHeatHeatItem.md)
 - [SummaryProtocol](docs/SummaryProtocol.md)
 - [SummaryProtocolProtocolItem](docs/SummaryProtocolProtocolItem.md)
 - [SummaryProtocolStats](docs/SummaryProtocolStats.md)
 - [SummaryProtocolStatsProtocolStats](docs/SummaryProtocolStatsProtocolStats.md)
 - [SummaryProtocolStatsProtocolStatsCpu](docs/SummaryProtocolStatsProtocolStatsCpu.md)
 - [SummaryProtocolStatsProtocolStatsDisk](docs/SummaryProtocolStatsProtocolStatsDisk.md)
 - [SummaryProtocolStatsProtocolStatsNetwork](docs/SummaryProtocolStatsProtocolStatsNetwork.md)
 - [SummaryProtocolStatsProtocolStatsNetworkIn](docs/SummaryProtocolStatsProtocolStatsNetworkIn.md)
 - [SummaryProtocolStatsProtocolStatsNetworkOut](docs/SummaryProtocolStatsProtocolStatsNetworkOut.md)
 - [SummaryProtocolStatsProtocolStatsOnefs](docs/SummaryProtocolStatsProtocolStatsOnefs.md)
 - [SummaryProtocolStatsProtocolStatsProtocol](docs/SummaryProtocolStatsProtocolStatsProtocol.md)
 - [SummaryProtocolStatsProtocolStatsProtocolDataItem](docs/SummaryProtocolStatsProtocolStatsProtocolDataItem.md)
 - [SummarySystem](docs/SummarySystem.md)
 - [SummarySystemSystemItem](docs/SummarySystemSystemItem.md)
 - [SummaryWorkload](docs/SummaryWorkload.md)
 - [SummaryWorkloadWorkloadItem](docs/SummaryWorkloadWorkloadItem.md)
 - [SwiftAccount](docs/SwiftAccount.md)
 - [SwiftAccountExtended](docs/SwiftAccountExtended.md)
 - [SwiftAccounts](docs/SwiftAccounts.md)
 - [SyncJob](docs/SyncJob.md)
 - [SyncJobCreateParams](docs/SyncJobCreateParams.md)
 - [SyncJobExtended](docs/SyncJobExtended.md)
 - [SyncJobPhase](docs/SyncJobPhase.md)
 - [SyncJobPolicy](docs/SyncJobPolicy.md)
 - [SyncJobPolicyFileMatchingPattern](docs/SyncJobPolicyFileMatchingPattern.md)
 - [SyncJobPolicyFileMatchingPatternOrCriteriaItem](docs/SyncJobPolicyFileMatchingPatternOrCriteriaItem.md)
 - [SyncJobPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem](docs/SyncJobPolicyFileMatchingPatternOrCriteriaItemAndCriteriaItem.md)
 - [SyncJobWorker](docs/SyncJobWorker.md)
 - [SyncJobs](docs/SyncJobs.md)
 - [SyncPolicies](docs/SyncPolicies.md)
 - [SyncPoliciesExtended](docs/SyncPoliciesExtended.md)
 - [SyncPolicy](docs/SyncPolicy.md)
 - [SyncPolicyCreateParams](docs/SyncPolicyCreateParams.md)
 - [SyncPolicyExtended](docs/SyncPolicyExtended.md)
 - [SyncPolicyExtendedExtended](docs/SyncPolicyExtendedExtended.md)
 - [SyncPolicySourceNetwork](docs/SyncPolicySourceNetwork.md)
 - [SyncReport](docs/SyncReport.md)
 - [SyncReportPolicy](docs/SyncReportPolicy.md)
 - [SyncReports](docs/SyncReports.md)
 - [SyncReportsRotate](docs/SyncReportsRotate.md)
 - [SyncRule](docs/SyncRule.md)
 - [SyncRuleExtendedExtended](docs/SyncRuleExtendedExtended.md)
 - [SyncRuleSchedule](docs/SyncRuleSchedule.md)
 - [SyncRules](docs/SyncRules.md)
 - [SyncRulesExtended](docs/SyncRulesExtended.md)
 - [SyncSettings](docs/SyncSettings.md)
 - [SyncSettingsExtended](docs/SyncSettingsExtended.md)
 - [SyncSettingsSettings](docs/SyncSettingsSettings.md)
 - [TargetPolicies](docs/TargetPolicies.md)
 - [TargetPolicy](docs/TargetPolicy.md)
 - [TargetReport](docs/TargetReport.md)
 - [TargetReports](docs/TargetReports.md)
 - [TimezoneRegion](docs/TimezoneRegion.md)
 - [TimezoneRegionTimezone](docs/TimezoneRegionTimezone.md)
 - [TimezoneRegions](docs/TimezoneRegions.md)
 - [TimezoneSettings](docs/TimezoneSettings.md)
 - [UpgradeCluster](docs/UpgradeCluster.md)
 - [UpgradeClusterClusterOverview](docs/UpgradeClusterClusterOverview.md)
 - [UpgradeClusterUpgradeSettings](docs/UpgradeClusterUpgradeSettings.md)
 - [UserChangePassword](docs/UserChangePassword.md)
 - [UserMemberOf](docs/UserMemberOf.md)
 - [WormDomain](docs/WormDomain.md)
 - [WormDomains](docs/WormDomains.md)
 - [WormSettings](docs/WormSettings.md)
 - [WormSettingsExtended](docs/WormSettingsExtended.md)
 - [WormSettingsSettings](docs/WormSettingsSettings.md)
 - [Zone](docs/Zone.md)
 - [ZoneExtendedExtended](docs/ZoneExtendedExtended.md)
 - [Zones](docs/Zones.md)
 - [ZonesExtended](docs/ZonesExtended.md)
 - [ZonesSummary](docs/ZonesSummary.md)
 - [ZonesSummaryExtended](docs/ZonesSummaryExtended.md)
 - [ZonesSummarySummary](docs/ZonesSummarySummary.md)
 - [ZonesSummarySummaryExtended](docs/ZonesSummarySummaryExtended.md)
 - [AntivirusPoliciesExtended](docs/AntivirusPoliciesExtended.md)
 - [AntivirusPolicyCreateParams](docs/AntivirusPolicyCreateParams.md)
 - [AntivirusPolicyExtended](docs/AntivirusPolicyExtended.md)
 - [AntivirusServerCreateParams](docs/AntivirusServerCreateParams.md)
 - [AntivirusServerExtended](docs/AntivirusServerExtended.md)
 - [AntivirusServersExtended](docs/AntivirusServersExtended.md)
 - [AuditTopicExtended](docs/AuditTopicExtended.md)
 - [AuditTopicsExtended](docs/AuditTopicsExtended.md)
 - [AuthGroupCreateParams](docs/AuthGroupCreateParams.md)
 - [AuthGroupsExtended](docs/AuthGroupsExtended.md)
 - [AuthRoleCreateParams](docs/AuthRoleCreateParams.md)
 - [AuthRoleExtended](docs/AuthRoleExtended.md)
 - [AuthRolesExtended](docs/AuthRolesExtended.md)
 - [AuthUserCreateParams](docs/AuthUserCreateParams.md)
 - [AuthUsersExtended](docs/AuthUsersExtended.md)
 - [CertificateServerExtended](docs/CertificateServerExtended.md)
 - [CloudAccessExtended](docs/CloudAccessExtended.md)
 - [CloudAccountExtended](docs/CloudAccountExtended.md)
 - [CloudAccountsExtended](docs/CloudAccountsExtended.md)
 - [CloudJobsExtended](docs/CloudJobsExtended.md)
 - [CloudPoolCreateParams](docs/CloudPoolCreateParams.md)
 - [CloudPoolExtended](docs/CloudPoolExtended.md)
 - [CloudPoolsExtended](docs/CloudPoolsExtended.md)
 - [CloudProxiesExtended](docs/CloudProxiesExtended.md)
 - [CloudProxyCreateParams](docs/CloudProxyCreateParams.md)
 - [CloudProxyExtended](docs/CloudProxyExtended.md)
 - [ClusterNodeStateServicelightExtended](docs/ClusterNodeStateServicelightExtended.md)
 - [ClusterNodeStateServicelightExtendedExtended](docs/ClusterNodeStateServicelightExtendedExtended.md)
 - [ClusterPatchPatchesExtended](docs/ClusterPatchPatchesExtended.md)
 - [CompatibilitiesClassActiveExtended](docs/CompatibilitiesClassActiveExtended.md)
 - [CompatibilitiesSsdActiveExtended](docs/CompatibilitiesSsdActiveExtended.md)
 - [DedupeReportsExtended](docs/DedupeReportsExtended.md)
 - [DiagnosticsGatherSettingsExtended](docs/DiagnosticsGatherSettingsExtended.md)
 - [EventAlertConditionCreateParams](docs/EventAlertConditionCreateParams.md)
 - [EventAlertConditionsExtended](docs/EventAlertConditionsExtended.md)
 - [EventCategoriesExtended](docs/EventCategoriesExtended.md)
 - [EventChannelExtended](docs/EventChannelExtended.md)
 - [EventChannelsExtended](docs/EventChannelsExtended.md)
 - [EventEventgroupDefinitionsExtended](docs/EventEventgroupDefinitionsExtended.md)
 - [EventEventgroupOccurrencesExtended](docs/EventEventgroupOccurrencesExtended.md)
 - [EventEventlistsExtended](docs/EventEventlistsExtended.md)
 - [FilepoolDefaultPolicyAction](docs/FilepoolDefaultPolicyAction.md)
 - [FilepoolPolicyAction](docs/FilepoolPolicyAction.md)
 - [FilepoolPolicyActionCreateParams](docs/FilepoolPolicyActionCreateParams.md)
 - [FsaResultExtended](docs/FsaResultExtended.md)
 - [FsaResultsExtended](docs/FsaResultsExtended.md)
 - [GroupnetSubnetCreateParams](docs/GroupnetSubnetCreateParams.md)
 - [GroupnetSubnetExtended](docs/GroupnetSubnetExtended.md)
 - [GroupnetSubnetsExtended](docs/GroupnetSubnetsExtended.md)
 - [HdfsRackCreateParams](docs/HdfsRackCreateParams.md)
 - [HdfsRackExtended](docs/HdfsRackExtended.md)
 - [HdfsRacksExtended](docs/HdfsRacksExtended.md)
 - [IdResolutionPathsExtended](docs/IdResolutionPathsExtended.md)
 - [JobJobsExtended](docs/JobJobsExtended.md)
 - [JobPoliciesExtended](docs/JobPoliciesExtended.md)
 - [JobPolicyCreateParams](docs/JobPolicyCreateParams.md)
 - [JobPolicyExtended](docs/JobPolicyExtended.md)
 - [JobTypeExtended](docs/JobTypeExtended.md)
 - [JobTypesExtended](docs/JobTypesExtended.md)
 - [LicenseLicensesExtended](docs/LicenseLicensesExtended.md)
 - [MappingUsersRulesRuleOptionsDefaultUser](docs/MappingUsersRulesRuleOptionsDefaultUser.md)
 - [MappingUsersRulesRuleUser2Extended](docs/MappingUsersRulesRuleUser2Extended.md)
 - [NdmpSettingsPreferredIpCreateParams](docs/NdmpSettingsPreferredIpCreateParams.md)
 - [NdmpSettingsVariableCreateParams](docs/NdmpSettingsVariableCreateParams.md)
 - [NdmpUserCreateParams](docs/NdmpUserCreateParams.md)
 - [NetworkGroupnetCreateParams](docs/NetworkGroupnetCreateParams.md)
 - [NetworkGroupnetExtended](docs/NetworkGroupnetExtended.md)
 - [NetworkGroupnetsExtended](docs/NetworkGroupnetsExtended.md)
 - [NfsAliasCreateParams](docs/NfsAliasCreateParams.md)
 - [NfsAliasExtended](docs/NfsAliasExtended.md)
 - [NfsAliasesExtended](docs/NfsAliasesExtended.md)
 - [NfsExportCreateParams](docs/NfsExportCreateParams.md)
 - [NfsExportExtended](docs/NfsExportExtended.md)
 - [NfsExportsExtended](docs/NfsExportsExtended.md)
 - [NodeStateNodeServicelight](docs/NodeStateNodeServicelight.md)
 - [NtpServersExtended](docs/NtpServersExtended.md)
 - [PoolsPoolRulesExtended](docs/PoolsPoolRulesExtended.md)
 - [ProvidersKrb5Krb5ItemExtended](docs/ProvidersKrb5Krb5ItemExtended.md)
 - [ProvidersNisNisItemExtended](docs/ProvidersNisNisItemExtended.md)
 - [QuotaNotificationCreateParams](docs/QuotaNotificationCreateParams.md)
 - [QuotaNotificationExtended](docs/QuotaNotificationExtended.md)
 - [QuotaNotificationsExtended](docs/QuotaNotificationsExtended.md)
 - [QuotaQuotaThresholdsExtended](docs/QuotaQuotaThresholdsExtended.md)
 - [QuotaQuotasExtended](docs/QuotaQuotasExtended.md)
 - [ReportSubreportsExtended](docs/ReportSubreportsExtended.md)
 - [ReportsReportSubreportsExtended](docs/ReportsReportSubreportsExtended.md)
 - [ReportsScansExtended](docs/ReportsScansExtended.md)
 - [ReportsThreatsExtended](docs/ReportsThreatsExtended.md)
 - [SettingsKrb5DomainCreateParams](docs/SettingsKrb5DomainCreateParams.md)
 - [SettingsKrb5RealmCreateParams](docs/SettingsKrb5RealmCreateParams.md)
 - [SmbSharesExtended](docs/SmbSharesExtended.md)
 - [SnapshotAliasesExtended](docs/SnapshotAliasesExtended.md)
 - [SnapshotLockCreateParams](docs/SnapshotLockCreateParams.md)
 - [SnapshotLocksExtended](docs/SnapshotLocksExtended.md)
 - [SnapshotScheduleCreateParams](docs/SnapshotScheduleCreateParams.md)
 - [SnapshotSnapshotCreateParams](docs/SnapshotSnapshotCreateParams.md)
 - [SnapshotSnapshotExtended](docs/SnapshotSnapshotExtended.md)
 - [SnapshotSnapshotsExtended](docs/SnapshotSnapshotsExtended.md)
 - [StatisticsKeysExtended](docs/StatisticsKeysExtended.md)
 - [StoragepoolNodepoolCreateParams](docs/StoragepoolNodepoolCreateParams.md)
 - [StoragepoolNodepoolsExtended](docs/StoragepoolNodepoolsExtended.md)
 - [StoragepoolTierCreateParams](docs/StoragepoolTierCreateParams.md)
 - [StoragepoolTierExtended](docs/StoragepoolTierExtended.md)
 - [StoragepoolTiersExtended](docs/StoragepoolTiersExtended.md)
 - [SubnetsSubnetPoolsExtended](docs/SubnetsSubnetPoolsExtended.md)
 - [SwiftAccountsExtended](docs/SwiftAccountsExtended.md)
 - [SyncJobsExtended](docs/SyncJobsExtended.md)
 - [SyncReportsExtended](docs/SyncReportsExtended.md)
 - [SyncRuleCreateParams](docs/SyncRuleCreateParams.md)
 - [SyncRuleExtended](docs/SyncRuleExtended.md)
 - [TargetPoliciesExtended](docs/TargetPoliciesExtended.md)
 - [TargetReportsExtended](docs/TargetReportsExtended.md)
 - [WormDomainCreateParams](docs/WormDomainCreateParams.md)
 - [WormDomainExtended](docs/WormDomainExtended.md)
 - [WormDomainsExtended](docs/WormDomainsExtended.md)
 - [ZoneCreateParams](docs/ZoneCreateParams.md)
 - [ZoneExtended](docs/ZoneExtended.md)
 - [EventChannelCreateParams](docs/EventChannelCreateParams.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### basicAuth

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

sdk@isilon.com
